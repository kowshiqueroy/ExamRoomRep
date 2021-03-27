package com.example.examroom;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    Button b1, b2,b3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        b1= (Button) findViewById(R.id.loginbtn);
        b2= (Button) findViewById(R.id.web);
        b3= (Button) findViewById(R.id.button9);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(home.this,LoginActivity.class);
                startActivity(i1);

            }


        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(home.this,ScanIt.class);
                startActivity(i1);

            }


        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://examroom.xyz/");

            }
        });





    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent (Intent.ACTION_VIEW,uri));
    }
}
