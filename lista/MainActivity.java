package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText text = findViewById(R.id.textoId);
        Button button = findViewById(R.id.boton);
        ListView list = findViewById(R.id.lista);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Manzana");
        arrayList.add("Pera");
        arrayList.add("Coco");
        arrayList.add("Mango");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,arrayList);
        list.setAdapter(adapter);
       }
}