package com.example.nagar.aseandroidapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }
    public void onSignupClick(View v)
    {
        if(v.getId() == R.id.Bsignupbutton)
        {
            EditText name = (EditText) findViewById(R.id.TFname);
            EditText email = (EditText) findViewById(R.id.TFemail);
            EditText username = (EditText) findViewById(R.id.TFusername);
            EditText pass1 = (EditText) findViewById(R.id.TFpass1);



            String namestr =name.getText().toString();
            String emailstr =email.getText().toString();
            String usernamestr =username.getText().toString();
            String pass1str =pass1.getText().toString();





        }


    }


}
