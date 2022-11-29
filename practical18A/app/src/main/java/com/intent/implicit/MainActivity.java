package com.intent.implicit;
import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		final EditText et1=findViewById(R.id.mainEditText);
		Button b1=findViewById(R.id.b);
		
		b1.setOnClickListener(new Button.OnClickListener(){
			public void onClick(View v){
				String str="https://"+et1.getText().toString();
				Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse(str));
				startActivity(i);
			}
		});
    }
}
