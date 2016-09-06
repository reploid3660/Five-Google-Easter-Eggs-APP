package com.example.anthony.fivethingsproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button01 = (Button)findViewById(R.id.atari_breakout);

        button01.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {

                // TODO Auto-generated method stub

                toAtariBreakout();

            }

        });
    }

    private void toAtariBreakout(){
        setContentView(R.layout.atari_breakout);
    }
}
