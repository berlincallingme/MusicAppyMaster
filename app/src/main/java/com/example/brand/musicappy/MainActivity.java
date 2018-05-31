package com.example.brand.musicappy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView portugal = (TextView) findViewById(R.id.portgual);

        // Set a click listener on that View
        portugal.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent portugalIntent = new Intent(MainActivity.this, PortugalActivity.class);

                // Start the new activity
                startActivity(portugalIntent);
            }
        });

        // Find the View that shows the family category
        TextView depeche = (TextView) findViewById(R.id.depeche);

        // Set a click listener on that View
        depeche.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent depecheIntent = new Intent(MainActivity.this, DepecheActivity.class);

                // Start the new activity
                startActivity(depecheIntent);
            }
        });

        // Find the View that shows the colors category
        TextView altj = (TextView) findViewById(R.id.altj);

        // Set a click listener on that View
        altj.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent altjIntent = new Intent(MainActivity.this, AltjActivity.class);

                // Start the new activity
                startActivity(altjIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView grimes = (TextView) findViewById(R.id.grimes);

        // Set a click listener on that View
        grimes.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent grimesIntent = new Intent(MainActivity.this, GrimesActivity.class);

                // Start the new activity
                startActivity(grimesIntent);
            }
        });
    }
}
