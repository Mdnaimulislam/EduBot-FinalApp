package com.example.edubot.english;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.edubot.Choose_Language;
import com.example.edubot.MainActivity;
import com.example.edubot.R;
import com.example.edubot.bangla.BanglaActivityResponsive;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.apache.commons.lang.StringEscapeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Collectors;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.Manifest.permission.RECORD_AUDIO;

public class EnglishActivityManual extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, TextToSpeech.OnInitListener {

    private Button Responsive;
    private Button talk;
    private SpeechRecognizer speechRecognizer;
    private Intent intentRecognizer;
    private FirebaseAuth mAuth;
    private  int x=0;
    private  String question="";
    String finalInput;
    String Uid="";
    private AudioManager mAudioManager;
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private int mStreamVolume;
    Choose_Language b=new Choose_Language();
    TextToSpeech tts;
    DatabaseReference dbQuestions = FirebaseDatabase.getInstance().getReference().child("Constant English Questions");
    DatabaseReference slQuestions = FirebaseDatabase.getInstance().getReference().child("Users").child(Uid).child("Self Questions");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_manual);
        //mute audio
        mAudioManager=(AudioManager)getSystemService(Context.AUDIO_SERVICE);
        //database
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser=mAuth.getCurrentUser();
        Uid=currentUser.getUid();

        //permission

        ActivityCompat.requestPermissions(this, new String[]{RECORD_AUDIO}, PackageManager.PERMISSION_GRANTED);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        //
        //text to speech config
        tts = new TextToSpeech(this, this);
        tts.setLanguage(Locale.forLanguageTag("en-US"));
        tts.setPitch(1.2f);
        tts.setSpeechRate(1f);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("MUKTI");
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

        talk=(Button)findViewById(R.id.english_talk_btn_manual);
        Responsive=(Button)findViewById(R.id.Responsive);
        Responsive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x==0) {
                    startActivity(new Intent(EnglishActivityManual.this, EnglishActivityResponsive.class));
                }
                else{
                    Toast.makeText(EnglishActivityManual.this,"Stop the Talking fisrt!",Toast.LENGTH_LONG).show();
                }
            }
        });
        talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=1;
                setSpeechRecognizer();
                // mStreamVolume=mAudioManager.getStreamVolume(AudioManager.STREAM_NOTIFICATION);
                //mAudioManager.setStreamVolume(AudioManager.STREAM_NOTIFICATION,0,0);
            }
        });

    }

    public void setSpeechRecognizer(){

        //Speech recognizer configure
        intentRecognizer = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US");
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, "en-US");
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_ONLY_RETURN_LANGUAGE_PREFERENCE, "en-US");
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, this.getPackageName());
        intentRecognizer.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH);
        speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this);

        speechRecognizer.startListening(intentRecognizer);

        speechRecognizer.setRecognitionListener(new RecognitionListener() {
            @Override
            public void onReadyForSpeech(Bundle bundle) {

                talk.setText("Listening");
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
                talk.setText("Start Talking");
                x=0;
            }

            @Override
            public void onResults(Bundle bundle) {
                talk.setText("Listening Succes");
                ArrayList<String> store = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                String userVoice = "";
                if (store != null) {
                    userVoice = store.get(0);
                    finalInput = userVoice;

                    try {
                        b.intentAction(finalInput);
                        if(b.check=="b"){
                            SystemClock.sleep(900);
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    try {
                        System.out.println(finalInput);
                        if (finalInput.contains("plus") ||finalInput.contains("+")) {
                            String[] arrofstr = userVoice.split(" ");
                            System.out.println(getDoubleNumberFromText(arrofstr[0]));
                            System.out.println(getDoubleNumberFromText(arrofstr[2]));
                            double result =getDoubleNumberFromText(arrofstr[0]) + getDoubleNumberFromText(arrofstr[2]);
                            System.out.println(result);
                            tts.speak("Result of the Addition is "+String.valueOf(df2.format(result)), TextToSpeech.QUEUE_FLUSH, null);
                            while (tts.isSpeaking()) {
                            }
                            finalInput = "ss";


                        }
                        else if (finalInput.contains("-") || finalInput.contains("minus")) {
                            String[] arrofstr = userVoice.split(" ");
                            System.out.println(getDoubleNumberFromText(arrofstr[0]));
                            System.out.println(getDoubleNumberFromText(arrofstr[2]));
                            double result =getDoubleNumberFromText(arrofstr[0]) - getDoubleNumberFromText(arrofstr[2]);
                            tts.speak("Result of the Subtraction is "+String.valueOf(df2.format(result)), TextToSpeech.QUEUE_FLUSH, null);

                            while (tts.isSpeaking()) {
                            }
                            finalInput = "ss";

                        }

                        else if (finalInput.contains("multiply") || finalInput.contains("into")) {
                            String[] arrofstr = userVoice.split(" ");
                            System.out.println(getDoubleNumberFromText(arrofstr[0]));
                            System.out.println(getDoubleNumberFromText(arrofstr[2]));
                            double result =getDoubleNumberFromText(arrofstr[0]) * getDoubleNumberFromText(arrofstr[2]);
                            tts.speak("Result of the Multiplication is "+String.valueOf(df2.format(result)), TextToSpeech.QUEUE_FLUSH, null);

                            while (tts.isSpeaking()) {
                            }
                            finalInput = "ss";

                        }
                        else if (finalInput.contains("divide")) {
                            String[] arrofstr = userVoice.split(" ");
                            System.out.println(getDoubleNumberFromText(arrofstr[0]));
                            System.out.println(getDoubleNumberFromText(arrofstr[2]));
                            double result=getDoubleNumberFromText(arrofstr[0]) / getDoubleNumberFromText(arrofstr[2]);
                            tts.speak("Result of the Division is "+String.valueOf(df2.format(result)), TextToSpeech.QUEUE_FLUSH, null);

                            while (tts.isSpeaking()) {
                            }
                            finalInput = "ss";
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }


                    dbQuestions.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {

                            String Qanswer = (String) snapshot.child(finalInput).getValue();

                            if (Qanswer != null) {
                                try {
                                    b.intentAction("A");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                tts.speak(Qanswer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){
                                }
                                try {
                                    b.intentAction("B");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                SystemClock.sleep(900);
                            }
                            else if(finalInput.contains("say")){
                                try {
                                    Qanswer = QueryWiki(finalInput);

                                    System.out.println(Qanswer);
                                    try {
                                        b.intentAction("A");
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    tts.speak(Qanswer,TextToSpeech.QUEUE_FLUSH,null);
                                    while (tts.isSpeaking()){
                                    }
                                    try {
                                        b.intentAction("B");
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    SystemClock.sleep(900);

                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            else {
                                slQuestions.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                                        String Qanswer = (String) snapshot.child(finalInput).getValue();

                                        if (Qanswer != null) {
                                            try {
                                                b.intentAction("A");
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }

                                            tts.speak(Qanswer,TextToSpeech.QUEUE_FLUSH,null);
                                            while (tts.isSpeaking()){
                                            }
                                            try {
                                                b.intentAction("B");
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
                                            SystemClock.sleep(900);
                                        }
                                        else if(finalInput!="ss"){
                                            tts.speak("I am unable to understand your question, to teach me this question please teach me the answer now.",TextToSpeech.QUEUE_FLUSH,null);
                                            SystemClock.sleep(900);
                                            while (tts.isSpeaking()){
                                            }
                                            speechRecognizer.startListening(intentRecognizer);
                                            speechRecognizer.setRecognitionListener(new RecognitionListener() {
                                                @Override
                                                public void onReadyForSpeech(Bundle params) {

                                                }

                                                @Override
                                                public void onBeginningOfSpeech() {

                                                }

                                                @Override
                                                public void onRmsChanged(float rmsdB) {

                                                }

                                                @Override
                                                public void onBufferReceived(byte[] buffer) {

                                                }

                                                @Override
                                                public void onEndOfSpeech() {

                                                }

                                                @Override
                                                public void onError(int error) {

                                                }

                                                @Override
                                                public void onResults(Bundle results) {
                                                    ArrayList<String> store = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                                                    String answer = store.get(0);

                                                    slQuestions.child(finalInput).setValue(answer);
                                                    tts.speak("I am able to learn your question answer",TextToSpeech.QUEUE_FLUSH,null);

                                                }

                                                @Override
                                                public void onPartialResults(Bundle partialResults) {

                                                }

                                                @Override
                                                public void onEvent(int eventType, Bundle params) {

                                                }
                                            });
                                        }

                                    }
                                    @Override
                                    public void onCancelled(@NonNull DatabaseError error) {

                                    }
                                });
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                    talk.setText("Start Talking");
                    x=0;


                }
            }

            @Override
            public void onPartialResults(Bundle bundle) {

            }

            @Override
            public void onEvent(int i, Bundle bundle) {

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

        if(id==R.id.nav_english_home){
        }
        else if(id==R.id.nav_english_book){
            startActivity(new Intent(this, BookActivityEnglish.class));
        }
        else if(id==R.id.nav_english_learn){
            startActivity(new Intent(this, SelfLearnEnglish.class));
        }
        else if(id==R.id.nav_english_scan){
            startActivity(new Intent(this, ScanActivityEnglish.class));
        }
        else if(id==R.id.nav_english_calculator){
            startActivity(new Intent(this, MathActivityEnglish.class));
        }
        else if(id==R.id.nav_english_tutorial){
            startActivity(new Intent(this, GuidlineActivity_English.class));
        }
        else if(id==R.id.nav_english_website){
            startActivity(new Intent(this, WebActivity_English.class));
        }
        else if(id==R.id.nav_english_help){
            startActivity(new Intent(this, HelpActivity_English.class));
        }
        else if(id==R.id.nav_bangla_language){
            startActivity(new Intent(this, BanglaActivityResponsive.class));
        }
        else if(id==R.id.nav_english_logout){
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
    public String QueryWiki(String wikiSearch) throws IOException {
        final String encoding = "UTF-8";
        String result = "";
        String ret="E";

        //Wait for user response
        //System.out.println("\n\nType something that you want me to search on the internet...");
        //String nextLine = scanner.nextLine();
        String searchText = wikiSearch +" wikipedia";
        System.out.println(searchText);

        Document google = Jsoup.connect("https://www.google.com/search?q="+searchText).get();

        Element link= google.getElementsByClass("yuRUbf").select("a").first();

        System.out.println(link);

        String relHref = link.attr("href"); // == "/"

        String absHref = link.attr("abs:href");




        //Get the first link about Wikipedia
        //String wikipediaURL = "https://bn.wikipedia.org/wiki/"+key;
        //System.out.println(wikipediaURL);
        String key= URLEncoder.encode(relHref.substring(relHref.lastIndexOf("/") + 1, relHref.length()), encoding);
        System.out.println(key);

        //Use Wikipedia API to get JSON File
        String wikipediaApiJSON = "https://simple.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&exintro=&explaintext=&titles="+ key;

        //Let's see what it found
        //System.out.println(wikipediaURL);
        System.out.println(wikipediaApiJSON);

        //"extract":" the summary of the article
        HttpURLConnection httpcon = (HttpURLConnection) new URL(wikipediaApiJSON).openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));


        //Read line by line
        String responseSB = in.lines().collect(Collectors.joining());
        in.close();

        //Print the result for us to see
        if(responseSB.contains("missing")) {
            String error = responseSB.split("missing\":\"")[1];
        }
        else {
            result = responseSB.split("extract\":\"")[1];
        }

        //Tell only the 150 first characters of the result
        String textToTell = result.length() > 1500 ? result.substring(0, 1500) : result;
        System.out.println(textToTell);

        String output= StringEscapeUtils.unescapeJava(textToTell);


        return output;
    }
    // method to convert string number to integer
    private double getDoubleNumberFromText(String strNum) {
        switch (strNum) {
            case "one":
                return 1.0;
            case "two":
                return 2.0;
            case "three":
                return 3.0;
            case "four":
                return 4.0;
            case "five":
                return 5.0;
            case "six":
                return 6.0;
            case "seven":
                return 7.0;
            case "eight":
                return 8.0;
            case "nine":
                return 9.0;
            case "ten":
                return 10.0;
            default:
                return Double.parseDouble(strNum);
        }
    }

}