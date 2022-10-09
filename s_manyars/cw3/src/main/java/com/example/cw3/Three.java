package com.example.cw3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Three extends AppCompatActivity {
    RadioButton _rb1, _rb2, _rb3;
    Intent _intent;
    String s;
    int r1= 50;
    int r2 = 20;
    int r3 = 30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        _rb1 = (RadioButton) findViewById(R.id.rb1);
        _rb2 = (RadioButton) findViewById(R.id.rb2);
        _rb3 = (RadioButton) findViewById(R.id.rb3);

        _rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _intent = new Intent();
                _intent.putExtra("back31",r1+"");
                setResult(RESULT_OK,_intent);
                finish();
            }
        });
        _rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _intent = new Intent();
                _intent.putExtra("back31",r2+"");
                setResult(RESULT_OK,_intent);
                finish();
            }
        });
        _rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _intent = new Intent();
                _intent.putExtra("back31",r3+"");
                setResult(RESULT_OK,_intent);
                finish();
            }
        });
    }
}