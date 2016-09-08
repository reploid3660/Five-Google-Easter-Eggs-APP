package com.example.anthony.fivethingsproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recursion button
        Button button03 = (Button) findViewById(R.id.recursion_button);
        button03.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Recursion.class);
                startActivity(intent);
            }
        });
        //Tic Tac Toe button
        Button button04 = (Button) findViewById(R.id.tic_tac_toe_button);
        button04.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TicTacToe.class);
                startActivity(intent);
            }
        });
        //Flip!Google! button
        Button button05 = (Button) findViewById(R.id.flip_google_button);
        button05.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FlipChrome.class);
                startActivity(intent);
            }
        });
    }

    /*
        **Atari Breakout button
     */
    public void atariBreakoutButton(View view) {
        Intent intent = new Intent(MainActivity.this, AtariBreakout.class);
        startActivity(intent);
    }

    /*
       **Do a barrel roll button button
    */
    public void doABarrelRollButton(View view) {
        Intent intent = new Intent(MainActivity.this, DoABarrelRoll.class);
        startActivity(intent);
    }

    /*
       **Recursion button
    */
    public void recursionButton(View view) {
        Intent intent = new Intent(MainActivity.this, Recursion.class);
        startActivity(intent);
    }

    /*
       **Tic Tac Toe button
    */
    public void ticTacToeButton(View view) {
        Intent intent = new Intent(MainActivity.this, TicTacToe.class);
        startActivity(intent);
    }

    /*
       **Flip!Google! button
    */
    public void flipGoogleButton(View view) {
        Intent intent = new Intent(MainActivity.this, FlipChrome.class);
        startActivity(intent);
    }
}