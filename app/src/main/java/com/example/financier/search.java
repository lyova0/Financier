package com.example.financier;

import static com.example.financier.MainActivity.my_user_name;
import static com.example.financier.plus.agriculture_i;
import static com.example.financier.plus.agriculture_post_count;
import static com.example.financier.plus.business_i;
import static com.example.financier.plus.business_post_count;
import static com.example.financier.plus.business_projects;
import static com.example.financier.plus.business_j;


import static com.example.financier.plus.ecology_i;
import static com.example.financier.plus.ecology_post_count;
import static com.example.financier.plus.education_j;
import static com.example.financier.plus.education_i;
import static com.example.financier.plus.my_post_j;
import static com.example.financier.plus.oll_post_count;
import static com.example.financier.plus.oll_posts;
import static com.example.financier.plus.solar_energy_i;
import static com.example.financier.plus.solar_energy_post_count;
import static com.example.financier.plus.tourism_i;
import static com.example.financier.plus.tourism_post_count;
import static com.example.financier.plus.tourism_projects;
import static com.example.financier.plus.tourism_j;


import static com.example.financier.plus.solar_energy_projects;
import static com.example.financier.plus.solar_energy_j;


import static com.example.financier.plus.education_projects;
import static com.example.financier.plus.education_j;


import static com.example.financier.plus.agriculture_projects;
import static com.example.financier.plus.agriculture_j;


import static com.example.financier.plus.ecology_projects;
import static com.example.financier.plus.ecology_j;

import static com.example.financier.Home.learn_more_post;
import static com.example.financier.Home.learn_more_post_i;
import static com.example.financier.Home.learn_more_post_type;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class search extends AppCompatActivity {

    Button search;

    LinearLayout project_layout;

    String status, post_status = "NONE";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        project_layout = findViewById(R.id.oll_posts);

        Button financier = findViewById(R.id.project_financier);
        Button innovator = findViewById(R.id.project_innovator);

        project_layout.setVisibility(View.INVISIBLE);

        project_layout.removeAllViews();


        financier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                financier.setBackgroundColor(getResources().getColor(R.color.blue));
                innovator.setBackgroundColor(getResources().getColor(R.color.gray));
                post_status = "Financier";

                project_layout.removeAllViews();

                project_layout.setVisibility(View.VISIBLE);

                for (int i = 0; i < oll_post_count; i++) {

                    if (oll_posts[i][0].equals("Financier")) {

                        LinearLayout projectLayout1 = new LinearLayout(search.this);

// Create the outermost LinearLayout
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                                680, // width
                                580 // height
                        );
                        layoutParams.setMargins(0, 400, 0, 0); // left, top, right, bottom
                        LinearLayout outerLinearLayout = new LinearLayout(search.this);
                        outerLinearLayout.setLayoutParams(layoutParams);
                        outerLinearLayout.setOrientation(LinearLayout.VERTICAL);
                        outerLinearLayout.setPadding(12, 12, 12, 12); // left, top, right, bottom
                        outerLinearLayout.setBackgroundResource(R.drawable.blue_border);

// Create the LinearLayout for image and text
                        LinearLayout.LayoutParams innerLayoutParams = new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        );
                        LinearLayout innerLinearLayout = new LinearLayout(search.this);
                        innerLinearLayout.setLayoutParams(innerLayoutParams);
                        innerLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

// Create and add ImageView
                        ImageView imageView = new ImageView(search.this);
                        LinearLayout.LayoutParams imageLayoutParams = new LinearLayout.LayoutParams(
                                140, // width
                                140 // height
                        );
                        imageView.setLayoutParams(imageLayoutParams);
                        if (oll_posts[i][0].equals("Financier")) {
                            imageView.setImageResource(R.drawable.financier_icon);
                        } else if (oll_posts[i][0].equals("Entrepreneur")) {
                            imageView.setImageResource(R.drawable.entrepreneur_icon);
                        }
                        innerLinearLayout.addView(imageView);

// Create and add inner LinearLayout for text
                        LinearLayout textLinearLayout = new LinearLayout(search.this);
                        LinearLayout.LayoutParams textLayoutParams = new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        );
                        textLinearLayout.setLayoutParams(textLayoutParams);
                        textLinearLayout.setOrientation(LinearLayout.VERTICAL);
                        textLinearLayout.setPadding(5, 5, 5, 5); // left, top, right, bottom

