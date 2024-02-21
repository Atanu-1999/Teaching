package com.example.teaching.activity;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CallLog;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teaching.R;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class RegisterPage extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    TextView btn_login,btn_submit;
    EditText edit_phone;
    String[] value = {"Chaipat","Huttola","Tetultola","Gopiganj","Boruna","Sonakhali","Kheput","Arit","Barasat","Sagarpur","Bakibazar","Ranichok"};
    Spinner board_spinner;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
//        mAuth = FirebaseAuth.getInstance();
//        mAuth.getFirebaseAuthSettings().setAppVerificationDisabledForTesting(true);

        board_spinner = findViewById(R.id.board_spinner);
        board_spinner.setOnItemSelectedListener(RegisterPage.this);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(value));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arrayList);
        board_spinner.setAdapter(arrayAdapter);

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterPage.this,LoginPage.class));
                overridePendingTransition( R.anim.slide_in_up, R.anim.slide_out_up );
            }
        });
        edit_phone = findViewById(R.id.edit_phone);
        btn_submit = findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* if (!edit_phone.getText().toString().trim().isEmpty()){
                    if ((edit_phone.getText().toString().trim().length()) == 10){
                        overridePendingTransition( R.anim.slide_in_up, R.anim.slide_out_up );
                        //otpSend();
                    }
                    else {
                        Toast.makeText(RegisterPage.this, "Please enter correct number", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(RegisterPage.this, "Enter Mobile Number", Toast.LENGTH_SHORT).show();
                }*/
                startActivity(new Intent(RegisterPage.this,Verification.class));
            }
        });
    }
    /*private void otpSend() {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+91" + edit_phone.getText().toString().trim(),
                60,
                TimeUnit.SECONDS,
                RegisterPage.this,
                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                    @Override
                    public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {

                    }

                    @Override
                    public void onVerificationFailed(@NonNull FirebaseException e) {
                        Toast.makeText(RegisterPage.this, ""+e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        Log.e("TAG",""+e.getLocalizedMessage());
                    }

                    @Override
                    public void onCodeSent(@NonNull String code, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                        Toast.makeText(RegisterPage.this, "OTP Send Successfully", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(RegisterPage.this,Verification.class);
                        i.putExtra("NUMBER",edit_phone.getText().toString());
                        i.putExtra("verificationId",code);
                        startActivity(i);
                    }
                }
        );
       */
    /* mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

            @Override
            public void onVerificationCompleted(@NonNull PhoneAuthCredential credential) {

            }

            @Override
            public void onVerificationFailed(@NonNull FirebaseException e) {
                Toast.makeText(RegisterPage.this, ""+e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                Log.e("TAG",""+e.getLocalizedMessage());
            }

            @Override
            public void onCodeSent(@NonNull String verificationId,
                                   @NonNull PhoneAuthProvider.ForceResendingToken token) {
                Toast.makeText(RegisterPage.this, "OTP Send Successfully", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(RegisterPage.this,Verification.class);
                i.putExtra("NUMBER",edit_phone.getText().toString());
                i.putExtra("verificationId",verificationId);
                startActivity(i);
            }
        };*//*
       *//* PhoneAuthOptions options =
                PhoneAuthOptions.newBuilder(mAuth)
                        .setPhoneNumber("+91"+ edit_phone.getText().toString().trim())       // Phone number to verify
                        .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
                        .setActivity(this)                 // Activity (for callback binding)
                        .setCallbacks(mCallbacks)          // OnVerificationStateChangedCallbacks
                        .build();
        PhoneAuthProvider.verifyPhoneNumber(options);*//*
    }*/

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}