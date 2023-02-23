package com.google.firebase.auth.internal;

import com.google.android.gms.common.p099l.C2946a;
import com.google.android.gms.tasks.InterfaceC4456f;
import com.google.firebase.FirebaseNetworkException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.j */
/* loaded from: classes2.dex */
final class C5229j implements InterfaceC4456f {

    /* renamed from: a */
    final /* synthetic */ RunnableC5231k f13009a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5229j(RunnableC5231k runnableC5231k) {
        this.f13009a = runnableC5231k;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4456f
    /* renamed from: b */
    public final void mo15657b(Exception exc) {
        C2946a c2946a;
        if (exc instanceof FirebaseNetworkException) {
            c2946a = C5233l.f13015h;
            c2946a.m31579g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f13009a.f13014d.m25318d();
        }
    }
}
