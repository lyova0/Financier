package com.example.financier;

import static com.example.financier.MainActivity.my_user_name;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class plus extends AppCompatActivity {

    EditText project_name, project_amount, full_presentation_of_the_project, project_user;
    public static String[][] business_projects = new String[100][6];
    public static String[][] tourism_projects = new String[100][6];
    public static String[][] solar_energy_projects = new String[100][6];
    public static String[][] education_projects = new String[100][6];
    public static String[][] agriculture_projects = new String[100][6];
    public static String[][] ecology_projects = new String[100][6];
    public static String[][] my_posts = new String[100][6];

    public static int business_i = -1;
    public static int tourism_i = -1;
    public static int solar_energy_i = -1;
    public static int education_i = -1;
    public static int agriculture_i = -1;
    public static int ecology_i = -1;
    public static int my_post_i = -1;

    public static int business_j = -1;
    public static int tourism_j = -1;
    public static int solar_energy_j = -1;
    public static int education_j = -1;
    public static int agriculture_j = -1;
    public static int ecology_j = -1;
    public static int my_post_j = -1;

    String status = "none";
    String project_type = "none";

    Button financier, entrepreneur, business, tourism, solar_energy, education, agriculture, ecology, new_post;


    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);

        //project type
        financier = findViewById(R.id.financier);
        entrepreneur = findViewById(R.id.entrepreneur);

        // edit texts
        project_name = findViewById(R.id.project_name);
        project_amount = findViewById(R.id.project_amount);
        full_presentation_of_the_project = findViewById(R.id.full_idea);
        project_user = findViewById(R.id.project_user);

        //project types
        business = findViewById(R.id.business_type);
        tourism = findViewById(R.id.tourism_type);
        solar_energy = findViewById(R.id.solar_energy_type);
        education = findViewById(R.id.education_type);
        agriculture = findViewById(R.id.agriculture_type);
        ecology = findViewById(R.id.ecology_type);

        //new post btn
        new_post = findViewById(R.id.new_post_btn);

        financier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                financier.setBackgroundColor(getResources().getColor(R.color.blue));
                entrepreneur.setBackgroundColor(getResources().getColor(R.color.black));
                status = "Financier";
            }
        });

        entrepreneur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrepreneur.setBackgroundColor(getResources().getColor(R.color.blue));
                financier.setBackgroundColor(getResources().getColor(R.color.black));
                status = "Entrepreneur";
            }
        });

        //set project type

        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                project_type = "Business";
                business.setBackgroundColor(getResources().getColor(R.color.blue));
                tourism.setBackgroundColor(getResources().getColor(R.color.black));
                solar_energy.setBackgroundColor(getResources().getColor(R.color.black));
                education.setBackgroundColor(getResources().getColor(R.color.black));
                agriculture.setBackgroundColor(getResources().getColor(R.color.black));
                ecology.setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

        tourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                project_type = "Tourism";
                tourism.setBackgroundColor(getResources().getColor(R.color.blue));
                business.setBackgroundColor(getResources().getColor(R.color.black));
                solar_energy.setBackgroundColor(getResources().getColor(R.color.black));
                education.setBackgroundColor(getResources().getColor(R.color.black));
                agriculture.setBackgroundColor(getResources().getColor(R.color.black));
                ecology.setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

        solar_energy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                project_type = "Solar Energy";
                solar_energy.setBackgroundColor(getResources().getColor(R.color.blue));
                tourism.setBackgroundColor(getResources().getColor(R.color.black));
                business.setBackgroundColor(getResources().getColor(R.color.black));
                education.setBackgroundColor(getResources().getColor(R.color.black));
                agriculture.setBackgroundColor(getResources().getColor(R.color.black));
                ecology.setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                project_type = "Education";
                education.setBackgroundColor(getResources().getColor(R.color.blue));
                tourism.setBackgroundColor(getResources().getColor(R.color.black));
                solar_energy.setBackgroundColor(getResources().getColor(R.color.black));
                business.setBackgroundColor(getResources().getColor(R.color.black));
                agriculture.setBackgroundColor(getResources().getColor(R.color.black));
                ecology.setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

        agriculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                project_type = "Agriculture";
                agriculture.setBackgroundColor(getResources().getColor(R.color.blue));
                tourism.setBackgroundColor(getResources().getColor(R.color.black));
                solar_energy.setBackgroundColor(getResources().getColor(R.color.black));
                education.setBackgroundColor(getResources().getColor(R.color.black));
                business.setBackgroundColor(getResources().getColor(R.color.black));
                ecology.setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

        ecology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                project_type = "Ecology";
                ecology.setBackgroundColor(getResources().getColor(R.color.blue));
                tourism.setBackgroundColor(getResources().getColor(R.color.black));
                solar_energy.setBackgroundColor(getResources().getColor(R.color.black));
                education.setBackgroundColor(getResources().getColor(R.color.black));
                agriculture.setBackgroundColor(getResources().getColor(R.color.black));
                business.setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

        new_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status != "none" && project_name.getText().toString().length() != 0 && project_amount.getText().toString().length() != 0 && project_user.getText().toString().length() != 0 && full_presentation_of_the_project.getText().toString().length() != 0 && project_type != "none"){
                    if (project_type.equals("Business")){
                        business_i++;
                        business_projects[business_i][0] = status;
                        business_projects[business_i][1] = project_name.getText().toString();
                        business_projects[business_i][2] = project_amount.getText().toString();
                        business_projects[business_i][3] = project_user.getText().toString();
                        business_projects[business_i][4] = full_presentation_of_the_project.getText().toString();
                        business_projects[business_i][5] = project_type;

                    } else if (project_type.equals("Tourism")){
                        tourism_i++;
                        tourism_projects[tourism_i][0] = status;
                        tourism_projects[tourism_i][1] = project_name.getText().toString();
                        tourism_projects[tourism_i][2] = project_amount.getText().toString();
                        tourism_projects[tourism_i][3] = project_user.getText().toString();
                        tourism_projects[tourism_i][4] = full_presentation_of_the_project.getText().toString();
                        tourism_projects[tourism_i][5] = project_type;

                    }else if (project_type.equals("Solar Energy")){
                        solar_energy_i++;
                        solar_energy_projects[solar_energy_i][0] = status;
                        solar_energy_projects[solar_energy_i][1] = project_name.getText().toString();
                        solar_energy_projects[solar_energy_i][2] = project_amount.getText().toString();
                        solar_energy_projects[solar_energy_i][3] = project_user.getText().toString();
                        solar_energy_projects[solar_energy_i][4] = full_presentation_of_the_project.getText().toString();
                        solar_energy_projects[solar_energy_i][5] = project_type;

                    } else if (project_type.equals("Education")){
                        education_i++;
                        education_projects[education_i][0] = status;
                        education_projects[education_i][1] = project_name.getText().toString();
                        education_projects[education_i][2] = project_amount.getText().toString();
                        education_projects[education_i][3] = project_user.getText().toString();
                        education_projects[education_i][4] = full_presentation_of_the_project.getText().toString();
                        education_projects[education_i][5] = project_type;

                    } else if (project_type.equals("Agriculture")){
                        agriculture_i++;
                        agriculture_projects[agriculture_i][0] = status;
                        agriculture_projects[agriculture_i][1] = project_name.getText().toString();
                        agriculture_projects[agriculture_i][2] = project_amount.getText().toString();
                        agriculture_projects[agriculture_i][3] = project_user.getText().toString();
                        agriculture_projects[agriculture_i][4] = full_presentation_of_the_project.getText().toString();
                        agriculture_projects[agriculture_i][5] = project_type;
                    } else if (project_type.equals("Ecology")){
                        ecology_i++;
                        ecology_projects[ecology_i][0] = status;
                        ecology_projects[ecology_i][1] = project_name.getText().toString();
                        ecology_projects[ecology_i][2] = project_amount.getText().toString();
                        ecology_projects[ecology_i][3] = project_user.getText().toString();
                        ecology_projects[ecology_i][4] = full_presentation_of_the_project.getText().toString();
                        ecology_projects[ecology_i][5] = project_type;
                    }

                    if (project_user.getText().toString().equals(my_user_name)){
                        my_post_i++;
                        my_posts[my_post_i][0] = status;
                        my_posts[my_post_i][1] = project_name.getText().toString();
                        my_posts[my_post_i][2] = project_amount.getText().toString();
                        my_posts[my_post_i][3] = project_user.getText().toString();
                        my_posts[my_post_i][4] = full_presentation_of_the_project.getText().toString();
                        my_posts[my_post_i][5] = project_type;
                    }

                    business_j = -1;
                    tourism_j = -1;
                    solar_energy_j = -1;
                    education_j = -1;
                    agriculture_j = -1;
                    ecology_j = -1;

                    startActivity(new Intent(plus.this, Home.class));
                } else if (project_name.getText().toString().length() == 0){
                    project_name.setText("");
                    project_name.setHint("This line can't be empty");
                } else if (project_amount.getText().toString().length() == 0){
                    project_amount.setText("");
                    project_amount.setHint("This line can't be empty");
                } else if (project_user.getText().toString().length() == 0){
                    project_user.setText("");
                    project_user.setHint("This line can't be empty");
                } else if (full_presentation_of_the_project.getText().toString().length() == 0){
                    full_presentation_of_the_project.setText("");
                    full_presentation_of_the_project.setHint("This line can't be empty");
                }
            }
        });
    }
}