package com.example.teaching.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teaching.MainActivity;
import com.example.teaching.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class Verification extends AppCompatActivity {

    ImageView verification_back;
    TextView btn_submit,txt_number,resend_btn;
    EditText edit_otp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        resend_btn = findViewById(R.id.resend_btn);
        edit_otp = findViewById(R.id.edit_otp);
        txt_number = findViewById(R.id.txt_number);
        txt_number.setText("You will get a OTP via sms on your mobile no +91-" + "9330603949");

        verification_back = findViewById(R.id.verification_back);
        verification_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_submit = findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Verification.this, MainActivity.class));
                /*if (!edit_otp.getText().toString().trim().isEmpty()) {
                    String OTP = edit_otp.getText().toString();
                    if (getId != null){
                        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(getId, OTP);
                        FirebaseAuth.getInstance()
                                .signInWithCredential(credential)
                                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                        if (task.isSuccessful()){
                                            Intent i = new Intent(Verification.this, MainActivity.class);
                                            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                            startActivity(i);
                                        }
                                        else {
                                            Toast.makeText(Verification.this, "Enter the correct OTP", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                    }
                    else {
                        Toast.makeText(Verification.this, "Please Check Internet connection", Toast.LENGTH_SHORT).show();
                    }
                    //Toast.makeText(Verification.this, "Please Enter Otp", Toast.LENGTH_SHORT).show();
                }else {
                }
               */
                /* if (edit_otp.getText().toString().trim().isEmpty()){
                    Toast.makeText(Verification.this, "Please Enter Otp", Toast.LENGTH_SHORT).show();
                }else {
                    if (getId != null){
                        String Code = edit_otp.getText().toString().trim();
                        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(getId, Code);
                        FirebaseAuth.getInstance()
                                .signInWithCredential(credential)
                                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()){
                                    Intent i = new Intent(Verification.this, MainActivity.class);
                                    i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                    startActivity(i);
                                }else {
                                    Toast.makeText(Verification.this, "Otp Not Valid !", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                    Toast.makeText(Verification.this, "OTP Verify Successfully", Toast.LENGTH_SHORT).show();
                }*//*
                overridePendingTransition( R.anim.slide_in_up, R.anim.slide_out_up );*/
            }
        });
        resend_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*PhoneAuthProvider.getInstance().verifyPhoneNumber(
                        "+91" + getIntent().getExtras().get("verificationId"),
                        60,
                        TimeUnit.SECONDS,
                        Verification.this,
                        new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                            @Override
                            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {

                            }

                            @Override
                            public void onVerificationFailed(@NonNull FirebaseException e) {
                                Toast.makeText(Verification.this, ""+e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                                Log.e("TAG",""+e.getLocalizedMessage());
                            }

                            @Override
                            public void onCodeSent(@NonNull String newOTP, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                                getId = newOTP;
                                Toast.makeText(Verification.this, "OTP Send Successfully", Toast.LENGTH_SHORT).show();
                            }
                        }
                );*/
            }
        });
    }
}