package com.example.rabbihasan.secondapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView=new TextView(this);
        textView.setText("Wow RAbbi! I am a Student of Daffodil international university");
        textView.setTextSize(40);
        textView.setTextColor(Color.GREEN);
        textView.setMaxLines(2);
        setContentView(textView);
    }
}
