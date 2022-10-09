package com.example.cw3;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button _btn1, _btn2, _btn3, _btn4;
    Intent _intent;
    String s2,s3,s4;
    TextView _lbl2, _lbl3, _lbl4, _lbl5;

    static private int code = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _btn1 = (Button) findViewById(R.id.btn1);
        _btn2 = (Button) findViewById(R.id.btn2);
        _btn3 = (Button) findViewById(R.id.btn3);
        _btn4 = (Button) findViewById(R.id.btn4);
        _lbl2 = (TextView) findViewById(R.id.lbl2);
        _lbl3 = (TextView) findViewById(R.id.lbl3);
        _lbl4 = (TextView) findViewById(R.id.lbl4);
        _lbl5 = (TextView) findViewById(R.id.lbl5);

        _btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _intent = new Intent(getApplication(), Two.class);
                startActivityForResult(_intent, code);
            }
        });
        _btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = 1;
                _intent = new Intent(getApplication(), Three.class);
                startActivityForResult(_intent, code);
            }
        });
        _btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = 2;
                _intent = new Intent(getApplication(), Four.class);
                startActivityForResult(_intent, code);
            }
        });
        _btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.valueOf(_lbl3.getText().toString())+Integer.valueOf(_lbl4.getText().toString())+Integer.valueOf(_lbl5.getText().toString());
                _lbl2.setText("Наценка за машину - "+_lbl3.getText().toString()+"    "+"Наценка за возраст - "+_lbl4.getText().toString()+"    "+"Наценка за штрафы/аварии"+_lbl5.getText().toString()+"    "+"Итоговая сумма" + a);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                s2 = data.getStringExtra("back21");
                _lbl3.setText(String.valueOf(s2));
            }
        }
        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                s3 = data.getStringExtra("back31");
                _lbl4.setText(String.valueOf(s3));
            }
        }
        if(requestCode == 2){
            if(resultCode == RESULT_OK){
                s4 = data.getStringExtra("back41");
                _lbl5.setText(String.valueOf(s4));

            }
        }



    }
}