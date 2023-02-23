package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.y7 */
/* loaded from: classes2.dex */
public final class RunnableC4432y7 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4307na f10835c;

    /* renamed from: d */
    final /* synthetic */ boolean f10836d;

    /* renamed from: e */
    final /* synthetic */ C4203ea f10837e;

    /* renamed from: f */
    final /* synthetic */ C4410w8 f10838f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4432y7(C4410w8 c4410w8, C4307na c4307na, boolean z, C4203ea c4203ea) {
        this.f10838f = c4410w8;
        this.f10835c = c4307na;
        this.f10836d = z;
        this.f10837e = c4203ea;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4219g3 interfaceC4219g3;
        interfaceC4219g3 = this.f10838f.f10772d;
        if (interfaceC4219g3 == null) {
            ((v5) this.f10838f).a.b().r().m28014a("Discarding data. Failed to set user property");
            return;
        }
        com.google.android.gms.common.internal.s.j(this.f10835c);
        this.f10838f.m27856r(interfaceC4219g3, this.f10836d ? null : this.f10837e, this.f10835c);
        this.f10838f.m27879E();
    }
}
