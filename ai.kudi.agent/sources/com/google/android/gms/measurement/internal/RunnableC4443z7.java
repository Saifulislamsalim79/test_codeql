package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.z7 */
/* loaded from: classes2.dex */
public final class RunnableC4443z7 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4307na f10860c;

    /* renamed from: d */
    final /* synthetic */ C4410w8 f10861d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4443z7(C4410w8 c4410w8, C4307na c4307na) {
        this.f10861d = c4410w8;
        this.f10860c = c4307na;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4219g3 interfaceC4219g3;
        interfaceC4219g3 = this.f10861d.f10772d;
        if (interfaceC4219g3 == null) {
            ((v5) this.f10861d).a.b().r().m28014a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.s.j(this.f10860c);
            interfaceC4219g3.mo27923z(this.f10860c);
        } catch (RemoteException e) {
            ((v5) this.f10861d).a.b().r().m28013b("Failed to reset data on the service: remote exception", e);
        }
        this.f10861d.m27879E();
    }
}
