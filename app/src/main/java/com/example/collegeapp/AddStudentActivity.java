package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudentActivity extends AppCompatActivity {
  EditText ed1,ed2,ed3,ed4;
  AppCompatButton b1,b2;
  String getname,getrollnumber,getadmissionnumber,getcollege;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.rollnumber);
        ed3=(EditText) findViewById(R.id.adimissionnumber);
        ed4=(EditText) findViewById(R.id.college);
        b1=(AppCompatButton) findViewById(R.id.addstudent);
        b2=(AppCompatButton) findViewById(R.id.backtodashboard);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=ed1.getText().toString();
                getrollnumber=ed2.getText().toString();
                getadmissionnumber=ed3.getText().toString();
                getcollege=ed4.getText().toString();
                Toast.makeText(getApplicationContext(), getname, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), getrollnumber, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), getadmissionnumber, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), getcollege, Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplication(),DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}