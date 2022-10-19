package com.example.petscare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button nButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init widget
        nButton = findViewById(R.id.nButton);
        nButton.setOnClickListener(view ->{
            Intent intent = new Intent(this, AddPetsActivity.class);
            startActivity(intent);
        });

    }
}