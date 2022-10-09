package com.example.sars_pushkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Two extends AppCompatActivity {
    EditText _txt2;
    Button _btn21, _btn23;
    Intent _intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        _btn21 = (Button) findViewById(R.id.btn21);
        _btn23 = (Button) findViewById(R.id.btn23);
        _txt2 = (EditText) findViewById(R.id.txt2);

        _txt2.setText(getIntent().getExtras().get("myEdit12").toString());

        _btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _intent = new Intent();
                _intent.putExtra("back21",_txt2.getText().toString());
                setResult(RESULT_OK,_intent);
                finish();
            }
        });
    }
}