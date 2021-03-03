package com.example.edubot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Forget_Password extends AppCompatActivity {
    private EditText email;
    private Button resetpass;
    private ProgressBar progressBar;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget__password);
        email=(EditText)findViewById(R.id.forgetpage_email);
        resetpass=(Button)findViewById(R.id.reset_pass);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);

        mAuth=FirebaseAuth.getInstance();
        resetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resetPassword();
            }
        });
    }
    private void resetPassword(){
        String r_email=email.getText().toString().trim();
        if(r_email.isEmpty()){
            email.setError("Email is required!");
            email.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(r_email).matches()){
            email.setError("Please provide valid email!");
            email.requestFocus();
            return;
        }
        progressBar.setVisibility(View.VISIBLE);
        mAuth.sendPasswordResetEmail(r_email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(Forget_Password.this,"Check your mail to reset password!",Toast.LENGTH_LONG).show();
                    progressBar.setVisibility(View.GONE);
                    startActivity(new Intent(Forget_Password.this,MainActivity.class));
                }
                else {
                    Toast.makeText(Forget_Password.this,"Try again! Something Wrong happened",Toast.LENGTH_LONG).show();
                    progressBar.setVisibility(View.GONE);
                }
            }
        });
    }
}