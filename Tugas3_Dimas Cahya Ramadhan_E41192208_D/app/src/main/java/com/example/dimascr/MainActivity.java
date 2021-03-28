package com.example.dimascr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.OneShotPreDrawListener;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton imgButton1, imgButton2, imgButton3, imgButton4, imgButton5, imgButton6, imgButton7,imgButton8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgButton1 = (ImageButton) findViewById(R.id.imageButton1);
        imgButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imgButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imgButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imgButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imgButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imgButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imgButton8 = (ImageButton) findViewById(R.id.imageButton8);

        imgButton1.setOnClickListener(this);
        imgButton2.setOnClickListener(this);
        imgButton3.setOnClickListener(this);
        imgButton4.setOnClickListener(this);
        imgButton5.setOnClickListener(this);
        imgButton6.setOnClickListener(this);
        imgButton7.setOnClickListener(this);
        imgButton8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.imageButton1 :
                i = new Intent(this, LinearLayoutActivity.class);
                startActivity(i);
                break;

            case R.id.imageButton2 :
                i = new Intent(this, RelativeLayoutActivity.class);
                startActivity(i);
                break;

            case R.id.imageButton3 :
                i = new Intent(this, ConstraintLayoutActivity.class);
                startActivity(i);
                break;

            case R.id.imageButton4 :
                i = new Intent(this, FrameLayoutActivity.class);
                startActivity(i);
                break;

            case R.id.imageButton5 :
                i = new Intent(this, TabelLayoutActivity.class);
                startActivity(i);
                break;

            case R.id.imageButton6 :
                i = new Intent(this, MaterialdesignLayoutActivity.class);
                startActivity(i);
                break;

            case R.id.imageButton7 :
                i = new Intent(this, ScrollviewverticalLayoutActivity.class);
                startActivity(i);
                break;

            case R.id.imageButton8 :
                i = new Intent(this, ScrollviewhorizontalLayoutActivity.class);
                startActivity(i);
                break;
        }

    }
}