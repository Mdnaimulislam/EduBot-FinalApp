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

public class BanglaChapterClass4ActivityBangla extends AppCompatActivity implements TextToSpeech.OnInitListener{
    private Toolbar toolbar;
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
    private Button chapter_20;
    private Button chapter_21;
    private Button chapter_22;
    private Button chapter_23;

    private ImageView chapter1_1image;
    private ImageView chapter1_2image;
    private ImageView chapter1_3image;
    private ImageView chapter2image;
    private ImageView chapter3_1image;
    private ImageView chapter3_2image;
    private ImageView chapter3_3image;
    private ImageView chapter4_1image;
    private ImageView chapter4_2image;
    private ImageView chapter4_3image;
    private ImageView chapter5image;
    private ImageView chapter6_1image;
    private ImageView chapter6_2image;
    private ImageView chapter6_3image;
    private ImageView chapter7_1image;
    private ImageView chapter7_2image;
    private ImageView chapter7_3image;
    private ImageView chapter7_4image;
    private ImageView chapter8_1image;
    private ImageView chapter8_2image;
    private ImageView chapter8_3image;
    private ImageView chapter9image;
    private ImageView chapter10_1image;
    private ImageView chapter10_2image;
    private ImageView chapter11image;
    private ImageView chapter12_1image;
    private ImageView chapter12_2image;
    private ImageView chapter12_3image;
    private ImageView chapter13image;
    private ImageView chapter14_1image;
    private ImageView chapter14_2image;
    private ImageView chapter14_3image;
    private ImageView chapter15_1image;
    private ImageView chapter15_2image;
    private ImageView chapter15_3image;
    private ImageView chapter15_4image;
    private ImageView chapter16_1image;
    private ImageView chapter16_2image;
    private ImageView chapter17_1image;
    private ImageView chapter17_2image;
    private ImageView chapter18_1image;
    private ImageView chapter18_2image;
    private ImageView chapter19_1image;
    private ImageView chapter19_2image;
    private ImageView chapter19_3image;
    private ImageView chapter19_4image;
    private ImageView chapter20_1image;
    private ImageView chapter20_2image;
    private ImageView chapter21_1image;
    private ImageView chapter21_2image;
    private ImageView chapter22_1image;
    private ImageView chapter22_2image;
    private ImageView chapter22_3image;
    private ImageView chapter23_1image;
    private ImageView chapter23_2image;
    private ImageView chapter23_3image;
    private TextToSpeech tts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_chapter_class4_bangla);

        toolbar=(Toolbar)findViewById(R.id.toolbar_back);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BanglaChapterClass4ActivityBangla.this, BookActivityBangla.class));
            }
        });

        DatabaseReference chapter_answer = FirebaseDatabase.getInstance().getReference();

        chapter1_1image=(ImageView)findViewById(R.id.chapter_1_1_image);
        chapter1_2image=(ImageView)findViewById(R.id.chapter_1_2_image);
        chapter1_3image=(ImageView)findViewById(R.id.chapter_1_3_image);
        chapter2image=(ImageView)findViewById(R.id.chapter_2_image);
        chapter3_1image=(ImageView)findViewById(R.id.chapter_3_1_image);
        chapter3_2image=(ImageView)findViewById(R.id.chapter_3_2_image);
        chapter3_3image=(ImageView)findViewById(R.id.chapter_3_3_image);
        chapter4_1image=(ImageView)findViewById(R.id.chapter_4_1_image);
        chapter4_2image=(ImageView)findViewById(R.id.chapter_4_2_image);
        chapter4_3image=(ImageView)findViewById(R.id.chapter_4_3_image);
        chapter5image=(ImageView)findViewById(R.id.chapter_5_image);
        chapter6_1image=(ImageView)findViewById(R.id.chapter_6_1_image);
        chapter6_2image=(ImageView)findViewById(R.id.chapter_6_2_image);
        chapter6_3image=(ImageView)findViewById(R.id.chapter_6_3_image);
        chapter7_1image=(ImageView)findViewById(R.id.chapter_7_1_image);
        chapter7_2image=(ImageView)findViewById(R.id.chapter_7_2_image);
        chapter7_3image=(ImageView)findViewById(R.id.chapter_7_3_image);
        chapter7_4image=(ImageView)findViewById(R.id.chapter_7_4_image);
        chapter8_1image=(ImageView)findViewById(R.id.chapter_8_1_image);
        chapter8_2image=(ImageView)findViewById(R.id.chapter_8_2_image);
        chapter8_3image=(ImageView)findViewById(R.id.chapter_8_3_image);
        chapter9image=(ImageView)findViewById(R.id.chapter_9_image);
        chapter10_1image=(ImageView)findViewById(R.id.chapter_10_1_image);
        chapter10_2image=(ImageView)findViewById(R.id.chapter_10_2_image);
        chapter11image=(ImageView)findViewById(R.id.chapter_11_image);
        chapter12_1image=(ImageView)findViewById(R.id.chapter_12_1_image);
        chapter12_2image=(ImageView)findViewById(R.id.chapter_12_2_image);
        chapter12_3image=(ImageView)findViewById(R.id.chapter_12_3_image);
        chapter13image=(ImageView)findViewById(R.id.chapter_13_image);
        chapter14_1image=(ImageView)findViewById(R.id.chapter_14_1_image);
        chapter14_2image=(ImageView)findViewById(R.id.chapter_14_2_image);
        chapter14_3image=(ImageView)findViewById(R.id.chapter_14_3_image);
        chapter15_1image=(ImageView)findViewById(R.id.chapter_15_1_image);
        chapter15_2image=(ImageView)findViewById(R.id.chapter_15_2_image);
        chapter15_3image=(ImageView)findViewById(R.id.chapter_15_3_image);
        chapter15_4image=(ImageView)findViewById(R.id.chapter_15_4_image);
        chapter16_1image=(ImageView)findViewById(R.id.chapter_16_1_image);
        chapter16_2image=(ImageView)findViewById(R.id.chapter_16_2_image);
        chapter17_1image=(ImageView)findViewById(R.id.chapter_17_1_image);
        chapter17_2image=(ImageView)findViewById(R.id.chapter_17_2_image);
        chapter18_1image=(ImageView)findViewById(R.id.chapter_18_1_image);
        chapter18_2image=(ImageView)findViewById(R.id.chapter_18_2_image);
        chapter19_1image=(ImageView)findViewById(R.id.chapter_19_1_image);
        chapter19_2image=(ImageView)findViewById(R.id.chapter_19_2_image);
        chapter19_3image=(ImageView)findViewById(R.id.chapter_19_3_image);
        chapter19_4image=(ImageView)findViewById(R.id.chapter_19_4_image);
        chapter20_1image=(ImageView)findViewById(R.id.chapter_20_1_image);
        chapter20_2image=(ImageView)findViewById(R.id.chapter_20_2_image);
        chapter21_1image=(ImageView)findViewById(R.id.chapter_21_1_image);
        chapter21_2image=(ImageView)findViewById(R.id.chapter_21_2_image);
        chapter22_1image=(ImageView)findViewById(R.id.chapter_22_1_image);
        chapter22_2image=(ImageView)findViewById(R.id.chapter_22_2_image);
        chapter22_3image=(ImageView)findViewById(R.id.chapter_22_3_image);
        chapter23_1image=(ImageView)findViewById(R.id.chapter_23_1_image);
        chapter23_2image=(ImageView)findViewById(R.id.chapter_23_2_image);
        chapter23_3image=(ImageView)findViewById(R.id.chapter_23_3_image);



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
        chapter_20=(Button)findViewById(R.id.chapter_20);
        chapter_21=(Button)findViewById(R.id.chapter_21);
        chapter_22=(Button)findViewById(R.id.chapter_22);
        chapter_23=(Button)findViewById(R.id.chapter_23);
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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter1_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-1_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter1_1image.setVisibility(View.GONE);
                        chapter1_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-1_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter1_2image.setVisibility(View.GONE);
                                chapter1_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-1_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }
                                        chapter1_3image.setVisibility(View.GONE);
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
                                        chapter_20.setVisibility(View.VISIBLE);
                                        chapter_21.setVisibility(View.VISIBLE);
                                        chapter_22.setVisibility(View.VISIBLE);
                                        chapter_23.setVisibility(View.VISIBLE);

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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter2image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-2").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter2image.setVisibility(View.GONE);
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
                        chapter_20.setVisibility(View.VISIBLE);
                        chapter_21.setVisibility(View.VISIBLE);
                        chapter_22.setVisibility(View.VISIBLE);
                        chapter_23.setVisibility(View.VISIBLE);

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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter3_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-3_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter3_1image.setVisibility(View.GONE);
                        chapter3_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-3_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter3_2image.setVisibility(View.GONE);
                                chapter3_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-3_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }
                                        chapter3_3image.setVisibility(View.GONE);
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
                                        chapter_20.setVisibility(View.VISIBLE);
                                        chapter_21.setVisibility(View.VISIBLE);
                                        chapter_22.setVisibility(View.VISIBLE);
                                        chapter_23.setVisibility(View.VISIBLE);
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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter4_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-4_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter4_1image.setVisibility(View.GONE);
                        chapter4_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-4_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter4_2image.setVisibility(View.GONE);
                                chapter4_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-4_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }
                                        chapter4_3image.setVisibility(View.GONE);
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
                                        chapter_20.setVisibility(View.VISIBLE);
                                        chapter_21.setVisibility(View.VISIBLE);
                                        chapter_22.setVisibility(View.VISIBLE);
                                        chapter_23.setVisibility(View.VISIBLE);
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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter5image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-5").getValue();
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
                        chapter_20.setVisibility(View.VISIBLE);
                        chapter_21.setVisibility(View.VISIBLE);
                        chapter_22.setVisibility(View.VISIBLE);
                        chapter_23.setVisibility(View.VISIBLE);

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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter6_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-6_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter6_1image.setVisibility(View.GONE);
                        chapter6_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-6_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter6_2image.setVisibility(View.GONE);
                                chapter6_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-6_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }
                                        chapter6_3image.setVisibility(View.GONE);
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
                                        chapter_20.setVisibility(View.VISIBLE);
                                        chapter_21.setVisibility(View.VISIBLE);
                                        chapter_22.setVisibility(View.VISIBLE);
                                        chapter_23.setVisibility(View.VISIBLE);
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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter7_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-7_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter7_1image.setVisibility(View.GONE);
                        chapter7_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-7_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter7_2image.setVisibility(View.GONE);
                                chapter7_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-7_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }
                                        chapter7_3image.setVisibility(View.GONE);
                                        chapter7_4image.setVisibility(View.VISIBLE);
                                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                            @Override
                                            public void onDataChange(@NonNull DataSnapshot snapshot) {

                                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-7_4").getValue();
                                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                                while (tts.isSpeaking()){

                                                }
                                                chapter7_4image.setVisibility(View.GONE);
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
                                                chapter_20.setVisibility(View.VISIBLE);
                                                chapter_21.setVisibility(View.VISIBLE);
                                                chapter_22.setVisibility(View.VISIBLE);
                                                chapter_23.setVisibility(View.VISIBLE);

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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter8_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-8_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter8_1image.setVisibility(View.GONE);
                        chapter8_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-8_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter8_2image.setVisibility(View.GONE);
                                chapter8_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-8_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }
                                        chapter8_3image.setVisibility(View.GONE);
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
                                        chapter_20.setVisibility(View.VISIBLE);
                                        chapter_21.setVisibility(View.VISIBLE);
                                        chapter_22.setVisibility(View.VISIBLE);
                                        chapter_23.setVisibility(View.VISIBLE);
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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter9image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-9").getValue();
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
                        chapter_20.setVisibility(View.VISIBLE);
                        chapter_21.setVisibility(View.VISIBLE);
                        chapter_22.setVisibility(View.VISIBLE);
                        chapter_23.setVisibility(View.VISIBLE);

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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter10_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-10_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter10_1image.setVisibility(View.GONE);
                        chapter10_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-10_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }
                                chapter10_2image.setVisibility(View.GONE);
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
                                chapter_20.setVisibility(View.VISIBLE);
                                chapter_21.setVisibility(View.VISIBLE);
                                chapter_22.setVisibility(View.VISIBLE);
                                chapter_23.setVisibility(View.VISIBLE);

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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter11image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-11").getValue();
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
                        chapter_20.setVisibility(View.VISIBLE);
                        chapter_21.setVisibility(View.VISIBLE);
                        chapter_22.setVisibility(View.VISIBLE);
                        chapter_23.setVisibility(View.VISIBLE);

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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter12_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-12_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter12_1image.setVisibility(View.GONE);
                        chapter12_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-12_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter12_2image.setVisibility(View.GONE);
                                chapter12_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-12_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }
                                        chapter12_3image.setVisibility(View.GONE);
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
                                        chapter_20.setVisibility(View.VISIBLE);
                                        chapter_21.setVisibility(View.VISIBLE);
                                        chapter_22.setVisibility(View.VISIBLE);
                                        chapter_23.setVisibility(View.VISIBLE);
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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter13image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-13").getValue();
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
                        chapter_20.setVisibility(View.VISIBLE);
                        chapter_21.setVisibility(View.VISIBLE);
                        chapter_22.setVisibility(View.VISIBLE);
                        chapter_23.setVisibility(View.VISIBLE);

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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter14_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-14_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter14_1image.setVisibility(View.GONE);
                        chapter14_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-14_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter14_2image.setVisibility(View.GONE);
                                chapter14_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-14_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }
                                        chapter14_3image.setVisibility(View.GONE);
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
                                        chapter_20.setVisibility(View.VISIBLE);
                                        chapter_21.setVisibility(View.VISIBLE);
                                        chapter_22.setVisibility(View.VISIBLE);
                                        chapter_23.setVisibility(View.VISIBLE);
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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter15_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-15_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter15_1image.setVisibility(View.GONE);
                        chapter15_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-15_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter15_2image.setVisibility(View.GONE);
                                chapter15_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-15_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }
                                        chapter15_3image.setVisibility(View.GONE);
                                        chapter15_4image.setVisibility(View.VISIBLE);
                                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                            @Override
                                            public void onDataChange(@NonNull DataSnapshot snapshot) {

                                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-15_4").getValue();
                                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                                while (tts.isSpeaking()){

                                                }
                                                chapter15_4image.setVisibility(View.GONE);
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
                                                chapter_20.setVisibility(View.VISIBLE);
                                                chapter_21.setVisibility(View.VISIBLE);
                                                chapter_22.setVisibility(View.VISIBLE);
                                                chapter_23.setVisibility(View.VISIBLE);

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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter16_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-16_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter16_1image.setVisibility(View.GONE);
                        chapter16_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-16_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }
                                chapter16_2image.setVisibility(View.GONE);
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
                                chapter_20.setVisibility(View.VISIBLE);
                                chapter_21.setVisibility(View.VISIBLE);
                                chapter_22.setVisibility(View.VISIBLE);
                                chapter_23.setVisibility(View.VISIBLE);

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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter17_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-17_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter17_1image.setVisibility(View.GONE);
                        chapter17_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-17_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }
                                chapter17_2image.setVisibility(View.GONE);
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
                                chapter_20.setVisibility(View.VISIBLE);
                                chapter_21.setVisibility(View.VISIBLE);
                                chapter_22.setVisibility(View.VISIBLE);
                                chapter_23.setVisibility(View.VISIBLE);

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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter18_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-18_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter18_1image.setVisibility(View.GONE);
                        chapter18_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-18_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter18_2image.setVisibility(View.GONE);
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
                                chapter_20.setVisibility(View.VISIBLE);
                                chapter_21.setVisibility(View.VISIBLE);
                                chapter_22.setVisibility(View.VISIBLE);
                                chapter_23.setVisibility(View.VISIBLE);

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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter19_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-19_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter19_1image.setVisibility(View.GONE);
                        chapter19_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-19_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter19_2image.setVisibility(View.GONE);
                                chapter19_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-19_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }
                                        chapter19_3image.setVisibility(View.GONE);
                                        chapter19_4image.setVisibility(View.VISIBLE);
                                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                            @Override
                                            public void onDataChange(@NonNull DataSnapshot snapshot) {

                                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-19_4").getValue();
                                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                                while (tts.isSpeaking()){

                                                }
                                                chapter19_4image.setVisibility(View.GONE);
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
                                                chapter_20.setVisibility(View.VISIBLE);
                                                chapter_21.setVisibility(View.VISIBLE);
                                                chapter_22.setVisibility(View.VISIBLE);
                                                chapter_23.setVisibility(View.VISIBLE);

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
                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });

        chapter_20.setOnClickListener(new View.OnClickListener() {
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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter20_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-20_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter20_1image.setVisibility(View.GONE);
                        chapter20_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-20_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter20_2image.setVisibility(View.GONE);
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
                                chapter_20.setVisibility(View.VISIBLE);
                                chapter_21.setVisibility(View.VISIBLE);
                                chapter_22.setVisibility(View.VISIBLE);
                                chapter_23.setVisibility(View.VISIBLE);

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

        chapter_21.setOnClickListener(new View.OnClickListener() {
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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter21_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-21_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter21_1image.setVisibility(View.GONE);
                        chapter21_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-21_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter21_2image.setVisibility(View.GONE);
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
                                chapter_20.setVisibility(View.VISIBLE);
                                chapter_21.setVisibility(View.VISIBLE);
                                chapter_22.setVisibility(View.VISIBLE);
                                chapter_23.setVisibility(View.VISIBLE);


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

        chapter_22.setOnClickListener(new View.OnClickListener() {
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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter22_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-22_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter22_1image.setVisibility(View.GONE);
                        chapter22_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-22_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter22_2image.setVisibility(View.GONE);
                                chapter22_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-22_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }
                                        chapter22_3image.setVisibility(View.GONE);
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
                                        chapter_20.setVisibility(View.VISIBLE);
                                        chapter_21.setVisibility(View.VISIBLE);
                                        chapter_22.setVisibility(View.VISIBLE);
                                        chapter_23.setVisibility(View.VISIBLE);
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


        chapter_23.setOnClickListener(new View.OnClickListener() {
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
                chapter_20.setVisibility(View.GONE);
                chapter_21.setVisibility(View.GONE);
                chapter_22.setVisibility(View.GONE);
                chapter_23.setVisibility(View.GONE);
                toolbar.setVisibility(View.GONE);

                chapter23_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-23_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter23_1image.setVisibility(View.GONE);
                        chapter23_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-23_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter23_2image.setVisibility(View.GONE);
                                chapter23_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_4").child("Bangla").child("chapter-23_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }
                                        chapter23_3image.setVisibility(View.GONE);
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
                                        chapter_20.setVisibility(View.VISIBLE);
                                        chapter_21.setVisibility(View.VISIBLE);
                                        chapter_22.setVisibility(View.VISIBLE);
                                        chapter_23.setVisibility(View.VISIBLE);

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
    }

    @Override
    public void onInit(int i) {

    }
}