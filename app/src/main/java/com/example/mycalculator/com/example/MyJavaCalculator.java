package com.example.mycalculator.com.example;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mycalculator.R;

public class MyJavaCalculator extends AppCompatActivity {
    // variables
    private EditText number1EditText, number2EditText;
    private TextView resultTextView;
    private Button addButton, subtractButton, multiplyButton, divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        setupUIComponents();

        // Set button listeners
        setupButtonListeners();
    }

    private void setupUIComponents() {
        number1EditText = findViewById(R.id.number1_edit_text);
        number2EditText = findViewById(R.id.number2_edit_text);
        resultTextView = findViewById(R.id.result_text_view);
        addButton = findViewById(R.id.add_button);
        subtractButton = findViewById(R.id.subtract_button);
        multiplyButton = findViewById(R.id.multiply_button);
        divideButton = findViewById(R.id.divide_button);
    }

    private void setupButtonListeners() {
        // addition
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("+");
            }
        });

        // subtraction
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("-");
            }
        });

        // multiplication
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("*");
            }
        });

        // division
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("/");
            }
        });
    }

    private void calculate(String operator) {
        double number1 = parseDouble(number1EditText.getText().toString());
        double number2 = parseDouble(number2EditText.getText().toString());
        double result = 0;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    resultTextView.setText("Error: Division by zero");
                    return;
                }
                break;
        }

        resultTextView.setText("Result: " + result);
    }

    private double parseDouble(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
