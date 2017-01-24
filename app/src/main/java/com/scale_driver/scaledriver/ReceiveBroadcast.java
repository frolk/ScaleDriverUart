package com.scale_driver.scaledriver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.scale_driver.scaledriver.UartService;

import java.text.DateFormat;
import java.util.Date;

public class ReceiveBroadcast extends BroadcastReceiver {
    public ReceiveBroadcast() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

      Toast.makeText(context, "Power disconnected", Toast.LENGTH_LONG).show();

    }
}
