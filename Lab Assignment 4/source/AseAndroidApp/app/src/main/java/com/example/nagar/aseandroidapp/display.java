package com.example.nagar.aseandroidapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class display extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
       String username=getIntent().getStringExtra("username");
        TextView tv=(TextView)findViewById(R.id.TFusername);
        tv.setText(username);

    }
}
