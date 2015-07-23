package com.tustar.demo;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabWidget;

import com.tustar.demo.fragment.TabTestFragment;
import com.tustar.demo.utils.Logger;

@TargetApi(Build.VERSION_CODES.KITKAT)
public class MainHostActivity extends FragmentActivity implements
		OnTabChangeListener {

	private static final String TAG = MainHostActivity.class.getSimpleName();
	private Context context;
	private FragmentTabHost mTabHost;
	private FragmentManager mFragmentManager;

	// Tab tag
	private static final String TAB_TAG_HOME = "home";
	private static final String TAB_TAG_SEARCH = "search";
	private static final String TAB_TAG_MSG = "msg";
	private static final String TAB_TAG_NEARBY = "nearby";
	private static final String TAB_TAG_ME = "me";

	// Tab index
	public static final int TAB_INDEX_HOME = 0;
	public static final int TAB_INDEX_SEARCH = 1;
	public static final int TAB_INDEX_MSG = 2;
	public static final int TAB_INDEX_NEARBY = 3;
	public static final int TAB_INDEX_ME = 4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Logger.i(TAG, "onCreate :: savedInstanceState = " + savedInstanceState);
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main_host);
		context = this;

		// View
		mFragmentManager = getSupportFragmentManager();
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, mFragmentManager, android.R.id.tabcontent);
		TabWidget mTabWidget = (TabWidget) findViewById(android.R.id.tabs);
		if (Build.VERSION.SDK_INT >= 11) {
			mTabWidget.setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
		}

		// Home
		mTabHost.addTab(
				mTabHost.newTabSpec(TAB_TAG_HOME).setIndicator(TAB_TAG_HOME),
				TabTestFragment.class, null);
		
		// Search
		mTabHost.addTab(
				mTabHost.newTabSpec(TAB_TAG_SEARCH).setIndicator(TAB_TAG_SEARCH),
				TabTestFragment.class, null);

		mTabHost.setOnTabChangedListener(this);
	}

	@Override
	public void onTabChanged(String tabId) {
		Logger.i(TAG, "onTabChanged :: tabId = " + tabId);
	}
}