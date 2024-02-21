package com.example.teaching.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.teaching.R;


public class OnboardItem extends Fragment {

    private static final String ARG_POSITION = "slider-position";
    // prepare all title ids arrays
    @StringRes
    private static final int[] PAGE_TITLES = new int[]{R.string.heading_one, R.string.heading_two, R.string.heading_three };

    // prepare all subtitle ids arrays
    @StringRes
    private static final int[] PAGE_TEXT = new int[]{R.string.title_one, R.string.title_two, R.string.title_three};
    // prepare all subtitle images arrays
    @StringRes
    private static final int[] PAGE_IMAGE = new int[]{R.drawable.onboard, R.drawable.onboard_one, R.drawable.onboard_two};

    // prepare all background images arrays
    @StringRes
    private static final int[] BG_IMAGE = new int[]{R.color.color1, R.color.color1, R.color.color1};

    private int position;
    public OnboardItem() {
        // Required empty public constructor
    }
    public static OnboardItem newInstance(int position) {
        OnboardItem fragment = new OnboardItem();
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt(ARG_POSITION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View onboardView  = inflater.inflate(R.layout.fragment_onboard_item, container, false);
        return onboardView;
    }
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // set page background
        view.setBackground(requireActivity().getDrawable(BG_IMAGE[position]));

        TextView title = view.findViewById(R.id.textView);
        TextView titleText = view.findViewById(R.id.textView2);
        ImageView imageView = view.findViewById(R.id.imageView);

        // set page title
        title.setText(PAGE_TITLES[position]);
        // set page sub title text
        titleText.setText(PAGE_TEXT[position]);
        // set page image
        imageView.setImageResource(PAGE_IMAGE[position]);
    }
}