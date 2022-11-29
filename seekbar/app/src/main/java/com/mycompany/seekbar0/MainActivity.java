package com.mycompany.seekbar0;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		final SeekBar s1=findViewById(R.id.mainSeekBar);
		final RatingBar r1=findViewById(R.id.mainRatingBar);
		final TextView t1=findViewById(R.id.mainTextView);
		final TextView t2=findViewById(R.id.mainTextView2);


		s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){ 


				public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
				{ 
					t1.setText("SeekBar:" + String.valueOf(progress)); 
				} 


				public void onStartTrackingTouch(SeekBar seekBar)
				{ 
				} 


				public void onStopTrackingTouch(SeekBar seekBar)
				{
				} 
			}); 



		/*r1.setOnClickListener(new RatingBar.OnClickListener(){
		 public void onClick(View v2){

		 t2.setText("RatingBar:"+r1.getRating());
		 }
		 });*/

		r1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

				public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser)
				{
					t2.setText("RatingBar:" + String.format("%2.1f", rating));
				}
			});
    }
}
