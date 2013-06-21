package com.pcsalt.listviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView lvName;
	String[] name = { "Android", "iOS", "BlackBerry", "Windows Phone",
			"Symbian", "Bada" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lvName = (ListView) findViewById(R.id.lv_Name);

		lvName.setAdapter(new ArrayAdapter<String>(MainActivity.this,
				android.R.layout.simple_list_item_1, name));
		lvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(getBaseContext(), name[position], Toast.LENGTH_SHORT).show();
			}
		});
	}
}
