package com.example.financier;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class plus extends AppCompatActivity {

    EditText project_name, project_type, project_summary_of_the_idea, project_amount_to_be_collected, full_presentation_of_the_project;
    public static NewPost[] oll_posts = new NewPost[10];
    public static int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);

        Button btn = (Button)findViewById(R.id.new_post_btn);
        project_name = findViewById(R.id.project_name);
        project_type = findViewById(R.id.project_type);
        project_summary_of_the_idea = findViewById(R.id.summary_of_the_idea);
        project_amount_to_be_collected = findViewById(R.id.amount_to_be_collected);
        full_presentation_of_the_project = findViewById(R.id.full_presentation_of_the_project);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewPost a1 = new NewPost(project_name, project_type, project_summary_of_the_idea, project_amount_to_be_collected, full_presentation_of_the_project);
                oll_posts[i] = a1;
                i++;
                startActivity(new Intent(plus.this, Home.class));
            }
        });

    }
}