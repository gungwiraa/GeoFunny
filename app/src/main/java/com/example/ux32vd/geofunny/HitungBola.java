package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungBola extends AppCompatActivity {

    private TextView hasillpermukaan, hasilvolume;
    private EditText jarilpermukaan, jarivolume;
    private Button luaspermukaan, volume;

    double jumlahlpermukaan, jumlahvolume;
    double jlpermukaan, jvolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_bola);

        hasillpermukaan = (TextView)findViewById(R.id.hasilLPermukaanBola);
        hasilvolume = (TextView)findViewById(R.id.hasilVolumeBola);

        jarilpermukaan = (EditText)findViewById(R.id.JariLPermukaanBola);
        jarivolume = (EditText)findViewById(R.id.JariVolumeBola);

        luaspermukaan = (Button)findViewById(R.id.HitungLPermukaanBola);
        volume = (Button)findViewById(R.id.HitungVolumeBola);

        luaspermukaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (jarilpermukaan.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                jlpermukaan = Double.parseDouble(jarilpermukaan.getText().toString());
                jumlahlpermukaan = 4*3.14*jlpermukaan*jlpermukaan;
                hasillpermukaan.setText(String.valueOf(jumlahlpermukaan));
            }
        });

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (jarivolume.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                jvolume = Double.parseDouble(jarivolume.getText().toString());
                jumlahvolume = 4*3.14*jvolume*jvolume*jvolume/3;
                hasilvolume.setText(String.valueOf(jumlahvolume));
            }
        });

    }
}