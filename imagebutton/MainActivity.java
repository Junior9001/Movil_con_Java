package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton1 = findViewById(R.id.imageButton);

        imageButton1.setOnClickListener(v -> {
            Toast toast = Toast.makeText(this,"Esto es un texto de prueba",Toast.LENGTH_SHORT);
            toast.show();
        });
    }
}