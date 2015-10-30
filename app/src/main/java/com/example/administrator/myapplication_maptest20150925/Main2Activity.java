package com.example.administrator.myapplication_maptest20150925;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button plan, planned, history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        getSupportActionBar().setDisplayUseLogoEnabled(true);//使用logo
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.bt2);
//
//        getSupportActionBar().setTitle("Bike Travel");
//        getSupportActionBar().setDisplayShowTitleEnabled(true);

        plan = (Button) findViewById(R.id.plan);
        planned = (Button) findViewById(R.id.planned);
        history = (Button) findViewById(R.id.history);



        plan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this, Input.class);
                startActivity(intent);
            }
        });

        planned.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this,Planned.class);
                startActivity(intent);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this,History.class);
                startActivity(intent);
            }
        });




    }





}
