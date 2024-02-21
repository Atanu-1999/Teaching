package com.example.teaching.fragment;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.teaching.R;
import com.example.teaching.activity.MyCart;
import com.example.teaching.activity.Product_Category;
import com.example.teaching.adapter.Slider_Adapter;
import com.example.teaching.model.Slider_Model;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {

    ViewPager viewPager;
    Slider_Adapter slider_adapter;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    List<Slider_Model> modelList;
    TextView txt_see_all,txt_all;
    ImageView btn_my_cart;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        /*Initialization*/
        txt_see_all = v.findViewById(R.id.txt_see_all);
        txt_all = v.findViewById(R.id.txt_all);
        btn_my_cart = v.findViewById(R.id.btn_my_cart);

        /*-----------------------------------*/
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

        txt_see_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Product_Category.class));
            }
        });
        txt_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Product_Category.class));
            }
        });
        btn_my_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MyCart.class));
            }
        });

        return v;
    }
}