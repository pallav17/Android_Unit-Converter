package com.pallav.tempratureunitconverter;

import com.pallav.tempratureunitconverter.MainActivity;

import com.pallav.tempratureunitconverter.duplicate;
import com.pallav.tempratureunitconverter.duplicate1;
import com.pallav.tempratureunitconverter.duplicate2;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends ActionBarActivity 
{

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        
        Button b1 = (Button) findViewById(R.id.btn1);
        Button b2 = (Button) findViewById(R.id.btn2);
        Button b3 = (Button) findViewById(R.id.btn3);
        
       
        
        b1.setOnClickListener(new OnClickListener() 
        {
			
        	@Override
			public void onClick(View arg0)
        	{
        		Intent iv = new Intent(MainActivity.this,duplicate.class);
        		startActivity(iv);
			}
		});
        
        b2.setOnClickListener(new OnClickListener() 
        {
        	@Override
			public void onClick(View arg0)
        	{
        		Intent v = new Intent(MainActivity.this,duplicate1.class);
        		startActivity(v);
			}
        });
     
        b3.setOnClickListener(new OnClickListener() 
        {
			
        	@Override
			public void onClick(View arg0)
        	{
        		Intent vi = new Intent(MainActivity.this,duplicate2.class);
        		startActivity(vi);
			}
		
        });
        
        
   }
    
}
    



