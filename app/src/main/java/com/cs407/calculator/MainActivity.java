package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickAdd(View view){
        Log.i("INFO", "add");
        EditText myTextField=(EditText) findViewById(R.id.editTextNumber);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        EditText myTextField2=(EditText) findViewById(R.id.editTextNumber2);
        //Toast.makeText(MainActivity.this, myTextField2.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(myTextField.getText().toString(), myTextField2.getText().toString(), "+");
    }

    public void clickSubtract(View view){
        Log.i("INFO", "subtract");
        EditText myTextField=(EditText) findViewById(R.id.editTextNumber);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        EditText myTextField2=(EditText) findViewById(R.id.editTextNumber2);
        //Toast.makeText(MainActivity.this, myTextField2.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(myTextField.getText().toString(), myTextField2.getText().toString(), "-");
    }

    public void clickMultiply(View view){
        Log.i("INFO", "multiply");
        EditText myTextField=(EditText) findViewById(R.id.editTextNumber);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        EditText myTextField2=(EditText) findViewById(R.id.editTextNumber2);
        //Toast.makeText(MainActivity.this, myTextField2.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(myTextField.getText().toString(), myTextField2.getText().toString(), "*");
    }

    public void clickDivide(View view){
        Log.i("INFO", "divide");
        EditText myTextField=(EditText) findViewById(R.id.editTextNumber);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        EditText myTextField2=(EditText) findViewById(R.id.editTextNumber2);
        //Toast.makeText(MainActivity.this, myTextField2.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(myTextField.getText().toString(), myTextField2.getText().toString(), "/");
    }

    public void goToActivity(String num1, String num2, String button){
        Log.i("INFO2", "goToActivity");
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("num1",num1);
        intent.putExtra("num2",num2);
        intent.putExtra("button",button);
        startActivity(intent);
    }
}