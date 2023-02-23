package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.C5275w;
import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hh */
/* loaded from: classes2.dex */
public final class C3216hh implements InterfaceC3431pk<C3140em> {

    /* renamed from: a */
    final /* synthetic */ C5275w f8539a;

    /* renamed from: b */
    final /* synthetic */ C3056bj f8540b;

    /* renamed from: c */
    final /* synthetic */ C3350mh f8541c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3216hh(C3350mh c3350mh, C5275w c5275w, C3056bj c3056bj) {
        this.f8541c = c3350mh;
        this.f8539a = c5275w;
        this.f8540b = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3140em c3140em) {
        C3140em c3140em2 = c3140em;
        C3589vm c3589vm = new C3589vm();
        c3589vm.m30117d(c3140em2.m31173l());
        if (this.f8539a.m25230k() || this.f8539a.m25232f() != null) {
            c3589vm.m30119b(this.f8539a.m25232f());
        }
        if (this.f8539a.m25233c() || this.f8539a.m25231h() != null) {
            c3589vm.m30114g(this.f8539a.zza());
        }
        C3350mh.m30665t(this.f8541c, this.f8540b, c3140em2, c3589vm, this);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f8540b.mo29940h(C5227i.m25323a(str));
    }
}
