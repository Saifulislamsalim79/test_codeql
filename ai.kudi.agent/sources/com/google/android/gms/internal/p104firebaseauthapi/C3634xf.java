package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xf */
/* loaded from: classes2.dex */
public final class C3634xf implements InterfaceC3431pk<C3380nl> {

    /* renamed from: a */
    final /* synthetic */ C3056bj f9085a;

    /* renamed from: b */
    final /* synthetic */ C3350mh f9086b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3634xf(C3350mh c3350mh, C3056bj c3056bj) {
        this.f9086b = c3350mh;
        this.f9085a = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3380nl c3380nl) {
        C3380nl c3380nl2 = c3380nl;
        if (c3380nl2.m30532g()) {
            this.f9085a.m31389f(new C3504sf(c3380nl2.m30535c(), c3380nl2.m30533f(), null));
            return;
        }
        this.f9086b.m30670o(new C3140em(c3380nl2.m30534d(), c3380nl2.m30536b(), Long.valueOf(c3380nl2.m30537a()), "Bearer"), null, null, Boolean.valueOf(c3380nl2.m30531h()), null, this.f9085a, this);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f9085a.mo29940h(C5227i.m25323a(str));
    }
}
