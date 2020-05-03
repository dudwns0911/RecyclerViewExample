package com.example.recyclerviewexample;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Movie {
    Drawable drawable;
    String text;

    public Movie(Drawable drawable, String text) {
        this.drawable = drawable;
        this.text = text;
    }
}
