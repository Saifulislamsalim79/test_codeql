package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hg */
/* loaded from: classes2.dex */
public final class C3215hg implements InterfaceC3431pk<C3408on> {

    /* renamed from: a */
    final /* synthetic */ C3056bj f8537a;

    /* renamed from: b */
    final /* synthetic */ C3350mh f8538b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3215hg(C3350mh c3350mh, C3056bj c3056bj) {
        this.f8538b = c3350mh;
        this.f8537a = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3408on c3408on) {
        C3408on c3408on2 = c3408on;
        this.f8538b.m30670o(new C3140em(c3408on2.m30488d(), c3408on2.m30490b(), Long.valueOf(c3408on2.m30491a()), "Bearer"), null, null, Boolean.valueOf(c3408on2.m30486g()), null, this.f8537a, this);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f8537a.mo29940h(C5227i.m25323a(str));
    }
}
