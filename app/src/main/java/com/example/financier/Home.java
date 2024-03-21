package com.example.financier;

import static com.example.financier.plus.agriculture_i;
import static com.example.financier.plus.business_i;
import static com.example.financier.plus.business_projects;
import static com.example.financier.plus.business_j;


import static com.example.financier.plus.ecology_i;
import static com.example.financier.plus.education_j;
import static com.example.financier.plus.education_i;
import static com.example.financier.plus.solar_energy_i;
import static com.example.financier.plus.tourism_i;
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

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    Button search_icon;
    TextView type;
    TextView name;
    TextView full_presentation;
    TextView project_status;
    TextView amount_to_be_collected;
    TextView project_user;
    String status = "";

    LinearLayout project_layout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        search_icon = findViewById(R.id.search_icon);
        ImageButton btn = findViewById(R.id.profile_btn);
        ImageButton btn1 = findViewById(R.id.plus_btn);
        project_layout = findViewById(R.id.project_layout);
        type = findViewById(R.id.project_type);
        name = findViewById(R.id.project_name);
        full_presentation = findViewById(R.id.project_presentation);
        project_status = findViewById(R.id.project_status_t);
        amount_to_be_collected = findViewById(R.id.project_amount);
        project_user = findViewById(R.id.project_user);

        Button business = findViewById(R.id.project_business);
        Button tourism = findViewById(R.id.project_tourism);
        Button solar_energy = findViewById(R.id.project_solar_energy);
        Button education = findViewById(R.id.project_education);
        Button agriculture = findViewById(R.id.project_agriculture);
        Button ecology = findViewById(R.id.project_ecology);

        Button next_post = findViewById(R.id.next_post);
        Button previous_post = findViewById(R.id.previous_post);

        ImageView project_icon = findViewById(R.id.project_icon);
        project_layout.setVisibility(View.INVISIBLE);
        next_post.setVisibility(View.INVISIBLE);
        previous_post.setVisibility(View.INVISIBLE);



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

        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next_post.setVisibility(View.VISIBLE);

                status = "business";

                business.setBackgroundColor(getResources().getColor(R.color.blue));
                tourism.setBackgroundColor(getResources().getColor(R.color.gray));
                solar_energy.setBackgroundColor(getResources().getColor(R.color.gray));
                education.setBackgroundColor(getResources().getColor(R.color.gray));
                agriculture.setBackgroundColor(getResources().getColor(R.color.gray));
                ecology.setBackgroundColor(getResources().getColor(R.color.gray));

                tourism_j = -1;
                solar_energy_j = -1;
                education_j = -1;
                agriculture_j = -1;
                ecology_j = -1;

                if (business_i != -1) {
                    project_layout.setVisibility(View.VISIBLE);
                    business_j++;
                    if (business_projects[business_j][0].equals("Financier")) {
                        project_icon.setImageResource(R.drawable.financier_icon);
                    } else {
                        project_icon.setImageResource(R.drawable.entrepreneur_icon);
                    }
                    project_status.setText(business_projects[business_j][0]);
                    name.setText(business_projects[business_j][1]);
                    amount_to_be_collected.setText(business_projects[business_j][2]);
                    project_user.setText(business_projects[business_j][3]);
                    full_presentation.setText(business_projects[business_j][4]);
                    type.setText(business_projects[business_j][5]);
                } else {

                    next_post.setVisibility(View.INVISIBLE);
                    previous_post.setVisibility(View.INVISIBLE);
                    project_layout.setVisibility(View.INVISIBLE);
                }
            }
        });

        tourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next_post.setVisibility(View.VISIBLE);

                status = "tourism";

                tourism.setBackgroundColor(getResources().getColor(R.color.blue));
                business.setBackgroundColor(getResources().getColor(R.color.gray));
                solar_energy.setBackgroundColor(getResources().getColor(R.color.gray));
                education.setBackgroundColor(getResources().getColor(R.color.gray));
                agriculture.setBackgroundColor(getResources().getColor(R.color.gray));
                ecology.setBackgroundColor(getResources().getColor(R.color.gray));

                business_j = -1;
                solar_energy_j = -1;
                education_j = -1;
                agriculture_j = -1;
                ecology_j = -1;

                if (tourism_i != -1) {
                    project_layout.setVisibility(View.VISIBLE);
                    tourism_j++;
                    if (tourism_projects[tourism_j][0].equals("Financier")) {
                        project_icon.setImageResource(R.drawable.financier_icon);
                    } else {
                        project_icon.setImageResource(R.drawable.entrepreneur_icon);
                    }
                    project_status.setText(tourism_projects[tourism_j][0]);
                    name.setText(tourism_projects[tourism_j][1]);
                    amount_to_be_collected.setText(tourism_projects[tourism_j][2]);
                    project_user.setText(tourism_projects[tourism_j][3]);
                    full_presentation.setText(tourism_projects[tourism_j][4]);
                    type.setText(tourism_projects[tourism_j][5]);
                    project_layout.setVisibility(View.VISIBLE);
                } else {

                    next_post.setVisibility(View.INVISIBLE);
                    previous_post.setVisibility(View.INVISIBLE);
                    project_layout.setVisibility(View.INVISIBLE);
                }
            }
        });

        solar_energy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next_post.setVisibility(View.VISIBLE);

                status = "solar energy";

                solar_energy.setBackgroundColor(getResources().getColor(R.color.blue));
                tourism.setBackgroundColor(getResources().getColor(R.color.gray));
                business.setBackgroundColor(getResources().getColor(R.color.gray));
                education.setBackgroundColor(getResources().getColor(R.color.gray));
                agriculture.setBackgroundColor(getResources().getColor(R.color.gray));
                ecology.setBackgroundColor(getResources().getColor(R.color.gray));

                tourism_j = -1;
                business_j = -1;
                education_j = -1;
                agriculture_j = -1;
                ecology_j = -1;

                if (solar_energy_i != -1) {
                    project_layout.setVisibility(View.VISIBLE);
                    solar_energy_j++;
                    if (solar_energy_projects[solar_energy_j][0].equals("Financier")) {
                        project_icon.setImageResource(R.drawable.financier_icon);
                    } else {
                        project_icon.setImageResource(R.drawable.entrepreneur_icon);
                    }
                    project_status.setText(solar_energy_projects[solar_energy_j][0]);
                    name.setText(solar_energy_projects[solar_energy_j][1]);
                    amount_to_be_collected.setText(solar_energy_projects[solar_energy_j][2]);
                    project_user.setText(solar_energy_projects[solar_energy_j][3]);
                    full_presentation.setText(solar_energy_projects[solar_energy_j][4]);
                    type.setText(solar_energy_projects[solar_energy_j][5]);
                    project_layout.setVisibility(View.VISIBLE);
                } else {

                    next_post.setVisibility(View.INVISIBLE);
                    previous_post.setVisibility(View.INVISIBLE);
                    project_layout.setVisibility(View.INVISIBLE);
                }
            }
        });

        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next_post.setVisibility(View.VISIBLE);

                status = "education";

                education.setBackgroundColor(getResources().getColor(R.color.blue));
                tourism.setBackgroundColor(getResources().getColor(R.color.gray));
                solar_energy.setBackgroundColor(getResources().getColor(R.color.gray));
                business.setBackgroundColor(getResources().getColor(R.color.gray));
                agriculture.setBackgroundColor(getResources().getColor(R.color.gray));
                ecology.setBackgroundColor(getResources().getColor(R.color.gray));

                tourism_j = -1;
                solar_energy_j = -1;
                business_j = -1;
                agriculture_j = -1;
                ecology_j = -1;

                if (education_i != -1) {
                    project_layout.setVisibility(View.VISIBLE);
                    education_j++;
                    if (education_projects[education_j][0].equals("Financier")) {
                        project_icon.setImageResource(R.drawable.financier_icon);
                    } else {
                        project_icon.setImageResource(R.drawable.entrepreneur_icon);
                    }
                    project_status.setText(education_projects[education_j][0]);
                    name.setText(education_projects[education_j][1]);
                    amount_to_be_collected.setText(education_projects[education_j][2]);
                    project_user.setText(education_projects[education_j][3]);
                    full_presentation.setText(education_projects[education_j][4]);
                    type.setText(education_projects[education_j][5]);
                    project_layout.setVisibility(View.VISIBLE);
                } else {

                    next_post.setVisibility(View.INVISIBLE);
                    previous_post.setVisibility(View.INVISIBLE);
                    project_layout.setVisibility(View.INVISIBLE);
                }
            }
        });

        agriculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next_post.setVisibility(View.VISIBLE);

                status = "agriculture";

                agriculture.setBackgroundColor(getResources().getColor(R.color.blue));
                tourism.setBackgroundColor(getResources().getColor(R.color.gray));
                solar_energy.setBackgroundColor(getResources().getColor(R.color.gray));
                education.setBackgroundColor(getResources().getColor(R.color.gray));
                business.setBackgroundColor(getResources().getColor(R.color.gray));
                ecology.setBackgroundColor(getResources().getColor(R.color.gray));

                tourism_j = -1;
                solar_energy_j = -1;
                education_j = -1;
                business_j = -1;
                ecology_j = -1;

                if (agriculture_i != -1) {
                    project_layout.setVisibility(View.VISIBLE);
                    agriculture_j++;
                    if (agriculture_projects[agriculture_j][0].equals("Financier")) {
                        project_icon.setImageResource(R.drawable.financier_icon);
                    } else {
                        project_icon.setImageResource(R.drawable.entrepreneur_icon);
                    }
                    project_status.setText(agriculture_projects[agriculture_j][0]);
                    name.setText(agriculture_projects[agriculture_j][1]);
                    amount_to_be_collected.setText(agriculture_projects[agriculture_j][2]);
                    project_user.setText(agriculture_projects[agriculture_j][3]);
                    full_presentation.setText(agriculture_projects[agriculture_j][4]);
                    type.setText(agriculture_projects[agriculture_j][5]);
                    project_layout.setVisibility(View.VISIBLE);
                } else {

                    next_post.setVisibility(View.INVISIBLE);
                    previous_post.setVisibility(View.INVISIBLE);
                    project_layout.setVisibility(View.INVISIBLE);
                }
            }
        });

        ecology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next_post.setVisibility(View.VISIBLE);

                status = "ecology";

                ecology.setBackgroundColor(getResources().getColor(R.color.blue));
                tourism.setBackgroundColor(getResources().getColor(R.color.gray));
                solar_energy.setBackgroundColor(getResources().getColor(R.color.gray));
                education.setBackgroundColor(getResources().getColor(R.color.gray));
                agriculture.setBackgroundColor(getResources().getColor(R.color.gray));
                business.setBackgroundColor(getResources().getColor(R.color.gray));

                tourism_j = -1;
                solar_energy_j = -1;
                education_j = -1;
                agriculture_j = -1;
                business_j = -1;

                if (ecology_i != -1) {
                        project_layout.setVisibility(View.VISIBLE);
                        ecology_j++;
                        if (ecology_projects[ecology_j][0].equals("Financier")) {
                            project_icon.setImageResource(R.drawable.financier_icon);
                        } else {
                            project_icon.setImageResource(R.drawable.entrepreneur_icon);
                        }
                        project_status.setText(ecology_projects[ecology_j][0]);
                        name.setText(ecology_projects[ecology_j][1]);
                        amount_to_be_collected.setText(ecology_projects[ecology_j][2]);

                        project_user.setText(ecology_projects[ecology_j][3]);
                        full_presentation.setText(ecology_projects[ecology_j][4]);
                        type.setText(ecology_projects[ecology_j][5]);
                        project_layout.setVisibility(View.VISIBLE);
                    } else {

                    next_post.setVisibility(View.INVISIBLE);
                    project_layout.setVisibility(View.INVISIBLE);
                }
            }
        });

        next_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == "business") {
                    if (business_i != -1) {
                        business_j++;
                        if (business_j <= business_i) {
                            if (business_projects[business_j][0].equals("Financier")) {
                                project_icon.setImageResource(R.drawable.financier_icon);
                            } else {
                                project_icon.setImageResource(R.drawable.entrepreneur_icon);
                            }
                            project_status.setText(business_projects[business_j][0]);
                            name.setText(business_projects[business_j][1]);
                            amount_to_be_collected.setText(business_projects[business_j][2]);
                            project_user.setText(business_projects[business_j][3]);
                            full_presentation.setText(business_projects[business_j][4]);
                            type.setText(business_projects[business_j][5]);
                            previous_post.setVisibility(View.VISIBLE);
                        } else {
                            next_post.setVisibility(View.INVISIBLE);
                            business_j--;
                        }
                    }
                }
            }
        });

        previous_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == "business") {
                    if (business_i != -1) {
                        business_j--;
                        if (business_j >= 0) {
                            if (business_projects[business_j][0].equals("Financier")) {
                                project_icon.setImageResource(R.drawable.financier_icon);
                            } else {
                                project_icon.setImageResource(R.drawable.entrepreneur_icon);
                            }
                            project_status.setText(business_projects[business_j][0]);
                            name.setText(business_projects[business_j][1]);
                            amount_to_be_collected.setText(business_projects[business_j][2]);
                            project_user.setText(business_projects[business_j][3]);
                            full_presentation.setText(business_projects[business_j][4]);
                            type.setText(business_projects[business_j][5]);
                            next_post.setVisibility(View.VISIBLE);
                        } else {
                            previous_post.setVisibility(View.INVISIBLE);
                            business_j++;
                        }
                    }
                } else if (status == "tourism") {
                    if (tourism_i != -1) {
                        tourism_j--;
                        if (tourism_j >= 0) {
                            if (tourism_projects[tourism_j][0].equals("Financier")) {
                                project_icon.setImageResource(R.drawable.financier_icon);
                            } else {
                                project_icon.setImageResource(R.drawable.entrepreneur_icon);
                            }
                            project_status.setText(tourism_projects[tourism_j][0]);
                            name.setText(tourism_projects[tourism_j][1]);
                            amount_to_be_collected.setText(tourism_projects[tourism_j][2]);
                            project_user.setText(tourism_projects[tourism_j][3]);
                            full_presentation.setText(tourism_projects[tourism_j][4]);
                            type.setText(tourism_projects[tourism_j][5]);
                            next_post.setVisibility(View.VISIBLE);
                        } else {
                            previous_post.setVisibility(View.INVISIBLE);
                            tourism_j++;
                        }
                    }
                } else if (status == "solar energy") {
                    if (solar_energy_i != -1) {
                        solar_energy_j--;
                        if (solar_energy_j >= 0) {
                            if (solar_energy_projects[solar_energy_j][0].equals("Financier")) {
                                project_icon.setImageResource(R.drawable.financier_icon);
                            } else {
                                project_icon.setImageResource(R.drawable.entrepreneur_icon);
                            }
                            project_status.setText(solar_energy_projects[solar_energy_j][0]);
                            name.setText(solar_energy_projects[solar_energy_j][1]);
                            amount_to_be_collected.setText(solar_energy_projects[solar_energy_j][2]);
                            project_user.setText(solar_energy_projects[solar_energy_j][3]);
                            full_presentation.setText(solar_energy_projects[solar_energy_j][4]);
                            type.setText(solar_energy_projects[solar_energy_j][5]);
                            next_post.setVisibility(View.VISIBLE);
                        } else {
                            previous_post.setVisibility(View.INVISIBLE);
                            solar_energy_j++;
                        }
                    }
                } else if (status == "education") {
                    if (solar_energy_i != -1) {
                        solar_energy_j--;
                        if (solar_energy_j >= 0) {
                            if (solar_energy_projects[solar_energy_j][0].equals("Financier")) {
                                project_icon.setImageResource(R.drawable.financier_icon);
                            } else {
                                project_icon.setImageResource(R.drawable.entrepreneur_icon);
                            }
                            project_status.setText(solar_energy_projects[solar_energy_j][0]);
                            name.setText(solar_energy_projects[solar_energy_j][1]);
                            amount_to_be_collected.setText(solar_energy_projects[solar_energy_j][2]);
                            project_user.setText(solar_energy_projects[solar_energy_j][3]);
                            full_presentation.setText(solar_energy_projects[solar_energy_j][4]);
                            type.setText(solar_energy_projects[solar_energy_j][5]);
                            next_post.setVisibility(View.VISIBLE);
                        } else {
                            previous_post.setVisibility(View.INVISIBLE);
                            solar_energy_j++;
                        }
                    }
                }
            }
        });

    }
}