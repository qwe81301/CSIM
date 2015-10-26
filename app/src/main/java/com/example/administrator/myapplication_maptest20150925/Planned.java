package com.example.administrator.myapplication_maptest20150925;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Planned extends AppCompatActivity {

    Button btn3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planned);

        btn3 = (Button) findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent = new Intent();
                intent.setClass(Planned.this, MapsActivity3.class);
                startActivity(intent);
            }
        });
    }
}
