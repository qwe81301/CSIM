package com.example.administrator.myapplication_maptest20150925;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Inquiry_keyword extends AppCompatActivity {

    Button btn;
    EditText et1 ;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_keyword);

        btn = (Button) findViewById(R.id.button2);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(Inquiry_keyword.this, MapsActivity.class);
                startActivity(intent);
            }
        });



    }
}
