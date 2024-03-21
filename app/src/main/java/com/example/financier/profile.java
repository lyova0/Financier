package com.example.financier;

import static com.example.financier.MainActivity.my_user_name;
import static com.example.financier.plus.agriculture_i;
import static com.example.financier.plus.agriculture_j;
import static com.example.financier.plus.agriculture_projects;
import static com.example.financier.plus.business_i;
import static com.example.financier.plus.business_j;
import static com.example.financier.plus.business_projects;
import static com.example.financier.plus.ecology_i;
import static com.example.financier.plus.ecology_j;
import static com.example.financier.plus.ecology_projects;
import static com.example.financier.plus.education_i;
import static com.example.financier.plus.education_j;
import static com.example.financier.plus.education_projects;
import static com.example.financier.plus.my_post_i;
import static com.example.financier.plus.my_post_j;
import static com.example.financier.plus.my_posts;
import static com.example.financier.plus.solar_energy_i;
import static com.example.financier.plus.solar_energy_j;
import static com.example.financier.plus.solar_energy_projects;
import static com.example.financier.plus.tourism_i;
import static com.example.financier.plus.tourism_j;
import static com.example.financier.plus.tourism_projects;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.BreakIterator;

public class profile extends AppCompatActivity {

    TextView type;
    TextView name;
    TextView full_presentation;
    TextView project_status;
    TextView amount_to_be_collected;
    TextView project_user;

    LinearLayout project_layout;

    String status_btn = "hide";



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        project_layout = findViewById(R.id.project_layout);
        type = findViewById(R.id.project_type);
        name = findViewById(R.id.project_name);
        full_presentation = findViewById(R.id.project_presentation);
        project_status = findViewById(R.id.project_status_t);
        amount_to_be_collected = findViewById(R.id.project_amount);
        project_user = findViewById(R.id.project_user);

        Button see_my_post = findViewById(R.id.see_my_posts);

        ImageButton btn = findViewById(R.id.home_btn);
        ImageButton btn1 = findViewById(R.id.plus_btn);
        ImageView project_icon = findViewById(R.id.project_icon);

        Button next_post = findViewById(R.id.next_post);
        Button previous_post = findViewById(R.id.previous_post);

        project_layout.setVisibility(View.INVISIBLE);
        next_post.setVisibility(View.INVISIBLE);
        previous_post.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next_post.setVisibility(View.INVISIBLE);
                previous_post.setVisibility(View.INVISIBLE);
                startActivity(new Intent(profile.this, Home.class));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next_post.setVisibility(View.INVISIBLE);
                previous_post.setVisibility(View.INVISIBLE);
                startActivity(new Intent(profile.this, plus.class));
            }
        });

        see_my_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status_btn == "hide") {
                    project_layout.setVisibility(View.VISIBLE);
                    next_post.setVisibility(View.VISIBLE);
                    previous_post.setVisibility(View.VISIBLE);
                    see_my_post.setBackgroundColor(getResources().getColor(R.color.blue));
                    if (my_post_i != -1) {
                        project_layout.setVisibility(View.VISIBLE);
                        my_post_j++;
                        if (my_posts[my_post_j][0].equals("Financier")) {
                            project_icon.setImageResource(R.drawable.financier_icon);
                        } else {
                            project_icon.setImageResource(R.drawable.entrepreneur_icon);
                        }
                        project_status.setText(my_posts[my_post_j][0]);
                        name.setText(my_posts[my_post_j][1]);
                        amount_to_be_collected.setText(my_posts[my_post_j][2]);
                        project_user.setText(my_posts[my_post_j][3]);
                        full_presentation.setText(my_posts[my_post_j][4]);
                        type.setText(my_posts[my_post_j][5]);
                    }
                    status_btn = "show";
                } else if (status_btn == "show"){
                    next_post.setVisibility(View.INVISIBLE);
                    previous_post.setVisibility(View.INVISIBLE);
                    project_layout.setVisibility(View.INVISIBLE);
                    status_btn = "hide";
                    my_post_j = -1;
                    see_my_post.setBackgroundColor(getResources().getColor(R.color.gray));
                }
            }
        });

        next_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (my_post_i != -1 && my_post_j < my_post_i) {
                    my_post_j++;
                    if (my_post_j < my_posts.length) {
                        if (my_posts[my_post_j][0].equals("Financier")) {
                            project_icon.setImageResource(R.drawable.financier_icon);
                        } else {
                            project_icon.setImageResource(R.drawable.entrepreneur_icon);
                        }
                        project_status.setText(my_posts[my_post_j][0]);
                        name.setText(my_posts[my_post_j][1]);
                        amount_to_be_collected.setText(my_posts[my_post_j][2]);
                        project_user.setText(my_posts[my_post_j][3]);
                        full_presentation.setText(my_posts[my_post_j][4]);
                        type.setText(my_posts[my_post_j][5]);
                    }
                }
                previous_post.setVisibility(View.VISIBLE);
                if (my_post_j >= my_post_i - 1) {
                    next_post.setVisibility(View.INVISIBLE);
                }
            }
        });

        previous_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (my_post_i != -1 && my_post_j > 0) {
                    my_post_j--;
                    if (my_post_j >= 0) {
                        if (my_posts[my_post_j][0].equals("Financier")) {
                            project_icon.setImageResource(R.drawable.financier_icon);
                        } else {
                            project_icon.setImageResource(R.drawable.entrepreneur_icon);
                        }
                        project_status.setText(my_posts[my_post_j][0]);
                        name.setText(my_posts[my_post_j][1]);
                        amount_to_be_collected.setText(my_posts[my_post_j][2]);
                        project_user.setText(my_posts[my_post_j][3]);
                        full_presentation.setText(my_posts[my_post_j][4]);
                        type.setText(my_posts[my_post_j][5]);
                    }
                }
                next_post.setVisibility(View.VISIBLE);
                if (my_post_j <= 0) {
                    previous_post.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}