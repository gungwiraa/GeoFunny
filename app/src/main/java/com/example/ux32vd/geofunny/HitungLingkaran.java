package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungLingkaran extends AppCompatActivity {

    private TextView hasilkeliling, hasilluas;
    private EditText diameterkeliling, jariluas;
    private Button keliling, luas;

    double jumlahkeliling, jumlahluas;
    double dkeliling, jluas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_lingkaran);

        hasilkeliling = (TextView)findViewById(R.id.hasilKelilingLingkaran);
        hasilluas = (TextView)findViewById(R.id.hasilLuasLingkaran);

        diameterkeliling = (EditText)findViewById(R.id.DiameterKelilingLingkaran);
        jariluas = (EditText)findViewById(R.id.JariLuasLingkaran);

        keliling = (Button)findViewById(R.id.HitungKelilingLingkaran);
        luas = (Button)findViewById(R.id.HitungLuasLingkaran);

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dkeliling = Double.parseDouble(diameterkeliling.getText().toString());
                jumlahkeliling = 3.14*dkeliling;
                hasilkeliling.setText(String.valueOf(jumlahkeliling));
            }
        });

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jluas = Double.parseDouble(jariluas.getText().toString());
                jumlahluas = 3.14 * jluas * jluas;
                hasilluas.setText(String.valueOf(jumlahluas));
            }
        });

    }
}

