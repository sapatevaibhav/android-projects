/*package com.mycompany.radiobutton;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

    RadioButton radio1, radio2, radioMale, radioFemale;
    RadioGroup radioGroup;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radioMale = findViewById(R.id.radioMale);
        radioFemale = findViewById(R.id.radioFemale);
        radioGroup = findViewById(R.id.radioGroup);
    }

    public void showSelected(View view) {
        String selected = "Selected radio buttons:\n";

        if(radio1.isChecked())
            selected += "Radio Button 1\n";

        if(radio2.isChecked())
            selected += "Radio Button 2\n";

        RadioButton selectedRadio = findViewById(radioGroup.getCheckedRadioButtonId());
        selected += selectedRadio.getText().toString();
        Toast.makeText(MainActivity.this, selected, Toast.LENGTH_SHORT).show();
    }
}*/
