package com.example.edubot.bangla;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.edubot.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Locale;

public class EnglishChapterClass3ActivityBangla extends AppCompatActivity implements TextToSpeech.OnInitListener {

    private Button unit_1;
    private Button unit_2;
    private Button unit_3;
    private Button unit_4;

    private Button unit_5;
    private Button unit_6;
    private Button unit_7;
    private Button unit_8;
    private Button unit_9;
    private Button unit_10;
    private Button unit_11;
    private Button unit_12;
    private Button unit_13;
    private Button unit_14;
    private Button unit_15;
    private Button unit_16;
    private Button unit_17;

    private ImageView unit1_1image;
    private ImageView unit1_2image;
    private ImageView unit1_3image;
    private ImageView unit2_1image;
    private ImageView unit2_2image;
    private ImageView unit3_1image;
    private ImageView unit3_2image;
    private ImageView unit4image;
    private ImageView unit5_1image;
    private ImageView unit5_2image;
    private ImageView unit6_1image;
    private ImageView unit6_2image;
    private ImageView unit7_1image;
    private ImageView unit7_2image;
    private ImageView unit8image;
    private ImageView unit9_1image;
    private ImageView unit9_2image;
    private ImageView unit10_1image;
    private ImageView unit10_2image;
    private ImageView unit11_1image;
    private ImageView unit11_2image;
    private ImageView unit12image;
    private ImageView unit13image;
    private ImageView unit14image;
    private ImageView unit15image;
    private ImageView unit16image;
    private ImageView unit17_1image;
    private ImageView unit17_2image;
    private ImageView unit17_3image;

