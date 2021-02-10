package com.example.edubot.bangla;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

import com.example.edubot.R;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.apache.commons.lang.StringEscapeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Collectors;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.Manifest.permission.RECORD_AUDIO;

public class BanglaActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,TextToSpeech.OnInitListener {
    ToggleButton talk;
    private SpeechRecognizer speechRecognizer;
    private Intent intentRecognizer;
    private  int x;
    private  String question="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);
        //database
        DatabaseReference dbQuestions = FirebaseDatabase.getInstance().getReference().child("Constant Questions");


        //permission

        ActivityCompat.requestPermissions(this, new String[]{RECORD_AUDIO}, PackageManager.PERMISSION_GRANTED);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        //text to speech config
        TextToSpeech tts = new TextToSpeech(this, this);
        tts.setLanguage(Locale.forLanguageTag("bn-BD"));
        tts.setPitch(0.8f);
        tts.setSpeechRate(1f);

        //Speech recognizer configure
        intentRecognizer = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "bn-BD");
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, "bn-BD");
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_ONLY_RETURN_LANGUAGE_PREFERENCE, "bn-BD");
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, this.getPackageName());
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH);
        speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this);

        speechRecognizer.setRecognitionListener(new RecognitionListener() {
            @Override
            public void onReadyForSpeech(Bundle bundle) {

            }

            @Override
            public void onBeginningOfSpeech() {

            }

            @Override
            public void onRmsChanged(float v) {

            }

            @Override
            public void onBufferReceived(byte[] bytes) {

            }

            @Override
            public void onEndOfSpeech() {

            }

            @Override
            public void onError(int i) {
                    speechRecognizer.startListening(intentRecognizer);
            }

            @Override
            public void onResults(Bundle bundle) {
                ArrayList<String> store = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                String userVoice = "";
                if (store != null) {
                    userVoice = store.get(0);
                    String finalInput = userVoice;


                    dbQuestions.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {

                            String Qanswer = (String) snapshot.child(finalInput).getValue();

                            if (Qanswer != null) {
                                    tts.speak(Qanswer,TextToSpeech.QUEUE_FLUSH,null);
                                    while (tts.isSpeaking()){
                                    }
                                speechRecognizer.startListening(intentRecognizer);
                                }
                                else if(finalInput.contains("সম্পর্কে বল")){
                                    try {
                                        Qanswer = QueryWiki(finalInput);

                                        if (Qanswer.equals("E") || Qanswer.contains("}")) {
                                            speechRecognizer.startListening(intentRecognizer);
                                        } else {
                                            tts.speak(Qanswer,TextToSpeech.QUEUE_FLUSH,null);
                                            while (tts.isSpeaking()){
                                            }
                                            speechRecognizer.startListening(intentRecognizer);
                                        }
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                                else {
                                    //aiChat.setText("No Answer");
                                }
                            }


                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });

            }
            }

            @Override
            public void onPartialResults(Bundle bundle) {

            }

            @Override
            public void onEvent(int i, Bundle bundle) {

            }
        });

        //

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("মুক্তি");
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

        talk=(ToggleButton)findViewById(R.id.bangla_talk_btn);
        talk.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    speechRecognizer.startListening(intentRecognizer);
                }
                else{
                    //
                }
            }
        });

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


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public String QueryWiki(String wikiSearch) throws IOException {
        final String encoding = "UTF-8";
        String result = "";
        String ret="E";

        //Wait for user response
        //System.out.println("\n\nType something that you want me to search on the internet...");
        //String nextLine = scanner.nextLine();
        String searchText = wikiSearch + " wikipedia";
        //System.out.println("Searching on the web....");

        Document google = Jsoup.connect("https://www.google.com/search?q="+searchText).get();

        Elements weblink= google.getElementsByTag("cite");


        String fisrtlink= weblink.get(0).text();

        String key= URLEncoder.encode(fisrtlink.substring(fisrtlink.lastIndexOf(" › ") + 3, fisrtlink.length()), encoding);

        //System.out.println(key);


        //Get the first link about Wikipedia
        //String wikipediaURL = "https://bn.wikipedia.org/wiki/"+key;
        //System.out.println(wikipediaURL);


        //Use Wikipedia API to get JSON File
        String wikipediaApiJSON = "https://bn.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&exintro=&explaintext=&titles="+ key;

        //Let's see what it found
        //System.out.println(wikipediaURL);
        //System.out.println(wikipediaApiJSON);

        //"extract":" the summary of the article
        HttpURLConnection httpcon = (HttpURLConnection) new URL(wikipediaApiJSON).openConnection();
        httpcon.addRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));

        //Read line by line
        String responseSB = in.lines().collect(Collectors.joining());
        in.close();

        //Print the result for us to see
        if(responseSB.contains("missing")) {
            String error = responseSB.split("missing\":\"")[1];
            if (error.contains("}")) {
                return ret;
            }
        }
        else {
            result = responseSB.split("extract\":\"")[1];
        }

        //Tell only the 150 first characters of the result
        String textToTell = result.length() > 1500 ? result.substring(0, 1500) : result;

        String output= StringEscapeUtils.unescapeJava(textToTell);

        return output;
    }

    @Override
    public void onInit(int i) {

    }
}