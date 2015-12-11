package com.example.aswanth.app4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ArrayList<String> data=new ArrayList<>();
        data.add("a");
        data.add("b");
        data.add("c");
        data.add("d");
        data.add("e");
        data.add("f");
        data.add("g");
        data.add("h");
        data.add("i");

        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recyler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new listadapter(data));
    }
}
