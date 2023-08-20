package com.example.exphone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtShow;
    private Button btnZero,btnOne,btnTwo,btnThree,btnFour;
    private Button btnFive,btnSix,btnSeven,btnEight,btnNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtShow = (TextView) findViewById(R.id.txtshow);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);

        btnZero.setOnClickListener(myListener);
        btnOne.setOnClickListener(myListener);
        btnTwo.setOnClickListener(myListener);
        btnThree.setOnClickListener(myListener);
        btnFour.setOnClickListener(myListener);
        btnFive.setOnClickListener(myListener);
        btnSix.setOnClickListener(myListener);
        btnSeven.setOnClickListener(myListener);
        btnEight.setOnClickListener(myListener);
        btnNine.setOnClickListener(myListener);

    }
    //定義onClick方法
    private Button.OnClickListener myListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s = txtShow.getText().toString();
            int id = v.getId();
            if (id == R.id.btnZero) {
                txtShow.setText(s + "0");
            } else if (id == R.id.btnOne) {
                txtShow.setText(s + "1");
            } else if (id == R.id.btnTwo) {
                txtShow.setText(s + "2");
            } else if (id == R.id.btnThree) {
                txtShow.setText(s + "3");
            } else if (id == R.id.btnFour) {
                txtShow.setText(s + "4");
            } else if (id == R.id.btnFive) {
                txtShow.setText(s + "5");
            } else if (id == R.id.btnSix) {
                txtShow.setText(s + "6");
            } else if (id == R.id.btnSeven) {
                txtShow.setText(s + "7");
            } else if (id == R.id.btnEight) {
                txtShow.setText(s + "8");
            } else if (id == R.id.btnNine) {
                txtShow.setText(s + "9");
            }
        }
    };
}

//switch case後面只能接char、int這類常量 解決方法是在public後面+final
//但button前面不能加 不知道怎麼解決
