package io.intercom.com.bumptech.glide.p409m;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import io.intercom.com.bumptech.glide.p409m.InterfaceC10815c;
import io.intercom.com.bumptech.glide.p416r.C10892h;
/* compiled from: DefaultConnectivityMonitor.java */
/* renamed from: io.intercom.com.bumptech.glide.m.e */
/* loaded from: classes3.dex */
final class C10818e implements InterfaceC10815c {

    /* renamed from: c */
    private final Context f24691c;

    /* renamed from: d */
    final InterfaceC10815c.InterfaceC10816a f24692d;

    /* renamed from: e */
    boolean f24693e;

    /* renamed from: f */
    private boolean f24694f;

    /* renamed from: w */
    private final BroadcastReceiver f24695w = new C10819a();

    /* compiled from: DefaultConnectivityMonitor.java */
    /* renamed from: io.intercom.com.bumptech.glide.m.e$a */
    /* loaded from: classes3.dex */
    class C10819a extends BroadcastReceiver {
        C10819a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C10818e c10818e = C10818e.this;
            boolean z = c10818e.f24693e;
            try {
                c10818e.f24693e = c10818e.m12261a(context);
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
                }
                C10818e.this.f24693e = true;
            }
            if (z != C10818e.this.f24693e) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C10818e.this.f24693e);
                }
                C10818e c10818e2 = C10818e.this;
                c10818e2.f24692d.mo12262a(c10818e2.f24693e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10818e(Context context, InterfaceC10815c.InterfaceC10816a interfaceC10816a) {
        this.f24691c = context.getApplicationContext();
        this.f24692d = interfaceC10816a;
    }

    /* renamed from: b */
    private void m12260b() {
        if (this.f24694f) {
            return;
        }
        try {
            this.f24693e = m12261a(this.f24691c);
            this.f24691c.registerReceiver(this.f24695w, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f24694f = true;
        } catch (SecurityException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e);
            }
        }
    }

    /* renamed from: c */
    private void m12259c() {
        if (this.f24694f) {
            this.f24691c.unregisterReceiver(this.f24695w);
            this.f24694f = false;
        }
    }

    /* renamed from: a */
    boolean m12261a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C10892h.m12014d(connectivityManager);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onDestroy() {
    }

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onStart() {
        m12260b();
    }

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onStop() {
        m12259c();
    }
}
