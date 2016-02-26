package com.example.kimhuang.project;


import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class example extends Fragment {

    ImageView figer, janta1;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.example, container, false);

        //arrow
        figer = (ImageView) rootView.findViewById(R.id.figer);
        ((AnimationDrawable) figer.getBackground()).start();

        //janta
        janta1 = (ImageView) rootView.findViewById(R.id.janta1);
        ((AnimationDrawable) janta1.getBackground()).start();

        return rootView;
    }
}
