package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.m8 */
/* loaded from: classes2.dex */
public final class RunnableC4293m8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4307na f10471c;

    /* renamed from: d */
    final /* synthetic */ boolean f10472d;

    /* renamed from: e */
    final /* synthetic */ C4169c f10473e;

    /* renamed from: f */
    final /* synthetic */ C4410w8 f10474f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4293m8(C4410w8 c4410w8, boolean z, C4307na c4307na, boolean z2, C4169c c4169c, C4169c c4169c2) {
        this.f10474f = c4410w8;
        this.f10471c = c4307na;
        this.f10472d = z2;
        this.f10473e = c4169c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4219g3 interfaceC4219g3;
        interfaceC4219g3 = this.f10474f.f10772d;
        if (interfaceC4219g3 == null) {
            ((v5) this.f10474f).a.b().r().m28014a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        com.google.android.gms.common.internal.s.j(this.f10471c);
        this.f10474f.m27856r(interfaceC4219g3, this.f10472d ? null : this.f10473e, this.f10471c);
        this.f10474f.m27879E();
    }
}