    private TextToSpeech tts;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_chapter_class3_bangla);
        toolbar=(Toolbar)findViewById(R.id.toolbar_back);
        DatabaseReference chapter_answer = FirebaseDatabase.getInstance().getReference();

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(EnglishChapterClass3ActivityBangla.this, BookActivityBangla.class));
            }
        });
        unit1_1image=(ImageView)findViewById(R.id.unit_1_1_image);
        unit1_2image=(ImageView)findViewById(R.id.unit_1_2_image);
        unit1_3image=(ImageView)findViewById(R.id.unit_1_3_image);
        unit2_1image=(ImageView)findViewById(R.id.unit_2_1_image);
        unit2_2image=(ImageView)findViewById(R.id.unit_2_2_image);
        unit3_1image=(ImageView)findViewById(R.id.unit_3_1_image);
        unit3_2image=(ImageView)findViewById(R.id.unit_3_2_image);
        unit4image=(ImageView)findViewById(R.id.unit_4_image);
        unit5_1image=(ImageView)findViewById(R.id.unit_5_1_image);
        unit5_2image=(ImageView)findViewById(R.id.unit_5_2_image);
        unit6_1image=(ImageView)findViewById(R.id.unit_6_1_image);
        unit6_2image=(ImageView)findViewById(R.id.unit_6_2_image);
        unit7_1image=(ImageView)findViewById(R.id.unit_7_1_image);
        unit7_2image=(ImageView)findViewById(R.id.unit_7_2_image);
        unit8image=(ImageView)findViewById(R.id.unit_8_image);
        unit9_1image=(ImageView)findViewById(R.id.unit_9_1_image);
        unit9_2image=(ImageView)findViewById(R.id.unit_9_2_image);
        unit10_1image=(ImageView)findViewById(R.id.unit_10_1_image);
        unit10_2image=(ImageView)findViewById(R.id.unit_10_2_image);
        unit11_1image=(ImageView)findViewById(R.id.unit_11_1_image);
        unit11_2image=(ImageView)findViewById(R.id.unit_11_2_image);
        unit12image=(ImageView)findViewById(R.id.unit_12_image);
        unit13image=(ImageView)findViewById(R.id.unit_13_image);
        unit14image=(ImageView)findViewById(R.id.unit_14_image);
        unit15image=(ImageView)findViewById(R.id.unit_15_image);
        unit16image=(ImageView)findViewById(R.id.unit_16_image);
        unit17_1image=(ImageView)findViewById(R.id.unit_17_1_image);
        unit17_2image=(ImageView)findViewById(R.id.unit_17_2_image);
        unit17_3image=(ImageView)findViewById(R.id.unit_17_3_image);

        unit_1=(Button)findViewById(R.id.unit_1);
        unit_2=(Button)findViewById(R.id.unit_2);
        unit_3=(Button)findViewById(R.id.unit_3);
        unit_4=(Button)findViewById(R.id.unit_4);
        unit_5=(Button)findViewById(R.id.unit_5);
        unit_6=(Button)findViewById(R.id.unit_6);
        unit_7=(Button)findViewById(R.id.unit_7);
        unit_8=(Button)findViewById(R.id.unit_8);
        unit_9=(Button)findViewById(R.id.unit_9);
        unit_10=(Button)findViewById(R.id.unit_10);
        unit_11=(Button)findViewById(R.id.unit_11);
        unit_12=(Button)findViewById(R.id.unit_12);
        unit_13=(Button)findViewById(R.id.unit_13);
        unit_14=(Button)findViewById(R.id.unit_14);
        unit_15=(Button)findViewById(R.id.unit_15);
        unit_16=(Button)findViewById(R.id.unit_16);
        unit_17=(Button)findViewById(R.id.unit_17);

        tts = new TextToSpeech(this, this);
        tts.setLanguage(Locale.ENGLISH);
        tts.setPitch(1.2f);
        tts.setSpeechRate(1f);

        unit_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit1_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak(". Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi! I’m Riya.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello! I'm Mashuk.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak(". Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Hello! Mrs. Fareha. How are you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello! Riya and Mashuk. I'm fine, thanks.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        unit1_1image.setVisibility(View.GONE);
                        unit1_2image.setVisibility(View.VISIBLE);

                        tts.speak("Hello! I’m Riya Islam. I'm 8 years old. I'm student. I'm in Class 3 at Rajbari Primary School.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Read the sentences. Write T for True or F for False.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The girl's name is Rima.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("She is 9 years old. ",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("She is a student.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("She is in Class 2.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("She is at Mirpur Primary School. ",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Which sentences in Activity B are False? Say sentences that are true.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The girl’s name isn’t Rima. Her name is Riya.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        unit1_2image.setVisibility(View.GONE);
                        unit1_3image.setVisibility(View.VISIBLE);

                        tts.speak("Read.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("This is Mahbub Alam. He’s 30 years old. He’s an English teacher. He works in a primary school in Narail.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Complete this table at home.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Pairwork. Ask and answer the questions. Look at the information in Activity A.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("What is the Person's name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("How old is he?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("What does he do?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Where does he work?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit1_3image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit2_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Who’s that?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("That's Keya. She’s a new student.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Hello! Keya. I'm Mashuk. Where are you from?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I'm from Khulna. And you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I’m from Sylhet, and so is Riya.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        unit2_1image.setVisibility(View.GONE);
                        unit2_2image.setVisibility(View.VISIBLE);

                        tts.speak("Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Where do you live?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I live near the school.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Would you like to come my house?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I'd like that. Thank you.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Sorry, but I can't.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Act the dialogue. Invite a partner to do something.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Would you like to play with me?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Yes, I'd like that. Thank you.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Sorry, but I can’t.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit2_2image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit3_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit3_2image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit4image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit4image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit5_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit5_2image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit6_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit6_2image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit7_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit7_2image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit8image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit8image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit9_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit9_2image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit10_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit10_2image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit11_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit11_2image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit12image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit12image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit13image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit13image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit14image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit14image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit15image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit15image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit16image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit16image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        unit_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit_1.setVisibility(View.GONE);
                unit_2.setVisibility(View.GONE);
                unit_3.setVisibility(View.GONE);
                unit_4.setVisibility(View.GONE);
                unit_5.setVisibility(View.GONE);
                unit_6.setVisibility(View.GONE);
                unit_7.setVisibility(View.GONE);
                unit_8.setVisibility(View.GONE);
                unit_9.setVisibility(View.GONE);
                unit_10.setVisibility(View.GONE);
                unit_11.setVisibility(View.GONE);
                unit_12.setVisibility(View.GONE);
                unit_13.setVisibility(View.GONE);
                unit_14.setVisibility(View.GONE);
                unit_15.setVisibility(View.GONE);
                unit_16.setVisibility(View.GONE);
                unit_17.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit17_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I am Shuva.What's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi,Shuva.I am rafi.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen nad say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("How are you ,Rafi?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am fine.thanks.and you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine.Thanks.Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit17_3image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        unit_1.setVisibility(View.VISIBLE);
                        unit_2.setVisibility(View.VISIBLE);
                        unit_3.setVisibility(View.VISIBLE);
                        unit_4.setVisibility(View.VISIBLE);
                        unit_5.setVisibility(View.VISIBLE);
                        unit_6.setVisibility(View.VISIBLE);
                        unit_7.setVisibility(View.VISIBLE);
                        unit_8.setVisibility(View.VISIBLE);
                        unit_9.setVisibility(View.VISIBLE);
                        unit_10.setVisibility(View.VISIBLE);
                        unit_11.setVisibility(View.VISIBLE);
                        unit_12.setVisibility(View.VISIBLE);
                        unit_13.setVisibility(View.VISIBLE);
                        unit_14.setVisibility(View.VISIBLE);
                        unit_15.setVisibility(View.VISIBLE);
                        unit_16.setVisibility(View.VISIBLE);
                        unit_17.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
    }

    @Override
    public void onInit(int i) {

    }
}