package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.a8 */
/* loaded from: classes2.dex */
public final class RunnableC4155a8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ AtomicReference f10006c;

    /* renamed from: d */
    final /* synthetic */ C4307na f10007d;

    /* renamed from: e */
    final /* synthetic */ C4410w8 f10008e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4155a8(C4410w8 c4410w8, AtomicReference atomicReference, C4307na c4307na) {
        this.f10008e = c4410w8;
        this.f10006c = atomicReference;
        this.f10007d = c4307na;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC4219g3 interfaceC4219g3;
        synchronized (this.f10006c) {
            try {
            } catch (RemoteException e) {
                ((v5) this.f10008e).a.b().r().m28013b("Failed to get app instance id", e);
                atomicReference = this.f10006c;
            }
            if (!((v5) this.f10008e).a.F().q().m28182k()) {
                ((v5) this.f10008e).a.b().x().m28014a("Analytics storage consent denied; will not get app instance id");
                ((v5) this.f10008e).a.I().m28163C(null);
                ((v5) this.f10008e).a.F().g.m28271b(null);
                this.f10006c.set(null);
                this.f10006c.notify();
                return;
            }
            interfaceC4219g3 = this.f10008e.f10772d;
            if (interfaceC4219g3 == null) {
                ((v5) this.f10008e).a.b().r().m28014a("Failed to get app instance id");
                this.f10006c.notify();
                return;
            }
            com.google.android.gms.common.internal.s.j(this.f10007d);
            this.f10006c.set(interfaceC4219g3.mo27948G(this.f10007d));
            String str = (String) this.f10006c.get();
            if (str != null) {
                ((v5) this.f10008e).a.I().m28163C(str);
                ((v5) this.f10008e).a.F().g.m28271b(str);
            }
            this.f10008e.m27879E();
            atomicReference = this.f10006c;
            atomicReference.notify();
        }
    }
}
