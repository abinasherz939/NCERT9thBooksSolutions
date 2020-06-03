package com.example.ncert9thenglishbookssolutions;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


import com.example.ncert9thenglishbookssolutions.books.AbhyasanBhavah;
import com.example.ncert9thenglishbookssolutions.books.BeehiveEnglish;
import com.example.ncert9thenglishbookssolutions.books.ContemproaryIndia;
import com.example.ncert9thenglishbookssolutions.books.DemocreticPoltics;
import com.example.ncert9thenglishbookssolutions.books.Economics;
import com.example.ncert9thenglishbookssolutions.books.HelthAndPhysicalEducation;
import com.example.ncert9thenglishbookssolutions.books.IndiaAndContempraryWorld1;
import com.example.ncert9thenglishbookssolutions.books.Khitiz;
import com.example.ncert9thenglishbookssolutions.books.Kritika;
import com.example.ncert9thenglishbookssolutions.books.Math;
import com.example.ncert9thenglishbookssolutions.books.MathLabManual;
import com.example.ncert9thenglishbookssolutions.books.Moments;
import com.example.ncert9thenglishbookssolutions.books.Sanchyan;
import com.example.ncert9thenglishbookssolutions.books.Science;
import com.example.ncert9thenglishbookssolutions.books.ScienceLabManual;
import com.example.ncert9thenglishbookssolutions.books.ShesumiPrathamoBhagh;
import com.example.ncert9thenglishbookssolutions.books.Sprash;
import com.example.ncert9thenglishbookssolutions.books.WordsAndExpressions;
import com.example.ncert9thenglishbookssolutions.books.WyakaranWithi;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;

import com.google.android.gms.ads.InterstitialAd;


public class Books extends AppCompatActivity {

    private LinearLayout btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16, btn17, btn18, btn19;
    private InterstitialAd interstitialAd1,interstitialAd2,interstitialAd3,interstitialAd4,interstitialAd5,interstitialAd6,interstitialAd7,interstitialAd8;
    private InterstitialAd interstitialAd9,interstitialAd10,interstitialAd11,interstitialAd12,interstitialAd13,interstitialAd14,interstitialAd15,interstitialAd16, interstitialAd17,interstitialAd18,interstitialAd19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        btn1 = (LinearLayout)findViewById(R.id.math);
        btn2 = (LinearLayout)findViewById(R.id.sci);
        btn3 = (LinearLayout)findViewById(R.id.contem);
        btn4 = (LinearLayout)findViewById(R.id.ued);
        btn5 = (LinearLayout)findViewById(R.id.icw);
        btn6 = (LinearLayout)findViewById(R.id.dp);
        btn7 = (LinearLayout)findViewById(R.id.fwf);
        btn8 = (LinearLayout)findViewById(R.id.ff);
        btn9 = (LinearLayout)findViewById(R.id.slm);
        btn10 = (LinearLayout)findViewById(R.id.mlm);
        btn11= (LinearLayout)findViewById(R.id.krt);
        btn12= (LinearLayout)findViewById(R.id.chhitij);
        btn13= (LinearLayout)findViewById(R.id.san);
        btn14= (LinearLayout)findViewById(R.id.sparsh);
        btn15= (LinearLayout)findViewById(R.id.gram);
        btn16= (LinearLayout)findViewById(R.id.shem);
        btn17= (LinearLayout)findViewById(R.id.trdlast);
        btn18= (LinearLayout)findViewById(R.id.ndlast);
        btn19= (LinearLayout)findViewById(R.id.last);


        //Ads section

