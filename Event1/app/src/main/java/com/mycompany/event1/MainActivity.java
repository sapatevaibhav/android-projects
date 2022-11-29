package com.mycompany.event1;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		final EditText e1 =(EditText)findViewById(R.id.Et1);
		final EditText e2 =(EditText)findViewById(R.id.Et2);
		final EditText e3 =(EditText)findViewById(R.id.Et3);
		final EditText e4 =(EditText)findViewById(R.id.Et4);
		Button bt = (Button)findViewById(R.id.b1);

		bt.setOnClickListener(new Button.OnClickListener(){




				public void onClick(View v){
					//String s1=e1.getText().toString();
					//String s2=e2.getText().toString();
					//String s3=e3.getText().toString();
					//String s4=s2+" "+s3+" "+s1;
					
					String s4=e2.getText().toString()+" "+e3.getText().toString()+" "+e1.getText().toString();
					
					e4.setText(s4);
				}
			});
    }
}
