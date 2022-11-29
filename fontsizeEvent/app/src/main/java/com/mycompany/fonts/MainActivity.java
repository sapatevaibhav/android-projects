package com.mycompany.fonts;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		final TextView t=findViewById(R.id.mainTextView);
		Button b=findViewById(R.id.mainButton);
		t.setTextSize(15);
		b.setOnClickListener(new Button.OnClickListener(){
			public void onClick(View v){
				int font=(int) t.getTextSize();
				font+=5;
				
				if(font==30){
					font=15;
				}else{}
				t.setTextSize(font);
			}
		});
    }
}
