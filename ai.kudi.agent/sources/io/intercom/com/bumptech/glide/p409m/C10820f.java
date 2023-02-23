package io.intercom.com.bumptech.glide.p409m;

import android.content.Context;
import android.util.Log;
import androidx.core.content.C1335a;
import io.intercom.com.bumptech.glide.p409m.InterfaceC10815c;
/* compiled from: DefaultConnectivityMonitorFactory.java */
/* renamed from: io.intercom.com.bumptech.glide.m.f */
/* loaded from: classes3.dex */
public class C10820f implements InterfaceC10817d {
    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10817d
    /* renamed from: a */
    public InterfaceC10815c mo12258a(Context context, InterfaceC10815c.InterfaceC10816a interfaceC10816a) {
        boolean z = C1335a.m36327a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new C10818e(context, interfaceC10816a) : new C10824j();
    }
}
