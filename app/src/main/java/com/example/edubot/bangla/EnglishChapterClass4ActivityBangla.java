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

import com.example.edubot.Choose_Language;
import com.example.edubot.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Locale;

public class EnglishChapterClass4ActivityBangla extends AppCompatActivity implements TextToSpeech.OnInitListener {
    Choose_Language b=new Choose_Language();
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
    private Button unit_18;
    private Button unit_19;
    private Button unit_20;
    private Button unit_21;
    private Button unit_22;
    private Button unit_23;
    private Button unit_24;
    private Button unit_25;
    private Button unit_26;
    private Button unit_27;
    private Button unit_28;
    private Button unit_29;
    private Button unit_31;
    private Button unit_32;
    private Button unit_33;
    private Button unit_34;
    private Button unit_35;
    private Button unit_36;
    private Button unit_37;
    private Button unit_38;
    private Button unit_40;
    private Button unit_42;

    private ImageView unit1_1image;
    private ImageView unit1_2image;
    private ImageView unit2_1image;
    private ImageView unit2_2image;
    private ImageView unit3_1image;
    private ImageView unit3_2image;
    private ImageView unit4image;
    private ImageView unit5image;
    private ImageView unit6image;
    private ImageView unit7image;
    private ImageView unit8image;
    private ImageView unit9image;
    private ImageView unit10image;
    private ImageView unit11image;
    private ImageView unit12image;
    private ImageView unit13image;
    private ImageView unit14image;
    private ImageView unit15image;
    private ImageView unit16image;
    private ImageView unit17image;
    private ImageView unit18image;
    private ImageView unit19image;
    private ImageView unit20image;
    private ImageView unit21image;
    private ImageView unit22image;
    private ImageView unit23image;
    private ImageView unit24image;
    private ImageView unit25image;
    private ImageView unit26image;
    private ImageView unit27image;
    private ImageView unit28image;
    private ImageView unit29_1image;
    private ImageView unit29_2image;
    private ImageView unit31_1image;
    private ImageView unit31_2image;
    private ImageView unit32image;
    private ImageView unit33image;
    private ImageView unit34image;
    private ImageView unit35image;
    private ImageView unit36image;
    private ImageView unit37image;
    private ImageView unit38image;
    private ImageView unit40image;
    private ImageView unit42_1image;
    private ImageView unit42_2image;




