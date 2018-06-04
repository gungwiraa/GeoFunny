package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungBelahKetupat extends AppCompatActivity {

    private TextView hasilkeliling, hasilluas;
    private EditText sisikeliling, diagonal1luas, diagonal2luas;
    private Button keliling, luas;

    double jumlahkeliling, jumlahluas;
    double skeliling, d1luas, d2luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_belah_ketupat);
        hasilkeliling = (TextView)findViewById(R.id.hasilKelilingDiamond);
        hasilluas = (TextView)findViewById(R.id.hasilLuasDiamond);

        sisikeliling = (EditText)findViewById(R.id.SisiKelilingDiamond);
        diagonal1luas = (EditText)findViewById(R.id.Diagonal1LuasDiamond);
        diagonal2luas = (EditText)findViewById(R.id.Diagonal2LuasDiamond);

        keliling = (Button)findViewById(R.id.HitungKelilingDiamond);
        luas = (Button)findViewById(R.id.HitungLuasDiamond);

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sisikeliling.getText().length() == 0 ){
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

                if (diagonal1luas.getText().length() == 0 || diagonal2luas.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                d1luas = Double.parseDouble(diagonal1luas.getText().toString());
                d2luas = Double.parseDouble(diagonal2luas.getText().toString());
                jumlahluas = d1luas * d2luas / 2;
                hasilluas.setText(String.valueOf(jumlahluas));
            }
        });

    }
}
