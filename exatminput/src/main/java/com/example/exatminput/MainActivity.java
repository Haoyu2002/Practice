package com.example.exatminput;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtATM;
    private Button btnN1,btnN2,btnN3;
    private Button btnN4,btnN5,btnN6;
    private Button btnN7,btnN8,btnN9,btnN0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtATM = (EditText) findViewById(R.id.edtATM);
        btnN1 = (Button) findViewById(R.id.btnN1);
        btnN2 = (Button) findViewById(R.id.btnN2);
        btnN3 = (Button) findViewById(R.id.btnN3);
        btnN4 = (Button) findViewById(R.id.btnN4);
        btnN5 = (Button) findViewById(R.id.btnN5);
        btnN6 = (Button) findViewById(R.id.btnN6);
        btnN7 = (Button) findViewById(R.id.btnN7);
        btnN8 = (Button) findViewById(R.id.btnN8);
        btnN9 = (Button) findViewById(R.id.btnN9);
        btnN0 = (Button) findViewById(R.id.btnN0);

        btnN1.setOnClickListener(listener);
        btnN2.setOnClickListener(listener);
        btnN3.setOnClickListener(listener);
        btnN4.setOnClickListener(listener);
        btnN5.setOnClickListener(listener);
        btnN6.setOnClickListener(listener);
        btnN7.setOnClickListener(listener);
        btnN8.setOnClickListener(listener);
        btnN9.setOnClickListener(listener);
        btnN0.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new Button.OnClickListener() {
        @Override
        public void onClick(View v){
            int id = v.getId();
            if (id == R.id.btnN1) {
                displayATM("1");
            } else if (id == R.id.btnN2) {
                displayATM("2");
            } else if (id == R.id.btnN3) {
                displayATM("3");
            } else if (id == R.id.btnN4) {
                displayATM("4");
            } else if (id == R.id.btnN5) {
                displayATM("5");
            } else if (id == R.id.btnN6) {
                displayATM("6");
            } else if (id == R.id.btnN7) {
                displayATM("7");
            } else if (id == R.id.btnN8) {
                displayATM("8");
            } else if (id == R.id.btnN9) {
                displayATM("9");
            } else if (id == R.id.btnN0) {
                displayATM("0");
            }

        }
        };

    private void displayATM(String s) {
        String str = edtATM.getText().toString();
        edtATM.setText(str + s);
    }

    }
