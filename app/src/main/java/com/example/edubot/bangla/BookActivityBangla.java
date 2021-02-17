package com.example.edubot.bangla;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.edubot.HelpActivity;
import com.example.edubot.MainActivity;
import com.example.edubot.R;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import de.hdodenhof.circleimageview.CircleImageView;

public class BookActivityBangla extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Button class1;
    private Button class2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_bangla);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("বই");
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

        class1=(Button)findViewById(R.id.class_1);
        class2=(Button)findViewById(R.id.class_2);

        class1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BookActivityBangla.this,SubjectActivityBanglaClass_1.class));
            }
        });
        class2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BookActivityBangla.this,SubjectActivityBanglaClass_2.class));
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
            startActivity(new Intent(this,BanglaActivity.class));
        }
        else if(id==R.id.nav_bangla_book){

        }
        else if(id==R.id.nav_bangla_learn){
            startActivity(new Intent(this,SelfLearnBangla.class));
        }
        else if(id==R.id.nav_bangla_scan){
            startActivity(new Intent(this, ScanActivityBangla.class));
        }
        else if(id==R.id.nav_bangla_calculator){
            startActivity(new Intent(this,MathActivityBangla.class));
        }
        else if(id==R.id.nav_bangla_tutorial){

        }
        else if(id==R.id.nav_bangla_website){
            startActivity(new Intent(this,WebBanglaActivity.class));
        }
        else if(id==R.id.nav_bangla_help){
            startActivity(new Intent(this, HelpActivity.class));
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