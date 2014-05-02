package com.tapum.commuter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class AppInstalled extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("AppInstalled", "installed");
	}

}
