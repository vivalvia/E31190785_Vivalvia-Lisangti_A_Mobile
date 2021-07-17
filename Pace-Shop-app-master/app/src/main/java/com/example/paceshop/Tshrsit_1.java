package com.example.paceshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Tshrsit_1 extends AppCompatActivity {
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
        setContentView(R.layout.activity_tshrsit_1);


        pindahHal2 = findViewById(R.id.plisketdustypink);
        pindahHal3 = findViewById(R.id.plisketsalmon);
        pindahHal4= findViewById(R.id.plisketgrey);
        pindahHal5= findViewById(R.id.plisketbata);
        pindahHal6= findViewById(R.id.plisketmustard);
        pindahHal7= findViewById(R.id.plisketarmy);
        pindahHal8= findViewById(R.id.plisketnavy);
        pindahHal9= findViewById(R.id.plisketdarkgrey);

        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, plisket_dustypink.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, plisket_salmon.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, plisket_grey.class);
                startActivity(i);
            }
        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, plisket_bata.class);
                startActivity(i);
            }
        });
        pindahHal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, plisket_mustard.class);
                startActivity(i);
            }
        });

        pindahHal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, plisket_army.class);
                startActivity(i);
            }
        });
        pindahHal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, plisket_navy.class);
                startActivity(i);
            }
        });

        pindahHal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tshrsit_1.this, plisket_darkgrey.class);
                startActivity(i);
            }
        });


    }
    public void openActivity4(View view) {
        Intent intent = new Intent(this, Tshrsit_1.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
