
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
import android.widget.Toast;

import com.example.teaching.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Address extends AppCompatActivity {

    ImageView address_back;
    TextView btn_address;
    private BottomSheetDialog bottomSheetDialog;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        btn_address = findViewById(R.id.btn_address);
        address_back = findViewById(R.id.address_back);
        address_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog = new BottomSheetDialog(Address.this,R.style.BottomSheetTheme);
                View view1 = LayoutInflater.from(Address.this).inflate(R.layout.address_layout,
                        (LinearLayout) findViewById(R.id.container));
                ImageView cancel_button = (ImageView)view1.findViewById(R.id.cancel_button);
                TextView btn_address = (TextView) view1.findViewById(R.id.btn_address);
                cancel_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                    }
                });
                bottomSheetDialog.setContentView(view1);
                bottomSheetDialog.show();
                bottomSheetDialog.setCanceledOnTouchOutside(false);
            }
        });
    }
}