package com.mycompany.datepick;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		DatePicker d=findViewById(R.id.mainDatePicker);
		int a=d.getDayOfMonth();
		Toast toast = Toast.makeText(getApplicationContext(),String.valueOf(a),Toast.LENGTH_SHORT);

		toast.show();
		
    }
}
