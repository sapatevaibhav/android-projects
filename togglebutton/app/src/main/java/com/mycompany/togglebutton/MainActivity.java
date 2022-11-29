package com.mycompany.togglebutton;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.graphics.drawable.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		
		ToggleButton t=findViewById(R.id.mainToggleButton);
		final ImageView i=findViewById(R.id.mainImageView);
		
		t.setOnClickListener(new ToggleButton.OnClickListener(){

			boolean check=true;
				
				public void onClick(View p1)
				{
					
					if(check){
					i.setImageResource(R.drawable.baker);
					check=false;
					}else{
						i.setImageResource(R.drawable.off);
						check=true;
					}
				}

			
		});
	
    }
}
