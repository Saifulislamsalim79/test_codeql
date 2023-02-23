package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3824i1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.b8 */
/* loaded from: classes2.dex */
public final class RunnableC4166b8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4307na f10042c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC3824i1 f10043d;

    /* renamed from: e */
    final /* synthetic */ C4410w8 f10044e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4166b8(C4410w8 c4410w8, C4307na c4307na, InterfaceC3824i1 interfaceC3824i1) {
        this.f10044e = c4410w8;
        this.f10042c = c4307na;
        this.f10043d = interfaceC3824i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b5 b5Var;
        InterfaceC4219g3 interfaceC4219g3;
        String str = null;
        try {
            try {
                if (((v5) this.f10044e).a.F().q().m28182k()) {
                    interfaceC4219g3 = this.f10044e.f10772d;
                    if (interfaceC4219g3 == null) {
                        ((v5) this.f10044e).a.b().r().m28014a("Failed to get app instance id");
                        b5Var = ((v5) this.f10044e).a;
                    } else {
                        com.google.android.gms.common.internal.s.j(this.f10042c);
                        str = interfaceC4219g3.mo27948G(this.f10042c);
                        if (str != null) {
                            ((v5) this.f10044e).a.I().m28163C(str);
                            ((v5) this.f10044e).a.F().g.m28271b(str);
                        }
                        this.f10044e.m27879E();
                        b5Var = ((v5) this.f10044e).a;
                    }
                } else {
                    ((v5) this.f10044e).a.b().x().m28014a("Analytics storage consent denied; will not get app instance id");
                    ((v5) this.f10044e).a.I().m28163C(null);
                    ((v5) this.f10044e).a.F().g.m28271b(null);
                    b5Var = ((v5) this.f10044e).a;
                }
            } catch (RemoteException e) {
                ((v5) this.f10044e).a.b().r().m28013b("Failed to get app instance id", e);
                b5Var = ((v5) this.f10044e).a;
            }
            b5Var.N().I(this.f10043d, str);
        } catch (Throwable th) {
            ((v5) this.f10044e).a.N().I(this.f10043d, (String) null);
            throw th;
        }
    }
}
