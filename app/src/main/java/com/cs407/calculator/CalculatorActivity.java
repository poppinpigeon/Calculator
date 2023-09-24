package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        result=findViewById(R.id.textView2);
        Intent intent = getIntent();

        String num1String = intent.getStringExtra("num1");
        int num1 = Integer.parseInt(num1String);

        String num2String = intent.getStringExtra("num2");
        int num2 = Integer.parseInt(num2String);

        String operator = intent.getStringExtra("button");
        Log.i("ONCREATE", "calculating");

        String res;

        if(operator.equals("+")){
            Log.i("Calculator", "adding");
            res = String.valueOf((double)num1 + num2);
        }
        else if(operator.equals("-")){
            res = String.valueOf((double)num1 - num2);
        }
        else if(operator.equals("*")){
            res = String.valueOf((double)num1 * num2);
        }
        else if(operator.equals("/")){
            if(num2 == 0){
                res = "Error: cannot divide by 0";
            }
            else {
                res = String.valueOf((double)num1 / num2);
            }
        }
        else{
            res = "Error: cannot find operation";
        }
        result.setText(res);


    }

}