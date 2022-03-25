package com.example.cheemsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    ImageView ch1, ch2;
    TextView textView;
    TextView textView1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = findViewById(R.id.toggleButton);
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleButton.getText().toString().equals("OFF")){
                    ch2.setVisibility(View.INVISIBLE);
                    textView1.setVisibility(View.INVISIBLE);
                    ch1.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);
                }
                else{
                    ch2.setVisibility(View.VISIBLE);
                    textView1.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.INVISIBLE);
                    ch1.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}