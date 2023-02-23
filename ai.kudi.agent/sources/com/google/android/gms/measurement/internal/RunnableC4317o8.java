package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3824i1;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.o8 */
/* loaded from: classes2.dex */
public final class RunnableC4317o8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ String f10559c;

    /* renamed from: d */
    final /* synthetic */ String f10560d;

    /* renamed from: e */
    final /* synthetic */ C4307na f10561e;

    /* renamed from: f */
    final /* synthetic */ InterfaceC3824i1 f10562f;

    /* renamed from: w */
    final /* synthetic */ C4410w8 f10563w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4317o8(C4410w8 c4410w8, String str, String str2, C4307na c4307na, InterfaceC3824i1 interfaceC3824i1) {
        this.f10563w = c4410w8;
        this.f10559c = str;
        this.f10560d = str2;
        this.f10561e = c4307na;
        this.f10562f = interfaceC3824i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b5 b5Var;
        InterfaceC4219g3 interfaceC4219g3;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                interfaceC4219g3 = this.f10563w.f10772d;
                if (interfaceC4219g3 == null) {
                    ((v5) this.f10563w).a.b().r().m28012c("Failed to get conditional properties; not connected to service", this.f10559c, this.f10560d);
                    b5Var = ((v5) this.f10563w).a;
                } else {
                    com.google.android.gms.common.internal.s.j(this.f10561e);
                    arrayList = ia.u(interfaceC4219g3.mo27941d0(this.f10559c, this.f10560d, this.f10561e));
                    this.f10563w.m27879E();
                    b5Var = ((v5) this.f10563w).a;
                }
            } catch (RemoteException e) {
                ((v5) this.f10563w).a.b().r().m28011d("Failed to get conditional properties; remote exception", this.f10559c, this.f10560d, e);
                b5Var = ((v5) this.f10563w).a;
            }
            b5Var.N().D(this.f10562f, arrayList);
        } catch (Throwable th) {
            ((v5) this.f10563w).a.N().D(this.f10562f, arrayList);
            throw th;
        }
    }
}
