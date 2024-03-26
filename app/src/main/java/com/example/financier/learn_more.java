package com.example.financier;


import static com.example.financier.Home.learn_more_post;
import static com.example.financier.Home.learn_more_post_i;
import static com.example.financier.Home.learn_more_post_type;
import static com.example.financier.plus.oll_posts;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class learn_more extends AppCompatActivity {

    TextView project_name, project_type, project_user, project_amount_to_be_collected, full_presentation_of_the_project, post_number, instagram_nick, facebook_nick, telegram_nick;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more);

        project_name = findViewById(R.id.project_name);
        project_type = findViewById(R.id.post_type);
        project_user = findViewById(R.id.post_user);
        project_amount_to_be_collected = findViewById(R.id.post_amount);
        full_presentation_of_the_project = findViewById(R.id.post_presentation);

        if (learn_more_post_type.equals("oll_post")) {
            project_name.setText(oll_posts[learn_more_post_i][1]);
            project_type.setText(oll_posts[learn_more_post_i][5]);
            project_user.setText(oll_posts[learn_more_post_i][3]);
            project_amount_to_be_collected.setText(oll_posts[learn_more_post_i][2]);
            full_presentation_of_the_project.setText(oll_posts[learn_more_post_i][4]);
            post_number.setText(oll_posts[learn_more_post_i][6]);
        }
    }
}