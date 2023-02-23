package com.google.android.play.core.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.internal.f */
/* loaded from: classes2.dex */
public final class C4971f extends AbstractRunnableC4960b {

    /* renamed from: d */
    final /* synthetic */ C4983l f12629d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4971f(C4983l c4983l) {
        this.f12629d = c4983l;
    }

    @Override // com.google.android.play.core.internal.AbstractRunnableC4960b
    /* renamed from: a */
    public final void mo15013a() {
        IInterface iInterface;
        C4957a c4957a;
        Context context;
        ServiceConnection serviceConnection;
        iInterface = this.f12629d.f12645k;
        if (iInterface != null) {
            c4957a = this.f12629d.f12636b;
            c4957a.m25954f("Unbind from service.", new Object[0]);
            context = this.f12629d.f12635a;
            serviceConnection = this.f12629d.f12644j;
            context.unbindService(serviceConnection);
            this.f12629d.f12639e = false;
            this.f12629d.f12645k = null;
            this.f12629d.f12644j = null;
        }
    }
}
