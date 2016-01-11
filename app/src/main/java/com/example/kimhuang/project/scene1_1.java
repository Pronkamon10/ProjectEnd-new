package com.example.kimhuang.project;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

public class scene1_1 extends AppCompatActivity {
    ImageView jantawee1, janta1, yotsawimon1;
    ImageView word1, word2, word3;
    Button btn_back, btn_next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scenc1_1);


        //Word
        word1 = (ImageView) findViewById(R.id.word1);
//       word2 = (ImageView) findViewById(R.id.word2);
        word3 = (ImageView) findViewById(R.id.word3);


        //jantawee
        jantawee1 = (ImageView) findViewById(R.id.jantawee1);
        ((AnimationDrawable) jantawee1.getBackground()).start();
        jantawee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ((AnimationDrawable) jantawee1.getBackground()).stop();
                    //change image view
                    jantawee1.setBackgroundResource(R.drawable.jantawee1);
                    word1.setVisibility(View.VISIBLE);
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
                    ((AnimationDrawable) yotsawimon1.getBackground()).stop();
                    //change image view
                    yotsawimon1.setBackgroundResource(R.drawable.yotsawimon1);
                } catch (Exception e) {
                }
            }
        });

        //janta
        janta1= (ImageView) findViewById(R.id.janta1);
        ((AnimationDrawable)janta1.getBackground()).start();
        janta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ((AnimationDrawable) janta1.getBackground()).stop();
                    //change image view
                    janta1.setBackgroundResource(R.drawable.janta1);
                    word3.setVisibility(View.VISIBLE);
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
        final Intent i = new Intent(this, scene1_1.class);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}

