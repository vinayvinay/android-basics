package com.vinayvinay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeScreenActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_view);

		Button button = (Button) findViewById(R.id.show_list_view);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent switchToListView = new Intent(
						com.vinayvinay.HomeScreenActivity.this,
						com.vinayvinay.ListOfFruitsActivity.class);
				startActivity(switchToListView);
			}
		});
	}
}