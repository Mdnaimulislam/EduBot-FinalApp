package com.example.edubot.english;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.edubot.R;

public class SubjectActivityEnglishClass_2 extends AppCompatActivity {
    private Toolbar toolbar;
    private Button bangla_sub;
    private Button english_sub;
    private Button math_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_english_class_2);
        toolbar=(Toolbar)findViewById(R.id.toolbar_back);
        bangla_sub=(Button)findViewById(R.id.bangla_en_2);
        english_sub=(Button)findViewById(R.id.english_en_2);
        math_sub=(Button)findViewById(R.id.math_en_2);

        bangla_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubjectActivityEnglishClass_2.this, BanglaChapterClass2ActivityEnglish.class));
            }
        });
        english_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubjectActivityEnglishClass_2.this, EnglishChapterClass2ActivityEnglish.class));
            }
        });

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubjectActivityEnglishClass_2.this,  BookActivityEnglish.class));
            }
        });
    }
}