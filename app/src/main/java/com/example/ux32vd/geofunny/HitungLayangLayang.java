package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungLayangLayang extends AppCompatActivity {

    private TextView hasilkeliling, hasilluas;
    private EditText sisi1keliling, sisi2keliling, diagonalluas, diagonal2luas;
    private Button keliling, luas;

    double jumlahkeliling, jumlahluas;
    double s1keliling, s2keliling, d1luas, d2luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_layang_layang);

        hasilkeliling = (TextView)findViewById(R.id.hasilKelilingLayang);
        hasilluas = (TextView)findViewById(R.id.hasilLuasLayang);

        sisi1keliling = (EditText)findViewById(R.id.Sisi1KelilingLayang);
        sisi2keliling = (EditText)findViewById(R.id.Sisi2KelilingLayang);
        diagonalluas = (EditText)findViewById(R.id.Diagonal1LuasLayang);
        diagonal2luas = (EditText)findViewById(R.id.Diagonal2LuasLayang);

        keliling = (Button)findViewById(R.id.HitungKelilingLayang);
        luas = (Button)findViewById(R.id.HitungLuasLayang);

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sisi1keliling.getText().length() == 0 || sisi2keliling.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                s1keliling = Double.parseDouble(sisi1keliling.getText().toString());
                s2keliling = Double.parseDouble(sisi2keliling.getText().toString());
                jumlahkeliling = 2*(s1keliling+s2keliling);
                hasilkeliling.setText(String.valueOf(jumlahkeliling));
            }
        });

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (diagonalluas.getText().length() == 0 || diagonal2luas.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                d1luas = Double.parseDouble(diagonalluas.getText().toString());
                d2luas = Double.parseDouble(diagonal2luas.getText().toString());
                jumlahluas = d1luas * d2luas / 2;
                hasilluas.setText(String.valueOf(jumlahluas));
            }
        });

    }
}
