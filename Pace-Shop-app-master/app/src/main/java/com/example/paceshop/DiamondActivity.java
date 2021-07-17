package com.example.paceshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class DiamondActivity extends AppCompatActivity {

    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    LinearLayout pindahHal6;
    LinearLayout pindahHal7;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_diamond);

            pindahHal2 = findViewById(R.id.diamondtaro);
            pindahHal3 = findViewById(R.id.diamondnutella);
            pindahHal4= findViewById(R.id.diamondolive);
            pindahHal5= findViewById(R.id.diamondrosewood);
            pindahHal6= findViewById(R.id.diamondblack);
            pindahHal7= findViewById(R.id.diamondarmy);


            pindahHal2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(DiamondActivity.this, diamond_taro.class);
                    startActivity(i);
                }
            });
            pindahHal3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(DiamondActivity.this, diamond_nutella.class);
                    startActivity(i);
                }
            });
            pindahHal4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(DiamondActivity.this, diamond_olive.class);
                    startActivity(i);
                }
            });
            pindahHal5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(DiamondActivity.this, diamond_rosewood.class);
                    startActivity(i);
                }
            });
            pindahHal6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(DiamondActivity.this, diamond_black.class);
                    startActivity(i);
                }
            });

            pindahHal7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(DiamondActivity.this, diamond_army.class);
                    startActivity(i);
                }
            });




        }

        public void openActivity7(View view) {
            Intent intent = new Intent(this, com.example.paceshop.DiamondActivity.class);
            startActivity(intent);
        }
        @Override
        public void finish() {
            super.finish();
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        }
    }
