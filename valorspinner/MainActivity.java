package com.example.valorspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button boton;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.button1);
        spinner = findViewById(R.id.spinn);

        ArrayList<Integer> datos = new ArrayList<>();

        for (int i = 1980; i < 2022; i++) {
            datos.add(i);
        }
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this,  android.R.layout.simple_spinner_item,datos);
        spinner.setAdapter(adapter);

        boton.setOnClickListener(this::onClick);
    }

    private void onClick(View v) {
        String texto = String.valueOf(spinner.getSelectedItem());
        Toast toast = Toast.makeText(this, texto, Toast.LENGTH_SHORT);
        toast.show();
    }
}