package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private TextView forgetpassword;
    private TextView signin;
    private Button dashboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        setForgetpassword();
        forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent utshav =new Intent(LoginActivity.this,forgetpassword.class);
                startActivity(utshav);
                finish();
            }

        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent utshav = new Intent(LoginActivity.this, SigninActivity.class);
                startActivity(utshav);
                finish();
            }
        });
        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent utshav = new Intent(LoginActivity.this, Dashboard.class);
                startActivity(utshav);
                finish();
            }
        });
    }

    public void setForgetpassword() {
        forgetpassword= findViewById(R.id.forgotPassword);
        signin= findViewById(R.id.btnSignUp);
        dashboard= findViewById(R.id.btnLogin);
    }
}