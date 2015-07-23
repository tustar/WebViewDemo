package com.tustar.demo.fragment;

import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebView.FindListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

import com.tustar.demo.R;
import com.tustar.demo.utils.DeviceUtils;
import com.tustar.demo.utils.Logger;

/**
 * A simple {@link Fragment} subclass. Activities that contain this fragment
 * must implement the {@link TabSearchFragment.OnFragmentInteractionListener}
 * interface to handle interaction events. Use the
 * {@link TabTestFragment#newInstance} factory method to create an instance of
 * this fragment.
 */
public class TabTestFragment extends Fragment {

	private static final String TAG = TabTestFragment.class.getSimpleName();

	private View view;
	private WebView mCurrentWebView;
	private HashMap<String, String> additionalHttpHeaders = new HashMap<String, String>();
	private Context context;

	public static TabTestFragment newInstance() {
		TabTestFragment fragment = new TabTestFragment();
		return fragment;
	}

	public TabTestFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Logger.i(TAG, "onCreate :: savedInstanceState = " + savedInstanceState);
		super.onCreate(savedInstanceState);
		context = getActivity();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_tab_test, container, false);
		RelativeLayout mLayout = (RelativeLayout) view
				.findViewById(R.id.frag_tab_test_layout);
		mCurrentWebView = new WebView(getActivity());
		mLayout.addView(mCurrentWebView, LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT);
		
		WebSettings setting = mCurrentWebView.getSettings();
		setting.setJavaScriptEnabled(true);
		setting.setUserAgentString("Mi-Android");
		mCurrentWebView.setWebChromeClient(new WebChromeClient());
		mCurrentWebView.setWebViewClient(new WebViewClient());

		additionalHttpHeaders.put("unique_id", DeviceUtils.getIMEI(context));
		additionalHttpHeaders.put("ApiKey", "76b86bbd");

		// mCurrentWebView.loadUrl(CommonDefine.MI_H5_MEMBERS_SEARCH);
		mCurrentWebView.loadUrl("file:///android_asset/select.html");

		return view;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}

	@Override
	public void onResume() {
		Logger.i(TAG, "onResume :: ");
		super.onResume();
	}

	@Override
	public void onPause() {
		Logger.i(TAG, "onPause :: ");
		super.onPause();
	}

	@Override
	public void onStop() {
		Logger.i(TAG, "onStop :: ");
		super.onStop();
	}

	@Override
	public void onDetach() {
		super.onDetach();
	}
}
