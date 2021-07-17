package com.example.paceshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class pashmina_emboss_lilac extends AppCompatActivity {

    LinearLayout pindahHal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pashmina_emboss_lilac);


        pindahHal1 =findViewById(R.id.addtochart);


        pindahHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pashmina_emboss_lilac.this, transaksi.class);
                startActivity(i);
            }
        });
    }
}