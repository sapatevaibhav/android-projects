package com.practical15.second;

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

		final CheckBox cb1=findViewById(R.id.c1);
		final CheckBox cb2=findViewById(R.id.c2);
		final CheckBox cb3=findViewById(R.id.c3);
		Button b1=findViewById(R.id.b1);

		b1.setOnClickListener(new Button.OnClickListener(){

				public void onClick(View v)
				{	
					String s="Selected Items:";
					int price=0;
					if (cb1.isChecked())
					{
						s += ("\nPizza 200Rs");
						price += 200;
					}
					if (cb2.isChecked())
					{
						s += ("\nCoffe 50Rs");
						price += 50;
					}
					if (cb3.isChecked())
					{
						s += ("\nBurger 120Rs");
						price += 120;
					}
					String total=String.valueOf(price)+" Rs";
					Toast.makeText(getApplicationContext(), s + "\nTotal: " + total , Toast.LENGTH_SHORT).show();
				}
			});
    }
}
