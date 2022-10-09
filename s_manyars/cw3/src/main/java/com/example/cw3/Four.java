package com.example.cw3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Four extends AppCompatActivity {
Button _btn41;
CheckBox _check1, _check2;
int summa = 0;
Intent _intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        _btn41 = (Button) findViewById(R.id.btn41);
        _check1 = (CheckBox) findViewById(R.id.check1);
        _check2 = (CheckBox) findViewById(R.id.check2);

        _check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                summa += 100;
            }
        });
        _check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                summa +=50;
            }
        });
        _btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _intent = new Intent();
                _intent.putExtra("back41",summa+"");
                setResult(RESULT_OK,_intent);
                finish();
            }
        });

    }
}