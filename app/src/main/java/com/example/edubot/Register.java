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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText fullName;
    private EditText upass;
    private EditText uemail;
    private EditText uphone;
    private EditText uaddress;
    private Button regbtn;
    private Button lgnbtn;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();

        fullName=(EditText)findViewById(R.id.name);
        upass=(EditText)findViewById(R.id.u_pass);
        uemail=(EditText)findViewById(R.id.u_email);
        uphone=(EditText)findViewById(R.id.u_phone);
        uaddress=(EditText)findViewById(R.id.u_address);
        regbtn=(Button)findViewById(R.id.registerbtn);
        lgnbtn=(Button)findViewById(R.id.gt_lgn_btn);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);


        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser();
            }
        });
        lgnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register.this,MainActivity.class));
            }
        });

    }
    private void registerUser(){
        String full_name=fullName.getText().toString().trim();
        String user_pass=upass.getText().toString().trim();
        String user_email=uemail.getText().toString().trim();
        String user_phone=uphone.getText().toString().trim();
        String user_address=uaddress.getText().toString().trim();

        if(full_name.isEmpty()){
            fullName.setError("Name is requried!");
            fullName.requestFocus();
            return;
        }
        if(user_pass.isEmpty()){
            upass.setError("User Password is requried!");
            upass.requestFocus();
            return;
        }
        if (user_pass.length()<6){
            upass.setError("Password should be atleast 6 characters!");
            upass.requestFocus();
            return;
        }
        if(user_email.isEmpty()){
            uemail.setError("User Email is requried!");
            uemail.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(user_email).matches()){
            uemail.setError("Please provide valid email!");
            uemail.requestFocus();
            return;
        }
        if(user_phone.isEmpty()){
            uphone.setError("User phone number is requried!");
            uphone.requestFocus();
            return;
        }
        if(user_address.isEmpty()){
            uaddress.setError("User address is requried!");
            uaddress.requestFocus();
            return;
        }


        progressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(user_email,user_pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    FirebaseUser currentUser =FirebaseAuth.getInstance().getCurrentUser();
                    User user=new User(full_name,user_email,user_phone,user_address);

                    FirebaseDatabase.getInstance().getReference("Users").child(currentUser.getUid())
                            .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("Self Questions").child("তুমি কি খাও").setValue("আমি কিছু খাই না।আমি ব্যাটারি চালিত।");
                                Toast.makeText(Register.this,"User has been registered successfully! Check Email for Verfication",Toast.LENGTH_LONG).show();
                                progressBar.setVisibility(View.GONE);
                                currentUser.sendEmailVerification();

                                startActivity(new Intent(Register.this, MainActivity.class));
                            }
                            else {
                                Toast.makeText(Register.this,"Failed to register! Try again!",Toast.LENGTH_LONG).show();
                                progressBar.setVisibility(View.GONE);
                            }
                        }
                    });
                }
                else{
                    Toast.makeText(Register.this,"Already have a account with this email address!",Toast.LENGTH_LONG).show();
                    progressBar.setVisibility(View.GONE);
                }
            }
        });

    }
}