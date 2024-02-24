package com.example.financier;

import static com.example.financier.plus.i;
import static com.example.financier.plus.j;
import static com.example.financier.plus.oll_posts;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    Button updatte;
    Button previous;
    TextView type;
    TextView name;
    TextView summary_of_the_idea;
    TextView amount_to_be_collected;
    TextView project_user;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        updatte = findViewById(R.id.update_btn);
        previous = findViewById(R.id.previous_btn);

        type = findViewById(R.id.project1_type);
        name = findViewById(R.id.project1_name_financier);
        summary_of_the_idea = findViewById(R.id.summary_of_the_idea_financier1);
        amount_to_be_collected = findViewById(R.id.amount_to_be_collected_financier1);
        project_user = findViewById(R.id.username);
        ImageButton btn = findViewById(R.id.profile_btn);
        ImageButton btn1 = findViewById(R.id.plus_btn);

        updatte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                j++;
                name.setText(oll_posts[j][0]);
                type.setText(oll_posts[j][1]);
                summary_of_the_idea.setText(oll_posts[j][2]);
                amount_to_be_collected.setText(oll_posts[j][3]);
                project_user.setText(oll_posts[j][4]);
            }

        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                j--;
                name.setText(oll_posts[j][0]);
                type.setText(oll_posts[j][1]);
                summary_of_the_idea.setText(oll_posts[j][2]);
                amount_to_be_collected.setText(oll_posts[j][3]);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, profile.class));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, plus.class));
            }
        });
    }
}