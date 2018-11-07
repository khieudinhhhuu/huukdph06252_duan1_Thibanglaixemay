package com.khieuthichien.thibanglaixemay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    private ImageView imgthisathach;
    private ImageView imghoclythuyet;
    private ImageView imgcacbienbao;
    private ImageView imgmeoghinho;
    private ImageView imgchiaseungdung;
    private ImageView imggioithieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        imgthisathach = findViewById(R.id.imgthisathach);
        imghoclythuyet = findViewById(R.id.imghoclythuyet);
        imgcacbienbao = findViewById(R.id.imgcacbienbao);
        imgmeoghinho = findViewById(R.id.imgmeoghinho);
        imgchiaseungdung = findViewById(R.id.imgchiaseungdung);
        imggioithieu = findViewById(R.id.imggioithieu);

        imghoclythuyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, HoclythuyetActivity.class));
            }
        });

    }
}
