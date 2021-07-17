package com.example.paceshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class CrinkleActivity extends AppCompatActivity {

    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    LinearLayout pindahHal6;
    LinearLayout pindahHal7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crinkle);

        pindahHal2 = findViewById(R.id.rawisdarkgrey);
        pindahHal3 = findViewById(R.id.rawismaroon);
        pindahHal4= findViewById(R.id.rawismint);
        pindahHal5= findViewById(R.id.rawishoney);
        pindahHal6= findViewById(R.id.rawisfosil);
        pindahHal7= findViewById(R.id.rawisjeans);


        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CrinkleActivity.this, crinkle_darkgrey.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CrinkleActivity.this, crinkle_maroon.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CrinkleActivity.this, crinkle_mint.class);
                startActivity(i);
            }
        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CrinkleActivity.this, crinkle_honey.class);
                startActivity(i);
            }
        });
        pindahHal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CrinkleActivity.this, crinkle_fosil.class);
                startActivity(i);
            }
        });
        pindahHal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CrinkleActivity.this, crinkle_jeans.class);
                startActivity(i);
            }
        });




    }

    public void openActivity7(View view) {
        Intent intent = new Intent(this, CrinkleActivity.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
