package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.internal.k */
/* loaded from: classes2.dex */
public final class ServiceConnectionC4981k implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C4983l f12633a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ServiceConnectionC4981k(C4983l c4983l) {
        this.f12633a = c4983l;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C4957a c4957a;
        c4957a = this.f12633a.f12636b;
        c4957a.m25954f("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f12633a.m25932h(new C4977i(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C4957a c4957a;
        c4957a = this.f12633a.f12636b;
        c4957a.m25954f("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f12633a.m25932h(new C4979j(this));
    }
}
