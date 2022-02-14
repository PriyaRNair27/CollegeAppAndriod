package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
         EditText e1,e2,e3,e4,e5;
         AppCompatButton b1,b2;
         String getname,getmobile,getemail,getpassword,getcfmpwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1 = (EditText) findViewById(R.id.name);
        e2 = (EditText) findViewById(R.id.mob);
        e3 = (EditText) findViewById(R.id.em);
        e4 = (EditText) findViewById(R.id.pwd);
        e5 = (EditText) findViewById(R.id.confirmpassword);
        b1 = (AppCompatButton) findViewById(R.id.register);
        b2 = (AppCompatButton) findViewById(R.id.log);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=e1.getText().toString();
                getmobile=e2.getText().toString();
                getemail=e3.getText().toString();
                getpassword=e4.getText().toString();
                getcfmpwd=e5.getText().toString();

                if (getpassword.equals(getcfmpwd))
                {
                    Toast.makeText(getApplicationContext(), getname, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getmobile, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getemail, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getpassword, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getcfmpwd, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),"matching",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "password and confirm password doesn't match", Toast.LENGTH_SHORT).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplication(),MainActivity.class);
                startActivity(i);
            }
        });


    }
}
