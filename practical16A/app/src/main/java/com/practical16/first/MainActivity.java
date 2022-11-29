package com.practical16.first;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
   
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		TimePicker tp=findViewById(R.id.tp);
		TimePicker tp1=findViewById(R.id.tp0);
		tp.setIs24HourView(true);
		tp1.setIs24HourView(true);
		
		
    }
}