// Create and add TextViews
                        TextView projectNameTextView = new TextView(search.this);
                        projectNameTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));

                        projectNameTextView.setText(oll_posts[i][1]);
                        projectNameTextView.setTextSize(35);
                        projectNameTextView.setTextColor(getResources().getColor(R.color.blue));
                        textLinearLayout.addView(projectNameTextView);

                        TextView projectTypeTextView = new TextView(search.this);
                        projectTypeTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));
                        projectTypeTextView.setText(oll_posts[i][5]);
                        projectTypeTextView.setTextSize(20);
                        projectTypeTextView.setTextColor(getResources().getColor(R.color.blue));
                        textLinearLayout.addView(projectTypeTextView);

                        innerLinearLayout.addView(textLinearLayout);
                        outerLinearLayout.addView(innerLinearLayout);

// Create and add other TextViews
                        TextView projectUserTextView = new TextView(search.this);
                        projectUserTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));
                        projectUserTextView.setText(oll_posts[i][3]);
                        projectUserTextView.setTextSize(25);
                        projectUserTextView.setTextColor(getResources().getColor(R.color.blue));
                        outerLinearLayout.addView(projectUserTextView);

                        TextView projectstatusTextView = new TextView(search.this);
                        projectstatusTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));
                        projectstatusTextView.setText(oll_posts[i][0]);
                        projectstatusTextView.setTextSize(25);
                        projectstatusTextView.setTextColor(getResources().getColor(R.color.blue));
                        outerLinearLayout.addView(projectstatusTextView);

                        TextView projectpresentationTextView = new TextView(search.this);
                        projectpresentationTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));
                        projectpresentationTextView.setText(oll_posts[i][4]);
                        projectpresentationTextView.setTextSize(25);
                        projectpresentationTextView.setTextColor(getResources().getColor(R.color.blue));
                        outerLinearLayout.addView(projectpresentationTextView);

                        TextView projectamountTextView = new TextView(search.this);
                        projectamountTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));
                        projectamountTextView.setText(oll_posts[i][2]);
                        projectamountTextView.setTextSize(20);
                        projectamountTextView.setTextColor(getResources().getColor(R.color.blue));
                        outerLinearLayout.addView(projectamountTextView);

// Similarly, create and add other TextViews

// Create LinearLayout for Button
                        LinearLayout buttonLinearLayout = new LinearLayout(search.this);
                        buttonLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));
                        buttonLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

                        Button moreButton = new Button(search.this);
                        moreButton.setLayoutParams(new LinearLayout.LayoutParams(
                                650, // width
                                100 // height
                        ));
                        moreButton.setText("More");
                        moreButton.setTextColor(getResources().getColor(R.color.black));
                        moreButton.setBackgroundTintList(getResources().getColorStateList(R.color.light_gray));
                        int finalI = i;
                        moreButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                learn_more_post_type = "oll_post";
                                learn_more_post_i = finalI;
                                startActivity(new Intent(search.this, learn_more.class));
                            }
                        });

                        buttonLinearLayout.addView(moreButton);

                        outerLinearLayout.addView(buttonLinearLayout);

// Add the outer LinearLayout to the main layout
                        projectLayout1.addView(outerLinearLayout);

                        project_layout.addView(projectLayout1);

                    }
                }

            }
        });

        innovator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                innovator.setBackgroundColor(getResources().getColor(R.color.blue));
                financier.setBackgroundColor(getResources().getColor(R.color.gray));
                post_status = "Innovator";

                project_layout.removeAllViews();

                project_layout.setVisibility(View.VISIBLE);

                for (int i = 0; i < oll_post_count; i++) {

                    if (oll_posts[i][0].equals("Innovator")) {

                        LinearLayout projectLayout1 = new LinearLayout(search.this);

// Create the outermost LinearLayout
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                                680, // width
                                580 // height
                        );
                        layoutParams.setMargins(0, 400, 0, 0); // left, top, right, bottom
                        LinearLayout outerLinearLayout = new LinearLayout(search.this);
                        outerLinearLayout.setLayoutParams(layoutParams);
                        outerLinearLayout.setOrientation(LinearLayout.VERTICAL);
                        outerLinearLayout.setPadding(12, 12, 12, 12); // left, top, right, bottom
                        outerLinearLayout.setBackgroundResource(R.drawable.blue_border);

// Create the LinearLayout for image and text
                        LinearLayout.LayoutParams innerLayoutParams = new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        );
                        LinearLayout innerLinearLayout = new LinearLayout(search.this);
                        innerLinearLayout.setLayoutParams(innerLayoutParams);
                        innerLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

