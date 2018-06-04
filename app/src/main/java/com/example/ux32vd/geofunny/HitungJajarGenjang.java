package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungJajarGenjang extends AppCompatActivity {

    private TextView hasilkeliling, hasilluas;
    private EditText alaskeliling, sisimiringkeliling, alasluas, tinggiluas;
    private Button keliling, luas;

    double jumlahkeliling, jumlahluas;
    double akeliling, smkeliling, aluas, tluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_jajar_genjang);

        hasilkeliling = (TextView)findViewById(R.id.hasilKelilingJajar);
        hasilluas = (TextView)findViewById(R.id.hasilLuasJajar);

        alaskeliling = (EditText)findViewById(R.id.SisiMiringKelilingJajar);
        sisimiringkeliling = (EditText)findViewById(R.id.AlasKelilingJajar);
        alasluas = (EditText)findViewById(R.id.AlasLuasJajar);
        tinggiluas = (EditText)findViewById(R.id.TinggiLuasJajar);

        keliling = (Button)findViewById(R.id.HitungKelilingJajar);
        luas = (Button)findViewById(R.id.HitungLuasJajar);

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (alaskeliling.getText().length() == 0 || sisimiringkeliling.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                akeliling = Double.parseDouble(alaskeliling.getText().toString());
                smkeliling = Double.parseDouble(sisimiringkeliling.getText().toString());
                jumlahkeliling = (2*akeliling) + (2*smkeliling);
                hasilkeliling.setText(String.valueOf(jumlahkeliling));
            }
        });

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (alasluas.getText().length() == 0 || tinggiluas.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                aluas = Double.parseDouble(alasluas.getText().toString());
                tluas = Double.parseDouble(tinggiluas.getText().toString());
                jumlahluas = aluas * tluas / 2;
                hasilluas.setText(String.valueOf(jumlahluas));
            }
        });

    }
}
