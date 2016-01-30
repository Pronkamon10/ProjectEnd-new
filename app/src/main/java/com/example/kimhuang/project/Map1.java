package com.example.kimhuang.project;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Map1 extends AppCompatActivity {
    ImageView palaces, house, trees1;
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

        btn_back = (Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
