package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fh */
/* loaded from: classes2.dex */
public final class C3162fh implements InterfaceC3431pk<C3222hn> {

    /* renamed from: a */
    final /* synthetic */ C3056bj f8469a;

    /* renamed from: b */
    final /* synthetic */ C3350mh f8470b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3162fh(C3350mh c3350mh, C3056bj c3056bj) {
        this.f8470b = c3350mh;
        this.f8469a = c3056bj;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3222hn c3222hn) {
        C3222hn c3222hn2 = c3222hn;
        if (!c3222hn2.m31029m()) {
            C3350mh.m30666s(this.f8470b, c3222hn2, this.f8469a, this);
        } else {
            this.f8469a.m31389f(new C3504sf(c3222hn2.m31035g(), c3222hn2.m31030l(), c3222hn2.m31039b()));
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f8469a.mo29940h(C5227i.m25323a(str));
    }
}
