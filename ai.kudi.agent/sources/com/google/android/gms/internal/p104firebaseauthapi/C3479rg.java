package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rg */
/* loaded from: classes2.dex */
public final class C3479rg implements InterfaceC3431pk<C3140em> {

    /* renamed from: a */
    final /* synthetic */ String f8913a;

    /* renamed from: b */
    final /* synthetic */ C3056bj f8914b;

    /* renamed from: c */
    final /* synthetic */ C3350mh f8915c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3479rg(C3350mh c3350mh, String str, C3056bj c3056bj) {
        this.f8915c = c3350mh;
        this.f8913a = str;
        this.f8914b = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3140em c3140em) {
        AbstractC3457qk abstractC3457qk;
        C3460qn c3460qn = new C3460qn(c3140em.m31173l(), this.f8913a);
        abstractC3457qk = this.f8915c.f8728a;
        abstractC3457qk.mo30404t(c3460qn, new C3453qg(this));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f8914b.mo29940h(C5227i.m25323a(str));
    }
}
