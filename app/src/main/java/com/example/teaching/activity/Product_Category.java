package com.example.teaching.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teaching.R;
import com.google.android.material.snackbar.Snackbar;

public class Product_Category extends AppCompatActivity {

    TextView btn_add;
    RelativeLayout product_layout;
    CardView product_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_category);

        product_card = findViewById(R.id.product_card);
        product_layout = findViewById(R.id.product_layout);
        btn_add = findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Snackbar snackbar = Snackbar.make(product_layout,"",Snackbar.LENGTH_INDEFINITE);
                View custom = getLayoutInflater().inflate(R.layout.custom_snckbar,null);
                snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
                Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
                snackbarLayout.setPadding(0,0,0,0);
                snackbar.setAction("view", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Product_Category.this,CheckOut_Page.class));
                    }
                });
                snackbarLayout.addView(custom,0);
                snackbar.show();*/
                Toast.makeText(Product_Category.this, "Product added into the cart", Toast.LENGTH_SHORT).show();
                btn_add.setVisibility(View.GONE);
            }
        });
        product_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Product_Category.this, ProductDetails.class));
            }
        });
    }
}