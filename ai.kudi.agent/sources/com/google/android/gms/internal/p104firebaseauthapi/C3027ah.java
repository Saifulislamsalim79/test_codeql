package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ah */
/* loaded from: classes2.dex */
public final class C3027ah implements InterfaceC3431pk<C3140em> {

    /* renamed from: a */
    final /* synthetic */ C3056bj f8200a;

    /* renamed from: b */
    final /* synthetic */ C3350mh f8201b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3027ah(C3350mh c3350mh, C3056bj c3056bj) {
        this.f8201b = c3350mh;
        this.f8200a = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3140em c3140em) {
        AbstractC3457qk abstractC3457qk;
        C3140em c3140em2 = c3140em;
        C3562ul c3562ul = new C3562ul(c3140em2.m31173l());
        abstractC3457qk = this.f8201b.f8728a;
        abstractC3457qk.mo30417g(c3562ul, new C3687zg(this, this, c3140em2));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f8200a.mo29940h(C5227i.m25323a(str));
    }
}
