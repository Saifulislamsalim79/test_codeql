package p201g.p262t.p263a;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
/* compiled from: SupportSQLiteCompat.java */
/* renamed from: g.t.a.c */
/* loaded from: classes2.dex */
public final class C8089c {
    /* renamed from: a */
    public static Uri m16773a(Cursor cursor) {
        return cursor.getNotificationUri();
    }

    /* renamed from: b */
    public static boolean m16772b(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
