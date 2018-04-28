package com.example.ux32vd.geofunny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ux32vd.geofunny.DeklarasiMenuBangunDatar;
import com.example.ux32vd.geofunny.R;
import com.example.ux32vd.geofunny.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MenuBangunRuang extends AppCompatActivity {

    List<DeklarasiMenuBangunDatar> listMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bangun_datar);

        listMenu = new ArrayList<>();
        listMenu.add(new DeklarasiMenuBangunDatar("Kubus", "Rumus Luas Permukaan = 6 x (sisi x sisi \nRumus Volume = sisi x sisi x sisi", "Kubus adalah bangun ruang tiga dimensi yang dibatasi oleh enam bidang sisi yang kongruen berbentuk bujur sangkar. Kubus memiliki 6 sisi, 12 rusuk dan 8 titik sudut. Kubus juga disebut bidang enam beraturan, selain itu juga merupakan bentuk khusus dalam prisma segiempat." ,R.drawable.kubus));
        listMenu.add(new DeklarasiMenuBangunDatar("Balok", "Rumus Luas Permukaan = 2 x {(pxl) + (pxt) + (lxt)} \nRumus Volume = panjang x lebar x tinggi", "Balok adalah bangun ruang tiga dimensi yang dibentuk oleh tiga pasang persegi atau persegi panjang, dengan paling tidak satu pasang di antaranya berukuran berbeda. Balok memiliki 6 sisi, 12 rusuk dan 8 titik sudut. Balok yang dibentuk oleh enam persegi sama dan sebangun disebut sebagai kubus." ,R.drawable.balok));
        listMenu.add(new DeklarasiMenuBangunDatar("Limas Segi Empat", "Rumus Luas Permukaan = luas alas + jumlah luas sisi tegak \nRumus Volume = ⅓ x luas alas x tinggi", "Limas adalah bangun ruang tiga dimensi yang dibatasi oleh alas berbentuk segi-n dan sisi-sisi tegak berbentuk segitiga. Limas memiliki n + 1 sisi, 2n rusuk dan n + 1 titik sudut. Limas dengan alas berupa persegi disebut juga piramida." ,R.drawable.pyramid));
        listMenu.add(new DeklarasiMenuBangunDatar("Prisma", "Rumus Luas Permukaan = (2 x luas alas)+(Keliling alas x tinggi)\nRumus Volume = luas alas x tinggi", "Prisma adalah bangun ruang tiga dimensi yang dibatasi oleh alas dan tutup identik berbentuk segi-n dan sisi-sisi tegak berbentuk persegi atau persegi panjang. Dengan kata lain prisma adalah bangun ruang yang mempunyai penampang melintang yang selalu sama dalam bentuk dan ukuran." ,R.drawable.prisma));
        listMenu.add(new DeklarasiMenuBangunDatar("Tabung", "Rumus Luas Permukaan = 2 x π x r x (r+tinggi)\nRumus Volume = π x r2 x tinggi", "Tabung atau silinder adalah bangun ruang tiga dimensi yang dibentuk oleh dua buah lingkaran identik yang sejajar dan sebuah persegi panjang yang mengelilingi kedua lingkaran tersebut. Tabung memiliki 3 sisi dan 2 rusuk." ,R.drawable.tabung));
        listMenu.add(new DeklarasiMenuBangunDatar("Bola", "Rumus Luas Permukaan = 4 x π x r2 \nRumus Volume = 4/3 x π x r3", "Bola adalah bangun ruang tiga dimensi yang dibentuk oleh tak hingga lingkaran berjari-jari sama panjang dan berpusat pada satu titik yang sama. Bola hanya memiliki 1 sisi." ,R.drawable.sphere));
        listMenu.add(new DeklarasiMenuBangunDatar("Kerucut", "Rumus Luas Permukaan = Luas Alas + Luas selimut, atau (π x r x r) + (π x r x s) \nRumus Volume = ⅓ x luas alas x tinggi", "Kerucut adalah sebuah limas istimewa yang beralas lingkaran. Kerucut memiliki 2 sisi dan 1 rusuk. Sisi tegak kerucut tidak berupa segitiga tapi berupa bidang miring yang disebut selimut kerucut." ,R.drawable.kerucut));



        RecyclerView myrv = (RecyclerView) findViewById(R.id.RecyclerView_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,listMenu);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);


    }
}
