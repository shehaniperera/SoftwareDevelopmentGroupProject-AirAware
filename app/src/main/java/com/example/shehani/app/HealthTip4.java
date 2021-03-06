package com.example.shehani.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HealthTip4 extends AppCompatActivity {

    public Button nextTipButton;
    public Button previousButton;
    public Button homeButton;

    public void nextHealthTipScreen(){
        nextTipButton = (Button) findViewById(R.id. nextTip5btn);
        nextTipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HealthTip4.this,HealthTip5.class);
                startActivity(intent);
            }
        });
    }

    public void homeScreen(){
        homeButton = (Button) findViewById(R.id.homeBtn);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HealthTip4.this,SecondMain.class);
                startActivity(intent);
            }
        });
    }

    public void previousHealthTipScreen(){
        previousButton = (Button) findViewById(R.id. previousBtn);
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HealthTip4.this,HealthTip3.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tip4);
        nextHealthTipScreen();
        homeScreen();
        previousHealthTipScreen();
    }
}
