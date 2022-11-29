package com.mycompany.pr22B;

import android.app.*;
import android.os.*;

import android.app.*;
import android.content.*;
import android.hardware.*;
import android.os.*;
import android.widget.*;
import java.util.*;

public class MainActivity extends Activity {

	SensorManager smm;
	List<Sensor> sensor;
	ListView lv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		smm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		lv = (ListView) findViewById (R.id.mainListView);
		sensor = smm.getSensorList(Sensor.TYPE_ALL);
		lv.setAdapter(new ArrayAdapter<Sensor>(this, android.R.layout.simple_list_item_1,  sensor));
	}
}
