package com.example.financier;

import android.widget.EditText;

public class NewPost {

    String project_name, project_type, project_summary_of_the_idea, project_amount_to_be_collected, full_presentation_of_the_project;

    public NewPost(String project_name, String project_type, String project_summary_of_the_idea, String project_amount_to_be_collected, String full_presentation_of_the_project){

        this.project_name = project_name;
        this.project_type = project_type;
        this.project_summary_of_the_idea = project_summary_of_the_idea;
        this.project_amount_to_be_collected = project_amount_to_be_collected;
        this.full_presentation_of_the_project = full_presentation_of_the_project;

    }

}
