package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class write_a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_a);
        ImageButton b10 = (ImageButton)findViewById(R.id.imageButton);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton b12 = (ImageButton)findViewById(R.id.imageButton2);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        write.class);
                startActivity(intent);
            }
        });
        ImageButton b13 = (ImageButton)findViewById(R.id.imageButton3);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        list.class);
                startActivity(intent);
            }
        });
        ImageButton b14 = (ImageButton)findViewById(R.id.imageButton4);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        chatt.class);
                startActivity(intent);
            }
        });
        ImageButton b15 = (ImageButton)findViewById(R.id.imageButton5);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        mypage.class);
                startActivity(intent);
            }
        });
        Button wa1 = (Button)findViewById(R.id.button7);
        wa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        write.class);
                startActivity(intent);
            }
        });
    }
}
