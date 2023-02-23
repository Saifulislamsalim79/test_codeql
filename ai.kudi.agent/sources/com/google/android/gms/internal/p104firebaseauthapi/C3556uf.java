package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.uf */
/* loaded from: classes2.dex */
public final class C3556uf implements InterfaceC3431pk<C3667ym> {

    /* renamed from: a */
    final /* synthetic */ C3056bj f9000a;

    /* renamed from: b */
    final /* synthetic */ C3350mh f9001b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3556uf(C3350mh c3350mh, C3056bj c3056bj) {
        this.f9001b = c3350mh;
        this.f9000a = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3667ym c3667ym) {
        C3667ym c3667ym2 = c3667ym;
        this.f9001b.m30670o(new C3140em(c3667ym2.m29937c(), c3667ym2.m29938b(), Long.valueOf(c3667ym2.m29939a()), "Bearer"), null, null, Boolean.TRUE, null, this.f9000a, this);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f9000a.mo29940h(C5227i.m25323a(str));
    }
}
