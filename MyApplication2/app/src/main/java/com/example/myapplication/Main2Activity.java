package com.example.myapplication;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView textView = (TextView)findViewById(R.id.textView14);
        Spinner spinner = (Spinner)findViewById(R.id.spinner5);

        spinner.SetOnItemSelectedListener(new AdapterView<?> parent,View view, int positon, long id ){
            textView.setText();
        }
    }
}
