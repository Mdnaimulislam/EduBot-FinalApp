package com.example.edubot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.edubot.bangla.BanglaActivity;
import com.example.edubot.english.EnglishMain;
import com.google.firebase.auth.FirebaseAuth;

public class Choose_Language extends AppCompatActivity {
    private Button logout_btn;
    private Button bangla_btn;
    private Button english_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose__language);

        english_btn=(Button)findViewById(R.id.english_btn);
        bangla_btn=(Button)findViewById(R.id.bangla_btn);

        english_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Choose_Language.this, EnglishMain.class));
            }
        });

        bangla_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Choose_Language.this, BanglaActivity.class));
            }
        });

    }
}