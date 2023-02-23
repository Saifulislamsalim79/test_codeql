package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.f8 */
/* loaded from: classes2.dex */
final class C4212f8 extends AbstractC4296n {

    /* renamed from: e */
    final /* synthetic */ C4410w8 f10268e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4212f8(C4410w8 c4410w8, x5 x5Var) {
        super(x5Var);
        this.f10268e = c4410w8;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4296n
    /* renamed from: c */
    public final void mo28007c() {
        C4410w8 c4410w8 = this.f10268e;
        c4410w8.h();
        if (c4410w8.m27848z()) {
            ((v5) c4410w8).a.b().v().m28014a("Inactivity, disconnecting from the service");
            c4410w8.m27867Q();
        }
    }
}
