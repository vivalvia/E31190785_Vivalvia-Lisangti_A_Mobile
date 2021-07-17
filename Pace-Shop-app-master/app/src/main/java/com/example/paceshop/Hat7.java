package com.example.paceshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Hat7 extends AppCompatActivity {
    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    LinearLayout pindahHal6;
    LinearLayout pindahHal7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hat7);


        pindahHal2 = findViewById(R.id.dollnavy);
        pindahHal3 = findViewById(R.id.dollwhite);
        pindahHal4= findViewById(R.id.dollbone);
        pindahHal5= findViewById(R.id.dollsilver);
        pindahHal6= findViewById(R.id.dolllightcream);
        pindahHal7= findViewById(R.id.dollpeach);


        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hat7.this, cerutybabydoll_navy.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hat7.this, cerutybabydoll_white.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hat7.this, cerutybabydoll_bone.class);
                startActivity(i);
            }
        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hat7.this, cerutybabydoll_silver.class);
                startActivity(i);
            }
        });
        pindahHal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hat7.this, cerutybabydoll_lightcream.class);
                startActivity(i);
            }
        });

        pindahHal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hat7.this, cerutybabydoll_peach.class);
                startActivity(i);
            }
        });



    }

    public void openActivity7(View view) {
        Intent intent = new Intent(this, Hat7.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
