package com.example.paceshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Accessories_2 extends AppCompatActivity {
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
        setContentView(R.layout.activity_accessories_2);

        pindahHal2 = findViewById(R.id.ciputninjars1);
        pindahHal3 = findViewById(R.id.ciputninjars2);
        pindahHal4= findViewById(R.id.mansetleher);
        pindahHal5= findViewById(R.id.inerbasic);
        pindahHal6= findViewById(R.id.innerrajut);
        pindahHal7= findViewById(R.id.ineerrajut2);
        pindahHal8= findViewById(R.id.tuspinrose);
        pindahHal9= findViewById(R.id.jepit);



        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, Ciput_Ninja_Resleting1.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, ciput_ninja_resleting2.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, manset_leher.class);
                startActivity(i);
            }
        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, iner_basic.class);
                startActivity(i);
            }
        });
        pindahHal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, ineer_rajut.class);
                startActivity(i);
            }
        });

        pindahHal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, Inner_Rajut_2warna.class);
                startActivity(i);
            }
        });
        pindahHal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, Tuspin_Rose.class);
                startActivity(i);
            }
        });
        pindahHal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Accessories_2.this, Jepit_Korea.class);
                startActivity(i);
            }
        });


    }

    public void openActivity5(View view) {
        Intent intent = new Intent(this, Accessories_2.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
