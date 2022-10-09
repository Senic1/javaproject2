package com.example.cw3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Two extends AppCompatActivity {
ImageButton _btnc, _btnp, _btns, _btnm;
Integer cab = 110;
Integer pik = 130;
Integer sed = 150;
Integer min = 180;
Intent _intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        _btnc = (ImageButton) findViewById(R.id.btnc);
        _btnp = (ImageButton) findViewById(R.id.btnp);
        _btns = (ImageButton) findViewById(R.id.btns);
        _btnm = (ImageButton) findViewById(R.id.btnm);

     _btnc.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             _intent = new Intent();
             _intent.putExtra("back21",cab+"");
             setResult(RESULT_OK,_intent);
             finish();
         }
     });
        _btnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _intent = new Intent();
                _intent.putExtra("back21",pik+"");
                setResult(RESULT_OK,_intent);
                finish();
            }
        });
        _btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _intent = new Intent();
                _intent.putExtra("back21",sed+"");
                setResult(RESULT_OK,_intent);
                finish();
            }
        });
        _btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _intent = new Intent();
                _intent.putExtra("back21",min+"");
                setResult(RESULT_OK,_intent);
                finish();
            }
        });

    }

}