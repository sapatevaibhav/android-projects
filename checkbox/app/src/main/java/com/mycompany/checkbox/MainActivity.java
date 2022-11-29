package com.mycompany.checkbox;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends Activity 
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		final CheckBox c1=findViewById(R.id.c1);
		final CheckBox c2=findViewById(R.id.c2);
		final CheckBox c3=findViewById(R.id.c3);
		final CheckBox c4=findViewById(R.id.c4);
		final CheckBox c5=findViewById(R.id.c5);
		Button b1=findViewById(R.id.b1);
		
		b1.setOnClickListener(new CheckBox.OnClickListener(){
				public void onClick(View p1)
				{
					String s="",s1="",s2="",s3="",s4="";
					if(c1.isChecked()){
						s="CO is checked";
					}
				
					if(c2.isChecked()){
						s1="IT is checked";
					}
					
					if(c3.isChecked()){
						s2="CE is checked";
					}
					
					if(c4.isChecked()){
						s3="ME is checked";
					}
					
					if(c5.isChecked()){
						s4="EX is checked";
					}
					
					
					Toast.makeText(getApplicationContext(),s+"\n"+s1+"\n"+s2+"\n"+s3+"\n"+s4,Toast.LENGTH_SHORT).show();
				}
		});
			
    }
}
