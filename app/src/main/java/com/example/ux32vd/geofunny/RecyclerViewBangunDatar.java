package com.example.ux32vd.geofunny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewBangunDatar extends AppCompatActivity {

        private TextView tvtype, tvdeskripsi, tvrumus;
        private ImageView img;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_recycler_view_bangun_datar);

            tvtype = (TextView) findViewById(R.id.bangundatartype);
            tvdeskripsi = (TextView) findViewById(R.id.bangundatardeskripsi);
            tvrumus = (TextView) findViewById(R.id.bangundatarrumus);
            img = (ImageView) findViewById(R.id.bangundatarthumbnail);

            //Mneerima data

            Intent intent = getIntent();
            String Type = intent.getExtras().getString("Type");
            String Rumus = intent.getExtras().getString("Rumus");
            String Deskripsi = intent.getExtras().getString("Description");
            int image = intent.getExtras().getInt("Thumbnail");

            // pengaturan values

            tvtype.setText(Type);
            tvrumus.setText(Rumus);
            tvdeskripsi.setText(Deskripsi);
            img.setImageResource(image);
        }
    }
