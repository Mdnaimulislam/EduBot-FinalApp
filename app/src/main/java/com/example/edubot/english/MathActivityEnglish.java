package com.example.edubot.english;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.edubot.MainActivity;
import com.example.edubot.R;
import com.example.edubot.bangla.BanglaActivityResponsive;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.ml.vision.FirebaseVision;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.text.FirebaseVisionText;
import com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer;
import com.theartofdev.edmodo.cropper.CropImage;

import java.io.IOException;
import java.util.Locale;

import de.hdodenhof.circleimageview.CircleImageView;

public class MathActivityEnglish extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,TextToSpeech.OnInitListener {
    private ImageView imageView;
    private TextView textView;
    private String s;
    private Uri mImageuri;
    private TextToSpeech tts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_english);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Image Calculator");
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
        tts = new TextToSpeech(this, this);
        tts.setLanguage(Locale.forLanguageTag("en-US"));
        tts.setPitch(1.2f);
        tts.setSpeechRate(1f);


        textView = findViewById(R.id.textId);

        //check app level permission is granted for Camera
        if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            //grant the permission
            requestPermissions(new String[]{Manifest.permission.CAMERA}, 101);
        }
    }
    public void doProcess(View view) {
        //open the camera => create an Intent object
        CropImage.activity().start(MathActivityEnglish.this);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        imageView = findViewById(R.id.imageId);
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE){
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if(resultCode==RESULT_OK){
                mImageuri=result.getUri();
                imageView.setImageURI(mImageuri);
                //process the image
                //1. create a FirebaseVisionImage object from a Bitmap object
                FirebaseVisionImage firebaseVisionImage = null;
                try {
                    firebaseVisionImage = FirebaseVisionImage.fromFilePath(MathActivityEnglish.this,mImageuri);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //2. Get an instance of FirebaseVision
                FirebaseVision firebaseVision = FirebaseVision.getInstance();
                //3. Create an instance of FirebaseVisionTextRecognizer
                FirebaseVisionTextRecognizer firebaseVisionTextRecognizer = firebaseVision.getOnDeviceTextRecognizer();
                //4. Create a task to process the image
                Task<FirebaseVisionText> task = firebaseVisionTextRecognizer.processImage(firebaseVisionImage);
                //5. if task is success
                task.addOnSuccessListener(new OnSuccessListener<FirebaseVisionText>() {
                    @Override
                    public void onSuccess(FirebaseVisionText firebaseVisionText) {
                        s = firebaseVisionText.getText();
                        textView.setText(s);
                        System.out.println(s);

                        if(s.contains("+")||s.contains("-")||s.contains("x")||s.contains("/")||s.contains("*")||s.contains("sin")||s.contains("cos")||s.contains("tan")) {
                            s =String.valueOf(eval(s));
                            System.out.println(s);
                            textView.setText(s);
                            tts.speak(s,TextToSpeech.QUEUE_FLUSH,null);
                        }
                        else {
                            tts.speak("Sorry!This math is beyond my capability right now.",TextToSpeech.QUEUE_FLUSH,null);
                        }

                    }
                });
                //6. if task is failure
                task.addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
            }
            else if(resultCode==CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE){
                Exception e =result.getError();
                Toast.makeText(this, "Possiable error is: "+e, Toast.LENGTH_SHORT).show();
            }

        }
    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')||eat('x')||eat('X')) x *= parseFactor(); // multiplication
                    else if (eat('/')||eat('÷')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")||func.equals("V")||func.equals("√")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));

                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
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

        }
        else if(id==R.id.nav_english_tutorial){
            startActivity(new Intent(this, GuidlineActivity_English.class));
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

    @Override
    public void onInit(int i) {

    }
}