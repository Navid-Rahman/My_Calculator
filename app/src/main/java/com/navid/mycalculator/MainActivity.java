package com.navid.mycalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    double operand1, operand2, answer;
    char c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.textView);

    }

    public void Clear(View view){
        result.setText("");
    }

    public void delete(View view){
        String s = result.getText().toString();

        if(s.length() !=0){
            s = s.substring(0,s.length()-1);
            result.setText(s);
        }
    }

    public void numZero(View view){
        String s = result.getText().toString();
        if(s.length() !=0){
            result.setText(s+"0");
        }
    }
    public void numOne(View view){
        String s = result.getText().toString();
        result.setText(s+"1");
    }
    public void numTwo(View view){
        String s = result.getText().toString();
        result.setText(s+"2");
    }
    public void numThree(View view){
        String s = result.getText().toString();
        result.setText(s+"3");
    }
    public void numFour(View view){
        String s = result.getText().toString();
        result.setText(s+"4");
    }
    public void numFive(View view){
        String s = result.getText().toString();
        result.setText(s+"5");
    }
    public void numSix(View view){
        String s = result.getText().toString();
        result.setText(s+"6");
    }
    public void numSeven(View view){
        String s = result.getText().toString();
        result.setText(s+"7");
    }
    public void numEight(View view){
        String s = result.getText().toString();
        result.setText(s+"8");
    }
    public void numNine(View view){
        String s = result.getText().toString();
        result.setText(s+"9");
    }

    public void Plus(View view){

        String s = result.getText().toString();
        operand1 = Double.parseDouble(s);
        result.setText("");
        c = '+';
    }
    public void Minus(View view){

        String s = result.getText().toString();
        operand1 = Double.parseDouble(s);
        result.setText("");
        c = '-';
    }
    public void Multiply(View view){

        String s = result.getText().toString();
        operand1 = Double.parseDouble(s);
        result.setText("");
        c = '*';
    }
    public void Divide(View view){

        String s = result.getText().toString();
        operand1 = Double.parseDouble(s);
        result.setText("");
        c = '/';
    }
    public void Equals(View view){

        String s = result.getText().toString();
        operand2 = Double.parseDouble(s);
        if (c=='+'){
            answer = operand1 + operand2;
            s = String.valueOf(answer);
            result.setText(s);
            c = '0';
        }
        if (c=='-'){
            answer = operand1 - operand2;
            s = String.valueOf(answer);
            result.setText(s);
            c = '0';
        }
        if (c=='*'){
            answer = operand1 * operand2;
            s = String.valueOf(answer);
            result.setText(s);
            c = '0';
        }
        if (c=='/'){
            answer = operand1 / operand2;
            s = String.valueOf(answer);
            result.setText(s);
            c = '0';
        }
    }

}