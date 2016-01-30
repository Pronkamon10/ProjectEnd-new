package com.example.kimhuang.project;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class scene1_4 extends AppCompatActivity {
    ImageView sungthong4, firsh1,firsh2;
    Button btn_back, btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scene1_4);

        // sungthong
        sungthong4 =(ImageView)findViewById(R.id.sungthong4);
        ((AnimationDrawable) sungthong4.getBackground()).start();

        //frish
        firsh1 =(ImageView)findViewById(R.id.firsh1);
        ((AnimationDrawable) firsh1.getBackground()).start();

        btn_back = (Button) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_next = (Button) findViewById(R.id.btn_next);
        final Intent i = new Intent(this, page1_4.class);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}
