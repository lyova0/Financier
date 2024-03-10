package com.example.financier;

import static com.example.financier.MainActivity.my_user_name;
import static com.example.financier.plus.j;
import static com.example.financier.plus.oll_posts;
import static com.example.financier.search.search_name;
import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.BreakIterator;

public class profile extends AppCompatActivity {


    private ImageButton newSemesterButton;

    String[][] my_projects = new String[100][5];
    int c = -1;

    TextView type;
    TextView name;
    TextView summary_of_the_idea;
    TextView amount_to_be_collected;
    TextView project_user;

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
                j = -1;
                startActivity(new Intent(profile.this, Home.class));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j = -1;
                startActivity(new Intent(profile.this, plus.class));
            }
        });

    }
}