        interstitialAd1 = new InterstitialAd(this);
        interstitialAd1.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd1.loadAd(new AdRequest.Builder().build());
        interstitialAd1.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();
                                              Intent intent1 = new Intent(Books.this, Math.class);
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
                                              Intent intent1 = new Intent(Books.this, Science.class);
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
                                              Intent intent1 = new Intent(Books.this, Economics.class);
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
                                              Intent intent1 = new Intent(Books.this, ContemproaryIndia.class);
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
                                              Intent intent1 = new Intent(Books.this, DemocreticPoltics.class);
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
                                              Intent intent1 = new Intent(Books.this, IndiaAndContempraryWorld1.class);
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
                                              Intent intent1 = new Intent(Books.this, BeehiveEnglish.class);
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
                                              Intent intent1 = new Intent(Books.this, Moments.class);
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
                                              Intent intent1 = new Intent(Books.this, WordsAndExpressions.class);
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
                                               Intent intent1 = new Intent(Books.this, HelthAndPhysicalEducation.class);
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
                                               Intent intent1 = new Intent(Books.this, ScienceLabManual.class);
                                               startActivity(intent1);
                                               interstitialAd11.loadAd(new AdRequest.Builder().build());

                                           }
                                       }

        );
        interstitialAd12 = new InterstitialAd(this);
        interstitialAd12.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd12.loadAd(new AdRequest.Builder().build());
        interstitialAd12.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               super.onAdClosed();
                                               Intent intent1 = new Intent(Books.this, MathLabManual.class);
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
                                               Intent intent1 = new Intent(Books.this, Kritika.class);
                                               startActivity(intent1);
                                               interstitialAd13.loadAd(new AdRequest.Builder().build());

                                           }
                                       }

        );
        interstitialAd14 = new InterstitialAd(this);
        interstitialAd14.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd14.loadAd(new AdRequest.Builder().build());
        interstitialAd14.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               super.onAdClosed();
                                               Intent intent1 = new Intent(Books.this, Khitiz.class);
                                               startActivity(intent1);
                                               interstitialAd14.loadAd(new AdRequest.Builder().build());

                                           }
                                       }

        );
        interstitialAd15 = new InterstitialAd(this);
        interstitialAd15.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd15.loadAd(new AdRequest.Builder().build());
        interstitialAd15.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               super.onAdClosed();
                                               Intent intent1 = new Intent(Books.this, Sanchyan.class);
                                               startActivity(intent1);
                                               interstitialAd15.loadAd(new AdRequest.Builder().build());

                                           }
                                       }

        );
        interstitialAd16 = new InterstitialAd(this);
        interstitialAd16.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd16.loadAd(new AdRequest.Builder().build());
        interstitialAd16.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               super.onAdClosed();
                                               Intent intent1 = new Intent(Books.this, Sprash.class);
                                               startActivity(intent1);
                                               interstitialAd16.loadAd(new AdRequest.Builder().build());

                                           }
                                       }

        );

        interstitialAd19 = new InterstitialAd(this);
        interstitialAd19.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd19.loadAd(new AdRequest.Builder().build());
        interstitialAd19.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               super.onAdClosed();
                                               Intent intent1 = new Intent(Books.this, ShesumiPrathamoBhagh.class);
                                               startActivity(intent1);
                                               interstitialAd19.loadAd(new AdRequest.Builder().build());

                                           }
                                       }

        );
        interstitialAd17 = new InterstitialAd(this);
        interstitialAd17.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd17.loadAd(new AdRequest.Builder().build());
        interstitialAd17.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               super.onAdClosed();
                                               Intent intent1 = new Intent(Books.this, AbhyasanBhavah.class);
                                               startActivity(intent1);
                                               interstitialAd17.loadAd(new AdRequest.Builder().build());

                                           }
                                       }

        );
        interstitialAd18 = new InterstitialAd(this);
        interstitialAd18.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd18.loadAd(new AdRequest.Builder().build());
        interstitialAd18.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               super.onAdClosed();
                                               Intent intent1 = new Intent(Books.this, WyakaranWithi.class);
                                               startActivity(intent1);
                                               interstitialAd18.loadAd(new AdRequest.Builder().build());

                                           }
                                       }

        );









        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interstitialAd1.isLoaded()){
                    interstitialAd1.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, Math.class);
                    startActivity(intent1);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd2.isLoaded()){
                    interstitialAd2.show();
                }
                else {

                    Intent intent2 = new Intent(Books.this, Science.class);
                    startActivity(intent2);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd3.isLoaded()){
                    interstitialAd3.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, Economics.class);
                    startActivity(intent1);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd4.isLoaded()){
                    interstitialAd4.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, ContemproaryIndia.class);
                    startActivity(intent1);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interstitialAd5.isLoaded()){
                    interstitialAd5.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, DemocreticPoltics.class);
                    startActivity(intent1);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd6.isLoaded()){
                    interstitialAd6.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, IndiaAndContempraryWorld1.class);
                    startActivity(intent1);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd7.isLoaded()){
                    interstitialAd7.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, BeehiveEnglish.class);
                    startActivity(intent1);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interstitialAd8.isLoaded()){
                    interstitialAd8.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, Moments.class);
                    startActivity(intent1);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd9.isLoaded()){
                    interstitialAd9.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, WordsAndExpressions.class);
                    startActivity(intent1);
                }
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd10.isLoaded()){
                    interstitialAd10.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, HelthAndPhysicalEducation.class);
                    startActivity(intent1);
                }
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd11.isLoaded()){
                    interstitialAd11.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, ScienceLabManual.class);
                    startActivity(intent1);
                }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interstitialAd12.isLoaded()){
                    interstitialAd12.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, MathLabManual.class);
                    startActivity(intent1);
                }
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd13.isLoaded()){
                    interstitialAd13.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, Kritika.class);
                    startActivity(intent1);
                }
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd14.isLoaded()){
                    interstitialAd14.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, Khitiz.class);
                    startActivity(intent1);
                }
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd15.isLoaded()){
                    interstitialAd15.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, Sanchyan.class);
                    startActivity(intent1);
                }
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd15.isLoaded()){
                    interstitialAd15.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, Sprash.class);
                    startActivity(intent1);
                }
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd17.isLoaded()){
                    interstitialAd17.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, AbhyasanBhavah.class);
                    startActivity(intent1);
                }
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd18.isLoaded()){
                    interstitialAd18.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, WyakaranWithi.class);
                    startActivity(intent1);
                }
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(interstitialAd19.isLoaded()){
                    interstitialAd19.show();
                }
                else {

                    Intent intent1 = new Intent(Books.this, ShesumiPrathamoBhagh.class);
                    startActivity(intent1);
                }
            }
        });







    }





}