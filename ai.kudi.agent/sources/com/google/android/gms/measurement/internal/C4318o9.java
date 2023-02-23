package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.o9 */
/* loaded from: classes2.dex */
public final class C4318o9 extends AbstractC4296n {

    /* renamed from: e */
    final /* synthetic */ C4330p9 f10564e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4318o9(C4330p9 c4330p9, x5 x5Var) {
        super(x5Var);
        this.f10564e = c4330p9;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4296n
    /* renamed from: c */
    public final void mo28007c() {
        this.f10564e.m28004m();
        ((v5) this.f10564e).a.b().v().m28014a("Starting upload from DelayedRunnable");
        this.f10564e.f10625b.m28399A();
    }
}
