package com.example.ncert9thenglishbookssolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 3000;

    Animation topAnim, topAnim2, bottomAnim;
    TextView title1,title2 , slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        topAnim2= AnimationUtils.loadAnimation(this,R.anim.top_animation2);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);


        title1 = findViewById(R.id.textView1);
        title2 = findViewById(R.id.textView2);
        slogan = findViewById(R.id.textView3);


        title1.setAnimation(topAnim);
        title2.setAnimation(topAnim2);
        slogan.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent (MainActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();

            }
        }, SPLASH_SCREEN);

    }
}