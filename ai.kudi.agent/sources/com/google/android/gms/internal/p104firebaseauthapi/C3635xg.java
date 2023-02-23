package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xg */
/* loaded from: classes2.dex */
public final class C3635xg implements InterfaceC3431pk<C3484rl> {

    /* renamed from: a */
    final /* synthetic */ C3056bj f9087a;

    /* renamed from: b */
    final /* synthetic */ C3350mh f9088b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3635xg(C3350mh c3350mh, C3056bj c3056bj) {
        this.f9088b = c3350mh;
        this.f9087a = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3484rl c3484rl) {
        C3484rl c3484rl2 = c3484rl;
        this.f9088b.m30670o(new C3140em(c3484rl2.m30339b(), c3484rl2.m30340a(), Long.valueOf(C3194gm.m31091a(c3484rl2.m30340a())), "Bearer"), null, null, Boolean.FALSE, null, this.f9087a, this);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f9087a.mo29940h(C5227i.m25323a(str));
    }
}
