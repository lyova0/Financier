package com.example.financier;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class learn_more extends AppCompatActivity {

    TextView project_name, project_type, project_user, project_amount_to_be_collected, full_presentation_of_the_project;
    Button view;
    public static String status;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more);

        project_name = findViewById(R.id.project1_name_financier);
        project_type = findViewById(R.id.project1_type);
        project_user = findViewById(R.id.username);
        project_amount_to_be_collected = findViewById(R.id.amount_to_be_collected_financier1);
        full_presentation_of_the_project = findViewById(R.id.full_presentation_of_the_project);
        view = findViewById(R.id.view);


    }
}