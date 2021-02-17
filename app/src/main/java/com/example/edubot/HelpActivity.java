package com.example.edubot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.edubot.bangla.BanglaActivity;
import com.example.edubot.bangla.BookActivityBangla;
import com.example.edubot.bangla.MathActivityBangla;
import com.example.edubot.bangla.ScanActivityBangla;
import com.example.edubot.bangla.WebBanglaActivity;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import de.hdodenhof.circleimageview.CircleImageView;

public class HelpActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private FirebaseAuth mAuth;
    private EditText problem_subject;
    private EditText problem_msg;
    private Button send_email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("হেল্প");
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        View headerView = navigationView.getHeaderView(0);
        TextView userNameTextView = headerView.findViewById(R.id.user_profile_name);
        CircleImageView profileImageView = headerView.findViewById(R.id.profile_image);


        problem_subject=(EditText)findViewById(R.id.email_subject);
        problem_msg=(EditText)findViewById(R.id.email_message);
        send_email=(Button)findViewById(R.id.send_btn);

        send_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getInformation();
            }
        });

    }

    public void getInformation(){
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser=mAuth.getCurrentUser();
        final String[] getphone = new String[1];


        String email=currentUser.getEmail();
        String Uid=currentUser.getUid();

        DatabaseReference phone = FirebaseDatabase.getInstance().getReference().child("Users").child(Uid).child("phone");
        phone.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String subject=problem_subject.getText().toString().trim()+"\n"+email+"\n"+ snapshot.getValue();
                String message=problem_msg.getText().toString().trim();
                if(subject.isEmpty()){
                    problem_subject.setError("Email is required!");
                    problem_subject.requestFocus();
                    return;
                }
                if(message.isEmpty()){
                    problem_msg.setError("Email is required!");
                    problem_msg.requestFocus();
                    return;
                }

                Intent intent =new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.setPackage("com.google.android.gm");
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"robotechvalley@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,message);
                startActivity(intent);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if(id==R.id.nav_bangla_home){
            startActivity(new Intent(this, BanglaActivity.class));
        }
        else if(id==R.id.nav_bangla_book){
            startActivity(new Intent(this, BookActivityBangla.class));

        }
        else if(id==R.id.nav_bangla_learn){
        }
        else if(id==R.id.nav_bangla_scan){
            startActivity(new Intent(this, ScanActivityBangla.class));
        }
        else if(id==R.id.nav_bangla_calculator){
            startActivity(new Intent(this, MathActivityBangla.class));
        }
        else if(id==R.id.nav_bangla_tutorial){

        }
        else if(id==R.id.nav_bangla_website){
            startActivity(new Intent(this, WebBanglaActivity.class));
        }
        else if(id==R.id.nav_bangla_help){
        }
        else if(id==R.id.nav_bangla_logout){
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(this, MainActivity.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}