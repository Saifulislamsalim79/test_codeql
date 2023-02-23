package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.og */
/* loaded from: classes2.dex */
final class C3401og implements InterfaceC3431pk<C3588vl> {

    /* renamed from: a */
    final /* synthetic */ InterfaceC3431pk f8798a;

    /* renamed from: b */
    final /* synthetic */ C3140em f8799b;

    /* renamed from: c */
    final /* synthetic */ C3427pg f8800c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3401og(C3427pg c3427pg, InterfaceC3431pk interfaceC3431pk, C3140em c3140em) {
        this.f8800c = c3427pg;
        this.f8798a = interfaceC3431pk;
        this.f8799b = c3140em;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3588vl c3588vl) {
        List<C3640xl> m30121f = c3588vl.m30121f();
        if (m30121f != null && !m30121f.isEmpty()) {
            C3640xl c3640xl = m30121f.get(0);
            C3589vm c3589vm = new C3589vm();
            c3589vm.m30117d(this.f8799b.m31173l());
            c3589vm.m30120a(this.f8800c.f8853a);
            C3427pg c3427pg = this.f8800c;
            C3350mh.m30663v(c3427pg.f8855c, c3427pg.f8854b, this.f8799b, c3640xl, c3589vm, this.f8798a);
            return;
        }
        this.f8798a.mo29885e("No users.");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f8800c.f8854b.mo29940h(C5227i.m25323a(str));
    }
}
