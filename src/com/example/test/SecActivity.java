package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecActivity extends Activity {
	 TextView result;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sec);
		result = (TextView)findViewById(R.id.textView1);
		result.setText("Test");
		Typeface custom_font = Typeface.createFromAsset(getAssets(), "Pacifico.ttf");	
		Intent i = getIntent();
		String data_from_main_activity = i.getStringExtra("username");
		result.setTypeface(custom_font);
		result.setText( data_from_main_activity);
		
	}

}