package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungLimas extends AppCompatActivity {

    private TextView hasillpermukaan, hasilvolume;
    private EditText sisilpermukaan, alaslpermukaan, tinggilpermukaan, sisivolume, tinggivolume;
    private Button luaspermukaan, volume;

    double jumlahlpermukaan, jumlahvolume;
    double slpermukaan, alpermukaan, tlpermukaan, svolume, tvolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_limas);

        hasillpermukaan = (TextView)findViewById(R.id.hasilLPermukaanLimas);
        hasilvolume = (TextView)findViewById(R.id.hasilVolumeLimas);

        sisilpermukaan = (EditText)findViewById(R.id.SisiLPermukaanLimas);
        alaslpermukaan = (EditText)findViewById(R.id.AlasLPermukaanLimas);
        tinggilpermukaan = (EditText)findViewById(R.id.TinggiLPermukaanLimas);
        sisivolume = (EditText)findViewById(R.id.SisiVolumeLimas);
        tinggivolume = (EditText)findViewById(R.id.TinggiVolumeLimas);

        luaspermukaan = (Button)findViewById(R.id.HitungLPermukaanLimas);
        volume = (Button)findViewById(R.id.HitungVolumeLimas);

        luaspermukaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sisilpermukaan.getText().length() == 0 || alaslpermukaan.getText().length() == 0 || tinggilpermukaan.getText().length() == 0 || tinggilpermukaan.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                slpermukaan = Double.parseDouble(sisilpermukaan.getText().toString());
                alpermukaan = Double.parseDouble(alaslpermukaan.getText().toString());
                tlpermukaan = Double.parseDouble(tinggilpermukaan.getText().toString());
                jumlahlpermukaan = (slpermukaan*slpermukaan) + (4*alpermukaan*tlpermukaan / 2);
                hasillpermukaan.setText(String.valueOf(jumlahlpermukaan));
            }
        });

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sisivolume.getText().length() == 0 || tinggivolume.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                svolume = Double.parseDouble(sisivolume.getText().toString());
                tvolume = Double.parseDouble(tinggivolume.getText().toString());
                jumlahvolume = (svolume*svolume)*tvolume / 3;
                hasilvolume.setText(String.valueOf(jumlahvolume));
            }
        });

    }
}