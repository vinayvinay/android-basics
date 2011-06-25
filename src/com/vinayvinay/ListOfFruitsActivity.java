package com.vinayvinay;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Dialog;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class ListOfFruitsActivity extends ListActivity {

	private HashMap<Integer, String> fruits;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		fruits = new HashMap<Integer, String>();
		fruits.put(R.drawable.apple, "Apple");
		fruits.put(R.drawable.orange, "Orange");
		fruits.put(R.drawable.strawberry, "Strawberry");

		setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item,
				new ArrayList<String>(fruits.values())));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		showImageDialog(position);
	}

	private void showImageDialog(int position) {
		Dialog imageDialog = new Dialog(this);
		imageDialog.setContentView(R.layout.image_dialog);
		
		ImageView image = (ImageView) imageDialog.findViewById(R.id.image);
		image.setImageResource((Integer) fruits.keySet().toArray()[position]);
		imageDialog.setTitle((CharSequence) fruits.values().toArray()[position]);

		imageDialog.show();
	}
}