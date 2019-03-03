package sercandevops.com.incommingcalltext;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MyService extends Service {


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        Toast.makeText(getApplicationContext(),"SERVIS CALISIYOR ",Toast.LENGTH_SHORT).show();

        Intent inte2 = new Intent(MyService.this,MainActivity.class);
        inte2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(inte2);

        return super.onStartCommand(intent, flags, startId);

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
