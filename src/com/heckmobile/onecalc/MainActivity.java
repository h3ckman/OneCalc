package com.heckmobile.onecalc;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends Activity {

	GridView buttonGrid;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buttonGrid = (GridView) findViewById(R.id.grid_buttons);
		String [] buttons = getResources().getStringArray(R.array.grid_items);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.grid_item, buttons);
		buttonGrid.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
