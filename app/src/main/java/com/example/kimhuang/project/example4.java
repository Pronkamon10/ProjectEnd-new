package com.example.kimhuang.project;

import android.graphics.drawable.AnimationDrawable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class example4 extends Fragment {
    ImageView figer, chicken;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.example4, container, false);

        //figen
        figer = (ImageView) rootView.findViewById(R.id.figer);
        ((AnimationDrawable) figer.getBackground()).start();

        //chicken
        chicken = (ImageView) rootView.findViewById(R.id.chicken);
        ((AnimationDrawable) chicken.getBackground()).start();
        return rootView;
    }
}