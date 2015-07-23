package com.tustar.demo.widget;

import android.content.Context;
import android.support.v4.app.FragmentTabHost;
import android.util.AttributeSet;

public class MiTabHost extends FragmentTabHost {

	public MiTabHost(Context context) {
		super(context);
	}

	public MiTabHost(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public void onTouchModeChanged(boolean isInTouchMode) {

	}
}
