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
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class scene1_3 extends AppCompatActivity {
    ImageView house1, sungthong3, chicken1;
    Button btn_back, btn_next, btn_close,btn_pause;
    MediaPlayer mediaPlayer;
    //boolean
    boolean chicken = false;
    boolean house = false;
    //Dialog
    AlertDialog.Builder builder;
    Dialog dialog;
    Button dialogset, dialogexit, dialoghome, dialogclose;
    Dialog knowlesst;
    int pindex = 0;
    int[] resChiken = {R.drawable.knowless_ck1, R.drawable.knowless_ck2, R.drawable.knowless_ck3};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scene1_3);

        //house
        //jantawee
        house1 = (ImageView) findViewById(R.id.house1);
        ((AnimationDrawable)house1.getBackground()).start();
        house1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (house == false) {
                        ((AnimationDrawable) house1.getBackground()).stop();
                        house  = true;
                        //change image view
                        house1.setBackgroundResource(R.drawable.house3);
                    } else {
                        house  = false;
                        house1.setBackgroundResource(R.drawable.animate_house);
                        ((AnimationDrawable) house1.getBackground()).start();
                    }

                } catch (Exception e) {
                }
            }
        });


        // sungthong
        sungthong3 = (ImageView) findViewById(R.id.sungthong3);
        ((AnimationDrawable) sungthong3.getBackground()).start();

        //chicken
        chicken1 = (ImageView) findViewById(R.id.chicken1);
        ((AnimationDrawable) chicken1.getBackground()).start();
        chicken1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.rooster);
                mediaPlayer.start();
                try {
                    if (chicken = false) {
                        ((AnimationDrawable) chicken1.getBackground()).stop();
                        chicken = true;
                        //change image view
                        chicken1.setBackgroundResource(R.drawable.chicken1);
                        knowlesst.show();
                    } else {
                        chicken = false;
                        //change image view
                        chicken1.setBackgroundResource(R.drawable.animate_chicken);
                        ((AnimationDrawable) chicken1.getBackground()).start();
                        knowlesst.show();
                    }
                } catch (Exception e) {
                }
            }
        });

        knowlesst = new Dialog(scene1_3.this);
        knowlesst.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //dialog นำ layout chickenlayout มาแสดง
        knowlesst.setContentView(R.layout.chickenlayout);
        //dialog ให้สามารถปิิดได้
        knowlesst.setCancelable(true);

        final Button btnBack = (Button) knowlesst.findViewById(R.id.button1);
        final Button btnNext = (Button) knowlesst.findViewById(R.id.button);
        final ImageView bg = (ImageView) knowlesst.findViewById(R.id.knowless_ck1);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pindex == resChiken.length - 1) {
                    bg.setImageResource(resChiken[0]);
                    pindex = 0;

                } else {
                    bg.setImageResource(resChiken[++pindex]);
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pindex == 0) {
                    bg.setImageResource(resChiken[resChiken.length - 1]);
                    pindex = resChiken.length - 1;
                } else {
                    bg.setImageResource(resChiken[--pindex]);

                }
            }
        });

        //dialog เต็มหน้าจอ
        knowlesst.getWindow().setLayout(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        //button_close
        btn_close = (Button) knowlesst.findViewById(R.id.button3);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                knowlesst.cancel();
            }
        });

        //button pause
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
        final Intent i = new Intent(this, page1_4.class);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });

    }
}

