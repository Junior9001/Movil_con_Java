package com.example.lenguajesanio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SizeF;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.leng);
        String[] lenguaje = {"Java","C Sharp","Kotlin","Python","PHP"};
        String[] info = {"Lanzado en 1992 y creado por Sun Mitrosistem","Lanzado en 1993 creado por Paul"
                ,"Lanzado en 2013, creado por Jet Brains","1992, Michio Kacu","1995 por Marcos Liz"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,lenguaje);
        listView.setAdapter(adapter);
        listView.setOnItemLongClickListener((parent, view, position, id) ->  {
            int i = (int) listView.getItemIdAtPosition((int)id);
            String salida = info[i];
            Toast toast = Toast.makeText(this,salida,Toast.LENGTH_SHORT);
            toast.show();
            return true;
        });
    }
}