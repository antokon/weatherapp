package com.example.antonio.weatherapp;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
/**
 * Created by Antonio on 2/13/2018.
 */

public class Rec extends BroadcastReceiver {
    public static final int REQUEST_CODE = 10025;

    public void onReceive(Context context, Intent intent)
    {
        Intent i = new Intent(context, NotificationManagement.class);
        context.startService(i);
    }

}
