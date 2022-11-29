package com.Practical14.second;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.graphics.drawable.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Button b=findViewById(R.id.b);
		final ImageView i=findViewById(R.id.i);
		
		b.setOnClickListener(new Button.OnClickListener(){
			public boolean a=true;
			public void onClick(View v){
				if(a){
					i.setImageResource(R.drawable.user_avatar);
					a=false;
				}
				else{
					i.setImageResource(R.drawable.bot_avatar);
					a=true;
				}
			}
		});
    }
}
