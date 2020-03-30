package com.example.android.musicalstructureappudacity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView country = findViewById(R.id.country);

        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(MainActivity.this, CountryActivity.class);
                startActivity(countryIntent);
            }
        });

        TextView pop = findViewById(R.id.pop);

        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);
                startActivity(popIntent);
            }
        });


        TextView dance = findViewById(R.id.dance);

        dance.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent danceIntent = new Intent(MainActivity.this, DanceActivity.class);
                startActivity(danceIntent);
            }
        });
    }
}

