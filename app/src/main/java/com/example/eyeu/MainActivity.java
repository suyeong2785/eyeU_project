package com.example.eyeu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button oldEyeButton;
    Button playButton;
    Button imageButton;
    Button lightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oldEyeButton = findViewById(R.id.oldEyeButton);
        playButton = findViewById(R.id.playButton);
        imageButton = findViewById(R.id.imageButton);
        lightButton = findViewById(R.id.lightButton);

        oldEyeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,oldeye_activity.class);
                startActivity(intent);
            }
        });
    }



}