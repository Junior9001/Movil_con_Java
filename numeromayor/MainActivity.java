package com.example.numeromayor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText num1 = findViewById(R.id.numero1);
        EditText num2 = findViewById(R.id.numero2);
        Button button = findViewById(R.id.boton);

        button.setOnClickListener(v -> {
            double n1 = Double.valueOf(num1.getText().toString());
            double n2 = Double.valueOf(num2.getText().toString());
            double mayor;
            if(n1>=n2){
                mayor = n1;
            }else {
                mayor = n2;
            }
            Toast toast = Toast.makeText(this,"El mayor es: "+mayor,Toast.LENGTH_SHORT);
            toast.show();
        });

    }
}