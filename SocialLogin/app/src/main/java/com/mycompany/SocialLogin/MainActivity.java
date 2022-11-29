package com.mycompany.SocialLogin;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		final EditText e1=findViewById(R.id.username);
		final EditText e2=findViewById(R.id.password);
		Button b1=findViewById(R.id.b1);

		b1.setOnClickListener(new Button.OnClickListener(){
				public void onClick(View v)
				{
					String user=e1.getText().toString();
					String pass=e2.getText().toString();
					if (user.isEmpty() || pass.isEmpty())
					{
						Toast.makeText(getApplicationContext(), "Enter Values please", Toast.LENGTH_SHORT).show();
					}
					else if (user.equals( "admin" )&& pass.equals("admin"))
					{
						Toast.makeText(getApplicationContext(), "Logged in", Toast.LENGTH_SHORT).show();
					}
					else if (pass!= "admin"||user!="admin")
					{
						Toast.makeText(getApplicationContext(), "Invalid username or password", Toast.LENGTH_SHORT).show();
					}
				}
			});
    }
}
