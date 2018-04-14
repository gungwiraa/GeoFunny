package com.example.ux32vd.geofunny;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MenuBangunDatar extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bangun_datar);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }
        private void setToggleEvent (GridLayout mainGrid){
        for(int i=0;i<mainGrid.getChildCount();i++)
        {
            final CardView cardView = (CardView)mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(cardView.getCardBackgroundColor().getDefaultColor() == -1)
                    {
                        //change bg color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MenuBangunDatar.this, "Berhasil", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        //change bg color
                        cardView.setBackgroundColor(Color.parseColor("FFFFFF"));
                        Toast.makeText(MenuBangunDatar.this, "Gagal", Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }
        }

        private void setSingleEvent (GridLayout mainGrid){

        for(int i=0;i<mainGrid.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (finalI == 0) //open activity one
                    {
                        Intent intent = new Intent(MenuBangunDatar.this,MenuPersegi.class);
                        startActivity(intent);
                    }
                    else  if (finalI == 1) //open activity two
                    {
                        Intent intent = new Intent(MenuBangunDatar.this,MenuSegitiga.class);
                        startActivity(intent);
                    }
                    else  if (finalI == 2) //open activity three
                    {
                        Intent intent = new Intent(MenuBangunDatar.this,MenuPersegiPanjang.class);
                        startActivity(intent);
                    }
                    else  if (finalI == 3) //open activity four
                    {
                        Intent intent = new Intent(MenuBangunDatar.this,MenuTrapesium.class);
                        startActivity(intent);
                    }
                    else  if (finalI == 4) //open activity five
                    {
                        Intent intent = new Intent(MenuBangunDatar.this,MenuLingkaran.class);
                        startActivity(intent);
                    }
                    else  if (finalI == 5) //open activity six
                    {
                        Intent intent = new Intent(MenuBangunDatar.this,MenuLayangLayang.class);
                        startActivity(intent);
                    }
                    else  if (finalI == 6) //open activity seven
                    {
                        Intent intent = new Intent(MenuBangunDatar.this,MenuJajarGenjang.class);
                        startActivity(intent);
                    }
                    else  if (finalI == 7) //open activity eight
                    {
                        Intent intent = new Intent(MenuBangunDatar.this,MenuBelahKetupat.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(MenuBangunDatar.this,"Please", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
        }

}
