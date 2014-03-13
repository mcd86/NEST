package com.example.toastlistviewexample4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainMenuActivity extends Activity {
	
	// Widgets - GUI
	ListView lvMainMenu;
	TextView tvClassSched;
	TextView tvSepta;
	TextView tvPlanner;
	TextView tvMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		
		// Initialize widgets
		tvClassSched = (TextView) this.findViewById(R.id.classScheduleTV);
		tvSepta = (TextView) this.findViewById(R.id.septaTV);
		tvPlanner = (TextView) this.findViewById(R.id.plannerTV);
		tvMap = (TextView) this.findViewById(R.id.campusMapTV);
		
		// Add listeners to text views
		tvClassSched.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				/*Intent intent = new Intent(this, ScheduleActivity.class);
				startActivity(intent);*/
			}
		});
		tvSepta.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				/*Intent intent = new Intent(this, SeptaActivity.class);
				startActivity(intent);*/
			}
		});
		tvPlanner.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				/*Intent intent = new Intent(this, PlannerActivity.class);
				startActivity(intent);*/
			}
		});
		tvMap.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				/*Intent intent = new Intent(this, CampusMapActivity.class);
				startActivity(intent);*/
			}
		});
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

}
