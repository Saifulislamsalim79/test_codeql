package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.c8 */
/* loaded from: classes2.dex */
public final class RunnableC4178c8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4307na f10175c;

    /* renamed from: d */
    final /* synthetic */ C4410w8 f10176d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4178c8(C4410w8 c4410w8, C4307na c4307na) {
        this.f10176d = c4410w8;
        this.f10175c = c4307na;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4219g3 interfaceC4219g3;
        interfaceC4219g3 = this.f10176d.f10772d;
        if (interfaceC4219g3 == null) {
            ((v5) this.f10176d).a.b().r().m28014a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            com.google.android.gms.common.internal.s.j(this.f10175c);
            interfaceC4219g3.mo27943a0(this.f10175c);
            ((v5) this.f10176d).a.C().m28112t();
            this.f10176d.m27856r(interfaceC4219g3, null, this.f10175c);
            this.f10176d.m27879E();
        } catch (RemoteException e) {
            ((v5) this.f10176d).a.b().r().m28013b("Failed to send app launch to the service", e);
        }
    }
}
