package com.uso.guia08ma17_i04_001;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btncalc;
    Button btnDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        this.btncalc = findViewById(R.id.btncal);
        this.btnDatos = findViewById(R.id.btndatos);

        this.btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this,CalculadoraActivity.class);
                startActivity(mIntent);
            }
        });

        this.btnDatos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent mIntent = new Intent(MainActivity.this,WelcomeActivity.class);
                startActivity(mIntent);
            }

        });
    }
}
