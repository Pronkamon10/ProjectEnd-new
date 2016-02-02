package com.example.kimhuang.project;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class map1 extends AppCompatActivity {
    ImageView palaces, house, trees, sea;
    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map1);

        //palaces
        palaces = (ImageView)findViewById(R.id.palaces);
        ((AnimationDrawable)palaces.getBackground()).start();
        final Intent i = new Intent(this, page1_1.class);
        palaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });

        //house
        house = (ImageView)findViewById(R.id.house);
        ((AnimationDrawable)house.getBackground()).start();
        final Intent c = new Intent(this, page1_3.class);
        house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(c);
            }
        });

        //trees
        trees = (ImageView)findViewById(R.id.trees);
        ((AnimationDrawable)trees.getBackground()).start();
        final Intent a = new Intent(this,page1_2.class);
        trees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(a);
            }
        });

        //sea
        sea = (ImageView)findViewById(R.id.sea);
        ((AnimationDrawable)sea.getBackground()).start();
        final Intent e = new Intent(this,page1_4.class);
        sea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(e);
            }
        });

        btn_back = (Button)findViewById(R.id.btn_back);
        final Intent n = new Intent(this, home.class);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(n);
            }
        });
    }
}
