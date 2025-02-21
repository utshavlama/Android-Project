package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SigninActivity extends AppCompatActivity {

    private EditText edtEmail, edtPassword, edtButton;
    private AppCompatButton btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        findview();
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtEmail.getText().toString();
                String password = edtPassword.getText().toString();

                if(email.isEmpty()) {
                    Toast.makeText(SigninActivity.this, "Email bhar na yar ", Toast.LENGTH_SHORT).show();
                } else if (password.isEmpty()) {
                    Toast.makeText(SigninActivity.this, "Password ne hal na bro", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(SigninActivity.this, "Email:" + email + "Password" + password, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @SuppressLint("WrongViewCast")
    private void findview(){
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnSubmit = findViewById(R.id.btnLogin);

    }

}