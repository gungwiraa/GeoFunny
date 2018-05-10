package com.example.ux32vd.geofunny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerViewBangunDatar extends AppCompatActivity {

        private TextView tvtype, tvdeskripsi, tvrumus;
        private ImageView img;
        private Button btnHitung;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_recycler_view_bangun_datar);

            final String nama_bangun = getIntent().getStringExtra("NamaBangun");

            tvtype = (TextView) findViewById(R.id.bangundatartype);
            tvdeskripsi = (TextView) findViewById(R.id.bangundatardeskripsi);
            tvrumus = (TextView) findViewById(R.id.bangundatarrumus);
            img = (ImageView) findViewById(R.id.bangundatarthumbnail);
            btnHitung = findViewById(R.id.buttonhitung);

            //Menerima data

            Intent intent = getIntent();
            String Type = intent.getExtras().getString("Type");
            String Rumus = intent.getExtras().getString("Rumus");
            String Deskripsi = intent.getExtras().getString("Description");
            int image = intent.getExtras().getInt("Thumbnail");

            // pengaturan values

            tvtype.setText(Type);
            tvrumus.setText(Rumus);
            tvdeskripsi.setText(Deskripsi);
            img.setImageResource(image);

            //intent menu perhitungan bangun datar dan bangun ruang
            btnHitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //menu bangun datar
                    if (nama_bangun.equals("persegi")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungPersegi.class);
                        startActivity(go);
                    }else if(nama_bangun.equals("persegi panjang")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungPersegiPanjang.class);
                        startActivity(go);
                    }
                    else if(nama_bangun.equals("lingkaran")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungLingkaran.class);
                        startActivity(go);
                    }
                    else if(nama_bangun.equals("segitiga")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungSegitiga.class);
                        startActivity(go);
                    }
                    else if(nama_bangun.equals("trapesium")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungTrapesium.class);
                        startActivity(go);
                    }
                    else if(nama_bangun.equals("jajar genjang")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungJajarGenjang.class);
                        startActivity(go);
                    }
                    else if(nama_bangun.equals("belah ketupat")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungBelahKetupat.class);
                        startActivity(go);
                    }
                    else if(nama_bangun.equals("layang layang")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungLayangLayang.class);
                        startActivity(go);
                    }
                    //menu bangun ruang
                    else if(nama_bangun.equals("kubus")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungKubus.class);
                        startActivity(go);
                    }
                    else if(nama_bangun.equals("balok")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungBalok.class);
                        startActivity(go);
                    }
                    else if(nama_bangun.equals("limas")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungLimas.class);
                        startActivity(go);
                    }
                    else if(nama_bangun.equals("prisma")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungPrisma.class);
                        startActivity(go);
                    }
                    else if(nama_bangun.equals("tabung")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungTabung.class);
                        startActivity(go);
                    }
                    else if(nama_bangun.equals("bola")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungBola.class);
                        startActivity(go);
                    }
                    else if(nama_bangun.equals("kerucut")){
                        Intent go = new Intent(RecyclerViewBangunDatar.this,HitungKerucut.class);
                        startActivity(go);
                    }
                }
            });
        }
    }
