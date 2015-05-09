package com.pallav.tempratureunitconverter;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class duplicate extends ActionBarActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.duplicate);
		Button b5 = (Button)findViewById(R.id.btn5);
		b5.setOnClickListener(new View.OnClickListener()
		{
			@Override 
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				TextView tv1 = (TextView) findViewById(R.id.txt2);
				TextView tv3 = (TextView) findViewById(R.id.txt6);
				EditText no = (EditText) findViewById(R.id.txt3);

				String strno = no.getText().toString();

              if(no.getText().toString().equals(""))
				{
					Toast.makeText(getApplicationContext(), "Please Enter the Value", Toast.LENGTH_LONG).show();
				}	
				else
				{	float n1 = Float.parseFloat(no.getText().toString());

				tv3.setTextColor(Color.GREEN);
				tv3.setTextSize(20);
				tv3.setText("The Value in Fahrenheit is  " +String.valueOf(1.8*n1+32) +"F");

				}		
			} 

		});
	} } 



