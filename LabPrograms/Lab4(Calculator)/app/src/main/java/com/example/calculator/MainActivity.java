package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText input, result;
        Button sin, cos, tan, log, sqrt, power, factorial, exp, ln, reciprocal, clear;
        Button add, subtract, multiply, divide;

        input = findViewById(R.id.input);
        result = findViewById(R.id.res);
        sin = findViewById(R.id.btn_sin);
        cos = findViewById(R.id.btn_cos);
        tan = findViewById(R.id.btn_tan);
        log = findViewById(R.id.btn_log);
        sqrt = findViewById(R.id.btn_sqrt);
        power = findViewById(R.id.btn_power);
        factorial = findViewById(R.id.btn_factorial);
        exp = findViewById(R.id.btn_exp);
        ln = findViewById(R.id.btn_ln);
        reciprocal = findViewById(R.id.btn_reciprocal);
        clear = findViewById(R.id.btn_clear);
        add = findViewById(R.id.btn_add);
        subtract = findViewById(R.id.btn_sub);
        multiply = findViewById(R.id.btn_mul);
        divide = findViewById(R.id.btn_divide);

        // Sin function
        sin.setOnClickListener(view -> {
            double value = Double.parseDouble(input.getText().toString());
            result.setText(Double.toString(Math.sin(Math.toRadians(value))));
        });

        // Cos function
        cos.setOnClickListener(view -> {
            double value = Double.parseDouble(input.getText().toString());
            result.setText(Double.toString(Math.cos(Math.toRadians(value))));
        });

        // Tan function
        tan.setOnClickListener(view -> {
            double value = Double.parseDouble(input.getText().toString());
            result.setText(Double.toString(Math.tan(Math.toRadians(value))));
        });

        // Log function
        log.setOnClickListener(view -> {
            double value = Double.parseDouble(input.getText().toString());
            result.setText(Double.toString(Math.log10(value)));
        });

        // Natural Logarithm (ln) function
        ln.setOnClickListener(view -> {
            double value = Double.parseDouble(input.getText().toString());
            result.setText(Double.toString(Math.log(value)));
        });

        // Square root function
        sqrt.setOnClickListener(view -> {
            double value = Double.parseDouble(input.getText().toString());
            result.setText(Double.toString(Math.sqrt(value)));
        });

        // Power function
        power.setOnClickListener(view -> {
            String[] values = input.getText().toString().split(",");
            if (values.length == 2) {
                double base = Double.parseDouble(values[0]);
                double exponent = Double.parseDouble(values[1]);
                result.setText(Double.toString(Math.pow(base, exponent)));
            } else {
                result.setText("Enter two numbers separated by a comma");
            }
        });

        // Factorial function
        factorial.setOnClickListener(view -> {
            int value = Integer.parseInt(input.getText().toString());
            result.setText(Integer.toString(calculateFactorial(value)));
        });

        // Exponential function
        exp.setOnClickListener(view -> {
            double value = Double.parseDouble(input.getText().toString());
            result.setText(Double.toString(Math.exp(value)));
        });

        // Reciprocal function
        reciprocal.setOnClickListener(view -> {
            double value = Double.parseDouble(input.getText().toString());
            if (value != 0) {
                result.setText(Double.toString(1 / value));
            } else {
                result.setText("Infinity");
            }
        });

        // Addition function
        add.setOnClickListener(view -> {
            String[] values = input.getText().toString().split(",");
            if (values.length == 2) {
                double num1 = Double.parseDouble(values[0]);
                double num2 = Double.parseDouble(values[1]);
                result.setText(Double.toString(num1 + num2));
            } else {
                result.setText("Enter two numbers separated by a comma");
            }
        });

        // Subtraction function
        subtract.setOnClickListener(view -> {
            String[] values = input.getText().toString().split(",");
            if (values.length == 2) {
                double num1 = Double.parseDouble(values[0]);
                double num2 = Double.parseDouble(values[1]);
                result.setText(Double.toString(num1 - num2));
            } else {
                result.setText("Enter two numbers separated by a comma");
            }
        });

        // Multiplication function
        multiply.setOnClickListener(view -> {
            String[] values = input.getText().toString().split(",");
            if (values.length == 2) {
                double num1 = Double.parseDouble(values[0]);
                double num2 = Double.parseDouble(values[1]);
                result.setText(Double.toString(num1 * num2));
            } else {
                result.setText("Enter two numbers separated by a comma");
            }
        });

        // Division function
        divide.setOnClickListener(view -> {
            String[] values = input.getText().toString().split(",");
            if (values.length == 2) {
                double num1 = Double.parseDouble(values[0]);
                double num2 = Double.parseDouble(values[1]);
                if (num2 != 0) {
                    result.setText(Double.toString(num1 / num2));
                } else {
                    result.setText("Cannot divide by zero");
                }
            } else {
                result.setText("Enter two numbers separated by a comma");
            }
        });

        // Clear function
        clear.setOnClickListener(view -> {
            input.setText("");
            result.setText("");
        });
    }

    private int calculateFactorial(int n) {
        if (n <= 1) return 1;
        return n * calculateFactorial(n - 1);
    }
}
