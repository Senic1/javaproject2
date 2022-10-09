package com.example.sars_pushkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Radio extends AppCompatActivity {
RadioButton _rb1, _rb2, _rb3;
Intent _intent;
String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        _rb1 = (RadioButton) findViewById(R.id.rb1);
        _rb2 = (RadioButton) findViewById(R.id.rb2);
        _rb3 = (RadioButton) findViewById(R.id.rb3);

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//            switch (v.getId()){
//                case R.id.rb1: s = _rb1.getText().toString(); break;
//                case R.id.rb2: s = _rb2.getText().toString(); break;
//                case R.id.rb3: s = _rb3.getText().toString(); break;
//            }

//                if(v==_rb1) s = _rb1.getText().toString();
//                if(v==_rb2) s = _rb2.getText().toString();
//                if(v==_rb3) s = _rb3.getText().toString();

                  RadioButton bbb = (RadioButton) v;
                  s= bbb.getText().toString();

                  _intent = new Intent();
                  _intent.putExtra("back31",s);
                  setResult(RESULT_OK,_intent);
                  finish();


//                Toast.makeText(getApplication(),s,Toast.LENGTH_SHORT).show();
            }
        };
        _rb1.setOnClickListener(click);
        _rb2.setOnClickListener(click);
        _rb3.setOnClickListener(click);
    }
}