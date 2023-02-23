package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.auth.internal.C5227i;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vg */
/* loaded from: classes2.dex */
final class C3583vg implements InterfaceC3431pk<C3432pl> {

    /* renamed from: a */
    final /* synthetic */ C3609wg f9029a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3583vg(C3609wg c3609wg) {
        this.f9029a = c3609wg;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3432pl c3432pl) {
        C3432pl c3432pl2 = c3432pl;
        C3140em c3140em = new C3140em(c3432pl2.m30459b(), c3432pl2.m30460a(), Long.valueOf(C3194gm.m31091a(c3432pl2.m30460a())), "Bearer");
        C3609wg c3609wg = this.f9029a;
        c3609wg.f9056c.m30670o(c3140em, null, null, Boolean.FALSE, null, c3609wg.f9055b, this);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f9029a.f9055b.mo29940h(C5227i.m25323a(str));
    }
}
