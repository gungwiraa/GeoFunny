package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungTrapesium extends AppCompatActivity {

    private TextView hasilkeliling, hasilluas;
    private EditText sisi1keliling, sisi2keliling, sisimiringkeliling, sisi1luas, sisi2luas, tinggiluas;
    private Button keliling, luas;

    double jumlahkeliling, jumlahluas;
    double s1keliling, s2keliling, smiringkeliling, s1luas, s2luas, tluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_trapesium);

        hasilkeliling = (TextView)findViewById(R.id.hasilKelilingTrapesium);
        hasilluas = (TextView)findViewById(R.id.hasilLuasTrapesium);

        sisi1keliling= (EditText)findViewById(R.id.Sisi1KelilingTrapesium);
        sisi2keliling = (EditText)findViewById(R.id.Sisi2KelilingTrapesium);
        sisimiringkeliling = (EditText)findViewById(R.id.SisiMiringTrapesium);
        sisi1luas = (EditText)findViewById(R.id.Sisi1LuasTrapesium);
        sisi2luas = (EditText)findViewById(R.id.Sisi2LuasTrapesium);
        tinggiluas = (EditText)findViewById(R.id.TinggiLuasTrapesium);

        keliling = (Button)findViewById(R.id.HitungKelilingTrapesium);
        luas = (Button)findViewById(R.id.HitungLuasTrapesium);

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sisi1keliling.getText().length() == 0 || sisi2keliling.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                s1keliling = Double.parseDouble(sisi1keliling.getText().toString());
                s2keliling = Double.parseDouble(sisi2keliling.getText().toString());
                smiringkeliling = Double.parseDouble(sisimiringkeliling.getText().toString());
                jumlahkeliling = (2*smiringkeliling) + s1keliling + s2keliling;
                hasilkeliling.setText(String.valueOf(jumlahkeliling));
            }
        });

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sisi1luas.getText().length() == 0 || sisi2luas.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                s1luas = Double.parseDouble(sisi1luas.getText().toString());
                s2luas = Double.parseDouble(sisi2luas.getText().toString());
                tluas = Double.parseDouble(tinggiluas.getText().toString());
                jumlahluas = (s1luas + s2luas) * tluas / 2;
                hasilluas.setText(String.valueOf(jumlahluas));
            }
        });

    }
}