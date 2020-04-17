package com.example.mytestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    Button count;
    Button toastb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show);
        count=findViewById(R.id.button2);
        toastb= findViewById(R.id.toastb);
        toastb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
               startActivity(new Intent(getApplicationContext(),calc.class));
            }


        });

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countUp();
            }
        });

    }

    public void showToast() {
        Toast toast = Toast.makeText(this,"hai",
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp() {

        if (mShowCount != null)
            mCount++;
            mShowCount.setText(Integer.toString(mCount));
    }
    }