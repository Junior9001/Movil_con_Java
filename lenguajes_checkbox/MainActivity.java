package com.example.lenguajes_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox java, go1,kotlin,javascript,ccmas,python,scala,swift,ruby,dart;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        java = findViewById(R.id.jv);
        go1 = findViewById(R.id.go);
        kotlin = findViewById(R.id.kn);
        javascript = findViewById(R.id.js);
        ccmas = findViewById(R.id.cc);
        python = findViewById(R.id.pn);
        scala = findViewById(R.id.sl);
        swift = findViewById(R.id.st);
        ruby = findViewById(R.id.rb);
        dart = findViewById(R.id.dt);
        button = findViewById(R.id.bn);
        Acction();
    }

    private void Acction(){
        button.setOnClickListener(v -> {
            Ver();
        });
    }
    private void Ver(){
        String ver = "";
        Toast toast;
        if(java.isChecked()){
            ver = ver+" 'Java'";
        }
        if(go1.isChecked()){
            ver = ver+" 'Go'";
        }
        if(kotlin.isChecked()){
            ver = ver+" 'Kotlin'";
        }
        if(javascript.isChecked()){
            ver = ver+" 'Java Script'";
        }
        if(ccmas.isChecked()){
            ver = ver+" 'C/C++'";
        }
        if(python.isChecked()){
            ver = ver+" 'Python'";
        }
        if(scala.isChecked()){
            ver = ver+" 'Scala'";
        }
        if(swift.isChecked()){
            ver = ver+" 'Swift'";
        }
        if(ruby.isChecked()){
            ver = ver+" 'Ruby'";
        }
        if(dart.isChecked()){
            ver = ver+" 'Dart'";
        }
        if(ver == "") {
            ver = "No se seleccionó nada!";
        }
        toast = Toast.makeText(this,ver,Toast.LENGTH_SHORT);
        toast.show();
    }
}