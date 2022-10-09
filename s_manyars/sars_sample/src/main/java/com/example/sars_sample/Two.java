package com.example.sars_sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Two extends AppCompatActivity {
    TextView _lbl2;
    Button _btn2;
    Intent _intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        _lbl2 = (TextView) findViewById(R.id.lbl2);
        _btn2 = (Button) findViewById(R.id.btn2);

        _lbl2.setText(_lbl2.getText()+"\n"+String.valueOf(One.n));

        _btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _intent = new Intent(getApplication(),One.class);
                startActivity(_intent);
//              finish();
                One.n++;
            }
        });
    }
}