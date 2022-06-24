package com.navid.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText result;
    private EditText newNumber;
    private TextView displayOperation;

    private Double operand1 = null;
    private Double operand2 = null;
    private String pendingOperation = "=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (EditText) findViewById(R.id.result);
        newNumber = (EditText) findViewById(R.id.newNumber);
        displayOperation = (TextView) findViewById(R.id.operation);

        Button button0 = (Button) findViewById(R.id.buttonZero);
        Button button1 = (Button) findViewById(R.id.buttonOne);
        Button button2 = (Button) findViewById(R.id.buttonTwo);
        Button button3 = (Button) findViewById(R.id.buttonThree);
        Button button4 = (Button) findViewById(R.id.buttonFour);
        Button button5 = (Button) findViewById(R.id.buttonFive);
        Button button6 = (Button) findViewById(R.id.buttonSix);
        Button button7 = (Button) findViewById(R.id.buttonSeven);
        Button button8 = (Button) findViewById(R.id.buttonEight);
        Button button9 = (Button) findViewById(R.id.buttonNine);
        Button buttonDot = (Button) findViewById(R.id.buttonDot);
        Button buttonEquals = (Button) findViewById(R.id.buttonEquals);
        Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);

    }
}