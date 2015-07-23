package com.tustar.demo;

import java.util.HashMap;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;

import com.tustar.demo.common.CommonDefine;
import com.tustar.demo.utils.DeviceUtils;
import com.tustar.demo.widget.MiWebView;

@SuppressLint("JavascriptInterface")
public class MainTestActivity extends Activity {

	public static final String TAG = null;
	private Context context;
	private MiWebView mCurrentWebView;
	// WebView header
	private HashMap<String, String> additionalHttpHeaders = new HashMap<String, String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main_test);
		context = this;

		mCurrentWebView = (MiWebView) findViewById(R.id.main_test_webview);
		WebSettings setting = mCurrentWebView.getSettings();
		setting.setJavaScriptEnabled(true);
		setting.setUserAgentString("Mi-Android");

		additionalHttpHeaders.put("unique_id", DeviceUtils.getIMEI(context));
		additionalHttpHeaders.put("ApiKey", "76b86bbd");

		mCurrentWebView.loadUrl(CommonDefine.MI_H5_MEMBERS_SEARCH);
		// mWebView.loadUrl("file:///android_asset/select.html");
	}
}
