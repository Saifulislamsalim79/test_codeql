package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3824i1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.g8 */
/* loaded from: classes2.dex */
public final class RunnableC4223g8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4379u f10310c;

    /* renamed from: d */
    final /* synthetic */ String f10311d;

    /* renamed from: e */
    final /* synthetic */ InterfaceC3824i1 f10312e;

    /* renamed from: f */
    final /* synthetic */ C4410w8 f10313f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4223g8(C4410w8 c4410w8, C4379u c4379u, String str, InterfaceC3824i1 interfaceC3824i1) {
        this.f10313f = c4410w8;
        this.f10310c = c4379u;
        this.f10311d = str;
        this.f10312e = interfaceC3824i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b5 b5Var;
        InterfaceC4219g3 interfaceC4219g3;
        byte[] bArr = null;
        try {
            try {
                interfaceC4219g3 = this.f10313f.f10772d;
                if (interfaceC4219g3 == null) {
                    ((v5) this.f10313f).a.b().r().m28014a("Discarding data. Failed to send event to service to bundle");
                    b5Var = ((v5) this.f10313f).a;
                } else {
                    bArr = interfaceC4219g3.mo27945Q(this.f10310c, this.f10311d);
                    this.f10313f.m27879E();
                    b5Var = ((v5) this.f10313f).a;
                }
            } catch (RemoteException e) {
                ((v5) this.f10313f).a.b().r().m28013b("Failed to send event to the service to bundle", e);
                b5Var = ((v5) this.f10313f).a;
            }
            b5Var.N().F(this.f10312e, bArr);
        } catch (Throwable th) {
            ((v5) this.f10313f).a.N().F(this.f10312e, bArr);
            throw th;
        }
    }
}
