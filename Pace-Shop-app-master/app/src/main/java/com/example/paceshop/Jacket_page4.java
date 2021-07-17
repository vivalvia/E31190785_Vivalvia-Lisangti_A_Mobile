package com.example.paceshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Jacket_page4 extends AppCompatActivity {
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
        setContentView(R.layout.activity_jacket_page4);

        pindahHal2 = findViewById(R.id.squaresilver);
        pindahHal3 = findViewById(R.id.squarewardah);
        pindahHal4= findViewById(R.id.squaredove);
        pindahHal5= findViewById(R.id.squaremilo);
        pindahHal6= findViewById(R.id.squarevanilla);
        pindahHal7= findViewById(R.id.squaredeepblush);
        pindahHal8= findViewById(R.id.squarepeach);
        pindahHal9= findViewById(R.id.squareblack);


        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Jacket_page4.this, pashmina_square_sillver.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Jacket_page4.this, pashmina_square_wardah.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Jacket_page4.this, pashmina_square_dove.class);
                startActivity(i);
            }
        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Jacket_page4.this, pashmina_square_milo.class);
                startActivity(i);
            }
        });
        pindahHal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Jacket_page4.this, pashmina_square_vanilla.class);
                startActivity(i);
            }
        });

        pindahHal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Jacket_page4.this, pashmina_square_deepblush.class);
                startActivity(i);
            }
        });
        pindahHal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Jacket_page4.this, pashmina_square_peach.class);
                startActivity(i);
            }
        });
        pindahHal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Jacket_page4.this, pashmina_square_black.class);
                startActivity(i);
            }
        });



    }
    public void openActivity6(View view) {
        Intent intent = new Intent(this, Jacket_page4.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
