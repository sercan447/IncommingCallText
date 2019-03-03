package sercandevops.com.incommingcalltext;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String durum = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        String num = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);

        if(durum.equals(TelephonyManager.EXTRA_STATE_RINGING))
        {
            Toast.makeText(context,"tel calıyor "+num,Toast.LENGTH_SHORT).show();

            Intent inte2 = new Intent(context,MyService.class);
            context.getApplicationContext().startService(inte2);
        }

        if(durum.equals(TelephonyManager.EXTRA_STATE_IDLE))
        {
            Toast.makeText(context,"tel KAPANDI",Toast.LENGTH_SHORT).show();
        }

        if(durum.equals(TelephonyManager.EXTRA_STATE_OFFHOOK))
        {
            Toast.makeText(context,"tel BEKLEMEDİ",Toast.LENGTH_SHORT).show();
        }
    }
}
