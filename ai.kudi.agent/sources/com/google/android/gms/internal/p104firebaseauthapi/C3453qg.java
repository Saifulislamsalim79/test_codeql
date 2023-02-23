package com.google.android.gms.internal.p104firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.internal.C5227i;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qg */
/* loaded from: classes2.dex */
final class C3453qg implements InterfaceC3431pk<C3486rn> {

    /* renamed from: a */
    final /* synthetic */ C3479rg f8889a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3453qg(C3479rg c3479rg) {
        this.f8889a = c3479rg;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3486rn c3486rn) {
        C3486rn c3486rn2 = c3486rn;
        if (!TextUtils.isEmpty(c3486rn2.m30338a()) && !TextUtils.isEmpty(c3486rn2.m30337b())) {
            C3140em c3140em = new C3140em(c3486rn2.m30337b(), c3486rn2.m30338a(), Long.valueOf(C3194gm.m31091a(c3486rn2.m30338a())), "Bearer");
            C3479rg c3479rg = this.f8889a;
            c3479rg.f8915c.m30670o(c3140em, null, null, Boolean.FALSE, null, c3479rg.f8914b, this);
            return;
        }
        this.f8889a.f8914b.mo29940h(C5227i.m25323a("INTERNAL_SUCCESS_SIGN_OUT"));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f8889a.f8914b.mo29940h(C5227i.m25323a(str));
    }
}
