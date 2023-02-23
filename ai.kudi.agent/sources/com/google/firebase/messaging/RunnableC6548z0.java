package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.z0 */
/* loaded from: classes2.dex */
public class RunnableC6548z0 implements Runnable {

    /* renamed from: x */
    private static final Object f15809x = new Object();

    /* renamed from: y */
    private static Boolean f15810y;

    /* renamed from: z */
    private static Boolean f15811z;

    /* renamed from: c */
    private final Context f15812c;

    /* renamed from: d */
    private final C6498g0 f15813d;

    /* renamed from: e */
    private final PowerManager.WakeLock f15814e;

    /* renamed from: f */
    private final C6546y0 f15815f;

    /* renamed from: w */
    private final long f15816w;

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.z0$a */
    /* loaded from: classes2.dex */
    class C6549a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC6548z0 f15817a;

        public C6549a(RunnableC6548z0 runnableC6548z0) {
            this.f15817a = runnableC6548z0;
        }

        /* renamed from: a */
        public void m21650a() {
            if (RunnableC6548z0.m21651j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC6548z0.this.f15812c.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            RunnableC6548z0 runnableC6548z0 = this.f15817a;
            if (runnableC6548z0 == null) {
                return;
            }
            if (runnableC6548z0.m21652i()) {
                if (RunnableC6548z0.m21651j()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f15817a.f15815f.m21666k(this.f15817a, 0L);
                context.unregisterReceiver(this);
                this.f15817a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6548z0(C6546y0 c6546y0, Context context, C6498g0 c6498g0, long j) {
        this.f15815f = c6546y0;
        this.f15812c = context;
        this.f15816w = j;
        this.f15813d = c6498g0;
        this.f15814e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    private static String m21656e(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    /* renamed from: f */
    private static boolean m21655f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f15809x) {
            if (f15811z == null) {
                booleanValue = m21654g(context, "android.permission.ACCESS_NETWORK_STATE", f15811z);
            } else {
                booleanValue = f15811z.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f15811z = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* renamed from: g */
    private static boolean m21654g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        Log.d("FirebaseMessaging", m21656e(str));
        return false;
    }

    /* renamed from: h */
    private static boolean m21653h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f15809x) {
            if (f15810y == null) {
                booleanValue = m21654g(context, "android.permission.WAKE_LOCK", f15810y);
            } else {
                booleanValue = f15810y.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f15810y = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public synchronized boolean m21652i() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f15812c.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z = activeNetworkInfo.isConnected();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m21651j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (m21653h(this.f15812c)) {
            this.f15814e.acquire(C6479b.f15639a);
        }
        try {
            try {
                this.f15815f.m21665l(true);
                if (!this.f15813d.m21818g()) {
                    this.f15815f.m21665l(false);
                    if (m21653h(this.f15812c)) {
                        try {
                            this.f15814e.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else if (m21655f(this.f15812c) && !m21652i()) {
                    new C6549a(this).m21650a();
                    if (m21653h(this.f15812c)) {
                        try {
                            this.f15814e.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else {
                    if (this.f15815f.m21662o()) {
                        this.f15815f.m21665l(false);
                    } else {
                        this.f15815f.m21661p(this.f15816w);
                    }
                    if (m21653h(this.f15812c)) {
                        try {
                            this.f15814e.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
                this.f15815f.m21665l(false);
                if (m21653h(this.f15812c)) {
                    try {
                        this.f15814e.release();
                    } catch (RuntimeException unused4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (Throwable th) {
            if (m21653h(this.f15812c)) {
                try {
                    this.f15814e.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
