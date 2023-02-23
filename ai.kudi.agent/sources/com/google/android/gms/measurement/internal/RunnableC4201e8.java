package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.e8 */
/* loaded from: classes2.dex */
public final class RunnableC4201e8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4307na f10239c;

    /* renamed from: d */
    final /* synthetic */ Bundle f10240d;

    /* renamed from: e */
    final /* synthetic */ C4410w8 f10241e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4201e8(C4410w8 c4410w8, C4307na c4307na, Bundle bundle) {
        this.f10241e = c4410w8;
        this.f10239c = c4307na;
        this.f10240d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4219g3 interfaceC4219g3;
        interfaceC4219g3 = this.f10241e.f10772d;
        if (interfaceC4219g3 == null) {
            ((v5) this.f10241e).a.b().r().m28014a("Failed to send default event parameters to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.s.j(this.f10239c);
            interfaceC4219g3.mo27933s(this.f10240d, this.f10239c);
        } catch (RemoteException e) {
            ((v5) this.f10241e).a.b().r().m28013b("Failed to send default event parameters to service", e);
        }
    }
}
