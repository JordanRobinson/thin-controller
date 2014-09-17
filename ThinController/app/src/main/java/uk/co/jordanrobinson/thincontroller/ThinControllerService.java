package uk.co.jordanrobinson.thincontroller;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.IBinder;
import android.util.Log;

public class ThinControllerService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("TC", "onCreate Called...");

        ((AudioManager)getSystemService(AUDIO_SERVICE)).
                registerMediaButtonEventReceiver(
                        new ComponentName(getPackageName(),
                                ThinControllerReceiver.class.getName()));
    }
}
