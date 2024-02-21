package com.example.teaching.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teaching.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class My_Profile extends AppCompatActivity {

    private BottomSheetDialog bottomSheetDialog;
    ImageView btn_edit,profile_back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        profile_back = findViewById(R.id.profile_back);
        btn_edit = findViewById(R.id.btn_edit);
        btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog = new BottomSheetDialog(My_Profile.this,R.style.BottomSheetTheme);
                View view1 = LayoutInflater.from(My_Profile.this).inflate(R.layout.update_profile,
                        (LinearLayout) findViewById(R.id.container));
                TextView btn_submit = (TextView)view1.findViewById(R.id.btn_submit);
                btn_submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(My_Profile.this, "Profile Update Successfully", Toast.LENGTH_SHORT).show();
                        bottomSheetDialog.dismiss();
                    }
                });
                bottomSheetDialog.setContentView(view1);
                bottomSheetDialog.show();
                bottomSheetDialog.setCanceledOnTouchOutside(false);
            }
        });
        profile_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}