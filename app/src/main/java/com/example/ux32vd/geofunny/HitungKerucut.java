package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungKerucut extends AppCompatActivity {

    private TextView hasillpermukaan, hasilvolume;
    private EditText jarilpermukaan, sisiselimutlpermukaan, jarivolume, tinggivolume;
    private Button luaspermukaan, volume;

    double jumlahlpermukaan, jumlahvolume;
    double jlpermukaan, slpermukaan, jvolume, tvolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_kerucut);

        hasillpermukaan = (TextView)findViewById(R.id.hasilLPermukaanKerucut);
        hasilvolume = (TextView)findViewById(R.id.hasilVolumeKerucut);

        jarilpermukaan = (EditText)findViewById(R.id.JariLPermukaanKerucut);
        sisiselimutlpermukaan = (EditText)findViewById(R.id.SisiSelimutLPermukaanKerucut);
        jarivolume = (EditText)findViewById(R.id.JariVolumeKerucut);
        tinggivolume = (EditText)findViewById(R.id.TinggiVolumeKerucut);

        luaspermukaan = (Button)findViewById(R.id.HitungLPermukaanKerucut);
        volume = (Button)findViewById(R.id.HitungVolumeKerucut);

        luaspermukaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (jarilpermukaan.getText().length() == 0 || sisiselimutlpermukaan.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                jlpermukaan = Double.parseDouble(jarilpermukaan.getText().toString());
                slpermukaan = Double.parseDouble(sisiselimutlpermukaan.getText().toString());
                jumlahlpermukaan = (3.14*jlpermukaan*jlpermukaan) + (3.14*jlpermukaan*slpermukaan);
                hasillpermukaan.setText(String.valueOf(jumlahlpermukaan));
            }
        });

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (jarivolume.getText().length() == 0 || tinggivolume.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                jvolume = Double.parseDouble(jarivolume.getText().toString());
                tvolume = Double.parseDouble(tinggivolume.getText().toString());
                jumlahvolume = (3.14*jvolume*jvolume) * tvolume / 3;
                hasilvolume.setText(String.valueOf(jumlahvolume));
            }
        });

    }
}