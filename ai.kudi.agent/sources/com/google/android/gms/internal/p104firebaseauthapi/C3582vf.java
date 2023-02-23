package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vf */
/* loaded from: classes2.dex */
public final class C3582vf implements InterfaceC3431pk<C3356mn> {

    /* renamed from: a */
    final /* synthetic */ C3056bj f9027a;

    /* renamed from: b */
    final /* synthetic */ C3350mh f9028b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3582vf(C3350mh c3350mh, C3056bj c3056bj) {
        this.f9028b = c3350mh;
        this.f9027a = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3356mn c3356mn) {
        C3356mn c3356mn2 = c3356mn;
        if (c3356mn2.m30649g()) {
            this.f9027a.m31389f(new C3504sf(c3356mn2.m30652c(), c3356mn2.m30650f(), null));
            return;
        }
        this.f9028b.m30670o(new C3140em(c3356mn2.m30651d(), c3356mn2.m30653b(), Long.valueOf(c3356mn2.m30654a()), "Bearer"), null, null, Boolean.FALSE, null, this.f9027a, this);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f9027a.mo29940h(C5227i.m25323a(str));
    }
}
