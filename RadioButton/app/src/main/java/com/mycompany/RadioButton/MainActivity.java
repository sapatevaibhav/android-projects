package com.mycompany.RadioButton;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;

public class MainActivity extends Activity {

    RadioButton r1, r2, r3, r4;
    RadioGroup rg;
	Button b1;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        r1 = findViewById(R.id.radio1);
        r2 = findViewById(R.id.radio2);
        r3 = findViewById(R.id.radioMale);
        r4 = findViewById(R.id.radioFemale);
        rg = findViewById(R.id.radioGroup);
		b1=findViewById(R.id.button);
	
		b1.setOnClickListener(new Button.OnClickListener(){
			public void onClick(View v){
				String s="",s1="",s2="";
				if(r1.isChecked()){
					s="Radio Button 1 is selected";
				}
				if(r2.isChecked()){
					s1="Radio Button 2 is selected";
				}
				if(r3.isChecked()){
					s2="Male is selected";
				}
				else if(r4.isChecked()){
					s2="Female is selected";
				}
				Toast.makeText(getApplicationContext(),s+"\n"+s1+"\n"+s2,Toast.LENGTH_SHORT).show();
			}
		});
    }

    
}
