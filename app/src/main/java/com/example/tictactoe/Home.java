package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;


public class Home extends AppCompatActivity {

    ImageButton b1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        b1 = (ImageButton) findViewById(R.id.imageButton7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
