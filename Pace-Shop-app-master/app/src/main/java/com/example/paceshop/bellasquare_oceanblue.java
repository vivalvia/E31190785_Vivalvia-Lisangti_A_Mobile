package com.example.paceshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class bellasquare_oceanblue extends AppCompatActivity {
    LinearLayout pindahHal1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bellasquare_oceanblue);

        pindahHal1 =findViewById(R.id.addtochart);


        pindahHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(bellasquare_oceanblue.this, transaksi.class);
                startActivity(i);
            }
        });

    }
}