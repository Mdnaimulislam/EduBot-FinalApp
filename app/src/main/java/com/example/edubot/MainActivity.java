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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private EditText uemail;
    private EditText upass;
    private Button lgnbtn,regbtn;
    private FirebaseAuth mAuth;
    private ProgressBar progressBar;
    private TextView forgetpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser=mAuth.getCurrentUser();
        if(currentUser!=null){
            startActivity(new Intent(MainActivity.this,Choose_Language.class));
        }


        uemail=(EditText)findViewById(R.id.uemail);
        upass=(EditText)findViewById(R.id.l_upass);
        lgnbtn=(Button)findViewById(R.id.login_btn);
        regbtn=(Button)findViewById(R.id.r_btn);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        mAuth=FirebaseAuth.getInstance();
        forgetpass=(TextView)findViewById(R.id.forgetpass);

        forgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Forget_Password.class));
            }
        });

        lgnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userLogin();
            }
        });
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Register.class);
                startActivity(intent);
            }
        });

    }

    private void userLogin(){
        String email=uemail.getText().toString().trim();
        String password=upass.getText().toString().trim();

        if(email.isEmpty()){
            uemail.setError("Email is required!");
            uemail.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            uemail.setError("Please provide valid email!");
            uemail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            upass.setError("Password is required!");
            upass.requestFocus();
            return;
        }
        if (password.length()<6){
            upass.setError("Password should be atleast 6 characters!");
            upass.requestFocus();
            return;
        }
        progressBar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    FirebaseUser user =FirebaseAuth.getInstance().getCurrentUser();
                    if(user.isEmailVerified()){
                        progressBar.setVisibility(View.GONE);
                        startActivity(new Intent(MainActivity.this, Choose_Language.class));
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Check your email to verify account",Toast.LENGTH_LONG).show();
                        progressBar.setVisibility(View.GONE);
                    }

                }else {
                    Toast.makeText(MainActivity.this,"Check internet connection or email and password!",Toast.LENGTH_LONG).show();
                    progressBar.setVisibility(View.GONE);
                }
            }
        });
    }

}