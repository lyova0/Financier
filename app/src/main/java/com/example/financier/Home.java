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
import static com.example.financier.plus.save_post;
import static com.example.financier.plus.save_posts;
import static com.example.financier.plus.save_posts_i;
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


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Home extends AppCompatActivity {


    Button search;

    public static String[] learn_more_post = new String[10];
    public static String learn_more_post_type = "";
    public static int learn_more_post_i = -1;
    public static int a = 0;

     public final int[] b = {0};

    LinearLayout project_layout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageButton btn = findViewById(R.id.profile_btn);
        ImageButton btn1 = findViewById(R.id.plus_btn);
        project_layout = findViewById(R.id.oll_posts);
        search = findViewById(R.id.search_btn);
        project_layout.setVisibility(View.INVISIBLE);

        project_layout.setVisibility(View.VISIBLE);
        for (int i = 0; i < oll_post_count; i++) {

            LinearLayout projectLayout1 = new LinearLayout(Home.this);

// Create the outermost LinearLayout
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    680, // width
                    630 // height
            );
            layoutParams.setMargins(0, 400, 0, 0); // left, top, right, bottom
            LinearLayout outerLinearLayout = new LinearLayout(Home.this);
            outerLinearLayout.setLayoutParams(layoutParams);
            outerLinearLayout.setOrientation(LinearLayout.VERTICAL);
            outerLinearLayout.setPadding(12, 12, 12, 12); // left, top, right, bottom
            outerLinearLayout.setBackgroundResource(R.drawable.blue_border);

// Create the LinearLayout for image and text
            LinearLayout.LayoutParams innerLayoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            LinearLayout innerLinearLayout = new LinearLayout(Home.this);
            innerLinearLayout.setLayoutParams(innerLayoutParams);
            innerLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

// Create and add ImageView
            ImageView imageView = new ImageView(Home.this);
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
            LinearLayout textLinearLayout = new LinearLayout(Home.this);
            LinearLayout.LayoutParams textLayoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            textLinearLayout.setLayoutParams(textLayoutParams);
            textLinearLayout.setOrientation(LinearLayout.VERTICAL);
            textLinearLayout.setPadding(5, 5, 5, 5); // left, top, right, bottom

// Create and add TextViews
            TextView projectNameTextView = new TextView(Home.this);
            projectNameTextView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));

            projectNameTextView.setText(oll_posts[i][1]);
            projectNameTextView.setTextSize(35);
            projectNameTextView.setTextColor(getResources().getColor(R.color.blue));
            textLinearLayout.addView(projectNameTextView);

            TextView projectTypeTextView = new TextView(Home.this);
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
            TextView projectUserTextView = new TextView(Home.this);
            projectUserTextView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            projectUserTextView.setText(oll_posts[i][3]);
            projectUserTextView.setTextSize(25);
            projectUserTextView.setTextColor(getResources().getColor(R.color.blue));
            outerLinearLayout.addView(projectUserTextView);

            TextView projectstatusTextView = new TextView(Home.this);
            projectstatusTextView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            projectstatusTextView.setText(oll_posts[i][0]);
            projectstatusTextView.setTextSize(25);
            projectstatusTextView.setTextColor(getResources().getColor(R.color.blue));
            outerLinearLayout.addView(projectstatusTextView);

            TextView projectpresentationTextView = new TextView(Home.this);
            projectpresentationTextView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            projectpresentationTextView.setText(oll_posts[i][4]);
            projectpresentationTextView.setTextSize(25);
            projectpresentationTextView.setTextColor(getResources().getColor(R.color.blue));
            outerLinearLayout.addView(projectpresentationTextView);

            TextView projectamountTextView = new TextView(Home.this);
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
            LinearLayout buttonLinearLayout = new LinearLayout(Home.this);
            buttonLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            buttonLinearLayout.setOrientation(LinearLayout.VERTICAL);

            Button moreButton = new Button(Home.this);
            moreButton.setLayoutParams(new LinearLayout.LayoutParams(
                    650, // width
                    100 // height
            ));
            moreButton.setText("More");
            moreButton.setTextColor(getResources().getColor(R.color.black));
            moreButton.setBackgroundTintList(getResources().getColorStateList(R.color.light_gray));

            buttonLinearLayout.addView(moreButton);
            Button saveButton = new Button(Home.this);
            saveButton.setLayoutParams(new LinearLayout.LayoutParams(
                    100, // width
                    100 // height
            ));
            if (oll_posts[i][10].equals("save")){
                saveButton.setBackgroundResource(R.drawable.bookmark_1);
                b[0] = 1;
            } else {
                saveButton.setBackgroundResource(R.drawable.bookmark);
                b[0] = 0;
            }

            int finalI = i;
            saveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (b[0] == 0){
                        saveButton.setBackgroundResource(R.drawable.bookmark_1);
                        b[0] = 1;
                        save_posts_i++;
                        save_posts[save_posts_i][0] = oll_posts[finalI][0];
                        save_posts[save_posts_i][1] = oll_posts[finalI][1];
                        save_posts[save_posts_i][2] = oll_posts[finalI][2];
                        save_posts[save_posts_i][3] = oll_posts[finalI][3];
                        save_posts[save_posts_i][4] = oll_posts[finalI][4];
                        save_posts[save_posts_i][5] = oll_posts[finalI][5];
                        save_posts[save_posts_i][6] = oll_posts[finalI][6];
                        save_posts[save_posts_i][7] = oll_posts[finalI][7];
                        save_posts[save_posts_i][8] = oll_posts[finalI][8];
                        save_posts[save_posts_i][9] = oll_posts[finalI][9];
                        save_posts[save_posts_i][10] = "save";
                        oll_posts[finalI][10] = "save";
                        save_post++;

                    }
                }
            });

            buttonLinearLayout.addView(saveButton);

            outerLinearLayout.addView(buttonLinearLayout);

// Add the outer LinearLayout to the main layout
            projectLayout1.addView(outerLinearLayout);

            project_layout.addView(projectLayout1);

        }


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_post_j = -1;
                startActivity(new Intent(Home.this, profile.class));
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, plus.class));
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this, search.class));
            }
        });

    }
}