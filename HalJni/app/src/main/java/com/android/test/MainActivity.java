package com.android.test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.wqf.hellojni.HelloWorld;

public class MainActivity extends Activity{

    protected static final String TAG = "JNI";
	private HelloWorld jni = null;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		Log.d(TAG, "onCreate");

		jni = new HelloWorld();
		Log.d(TAG, "onCreate add = "+jni.add(4,5));

    }
}
