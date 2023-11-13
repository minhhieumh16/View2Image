package com.example.viewimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button next, previous;
    int i = 0;
    private int [] textureArrayWin = {R.drawable.logo1, R.drawable.logo2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        previous = findViewById(R.id.btn_prev);
        next = findViewById(R.id.btn_next);

        if (i == 0){
            previous.setVisibility(View.GONE);
        }

        if (i == 2) {
            next.setVisibility(View.GONE);
        }

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(textureArrayWin[i]);
                i --;
                if (i == 0){
                    previous.setVisibility(View.GONE);
                } else {
                    previous.setVisibility(View.VISIBLE);
                }
                if (i == 2){
                    next.setVisibility(View.GONE);
                } else {
                    previous.setVisibility(View.VISIBLE);
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(textureArrayWin[i]);
                i ++;
                if (i == 0){
                    previous.setVisibility(View.GONE);
                } else {
                    previous.setVisibility(View.VISIBLE);
                }
                if (i == 2){
                    next.setVisibility(View.GONE);
                } else {
                    previous.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}