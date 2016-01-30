package com.example.kimhuang.project;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class page1_32 extends AppCompatActivity {
    Button btn_back, btn_next;
    ImageView house1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1_32);

        //house
        house1 = (ImageView)findViewById(R.id.house1);
        ((AnimationDrawable)house1.getBackground()).start();

        btn_back = (Button) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_next = (Button) findViewById(R.id.btn_next);
        final Intent i = new Intent(this, scene1_3.class);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}
