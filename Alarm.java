package com.example.alarm;

import android.app.Activity;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class Alarm extends Activity {

private AlarmManagerBrodcastReceiver alarm=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alarm);
		alarm=new AlarmManagerBrodcastReceiver();
		
	}
	

	  public void startRepeatingTimer(View view) {
		  
		       Context context = this.getApplicationContext();
		  
		       if(alarm != null){
		  
		        alarm.SetAlarm(context);
		  
		       }else{
		  
		        Toast.makeText(context,"Alarm is null", Toast.LENGTH_SHORT).show();
		  
		       }
		  
		      }
		  
		       
		  
		      public void cancelRepeatingTimer(View view){
		  
		       Context context = this.getApplicationContext();
		  
		       if(alarm != null){
		  
		        alarm.CancelAlarm(context);
		  
		       }else{
		  
		        Toast.makeText(context,"Alarm is null", Toast.LENGTH_SHORT).show();
		  
		       }
		  
		      }
		  
		       
		  
		      public void onetimeTimer(View view){
		  
		       Context context = this.getApplicationContext();
		 
		       if(alarm != null){
		 
		        alarm.setOnetimeTimer(context);
		  
		       }else{
		  
		        Toast.makeText(context, "Alarm is null", Toast.LENGTH_SHORT).show();
		  
		       }
		  
		      }
		  
		       
		  
		  


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alarm, menu);
		return true;
	}

}
