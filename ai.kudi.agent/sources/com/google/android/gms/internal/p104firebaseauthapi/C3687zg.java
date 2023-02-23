package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zg */
/* loaded from: classes2.dex */
final class C3687zg implements InterfaceC3431pk<C3588vl> {

    /* renamed from: a */
    final /* synthetic */ InterfaceC3431pk f9150a;

    /* renamed from: b */
    final /* synthetic */ C3140em f9151b;

    /* renamed from: c */
    final /* synthetic */ C3027ah f9152c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3687zg(C3027ah c3027ah, InterfaceC3431pk interfaceC3431pk, C3140em c3140em) {
        this.f9152c = c3027ah;
        this.f9150a = interfaceC3431pk;
        this.f9151b = c3140em;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3588vl c3588vl) {
        List<C3640xl> m30121f = c3588vl.m30121f();
        if (m30121f != null && !m30121f.isEmpty()) {
            this.f9152c.f8200a.m31387i(this.f9151b, m30121f.get(0));
        } else {
            this.f9150a.mo29885e("No users");
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f9150a.mo29885e(str);
    }
}
