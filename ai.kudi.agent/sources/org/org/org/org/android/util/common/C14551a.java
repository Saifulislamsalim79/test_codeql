package org.org.org.org.android.util.common;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: org.org.org.org.android.util.common.a */
/* loaded from: classes.dex */
public final class C14551a extends ConnectivityManager.NetworkCallback {

    /* renamed from: o */
    public final /* synthetic */ C14554f f32167o;

    public C14551a(C14554f c14554f) {
        this.f32167o = c14554f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        Log_OC.getArray(network, "network");
        C14554f $r2 = this.f32167o;
        $r2.add();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLosing(Network network, int i) {
        Log_OC.getArray(network, "network");
        C14554f $r2 = this.f32167o;
        $r2.add();
    }
}
