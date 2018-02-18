package com.example.android.brianargya_1202154189_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    // deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika menjalankan activity yang dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 1; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Bubur");
            foods.add("Nasi Goreng");
            foods.add("Nasi Kuning");
            foods.add("Soto Ayam");

            // memanggil harga
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(20000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.bubur);
            photos.add(R.drawable.nasigoreng);
            photos.add(R.drawable.nasikuning);
            photos.add(R.drawable.sotoayam);
        }
    }
}
