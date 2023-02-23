package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.l0 */
/* loaded from: classes2.dex */
public final class C6517l0 {
    /* renamed from: a */
    private static SharedPreferences m21739a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m21738b(Context context) {
        return m21739a(context).getBoolean("proxy_notification_initialized", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m21737c(Context context, boolean z) {
        SharedPreferences.Editor edit = m21739a(context).edit();
        edit.putBoolean("proxy_notification_initialized", true);
        edit.apply();
    }
}
