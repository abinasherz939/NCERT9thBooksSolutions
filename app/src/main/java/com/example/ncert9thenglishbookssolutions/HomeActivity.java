package com.example.ncert9thenglishbookssolutions;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;



import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;

import com.google.android.gms.ads.InterstitialAd;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private InterstitialAd interstitialAd1,interstitialAd2;

    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);

        //Ads section

        interstitialAd1 = new InterstitialAd(this);
        interstitialAd1.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd1.loadAd(new AdRequest.Builder().build());
        interstitialAd1.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();
                                              Intent intent1 = new Intent(HomeActivity.this, Books.class);
                                              startActivity(intent1);
                                              interstitialAd1.loadAd(new AdRequest.Builder().build());

                                          }
                                      }

        );
        interstitialAd2 = new InterstitialAd(this);
        interstitialAd2.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd2.loadAd(new AdRequest.Builder().build());
        interstitialAd2.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();
                                              Intent intent1 = new Intent(HomeActivity.this, Solutions.class);
                                              startActivity(intent1);
                                              interstitialAd2.loadAd(new AdRequest.Builder().build());

                                          }
                                      }

        );

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interstitialAd1.isLoaded()){
                    interstitialAd1.show();
                }
                else {

                    Intent intent1 = new Intent(HomeActivity.this, Books.class);
                    startActivity(intent1);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd2.isLoaded()){
                    interstitialAd2.show();
                }
                else {

                    Intent intent2 = new Intent(HomeActivity.this, Solutions.class);
                    startActivity(intent2);
                }
            }
        });



    }
}