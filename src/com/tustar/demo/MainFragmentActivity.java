package com.tustar.demo;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;

import com.tustar.demo.fragment.TabTestFragment;

public class MainFragmentActivity extends FragmentActivity {

	public static final String TAG = null;
	private Context context;
	private FragmentManager fm;
	private FragmentTransaction ft;
	private TabTestFragment mTabTestFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main_frag);
		context = this;

		fm = getSupportFragmentManager();
		ft = fm.beginTransaction();
		mTabTestFragment = new TabTestFragment();
		ft.replace(R.id.main_frag_container, mTabTestFragment);
		ft.commit();
	}
}
