package com.example.th5;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView selection;
	 String arr[]={"Intel","SamSung",
	 "Nokia","Simen","AMD",
	 "KIC","ECD"};
	 ArrayAdapter<String >adapter=null;
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_main);

	 adapter=new ArrayAdapter<String>
	 (this,
	 android.R.layout.simple_list_item_1,
	 arr);

	 setListAdapter(adapter);
	 
	 selection=(TextView) findViewById(R.id.selection);
	 }
	 protected void onListItemClick(ListView l, View v, int position, long id) {
	 // TODO Auto-generated method stub
	 super.onListItemClick(l, v, position, id);
	 String txt="postion = "+position +"; value ="+arr[position];
	 selection.setText(txt);
	 }
}
