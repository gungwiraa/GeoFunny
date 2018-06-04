package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungTabung extends AppCompatActivity {

    private TextView hasillpermukaan, hasilvolume;
    private EditText diameterlpermukaan, panjanglpermukaan, tinggilpermukaan, jarivolume, tinggivolume;
    private Button luaspermukaan, volume;

    double jumlahlpermukaan, jumlahvolume;
    double dlpermukaan, plpermukaan, tlpermukaan, jvolume, tvolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_tabung);

        hasillpermukaan = (TextView)findViewById(R.id.hasilLPermukaanTabung);
        hasilvolume = (TextView)findViewById(R.id.hasilVolumeTabung);

        diameterlpermukaan = (EditText)findViewById(R.id.DiameterLPermukaanTabung);
        panjanglpermukaan = (EditText)findViewById(R.id.PanjangSelimutLPermukaanTabung);
        tinggilpermukaan = (EditText)findViewById(R.id.TinggiSelimutLPermukaanTabung);
        jarivolume = (EditText)findViewById(R.id.JariVolumeTabung);
        tinggivolume = (EditText)findViewById(R.id.TinggiSelimutVolumeTabung);

        luaspermukaan = (Button)findViewById(R.id.HitungLPermukaanTabung);
        volume = (Button)findViewById(R.id.HitungVolumeTabung);

        luaspermukaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (diameterlpermukaan.getText().length() == 0 || panjanglpermukaan.getText().length() == 0 || tinggilpermukaan.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                dlpermukaan = Double.parseDouble(diameterlpermukaan.getText().toString());
                plpermukaan = Double.parseDouble(panjanglpermukaan.getText().toString());
                tlpermukaan = Double.parseDouble(tinggilpermukaan.getText().toString());
                jumlahlpermukaan = (3.14*dlpermukaan*2) + (plpermukaan*tlpermukaan);
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
                jumlahvolume = (3.14*jvolume*jvolume) * tvolume;
                hasilvolume.setText(String.valueOf(jumlahvolume));
            }
        });

    }
}