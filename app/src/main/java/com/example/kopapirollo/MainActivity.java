package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView en, gep;
    private int geperedmeny=0, eneredmeny=0, valasztas, gepvalasztas;
    private Button btnKo, btnPapir, btnOllo;
    private TextView gepvegeredmeny, envegeredmeny;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnKo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valasztas=1;
                //TODO Random szam generalasa
                Random rn= new Random();
                gepvalasztas=rn.nextInt(3)+1;
                //TODO A gepvalasztasa utan eldontjuk ki nyer.
                if(gepvalasztas==2){
                    geperedmeny++;
                    gep.setImageDrawable(Drawable.createFromPath("@drawable/rock"));
                }
            }
        });
        btnPapir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valasztas=2;
            }
        });
        btnOllo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valasztas=3;
            }
        });

    }
    private void init(){
        en=findViewById(R.id.en);
        gep=findViewById(R.id.gep);
        btnPapir=findViewById(R.id.btn_Papir);
        btnKo=findViewById(R.id.btn_ko);
        btnOllo=findViewById(R.id.btn_ollo);
    }
}