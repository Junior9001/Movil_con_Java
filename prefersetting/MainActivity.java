package com.example.prefersetting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nombre,apellido,telefono,whatsapp,direccion,email;
    Button button;
    boolean vOF = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.nombre);
        apellido = findViewById(R.id.apellido);
        telefono = findViewById(R.id.telefono);
        whatsapp = findViewById(R.id.whatsapp);
        direccion = findViewById(R.id.direccion);
        email = findViewById(R.id.email);
        button = findViewById(R.id.button);
        cargarPreferencias();
        clickButton();
    }

    private void clickButton(){
        button.setOnClickListener(v -> {
            SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();

            String nombre = this.nombre.getText().toString();
            String apellido = this.apellido.getText().toString();
            String telefono = this.telefono.getText().toString();
            String whatsapp = this.whatsapp.getText().toString();
            String direccion = this.direccion.getText().toString();
            String email = this.email.getText().toString();
            boolean vOF = true;

            editor.putString("nombre",nombre);
            editor.putString("apellido",apellido);
            editor.putString("telefono",telefono);
            editor.putString("whatsapp",whatsapp);
            editor.putString("direccion",direccion);
            editor.putString("email",email);
            editor.putBoolean("estado",vOF);
            editor.commit();
            System.exit(0);
        });
    }

    private void cargarPreferencias(){
        SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
        String nombre = preferences.getString("nombre","");
        String apellido = preferences.getString("apellido","");
        String telefono = preferences.getString("telefono","");
        String whatsapp = preferences.getString("whatsapp","");
        String direccion = preferences.getString("direccion","");
        String email = preferences.getString("email","");
        boolean vOF = preferences.getBoolean("estado",false);

        if(vOF){
            this.nombre.setText(nombre);
            this.apellido.setText(apellido);
            this.telefono.setText(telefono);
            this.whatsapp.setText(whatsapp);
            this.direccion.setText(direccion);
            this.email.setText(email);
        }else {
            Toast.makeText(this,"No hay datos en PREFERENCIAS!",Toast.LENGTH_LONG).show();
        }
    }
}