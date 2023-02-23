package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ug */
/* loaded from: classes2.dex */
public final class C3557ug implements InterfaceC3431pk<C3276jn> {

    /* renamed from: a */
    final /* synthetic */ C3056bj f9002a;

    /* renamed from: b */
    final /* synthetic */ C3350mh f9003b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3557ug(C3350mh c3350mh, C3056bj c3056bj) {
        this.f9003b = c3350mh;
        this.f9002a = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3276jn c3276jn) {
        C3276jn c3276jn2 = c3276jn;
        this.f9003b.m30670o(new C3140em(c3276jn2.m30893k(), c3276jn2.m30894h(), Long.valueOf(c3276jn2.m30895f()), "Bearer"), null, null, Boolean.valueOf(c3276jn2.m30892l()), null, this.f9002a, this);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f9002a.mo29940h(C5227i.m25323a(str));
    }
}
