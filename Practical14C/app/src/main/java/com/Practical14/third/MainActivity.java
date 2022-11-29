package com.Practical14.third;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	public static final String[] s={"Button 1","Button 2","Button 3","Button 4","Button 5","Button 6","Button 7","Button 8","Button 9","Button 10","Button 11","Button 12","Button 13","Button 14","Button 15"};
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Button b=findViewById(R.id.b1);
		GridView g=findViewById(R.id.gv);
		
		ArrayAdapter a= new ArrayAdapter(this,R.layout.button,R.id.b1,s);
		g.setAdapter(a);
    }
}
