package com.example.edubot.bangla;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.edubot.MainActivity;
import com.example.edubot.R;
import com.example.edubot.english.BookActivityEnglish;
import com.example.edubot.english.EnglishActivityResponsive;
import com.example.edubot.english.MathActivityEnglish;
import com.example.edubot.english.ScanActivityEnglish;
import com.example.edubot.english.SelfLearnEnglish;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import de.hdodenhof.circleimageview.CircleImageView;

public class WebActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private WebView webviewbangla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webviewbangla=(WebView)findViewById(R.id.banglawebView);
        webviewbangla.setWebViewClient(new WebViewClient());
        webviewbangla.getSettings().setJavaScriptEnabled(true);
        webviewbangla.getSettings().setDomStorageEnabled(true);
        webviewbangla.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webviewbangla.loadUrl("https://store.robotechvalley.com");


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("RoboTech Valley");
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
            startActivity(new Intent(this, BanglaActivityResponsive.class));
        }
        else if(id==R.id.nav_bangla_book){
            startActivity(new Intent(this, BookActivityBangla.class));

        }
        else if(id==R.id.nav_bangla_learn){
            startActivity(new Intent(this, SelfLearnBangla.class));
        }
        else if(id==R.id.nav_bangla_scan){
            startActivity(new Intent(this, ScanActivityBangla.class));
        }
        else if(id==R.id.nav_bangla_calculator){
            startActivity(new Intent(this, MathActivityBangla.class));
        }
        else if(id==R.id.nav_bangla_tutorial){
            startActivity(new Intent(this, GuidlineActivity.class));
        }
        else if(id==R.id.nav_bangla_website){

        }
        else if(id==R.id.nav_bangla_help){
            startActivity(new Intent(this, GuidlineActivity.class));
        }
        else if(id==R.id.nav_english_language){
            startActivity(new Intent(this, EnglishActivityResponsive.class));
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