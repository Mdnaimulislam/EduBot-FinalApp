package com.example.edubot.bangla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.edubot.R;

public class SubjectActivityBanglaClass_2 extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_bangla_class_2);

        toolbar=(Toolbar)findViewById(R.id.toolbar_back);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubjectActivityBanglaClass_2.this, BookActivityBangla.class));
            }
        });
    }
}