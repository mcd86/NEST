package com.android.nest;

import java.util.ArrayList;
import java.util.HashMap;

import com.cloudmine.api.CMApiCredentials;
import com.cloudmine.api.CMObject;
import com.cloudmine.api.rest.CMStore;
import com.cloudmine.api.rest.callbacks.CMObjectResponseCallback;
import com.cloudmine.api.rest.response.CMObjectResponse;

import android.app.Activity;
import android.os.Bundle;

public class ScheduleActivity extends Activity 
{
	// Find this in your developer console
	private static final String APP_ID = "bb4c36f4e19d4fe28f855d293e6e11bb";
	// Find this in your developer console
	private static final String API_KEY = "600977a2294c4f5ebde8dbf56f017dc6";
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_schedule);
		
		 CMApiCredentials.initialize(APP_ID, API_KEY, getApplicationContext());
		  CMStore store = CMStore.getStore();
		  
		  store.loadAllApplicationObjects(new CMObjectResponseCallback() 
		  {
			    public void onCompletion(CMObjectResponse response) 
			    {
			        for(CMObject object : response.getObjects()) 
			        {
			           MyObject tempObject = (MyObject) object;
			           HashMap<String,ArrayList<Event>> eventMap = tempObject.getSchedule();
			           
			        }
			    }
			});
		
	}
}
