package com.example.administrator.myapplication_maptest20150925;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class History2 extends AppCompatActivity {

    Button road, picture, noted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history2);

        road = (Button) findViewById(R.id.road);
        picture = (Button) findViewById(R.id.picture);
        noted = (Button) findViewById(R.id.noted);


        road.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(History2.this, MapsActivityRoad.class);
                startActivity(intent);
            }
        });

//        picture.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent();
//                intent.setClass(History2.this, .class);
//                startActivity(intent);
//            }
//        });

        noted.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(History2.this, ScrollingActivity.class);
                startActivity(intent);
            }
        });

    }
}