// Create and add ImageView
                        ImageView imageView = new ImageView(search.this);
                        LinearLayout.LayoutParams imageLayoutParams = new LinearLayout.LayoutParams(
                                140, // width
                                140 // height
                        );
                        imageView.setLayoutParams(imageLayoutParams);
                        if (oll_posts[i][0].equals("Financier")) {
                            imageView.setImageResource(R.drawable.financier_icon);
                        } else if (oll_posts[i][0].equals("Entrepreneur")) {
                            imageView.setImageResource(R.drawable.entrepreneur_icon);
                        }
                        innerLinearLayout.addView(imageView);

// Create and add inner LinearLayout for text
                        LinearLayout textLinearLayout = new LinearLayout(search.this);
                        LinearLayout.LayoutParams textLayoutParams = new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        );
                        textLinearLayout.setLayoutParams(textLayoutParams);
                        textLinearLayout.setOrientation(LinearLayout.VERTICAL);
                        textLinearLayout.setPadding(5, 5, 5, 5); // left, top, right, bottom

// Create and add TextViews
                        TextView projectNameTextView = new TextView(search.this);
                        projectNameTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));

                        projectNameTextView.setText(oll_posts[i][1]);
                        projectNameTextView.setTextSize(35);
                        projectNameTextView.setTextColor(getResources().getColor(R.color.blue));
                        textLinearLayout.addView(projectNameTextView);

                        TextView projectTypeTextView = new TextView(search.this);
                        projectTypeTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));
                        projectTypeTextView.setText(oll_posts[i][5]);
                        projectTypeTextView.setTextSize(20);
                        projectTypeTextView.setTextColor(getResources().getColor(R.color.blue));
                        textLinearLayout.addView(projectTypeTextView);

                        innerLinearLayout.addView(textLinearLayout);
                        outerLinearLayout.addView(innerLinearLayout);

// Create and add other TextViews
                        TextView projectUserTextView = new TextView(search.this);
                        projectUserTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));
                        projectUserTextView.setText(oll_posts[i][3]);
                        projectUserTextView.setTextSize(25);
                        projectUserTextView.setTextColor(getResources().getColor(R.color.blue));
                        outerLinearLayout.addView(projectUserTextView);

                        TextView projectstatusTextView = new TextView(search.this);
                        projectstatusTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));
                        projectstatusTextView.setText(oll_posts[i][0]);
                        projectstatusTextView.setTextSize(25);
                        projectstatusTextView.setTextColor(getResources().getColor(R.color.blue));
                        outerLinearLayout.addView(projectstatusTextView);

                        TextView projectpresentationTextView = new TextView(search.this);
                        projectpresentationTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));
                        projectpresentationTextView.setText(oll_posts[i][4]);
                        projectpresentationTextView.setTextSize(25);
                        projectpresentationTextView.setTextColor(getResources().getColor(R.color.blue));
                        outerLinearLayout.addView(projectpresentationTextView);

                        TextView projectamountTextView = new TextView(search.this);
                        projectamountTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));
                        projectamountTextView.setText(oll_posts[i][2]);
                        projectamountTextView.setTextSize(20);
                        projectamountTextView.setTextColor(getResources().getColor(R.color.blue));
                        outerLinearLayout.addView(projectamountTextView);

// Similarly, create and add other TextViews

// Create LinearLayout for Button
                        LinearLayout buttonLinearLayout = new LinearLayout(search.this);
                        buttonLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        ));
                        buttonLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

                        Button moreButton = new Button(search.this);
                        moreButton.setLayoutParams(new LinearLayout.LayoutParams(
                                650, // width
                                100 // height
                        ));
                        moreButton.setText("More");
                        moreButton.setTextColor(getResources().getColor(R.color.black));
                        moreButton.setBackgroundTintList(getResources().getColorStateList(R.color.light_gray));
                        buttonLinearLayout.addView(moreButton);

                        outerLinearLayout.addView(buttonLinearLayout);

// Add the outer LinearLayout to the main layout
                        projectLayout1.addView(outerLinearLayout);

                        project_layout.addView(projectLayout1);

                    }
                }

            }
        });

    }
}