package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungKubus extends AppCompatActivity {

    private TextView hasillpermukaan, hasilvolume;
    private EditText sisilpermukaan, sisivolume;
    private Button luaspermukaan, volume;

    double jumlahlpermukaan, jumlahvolume;
    double slpermukaan, svolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_kubus);

        hasillpermukaan = (TextView)findViewById(R.id.hasilLPermukaanKubus);
        hasilvolume = (TextView)findViewById(R.id.hasilVolumeKubus);

        sisilpermukaan = (EditText)findViewById(R.id.SisiLPermukaanKubus);
        sisivolume = (EditText)findViewById(R.id.SisiVolumeKubus);

        luaspermukaan = (Button)findViewById(R.id.HitungLPermukaanKubus);
        volume = (Button)findViewById(R.id.HitungVolumeKubus);

        luaspermukaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slpermukaan = Double.parseDouble(sisilpermukaan.getText().toString());
                jumlahlpermukaan = 6*slpermukaan*slpermukaan;
                hasillpermukaan.setText(String.valueOf(jumlahlpermukaan));
            }
        });

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svolume = Double.parseDouble(sisivolume.getText().toString());
                jumlahvolume = svolume * svolume * svolume;
                hasilvolume.setText(String.valueOf(jumlahvolume));
            }
        });

    }
}
