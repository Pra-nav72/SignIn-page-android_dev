package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username1 = (TextView) findViewById(R.id.username);
        TextView password1 = (TextView) findViewById(R.id.password);

        MaterialButton login = (MaterialButton) findViewById(R.id.login);

        ImageView google = (ImageView) findViewById(R.id.google);
        ImageView facebook = (ImageView) findViewById(R.id.facebook);
        ImageView twitter = (ImageView) findViewById(R.id.twitter);

        //Pranav & kp77
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username1.getText().toString().equals("Pranav") && password1.getText().toString().equals("kp77")){
                    Toast.makeText(MainActivity.this, "Logged-in Successfully",Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(getApplicationContext(), page2.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this, "Login Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://accounts.google.com/"));
                startActivity(i2);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                startActivity(i3);
            }
        });

        twitter.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/i/flow/login"));
                startActivity(i4);
            }
        }));

    }
}