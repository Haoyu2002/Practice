package com.example.exatmtoast01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtATM;
    private Button btnN1,btnN2,btnN3;
    private Button btnN4,btnN5,btnN6;
    private Button btnN7,btnN8,btnN9,btnN0;
    private Button btnBack,btnOK;

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
        btnBack = (Button) findViewById(R.id.btnBack);
        btnOK = (Button)findViewById(R.id.btnOK);

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
        btnBack.setOnClickListener(listener);
        btnOK.setOnClickListener(listener);
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
            int vId = v.getId();
            if (vId == R.id.btnBack) {
                String str = edtATM.getText().toString();
                //取得edittext字串
                if (str.length() > 0) {
                    //檢查是否有字元
                    str = str.substring(0, str.length() - 1);
                    //str.length可以取得字串長度
                    edtATM.setText(str);
                }
            } else if (vId == R.id.btnOK) {
                String str;
                //取得edittext字串
                str = edtATM.getText().toString();
                if (str.equals("123456")) {
                    Toast toast = Toast.makeText(MainActivity.this, "密碼正確，歡迎使用中國信託商業銀行", Toast.LENGTH_LONG);
                    //Toast為函數 toast為名稱(自訂義) Toast.length_long為顯示時間多寡
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    //上面這行為設定Toast的位置
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "密碼錯誤，請重新輸入", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    edtATM.setText("");
                }
            }
        }
    };

    private void displayATM(String s) {
        String str = edtATM.getText().toString();
        edtATM.setText(str + s);
    }

}
