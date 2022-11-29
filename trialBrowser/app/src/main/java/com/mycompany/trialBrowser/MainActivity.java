package com.mycompany.trialBrowser;
import android.app.*;
import android.os.*;
import android.webkit.*;
import android.widget.*;
import android.view.*;
import android.net.*;

public class MainActivity extends Activity 
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		final WebView browser=findViewById(R.id.webview);
		final EditText link=findViewById(R.id.editTextLink);
		Button btn_visit=findViewById(R.id.btnView);
		browser.setWebViewClient(new myWebViewClient());

		btn_visit.setOnClickListener(new Button.OnClickListener(){
				public void onClick(View v)
				{
					String url=link.getText().toString();
					browser.getSettings().setLoadsImagesAutomatically(true);
					browser.getSettings().setJavaScriptEnabled(true);
					if (url.contains("http://") || url.contains("https://"))
					{
						browser.loadUrl(url);
					}
					else
					{
						String google = "https://www.google.com/search?q=";
						url = google + url;
						browser.loadUrl(url);
					}
				}
			});
    }
	private class myWebViewClient extends WebViewClient
	{
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			if (Uri.parse(url).getHost().equals("www.example.com")) {
				
				view.loadUrl(url);
			}
			// Else the WebView handles it as normal
			return false;
	}
}}
