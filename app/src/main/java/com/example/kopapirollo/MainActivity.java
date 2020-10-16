package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int geperedmeny, eneredmeny, valasztas;
    private Button btnKo, btnPapir, btnOllo;
    private TextView gepvegeredmeny, envegeredmeny;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnKo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valasztas=0;

            }
        });
        btnPapir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valasztas=1;
            }
        });
        btnOllo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valasztas=2;
            }
        });

    }
}