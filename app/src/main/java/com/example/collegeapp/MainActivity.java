package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText ed1,ed2;
     AppCompatButton b1,b2;
     String getem,getpwd,prefvalues;
     SharedPreferences mypreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mypreferences=getSharedPreferences("login",MODE_PRIVATE);
        ed1=(EditText)findViewById(R.id.email);
        ed2=(EditText)findViewById(R.id.pass);
        b1=(AppCompatButton)findViewById(R.id.login);
        b2=(AppCompatButton)findViewById(R.id.reg);
        prefvalues=mypreferences.getString("email",null);
        if(prefvalues!=null)
        {
            Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
            startActivity(i);
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getem=ed1.getText().toString();
                getpwd=ed2.getText().toString();
                Toast.makeText(getApplicationContext(), getem, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getpwd,Toast.LENGTH_LONG).show();
                if(getem.equals("admin")&&getpwd.equals("12345"))
                {
                    SharedPreferences.Editor myEdit= mypreferences.edit();
                    myEdit.putString("email",getem);
                    myEdit.commit();
                    Intent i=new Intent(getApplication(),DashboardActivity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"invalid credentials",Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplication(),RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}