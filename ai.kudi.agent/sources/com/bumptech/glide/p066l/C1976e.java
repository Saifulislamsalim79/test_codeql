package com.bumptech.glide.p066l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.p066l.InterfaceC1973c;
import com.bumptech.glide.p086q.C2380j;
/* compiled from: DefaultConnectivityMonitor.java */
/* renamed from: com.bumptech.glide.l.e */
/* loaded from: classes2.dex */
final class C1976e implements InterfaceC1973c {

    /* renamed from: c */
    private final Context f6040c;

    /* renamed from: d */
    final InterfaceC1973c.InterfaceC1974a f6041d;

    /* renamed from: e */
    boolean f6042e;

    /* renamed from: f */
    private boolean f6043f;

    /* renamed from: w */
    private final BroadcastReceiver f6044w = new C1977a();

    /* compiled from: DefaultConnectivityMonitor.java */
    /* renamed from: com.bumptech.glide.l.e$a */
    /* loaded from: classes2.dex */
    class C1977a extends BroadcastReceiver {
        C1977a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C1976e c1976e = C1976e.this;
            boolean z = c1976e.f6042e;
            c1976e.f6042e = c1976e.m34008e(context);
            if (z != C1976e.this.f6042e) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C1976e.this.f6042e);
                }
                C1976e c1976e2 = C1976e.this;
                c1976e2.f6041d.mo34009a(c1976e2.f6042e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1976e(Context context, InterfaceC1973c.InterfaceC1974a interfaceC1974a) {
        this.f6040c = context.getApplicationContext();
        this.f6041d = interfaceC1974a;
    }

    /* renamed from: f */
    private void m34007f() {
        if (this.f6043f) {
            return;
        }
        this.f6042e = m34008e(this.f6040c);
        try {
            this.f6040c.registerReceiver(this.f6044w, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f6043f = true;
        } catch (SecurityException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e);
            }
        }
    }

    /* renamed from: g */
    private void m34006g() {
        if (this.f6043f) {
            this.f6040c.unregisterReceiver(this.f6044w);
            this.f6043f = false;
        }
    }

    /* renamed from: e */
    boolean m34008e(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C2380j.m33129d(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    @Override // com.bumptech.glide.p066l.InterfaceC1981i
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.p066l.InterfaceC1981i
    public void onStart() {
        m34007f();
    }

    @Override // com.bumptech.glide.p066l.InterfaceC1981i
    public void onStop() {
        m34006g();
    }
}
