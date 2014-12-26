package com.example.a01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	EditText editText1, editText2;
	Button button1;
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         editText1 = (EditText) findViewById(R.id.editText1);
         editText2 = (EditText) findViewById(R.id.editText2);
         button1 = (Button) findViewById(R.id.button1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void calc(View view) {
    	double height = Double.parseDouble(editText1.getText().toString()) / 100;
    	double weight = Double.parseDouble(editText2.getText().toString());
    	double BMI = weight / (height * height);
    	
    	TextView textView1= (TextView) findViewById(R.id.textView1);
    	
    	textView1.setText(String.valueOf(BMI));
    	
    	
    }
             
  
    }

