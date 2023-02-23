package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ch */
/* loaded from: classes2.dex */
public final class C3081ch implements InterfaceC3431pk<C3140em> {

    /* renamed from: a */
    final /* synthetic */ C3056bj f8306a;

    /* renamed from: b */
    final /* synthetic */ C3350mh f8307b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3081ch(C3350mh c3350mh, C3056bj c3056bj) {
        this.f8307b = c3350mh;
        this.f8306a = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3140em c3140em) {
        AbstractC3457qk abstractC3457qk;
        C3328ll c3328ll = new C3328ll(c3140em.m31173l());
        abstractC3457qk = this.f8307b.f8728a;
        abstractC3457qk.mo30422b(c3328ll, new C3054bh(this, this));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f8306a.mo29940h(C5227i.m25323a(str));
    }
}
