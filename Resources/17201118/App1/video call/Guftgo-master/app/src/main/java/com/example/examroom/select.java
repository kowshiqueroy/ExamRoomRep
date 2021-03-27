package com.example.examroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select extends AppCompatActivity {
    Button bj,bc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        bj= (Button) findViewById(R.id.joinbtn);
        bc= (Button) findViewById(R.id.createbtn);


        bj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(select.this,join.class);
                startActivity(i1);

            }


        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(select.this,create.class);
                startActivity(i1);

            }


        });

    }
}