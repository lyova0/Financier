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

    EditText project_name, project_amount, full_presentation_of_the_project, project_user, your_number, instagram_nick, facebook_nick, telegram_nick;
    public static String[][] business_projects = new String[100][10];
    public static String[][] tourism_projects = new String[100][10];
    public static String[][] solar_energy_projects = new String[100][10];
    public static String[][] education_projects = new String[100][10];
    public static String[][] agriculture_projects = new String[100][10];
    public static String[][] ecology_projects = new String[100][10];
    public static String[][] my_posts = new String[100][10];

    public static String[][] oll_posts = new String[100][10];

    final String[] moneys = {"$", "֏", "₽", "€"};

    int i = 0;

    public static int business_i = -1;
    public static int oll_post_i = -1;
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
    public static int oll_post_j = -1;

    String status = "none";
    String project_type = "none";
    String social_networks = "";

    public static int my_post_count, business_post_count, tourism_post_count, solar_energy_post_count, education_post_count, ecology_post_count, agriculture_post_count, oll_post_count = 0;

    Button financier, entrepreneur, business, tourism, solar_energy, education, agriculture, ecology, new_post, instagram, facebook, telegram;


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
        instagram_nick = findViewById(R.id.instagram_nick);
        facebook_nick = findViewById(R.id.facebook_nick);
        telegram_nick = findViewById(R.id.telegram_nick);
        your_number = findViewById(R.id.my_number);

        //project types
        business = findViewById(R.id.business_type);
        tourism = findViewById(R.id.tourism_type);
        solar_energy = findViewById(R.id.solar_energy_type);
        education = findViewById(R.id.education_type);
        agriculture = findViewById(R.id.agriculture_type);
        ecology = findViewById(R.id.ecology_type);

        //new post btn
        new_post = findViewById(R.id.new_post_btn);

        Button money = findViewById(R.id.money);
        instagram = findViewById(R.id.instagram);
        facebook = findViewById(R.id.facebook);
        telegram = findViewById(R.id.telegram);

        instagram_nick.setVisibility(View.INVISIBLE);
        facebook_nick.setVisibility(View.INVISIBLE);
        telegram_nick.setVisibility(View.INVISIBLE);

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("instagram".contains(social_networks)) {
                    instagram.setBackgroundColor(getResources().getColor(R.color.blue));
                    social_networks = social_networks +  " instagram";
                    instagram_nick.setVisibility(View.VISIBLE);
                }
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("facebook".contains(social_networks)) {
                    facebook.setBackgroundColor(getResources().getColor(R.color.blue));
                    social_networks = social_networks + " facebook";
                    facebook_nick.setVisibility(View.VISIBLE);
                }
            }
        });

        telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("telegram".contains(social_networks)) {
                    telegram.setBackgroundColor(getResources().getColor(R.color.blue));
                    social_networks = social_networks + " telegram";
                    telegram_nick.setVisibility(View.VISIBLE);
                }
            }
        });

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
                status = "Innovator";
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
                if (status != "none" && project_name.getText().toString().length() != 0 && project_amount.getText().toString().length() != 0 && project_amount.getText().toString().matches("\\d+") && project_user.getText().toString().length() != 0 && full_presentation_of_the_project.getText().toString().length() != 0 && project_type != "none" && your_number.getText().toString().length() != 0) {
                    if (project_type.equals("Business")) {
                        business_i++;
                        business_projects[business_i][0] = status;
                        business_projects[business_i][1] = project_name.getText().toString();
                        business_projects[business_i][2] = project_amount.getText().toString() + money.getText().toString();
                        business_projects[business_i][3] = project_user.getText().toString();
                        business_projects[business_i][4] = full_presentation_of_the_project.getText().toString();
                        business_projects[business_i][5] = project_type;
                        business_projects[business_i][6] = your_number.getText().toString();

                        business_post_count++;

                    } else if (project_type.equals("Tourism")) {
                        tourism_i++;
                        tourism_projects[tourism_i][0] = status;
                        tourism_projects[tourism_i][1] = project_name.getText().toString();
                        tourism_projects[tourism_i][2] = project_amount.getText().toString() + money.getText().toString();
                        tourism_projects[tourism_i][3] = project_user.getText().toString();
                        tourism_projects[tourism_i][4] = full_presentation_of_the_project.getText().toString();
                        tourism_projects[tourism_i][5] = project_type;
                        tourism_projects[tourism_i][6] = your_number.getText().toString();

                        tourism_post_count++;

                    } else if (project_type.equals("Solar Energy")) {
                        solar_energy_i++;
                        solar_energy_projects[solar_energy_i][0] = status;
                        solar_energy_projects[solar_energy_i][1] = project_name.getText().toString();
                        solar_energy_projects[solar_energy_i][2] = project_amount.getText().toString() + money.getText().toString();
                        solar_energy_projects[solar_energy_i][3] = project_user.getText().toString();
                        solar_energy_projects[solar_energy_i][4] = full_presentation_of_the_project.getText().toString();
                        solar_energy_projects[solar_energy_i][5] = project_type;
                        solar_energy_projects[solar_energy_i][6] = your_number.getText().toString();

                        solar_energy_post_count++;

                    } else if (project_type.equals("Education")) {
                        education_i++;
                        education_projects[education_i][0] = status;
                        education_projects[education_i][1] = project_name.getText().toString();
                        education_projects[education_i][2] = project_amount.getText().toString() + money.getText().toString();
                        education_projects[education_i][3] = project_user.getText().toString();
                        education_projects[education_i][4] = full_presentation_of_the_project.getText().toString();
                        education_projects[education_i][5] = project_type;
                        education_projects[education_i][6] = your_number.getText().toString();
                        education_post_count++;

                    } else if (project_type.equals("Agriculture")) {
                        agriculture_i++;
                        agriculture_projects[agriculture_i][0] = status;
                        agriculture_projects[agriculture_i][1] = project_name.getText().toString();
                        agriculture_projects[agriculture_i][2] = project_amount.getText().toString() + money.getText().toString();
                        agriculture_projects[agriculture_i][3] = project_user.getText().toString();
                        agriculture_projects[agriculture_i][4] = full_presentation_of_the_project.getText().toString();
                        agriculture_projects[agriculture_i][5] = project_type;
                        agriculture_projects[agriculture_i][6] = your_number.getText().toString();
                        agriculture_post_count++;

                    } else if (project_type.equals("Ecology")) {
                        ecology_i++;
                        ecology_projects[ecology_i][0] = status;
                        ecology_projects[ecology_i][1] = project_name.getText().toString();
                        ecology_projects[ecology_i][2] = project_amount.getText().toString() + money.getText().toString();
                        ecology_projects[ecology_i][3] = project_user.getText().toString();
                        ecology_projects[ecology_i][4] = full_presentation_of_the_project.getText().toString();
                        ecology_projects[ecology_i][5] = project_type;
                        ecology_projects[ecology_i][6] = your_number.getText().toString();
                        ecology_post_count++;
                    }

                    if (project_user.getText().toString().equals(my_user_name)) {
                        my_post_i++;
                        my_post_count++;
                        my_posts[my_post_i][0] = status;
                        my_posts[my_post_i][1] = project_name.getText().toString();
                        my_posts[my_post_i][2] = project_amount.getText().toString() + money.getText().toString();
                        my_posts[my_post_i][3] = project_user.getText().toString();
                        my_posts[my_post_i][4] = full_presentation_of_the_project.getText().toString();
                        my_posts[my_post_i][5] = project_type;
                        my_posts[my_post_i][6] = your_number.getText().toString();

                    }

                    business_j = -1;
                    tourism_j = -1;
                    solar_energy_j = -1;
                    education_j = -1;
                    agriculture_j = -1;
                    ecology_j = -1;
                    my_post_j = -1;

                    oll_post_i++;
                    oll_posts[oll_post_i][0] = status;
                    oll_posts[oll_post_i][1] = project_name.getText().toString();
                    oll_posts[oll_post_i][2] = project_amount.getText().toString() + money.getText().toString();
                    oll_posts[oll_post_i][3] = project_user.getText().toString();
                    oll_posts[oll_post_i][4] = full_presentation_of_the_project.getText().toString();
                    oll_posts[oll_post_i][5] = project_type;
                    oll_posts[oll_post_i][6] = your_number.getText().toString();
                    oll_post_count = business_post_count + tourism_post_count + solar_energy_post_count + education_post_count + agriculture_post_count + ecology_post_count;

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

        money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i < moneys.length - 1){
                    i++;
                    money.setText(moneys[i]);
                } else if (i == moneys.length - 1){
                    i = 0;
                    money.setText(moneys[i]);
                }
            }
        });
    }
}