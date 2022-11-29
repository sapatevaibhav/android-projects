package com.mycompany.pr30;
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
    EditText eTo,eMsg;
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        eTo = findViewById(R.id.txtTo);
        
        eMsg = findViewById(R.id.txtMsg);
        
	}
	public void send(View v)
	{
		Intent it = new Intent(Intent.ACTION_SEND);
		it.putExtra(Intent.EXTRA_EMAIL, new String[]{eTo.getText().toString()});
		
		it.putExtra(Intent.EXTRA_TEXT, eMsg.getText());
		it.setType("message/rfc822");
		startActivity(Intent.createChooser(it, "Choose Mail App"));
	}
}

