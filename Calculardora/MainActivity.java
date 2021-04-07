package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {
    Button sumar;
    Button restar;
    Button multiplicar;
    Button dividir;
    EditText numero1;
    EditText numero2;
    EditText resultado;
    int result;
    int num1;
    int num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumar = findViewById(R.id.sumar);
        restar = findViewById(R.id.restar);
        multiplicar = findViewById(R.id.multiplicar);
        dividir = findViewById(R.id.dividir);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        resultado = findViewById(R.id.resultado);

        sumar.setOnClickListener(v -> {
            num1 = Integer.parseInt(valueOf(numero1.getText()));
            num2 = Integer.parseInt(valueOf(numero2.getText()));
            result = num1 + num2;
            resultado.setText(valueOf(result));
        });
        restar.setOnClickListener(v -> {
            num1 = Integer.parseInt(valueOf(numero1.getText()));
            num2 = Integer.parseInt(valueOf(numero2.getText()));
            result = num1 - num2;
            resultado.setText(valueOf(result));
        });
        multiplicar.setOnClickListener(v -> {
            num1 = Integer.parseInt(valueOf(numero1.getText()));
            num2 = Integer.parseInt(valueOf(numero2.getText()));
            result = num1 * num2;
            resultado.setText(valueOf(result));
        });
        dividir.setOnClickListener(v -> {
            num1 = Integer.parseInt(valueOf(numero1.getText()));
            num2 = Integer.parseInt(valueOf(numero2.getText()));
            result = num1 / num2;
            resultado.setText(valueOf(result));
        });

    }
}