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

    LinearLayout project_layout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        search_icon = findViewById(R.id.search_icon);
        ImageButton btn = findViewById(R.id.profile_btn);
        ImageButton btn1 = findViewById(R.id.plus_btn);
        Button status = findViewById(R.id.project_status);
        project_layout = findViewById(R.id.project_layout);
        type = findViewById(R.id.project_type);
        name = findViewById(R.id.project_name);
        full_presentation = findViewById(R.id.project_presentation);
        project_status = findViewById(R.id.project_status_t);
        amount_to_be_collected = findViewById(R.id.project_amount);
        project_user = findViewById(R.id.project_user);

        Button next_btn = findViewById(R.id.next_btn);
        Button previous_btn = findViewById(R.id.previous_btn);

        ImageView project_icon = findViewById(R.id.project_icon);
        project_layout.setVisibility(View.INVISIBLE);
        previous_btn.setVisibility(View.INVISIBLE);



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


        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status.setBackgroundColor(getResources().getColor(R.color.blue));
                if (status.getText().toString().equals("Business")){
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
                    }
                } else if (status.getText().toString().equals("Tourism")){
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
                    }
                } else if (status.getText().toString().equals("Solar Energy")) {
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
                    }
                } else if (status.getText().toString().equals("Education")) {
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
                    }
                } else if (status.getText().toString().equals("Agriculture")) {
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
                    }
                } else if (status.getText().toString().equals("Ecology")) {
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
                    }
                }
            }
        });

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                previous_btn.setVisibility(View.VISIBLE);
                project_layout.setVisibility(View.INVISIBLE);
                status.setBackgroundColor(getResources().getColor(R.color.gray));
                if (status.getText().toString().equals("Agriculture")){
                    status.setText("Ecology");
                    next_btn.setVisibility(View.INVISIBLE);                }

                if (status.getText().toString().equals("Business")){
                    status.setText("Tourism");

                } else if (status.getText().toString().equals("Tourism")){

                    status.setText("Solar Energy");

                } else if (status.getText().toString().equals("Solar Energy")){
                    status.setText("Education");

                } else if (status.getText().toString().equals("Education")){
                    status.setText("Agriculture");

                } else if (status.getText().toString().equals("Agriculture")){
                    status.setText("Ecology");


                } else if (status.getText().toString().equals("Ecology")){
                    next_btn.setVisibility(View.INVISIBLE);
                }
            }
        });

        previous_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                next_btn.setVisibility(View.VISIBLE);
                project_layout.setVisibility(View.INVISIBLE);
                status.setBackgroundColor(getResources().getColor(R.color.gray));

                if (status.getText().toString().equals("Business")){
                    previous_btn.setVisibility(View.INVISIBLE);

                } else if (status.getText().toString().equals("Tourism")){

                    status.setText("Business");
                    previous_btn.setVisibility(View.INVISIBLE);

                } else if (status.getText().toString().equals("Solar Energy")){
                    status.setText("Tourism");

                } else if (status.getText().toString().equals("Education")){
                    status.setText("Solar Energy");

                } else if (status.getText().toString().equals("Agriculture")){
                    status.setText("Education");

                } else if (status.getText().toString().equals("Ecology")){
                    status.setText("Agriculture");
                }
            }
        });

    }
}