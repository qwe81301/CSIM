package com.example.administrator.myapplication_maptest20150925;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AfterPlanSite2 extends AppCompatActivity {


    Button btn5, btn2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_plan_site2);

        btn2 = (Button) findViewById(R.id.btn2);


        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(AfterPlanSite2.this, MapsActivitySite2.class);
                startActivity(intent);
            }
        });

        btn5 = (Button) findViewById(R.id.btn5);


        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(AfterPlanSite2.this,MapsActivity2_2.class);
                startActivity(intent);
            }
        });
    }

}
