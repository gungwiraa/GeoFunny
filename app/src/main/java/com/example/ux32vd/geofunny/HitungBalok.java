package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungBalok extends AppCompatActivity {

    private TextView hasillpermukaan, hasilvolume;
    private EditText panjanglpermukaan, lebarlpermukaan, tinggilpermukaan, panjangvolume, lebarvolume, tinggivolume;
    private Button luaspermukaan, volume;

    double jumlahlpermukaan, jumlahvolume;
    double plpermukaan, llpermukaan, tlpermukaan, pvolume, lvolume, tvolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_balok);

        hasillpermukaan = (TextView)findViewById(R.id.hasilLPermukaanBalok);
        hasilvolume = (TextView)findViewById(R.id.hasilVolumeBalok);

        panjanglpermukaan = (EditText)findViewById(R.id.PanjangLPermukaanBalok);
        lebarlpermukaan = (EditText)findViewById(R.id.LebarLPermukaanBalok);
        tinggilpermukaan = (EditText)findViewById(R.id.TinggiLPermukaanBalok);
        panjangvolume = (EditText)findViewById(R.id.PanjangVolumeBalok);
        lebarvolume = (EditText)findViewById(R.id.LebarVolumeBalok);
        tinggivolume = (EditText)findViewById(R.id.TinggiVolumeBalok);

        luaspermukaan = (Button)findViewById(R.id.HitungLPermukaanBalok);
        volume = (Button)findViewById(R.id.HitungVolumeBalok);

        luaspermukaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (panjanglpermukaan.getText().length() == 0 || lebarlpermukaan.getText().length() == 0 || tinggilpermukaan.getText().length() == 0){
                Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                return;
                }

                plpermukaan = Double.parseDouble(panjanglpermukaan.getText().toString());
                llpermukaan = Double.parseDouble(lebarlpermukaan.getText().toString());
                tlpermukaan = Double.parseDouble(tinggilpermukaan.getText().toString());
                jumlahlpermukaan = (2*plpermukaan*llpermukaan) + (2*llpermukaan*tlpermukaan) + (2*plpermukaan*tlpermukaan);
                hasillpermukaan.setText(String.valueOf(jumlahlpermukaan));

            }
        });

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (panjangvolume.getText().length() == 0 || lebarvolume.getText().length() == 0 || tinggivolume.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                pvolume = Double.parseDouble(panjangvolume.getText().toString());
                lvolume = Double.parseDouble(lebarvolume.getText().toString());
                tvolume = Double.parseDouble(tinggivolume.getText().toString());
                jumlahvolume = pvolume*lvolume*tvolume;
                hasilvolume.setText(String.valueOf(jumlahvolume));
            }
        });

    }
}
