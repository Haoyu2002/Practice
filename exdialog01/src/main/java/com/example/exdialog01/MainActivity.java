package com.example.exdialog01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.location.GnssAntennaInfo;
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
    private Button btnBack,btnOK,btnEnd;

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
        btnEnd.setOnClickListener(listener);

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
        btnEnd.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new Button.OnClickListener() {
        @Override
        public void onClick(View v){
            switch(v.getId()){
                case R.id.btnN1:
                    displayATM("1");
                    break;
                case R.id.btnN2:
                    displayATM("2");
                    break;
                case R.id.btnN3:
                    displayATM("3");
                    break;
                case R.id.btnN4:
                    displayATM("4");
                    break;
                case R.id.btnN5:
                    displayATM("5");
                    break;
                case R.id.btnN6:
                    displayATM("6");
                    break;
                case R.id.btnN7:
                    displayATM("7");
                    break;
                case R.id.btnN8:
                    displayATM("8");
                    break;
                case R.id.btnN9:
                    displayATM("9");
                    break;
                case R.id.btnBack:
                    String str = edtATM.getText().toString();
                    if(str.length()>0){
                        str = str.substring(0, str.length()-1);
                        edtATM.setText(str);
                    }
                    break;
                case R.id.btnOK:
                    str = edtATM.getText().toString();
                    if(str.equals("123456")) {
                        Toast toast = Toast.makeText(MainActivity.this,"正確!",Toast.LENGTH_LONG);
                       toast.show();}
                    else {
                        Toast toast = Toast.makeText(MainActivity.this,"錯誤!",Toast.LENGTH_SHORT);
                        toast.show();
                        edtATM.setText("");
                    }
                    break;
                case R.id.btnEnd:
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("確認視窗")
                            .setMessage("確定要結束嗎?")
                            .setIcon(R.mipmap.ic_launcher)
                            .show();
                    break;
            }
        }
    };

    private void displayATM(String s) {
        String str = edtATM.getText().toString();
        edtATM.setText(str + s);
    }

}
