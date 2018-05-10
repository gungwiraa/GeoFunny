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

public class MenuBangunDatar extends AppCompatActivity {

    List<DeklarasiMenuBangunDatar> listMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bangun_datar);

        listMenu = new ArrayList<>();
        listMenu.add(new DeklarasiMenuBangunDatar("Persegi", "Rumus Keliling = 4 x sisi \nRumus Luas = sisi x sisi", "Persegi adalah bangun datar dua dimensi yang dibentuk oleh empat buah rusuk yang sama panjang dan memiliki empat buah sudut yang kesemuanya adalah sudut siku-siku. Bangun ini dahulu disebut sebagai bujur sangkar." ,R.drawable.persegi));
        listMenu.add(new DeklarasiMenuBangunDatar("Persegi Panjang", "Rumus Keliling = 2 x (panjang + lebar) \nRumus Luas = panjang x lebar", "Persegi panjang adalah bangun datar dua dimensi yang dibentuk oleh dua pasang rusuk yang masing-masing sama panjang dan sejajar dengan pasangannya, dan memiliki empat buah sudut yang kesemuanya adalah sudut siku-siku." ,R.drawable.persegipanjang));
        listMenu.add(new DeklarasiMenuBangunDatar("Lingkaran", "Rumus Keliling = ∏ x D \nRumus Luas = ∏ x r x r", "Lingkaran adalah himpunan semua titik di bidang datar yang berjarak sama dari suatu titik tetap di bidang tersebut. Titik tetap lingkaran itu dinamakan pusat lingkaran, sedangkan jarak dari suatu titik pada lingkaran ke titik pusat dinamakan jari-jari lingkaran." ,R.drawable.lingkaran));
        listMenu.add(new DeklarasiMenuBangunDatar("Segitiga", "Rumus Keliling = sisi + sisi + sisi \nRumus Luas = ½ x a x t", "Segitiga atau segi tiga adalah nama suatu bentuk yang dibuat dari tiga sisi yang berupa garis lurus dan tiga sudut. Matematikawan Euclid yang hidup sekitar tahun 300 SM menemukan bahwa jumlah ketiga sudut di suatu segi tiga pada bidang datar adalah 180 derajat. Hal ini memungkinkan kita menghitung besarnya salah satu sudut bila dua sudut lainnya sudah diketahui." ,R.drawable.segitiga));
        listMenu.add(new DeklarasiMenuBangunDatar("Trapesium", "Rumus Keliling = sisi + sisi + sisi + sisi \nRumus Luas = ½ x (jumlah sisi sejajar) x t", " Trapesium adalah bangun datar dua dimensi yang dibentuk oleh empat buah rusuk yang dua di antaranya saling sejajar namun tidak sama panjang. Trapesium yang rusuk ketiganya tegak lurus terhadap rusuk-rusuk sejajar disebut trapesium siku-siku." ,R.drawable.trapesium));
        listMenu.add(new DeklarasiMenuBangunDatar("Jajar Genjang", "Rumus Keliling = sisi + sisi + sisi + sisi \nRumus Luas = ½ x a x t", " Jajar genjang atau Jajaran genjang adalah bangun datar dua dimensi yang dibentuk oleh dua pasang rusuk yang masing-masing sama panjang dan sejajar dengan pasangannya, dan memiliki dua pasang sudut yang masing-masing sama besar dengan sudut di hadapannya." ,R.drawable.jajargenjang));
        listMenu.add(new DeklarasiMenuBangunDatar("Belah Ketupat", "Rumus Keliling = sisi + sisi + sisi + sisi \nRumus Luas = ½ x diagonal1 x diagonal2", " Belah ketupat (inggris rhombus) adalah bangun datar dua dimensi yang dibentuk oleh empat buah rusuk yang sama panjang, dan memiliki dua pasang sudut bukan siku-siku yang masing-masing sama besar dengan sudut di hadapannya.." ,R.drawable.diamond));
        listMenu.add(new DeklarasiMenuBangunDatar("Layang-Layang", " Rumus Keliling = sisi + sisi + sisi + sisi \nRumus Luas = ½ x diagonal1 x diagonal2", " adalah bangun datar dua dimensi yang dibentuk oleh dua pasang rusuk yang masing-masing pasangannya sama panjang dan saling membentuk sudut.Layang-layang dengan keempat rusuk yang sama panjang disebut belah ketupat." ,R.drawable.layanglayang));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.RecyclerView_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,listMenu);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);


    }
}
