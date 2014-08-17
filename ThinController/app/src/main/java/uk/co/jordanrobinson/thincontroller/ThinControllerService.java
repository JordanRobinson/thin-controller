package uk.co.jordanrobinson.thincontroller;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;

public class ThinControllerService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.d("ThinControl", "onRecieve Called...");
        }
    };

    @Override
    public void onCreate() {
        super.onCreate();
        final IntentFilter intentFilter = new IntentFilter();

        intentFilter.addAction(Intent.ACTION_MEDIA_BUTTON);

        registerReceiver(broadcastReceiver, intentFilter);
    }
}
