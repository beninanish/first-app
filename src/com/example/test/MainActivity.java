package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	 Button buttonHello;
	 TextView textviewHello;
	 EditText textInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonHello = (Button)findViewById(R.id.hello_button);
        textviewHello = (TextView)findViewById(R.id.Hellotextview);
        textInput = (EditText)findViewById(R.id.input_text);
        buttonHello.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String data = textInput.getText().toString();
				Toast msg = Toast.makeText(getApplicationContext(), "HELLO", Toast.LENGTH_LONG);
				msg.show();
			
				Intent i = new Intent(MainActivity.this,SecActivity.class);
				i.putExtra("username",data);
				startActivity(i);
			}
		});
    }
 
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}