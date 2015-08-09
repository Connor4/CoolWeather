package com.connor.coolweather.receiver;

import com.connor.coolweather.service.AutoUpdateService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AutoUpdateReceiver extends BroadcastReceiver
{
	@Override
	public void onReceive(Context context, Intent intent)
	{
		Intent i = new Intent(context, AutoUpdateService.class);
		context.startService(i);
		Log.d("TAG", "receiver start service");
	}
}
