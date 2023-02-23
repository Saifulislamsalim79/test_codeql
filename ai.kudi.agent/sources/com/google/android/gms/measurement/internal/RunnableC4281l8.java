package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.l8 */
/* loaded from: classes2.dex */
public final class RunnableC4281l8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4307na f10454c;

    /* renamed from: d */
    final /* synthetic */ boolean f10455d;

    /* renamed from: e */
    final /* synthetic */ C4379u f10456e;

    /* renamed from: f */
    final /* synthetic */ C4410w8 f10457f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4281l8(C4410w8 c4410w8, boolean z, C4307na c4307na, boolean z2, C4379u c4379u, String str) {
        this.f10457f = c4410w8;
        this.f10454c = c4307na;
        this.f10455d = z2;
        this.f10456e = c4379u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4219g3 interfaceC4219g3;
        interfaceC4219g3 = this.f10457f.f10772d;
        if (interfaceC4219g3 == null) {
            ((v5) this.f10457f).a.b().r().m28014a("Discarding data. Failed to send event to service");
            return;
        }
        com.google.android.gms.common.internal.s.j(this.f10454c);
        this.f10457f.m27856r(interfaceC4219g3, this.f10455d ? null : this.f10456e, this.f10454c);
        this.f10457f.m27879E();
    }
}
