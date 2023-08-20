package com.example.exbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//要用到view button textview必須先import
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//AppCompatActivity表示與舊版本android相容
public class MainActivity extends AppCompatActivity {
    //btnDo負責接收Button的內容
    //txtShow更改TextView的內容
    private Button btnDo;
    private TextView txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //用findViewById取得介面元件
        btnDo = (Button)findViewById(R.id.button);
        txtShow = (TextView)findViewById(R.id.textView);

        //為Button元件加入Click事件的偵聽，觸發時執行自訂方法 btnDoListener
        btnDo.setOnClickListener(btnDoListener);
        }
        //下面這行表示在點完button之後會把結果傳回view.v做顯示
        private Button.OnClickListener btnDoListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtShow.setText("點到了拉靠");
            }
        };
}
