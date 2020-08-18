package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;

    String number1;
    String number2;

    TextView txt;

    int n1;
    int n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etNum1 = findViewById(R.id.ptxt1);
        etNum2 = findViewById(R.id.ptxt2);
        txt = findViewById(R.id.textv1);

        Intent intent = getIntent();

        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        etNum1.setText(number1);
        etNum1.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);


    }

    public  void add(View view){
        txt.setText(number1 + " + " + number2 + " = " + (n1+n2));
    }


    public  void Substract(View view){
        txt.setText(number1 + " - " + number2 + " = " + (n1-n2));
    }

    public  void multiply(View view){
        txt.setText(number1 + " + " + number2 + " = " + (n1*n2));
    }

    public  void devide(View view){
        txt.setText(number1 + " / " + number2 + " = " + (n1/n2));
    }


}