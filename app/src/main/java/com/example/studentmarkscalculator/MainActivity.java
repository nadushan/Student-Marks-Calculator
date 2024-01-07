package com.example.studentmarkscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,s1,s2,s3,s4,s5,s6,s7,s8,s9;
    Button button1,button2,exit,report;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.nameid);
        s1 = (EditText) findViewById(R.id.s1id);
        s2 = (EditText) findViewById(R.id.s2id);
        s3 = (EditText) findViewById(R.id.s3id);
        s4 = (EditText) findViewById(R.id.s4id);
        s5 = (EditText) findViewById(R.id.s5id);
        s6 = (EditText) findViewById(R.id.s6id);
        s7 = (EditText) findViewById(R.id.s7id);
        s8 = (EditText) findViewById(R.id.s8id);
        s9 = (EditText) findViewById(R.id.s9id);

        button1 = (Button) findViewById(R.id.okid);
        button2 = (Button) findViewById(R.id.clearid);
        exit = (Button) findViewById(R.id.exitid);
        report = (Button) findViewById(R.id.reportid);

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String student = name.getText().toString();
                String sub1 = s1.getText().toString();
                String sub2 = s2.getText().toString();
                String sub3 = s3.getText().toString();
                String sub4 = s4.getText().toString();
                String sub5 = s5.getText().toString();
                String sub6 = s6.getText().toString();
                String tot = s7.getText().toString();
                String avg = s8.getText().toString();
                String grade = s9.getText().toString();



                Intent intent = new Intent(MainActivity.this, Studentinfo.class);

                intent.putExtra("username",student);

                intent.putExtra("sub1",sub1);
                intent.putExtra("sub2",sub2);
                intent.putExtra("sub3",sub3);
                intent.putExtra("sub4",sub4);
                intent.putExtra("sub5",sub5);
                intent.putExtra("sub6",sub6);
                intent.putExtra("sub7",tot);
                intent.putExtra("sub8",avg);
                intent.putExtra("sub9",grade);


                startActivity(intent);




            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear ();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                markscal();


            }
        });

    }
    public void markscal()
    {
        int a1,a2,a3,a4,a5,a6,tot;
        double avg;
        String grade;

        a1 = Integer.parseInt(s1.getText().toString());
        a2 = Integer.parseInt(s2.getText().toString());
        a3 = Integer.parseInt(s3.getText().toString());
        a4 = Integer.parseInt(s4.getText().toString());
        a5 = Integer.parseInt(s5.getText().toString());
        a6 = Integer.parseInt(s6.getText().toString());

        tot = a1+a2+a3+a4+a5+a6;

        s7.setText(String.valueOf(tot));

        avg = tot / 6;
        s8.setText(String.valueOf(avg));

        if (avg > 75)
        {
            s9.setText("A");
            s9.setTextColor(Color.GREEN);
        }
        else if (avg > 65)
        {
            s9.setText("B");
            s9.setTextColor(Color.YELLOW);

        }
        else if (avg > 55)
        {
            s9.setText("C");
            s9.setTextColor(Color.BLUE);
        }
        else if (avg > 45)
        {
            s9.setText("D");
            s9.setTextColor(Color.DKGRAY);
        }
        else
            s9.setText("Fail");
            s9.setTextColor(Color.RED);
    }
    public void clear ()
    {
        name.setText("");
        s1.setText("");
        s2.setText("");
        s3.setText("");
        s4.setText("");
        s5.setText("");
        s6.setText("");
        s7.setText("");
        s8.setText("");
        s9.setText("");
        s1.requestFocus();




    }
}