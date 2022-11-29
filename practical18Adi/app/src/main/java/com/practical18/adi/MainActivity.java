package com.practical18.adi;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.widget.*;
public class MainActivity extends Activity 
{
	private Button b;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		b = findViewById(R.id.mainButton);

		b.setOnClickListener(new View.OnClickListener(){
				public void onClick(View p1)
				{
					
					Intent i= getPackageManager().getLaunchIntentForPackage(("com.whatsapp./contact.picker.ContactPicker"));
			
				
						
					
				try{
					startActivity(i);}
					catch(Exception e){
						Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_SHORT).show();
					
				}}
			});
    }
}

