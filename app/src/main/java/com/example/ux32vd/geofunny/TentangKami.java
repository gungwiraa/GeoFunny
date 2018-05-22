package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class TentangKami extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_kami);

        final ImageButton profil1 = (ImageButton) findViewById(R.id.imageView8);
        profil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.imageView8);
                Toast.makeText(getApplicationContext(), "The Mad Titan, Documentator, Tester", Toast.LENGTH_LONG).show();
            }
        });

        final ImageButton profil2 = (ImageButton) findViewById(R.id.imageView7);
        profil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.imageView7);
                Toast.makeText(getApplicationContext(), "The Chief, Programmer, Content Creator", Toast.LENGTH_LONG).show();
            }
        });

        final ImageButton profil3 = (ImageButton) findViewById(R.id.imageView9);
        profil3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.imageView9);
                Toast.makeText(getApplicationContext(), "The Baby Groot, Designer, Error Man", Toast.LENGTH_LONG).show();
            }
        });

        final ImageButton profil4 = (ImageButton) findViewById(R.id.imageView10);
        profil4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.imageView10);
                Toast.makeText(getApplicationContext(), "The Artist, Designer, Visualization Consultant", Toast.LENGTH_LONG).show();
                }
        });




    }
}