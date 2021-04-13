package com.example.edubot.bangla;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.speech.tts.TextToSpeech;

import com.example.edubot.Choose_Language;
import com.example.edubot.R;
import com.example.edubot.english.BookActivityEnglish;
import com.example.edubot.english.SubjectActivityEnglishClass_1;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Locale;

public class BanglaChapterClass1ActivityBangla extends AppCompatActivity implements TextToSpeech.OnInitListener {

    private Button chapter_1;
    private Button chapter_2;
    private Button chapter_3;
    private Button chapter_4;

    private Button chapter_5;
    private Button chapter_6;
    private Button chapter_7;
    private Button chapter_8;
    private Button chapter_9;
    private Button chapter_10;
    private Button chapter_11;
    private Button chapter_12;
    private Button chapter_13;
    private Button chapter_14;
    private Button chapter_15;
    private Button chapter_16;
    private Button chapter_17;
    private Button chapter_18;
    private Button chapter_19;
    private ImageView chapter1image;
    private ImageView chapter2_1image;
    private ImageView chapter2_2image;
    private ImageView chapter2_3image;
    private ImageView chapter3image;
    private ImageView chapter4image;
    private ImageView chapter5image;
    private ImageView chapter6image;
    private ImageView chapter7image;
    private ImageView chapter8image;
    private ImageView chapter9image;
    private ImageView chapter10image;
    private ImageView chapter11image;
    private ImageView chapter12image;
    private ImageView chapter13image;
    private ImageView chapter14image;
    private ImageView chapter15image;
    private ImageView chapter16image;
    private ImageView chapter17image;
    private ImageView chapter18image;
    private ImageView chapter19image;
    private TextToSpeech tts;

