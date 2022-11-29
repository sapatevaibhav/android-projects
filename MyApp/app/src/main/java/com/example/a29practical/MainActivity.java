package com.example.a29practical;

import android.app.*;
import android.content.pm.*;
import android.os.*;
import android.telephony.*;
import android.view.*;
import android.widget.*;
import java.util.jar.*;

public class MainActivity extends Activity {
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    Button sendBtn;
    EditText txtphoneNo,txtMessage;
    String phoneNo;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        sendBtn = (Button) findViewById(R.id.btnSendSMS);
        txtphoneNo = (EditText) findViewById(R.id.editText);
        txtMessage = (EditText) findViewById(R.id.editText2);
        sendBtn.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {
					sendSMSMessage();
				}
			});
    }
    protected void sendSMSMessage() {
        phoneNo = txtphoneNo.getText().toString();
        message = txtMessage.getText().toString();
        
    }
    @Override
    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
					if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
						SmsManager smsManager = SmsManager.getDefault();
						smsManager.sendTextMessage(phoneNo, null, message, null, null);
						Toast.makeText(getApplicationContext(), "SMS Successfully Send.", Toast.LENGTH_LONG).show();
					} else {
						Toast.makeText(getApplicationContext(), "Failed to Send, + \n + Please try again.", Toast.LENGTH_LONG).show();
						return;
					}
				}
        }
    }
}





