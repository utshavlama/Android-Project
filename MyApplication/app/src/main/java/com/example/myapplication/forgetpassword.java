package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class forgetpassword extends AppCompatActivity {
    private AppCompatButton login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forgetpassword);

        findview();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gologin= new Intent(forgetpassword.this,LoginActivity.class);
                startActivity(gologin);
                finish();
            }
        });
    }

    @SuppressLint("WrongViewCast")
    private void findview() {
        login = findViewById(R.id.btnSignUp);
    }

}