package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p104firebaseauthapi.C3140em;
import com.google.firebase.auth.internal.InterfaceC5252y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.m0 */
/* loaded from: classes2.dex */
public final class C5261m0 implements InterfaceC5252y {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth f13068a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5261m0(FirebaseAuth firebaseAuth) {
        this.f13068a = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.InterfaceC5216c0
    /* renamed from: a */
    public final void mo25259a(C3140em c3140em, AbstractC5203f abstractC5203f) {
        FirebaseAuth.m25401p(this.f13068a, abstractC5203f, c3140em, true, true);
    }

    @Override // com.google.firebase.auth.internal.InterfaceC5235m
    /* renamed from: b */
    public final void mo25258b(Status status) {
        int m32097h = status.m32097h();
        if (m32097h == 17011 || m32097h == 17021 || m32097h == 17005) {
            this.f13068a.m25408i();
        }
    }
}
