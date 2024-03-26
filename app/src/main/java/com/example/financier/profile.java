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
import static com.example.financier.plus.my_post_count;
import static com.example.financier.plus.my_post_i;
import static com.example.financier.plus.my_post_j;
import static com.example.financier.plus.my_posts;
import static com.example.financier.plus.oll_post_count;
import static com.example.financier.plus.oll_posts;
import static com.example.financier.plus.solar_energy_i;
import static com.example.financier.plus.solar_energy_j;
import static com.example.financier.plus.solar_energy_projects;
import static com.example.financier.plus.tourism_i;
import static com.example.financier.plus.tourism_j;
import static com.example.financier.plus.tourism_projects;
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

    String status_btn = "hide";



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        Button see_my_post = findViewById(R.id.see_my_posts);

        LinearLayout project_layout = findViewById(R.id.oll_posts);

        ImageButton btn = findViewById(R.id.home_btn);
        ImageButton btn1 = findViewById(R.id.plus_btn);

        project_layout.setVisibility(View.INVISIBLE);
        project_layout.removeAllViews();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profile.this, Home.class));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profile.this, plus.class));
            }
        });

        see_my_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status_btn == "hide") {
                    project_layout.setVisibility(View.VISIBLE);
                    see_my_post.setBackgroundColor(getResources().getColor(R.color.blue));
                    if (my_post_i != -1) {
                        project_layout.setVisibility(View.VISIBLE);

                        project_layout.setVisibility(View.VISIBLE);
                        for (int i = 0; i < my_post_count; i++) {

                            LinearLayout projectLayout1 = new LinearLayout(profile.this);

// Create the outermost LinearLayout
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                                    680, // width
                                    580 // height
                            );
                            layoutParams.setMargins(0, 400, 0, 0); // left, top, right, bottom
                            LinearLayout outerLinearLayout = new LinearLayout(profile.this);
                            outerLinearLayout.setLayoutParams(layoutParams);
                            outerLinearLayout.setOrientation(LinearLayout.VERTICAL);
                            outerLinearLayout.setPadding(12, 12, 12, 12); // left, top, right, bottom
                            outerLinearLayout.setBackgroundResource(R.drawable.blue_border);

// Create the LinearLayout for image and text
                            LinearLayout.LayoutParams innerLayoutParams = new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.MATCH_PARENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT
                            );
                            LinearLayout innerLinearLayout = new LinearLayout(profile.this);
                            innerLinearLayout.setLayoutParams(innerLayoutParams);
                            innerLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

// Create and add ImageView
                            ImageView imageView = new ImageView(profile.this);
                            LinearLayout.LayoutParams imageLayoutParams = new LinearLayout.LayoutParams(
                                    140, // width
                                    140 // height
                            );
                            imageView.setLayoutParams(imageLayoutParams);
                            if (my_posts[i][0].equals("Financier")) {
                                imageView.setImageResource(R.drawable.financier_icon);
                            } else if (my_posts[i][0].equals("Entrepreneur")) {
                                imageView.setImageResource(R.drawable.entrepreneur_icon);
                            }
                            innerLinearLayout.addView(imageView);

// Create and add inner LinearLayout for text
                            LinearLayout textLinearLayout = new LinearLayout(profile.this);
                            LinearLayout.LayoutParams textLayoutParams = new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.MATCH_PARENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT
                            );
                            textLinearLayout.setLayoutParams(textLayoutParams);
                            textLinearLayout.setOrientation(LinearLayout.VERTICAL);
                            textLinearLayout.setPadding(5, 5, 5, 5); // left, top, right, bottom

// Create and add TextViews
                            TextView projectNameTextView = new TextView(profile.this);
                            projectNameTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.WRAP_CONTENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT
                            ));

                            projectNameTextView.setText(my_posts[i][1]);
                            projectNameTextView.setTextSize(35);
                            projectNameTextView.setTextColor(getResources().getColor(R.color.blue));
                            textLinearLayout.addView(projectNameTextView);

                            TextView projectTypeTextView = new TextView(profile.this);
                            projectTypeTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.WRAP_CONTENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT
                            ));
                            projectTypeTextView.setText(my_posts[i][5]);
                            projectTypeTextView.setTextSize(20);
                            projectTypeTextView.setTextColor(getResources().getColor(R.color.blue));
                            textLinearLayout.addView(projectTypeTextView);

                            innerLinearLayout.addView(textLinearLayout);
                            outerLinearLayout.addView(innerLinearLayout);

// Create and add other TextViews
                            TextView projectUserTextView = new TextView(profile.this);
                            projectUserTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.WRAP_CONTENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT
                            ));
                            projectUserTextView.setText(my_posts[i][3]);
                            projectUserTextView.setTextSize(25);
                            projectUserTextView.setTextColor(getResources().getColor(R.color.blue));
                            outerLinearLayout.addView(projectUserTextView);

                            TextView projectstatusTextView = new TextView(profile.this);
                            projectstatusTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.WRAP_CONTENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT
                            ));
                            projectstatusTextView.setText(my_posts[i][0]);
                            projectstatusTextView.setTextSize(25);
                            projectstatusTextView.setTextColor(getResources().getColor(R.color.blue));
                            outerLinearLayout.addView(projectstatusTextView);

                            TextView projectpresentationTextView = new TextView(profile.this);
                            projectpresentationTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.WRAP_CONTENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT
                            ));
                            projectpresentationTextView.setText(my_posts[i][4]);
                            projectpresentationTextView.setTextSize(25);
                            projectpresentationTextView.setTextColor(getResources().getColor(R.color.blue));
                            outerLinearLayout.addView(projectpresentationTextView);

                            TextView projectamountTextView = new TextView(profile.this);
                            projectamountTextView.setLayoutParams(new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.WRAP_CONTENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT
                            ));
                            projectamountTextView.setText(my_posts[i][2]);
                            projectamountTextView.setTextSize(20);
                            projectamountTextView.setTextColor(getResources().getColor(R.color.blue));
                            outerLinearLayout.addView(projectamountTextView);

// Similarly, create and add other TextViews

// Create LinearLayout for Button
                            LinearLayout buttonLinearLayout = new LinearLayout(profile.this);
                            buttonLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.MATCH_PARENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT
                            ));
                            buttonLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

                            Button moreButton = new Button(profile.this);
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
                    status_btn = "show";
                } else if (status_btn == "show"){
                    project_layout.setVisibility(View.INVISIBLE);
                    status_btn = "hide";
                    see_my_post.setBackgroundColor(getResources().getColor(R.color.gray));
                }
            }
        });


    }
}