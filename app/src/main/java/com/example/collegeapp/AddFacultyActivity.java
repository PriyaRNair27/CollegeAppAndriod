package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFacultyActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5;
AppCompatButton b1,b2;
String getfacultyname,getdepartment,getqualification,getmobilenumber,getemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        ed1=(EditText) findViewById(R.id.facultyname);
        ed2=(EditText) findViewById(R.id.department);
        ed3=(EditText) findViewById(R.id.qualification);
        ed4=(EditText) findViewById(R.id.mobilenumber);
        ed5=(EditText) findViewById(R.id.email);
        b1=(AppCompatButton) findViewById(R.id.addfaculty);
        b2=(AppCompatButton) findViewById(R.id.backtodashboard);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getfacultyname=ed1.getText().toString();
                getdepartment=ed2.getText().toString();
                getqualification=ed3.getText().toString();
                getmobilenumber=ed4.getText().toString();
                getemail=ed5.getText().toString();
                Toast.makeText(getApplicationContext(), getfacultyname, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), getdepartment, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), getqualification, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), getmobilenumber, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), getemail, Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplication(),DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}