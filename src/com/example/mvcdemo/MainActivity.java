package com.example.mvcdemo;

import com.example.bean.Person;
import com.example.model.PersonModelImpl;
import com.example.model.onPersonCompleteListener;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * C²ã:Controller
 * @author Simon
 *
 */
public class MainActivity extends Activity implements onPersonCompleteListener{

	private static final String TAG = "MainActivity";
	private PersonModelImpl mode;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}
	
	private void initView() {
		mode = new PersonModelImpl();
		mode.getPerson(0, this);
	}

	@Override
	public void onSuccess(Person person) {
		// TODO Auto-generated method stub
		Log.e(TAG, person.getName());
	}

	@Override
	public void onError() {
		// TODO Auto-generated method stub
		
	}
}
