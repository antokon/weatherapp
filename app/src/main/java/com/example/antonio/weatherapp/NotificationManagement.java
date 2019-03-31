package com.example.antonio.weatherapp;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.annotation.RequiresApi;

/**
 * Created by Antonio on 2/13/2018.
 */

public class NotificationManagement extends IntentService {

    final int NOTIFICATION_ID = 16000;
//    SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);

    public NotificationManagement() {

        super("NotificationService");
    }
//
    @Override
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    protected void onHandleIntent(Intent intent) {

        buildNotification();
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void buildNotification() {

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        // Since this can happen in the future, wrap it in a pending intent
//        String weatherInfo = preferences.getString("temperature","");


        // build notification

        Notification not = new Notification.Builder(this)
                .setContentTitle("Weather Notification")
                .setContentText("Notifications")
                .setSmallIcon(R.drawable.sun)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(NOTIFICATION_ID, not);
    }
}