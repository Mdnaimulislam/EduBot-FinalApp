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

public class EnglishChapterClass2ActivityBangla extends AppCompatActivity implements TextToSpeech.OnInitListener{

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

    private ImageView unit1image;
    private ImageView unit2image;
    private ImageView unit3image;
    private ImageView unit4image;
    private ImageView unit5image;
    private ImageView unit6image;
    private ImageView unit7image;
    private ImageView unit8image;
    private ImageView unit9_1image;
    private ImageView unit9_2image;
    private ImageView unit10image;
    private ImageView unit11image;
    private ImageView unit12image;
    private ImageView unit13_1image;
    private ImageView unit13_2image;
    private ImageView unit14image;
    private ImageView unit15image;
    private ImageView unit16image;
    private ImageView unit17_1image;
    private ImageView unit17_2image;

    private TextToSpeech tts;

    private Toolbar toolbar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_chapter_class2_bangla);
        toolbar=(Toolbar)findViewById(R.id.toolbar_back);
        DatabaseReference chapter_answer = FirebaseDatabase.getInstance().getReference();

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(EnglishChapterClass2ActivityBangla.this, BookActivityBangla.class));

            }
        });
        tts = new TextToSpeech(this, this);
        tts.setLanguage(Locale.ENGLISH);
        tts.setPitch(1.2f);
        tts.setSpeechRate(1f);

        unit1image=(ImageView)findViewById(R.id.unit_1_image);
        unit2image=(ImageView)findViewById(R.id.unit_2_image);

        unit3image=(ImageView)findViewById(R.id.unit_3_image);
        unit4image=(ImageView)findViewById(R.id.unit_4_image);
        unit5image=(ImageView)findViewById(R.id.unit_5_image);
        unit6image=(ImageView)findViewById(R.id.unit_6_image);
        unit7image=(ImageView)findViewById(R.id.unit_7_image);
        unit8image=(ImageView)findViewById(R.id.unit_8_image);
        unit9_1image=(ImageView)findViewById(R.id.unit_9_1_image);
        unit9_2image=(ImageView)findViewById(R.id.unit_9_2_image);
        unit10image=(ImageView)findViewById(R.id.unit_10_image);
        unit11image=(ImageView)findViewById(R.id.unit_11_image);
        unit12image=(ImageView)findViewById(R.id.unit_12_image);
        unit13_1image=(ImageView)findViewById(R.id.unit_13_1_image);
        unit13_2image=(ImageView)findViewById(R.id.unit_13_2_image);
        unit14image=(ImageView)findViewById(R.id.unit_14_image);
        unit15image=(ImageView)findViewById(R.id.unit_15_image);
        unit16image=(ImageView)findViewById(R.id.unit_16_image);
        unit17_1image=(ImageView)findViewById(R.id.unit_17_1_image);
        unit17_2image=(ImageView)findViewById(R.id.unit_17_2_image);



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
                unit1image.setVisibility(View.VISIBLE);

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
                        tts.speak("Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

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

                        unit1image.setVisibility(View.GONE);
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
                unit2image.setVisibility(View.VISIBLE);

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
                        tts.speak("Hello, Rafi. This is Meena. She's 8 years old.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi, Meena. I'm Rafi. I'm 7.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("This is Mahin. He's 8 years old, too.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                        unit2image.setVisibility(View.GONE);
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
                unit3image.setVisibility(View.VISIBLE);

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
                        tts.speak("How old are you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I'm 7 years old.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, listen and say. ",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Hi, Shuva. Are you 7 years old?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Yes, I am.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, Meena. Are you 7 years old?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("No, I'm not. I'm 8.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit3image.setVisibility(View.GONE);
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
                        tts.speak("How many apples?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("There are 4 apples.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Now, there are 3 apples. ",TextToSpeech.QUEUE_FLUSH,null);

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
                unit5image.setVisibility(View.VISIBLE);

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
                        tts.speak("I'm Joya. I'm 7 years old. I'm in Class 2.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Reza, 7 years old, Class 2.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Zara, 5 years old, Class 1.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Sonabi, 7 years old, Class 2.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Ratul, 8 years old, Class 3.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("He's Reza. He's 7 years old.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("He's in Class 2.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit5image.setVisibility(View.GONE);
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
                unit6image.setVisibility(View.VISIBLE);

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
                        tts.speak("Head.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("eyes.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("nose.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("ear.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("mouth",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("shoulder",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("knee",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("toes",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("rhyme.Look,listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Head and shoulders,knees and toes.Head and shoulders,knees and toes.Eyes and ears,mouth and nose.Head and shoulders,knees and toes.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit6image.setVisibility(View.GONE);
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
                unit7image.setVisibility(View.VISIBLE);

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
                        tts.speak("Hair.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("hand.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("finger.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("teeth.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("leg",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Rhyme.Look,listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Put your hand on your head.Touch your mouth.Touch your nose.Put your hand on your knee.Touch your ear.Touch your toes.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit7image.setVisibility(View.GONE);
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
                        tts.speak("Saturday.Sunday.Monday.tuesday.Wednesday.Thursday.Friday.",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("How many days are there in a week?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("7!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("What day is it today?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("It's Sunday.",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("On Saturday, Rima’s father gives her a seed.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("On Sunday, Rima puts the seed in a tub.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("On Monday, Rima waters the seed.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("On Tuesday, Rima puts the tub in the sun.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        unit9_1image.setVisibility(View.GONE);
                        unit9_2image.setVisibility(View.VISIBLE);

                        tts.speak("On Wednesday, Rima waters the seed again.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("On Thursday, Rima waits.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("On Friday, Rima sees something. There is a small plant.",TextToSpeech.QUEUE_FLUSH,null);

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
                unit10image.setVisibility(View.VISIBLE);

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
                        tts.speak("Red.Orange.Yellow.green.blue.indigo.violet.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Rhyme.Look,listen,say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Rainbow, rainbow.I see you!Red and orange,Yellow, green and blue,Indigo and violet, too!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        unit10image.setVisibility(View.GONE);
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
                unit11image.setVisibility(View.VISIBLE);

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
                        tts.speak("My name’s Lucky. I like you! l am round! Colour me blue.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("We're Sumon and Salam. Our sides are straight. Now count them from 1 to 8!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit11image.setVisibility(View.GONE);
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

                        tts.speak("Rhyme.Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("A black cat in a hat.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("A blue bear with long hair.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("A red rat under a mat.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("A brown ox on a box.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen and say.point.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("A red rat under a mat.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("A brown ox on a box.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("A blue bear with long hair.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("A black cat in a hat.",TextToSpeech.QUEUE_FLUSH,null);

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
                unit13_1image.setVisibility(View.VISIBLE);

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
                        tts.speak("get up.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("wash my face.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("have breakfast.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("brush my teeth.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Read.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I get up in the morning. I wash my face. Then, I have breakfast. After breakfast, I brush my teeth. Then, I go to school.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        unit13_1image.setVisibility(View.GONE);
                        unit13_2image.setVisibility(View.VISIBLE);
                        tts.speak("Look,listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("do my home work.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("read.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("play.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("watch tv.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("go to bed.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Read.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("In the afternoon, I do my homework. I play with my friends. Then, I read and watch TV. After dinner, I brush my teeth and go to bed.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit13_2image.setVisibility(View.GONE);
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

                        tts.speak("Read.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("This is Kaniz. In the morning, she washes her face. Then, she has breakfast. She has eggs and mangoes. Then, she brushes her teeth.  She goes to school. Miss Mariam is her teacher. Sujon and Joya are her friends. ",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Answer the questions.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Who is this girl?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("what does she have for breakfast?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("who is her teacher?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Who are ger friends?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
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

                        tts.speak("Read and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("This is Anita Sarkar. She gets up early in the morning. She cooks breakfast for her family.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Read and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("After breakfast, Anita goes to school. She is a teacher. She teaches Class 1 and Class 2.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Ask and answer.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Who is the women?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("when does she get up?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("What does she do for her family?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("where does she go after breakfast?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("what does she do?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
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

                        tts.speak("Read and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("This is a hen. It lives on a farm. It lays eggs. It eats seeds and grain.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Read and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("This is a tiger. It’s big. It lives in a forest. It eats other animals.",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("A poor farmer has a goose. Everyday, the goose lays an egg. It’s a golden egg. Everyday, the farmer sells the egg.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The farmer thinks, “I want to be rich. I have an idea!”",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The farmer thinks all the eggs are inside the goose.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("He kills the goose. He opens its belly, but there are no eggs!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        unit17_1image.setVisibility(View.GONE);
                        unit17_2image.setVisibility(View.VISIBLE);
                        tts.speak("Look and listen.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The farmer has no goose. He has no money. He is sad.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Pair work.Say true or false.If false,say the true answer.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The farmer sells the egg everyday.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The farmer buys eggs everyday.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The farmer is rich.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The farmer is sad at the end of the story.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit17_2image.setVisibility(View.GONE);
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