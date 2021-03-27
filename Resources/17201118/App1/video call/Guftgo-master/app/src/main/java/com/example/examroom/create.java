package com.example.examroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class create extends AppCompatActivity {
    Button mButton2;
    EditText mEdit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);


        mButton2 = (Button)findViewById(R.id.createSet);

        mButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit2   = (EditText)findViewById(R.id.institutec);

                MainActivity.mText=mEdit2.getText().toString();

                Intent i1= new Intent(create.this,DashboardActivity.class);

                startActivity(i1);

            }
        });
    }
}