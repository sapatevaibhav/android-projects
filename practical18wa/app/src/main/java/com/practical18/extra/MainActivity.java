package com.practical18.extra;
import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.widget.*;
public class MainActivity extends Activity 
{
	private Button b;
	private EditText e,e0;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		b = findViewById(R.id.mainButton);
		e = findViewById(R.id.et1);
		e0 = findViewById(R.id.et2);
		b.setOnClickListener(new View.OnClickListener(){
				public void onClick(View p1)
				{
					String phoneno=e.getText().toString();
					String message=e0.getText().toString();
					String a="https://wa.me/+91" + phoneno + "?text=" + message;
					Intent i=new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse(a));
					startActivity(i);
				}
			});
    }
}

