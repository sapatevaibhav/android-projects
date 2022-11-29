package com.mycompany.pr28a;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	int c=0;
	EditText e1,e2;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		e1=findViewById(R.id.mainEditText);
		e2=findViewById(R.id.mainEditText2);
	}
    public void login(View v){
		String a=e1.getText().toString();
		String b=e2.getText().toString();
		if(a.equals(null)&&b.equals(null)){
			c++;
			Toast.makeText(this,"null is not acceptable",Toast.LENGTH_SHORT).show();
		}
		if(a.length()<=8&&b.length()<=8){
			c++;
			Toast.makeText(this,"Length must be 8 characters\n current is:"+a.length()+" & "+b.length(),Toast.LENGTH_SHORT).show();
		}
		else{
	
			Toast.makeText(this,"Login successful",Toast.LENGTH_SHORT).show();
		}
		Toast.makeText(this,"total unsuccessful attempts: "+c,Toast.LENGTH_SHORT).show();
	}
}
