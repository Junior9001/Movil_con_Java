package com.example.pasoactivitries;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class ShowSite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        WebView mostrar = findViewById(R.id.visible_removing_fragment_view_tag);
        Button button = findViewById(R.id.button2);
        Bundle bundle = getIntent().getExtras();
        mostrar.loadUrl("https://"+bundle.getString("adress"));
        button.setOnClickListener(v -> {
            finish();
        });
    }
}