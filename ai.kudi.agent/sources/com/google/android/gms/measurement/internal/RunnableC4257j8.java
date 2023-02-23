package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.j8 */
/* loaded from: classes2.dex */
public final class RunnableC4257j8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4307na f10402c;

    /* renamed from: d */
    final /* synthetic */ C4410w8 f10403d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4257j8(C4410w8 c4410w8, C4307na c4307na) {
        this.f10403d = c4410w8;
        this.f10402c = c4307na;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4219g3 interfaceC4219g3;
        interfaceC4219g3 = this.f10403d.f10772d;
        if (interfaceC4219g3 == null) {
            ((v5) this.f10403d).a.b().r().m28014a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.s.j(this.f10402c);
            interfaceC4219g3.mo27939i0(this.f10402c);
            this.f10403d.m27879E();
        } catch (RemoteException e) {
            ((v5) this.f10403d).a.b().r().m28013b("Failed to send measurementEnabled to the service", e);
        }
    }
}
