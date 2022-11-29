package com.hello.user;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		final EditText e1=findViewById(R.id.mainEditText);
		Button b1=findViewById(R.id.mainButton);
		
		b1.setOnClickListener(new Button.OnClickListener(){
			public void onClick(View v){
				
				Toast.makeText(getApplicationContext(),"Hello "+(e1.getText()),Toast.LENGTH_SHORT).show();
			}
		});
    }
}
