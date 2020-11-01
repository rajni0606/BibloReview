package com.example.arundhati.bibloreview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        Button buttonOne = findViewById(R.id.btn1);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity1Intent = new Intent(getApplicationContext(), ImageActivity.class);
                startActivity(activity1Intent);
            }
        });

        Button buttonTwo = findViewById(R.id.btn2);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent activity2Intent = new Intent(getApplicationContext(), FIrstActivity.class);
                startActivity(activity2Intent);
            }
        });
    }
}