package com.example.teaching.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.teaching.R;
import com.example.teaching.model.Slider_Model;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Slider_Adapter extends PagerAdapter {

    private List<Slider_Model> models;
    private LayoutInflater layoutInflater;
    private Context context;

    public Slider_Adapter(List<Slider_Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @SuppressLint("MissingInflatedId")
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.slider_layout,container,false);

        ImageView image_view;
        image_view = view.findViewById(R.id.image_view);
        Picasso.with(context)
                .load(models.get(position).getImage())
                .into(image_view);
        ((ViewPager) container).addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);

    }
}
