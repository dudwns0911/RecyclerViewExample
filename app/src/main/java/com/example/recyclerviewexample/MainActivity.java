package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movie> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            list.add(new Movie(getDrawable(R.drawable.ic_launcher_background),"hello"));
        }

        RecyclerView recyclerView = findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter =new MyAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}
