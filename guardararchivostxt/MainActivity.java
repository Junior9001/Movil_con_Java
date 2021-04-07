package com.example.guardararchivostxt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    private EditText editText1,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.edit1);
        editText2=findViewById(R.id.edit2);

    }
    public void Grabar(View v) {
        String nomArchivo=editText1.getText().toString();
        nomArchivo=nomArchivo.replace('/','-');
        try {
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(
                    nomArchivo, Activity.MODE_PRIVATE));
            archivo.write(editText1.getText().toString());
            archivo.flush();
            archivo.close();
        } catch (IOException e) {
        }
        Toast t = Toast.makeText(this, "Los datos fueron grabados",
                Toast.LENGTH_SHORT); t.show();
        editText1.setText("");
        editText2.setText("");
    }
    public void Recuperar(View v) {
        String nomArchivo=editText1.getText().toString();
        nomArchivo=nomArchivo.replace('/','-');
        boolean enco=false;
        String[] archivos = fileList();
        for (int f = 0; f < archivos.length; f++)
            if (nomArchivo.equals(archivos[f]))
                enco= true;
        if (enco==true) {
            try {
                InputStreamReader archivo = new InputStreamReader(
                        openFileInput(nomArchivo));
                BufferedReader br = new BufferedReader(archivo);
                String linea = br.readLine();
                String todo = "";
                while (linea != null) {
                    todo = todo + linea + "\n";
                    linea = br.readLine();
                }
                br.close();
                archivo.close();
                editText2.setText(todo);
            } catch (IOException e) {
            }
        } else
        { Toast.makeText(this,"No hay datos grabados para dicha fecha",
                Toast.LENGTH_LONG).show();
            editText2.setText("");
        }
    }
}