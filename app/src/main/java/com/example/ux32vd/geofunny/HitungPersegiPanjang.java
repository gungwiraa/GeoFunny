package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungPersegiPanjang extends AppCompatActivity {

    private TextView hasilkeliling, hasilluas;
    private EditText panjangkeliling, lebarkeliling, panjangluas, lebarluas;
    private Button keliling, luas;

    double jumlahkeliling, jumlahluas;
    double pkeliling, lkeliling, pluas, lluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_persegi_panjang);

        hasilkeliling = (TextView)findViewById(R.id.hasilKelilingPersegiPanjang);
        hasilluas = (TextView)findViewById(R.id.hasilLuasPersegiPanjang);

        panjangkeliling= (EditText)findViewById(R.id.PanjangKelilingPersegiPanjang);
        lebarkeliling = (EditText)findViewById(R.id.LebarKelilingPersegiPanjang);
        panjangluas = (EditText)findViewById(R.id.PanjangLuasPersegiPanjang);
        lebarluas = (EditText)findViewById(R.id.LebarLuasPersegiPanjang);

        keliling = (Button)findViewById(R.id.HitungKelilingPersegiPanjang);
        luas = (Button)findViewById(R.id.HitungLuasPersegiPanjang);

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (panjangkeliling.getText().length() == 0 || lebarkeliling.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                pkeliling = Double.parseDouble(panjangkeliling.getText().toString());
                lkeliling = Double.parseDouble(lebarkeliling.getText().toString());
                jumlahkeliling = 2*(pkeliling+lkeliling);
                hasilkeliling.setText(String.valueOf(jumlahkeliling));
            }
        });

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (panjangluas.getText().length() == 0 || lebarluas.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Kolom Perhitungan Belum Lengkap", Toast.LENGTH_SHORT).show();
                    return;
                }

                pluas = Double.parseDouble(panjangluas.getText().toString());
                lluas = Double.parseDouble(lebarluas.getText().toString());
                jumlahluas = pluas * lluas;
                hasilluas.setText(String.valueOf(jumlahluas));
            }
        });

    }
}