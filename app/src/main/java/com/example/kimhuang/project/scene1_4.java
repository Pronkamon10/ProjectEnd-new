package com.example.kimhuang.project;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class scene1_4 extends AppCompatActivity {
    ImageView sungthong4, firsh1, firsh2;
    ImageView word6, word7;
    Button btn_back, btn_next, btn_pause;
    //boolean
    boolean firsh = false;
    boolean sungthong = false;
    //Dialog
    AlertDialog.Builder builder;
    Dialog dialog;
    Button dialogset, dialogexit, dialoghome, dialogclose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scene1_4);

        //frish
        firsh1 = (ImageView) findViewById(R.id.firsh1);
        ((AnimationDrawable) firsh1.getBackground()).start();

        //word6
        word6 = (ImageView) findViewById(R.id.word6);

        //word7
        word7 = (ImageView) findViewById(R.id.word7);

        //firsh
        firsh2 = (ImageView) findViewById(R.id.firsh2);
        ((AnimationDrawable) firsh2.getBackground()).start();
        firsh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (firsh == false) {
                        ((AnimationDrawable) firsh2.getBackground()).stop();
                        firsh = true;
                        //change image view
                        firsh2.setBackgroundResource(R.drawable.firsh4);
                        word6.setVisibility(View.VISIBLE);
                    } else {
                        firsh = false;
                        firsh2.setBackgroundResource(R.drawable.animate_firsh1);
                        word6.setVisibility(View.INVISIBLE);
                        ((AnimationDrawable) firsh2.getBackground()).start();
                    }

                } catch (Exception e) {
                }
            }
        });

        // sungthong
        sungthong4 = (ImageView) findViewById(R.id.sungthong4);
        ((AnimationDrawable) sungthong4.getBackground()).start();
        sungthong4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (sungthong == false) {
                        ((AnimationDrawable) sungthong4.getBackground()).stop();
                        sungthong = true;
                        //change image view
                        sungthong4.setBackgroundResource(R.drawable.sungthong5);
                        word7.setVisibility(View.VISIBLE);
                    } else {
                        sungthong = false;
                        sungthong4.setBackgroundResource(R.drawable.animate_sungthong1_4);
                        word7.setVisibility(View.INVISIBLE);
                        ((AnimationDrawable) sungthong4.getBackground()).start();
                    }

                } catch (Exception e) {
                }
            }
        });


        //button_pause
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
                //button_exit
                dialogexit.setOnClickListener(new View.OnClickListener() {

                    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                    @Override
                    public void onClick(View v) {
                        finishAffinity();
                    }
                });
                //button_home
                dialoghome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), map1.class);
                        startActivity(i);
                    }
                });

                //button_setting
                dialogset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                //button_close
                dialogclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
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
        final Intent i = new Intent(this, minigame1.class);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}
