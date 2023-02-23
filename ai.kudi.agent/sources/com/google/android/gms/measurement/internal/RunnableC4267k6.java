package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.k6 */
/* loaded from: classes2.dex */
final class RunnableC4267k6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ boolean f10424c;

    /* renamed from: d */
    final /* synthetic */ C4245i7 f10425d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4267k6(C4245i7 c4245i7, boolean z) {
        this.f10425d = c4245i7;
        this.f10424c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o = ((v5) this.f10425d).a.o();
        boolean n = ((v5) this.f10425d).a.n();
        ((v5) this.f10425d).a.k(this.f10424c);
        if (n == this.f10424c) {
            ((v5) this.f10425d).a.b().v().m28013b("Default data collection state already set to", Boolean.valueOf(this.f10424c));
        }
        if (((v5) this.f10425d).a.o() == o || ((v5) this.f10425d).a.o() != ((v5) this.f10425d).a.n()) {
            ((v5) this.f10425d).a.b().x().m28012c("Default data collection is different than actual status", Boolean.valueOf(this.f10424c), Boolean.valueOf(o));
        }
        this.f10425d.m28148R();
    }
}
