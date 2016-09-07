package com.example.anthony.fivethingsproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Atari Breakout button
        Button button01 = (Button)findViewById(R.id.atari_breakout_button);
        button01.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AtariBreakout.class);
                startActivity(intent);
            }
        });
        //Do a barrel roll button
        Button button02 = (Button)findViewById(R.id.do_a_barrel_roll_button);
        button02.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DoABarrelRoll.class);
                startActivity(intent);
            }
        });
    }

}
