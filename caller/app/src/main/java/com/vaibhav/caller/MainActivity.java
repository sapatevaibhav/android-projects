package com.vaibhav.caller;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
  private Button b;
  private EditText e;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		b=findViewById(R.id.mainButton);
		e=findViewById(R.id.mainEditText);
		
		b.setOnClickListener(new View.OnClickListener(){

		
				public void onClick(View p1)
				{
				String phoneno=e.getText().toString();
				Intent i=new Intent(Intent.ACTION_CALL);
				i.setData(Uri.parse(phoneno));
				startActivity(i);
				}

			
		});
    }
}
