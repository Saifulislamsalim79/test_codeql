package p201g.p252n.p253a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
/* compiled from: WakefulBroadcastReceiver.java */
@Deprecated
/* renamed from: g.n.a.a */
/* loaded from: classes2.dex */
public abstract class AbstractC7808a extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<PowerManager.WakeLock> f18654a = new SparseArray<>();

    /* renamed from: b */
    private static int f18655b = 1;

    /* renamed from: b */
    public static boolean m17256b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f18654a) {
            PowerManager.WakeLock wakeLock = f18654a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f18654a.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    /* renamed from: c */
    public static ComponentName m17255c(Context context, Intent intent) {
        synchronized (f18654a) {
            int i = f18655b;
            int i2 = f18655b + 1;
            f18655b = i2;
            if (i2 <= 0) {
                f18655b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000L);
            f18654a.put(i, newWakeLock);
            return startService;
        }
    }
}
