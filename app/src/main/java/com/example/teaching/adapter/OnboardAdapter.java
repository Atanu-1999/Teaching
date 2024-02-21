package com.example.teaching.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.teaching.fragment.OnboardItem;

public class OnboardAdapter extends FragmentPagerAdapter {

    public OnboardAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return OnboardItem.newInstance(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
