package com.example.edubot.bangla;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.speech.tts.TextToSpeech;
import android.widget.TextView;

import com.example.edubot.MainActivity;
import com.example.edubot.R;
import com.example.edubot.english.EnglishActivityResponsive;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Locale;

import de.hdodenhof.circleimageview.CircleImageView;

public class SelfLearnBangla extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,TextToSpeech.OnInitListener {
    private Button qlearnbutton;
    private Button aleanButton;
    private TextView show;
    private  int x=0;
    private  String question="";
    private SpeechRecognizer speechRecognizer;
    private Intent intentRecognizer;
    private FirebaseAuth mAuth;
    String Uid="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_learn_bangla);

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser=mAuth.getCurrentUser();
        Uid=currentUser.getUid();
        DatabaseReference slQuestions = FirebaseDatabase.getInstance().getReference().child("Users").child(Uid).child("Self Questions");

        //text to speech config
        TextToSpeech tts = new TextToSpeech(this, this);
        tts.setLanguage(Locale.forLanguageTag("bn-BD"));
        tts.setPitch(1.2f);
        tts.setSpeechRate(1f);

        qlearnbutton=(Button)findViewById(R.id.bangla_qlearn);
        aleanButton=(Button)findViewById(R.id.bangla_alearn);
        show=(TextView)findViewById(R.id.show_learn_text);
        qlearnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tts.speak("আমকে প্রশ্নটি শিখান",TextToSpeech.QUEUE_FLUSH,null);
                while (tts.isSpeaking()){

                }
                x=1;speechRecognizer.startListening(intentRecognizer);

            }
        });
        aleanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x!=1){
                    tts.speak("আপনি আমাকে প্রশ্ন শিখান্নি। আমকে আগে প্রশ্নটি শিখান",TextToSpeech.QUEUE_FLUSH,null);
                    while (tts.isSpeaking()){

                    }
                }else {
                    tts.speak("আমাকে প্রশ্নের উত্তরটি শিখান", TextToSpeech.QUEUE_FLUSH, null);
                    while (tts.isSpeaking()) {

                    }
                    x = 2;
                    speechRecognizer.startListening(intentRecognizer);
                }
            }
        });


        intentRecognizer = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "bn-BD");
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, "bn-BD");
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_ONLY_RETURN_LANGUAGE_PREFERENCE, "bn-BD");
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, this.getPackageName());
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH);



        speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this);
        speechRecognizer.setRecognitionListener(new RecognitionListener() {
            @Override
            public void onReadyForSpeech(Bundle params) { }
            @Override
            public void onBeginningOfSpeech() { }
            @Override
            public void onRmsChanged(float rmsdB) { }
            @Override
            public void onBufferReceived(byte[] buffer) { }
            @Override
            public void onEndOfSpeech() { }
            @Override
            public void onError(int error) {
            }
            @Override
            public void onResults(Bundle results) {


                ArrayList<String> store = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);

                String userVoice = "";
                if (store != null) {
                    userVoice = store.get(0);

                    if (x == 1) {
                        question = userVoice;
                        show.setText(userVoice);
                        tts.speak("আপনার প্রশ্নটি শিক্তে সক্ষম হয়েছি",TextToSpeech.QUEUE_FLUSH,null);

                    }

                    //Input Questions Button Main result part
                    else if (x == 2) {
                        show.setText(userVoice);
                        slQuestions.child(question).setValue(userVoice);
                        tts.speak("আপনার উত্তরটি শিখতে সক্ষম হয়েছি",TextToSpeech.QUEUE_FLUSH,null);
                    }

                }

            }
            @Override
            public void onPartialResults(Bundle partialResults) { }
            @Override
            public void onEvent(int eventType, Bundle params) { }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("রোবটকে শিখাও");
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        View headerView = navigationView.getHeaderView(0);
        TextView userNameTextView = headerView.findViewById(R.id.user_profile_name);
        CircleImageView profileImageView = headerView.findViewById(R.id.profile_image);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if(id==R.id.nav_bangla_home){
            startActivity(new Intent(this, BanglaActivityResponsive.class));
        }
        else if(id==R.id.nav_bangla_book){
            startActivity(new Intent(this,BookActivityBangla.class));

        }
        else if(id==R.id.nav_bangla_learn){
        }
        else if(id==R.id.nav_bangla_scan){
            startActivity(new Intent(this, ScanActivityBangla.class));
        }
        else if(id==R.id.nav_bangla_calculator){
            startActivity(new Intent(this,MathActivityBangla.class));
        }
        else if(id==R.id.nav_bangla_tutorial){
            startActivity(new Intent(this, GuidlineActivity.class));
        }
        else if(id==R.id.nav_bangla_website){
            startActivity(new Intent(this, WebActivity.class));
        }
        else if(id==R.id.nav_bangla_help){
            startActivity(new Intent(this, HelpActivity.class));
        }
        else if(id==R.id.nav_english_language){
            startActivity(new Intent(this, EnglishActivityResponsive.class));
        }
        else if(id==R.id.nav_bangla_logout){
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(this, MainActivity.class));
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onInit(int i) {
    }

}