package com.example.kimhuang.project;

import android.graphics.drawable.AnimationDrawable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class example3 extends Fragment {
    ImageView figer, oldwomen;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.example3, container, false);

        //figer
        figer = (ImageView) rootView.findViewById(R.id.figer);
        ((AnimationDrawable) figer.getBackground()).start();

        //oldwomen
        oldwomen = (ImageView) rootView.findViewById(R.id.oldwomen);
        ((AnimationDrawable) oldwomen.getBackground()).start();
        return rootView;
    }
}
