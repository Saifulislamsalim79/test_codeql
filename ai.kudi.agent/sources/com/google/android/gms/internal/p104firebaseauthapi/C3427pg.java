package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pg */
/* loaded from: classes2.dex */
public final class C3427pg implements InterfaceC3431pk<C3140em> {

    /* renamed from: a */
    final /* synthetic */ String f8853a;

    /* renamed from: b */
    final /* synthetic */ C3056bj f8854b;

    /* renamed from: c */
    final /* synthetic */ C3350mh f8855c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3427pg(C3350mh c3350mh, String str, C3056bj c3056bj) {
        this.f8855c = c3350mh;
        this.f8853a = str;
        this.f8854b = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3140em c3140em) {
        AbstractC3457qk abstractC3457qk;
        C3140em c3140em2 = c3140em;
        C3562ul c3562ul = new C3562ul(c3140em2.m31173l());
        abstractC3457qk = this.f8855c.f8728a;
        abstractC3457qk.mo30417g(c3562ul, new C3401og(this, this, c3140em2));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f8854b.mo29940h(C5227i.m25323a(str));
    }
}
