package com.example.edubot.english;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.edubot.R;
import com.example.edubot.bangla.BanglaChapterClass5ActivityBangla;


public class SubjectActivityEnglishClass_5 extends AppCompatActivity {
    private Toolbar toolbar;
    private Button bangla_sub;
    private Button english_sub;
    private Button math_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_english_class_5);
        toolbar=(Toolbar)findViewById(R.id.toolbar_back);
        bangla_sub=(Button)findViewById(R.id.bangla_en_5);
        english_sub=(Button)findViewById(R.id.english_en_5);
        math_sub=(Button)findViewById(R.id.math_en_5);

        bangla_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubjectActivityEnglishClass_5.this, BanglaChapterClass5ActivityBangla.class));
            }
        });

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubjectActivityEnglishClass_5.this,  BookActivityEnglish.class));
            }
        });
    }
}