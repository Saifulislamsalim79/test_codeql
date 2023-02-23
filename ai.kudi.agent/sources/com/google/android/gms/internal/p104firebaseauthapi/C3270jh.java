package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jh */
/* loaded from: classes2.dex */
public final class C3270jh implements InterfaceC3431pk<C3140em> {

    /* renamed from: a */
    final /* synthetic */ String f8634a;

    /* renamed from: b */
    final /* synthetic */ C3056bj f8635b;

    /* renamed from: c */
    final /* synthetic */ C3350mh f8636c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3270jh(C3350mh c3350mh, String str, C3056bj c3056bj) {
        this.f8636c = c3350mh;
        this.f8634a = str;
        this.f8635b = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3140em c3140em) {
        C3140em c3140em2 = c3140em;
        String m31173l = c3140em2.m31173l();
        C3589vm c3589vm = new C3589vm();
        c3589vm.m30117d(m31173l);
        c3589vm.m30115f(this.f8634a);
        C3350mh.m30665t(this.f8636c, this.f8635b, c3140em2, c3589vm, this);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f8635b.mo29940h(C5227i.m25323a(str));
    }
}
