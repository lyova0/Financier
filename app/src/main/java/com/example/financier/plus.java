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

    EditText project_name, project_type, project_summary_of_the_idea, project_amount_to_be_collected, full_presentation_of_the_project, project_user;
    public static String[][] oll_posts = new String[100][6];
    public static int i = -1;
    public static int j = -1;


    @SuppressLint("MissingInflatedId")
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
        project_user = findViewById(R.id.user);

        btn.setOnClickListener(new View.OnClickListener() {
            NewPost a1 = new NewPost(project_name.getText().toString(), project_type.getText().toString(), project_summary_of_the_idea.getText().toString(), project_amount_to_be_collected.getText().toString(), full_presentation_of_the_project.getText().toString(), project_user.getText().toString());

            @Override
            public void onClick(View v) {
                i++;
                oll_posts[i][0] = project_name.getText().toString();
                oll_posts[i][1] = project_type.getText().toString();
                oll_posts[i][2] = project_summary_of_the_idea.getText().toString();
                oll_posts[i][3] = project_amount_to_be_collected.getText().toString();
                oll_posts[i][4] = project_user.getText().toString();
                oll_posts[i][5] = full_presentation_of_the_project.getText().toString();
                startActivity(new Intent(plus.this, Home.class));
            }
        });

    }
}