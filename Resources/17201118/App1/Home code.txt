package com.example.examroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    Button b3, b4 ,b5 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        b3= (Button) findViewById(R.id.button3);
        b4= (Button) findViewById(R.id.button4);
        b5= (Button) findViewById(R.id.button5);


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(home.this, Link.class);
                startActivity(i1);

            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(home.this, Select.class);
                startActivity(i1);

            }

        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(home.this, Create.class);
                startActivity(i1);

            }

        });


    }
}