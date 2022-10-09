package com.example.sars_sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class One extends AppCompatActivity {
   TextView _lbl1;
   Button _btn1;
   Intent _intent;
   public static int n = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        _lbl1 = (TextView) findViewById(R.id.lbl1);
        _btn1 = (Button) findViewById(R.id.btn1);

        _lbl1.setText(_lbl1.getText()+"\n"+String.valueOf(n));
        _btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            _intent = new Intent(getApplication(),Two.class);
            startActivity(_intent);
//            finish();
                n++;

            }
        });
    }
}