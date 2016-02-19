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

    ImageView  janta1;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.example, container, false);

        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(rootView.findViewById(R.id.figer) , "alpha", 1f, 0f, 1f);
        ObjectAnimator right = ObjectAnimator.ofFloat(rootView.findViewById(R.id.figer), "x" , 50f);
        objectAnimator.setRepeatCount(-1);
        right.setRepeatCount(-1);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimator, right);
        animatorSet.start();
//        //janta
        janta1 = (ImageView) rootView.findViewById(R.id.janta1);
        ((AnimationDrawable) janta1.getBackground()).start();

        return rootView;
    }
}
