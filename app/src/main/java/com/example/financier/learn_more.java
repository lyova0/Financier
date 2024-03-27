package com.example.financier;


import static com.example.financier.Home.a;
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
        post_number = findViewById(R.id.post_user_number);
        instagram_nick = findViewById(R.id.post_instagram);
        facebook_nick = findViewById(R.id.post_facebook);
        telegram_nick = findViewById(R.id.post_telegram);

        instagram_nick.setVisibility(View.INVISIBLE);
        facebook_nick.setVisibility(View.INVISIBLE);
        telegram_nick.setVisibility(View.INVISIBLE);

        if (learn_more_post_type.equals("oll_post")) {
            project_name.setText(oll_posts[a][1]);
            project_type.setText(oll_posts[a][5]);
            project_user.setText(oll_posts[a][3]);
            project_amount_to_be_collected.setText(oll_posts[a][2]);
            full_presentation_of_the_project.setText(oll_posts[a][4]);
            post_number.setText("number -" + oll_posts[a][6]);
            if (!(oll_posts[a][7].equals("null"))) {
                instagram_nick.setVisibility(View.VISIBLE);
                instagram_nick.setText("instagram -" + oll_posts[a][7]);
            }
            if (!(oll_posts[a][8].equals("null"))) {
                facebook_nick.setVisibility(View.VISIBLE);
                facebook_nick.setText("facebook -" + oll_posts[a][8]);
            }
            if (!(oll_posts[a][9].equals("null"))) {
                telegram_nick.setVisibility(View.VISIBLE);
                telegram_nick.setText("telegram -" + oll_posts[a][9]);
            }
        }
    }
}