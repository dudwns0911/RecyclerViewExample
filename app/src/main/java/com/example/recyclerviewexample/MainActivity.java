package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie(getDrawable(R.drawable.image1), "영화1"));
        list.add(new Movie(getDrawable(R.drawable.image2), "영화2"));
        list.add(new Movie(getDrawable(R.drawable.image3), "영화3"));
        list.add(new Movie(getDrawable(R.drawable.image4), "영화4"));
        list.add(new Movie(getDrawable(R.drawable.image5), "영화5"));
        list.add(new Movie(getDrawable(R.drawable.image6), "영화6"));
        list.add(new Movie(getDrawable(R.drawable.image7), "영화7"));
        list.add(new Movie(getDrawable(R.drawable.image8), "영화8"));
        list.add(new Movie(getDrawable(R.drawable.image9), "영화9"));
        list.add(new Movie(getDrawable(R.drawable.image10), "영화10"));


        RecyclerView recyclerView = findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        MyAdapter adapter =new MyAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}
