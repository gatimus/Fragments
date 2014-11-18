package com.wl.fragments;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
		android.support.v4.app.FragmentTransaction transaction = fm.beginTransaction();
		
		StartFrag startFragment = new StartFrag();
		
		transaction.add(R.id.fragment_placeholder, startFragment);
		transaction.commit();
		
	}

public void onSelectFragment(View v) {
	
	android.support.v4.app.Fragment fr;
	
	if(v == findViewById(R.id.btnStart)) {
		fr = new StartFrag();
	} else if (v == findViewById(R.id.btnFragment01)) {
		fr = new Frag01();
	} else if (v == findViewById(R.id.btnFragment02)) {
		fr = new Frag02();
	} else
		fr = new StartFrag();
	
	android.support.v4.app.FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
	trans.replace(R.id.fragment_placeholder, fr);
	trans.addToBackStack(null);
	trans.commit();
	
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	
}