    private Toolbar toolbar;
    Choose_Language b=new Choose_Language();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_chapter_class1_bangla);

        DatabaseReference chapter_answer = FirebaseDatabase.getInstance().getReference();
        toolbar=(Toolbar)findViewById(R.id.toolbar_back);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    startActivity(new Intent(BanglaChapterClass1ActivityBangla.this, BookActivityBangla.class));


            }
        });

        chapter1image=(ImageView)findViewById(R.id.chapter_1_image);
        chapter2_1image=(ImageView)findViewById(R.id.chapter_2_1_image);
        chapter2_2image=(ImageView)findViewById(R.id.chapter_2_2_image);
        chapter2_3image=(ImageView)findViewById(R.id.chapter_2_3_image);
        chapter3image=(ImageView)findViewById(R.id.chapter_3_image);
        chapter4image=(ImageView)findViewById(R.id.chapter_4_image);
        chapter5image=(ImageView)findViewById(R.id.chapter_5_image);
        chapter6image=(ImageView)findViewById(R.id.chapter_6_image);
        chapter7image=(ImageView)findViewById(R.id.chapter_7_image);
        chapter8image=(ImageView)findViewById(R.id.chapter_8_image);
        chapter9image=(ImageView)findViewById(R.id.chapter_9_image);
        chapter10image=(ImageView)findViewById(R.id.chapter_10_image);
        chapter11image=(ImageView)findViewById(R.id.chapter_11_image);
        chapter12image=(ImageView)findViewById(R.id.chapter_12_image);
        chapter13image=(ImageView)findViewById(R.id.chapter_13_image);
        chapter14image=(ImageView)findViewById(R.id.chapter_14_image);
        chapter15image=(ImageView)findViewById(R.id.chapter_15_image);
        chapter16image=(ImageView)findViewById(R.id.chapter_16_image);
        chapter17image=(ImageView)findViewById(R.id.chapter_17_image);
        chapter18image=(ImageView)findViewById(R.id.chapter_18_image);
        chapter19image=(ImageView)findViewById(R.id.chapter_19_image);

        chapter_1=(Button)findViewById(R.id.chapter_1);
        chapter_2=(Button)findViewById(R.id.chapter_2);
        chapter_3=(Button)findViewById(R.id.chapter_3);
        chapter_4=(Button)findViewById(R.id.chapter_4);
        chapter_5=(Button)findViewById(R.id.chapter_5);
        chapter_6=(Button)findViewById(R.id.chapter_6);
        chapter_7=(Button)findViewById(R.id.chapter_7);
        chapter_8=(Button)findViewById(R.id.chapter_8);
        chapter_9=(Button)findViewById(R.id.chapter_9);
        chapter_10=(Button)findViewById(R.id.chapter_10);
        chapter_11=(Button)findViewById(R.id.chapter_11);
        chapter_12=(Button)findViewById(R.id.chapter_12);
        chapter_13=(Button)findViewById(R.id.chapter_13);
        chapter_14=(Button)findViewById(R.id.chapter_14);
        chapter_15=(Button)findViewById(R.id.chapter_15);
        chapter_16=(Button)findViewById(R.id.chapter_16);
        chapter_17=(Button)findViewById(R.id.chapter_17);
        chapter_18=(Button)findViewById(R.id.chapter_18);
        chapter_19=(Button)findViewById(R.id.chapter_19);
        tts = new TextToSpeech(this, this);
        tts.setLanguage(Locale.forLanguageTag("bn-BD"));

        tts.setPitch(1.2f);
        tts.setSpeechRate(1f);



        chapter_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        while (tts.isSpeaking()){

                        }
                        chapter1image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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


        chapter_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter2_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-2_1").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter2_1image.setVisibility(View.GONE);
                        chapter2_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-2_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter2_2image.setVisibility(View.GONE);
                                chapter2_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-2_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }

                                        chapter2_3image.setVisibility(View.GONE);
                                        toolbar.setVisibility(View.VISIBLE);
                                        chapter_1.setVisibility(View.VISIBLE);
                                        chapter_2.setVisibility(View.VISIBLE);
                                        chapter_3.setVisibility(View.VISIBLE);
                                        chapter_4.setVisibility(View.VISIBLE);
                                        chapter_5.setVisibility(View.VISIBLE);
                                        chapter_6.setVisibility(View.VISIBLE);
                                        chapter_7.setVisibility(View.VISIBLE);
                                        chapter_8.setVisibility(View.VISIBLE);
                                        chapter_9.setVisibility(View.VISIBLE);
                                        chapter_10.setVisibility(View.VISIBLE);
                                        chapter_11.setVisibility(View.VISIBLE);
                                        chapter_12.setVisibility(View.VISIBLE);
                                        chapter_13.setVisibility(View.VISIBLE);
                                        chapter_14.setVisibility(View.VISIBLE);
                                        chapter_15.setVisibility(View.VISIBLE);
                                        chapter_16.setVisibility(View.VISIBLE);
                                        chapter_17.setVisibility(View.VISIBLE);
                                        chapter_18.setVisibility(View.VISIBLE);
                                        chapter_19.setVisibility(View.VISIBLE);
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

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });


            }
        });
        chapter_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter3image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-3").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter3image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter4image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-4").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter4image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter5image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-5").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter5image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter6image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-6").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter6image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter7image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-7").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter7image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter8image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-8").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter8image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter9image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-9").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter9image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter10image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-10").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter10image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter11image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-11").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter11image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter12image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-12").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter12image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter13image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-13").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter13image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter14image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-14").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter14image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter15image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-15").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter15image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter16image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-16").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter16image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter17image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-17").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter17image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter18image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-18").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter18image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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
        chapter_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chapter_1.setVisibility(View.GONE);
                chapter_2.setVisibility(View.GONE);
                chapter_3.setVisibility(View.GONE);
                chapter_4.setVisibility(View.GONE);
                chapter_5.setVisibility(View.GONE);
                chapter_6.setVisibility(View.GONE);
                chapter_7.setVisibility(View.GONE);
                chapter_8.setVisibility(View.GONE);
                chapter_9.setVisibility(View.GONE);
                chapter_10.setVisibility(View.GONE);
                chapter_11.setVisibility(View.GONE);
                chapter_12.setVisibility(View.GONE);
                chapter_13.setVisibility(View.GONE);
                chapter_14.setVisibility(View.GONE);
                chapter_15.setVisibility(View.GONE);
                chapter_16.setVisibility(View.GONE);
                chapter_17.setVisibility(View.GONE);
                chapter_18.setVisibility(View.GONE);
                chapter_19.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);
                chapter19image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_1").child("Bangla").child("chapter-19").getValue();
                        try {
                            b.intentAction("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter19image.setVisibility(View.GONE);
                        toolbar.setVisibility(View.VISIBLE);
                        chapter_1.setVisibility(View.VISIBLE);
                        chapter_2.setVisibility(View.VISIBLE);
                        chapter_3.setVisibility(View.VISIBLE);
                        chapter_4.setVisibility(View.VISIBLE);
                        chapter_5.setVisibility(View.VISIBLE);
                        chapter_6.setVisibility(View.VISIBLE);
                        chapter_7.setVisibility(View.VISIBLE);
                        chapter_8.setVisibility(View.VISIBLE);
                        chapter_9.setVisibility(View.VISIBLE);
                        chapter_10.setVisibility(View.VISIBLE);
                        chapter_11.setVisibility(View.VISIBLE);
                        chapter_12.setVisibility(View.VISIBLE);
                        chapter_13.setVisibility(View.VISIBLE);
                        chapter_14.setVisibility(View.VISIBLE);
                        chapter_15.setVisibility(View.VISIBLE);
                        chapter_16.setVisibility(View.VISIBLE);
                        chapter_17.setVisibility(View.VISIBLE);
                        chapter_18.setVisibility(View.VISIBLE);
                        chapter_19.setVisibility(View.VISIBLE);
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