package com.example.pasoactivitries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText enlace = findViewById(R.id.adressId);
        Button button = findViewById(R.id.button1);
        //Button button3 = findViewById(R.id.button2);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),ShowSite.class);
            intent.putExtra("adress",enlace.getText().toString());
            startActivity(intent);
        });
    }
}