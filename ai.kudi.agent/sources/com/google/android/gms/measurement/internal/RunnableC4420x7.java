package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3824i1;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.x7 */
/* loaded from: classes2.dex */
public final class RunnableC4420x7 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ String f10794c;

    /* renamed from: d */
    final /* synthetic */ String f10795d;

    /* renamed from: e */
    final /* synthetic */ C4307na f10796e;

    /* renamed from: f */
    final /* synthetic */ boolean f10797f;

    /* renamed from: w */
    final /* synthetic */ InterfaceC3824i1 f10798w;

    /* renamed from: x */
    final /* synthetic */ C4410w8 f10799x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4420x7(C4410w8 c4410w8, String str, String str2, C4307na c4307na, boolean z, InterfaceC3824i1 interfaceC3824i1) {
        this.f10799x = c4410w8;
        this.f10794c = str;
        this.f10795d = str2;
        this.f10796e = c4307na;
        this.f10797f = z;
        this.f10798w = interfaceC3824i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e;
        InterfaceC4219g3 interfaceC4219g3;
        Bundle bundle2 = new Bundle();
        try {
            interfaceC4219g3 = this.f10799x.f10772d;
            if (interfaceC4219g3 == null) {
                ((v5) this.f10799x).a.b().r().m28012c("Failed to get user properties; not connected to service", this.f10794c, this.f10795d);
                ((v5) this.f10799x).a.N().E(this.f10798w, bundle2);
                return;
            }
            com.google.android.gms.common.internal.s.j(this.f10796e);
            List<C4203ea> mo27949C0 = interfaceC4219g3.mo27949C0(this.f10794c, this.f10795d, this.f10797f, this.f10796e);
            bundle = new Bundle();
            if (mo27949C0 != null) {
                for (C4203ea c4203ea : mo27949C0) {
                    String str = c4203ea.f10248w;
                    if (str != null) {
                        bundle.putString(c4203ea.f10245d, str);
                    } else {
                        Long l = c4203ea.f10247f;
                        if (l != null) {
                            bundle.putLong(c4203ea.f10245d, l.longValue());
                        } else {
                            Double d = c4203ea.f10250y;
                            if (d != null) {
                                bundle.putDouble(c4203ea.f10245d, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.f10799x.m27879E();
                    ((v5) this.f10799x).a.N().E(this.f10798w, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    ((v5) this.f10799x).a.b().r().m28012c("Failed to get user properties; remote exception", this.f10794c, e);
                    ((v5) this.f10799x).a.N().E(this.f10798w, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                ((v5) this.f10799x).a.N().E(this.f10798w, bundle2);
                throw th;
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            ((v5) this.f10799x).a.N().E(this.f10798w, bundle2);
            throw th;
        }
    }
}
