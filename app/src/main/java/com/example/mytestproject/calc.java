package com.example.mytestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calc extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;
    int num1,num2;
    Button add,sub,div,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        e1 = findViewById(R.id.fired);
        e2 = findViewById(R.id.seced);
        t1 = findViewById(R.id.res);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        div=findViewById(R.id.div);
        mul=findViewById(R.id.mul);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(e1.getText().toString());
                num2 = Integer.parseInt(e2.getText().toString());
                dosum(num1,num2);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(e1.getText().toString());
                num2 = Integer.parseInt(e2.getText().toString());
                dodif(num1,num2);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(e1.getText().toString());
                num2 = Integer.parseInt(e2.getText().toString());
                domul(num1,num2);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(e1.getText().toString());
                num2 = Integer.parseInt(e2.getText().toString());
                dodiv(num1,num2);
            }
        });

    }
    public void dosum(int num1,int num2) {

        int sum = num1 + num2;
        t1.setText(Integer.toString(sum));

    }

    public void dodif(int num1,int num2) {
        int sum = num1 - num2;
        t1.setText(Integer.toString(sum));

    }

    public void domul(int num1,int num2) {
        int sum = num1 * num2;
        t1.setText(Integer.toString(sum));
    }

    public void dodiv(int num1,int num2) {
        int sum = num1 / num2;
        t1.setText(Integer.toString(sum));
    }
}
