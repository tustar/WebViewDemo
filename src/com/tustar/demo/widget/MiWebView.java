package com.tustar.demo.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;

import com.tustar.demo.BuildConfig;
import com.tustar.demo.common.CommonDefine;

@TargetApi(Build.VERSION_CODES.KITKAT)
public class MiWebView extends WebView {

	public MiWebView(Context context) {
		super(context);
	}

	public MiWebView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@SuppressWarnings("deprecation")
	@SuppressLint("SetJavaScriptEnabled")
	public MiWebView(Context context, AttributeSet attrs) {
		super(context, attrs);
		WebSettings webSetting = getSettings();
		webSetting.setUserAgentString("Mi-Android");
		webSetting.setJavaScriptEnabled(true);
		webSetting.setRenderPriority(RenderPriority.HIGH);
		webSetting.setCacheMode(WebSettings.LOAD_DEFAULT); // 设置缓存模式
		webSetting.setDomStorageEnabled(true);
		webSetting.setDatabaseEnabled(true);
		webSetting.setAppCacheMaxSize(1024 * 1024 * 8);
		String appCachePath = context.getApplicationContext().getCacheDir()
				.getAbsolutePath()
				+ CommonDefine.APP_CACHE_DIRNAME;
		webSetting.setAppCachePath(appCachePath);
		webSetting.setDatabasePath(appCachePath);
		webSetting.setAllowFileAccess(true);
		webSetting.setAppCacheEnabled(true);
		
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
			setWebContentsDebuggingEnabled(BuildConfig.DEBUG);
		}
	}

	/**
	 * 同步一下cookie
	 */
	public void synCookies(Context context, String url) {
		CookieSyncManager.createInstance(context);
		CookieManager cookieManager = CookieManager.getInstance();
		cookieManager.setAcceptCookie(true);
		// cookieManager.removeSessionCookie();//移除
		cookieManager.setCookie(url, CommonDefine.TAB_VERSION_KEY + "="
				+ CommonDefine.TAB_VERSION_VALUE);// cookies是在HttpClient中获得的cookie
		CookieSyncManager.getInstance().sync();
	}

}