    private TextToSpeech tts;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_chapter_class4_bangla);
        toolbar=(Toolbar)findViewById(R.id.toolbar_back);
        DatabaseReference chapter_answer = FirebaseDatabase.getInstance().getReference();

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(EnglishChapterClass4ActivityBangla.this, SubjectActivityBanglaClass_4.class));
            }
        });
        unit1_1image=(ImageView)findViewById(R.id.unit_1_1_image);
        unit1_2image=(ImageView)findViewById(R.id.unit_1_2_image);
        unit2_1image=(ImageView)findViewById(R.id.unit_2_1_image);
        unit2_2image=(ImageView)findViewById(R.id.unit_2_2_image);
        unit3_1image=(ImageView)findViewById(R.id.unit_3_1_image);
        unit3_2image=(ImageView)findViewById(R.id.unit_3_2_image);
        unit4image=(ImageView)findViewById(R.id.unit_4_image);
        unit5image=(ImageView)findViewById(R.id.unit_5_image);
        unit6image=(ImageView)findViewById(R.id.unit_6_image);
        unit7image=(ImageView)findViewById(R.id.unit_7_image);
        unit8image=(ImageView)findViewById(R.id.unit_8_image);
        unit9image=(ImageView)findViewById(R.id.unit_9_image);
        unit10image=(ImageView)findViewById(R.id.unit_10_image);
        unit11image=(ImageView)findViewById(R.id.unit_11_image);
        unit12image=(ImageView)findViewById(R.id.unit_12_image);
        unit13image=(ImageView)findViewById(R.id.unit_13_image);
        unit14image=(ImageView)findViewById(R.id.unit_14_image);
        unit15image=(ImageView)findViewById(R.id.unit_15_image);
        unit16image=(ImageView)findViewById(R.id.unit_16_image);
        unit17image=(ImageView)findViewById(R.id.unit_17_image);
        unit18image=(ImageView)findViewById(R.id.unit_18_image);
        unit19image=(ImageView)findViewById(R.id.unit_19_image);
        unit20image=(ImageView)findViewById(R.id.unit_20_image);
        unit21image=(ImageView)findViewById(R.id.unit_21_image);
        unit22image=(ImageView)findViewById(R.id.unit_22_image);
        unit23image=(ImageView)findViewById(R.id.unit_23_image);
        unit24image=(ImageView)findViewById(R.id.unit_24_image);
        unit25image=(ImageView)findViewById(R.id.unit_25_image);
        unit26image=(ImageView)findViewById(R.id.unit_26_image);
        unit27image=(ImageView)findViewById(R.id.unit_27_image);
        unit28image=(ImageView)findViewById(R.id.unit_28_image);
        unit29_1image=(ImageView)findViewById(R.id.unit_29_1_image);
        unit29_2image=(ImageView)findViewById(R.id.unit_29_2_image);
        unit31_1image=(ImageView)findViewById(R.id.unit_31_1_image);
        unit31_2image=(ImageView)findViewById(R.id.unit_31_2_image);
        unit32image=(ImageView)findViewById(R.id.unit_32_image);
        unit33image=(ImageView)findViewById(R.id.unit_33_image);
        unit34image=(ImageView)findViewById(R.id.unit_34_image);
        unit35image=(ImageView)findViewById(R.id.unit_35_image);
        unit36image=(ImageView)findViewById(R.id.unit_36_image);
        unit37image=(ImageView)findViewById(R.id.unit_37_image);
        unit38image=(ImageView)findViewById(R.id.unit_38_image);
        unit40image=(ImageView)findViewById(R.id.unit_40_image);
        unit42_1image=(ImageView)findViewById(R.id.unit_42_1_image);
        unit42_2image=(ImageView)findViewById(R.id.unit_42_2_image);



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
        unit_18=(Button)findViewById(R.id.unit_18);
        unit_19=(Button)findViewById(R.id.unit_19);
        unit_20=(Button)findViewById(R.id.unit_20);
        unit_21=(Button)findViewById(R.id.unit_21);
        unit_22=(Button)findViewById(R.id.unit_22);
        unit_23=(Button)findViewById(R.id.unit_23);
        unit_24=(Button)findViewById(R.id.unit_24);
        unit_25=(Button)findViewById(R.id.unit_25);
        unit_26=(Button)findViewById(R.id.unit_26);
        unit_27=(Button)findViewById(R.id.unit_27);
        unit_28=(Button)findViewById(R.id.unit_28);
        unit_29=(Button)findViewById(R.id.unit_29);
        unit_31=(Button)findViewById(R.id.unit_31);
        unit_32=(Button)findViewById(R.id.unit_32);
        unit_33=(Button)findViewById(R.id.unit_33);
        unit_34=(Button)findViewById(R.id.unit_34);
        unit_35=(Button)findViewById(R.id.unit_35);
        unit_36=(Button)findViewById(R.id.unit_36);
        unit_37=(Button)findViewById(R.id.unit_37);
        unit_38=(Button)findViewById(R.id.unit_38);
        unit_40=(Button)findViewById(R.id.unit_40);
        unit_42=(Button)findViewById(R.id.unit_42);




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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                unit1_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, listen and say",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello! I’m your teacher My name is Salma Akhtar",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello, I’m Ali. I’m in class 4.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi, I’m Shirin. I’m from Palashpur.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello! I’m Bijoy. I’m nine years old.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Pairwork. Ask and Answer.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("What is your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("What class are you in?",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Where are you from?",TextToSpeech.QUEUE_FLUSH,null);

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
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Write the answers to the question from Activity B in your Exercise book",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        unit1_1image.setVisibility(View.GONE);
                        unit1_2image.setVisibility(View.VISIBLE);
                        tts.speak("Look,listen and sing",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Hello, hello, hello! .How are you?.I’m very well, thank you. Thank you..And how are you?..I’m very well, too..Thank you, thank you",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Listen,read and say",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Hello, I’m Mita. I’m in class 4.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("I’m Salman. I’m in class 4, too. Nice to meet you. Who’s your friend?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("This is Ayesha. She’s in class 3.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Hello, Ayesha. Nice to meet you.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Hello. Nice to meet you, too. How are you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("I’m fine, thanks. ",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }



                        unit1_2image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit2_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look,Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Good morning.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Morning, mum!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Good afternoon, teacher.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Hello! Good afternoon!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Good evening.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                        tts.speak("Good night! See you tomorrow.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Goodbye! See you at school.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }



                        unit2_1image.setVisibility(View.GONE);
                        unit2_2image.setVisibility(View.VISIBLE);
                        tts.speak("Good morning, students. ",TextToSpeech.QUEUE_FLUSH,null);




                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Good morning, teacher.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("We’re going to play a word game today.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hurrah! Let’s start!",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Good afternoon, Sabina.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Good afternoon, Hasan.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Where are you going?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I’m going to buy same books.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Ok. Bye!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bye.",TextToSpeech.QUEUE_FLUSH,null);

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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit3_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look at the picture of the family. How many people are in the family? What do you think the people do?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Read.. Farzana and Jamil are from Kushtia. They go to Chachua Government Primary School. Farzana is nine years old. She is in class 4. Jamil is seven years old. He is in class 2. They like school and they are good students.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Farzana and Jamil’s mother is Rehana Parvin. She is 33 years old. She works at a hospital in Kushtia. She is a doctor. She takes care of many patients everyday. She likes her job very much.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Aziz Ahmed is Farzana and Jamil’s father. He is a pilot Biman Bangladesh Airlines. He flies to other countries. He travels to India, Thailand and China often. He loves to travel. He is 39 years old.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        unit3_1image.setVisibility(View.GONE);
                        unit3_2image.setVisibility(View.VISIBLE);
                        tts.speak("Aziz Ahmed’s parents also live with the family. His father Altaf Uddin is 68 years old. He doesn’t work now, but he was a government officer. Jahanara Begum is Aziz Ahmed’s mother. She is 64. She is a homemaker. She reads stories to Farzana and Jamil. They both play carrom and ludu with their grandchildren.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Read and complete the chart with information about the family in your text book.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(5000000);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit4image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look at the family tree of Farzana and Jamil.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Answer the questions about the family tree.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Who is Jahanara Begum? Who is her husband?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Who is Jamil and Farzana’s father? Who is their mother?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Who is Aziz Ahmed’s father? Who is his mother?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(3000);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit5image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Match the instructions and the pictures. Write the letter next to the pictures.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(5000000);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit6image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look and say",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Pen..encil..Eraser..Bag..crayons..Pencil Case..Paper..Sharpener",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
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
                        tts.speak("Can I help you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Yes, please. I’d like two pens, a pencil and a piece of paper.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Anything else?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Yes, a pencil case, please.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("OK. That’s 150 taka.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Here you are.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("You gave me 200 taka. That’s 50 taka change.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Thank you. Bye.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Thank you. Bye. Come again.",TextToSpeech.QUEUE_FLUSH,null);

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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit7image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
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
                        tts.speak("Excuse me, Can I borrow your eraser?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Sure. Here you are.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Thanks. Can I use your sharpener, too?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("I’m sorry. I don’t have a sharpener.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("That’s Ok. Thanks anyway.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Could I have some paper, please?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Sure. Take it.",TextToSpeech.QUEUE_FLUSH,null);

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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit8image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Red light, red light, what do you say? I say stop and stop right away.Yellow light, yellow light, what do you mean?I mean slow down and wait for the green.Green light, green light, what do you say?I say go, but look both ways. Thank you, thank you, red, yellow, green. Now we know what the traffic lights mean.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Read the poem in Activity A. Write T for True and F for False.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(3000000);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit9image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Pairwork. Look at the pictures. say the words of the correct picture.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Complete the sentence with the correct from of the verb in brackets.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(3000000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                        unit9image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit10image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("How many people are in the race?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I think there are eight people, three girls and five boys.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Really? Who’s first?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("It’s Fazle. He’s got a blue shirt. He’s very fast. Tamanna is second. She’s very fast, too.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Who’s third?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I think Samir is third. His shirt is red. But I can’t see the others. They are far behind.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Read the dialogue again. Underline all the ordinal numbers.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000000);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit11image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("cup,cup,cup. A cup on a cup.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("hut,hut,hut..a hut in a sun.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("cut,cut,cut..can you cut the bun?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Look, listen and say",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Father, father, look at the car. The car is near the park",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1500);
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
                        tts.speak("What have you got? I’ve got a spinning top! Top, top, top. Don’t stop my top!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit12image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Solomon Grundy, Born on Monday, Named on Tuesday, Married on Wednesday, Got ill on Thursday, Died on Friday, Buried on Saturday, Prayed for on Sunday, That was the end of Solomon Grundy.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("On what day of the week was Solomon Grundy.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Write the days of the week in cursive letters in the correct order.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(15000000);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit13image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, listen and read.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The clock has two hands. The short, red hand is the hour hand. The long, blue hand is the minute hand.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look at the clocks. Say the times. Complete the sentences with the correct number.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Telling the time.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("It’s 12 o’clock. It’s midday.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("It’s 12 o’clock. It’s midnight",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("From midnight until midday. We use a.m.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("From midday until midnight. We use p.m.",TextToSpeech.QUEUE_FLUSH,null);

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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit14image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
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
                        tts.speak("Mita is in Class 4. She gets up at six o’clock. She washes her face. She has breakfast at seven o’clock. Then, she brushes her teeth. She goes to school at nine o’clock. She walks to her school. After school, she visits her grandmother at three o’clock. Then, Mita returns home at five o’clock.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Complete the sentences with the time in numbers. Use a.m or p.m.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000000);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit15image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.Read.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hi! I’m Sagar. I’m in class 4. I’m in nine years old. I have a little sister. Her name is Keya. She’s only three years old. My father is a doctor and my mother is a housewife. My grandfather was a school teacher, but he doesn’t work now. My grandfather helps me with my homework. He is very smart!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("My grandmother works at home. She makes the best “pithas” in the world! She helps my mother in the garden. My mother has a wonderful garden. I’m very proud of it. She grows the best tomatoes and cucumbers in the neighbourhood. They are delicious!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Complete the sentences with the question words.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1200000);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit16image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.Read",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("On weekdays, Sagar gets up at 6 in the morning. He first says his prayers. Then he goes to his grandfather and studies Bangla and English with him. He and his sister have breakfast at 8 o’clock. Sagar gets dressed after breakfast and leaves for school at 9 o’clock because school starts at 10 o’clock. In the evening, Sagar does his homework. He loves Bangla. It’s his favourite subject. After he does his homework, Sagar spends time with his grandparents. He and his family have dinner at 9 p.m. Then he goes to bed at 10 p.m.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("On weekends, Sagar visits his aunt and uncle in the afternoon. He and keya play in the park with their cousins. In the evening, he watches TV or reads stories to Keya. At night he goes to bed at 11 o’clock.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Read the sentence. Write T for True or F for False.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000000);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);
                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit17image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The boy is running very fast!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The girls are playing! Let’s play with them!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Statements in the present continuous",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("We use the present continuous to talk about things happening now.for example he is playing.she is eating.We have added the i n g with play beacuse it is happening now.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit17image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);

                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });


        unit_18.setOnClickListener(new View.OnClickListener() {
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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit18image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Stress",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("We stress parts of words or sentences. The parts of words or sentences in blue are louder.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen, say and do.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Clap, clap, clap. Clap your hands with me. Listen to the music And clap your hands with me.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Move, move, move. Move your head with me Move your head from side to side. Move your head with me.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Say the rhyme again. Clap on the all stressed parts of the rhyme.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(400000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit18image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);

                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });

        unit_19.setOnClickListener(new View.OnClickListener() {
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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit19image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fried egg..rice..mixed vegetables.. sandwich.. coconut ..juice .. strawberry..  papaya",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen and say. Read.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Good morning. Can I help you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Good morning. Could I have two fried eggs and a glass of juice?  ",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Sure. What kind of juice?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Papaya juice, please.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I’m sorry. We don’t have any papaya juice. How about mango juice?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Ok.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Anything else?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("No, thanks. That’s all.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit19image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);

                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });

        unit_20.setOnClickListener(new View.OnClickListener() {
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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit20image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, listen and say. Read. Circle the thing that Mita want.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Mum, do we have any juice?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Sorry, dear. We don’t have any juice. You can have some milk.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("No, thanks. I don’t want any milk. How about ice-cream? Do we have any ice-cream?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("Well, we have some ice-cream, but I’m cooking dinner now. You can have some ice-cream after        dinner.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Ok. What’s for dinner?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Chicken and rice.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Pairwork. Ask your partner What’s in his/her bag.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Do you have any books in your school bag. ",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Yes, I do. I have 3 books in my school bag.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                        unit20image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);

                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });

        unit_21.setOnClickListener(new View.OnClickListener() {
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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit21image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
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
                        tts.speak("Hi! I'm Alex. I live in London.  I’m British. I start my day at 7 a.m. and I have breakfast at 8 o’clock. On weekdays, l usually have milk, cereal and an apple. Sometimes I have fried eggs with cheese and some juice. Apple juice is my favourite, but I like mango juice, too. We don't grow any mangoes in my Country, but we can get mango juice at the supermarket.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello! I'm Heba from Saudi Arabia. It's very hot here, so our Schools start at 7 a.m. I get up at 5 in the morning and I have my breakfast at 6 o’clock. For breakfast, I usually have some hot beans and bread. Sometimes I have eggs. I drink juice almost every morning. Mango juice is my favourite, but I like orange juice, too. We don't drink a lot of milk in our family. We don't like it very much.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Complete the sentences about Alex or Heba.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(200000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                        unit21image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);

                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });

        unit_22.setOnClickListener(new View.OnClickListener() {
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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit22image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("A fresh mango",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("a bad mango",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("a clean shirt",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("a dirty shirt.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("A new bike",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("an old bike",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("a happy cat",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("an angry cat",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Using our voices.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("When we talk, our voice may go up  or down. When we ask questions, our voice also rises or falls. For questions beginning with What, When, Where, Why, Who and How, our voice goes down. In statements, our voice goes down, too.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                        unit22image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);

                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });

        unit_23.setOnClickListener(new View.OnClickListener() {
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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit23image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The boy is running very fast!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The girls are playing! Let’s play with them!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Statements in the present continuous",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("We use the present continuous to talk about things happening now.for example he is playing.she is eating.We have added the i n g with play beacuse it is happening now.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit23image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);

                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit17image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The boy is running very fast!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The girls are playing! Let’s play with them!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Statements in the present continuous",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("We use the present continuous to talk about things happening now.for example he is playing.she is eating.We have added the i n g with play beacuse it is happening now.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit17image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);

                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit17image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The boy is running very fast!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The girls are playing! Let’s play with them!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Statements in the present continuous",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("We use the present continuous to talk about things happening now.for example he is playing.she is eating.We have added the i n g with play beacuse it is happening now.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit17image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);

                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit17image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The boy is running very fast!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The girls are playing! Let’s play with them!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Statements in the present continuous",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("We use the present continuous to talk about things happening now.for example he is playing.she is eating.We have added the i n g with play beacuse it is happening now.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit17image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);

                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit17image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The boy is running very fast!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The girls are playing! Let’s play with them!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Statements in the present continuous",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("We use the present continuous to talk about things happening now.for example he is playing.she is eating.We have added the i n g with play beacuse it is happening now.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit17image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);

                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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
                unit_18.setVisibility(View.GONE);
                unit_19.setVisibility(View.GONE);
                unit_20.setVisibility(View.GONE);
                unit_21.setVisibility(View.GONE);
                unit_22.setVisibility(View.GONE);
                unit_23.setVisibility(View.GONE);
                unit_24.setVisibility(View.GONE);
                unit_25.setVisibility(View.GONE);
                unit_26.setVisibility(View.GONE);
                unit_27.setVisibility(View.GONE);
                unit_28.setVisibility(View.GONE);
                unit_29.setVisibility(View.GONE);
                unit_31.setVisibility(View.GONE);
                unit_32.setVisibility(View.GONE);
                unit_33.setVisibility(View.GONE);
                unit_34.setVisibility(View.GONE);
                unit_35.setVisibility(View.GONE);
                unit_36.setVisibility(View.GONE);
                unit_37.setVisibility(View.GONE);
                unit_38.setVisibility(View.GONE);
                unit_40.setVisibility(View.GONE);
                unit_42.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                unit17image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The boy is running very fast!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("The girls are playing! Let’s play with them!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Statements in the present continuous",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        tts.speak("We use the present continuous to talk about things happening now.for example he is playing.she is eating.We have added the i n g with play beacuse it is happening now.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit17image.setVisibility(View.GONE);
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
                        unit_18.setVisibility(View.VISIBLE);
                        unit_19.setVisibility(View.VISIBLE);
                        unit_20.setVisibility(View.VISIBLE);
                        unit_21.setVisibility(View.VISIBLE);
                        unit_22.setVisibility(View.VISIBLE);
                        unit_23.setVisibility(View.VISIBLE);
                        unit_24.setVisibility(View.VISIBLE);
                        unit_25.setVisibility(View.VISIBLE);
                        unit_26.setVisibility(View.VISIBLE);
                        unit_27.setVisibility(View.VISIBLE);
                        unit_28.setVisibility(View.VISIBLE);
                        unit_29.setVisibility(View.VISIBLE);
                        unit_31.setVisibility(View.VISIBLE);
                        unit_32.setVisibility(View.VISIBLE);
                        unit_33.setVisibility(View.VISIBLE);
                        unit_34.setVisibility(View.VISIBLE);
                        unit_35.setVisibility(View.VISIBLE);
                        unit_36.setVisibility(View.VISIBLE);
                        unit_37.setVisibility(View.VISIBLE);
                        unit_38.setVisibility(View.VISIBLE);
                        unit_40.setVisibility(View.VISIBLE);
                        unit_42.setVisibility(View.VISIBLE);

                        try {
                            b.intentAction("B");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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