package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.k8 */
/* loaded from: classes2.dex */
public final class RunnableC4269k8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4307na f10431c;

    /* renamed from: d */
    final /* synthetic */ C4410w8 f10432d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4269k8(C4410w8 c4410w8, C4307na c4307na) {
        this.f10432d = c4410w8;
        this.f10431c = c4307na;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4219g3 interfaceC4219g3;
        interfaceC4219g3 = this.f10432d.f10772d;
        if (interfaceC4219g3 == null) {
            ((v5) this.f10432d).a.b().r().m28014a("Failed to send consent settings to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.s.j(this.f10431c);
            interfaceC4219g3.mo27926w0(this.f10431c);
            this.f10432d.m27879E();
        } catch (RemoteException e) {
            ((v5) this.f10432d).a.b().r().m28013b("Failed to send consent settings to the service", e);
        }
    }
}
