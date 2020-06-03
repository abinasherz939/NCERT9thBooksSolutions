package com.example.ncert9thenglishbookssolutions;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


import com.example.ncert9thenglishbookssolutions.books.Moments;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;

import com.google.android.gms.ads.InterstitialAd;


public class Solutions extends AppCompatActivity {

    private LinearLayout btnS1,btnS2,btnS3,btnS4,btnS5,btnS6,btnS7,btnS8,btnS9,btnS10, btnS11, btnS12, btnS13;
    private InterstitialAd interstitialAd1,interstitialAd2,interstitialAd3,interstitialAd4,interstitialAd5,interstitialAd6,interstitialAd7,interstitialAd8;
    private InterstitialAd interstitialAd9,interstitialAd10,interstitialAd11,interstitialAd12, interstitialAd13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solutions);

        btnS1 = (LinearLayout)findViewById(R.id.mathsol);
        btnS2 = (LinearLayout)findViewById(R.id.scisol);
        btnS3 = (LinearLayout)findViewById(R.id.fwfsol);
        btnS4 = (LinearLayout)findViewById(R.id.ffsol);
        btnS5 = (LinearLayout)findViewById(R.id.fitsol);
        btnS6 = (LinearLayout)findViewById(R.id.sssol);
        btnS7 = (LinearLayout)findViewById(R.id.krtsol);
        btnS8 = (LinearLayout)findViewById(R.id.chhitijsol);
        btnS9 = (LinearLayout)findViewById(R.id.hindisol);
        btnS10 = (LinearLayout)findViewById(R.id.manikasol);
        btnS11 = (LinearLayout)findViewById(R.id.strdlast);
        btnS12 = (LinearLayout)findViewById(R.id.sndlast);
        btnS13 = (LinearLayout)findViewById(R.id.slast);


        //Ads section

        interstitialAd1 = new InterstitialAd(this);
        interstitialAd1.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd1.loadAd(new AdRequest.Builder().build());
        interstitialAd1.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();
                                              Intent intent1 = new Intent(Solutions.this, SolMath.class);
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
                                              Intent intent1 = new Intent(Solutions.this, SolScience.class);
                                              startActivity(intent1);
                                              interstitialAd2.loadAd(new AdRequest.Builder().build());

                                          }
                                      }

        );
        interstitialAd3 = new InterstitialAd(this);
        interstitialAd3.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd3.loadAd(new AdRequest.Builder().build());
        interstitialAd3.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();
                                              Intent intent1 = new Intent(Solutions.this, SolSocialScience.class);
                                              startActivity(intent1);
                                              interstitialAd3.loadAd(new AdRequest.Builder().build());

                                          }
                                      }

        );
        interstitialAd4 = new InterstitialAd(this);
        interstitialAd4.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd4.loadAd(new AdRequest.Builder().build());
        interstitialAd4.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();
                                              Intent intent1 = new Intent(Solutions.this, SolHindi.class);
                                              startActivity(intent1);
                                              interstitialAd4.loadAd(new AdRequest.Builder().build());

                                          }
                                      }

        );
        interstitialAd5 = new InterstitialAd(this);
        interstitialAd5.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd5.loadAd(new AdRequest.Builder().build());
        interstitialAd5.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();
                                              Intent intent1 = new Intent(Solutions.this, SolKshitiz.class);
                                              startActivity(intent1);
                                              interstitialAd5.loadAd(new AdRequest.Builder().build());

                                          }
                                      }

        );
        interstitialAd6 = new InterstitialAd(this);
        interstitialAd6.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd6.loadAd(new AdRequest.Builder().build());
        interstitialAd6.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();
                                              Intent intent1 = new Intent(Solutions.this, SolKritika.class);
                                              startActivity(intent1);
                                              interstitialAd6.loadAd(new AdRequest.Builder().build());

                                          }
                                      }

        );
        interstitialAd7 = new InterstitialAd(this);
        interstitialAd7.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd7.loadAd(new AdRequest.Builder().build());
        interstitialAd7.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();
                                              Intent intent1 = new Intent(Solutions.this, SolMoments.class);
                                              startActivity(intent1);
                                              interstitialAd7.loadAd(new AdRequest.Builder().build());

                                          }
                                      }

        );
        interstitialAd8 = new InterstitialAd(this);
        interstitialAd8.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd8.loadAd(new AdRequest.Builder().build());
        interstitialAd8.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();
                                              Intent intent1 = new Intent(Solutions.this, SolBeehive.class);
                                              startActivity(intent1);
                                              interstitialAd8.loadAd(new AdRequest.Builder().build());

                                          }
                                      }

        );
        interstitialAd9= new InterstitialAd(this);
        interstitialAd9.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd9.loadAd(new AdRequest.Builder().build());
        interstitialAd9.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();
                                              Intent intent1 = new Intent(Solutions.this, LiteratureReader.class);
                                              startActivity(intent1);
                                              interstitialAd9.loadAd(new AdRequest.Builder().build());

                                          }
                                      }

        );
        interstitialAd10 = new InterstitialAd(this);
        interstitialAd10.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd10.loadAd(new AdRequest.Builder().build());
        interstitialAd10.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               super.onAdClosed();
                                               Intent intent1 = new Intent(Solutions.this, SolMainCourse.class);
                                               startActivity(intent1);
                                               interstitialAd10.loadAd(new AdRequest.Builder().build());

                                           }
                                       }

        );

        interstitialAd11 = new InterstitialAd(this);
        interstitialAd11.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd11.loadAd(new AdRequest.Builder().build());
        interstitialAd11.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();
                                              Intent intent1 = new Intent(Solutions.this, SolSprash.class);
                                              startActivity(intent1);
                                              interstitialAd11.loadAd(new AdRequest.Builder().build());

                                          }
                                      }

        );
        interstitialAd12= new InterstitialAd(this);
        interstitialAd12.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd12.loadAd(new AdRequest.Builder().build());
        interstitialAd12.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();
                                              Intent intent1 = new Intent(Solutions.this, SolSanskrit.class);
                                              startActivity(intent1);
                                              interstitialAd12.loadAd(new AdRequest.Builder().build());

                                          }
                                      }

        );
        interstitialAd13 = new InterstitialAd(this);
        interstitialAd13.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd13.loadAd(new AdRequest.Builder().build());
        interstitialAd13.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               super.onAdClosed();
                                               Intent intent1 = new Intent(Solutions.this, SolFoundationOIT.class);
                                               startActivity(intent1);
                                               interstitialAd13.loadAd(new AdRequest.Builder().build());

                                           }
                                       }

        );








        btnS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interstitialAd1.isLoaded()){
                    interstitialAd1.show();
                }
                else {

                    Intent intent1 = new Intent(Solutions.this,SolMath.class);
                    startActivity(intent1);
                }
            }
        });
        btnS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd2.isLoaded()){
                    interstitialAd2.show();
                }
                else {

                    Intent intent2 = new Intent(Solutions.this, SolScience.class);
                    startActivity(intent2);
                }
            }
        });
        btnS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd3.isLoaded()){
                    interstitialAd3.show();
                }
                else {

                    Intent intent1 = new Intent(Solutions.this, SolSocialScience.class);
                    startActivity(intent1);
                }
            }
        });
        btnS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd4.isLoaded()){
                    interstitialAd4.show();
                }
                else {

                    Intent intent1 = new Intent(Solutions.this, SolHindi.class);
                    startActivity(intent1);
                }
            }
        });
        btnS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interstitialAd5.isLoaded()){
                    interstitialAd5.show();
                }
                else {

                    Intent intent1 = new Intent(Solutions.this, SolKshitiz.class);
                    startActivity(intent1);
                }
            }
        });
        btnS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd6.isLoaded()){
                    interstitialAd6.show();
                }
                else {

                    Intent intent1 = new Intent(Solutions.this, SolKritika.class);
                    startActivity(intent1);
                }
            }
        });
        btnS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd7.isLoaded()){
                    interstitialAd7.show();
                }
                else {

                    Intent intent1 = new Intent(Solutions.this, Moments.class);
                    startActivity(intent1);
                }
            }
        });
        btnS8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interstitialAd8.isLoaded()){
                    interstitialAd8.show();
                }
                else {

                    Intent intent1 = new Intent(Solutions.this, SolBeehive.class);
                    startActivity(intent1);
                }
            }
        });
        btnS9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd9.isLoaded()){
                    interstitialAd9.show();
                }
                else {

                    Intent intent1 = new Intent(Solutions.this, LiteratureReader.class);
                    startActivity(intent1);
                }
            }
        });
        btnS10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd10.isLoaded()){
                    interstitialAd10.show();
                }
                else {

                    Intent intent1 = new Intent(Solutions.this, SolMainCourse.class);
                    startActivity(intent1);
                }
            }
        });
        btnS11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interstitialAd11.isLoaded()){
                    interstitialAd11.show();
                }
                else {

                    Intent intent1 = new Intent(Solutions.this, SolSprash.class);
                    startActivity(intent1);
                }
            }
        });
        btnS12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd12.isLoaded()){
                    interstitialAd12.show();
                }
                else {

                    Intent intent1 = new Intent(Solutions.this, SolSanskrit.class);
                    startActivity(intent1);
                }
            }
        });
        btnS13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd13.isLoaded()){
                    interstitialAd13.show();
                }
                else {

                    Intent intent1 = new Intent(Solutions.this, SolFoundationOIT.class);
                    startActivity(intent1);
                }
            }
        });

    }





}