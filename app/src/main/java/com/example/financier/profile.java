package com.example.financier;

import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.BreakIterator;

public class profile extends AppCompatActivity {


    private ImageButton newSemesterButton;
    plus plus = new plus();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        ImageButton btn = findViewById(R.id.home_btn);
        ImageButton btn1 = findViewById(R.id.plus_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profile.this, Home.class));
            }
        });
    }
}