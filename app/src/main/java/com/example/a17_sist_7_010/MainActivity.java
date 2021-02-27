package com.example.a17_sist_7_010;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int math = 5;
        int quimica = 5;
        int fisica = 9;
        int promedio = 0;

        promedio = (math + quimica + fisica ) / 3;
        
        if (promedio >= 6) {
            Toast.makeText(this, "Aprobado", Toast.LENGTH_SHORT).show();
        }
        else if (promedio <= 5){
            Toast.makeText(this, "Reaprobado", Toast.LENGTH_LONG).show();
        }
    } 



}