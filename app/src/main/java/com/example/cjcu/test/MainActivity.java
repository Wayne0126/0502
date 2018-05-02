package com.example.cjcu.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input_lend;
    private EditText input_rate;
    private EditText input_number;
    private Button submit;
    private TextView amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_lend = findViewById(R.id.input_lend);
        input_rate = (EditText) findViewById(R.id.input_rate);
        input_number = (EditText) findViewById(R.id.input_number);
        submit = (Button) findViewById(R.id.btn);
        amount = (TextView) findViewById(R.id.amount);
    }

    public void cal(View view) {
        float a = Float.parseFloat(input_lend.getText().toString());
        float b = Float.parseFloat(input_rate.getText().toString());
        float c = Float.parseFloat(input_number.getText().toString());
        float d = (a * (b + 1)) * c;
        Log.d("本利和為:", String.valueOf(d));
        amount.setText(String.valueOf(d));
    }
}