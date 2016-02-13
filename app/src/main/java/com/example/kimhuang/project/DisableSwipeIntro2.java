package com.example.kimhuang.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.AppIntroViewPager;

public class DisableSwipeIntro2 extends AppIntro2 {


    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(SampleSlide.newInstance(R.layout.example));
        addSlide(SampleSlide.newInstance(R.layout.example2));
        addSlide(SampleSlide.newInstance(R.layout.example3));
        addSlide(SampleSlide.newInstance(R.layout.example4));
        
    }

    private void loadMainActivity() {
        Intent intent = new Intent(this, map1.class);
        startActivity(intent);
    }

    @Override
    public void onDonePressed() {
        loadMainActivity();
    }

    @Override
    public void onNextPressed() {

    }

    @Override
    public void onSlideChanged() {

    }

    public void getStarted(View v) {
        loadMainActivity();
    }

    public void toggleNextPageSwipeLock(View v) {
        AppIntroViewPager pager = getPager();
        boolean pagingState = pager.isNextPagingEnabled();
        setNextPageSwipeLock(pagingState);
    }

    public void toggleSwipeLock(View v) {
        AppIntroViewPager pager = getPager();
        boolean pagingState = pager.isPagingEnabled();
        setSwipeLock(pagingState);
    }

    public void toggleProgressButton(View v) {
        boolean progressButtonState = isProgressButtonEnabled();
        progressButtonState = !progressButtonState;
        setProgressButtonEnabled(progressButtonState);
    }
}
