package uk.co.jordanrobinson.thincontroller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;

public class ThinControllerReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String tag = context.getString(R.string.log_tag); //TODO: move to oncreate for one off

        Log.d(tag, "onReceive Called... " + intent.getAction());
        KeyEvent event = intent.getParcelableExtra(Intent.EXTRA_KEY_EVENT);
        Log.d(tag, "Event received as: " + event.getKeyCode());
    }
}

