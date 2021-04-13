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

public class EnglishChapterClass1ActivityBangla extends AppCompatActivity implements TextToSpeech.OnInitListener {
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

    private ImageView unit1image;
    private ImageView unit2image;
    private ImageView unit3image;
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
    private ImageView unit17_1image;
    private ImageView unit17_2image;
    private ImageView unit17_3image;
    private ImageView unit17_4image;

    private TextToSpeech tts;

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_chapter_class1_bangla);

        toolbar=(Toolbar)findViewById(R.id.toolbar_back);
        DatabaseReference chapter_answer = FirebaseDatabase.getInstance().getReference();

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(EnglishChapterClass1ActivityBangla.this, BookActivityBangla.class));
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
        unit9image=(ImageView)findViewById(R.id.unit_9_image);
        unit10image=(ImageView)findViewById(R.id.unit_10_image);
        unit11image=(ImageView)findViewById(R.id.unit_11_image);
        unit12image=(ImageView)findViewById(R.id.unit_12_image);
        unit13image=(ImageView)findViewById(R.id.unit_13_image);
        unit14image=(ImageView)findViewById(R.id.unit_14_image);
        unit15image=(ImageView)findViewById(R.id.unit_15_image);
        unit16image=(ImageView)findViewById(R.id.unit_16_image);
        unit17_1image=(ImageView)findViewById(R.id.unit_17_1_image);
        unit17_2image=(ImageView)findViewById(R.id.unit_17_2_image);
        unit17_3image=(ImageView)findViewById(R.id.unit_17_3_image);
        unit17_4image=(ImageView)findViewById(R.id.unit_17_4_image);


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
                        tts.speak("When you go to school in morning you should say Good Morning to everyone.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Good Morning Students.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("You should reply Good morning teacher.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
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
                        tts.speak("Good morning. How are you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine Thank you.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Good morning. How are you?",TextToSpeech.QUEUE_FLUSH,null);

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
                toolbar.setVisibility(View.GONE);
                unit2image.setVisibility(View.VISIBLE);

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
                        tts.speak("How are you?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Fine, Thank you",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
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
                        tts.speak("Whats's your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am Lana.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
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
                        tts.speak("I am lana. Whats your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am Shakib.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am shakib. Whats your name?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("I am Runa.",TextToSpeech.QUEUE_FLUSH,null);

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
                toolbar.setVisibility(View.GONE);
                unit3image.setVisibility(View.VISIBLE);

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
                        tts.speak("Hello Students.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hello Teacher",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
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
                        tts.speak("Goodbye Teacher",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Goodbye Students",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Rhyme. Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Goodbye, goodbye! It's the end of the day. Goodbye, goodbye! Now it's time to play!",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Window.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Door",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Chair.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Floor",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Table",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Book",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Pencil.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bag.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
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
                        tts.speak("Stand up.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Sit down.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Go to the door.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Point to the window.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Rhyme.Listen,say and do.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Stand up. Sit down. Point to the floor. Point to a book. Go to the door.",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Tiger",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("stream",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Rhyme.Look, listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("3 little tigers sitting by a stream. Mushfiq, Shakib, and Tamim.Bye bye Mushfiq. Bye bye, Tamim.1 little tiger sitting by a stream.",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("What's this?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("It's a ball!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("It's an apple!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
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
                        tts.speak("What's this?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("It's a tiger. It's an ant.It's a chair.It's a pencil.It's a table.It's a book.It's an elephant.It's a bag.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Pairwork.Point and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("What's this?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("It's an elephant.",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Right",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Left",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Ground",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Sky",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Bird",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Rhyme.Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look left. Look right. Say hello. Look at the ground. Look at the sky. Look at the bird. Say goodbye!",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Open",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Close",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Show me.",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Open the window.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Close the door.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Show me your bag.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("say and match",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Open you bag.Show me your book.",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Hand",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Feet",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Eyes",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Head",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("2 hands go clap, clap, clap.2 feet go tap, tap, tap.2 eyes are open wide. 1 head goes side to side.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
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
                        tts.speak("Draw",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Take",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Come",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Match the pictures with the sentences.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Draw a dog",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Take your bag.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Come here",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Listen,say and do.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("stand up.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("sit down.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Go to the window",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Point to the door",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Rain",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("go away",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Play",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Rhyme.Loo,Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Rain, rain, go away. Come again another day. Little children want to play.Rain, rain, go away.",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Crow.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Pond.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Tree.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Plant.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Say. Listen and point",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Where do they live>Think and match.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(4000);
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
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("black.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("white.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("brown.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("red.",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Counting cats",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("1 cat,2 cats.Brown cat,white cat.3 cats,4 cats.Black cat,red cat.Count the cats at the door.1,2,3,4",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Ask and answer",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("What is it? and What colour is it?",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(4000);
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
                        tts.speak("Look, Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Phone.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Cat in a hat.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Rat on a mat.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Rhyme.Look,listen and say. ",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Ring... ring... It's the phone! Hello! Hello! I'm a rat on a mat. Is this the cat? I'm a cat in a hat. But I'm not at home!",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Listen and say.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("put on.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("shoe.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("stick.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("pick up.",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("1, 2,Put on your shoe.3, 4, Close the door.5, 6, Pick up sticks. 7, 8, Lay them straight.",TextToSpeech.QUEUE_FLUSH,null);

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
                        tts.speak("Say the alphabet.Sing the alphabet song.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("a.b. c. d. e. f. g. h. I. j. k. l. m. n. o. p. q. r. s. t. u. v. w. x. y. z.  ",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Now I know my abc.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Next time sing along with me!",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Look at the picture.Say the word.Say the first sound.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("Say the letter sound.Say the word starting with each letter.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(6000);
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
                toolbar.setVisibility(View.GONE);
                unit17_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak("Vocabulary",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("a for. and,are,along,air,ant,apple,alphabet,act,again,another,activity,at,ask,answer.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("b for. ball, book,bag,bye,bird,black,brown,but.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("C for. count,cat,cap,command,chair,capital,close,clap,colour,come,children,crow,circle,cow,coat,cot.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("d for. do,day,door,dog,dot,draw,dish.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("e for. elephant,egg,eye,each.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("f for.fine,floor,first,fish,feet,from,for.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("g for.good morning,good,greetings,goodbye,go,goat,ground,go away.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        unit17_1image.setVisibility(View.GONE);
                        unit17_2image.setVisibility(View.VISIBLE);
                        tts.speak("h for. here,hme,how are you?,how,hello,hen,hand,head,house,hat,home.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("i for. it,insects,in,is.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("j for. jar,join.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("k for. kite,know,kettle,kitten.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("l for. look,listen,lesson,little,left,lamp,live,lay.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("m for. morning, my,me,match,missing,moon,make,mat.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("n for.now,next,name,number,net,not.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("o for. open,ox,outside.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("p for.play, pencil,point,picture,pair work,page,pond,plant,pot.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        unit17_2image.setVisibility(View.GONE);
                        unit17_3image.setVisibility(View.VISIBLE);
                        tts.speak("phone,put on,pick up.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("q for quilt..",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("r for.read,rhyme,right,rain,red,rat,room,ring.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("s for. say,student,song,sing,stand up,sun,sit down,stream,sky,show,side,sentance,sound,shoe,stick,straight,small,starting.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("t for.teacher,thank,trace,time,the,table,tiger,this,tap,take,tree,they,think,tub,tubewell,things,them.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("u for.unit,use,umbrella.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("v for van.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("W for.with,what,write,window,wide,want,where,word,white,water.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        unit17_3image.setVisibility(View.GONE);
                        unit17_4image.setVisibility(View.VISIBLE);
                        tts.speak("x for x-ray.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("y for.you,your,yoke.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tts.speak("z for zebra.",TextToSpeech.QUEUE_FLUSH,null);

                        while (tts.isSpeaking()){

                        }
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        unit17_4image.setVisibility(View.GONE);
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