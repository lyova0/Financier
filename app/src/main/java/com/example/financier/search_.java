package com.example.financier;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class search_ extends AppCompatActivity {

    Button learn_more, next_btn, previous_btn;
    TextView type;
    TextView name;
    TextView summary_of_the_idea;
    TextView amount_to_be_collected;
    TextView project_user;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search2);
        learn_more = findViewById(R.id.to_learn_more_btn1);
        type = findViewById(R.id.project1_type);
        name = findViewById(R.id.project1_name_financier);
        next_btn = findViewById(R.id.update_btn);
        previous_btn = findViewById(R.id.previous_btn);
        summary_of_the_idea = findViewById(R.id.summary_of_the_idea_financier1);
        amount_to_be_collected = findViewById(R.id.amount_to_be_collected_financier1);
        project_user = findViewById(R.id.username);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        previous_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        learn_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}