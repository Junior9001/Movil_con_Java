package com.example.refershardemail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.campo);
        button1 = findViewById(R.id.button);

        cargarPreferencia();
        eventClickButton();

    }

    private void eventClickButton(){
        button1.setOnClickListener(v -> {
            SharedPreferences preferences = getSharedPreferences("Email",MODE_PRIVATE);
            String email = editText.getText().toString();
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("correo",email);
            editor.commit();
            System.exit(0);
        });
    }

    private void cargarPreferencia(){
        SharedPreferences preferences = getSharedPreferences("Email",MODE_PRIVATE);
        String email = preferences.getString("correo","No hay nada.");
        editText.setText(email);
    }
}