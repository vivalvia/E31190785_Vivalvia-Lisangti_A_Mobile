package com.example.paceshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Ciput_Ninja_Resleting1 extends AppCompatActivity {
    LinearLayout pindahHal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciput__ninja__resleting1);


        pindahHal1 =findViewById(R.id.addtochart);


        pindahHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ciput_Ninja_Resleting1.this, transaksi.class);
                startActivity(i);
            }
        });
    }
}