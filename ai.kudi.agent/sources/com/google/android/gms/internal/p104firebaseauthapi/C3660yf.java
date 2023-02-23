package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yf */
/* loaded from: classes2.dex */
public final class C3660yf implements InterfaceC3431pk<C3588vl> {

    /* renamed from: a */
    final /* synthetic */ InterfaceC3405ok f9119a;

    /* renamed from: b */
    final /* synthetic */ C3056bj f9120b;

    /* renamed from: c */
    final /* synthetic */ C3140em f9121c;

    /* renamed from: d */
    final /* synthetic */ C3589vm f9122d;

    /* renamed from: e */
    final /* synthetic */ C3350mh f9123e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3660yf(C3350mh c3350mh, InterfaceC3405ok interfaceC3405ok, C3056bj c3056bj, C3140em c3140em, C3589vm c3589vm) {
        this.f9123e = c3350mh;
        this.f9119a = interfaceC3405ok;
        this.f9120b = c3056bj;
        this.f9121c = c3140em;
        this.f9122d = c3589vm;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3588vl c3588vl) {
        List<C3640xl> m30121f = c3588vl.m30121f();
        if (m30121f != null && !m30121f.isEmpty()) {
            C3350mh.m30663v(this.f9123e, this.f9120b, this.f9121c, m30121f.get(0), this.f9122d, this.f9119a);
        } else {
            this.f9119a.mo29885e("No users");
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f9119a.mo29885e(str);
    }
}
