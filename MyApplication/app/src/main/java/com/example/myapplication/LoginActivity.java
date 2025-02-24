package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class LoginActivity extends AppCompatActivity {

    private TextView forgetpassword;
    private TextView signin;
    private Button dashboard;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        initeToolbar();
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
    private void initeToolbar(){
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Login Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}