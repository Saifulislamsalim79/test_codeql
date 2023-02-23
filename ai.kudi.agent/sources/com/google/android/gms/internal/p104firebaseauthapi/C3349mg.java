package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mg */
/* loaded from: classes2.dex */
public final class C3349mg implements InterfaceC3431pk<C3140em> {

    /* renamed from: a */
    final /* synthetic */ C3168fn f8725a;

    /* renamed from: b */
    final /* synthetic */ C3056bj f8726b;

    /* renamed from: c */
    final /* synthetic */ C3350mh f8727c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3349mg(C3350mh c3350mh, C3168fn c3168fn, C3056bj c3056bj) {
        this.f8727c = c3350mh;
        this.f8725a = c3168fn;
        this.f8726b = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3140em c3140em) {
        AbstractC3457qk abstractC3457qk;
        this.f8725a.m31131k(true);
        this.f8725a.m31132h(c3140em.m31173l());
        abstractC3457qk = this.f8727c.f8728a;
        abstractC3457qk.mo30408p(null, this.f8725a, new C3323lg(this, this));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f8726b.mo29940h(C5227i.m25323a(str));
    }
}
