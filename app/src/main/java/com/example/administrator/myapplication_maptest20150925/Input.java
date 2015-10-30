package com.example.administrator.myapplication_maptest20150925;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Input extends AppCompatActivity {

    Button btn, btn1 ,btn3,btn4;
    EditText et1, et2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);



        btn = (Button) findViewById(R.id.btn);
        btn1 = (Button) findViewById(R.id.btn1);
        //et2 = (EditText)findViewById(R.id.et2);

        //btn3 = (Button) findViewById(R.id.button1);
        btn4 = (Button) findViewById(R.id.button2);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(Input.this, Inquiry.class);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(Input.this, Inquiry.class);
                startActivity(intent);
            }
        });

//        btn3.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent();
//                intent.setClass(Input.this, .class);
//                startActivity(intent);
//            }
//        });

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(Input.this, AfterPlanSite.class);
                startActivity(intent);
            }
        });





    }


/*
    Intent intent = getIntent();
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {


                String result = data.getExtras().getString("sitename");
        Log.v("tt", "qweqwe" +result);
                et2.setText(result);



    }
*/
}
