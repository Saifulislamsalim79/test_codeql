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
import com.google.android.gms.common.util.p103q.ThreadFactoryC2978a;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.u0 */
/* loaded from: classes2.dex */
public class RunnableC6537u0 implements Runnable {

    /* renamed from: c */
    private final long f15778c;

    /* renamed from: d */
    private final PowerManager.WakeLock f15779d;

    /* renamed from: e */
    private final FirebaseMessaging f15780e;

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.u0$a */
    /* loaded from: classes2.dex */
    static class C6538a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC6537u0 f15781a;

        public C6538a(RunnableC6537u0 runnableC6537u0) {
            this.f15781a = runnableC6537u0;
        }

        /* renamed from: a */
        public void m21687a() {
            if (RunnableC6537u0.m21690c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f15781a.m21691b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC6537u0 runnableC6537u0 = this.f15781a;
            if (runnableC6537u0 != null && runnableC6537u0.m21689d()) {
                if (RunnableC6537u0.m21690c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f15781a.f15780e.m21929d(this.f15781a, 0L);
                this.f15781a.m21691b().unregisterReceiver(this);
                this.f15781a = null;
            }
        }
    }

    public RunnableC6537u0(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2978a("firebase-iid-executor"));
        this.f15780e = firebaseMessaging;
        this.f15778c = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m21691b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f15779d = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    static boolean m21690c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: b */
    Context m21691b() {
        return this.f15780e.m21928e();
    }

    /* renamed from: d */
    boolean m21689d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m21691b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: e */
    boolean m21688e() throws IOException {
        try {
            if (this.f15780e.m21930c() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e) {
            if (C6481b0.m21874f(e.getMessage())) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                Log.w("FirebaseMessaging", sb.toString());
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C6528q0.m21716b().m21713e(m21691b())) {
            this.f15779d.acquire();
        }
        try {
            try {
                this.f15780e.m21912u(true);
                if (!this.f15780e.m21919n()) {
                    this.f15780e.m21912u(false);
                    if (!C6528q0.m21716b().m21713e(m21691b())) {
                        return;
                    }
                } else if (C6528q0.m21716b().m21714d(m21691b()) && !m21689d()) {
                    new C6538a(this).m21687a();
                    if (!C6528q0.m21716b().m21713e(m21691b())) {
                        return;
                    }
                } else {
                    if (m21688e()) {
                        this.f15780e.m21912u(false);
                    } else {
                        this.f15780e.m21909x(this.f15778c);
                    }
                    if (!C6528q0.m21716b().m21713e(m21691b())) {
                        return;
                    }
                }
            } catch (IOException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseMessaging", sb.toString());
                this.f15780e.m21912u(false);
                if (!C6528q0.m21716b().m21713e(m21691b())) {
                    return;
                }
            }
            this.f15779d.release();
        } catch (Throwable th) {
            if (C6528q0.m21716b().m21713e(m21691b())) {
                this.f15779d.release();
            }
            throw th;
        }
    }
}
