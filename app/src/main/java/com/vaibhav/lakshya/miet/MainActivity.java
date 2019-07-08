package com.vaibhav.lakshya.miet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private TextView firstYear,secondYear,thirdYear,fourthYear,info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstYear=(TextView)findViewById(R.id.firstyear);
        secondYear=(TextView)findViewById(R.id.secondyear);
        thirdYear=(TextView)findViewById(R.id.thirdyear);
        fourthYear=(TextView)findViewById(R.id.fourthyear);
        info=(TextView)findViewById(R.id.info);

        firstYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FirstYearActivity.class));
            }
        });
        secondYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondYearActivity.class));
            }
        });
        thirdYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this,ThirdYearActivity.class));
                startActivity(new Intent(MainActivity.this,ThirdYearActivity.class));
            }
        });
        fourthYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this,FourthYearActivity.class));
                Toast.makeText(getApplicationContext(),"Yet to Update",Toast.LENGTH_SHORT).show();
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,InfoActivity.class));
            }
        });
    }

}
