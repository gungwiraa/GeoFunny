package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungPersegi extends AppCompatActivity {

    private TextView hasilkeliling, hasilluas;
    private EditText sisikeliling, sisiluas;
    private Button keliling, luas;

    double jumlahkeliling, jumlahluas;
    double skeliling, sluas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_persegi);

        hasilkeliling = (TextView)findViewById(R.id.hasilKelilingPersegi);
        hasilluas = (TextView)findViewById(R.id.hasilLuasPersegi);

        sisikeliling = (EditText)findViewById(R.id.SisiKelilingPersegi);
        sisiluas = (EditText)findViewById(R.id.SisiLuasPersegi);

        keliling = (Button)findViewById(R.id.HitungKelilingPersegi);
        luas = (Button)findViewById(R.id.HitungLuasPersegi);

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sisikeliling.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                skeliling = Double.parseDouble(sisikeliling.getText().toString());
                jumlahkeliling = 4*skeliling;
                hasilkeliling.setText(String.valueOf(jumlahkeliling));
            }
        });

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sisiluas.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                sluas = Double.parseDouble(sisiluas.getText().toString());
                jumlahluas = sluas * sluas;
                hasilluas.setText(String.valueOf(jumlahluas));
            }
        });

    }
}
