package com.example.teaching.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.teaching.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class CheckOut_Page extends AppCompatActivity {

    TextView txt_change;
    private BottomSheetDialog bottomSheetDialog;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out_page);

        txt_change = findViewById(R.id.txt_change);
        txt_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(CheckOut_Page.this, Address.class));
            }
        });
    }
}