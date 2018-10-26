package roxma.org.sms_forward;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;

/**
 * 系统自启动
 * Created by ccc on 2018/7/19.
 */

public class AutoStartReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
