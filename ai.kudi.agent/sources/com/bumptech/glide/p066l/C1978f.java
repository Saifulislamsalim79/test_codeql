package com.bumptech.glide.p066l;

import android.content.Context;
import android.util.Log;
import androidx.core.content.C1335a;
import com.bumptech.glide.p066l.InterfaceC1973c;
/* compiled from: DefaultConnectivityMonitorFactory.java */
/* renamed from: com.bumptech.glide.l.f */
/* loaded from: classes2.dex */
public class C1978f implements InterfaceC1975d {
    @Override // com.bumptech.glide.p066l.InterfaceC1975d
    /* renamed from: a */
    public InterfaceC1973c mo34005a(Context context, InterfaceC1973c.InterfaceC1974a interfaceC1974a) {
        boolean z = C1335a.m36327a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (z) {
            return new C1976e(context, interfaceC1974a);
        }
        return new C1982j();
    }
}
