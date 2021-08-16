
package com.example.edubot.english;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.edubot.MainActivity;
import com.example.edubot.R;
import com.example.edubot.bangla.BanglaActivityResponsive;
import com.example.edubot.bangla.BookActivityBangla;
import com.example.edubot.bangla.MathActivityBangla;
import com.example.edubot.bangla.ScanActivityBangla;
import com.example.edubot.bangla.SelfLearnBangla;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import de.hdodenhof.circleimageview.CircleImageView;

public class GuidlineActivity_English extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Button step_1;
    private Button step_2;
    private Button step_3;
    private Button step_4;
    private Button step_5;
    private Button step_6;
    private Button step_7;
    private Button step_8;
    private Button step_9;
    private Button step_10;
    private Button step_11;
    private Button step_12;
    private Button step_13;
    private Button step_14;
    private Button step_15;
    private Button step_16;
    private Button step_17;

    private ImageView step1image;
    private ImageView step2image;
    private ImageView step3image;
    private ImageView step4image;
    private ImageView step5image;
    private ImageView step6image;
    private ImageView step7image;
    private ImageView step8image;
    private ImageView step9image;
    private ImageView step10image;
    private ImageView step11image;
    private ImageView step12image;
    private ImageView step13image;
    private ImageView step14image;
    private ImageView step15image;
    private ImageView step16image;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidline_english);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Guidline");
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



        step1image=(ImageView)findViewById(R.id.step_1_img);
        step2image=(ImageView)findViewById(R.id.step_2_img);
        step3image=(ImageView)findViewById(R.id.step_3_img);
        step4image=(ImageView)findViewById(R.id.step_4_img);
        step5image=(ImageView)findViewById(R.id.step_5_img);
        step6image=(ImageView)findViewById(R.id.step_6_img);
        step7image=(ImageView)findViewById(R.id.step_7_img);
        step8image=(ImageView)findViewById(R.id.step_8_img);
        step9image=(ImageView)findViewById(R.id.step_9_img);
        step10image=(ImageView)findViewById(R.id.step_10_img);
        step11image=(ImageView)findViewById(R.id.step_11_img);
        step12image=(ImageView)findViewById(R.id.step_12_img);
        step13image=(ImageView)findViewById(R.id.step_13_img);
        step14image=(ImageView)findViewById(R.id.step_14_img);
        step15image=(ImageView)findViewById(R.id.step_15_img);
        step16image=(ImageView)findViewById(R.id.step_16_img);


        step_1=(Button)findViewById(R.id.step_1);
        step_2=(Button)findViewById(R.id.step_2);
        step_3=(Button)findViewById(R.id.step_3);
        step_4=(Button)findViewById(R.id.step_4);
        step_5=(Button)findViewById(R.id.step_5);
        step_6=(Button)findViewById(R.id.step_6);
        step_7=(Button)findViewById(R.id.step_7);
        step_8=(Button)findViewById(R.id.step_8);
        step_9=(Button)findViewById(R.id.step_9);
        step_10=(Button)findViewById(R.id.step_10);
        step_11=(Button)findViewById(R.id.step_11);
        step_12=(Button)findViewById(R.id.step_12);
        step_13=(Button)findViewById(R.id.step_13);
        step_14=(Button)findViewById(R.id.step_14);
        step_15=(Button)findViewById(R.id.step_15);
        step_16=(Button)findViewById(R.id.step_16);
        step_17=(Button)findViewById(R.id.step_17);



        step_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step_1.setVisibility(View.GONE);
                step_2.setVisibility(View.VISIBLE);
                step1image.setVisibility(View.VISIBLE);
            }
        });

        step_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step1image.setVisibility(View.GONE);
                step_2.setVisibility(View.GONE);
                step_3.setVisibility(View.VISIBLE);
                step2image.setVisibility(View.VISIBLE);
            }
        });
        step_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step2image.setVisibility(View.GONE);
                step_3.setVisibility(View.GONE);
                step_4.setVisibility(View.VISIBLE);
                step3image.setVisibility(View.VISIBLE);
            }
        });
        step_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step3image.setVisibility(View.GONE);
                step_4.setVisibility(View.GONE);
                step_5.setVisibility(View.VISIBLE);
                step4image.setVisibility(View.VISIBLE);
            }
        });
        step_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step4image.setVisibility(View.GONE);
                step_5.setVisibility(View.GONE);
                step_6.setVisibility(View.VISIBLE);
                step5image.setVisibility(View.VISIBLE);
            }
        });
        step_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step5image.setVisibility(View.GONE);
                step_6.setVisibility(View.GONE);
                step_7.setVisibility(View.VISIBLE);
                step6image.setVisibility(View.VISIBLE);
            }
        });
        step_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step6image.setVisibility(View.GONE);
                step_7.setVisibility(View.GONE);
                step_8.setVisibility(View.VISIBLE);
                step7image.setVisibility(View.VISIBLE);
            }
        });
        step_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step7image.setVisibility(View.GONE);
                step_8.setVisibility(View.GONE);
                step_9.setVisibility(View.VISIBLE);
                step8image.setVisibility(View.VISIBLE);
            }
        });
        step_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step8image.setVisibility(View.GONE);
                step_9.setVisibility(View.GONE);
                step_10.setVisibility(View.VISIBLE);
                step9image.setVisibility(View.VISIBLE);
            }
        });
        step_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step9image.setVisibility(View.GONE);
                step_10.setVisibility(View.GONE);
                step_11.setVisibility(View.VISIBLE);
                step10image.setVisibility(View.VISIBLE);
            }
        });
        step_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step10image.setVisibility(View.GONE);
                step_11.setVisibility(View.GONE);
                step_12.setVisibility(View.VISIBLE);
                step11image.setVisibility(View.VISIBLE);
            }
        });
        step_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step11image.setVisibility(View.GONE);
                step_12.setVisibility(View.GONE);
                step_13.setVisibility(View.VISIBLE);
                step12image.setVisibility(View.VISIBLE);
            }
        });
        step_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step12image.setVisibility(View.GONE);
                step_13.setVisibility(View.GONE);
                step_14.setVisibility(View.VISIBLE);
                step13image.setVisibility(View.VISIBLE);
            }
        });
        step_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step13image.setVisibility(View.GONE);
                step_14.setVisibility(View.GONE);
                step_15.setVisibility(View.VISIBLE);
                step14image.setVisibility(View.VISIBLE);
            }
        });
        step_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step14image.setVisibility(View.GONE);
                step_15.setVisibility(View.GONE);
                step_16.setVisibility(View.VISIBLE);
                step15image.setVisibility(View.VISIBLE);
            }
        });
        step_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step15image.setVisibility(View.GONE);
                step_16.setVisibility(View.GONE);
                step_17.setVisibility(View.VISIBLE);
                step16image.setVisibility(View.VISIBLE);
            }
        });
        step_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                step16image.setVisibility(View.GONE);
                step_17.setVisibility(View.GONE);
                step_1.setVisibility(View.VISIBLE);
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

        if(id==R.id.nav_english_home){
            startActivity(new Intent(this, EnglishActivityResponsive.class));
        }
        else if(id==R.id.nav_english_book){
            startActivity(new Intent(this, BookActivityEnglish.class));

        }
        else if(id==R.id.nav_english_learn){
            startActivity(new Intent(this, SelfLearnEnglish.class));
        }
        else if(id==R.id.nav_english_scan){
            startActivity(new Intent(this, ScanActivityEnglish.class));
        }
        else if(id==R.id.nav_english_calculator){
            startActivity(new Intent(this, MathActivityEnglish.class));
        }
        else if(id==R.id.nav_english_tutorial){

        }
        else if(id==R.id.nav_english_website){
            startActivity(new Intent(this, WebActivity_English.class));
        }
        else if(id==R.id.nav_english_help){
            startActivity(new Intent(this, HelpActivity_English.class));
        }
        else if(id==R.id.nav_bangla_language){
            startActivity(new Intent(this, BanglaActivityResponsive.class));
        }
        else if(id==R.id.nav_english_logout){
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(this, MainActivity.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}