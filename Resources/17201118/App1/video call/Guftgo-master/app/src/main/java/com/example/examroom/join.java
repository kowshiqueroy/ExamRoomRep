package com.example.examroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class join extends AppCompatActivity {
    Button mButton;
    EditText mEdit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);


        mButton = (Button)findViewById(R.id.joinSet);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit   = (EditText)findViewById(R.id.institute);

                MainActivity.mText=mEdit.getText().toString();
MainActivity.jb=true;
                Intent i1= new Intent(join.this,DashboardActivity.class);

                startActivity(i1);

            }
        });




    }


}