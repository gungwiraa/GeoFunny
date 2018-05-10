package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungPrisma extends AppCompatActivity {

    private TextView hasillpermukaan, hasilvolume;
    private EditText alaslpermukaan, tinggilpermukaan, sisilpermukaan, alasvolume, tinggivolume, tinggisisivolume;
    private Button luaspermukaan, volume;

    double jumlahlpermukaan, jumlahvolume;
    double alpermukaan, tlpermukaan, slpermukaan, avolume, tvolume, tsisivolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_prisma);

        hasillpermukaan = (TextView)findViewById(R.id.hasilLPermukaanPrisma);
        hasilvolume = (TextView)findViewById(R.id.hasilVolumePrisma);

        alaslpermukaan = (EditText)findViewById(R.id.AlasLPermukaanPrisma);
        tinggilpermukaan = (EditText)findViewById(R.id.TinggiLPermukaanPrisma);
        sisilpermukaan = (EditText)findViewById(R.id.PanjangSisiLPermukaanPrisma);
        alasvolume = (EditText)findViewById(R.id.AlasVolumePrisma);
        tinggivolume = (EditText)findViewById(R.id.TinggiVolumePrisma);
        tinggisisivolume = (EditText)findViewById(R.id.TinggiSisiVolumePrisma);

        luaspermukaan = (Button)findViewById(R.id.HitungLPermukaanPrisma);
        volume = (Button)findViewById(R.id.HitungVolumePrisma);

        luaspermukaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alpermukaan = Double.parseDouble(alaslpermukaan.getText().toString());
                tlpermukaan = Double.parseDouble(tinggilpermukaan.getText().toString());
                slpermukaan = Double.parseDouble(sisilpermukaan.getText().toString());
                jumlahlpermukaan = (2*alpermukaan*tlpermukaan/2) + (3*alpermukaan*slpermukaan);
                hasillpermukaan.setText(String.valueOf(jumlahlpermukaan));
            }
        });

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avolume = Double.parseDouble(alasvolume.getText().toString());
                tvolume = Double.parseDouble(tinggivolume.getText().toString());
                tsisivolume = Double.parseDouble(tinggisisivolume.getText().toString());
                jumlahvolume = (avolume*tvolume/2)*tsisivolume;
                hasilvolume.setText(String.valueOf(jumlahvolume));
            }
        });

    }
}
