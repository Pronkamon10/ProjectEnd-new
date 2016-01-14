package com.example.kimhuang.project;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class scene1_1 extends AppCompatActivity {
    ImageView jantawee1, janta1, yotsawimon1;
    ImageView word1, word2, word3;
    Button btn_back, btn_next;
    boolean flat = false;
    boolean flats = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scenc1_1);


        //Word
        word1 = (ImageView) findViewById(R.id.word1);
        word2 = (ImageView) findViewById(R.id.word2);
        word3 = (ImageView) findViewById(R.id.word3);


        //jantawee
        jantawee1 = (ImageView) findViewById(R.id.jantawee1);
        ((AnimationDrawable) jantawee1.getBackground()).start();
        jantawee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (flat == false) {
                        ((AnimationDrawable) jantawee1.getBackground()).stop();
                        flat = true;
                        //change image view
                        jantawee1.setBackgroundResource(R.drawable.jantawee1);
                        word1.setVisibility(View.VISIBLE);
                    } else {
                        flat = false;
                        jantawee1.setBackgroundResource(R.drawable.animate_jantawee1_1);
                        word1.setVisibility(View.INVISIBLE);
                        ((AnimationDrawable) jantawee1.getBackground()).start();
                    }

                } catch (Exception e) {
                }
            }
        });

        //yotsawimon
        yotsawimon1 = (ImageView) findViewById(R.id.yotsawimon1);
        ((AnimationDrawable) yotsawimon1.getBackground()).start();
        yotsawimon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (flat == flat) {
                        ((AnimationDrawable) yotsawimon1.getBackground()).stop();
                        flat = true;
                        //change image view
                        yotsawimon1.setBackgroundResource(R.drawable.yotsawimon1);
                        word2.setVisibility(View.VISIBLE);
                    } else {
                        flat = false;
                        yotsawimon1.setBackgroundResource(R.drawable.animate_yotsawimon1_1);
                        word2.setVisibility(View.INVISIBLE);
                        ((AnimationDrawable) yotsawimon1.getBackground()).start();
                    }
                } catch (Exception e) {
                }
            }
        });

        //janta
        janta1 = (ImageView) findViewById(R.id.janta1);
        ((AnimationDrawable) janta1.getBackground()).start();
        janta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (flats == false) {
                        ((AnimationDrawable) janta1.getBackground()).stop();
                        flats = true;
                        //change image view
                        janta1.setBackgroundResource(R.drawable.janta1);
                        word3.setVisibility(View.VISIBLE);
                    } else {
                        flats = false;
                        janta1.setBackgroundResource(R.drawable.animate_janta1_1);
                        word3.setVisibility(View.INVISIBLE);
                        ((AnimationDrawable) janta1.getBackground()).start();
                    }

                } catch (Exception e) {
                }
            }
        });

        //Button
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_next = (Button) findViewById(R.id.btn_next);
        final Intent i = new Intent(this, page1_2.class);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}

