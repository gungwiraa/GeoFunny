package com.example.ux32vd.geofunny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {

    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        button3 = (Button)findViewById(R.id.button3);

        button3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(MenuUtama.this,MenuBangunDatar.class);
                startActivity(go);
            }
        });

        button4 = (Button)findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent (MenuUtama.this,MenuBangunRuang.class);
                startActivity(go);
            }
        });

    }
}
