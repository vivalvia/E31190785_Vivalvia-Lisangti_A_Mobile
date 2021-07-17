package com.example.paceshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LongsPants_5 extends AppCompatActivity {

    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    LinearLayout pindahHal6;
    LinearLayout pindahHal7;
    LinearLayout pindahHal8;
    LinearLayout pindahHal9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longs_pants_5);

        pindahHal2 = findViewById(R.id.bellamaroon);
        pindahHal3 = findViewById(R.id.bellamauve);
        pindahHal4= findViewById(R.id.belladustypink);
        pindahHal5= findViewById(R.id.bellanavy);
        pindahHal6= findViewById(R.id.bellanude);
        pindahHal7= findViewById(R.id.bellaoceanblue);
        pindahHal8= findViewById(R.id.bellaarmy);
        pindahHal9= findViewById(R.id.bellakhaki);



        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LongsPants_5.this, bellasquare_maroon.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LongsPants_5.this, bellasquare_mauve.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LongsPants_5.this, bellasquare_dustypink.class);
                startActivity(i);
            }
        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LongsPants_5.this, bellasquare_navy.class);
                startActivity(i);
            }
        });
        pindahHal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LongsPants_5.this, bellasquare_nude.class);
                startActivity(i);
            }
        });

        pindahHal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LongsPants_5.this, bellasquare_oceanblue.class);
                startActivity(i);
            }
        });
        pindahHal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LongsPants_5.this, bellasquare_army.class);
                startActivity(i);
            }
        });
        pindahHal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LongsPants_5.this, bellasquare_khaki.class);
                startActivity(i);
            }
        });






    }
    public void openActivity6(View view) {
        Intent intent = new Intent(this, LongsPants_5.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
