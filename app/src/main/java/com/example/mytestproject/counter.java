package com.example.mytestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class counter extends AppCompatActivity {
Button calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextact);
        calc=findViewById(R.id.calculator);
    }
    public void click(View v){
        Intent i = new Intent(this,calc.class);
                startActivity(i);
    }
}