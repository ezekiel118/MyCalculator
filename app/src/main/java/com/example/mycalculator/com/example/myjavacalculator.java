package com.example.mycalculator.com.example;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mycalculator.R;

public class myjavacalculator extends AppCompatActivity {
    // variable
    private EditText number1EditText, number2EditText;
    private TextView resultTextView;
    private Button addButton, subtractButton, multiplyButton, divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // UI Components
        private void setupUIComponents(){
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
                    calculate("-");}
            });

            //multiply
            multiplyButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate("*");}
            });

            //divide
            divideButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calculate("/");}
            });
            }
        }
    }
}
