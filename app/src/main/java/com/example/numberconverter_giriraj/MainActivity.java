package com.example.numberconverter_giriraj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etNumber;
    private TextView tvResult, tvOne;
    private Button btnConvert;
    private int num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = (EditText) findViewById(R.id.etNumber);
        btnConvert = (Button) findViewById(R.id.btnConvert);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(etNumber.getText().toString());
                NumberConverter_Giriraj converter = new NumberConverter_Giriraj(num);
                tvResult.setText(converter.Check());
            }
            });
            }
    }

