package net.harithproperties.remindernew;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

import java.util.Calendar;


public class MainActivity extends Activity
{

	private PendingIntent pendingIntent,pendingIntent2,pendingIntent3;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		Calendar calendar3 = Calendar.getInstance();






		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 10);
		calendar.set(Calendar.SECOND, 0);

		calendar2.set(Calendar.HOUR_OF_DAY, 0);
		calendar2.set(Calendar.MINUTE, 11);
		calendar2.set(Calendar.SECOND, 0);

		calendar3.set(Calendar.HOUR_OF_DAY, 0);
		calendar3.set(Calendar.MINUTE, 12);
		calendar3.set(Calendar.SECOND, 0);

		Intent myIntent = new Intent(MainActivity.this, MyReceiver.class);
		pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 1, myIntent,0);
		pendingIntent2 = PendingIntent.getBroadcast(MainActivity.this, 2, myIntent,0);
		pendingIntent3 = PendingIntent.getBroadcast(MainActivity.this, 3, myIntent,0);


		AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);

		alarmManager.set(AlarmManager.RTC, calendar.getTimeInMillis(), pendingIntent);
		alarmManager.set(AlarmManager.RTC, calendar2.getTimeInMillis(), pendingIntent2);
		alarmManager.set(AlarmManager.RTC, calendar3.getTimeInMillis(), pendingIntent3);



	} //end onCreate





}