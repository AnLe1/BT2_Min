package com.lecongan.bt2_min;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtSo1, edtSo2;
    private TextView tv_kq;
    private Button btnMin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtSo1 = (EditText) findViewById(R.id.edt_sothunhat);
        edtSo2 = (EditText) findViewById(R.id.edt_sothuhai);
        tv_kq = (TextView) findViewById(R.id.tv_kq);
        btnMin = (Button) findViewById(R.id.btn_min);
        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edtSo1.getText().toString().isEmpty() && !edtSo2.getText().toString().isEmpty()){
                    int sothu1 = Integer.parseInt(edtSo1.getText().toString());
                    int sothu2 = Integer.parseInt(edtSo2.getText().toString());
                    if(sothu1>sothu2){
                        tv_kq.setText("Min: "+sothu2);
                    }else if (sothu1<sothu2){
                        tv_kq.setText("Min: "+sothu1);
                    }else {
                        tv_kq.setText("Hai số bằng nhau!");
                    }
                }
            }
        });



    }
}
