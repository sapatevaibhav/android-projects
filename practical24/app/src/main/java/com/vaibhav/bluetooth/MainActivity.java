package com.vaibhav.bluetooth;

import android.app.*;
import android.bluetooth.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;
public class MainActivity extends Activity  {
	private BluetoothAdapter BA;
	private Set<BluetoothDevice>pairedDevices;
	ListView lv;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		BA = BluetoothAdapter.getDefaultAdapter();
		lv = findViewById(R.id.listView);
	}
	public void on(View v){
		if (!BA.isEnabled()) {
			BA.enable();
		}
	}
	public void off(View v){
		if(BA.isEnabled()){
			BA.disable();
		}
	}
	public  void visible(View v){
		Intent getVisible = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
		startActivityForResult(getVisible, 0);
	}
	public void list(View v){
		pairedDevices = BA.getBondedDevices();
		ArrayList list = new ArrayList();
		for(BluetoothDevice bt : pairedDevices) list.add(bt.getName());
		final ArrayAdapter adapter = new  ArrayAdapter(this,android.R.layout.simple_list_item_1, list);
		lv.setAdapter(adapter);
	}
}
