package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.common.util.C2974l;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.C4469m;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.k0 */
/* loaded from: classes2.dex */
public final class C6515k0 {
    /* renamed from: a */
    private static boolean m21744a(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m21743b(Context context) {
        if (C6517l0.m21738b(context)) {
            return;
        }
        m21741d(ExecutorC6513j0.f15736c, context, m21740e(context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m21742c(Context context, boolean z, C4465k c4465k) {
        try {
            if (!m21744a(context)) {
                String valueOf = String.valueOf(context.getPackageName());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "error configuring notification delegate for package ".concat(valueOf) : new String("error configuring notification delegate for package "));
                return;
            }
            C6517l0.m21737c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            c4465k.m27773e(null);
        }
    }

    /* renamed from: d */
    static com.google.android.gms.tasks.j<Void> m21741d(Executor executor, final Context context, final boolean z) {
        if (!C2974l.m31513j()) {
            return C4469m.m27765f(null);
        }
        final C4465k c4465k = new C4465k();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.i0
            @Override // java.lang.Runnable
            public final void run() {
                C6515k0.m21742c(context, z, c4465k);
            }
        });
        return c4465k.m27777a();
    }

    /* renamed from: e */
    private static boolean m21740e(Context context) {
        ApplicationInfo applicationInfo;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
