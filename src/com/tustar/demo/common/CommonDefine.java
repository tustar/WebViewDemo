package com.tustar.demo.common;

/**
 * Created by Tu on 4/8/15.
 */
public interface CommonDefine {

	/**
	 * 服务器地址
	 */
	// 个人本地服务器
	public static final String MI_H5_URL = "http://10.0.1.139:3000/";
	public static final String MI_H5_HOST = "10.0.1.139";
	// public static final String MI_API_URL = "http://10.0.1.139:3001/v1";

	// 测试服务器
	// public static final String MI_H5_URL = "http://test.m.tanliani.com/";
	// public static final String MI_H5_HOST = "test.m.tanliani.com";

	// 正式服务器
	// public static final String MI_H5_URL = "http://m.tanliani.com/";
	// public static final String MI_H5_HOST = "m.tanliani.com";
	public static final String MI_API_URL = "http://api.tanliani.com/v1";

	// Tab页可直接退出
	public static final String MI_H5_MEMBERS_HOME = MI_H5_URL + "members/home";
	public static final String MI_H5_MEMBERS_SEARCH = MI_H5_URL
			+ "members/search";
	public static final String MI_H5_MESSAGE_MSG = MI_H5_URL + "message/index";
	public static final String MI_H5_MEMBERS_NEARBY = MI_H5_URL
			+ "members/neighbour";
	public static final String MI_H5_MEMBERS_ME = MI_H5_URL + "members/me";
	public static final String MI_H5_MEMBERS_HELP = MI_H5_URL + "members/help";
	public static final String MI_H5_MEMBERS_REGISTER = MI_H5_URL
			+ "members/register";
	public static final String MI_H5_MEMBERS_MYINFO = MI_H5_URL
			+ "members/myinfo";

	public static final String MI_ME_HELP_JS = "javascript:window.location.href=$(\".me_help\").attr(\"href\");";
	//
	public static final String MI_INTERFACE_NAME = "Mi";

	// 快钱
	public static final String MI_H5_99BILL = "www.99bill.com";

	// 后台应用API_KEY
	public static final String MI_API_KEY = "MI_API_KEY";
	public static final String MI_WX_APP_ID = "MI_WX_APP_ID";
	public static final String MI_WX_APP_SECRET = "MI_WX_APP_SECRET";
	public static final String META_NAME_UMENG_CHANNEL = "UMENG_CHANNEL";

	/**
	 * 微信登录授权
	 */
	public static final String WX_SNS = "https://api.weixin.qq.com/sns";
	// 通过code获取access_token
	// ?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code
	public static final String WX_SNS_ACCESS_TOKEN = WX_SNS
			+ "/oauth2/access_token";
	// 获取用户个人信息（UnionID机制）
	public static final String WX_SNS_USERINFO = WX_SNS + "/userinfo";

	// savedInstanceState
	public static final String TAKING_PICTURE_STRING = "taking_picture";
	public static final String CURRENT_URL = "current_url";
	public static final String CURRENT_TAB_INDEX = "current_tab_index";

	// intent filed
	public static final String RESPONESE_IMG_URL = "responese_img_url";
	public static final String IMG_CAPTURE = "img_capture";
	public static final String UPLOAD_IMG_TYPE = "upload_img_type";
	public static final String USER_ID = "user_id";
	public static final String USER_TOKEN = "user_token";
	public static final String APP_CACHE_DIRNAME = "/webcache";
	public static final String IMG_LOAD_REFRASH = "img_refrash";

	/**
	 * SharePreferences
	 */
	public static final String APP_PREF_FILE = "mi";
	public static final String PREF_KEY_IMEI = "imei";
	public static final String PREF_KEY_GETUI_CID = "getui_cid";
	public static final String PREF_KEY_GETUI_UPLOADED = "getui_cid_uploaded";
	public static final String PREF_KEY_UNIQUE_ID = "unique_id";
	public static final String PREF_KEY_HAS_PUSH_MESSAGE = "has_push_message";
	public static final String PREF_KEY_OUT_TRADE_NO = "out_trade_no";
	public static final String PREF_KEY_REFRESH_TABME = "refresh_tabme";
	public static final String PREF_KEY_MSG_COUNT = "msg_count";
	public static final String PREF_KEY_HAS_WX_INFO = "has_wx_info";
	public static final String PREF_KEY_REFRESH_SEARCH = "refresh_search";
	public static final String PREF_KEY_REFRESH_ME_WEBVIEW = "refresh_me_webview";

	// Tabs
	public static final String PREF_KEY_HOME_REFRESH = "home_refresh";
	public static final String PREF_KEY_SEARCH_REFRESH = "search_refresh";
	public static final String PREF_KEY_INDEX_REFRESH = "index_refresh";
	public static final String PREF_KEY_NEIGHBOUR_REFRESH = "beighbour_refresh";
	public static final String PREF_KEY_ME_REFRESH = "me_refresh";

	public static final String PREF_KEY_H5_PROVINCE = "province";

	/**
	 * Intent key
	 */
	public static final String INTENT_KEY_PUSH_MSG = "push_msg";
	public static final String INTENT_KEY_URL = "url";
	public static final String INTENT_KEY_LOAD_JS = "load_js";
	public static final String INTENT_KEY_PROVINCE = "province";
	public static final String INTENT_KEY_PRODUCT_ID = "product_id";
	public static final String INTENT_KEY_MEMBER_ID = "member_id";
	public static final String INTENT_KEY_TAB_INDEX = "tab_index";

	/**
	 * Intent action
	 */
	public static final String INTENT_ACTION_SHOW_GETUI_PUSH = "show_getui_push";
	public static final String INTENT_ACTION_SHOW_PAY_REUSLT = "show_pay_result";
	public static final String INTENT_ACTION_CALL_WX_PAY = "call_wx_pay";
	public static final String INTENT_ACTION_GETUI_PUSH_MSG = "getui_push_msg";
	public static final String INTENT_ACTION_RELOAD_TAB = "reload_tab";

	// cookies是在HttpClient中获得的cookie
	public static final String TAB_VERSION_KEY = "versionCode";
	public static final int TAB_VERSION_VALUE = 132;

	public interface RequestCode {
		public static final int SelectProvinceDialogActivity = 0x000001;
		public static final int ImageUploadActivity = 0x000002;
		public static final int REQUEST_CODE_OPEN_FILE_CHOOSER = 100;
		public static final int REQUEST_CODE_UPLOAD_IMAGE = 300;
	}
}
