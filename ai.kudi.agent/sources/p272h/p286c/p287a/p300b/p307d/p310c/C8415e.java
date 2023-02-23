package p272h.p286c.p287a.p300b.p307d.p310c;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.d.c.e */
/* loaded from: classes2.dex */
public final class C8415e {

    /* renamed from: a */
    public static final int f20091a;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = 33554432;
        if (i < 31 && (i < 30 || Build.VERSION.CODENAME.length() != 1 || Build.VERSION.CODENAME.charAt(0) < 'S' || Build.VERSION.CODENAME.charAt(0) > 'Z')) {
            i2 = 0;
        }
        f20091a = i2;
    }

    /* renamed from: a */
    public static PendingIntent m16118a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, intent, i2);
    }
}
