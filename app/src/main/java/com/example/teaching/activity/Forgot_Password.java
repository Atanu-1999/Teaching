package com.example.teaching.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.teaching.R;

public class Forgot_Password extends AppCompatActivity {

    ImageView password_back;
    TextView btn_otp,btn_verify;
    LinearLayout box_layout,verify_layout,otp_layout,number_layout;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        number_layout = findViewById(R.id.number_layout);
        otp_layout = findViewById(R.id.otp_layout);
        verify_layout = findViewById(R.id.verify_layout);
        box_layout = findViewById(R.id.box_layout);
        btn_verify = findViewById(R.id.btn_verify);
        btn_otp = findViewById(R.id.btn_otp);
        btn_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verify_layout.setVisibility(View.VISIBLE);
                box_layout.setVisibility(View.VISIBLE);
                number_layout.setVisibility(View.GONE);
            }
        });
        btn_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Forgot_Password.this,Password_Change.class));
            }
        });
        password_back = findViewById(R.id.password_back);
        password_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Forgot_Password.this,LoginPage.class));
            }
        });
    }
}