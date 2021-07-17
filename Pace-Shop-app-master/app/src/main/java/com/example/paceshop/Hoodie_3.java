package com.example.paceshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Hoodie_3 extends AppCompatActivity {

    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    LinearLayout pindahHal6;
    LinearLayout pindahHal7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoodie_3);

        pindahHal2 = findViewById(R.id.embossmint);
        pindahHal3 = findViewById(R.id.embossblack);
        pindahHal4= findViewById(R.id.embosslilac);
        pindahHal5= findViewById(R.id.embossgrey);
        pindahHal6= findViewById(R.id.embossdustypink);
        pindahHal7= findViewById(R.id.embossseaweed);


        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hoodie_3.this, pashmina_emboss_mint.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hoodie_3.this, pashmina_emboss_black.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hoodie_3.this, pashmina_emboss_lilac.class);
                startActivity(i);
            }
        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hoodie_3.this, pashmina_emboss_grey.class);
                startActivity(i);
            }
        });
        pindahHal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hoodie_3.this, pashmina_emboss_dustypink.class);
                startActivity(i);
            }
        });

        pindahHal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hoodie_3.this, PashminaEmboss_Seaweed.class);
                startActivity(i);
            }
        });

    }
    public void openActivity5(View view) {
        Intent intent = new Intent(this, Hoodie_3.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
