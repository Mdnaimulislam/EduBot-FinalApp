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

public class BanglaChapterClass2ActivityBangla extends AppCompatActivity implements TextToSpeech.OnInitListener  {
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
    private ImageView chapter1image;
    private ImageView chapter2_1image;
    private ImageView chapter2_2image;
    private ImageView chapter2_3image;
    private ImageView chapter3image;
    private ImageView chapter4_1image;
    private ImageView chapter4_2image;
    private ImageView chapter5image;
    private ImageView chapter6_1image;
    private ImageView chapter6_2image;
    private ImageView chapter7_1image;
    private ImageView chapter7_2image;
    private ImageView chapter8image;
    private ImageView chapter9_1image;
    private ImageView chapter9_2image;
    private ImageView chapter10image;
    private ImageView chapter11_1image;
    private ImageView chapter11_2image;
    private ImageView chapter12image;
    private ImageView chapter13_1image;
    private ImageView chapter13_2image;
    private ImageView chapter14_1image;
    private ImageView chapter14_2image;
    private ImageView chapter15_1image;
    private ImageView chapter15_2image;
    private ImageView chapter16_1image;
    private ImageView chapter16_2image;
    private ImageView chapter17image;
    private TextToSpeech tts;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_chapter_class2_bangla);

        toolbar=(Toolbar)findViewById(R.id.toolbar_back);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BanglaChapterClass2ActivityBangla.this, BookActivityBangla.class));
            }
        });

        DatabaseReference chapter_answer = FirebaseDatabase.getInstance().getReference();

        chapter1image=(ImageView)findViewById(R.id.chapter_1_image);
        chapter2_1image=(ImageView)findViewById(R.id.chapter_2_1_image);
        chapter2_2image=(ImageView)findViewById(R.id.chapter_2_2_image);
        chapter2_3image=(ImageView)findViewById(R.id.chapter_2_3_image);
        chapter3image=(ImageView)findViewById(R.id.chapter_3_image);
        chapter4_1image=(ImageView)findViewById(R.id.chapter_4_1_image);
        chapter4_2image=(ImageView)findViewById(R.id.chapter_4_2_image);
        chapter5image=(ImageView)findViewById(R.id.chapter_5_image);
        chapter6_1image=(ImageView)findViewById(R.id.chapter_6_1_image);
        chapter6_2image=(ImageView)findViewById(R.id.chapter_6_2_image);
        chapter7_1image=(ImageView)findViewById(R.id.chapter_7_1_image);
        chapter7_2image=(ImageView)findViewById(R.id.chapter_7_2_image);
        chapter8image=(ImageView)findViewById(R.id.chapter_8_image);
        chapter9_1image=(ImageView)findViewById(R.id.chapter_9_1_image);
        chapter9_2image=(ImageView)findViewById(R.id.chapter_9_2_image);
        chapter10image=(ImageView)findViewById(R.id.chapter_10_image);
        chapter11_1image=(ImageView)findViewById(R.id.chapter_11_1_image);
        chapter11_2image=(ImageView)findViewById(R.id.chapter_11_2_image);
        chapter12image=(ImageView)findViewById(R.id.chapter_12_image);
        chapter13_1image=(ImageView)findViewById(R.id.chapter_13_1_image);
        chapter13_2image=(ImageView)findViewById(R.id.chapter_13_2_image);
        chapter14_1image=(ImageView)findViewById(R.id.chapter_14_1_image);
        chapter14_2image=(ImageView)findViewById(R.id.chapter_14_2_image);
        chapter15_1image=(ImageView)findViewById(R.id.chapter_15_1_image);
        chapter15_2image=(ImageView)findViewById(R.id.chapter_15_2_image);
        chapter16_1image=(ImageView)findViewById(R.id.chapter_16_1_image);
        chapter16_2image=(ImageView)findViewById(R.id.chapter_16_2_image);
        chapter17image=(ImageView)findViewById(R.id.chapter_17_image);

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

        tts = new TextToSpeech(this, this);
        tts.setLanguage(Locale.forLanguageTag("bn-BD"));

        tts.setSpeechRate(.7f);
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

                chapter1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter1image.setVisibility(View.GONE);
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

                chapter2_1image.setVisibility(View.VISIBLE);


                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-2_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }

                        chapter2_1image.setVisibility(View.GONE);
                        chapter2_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-2_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }

                                chapter2_2image.setVisibility(View.GONE);
                                chapter2_3image.setVisibility(View.VISIBLE);
                                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-2_3").getValue();
                                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                        while (tts.isSpeaking()){

                                        }
                                        chapter2_3image.setVisibility(View.GONE);
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

                chapter3image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-3").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter3image.setVisibility(View.GONE);
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

                chapter4_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-4_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter4_1image.setVisibility(View.GONE);
                        chapter4_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-4_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }
                                chapter4_2image.setVisibility(View.GONE);
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

                chapter5image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-5").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter5image.setVisibility(View.GONE);
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

                chapter6_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-6_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter6_1image.setVisibility(View.GONE);
                        chapter6_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-6_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }
                                chapter6_2image.setVisibility(View.GONE);
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

                chapter7_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-7_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter7_1image.setVisibility(View.GONE);
                        chapter7_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-7_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }
                                chapter7_2image.setVisibility(View.GONE);
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

                chapter8image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-8").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter8image.setVisibility(View.GONE);
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

                chapter9_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-9_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter9_1image.setVisibility(View.GONE);
                        chapter9_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-9_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }
                                chapter9_2image.setVisibility(View.GONE);
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

                chapter10image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-10").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter10image.setVisibility(View.GONE);
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

                chapter11_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-11_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter11_1image.setVisibility(View.GONE);
                        chapter11_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-11_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }
                                chapter11_2image.setVisibility(View.GONE);
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

                chapter12image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-12").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter12image.setVisibility(View.GONE);
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

                chapter13_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-13_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter13_1image.setVisibility(View.GONE);
                        chapter13_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-13_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }
                                chapter13_2image.setVisibility(View.GONE);
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

                chapter14_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-14_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter14_1image.setVisibility(View.GONE);
                        chapter14_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-14_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }
                                chapter14_2image.setVisibility(View.GONE);
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

                chapter15_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-15_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter15_1image.setVisibility(View.GONE);
                        chapter15_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-15_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }
                                chapter15_2image.setVisibility(View.GONE);
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

                chapter16_1image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-16_1").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter16_1image.setVisibility(View.GONE);
                        chapter16_2image.setVisibility(View.VISIBLE);
                        chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-16_2").getValue();
                                tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                                while (tts.isSpeaking()){

                                }
                                chapter16_2image.setVisibility(View.GONE);
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

                chapter17image.setVisibility(View.VISIBLE);

                chapter_answer.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String answer=(String) snapshot.child("Subjects").child("class_2").child("Bangla").child("chapter-17").getValue();
                        tts.speak(answer,TextToSpeech.QUEUE_FLUSH,null);
                        while (tts.isSpeaking()){

                        }
                        chapter17image.setVisibility(View.GONE);
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