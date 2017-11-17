package net.harithproperties.remindernew;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;

import java.util.Date;

public class Utils {




	static Context mContext;



	public static NotificationManager mManager;

	@SuppressWarnings("static-access")
	public static void generateNotification(Context context){




		mManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);

		Intent intent = new Intent(context,MainActivity.class);

		intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP| Intent.FLAG_ACTIVITY_CLEAR_TOP);

		PendingIntent pendingIntent = PendingIntent.getActivity(context,1, intent, PendingIntent.FLAG_UPDATE_CURRENT);



		Notification.Builder builder = new Notification.Builder(context);


		Notification notification1 = builder.setContentTitle("Medicine reminder")
				.setContentText("Eat your medicine now")
				.setTicker("Medicine reminder!")
				.setSmallIcon(R.mipmap.ic_launcher)
				.setDefaults(Notification.DEFAULT_SOUND)
				.setContentIntent(pendingIntent).build();

		NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
		notification1.flags |= Notification.FLAG_AUTO_CANCEL;

		notificationManager.notify(1, notification1);





		//



	}


}
