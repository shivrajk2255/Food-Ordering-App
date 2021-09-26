package com.example.foodorderingapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SigninActivity extends AppCompatActivity {

    TextView signinSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Sign In");

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        



        signinSignup = findViewById(R.id.signinSignup);

        signinSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SigninActivity.this, "Sign up Page", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(SigninActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

    }
}