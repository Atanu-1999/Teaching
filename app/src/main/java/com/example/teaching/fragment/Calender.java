package com.example.teaching.fragment;

import android.animation.ArgbEvaluator;
import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.teaching.R;
import com.example.teaching.adapter.Slider_Adapter;
import com.example.teaching.model.Slider_Model;

import java.util.ArrayList;
import java.util.List;

public class Calender extends Fragment {

    ViewPager viewPager;
    Slider_Adapter slider_adapter;
    List<Slider_Model> modelList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_calender, container, false);
        modelList = new ArrayList<>();
        modelList.add(new Slider_Model(R.drawable.onboard_one));
        modelList.add(new Slider_Model(R.drawable.onboard_four));
        modelList.add(new Slider_Model(R.drawable.onboard_two));

        slider_adapter = new Slider_Adapter(modelList,getContext());
        viewPager = v.findViewById(R.id.view_pager);
        viewPager.setAdapter(slider_adapter);
        viewPager.setPadding(80,0,80,0);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return v;
    }
}