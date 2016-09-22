package com.example.nagar.aseandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onButtonClick(View v)
    {
        if(v.getId()==R.id.Blogin)
         {

             EditText a=(EditText)findViewById(R.id.TFusername);
             String str= a.getText().toString();



           Intent i =new Intent(MainActivity.this,display.class);
           i.putExtra("username",str);

            startActivity(i);

         }
        if(v.getId() == R.id.Bsignup)
        {
            Intent i =new Intent(MainActivity.this,Signup.class);


            startActivity(i);



        }
    }
}
