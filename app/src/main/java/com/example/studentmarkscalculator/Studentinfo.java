package com.example.studentmarkscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Studentinfo extends AppCompatActivity {

    TextView infoview,s1view,s2view,s3view,s4view,s5view,s6view,totview,avgview,gradeview;
    Button backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentinfo);

        infoview = (TextView) findViewById(R.id.R1id);
        s1view = (TextView) findViewById(R.id.s1viewid);
        s2view = (TextView) findViewById(R.id.s1viewid2);
        s3view = (TextView) findViewById(R.id.s1viewid3);
        s4view = (TextView) findViewById(R.id.s1viewid4);
        s5view = (TextView) findViewById(R.id.s1viewid5);
        s6view = (TextView) findViewById(R.id.s1viewid6);
        totview = (TextView) findViewById(R.id.s1viewid7);
        avgview = (TextView)findViewById(R.id.s1viewid8);
        gradeview = (TextView) findViewById(R.id.s1viewid9);
        backbutton = (Button) findViewById(R.id.backbuttonid);



        Bundle bundle = getIntent().getExtras();


        if (bundle != null ) {
            String name = bundle.getString("username");
            infoview.setText( name);
            String s1 = bundle.getString("sub1");
            s1view.setText(s1);
            String s2 = bundle.getString("sub2");
            s2view.setText(s2);
            String s3 = bundle.getString("sub3");
            s3view.setText(s3);
            String s4 = bundle.getString("sub4");
            s4view.setText(s4);
            String s5 = bundle.getString("sub5");
            s5view.setText(s5);
            String s6 = bundle.getString("sub6");
            s6view.setText(s6);
            String s7 = bundle.getString("sub7");
            totview.setText(s7);
            String s8 = bundle.getString("sub8");
            avgview.setText(s8);
            String s9 = bundle.getString("sub9");
            gradeview.setText(s9);


        }
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Studentinfo.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}