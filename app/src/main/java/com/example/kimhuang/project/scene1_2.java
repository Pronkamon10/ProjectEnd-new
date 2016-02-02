package com.example.kimhuang.project;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class scene1_2 extends AppCompatActivity {
    ImageView oldmen1, oldwomen1;
    ImageView word4;
    Button btn_back, btn_next, btn_pause;
    //boolean
    boolean oldwomen = false;
    //Dialog
    AlertDialog.Builder builder;
    Dialog dialog;
    Button dialogset, dialogexit, dialoghome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scene1_2);

        //word4
        word4 = (ImageView) findViewById(R.id.word4);

        //oldmen
        oldmen1 = (ImageView) findViewById(R.id.oldmen1);
        ((AnimationDrawable) oldmen1.getBackground()).start();

        //oldwomen
        oldwomen1 = (ImageView) findViewById(R.id.oldwomen1);
        ((AnimationDrawable) oldwomen1.getBackground()).start();
        oldwomen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (oldwomen == false) {
                        ((AnimationDrawable) oldwomen1.getBackground()).stop();
                        oldwomen = true;
                        //change image view
                        oldwomen1.setBackgroundResource(R.drawable.oldwomen1);
                        word4.setVisibility(View.VISIBLE);
                    } else {
                        oldwomen = false;
                        oldwomen1.setBackgroundResource(R.drawable.animate_oldwomen);
                        word4.setVisibility(View.INVISIBLE);
                        ((AnimationDrawable) oldwomen1.getBackground()).start();
                    }

                } catch (Exception e) {
                }
            }
        });

        //Button
        btn_pause = (Button) findViewById(R.id.btn_pause);
        builder = new AlertDialog.Builder(this);
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        btn_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.btndialog);

                //TODO findViewBy
                dialogexit = (Button) dialog.findViewById(R.id.btn_exit);
                dialoghome = (Button) dialog.findViewById(R.id.btn_home);
                dialogset = (Button) dialog.findViewById(R.id.btn_setting);

                dialogexit.setOnClickListener(new View.OnClickListener() {
                    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                    @Override
                    public void onClick(View v) {
                        finishAffinity();
                    }
                });

                dialoghome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), map1.class);
                        startActivity(i);
                    }
                });
                dialogset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        //button_back
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //button_next
        btn_next = (Button) findViewById(R.id.btn_next);
        final Intent i = new Intent(this, page1_3.class);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });

    }
}
