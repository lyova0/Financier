package com.example.financier;

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

    EditText project_name, project_summary_of_the_idea, full_presentation_of_the_project, project_user;
    public static String[][] oll_posts = new String[100][6];
    public static int i = -1;
    public static int j = -1;

    String status = "none";
    String project_type = "none";

    Button financier, entrepreneur, drop, business, tourism, solar_energy, education, agriculture, ecology, new_post;

    Text name, project_amount, user, full_idea, project_type_text;

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
        project_summary_of_the_idea = findViewById(R.id.project_amount);
        full_presentation_of_the_project = findViewById(R.id.full_idea);
        project_user = findViewById(R.id.project_user);
        drop = findViewById(R.id.course);

        //project types
        business = findViewById(R.id.business_type);
        tourism = findViewById(R.id.tourism_type);
        solar_energy = findViewById(R.id.solar_energy_type);
        education = findViewById(R.id.education_type);
        agriculture = findViewById(R.id.agriculture_type);
        ecology = findViewById(R.id.ecology_type);

        //new post btn
        new_post = findViewById(R.id.new_post_btn);

        //texts
        name = findViewById(R.id.project_name_t);
        project_amount = findViewById(R.id.amount_t);
        user = findViewById(R.id.user_t);
        full_idea = findViewById(R.id.full_idea_t);
        project_type_text = findViewById(R.id.project_type_t);

        financier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                financier.setBackgroundColor(Integer.parseInt("@color/blue"));
                entrepreneur.setBackgroundColor(Integer.parseInt("@color/black"));
                status = "Financier";
            }
        });

        entrepreneur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrepreneur.setBackgroundColor(Integer.parseInt("@color/blue"));
                financier.setBackgroundColor(Integer.parseInt("@color/black"));
                status = "Entrepreneur";
            }
        });

        drop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}