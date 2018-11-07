package com.khieuthichien.thibanglaixemay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class HoclythuyetActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView imgback;
    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoclythuyet);

        toolbar = findViewById(R.id.toolbar);
        imgback = findViewById(R.id.imgback);
        recyclerview = findViewById(R.id.recyclerview);

    }
}
