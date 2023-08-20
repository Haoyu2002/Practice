package com.example.exmiletokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    //宣告全域變數
    private EditText edtMile;
    private TextView txtKm;
    private Button btnTran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //取得介面元件
        edtMile=(EditText)findViewById(R.id.editMile);
        txtKm=(TextView)findViewById(R.id.txtKm);
        btnTran=(Button)findViewById(R.id.btnTran);

        //為button加入Click偵聽 觸發時執行自訂方法btnTranListener
        btnTran.setOnClickListener(btnTranListener);
    }

    private Button.OnClickListener btnTranListener = new Button.OnClickListener(){
        public void onClick(View v){
            //edtMile()getText()toString()取得輸入的數值字串，並用Double.parse.Double換成倍精度存入miles
            double miles = Double.parseDouble(edtMile.getText().toString());
            double km = 1.61*miles;
            //txt.setText將km的值加上文字顯示到txtKm上
            txtKm.setText("時速 = " + km + " 公里");
        }
    };
}

//顯示出來的公里數有點奇怪##