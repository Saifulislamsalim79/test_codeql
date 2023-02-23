package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.C5199d;
import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wf */
/* loaded from: classes2.dex */
public final class C3608wf implements InterfaceC3431pk<C3140em> {

    /* renamed from: a */
    final /* synthetic */ C5199d f9051a;

    /* renamed from: b */
    final /* synthetic */ C3056bj f9052b;

    /* renamed from: c */
    final /* synthetic */ C3350mh f9053c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3608wf(C3350mh c3350mh, C5199d c5199d, C3056bj c3056bj) {
        this.f9053c = c3350mh;
        this.f9051a = c5199d;
        this.f9052b = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3140em c3140em) {
        this.f9053c.m30671n(new C3354ml(this.f9051a, c3140em.m31173l()), this.f9052b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f9052b.mo29940h(C5227i.m25323a(str));
    }
}
