package com.mycompany.pr22;

import android.app.*;
import android.graphics.*;
import android.hardware.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity implements SensorEventListener
{
    private SensorManager sensorManager;
    private boolean isColor = false;
    private View view;
    private long lastUpdate;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        view = findViewById(R.id.textView);
        view.setBackgroundColor(Color.GREEN);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        lastUpdate = System.currentTimeMillis();
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {}
    
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            getAccelerometer(event);
        }

    }

    private void getAccelerometer(SensorEvent event) {
        float[] values = event.values;
       
        float x = values[0];
        float y = values[1];
        float z = values[2];

        float accelationSquareRoot = (x * x + y * y + z * z)/ (SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH);

        long actualTime = System.currentTimeMillis();
        

        if (accelationSquareRoot >= 3) 
        {

            if (actualTime - lastUpdate < 200) {
                return;
            }
            lastUpdate = actualTime;
            if (isColor) {
                view.setBackgroundColor(Color.YELLOW);

            } else if (isColor){
                view.setBackgroundColor(Color.BLUE);
            }
            else
            {
                view.setBackgroundColor(Color.GREEN);
            }
            isColor = !isColor;
        }
    }

    protected void onResume() {
        super.onResume();
   
        sensorManager.registerListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
									   SensorManager.SENSOR_DELAY_NORMAL);
    }

 
    protected void onPause() {
     
        super.onPause();
        sensorManager.unregisterListener(this);
    }
}
