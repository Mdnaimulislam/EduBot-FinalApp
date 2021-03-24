package com.example.edubot.bangla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.edubot.R;

public class SubjectActivityBanglaClass_5 extends AppCompatActivity {
    private Toolbar toolbar;
    private Button bangla_sub;
    private Button english_sub;
    private Button math_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_bangla_class_5);

        toolbar=(Toolbar)findViewById(R.id.toolbar_back);
        bangla_sub=(Button)findViewById(R.id.bangla_bn_5);
        english_sub=(Button)findViewById(R.id.english_bn_5);
        math_sub=(Button)findViewById(R.id.math_bn_5);

        bangla_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubjectActivityBanglaClass_5.this,BanglaChapterClass5ActivityBangla.class));
            }
        });
        english_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubjectActivityBanglaClass_5.this,EnglishChapterClass5ActivityBangla.class));
            }
        });

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubjectActivityBanglaClass_5.this, BookActivityBangla.class));
            }
        });
    }
}