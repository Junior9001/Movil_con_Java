package com.example.paiseshabitantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lista = findViewById(R.id.list1);
        TextView habitantes = findViewById(R.id.textView);

        String[] paise = {"Rusia","Puerto Rico","Cuba","España","Japon"};
        String[] htantes = {"60,000,000","10,000,000","30,000,000","40,000,000","130,000,000"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,paise);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener((parent, view, position, id) -> {
              int i = (int) lista.getItemIdAtPosition((int)id);
              habitantes.setText(htantes[i]+" habitantes");

        });

    }
}