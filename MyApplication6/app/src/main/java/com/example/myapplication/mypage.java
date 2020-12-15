package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mypage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
        ImageButton b1 = (ImageButton)findViewById(R.id.imageButton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton b2 = (ImageButton)findViewById(R.id.imageButton2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        write.class);
                startActivity(intent);
            }
        });
        ImageButton b3 = (ImageButton)findViewById(R.id.imageButton3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        list.class);
                startActivity(intent);
            }
        });
        ImageButton b4 = (ImageButton)findViewById(R.id.imageButton4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        chatt.class);
                startActivity(intent);
            }
        });
        ImageButton b5 = (ImageButton)findViewById(R.id.imageButton5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        mypage.class);
                startActivity(intent);
            }
        });
        ImageButton s3 = (ImageButton)findViewById(R.id.imageButton48);
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        setting.class);
                startActivity(intent);
            }
        });
        Button m1 = (Button)findViewById(R.id.mylike);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        mypage_like.class);
                startActivity(intent);
            }
        });
        Button m2 = (Button)findViewById(R.id.mysale);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                       mypage_sale.class);
                startActivity(intent);
            }
        });
        Button m23 = (Button)findViewById(R.id.mybuy);
        m23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        mypage_buy.class);
                startActivity(intent);
            }
        });
        Button m4 = (Button)findViewById(R.id.mysetting);
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        setting.class);
                startActivity(intent);
            }
        });
        Button m5 = (Button)findViewById(R.id.button10);
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        mypage_pro.class);
                startActivity(intent);
            }
        });
    }
}
