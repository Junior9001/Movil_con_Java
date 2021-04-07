package com.example.moneda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText valor;
    EditText result;
    RadioButton euro,dolarEstadounidense,libraEsterlina,francoSuizo,yenJapones,dolarHoncones;
    Button button;
    double num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Componentes();
        Accion();

    }
    private void Componentes(){
        valor = findViewById(R.id.entrada);
        dolarEstadounidense = findViewById(R.id.dolarEstadounidense);
        libraEsterlina = findViewById(R.id.libraEsterlina);
        francoSuizo = findViewById(R.id.francoSuizo);
        yenJapones = findViewById(R.id.yenJapones);
        dolarHoncones = findViewById(R.id.dolarHoncones);
        result = findViewById(R.id.respuesta);
        euro = findViewById(R.id.euro);
        button = findViewById(R.id.boton);

    }
   private void Accion(){
       button.setOnClickListener(evento ->{
           if(valor.getText().toString().trim().equalsIgnoreCase("")){
               Toast toast = Toast.makeText(this, "Debe llenar el campo.", Toast.LENGTH_SHORT);
               toast.show();
           }
           else if(dolarEstadounidense.isChecked()){
               num1 = Double.valueOf(valor.getText().toString());
               num2 = num1/58.5;
               result.setText(String.valueOf(num2));
           }
           else if(libraEsterlina.isChecked()){
               num1 = Double.valueOf(valor.getText().toString());
               num2 = num1/80.18;
               result.setText(String.valueOf(num2));
           }
           else if(francoSuizo.isChecked()){
               num1 = Double.valueOf(valor.getText().toString());
               num2 = num1/62.02;
               result.setText(String.valueOf(num2));
           }
           else if(yenJapones.isChecked()){
               num1 = Double.valueOf(valor.getText().toString());
               num2 = num1/0.53;
               result.setText(String.valueOf(num2));
           }
           else if(dolarHoncones.isChecked()){
               num1 = Double.valueOf(valor.getText().toString());
               num2 = num1/7.42;
               result.setText(String.valueOf(num2));
           }
           else if(euro.isChecked()){
               num1 = Double.valueOf(valor.getText().toString());
               num2 = num1/68.59;
               result.setText(String.valueOf(num2));
           }
           else{
               Toast toast = Toast.makeText(this, "Debe seleccionar moneda.", Toast.LENGTH_SHORT);
               toast.show();
           }

       });
    }

}