package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungSegitiga extends AppCompatActivity {

    private TextView hasilkeliling, hasilluas;
    private EditText sisikeliling, alasluas, tinggiluas;
    private Button keliling, luas;

    double jumlahkeliling, jumlahluas;
    double skeliling, aluas, tluas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_segitiga);

        hasilkeliling = (TextView)findViewById(R.id.hasilKelilingSegitiga);
        hasilluas = (TextView)findViewById(R.id.hasilLuasSegitiga);

        sisikeliling = (EditText)findViewById(R.id.SisiKelilingSegitiga);
        alasluas = (EditText)findViewById(R.id.AlasLuasSegitiga);
        tinggiluas = (EditText)findViewById(R.id.TinggiLuasSegitiga);

        keliling = (Button)findViewById(R.id.HitungKelilingSegitiga);
        luas = (Button)findViewById(R.id.HitungLuasSegitiga);

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sisikeliling.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                skeliling = Double.parseDouble(sisikeliling.getText().toString());
                jumlahkeliling = 3*skeliling;
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
