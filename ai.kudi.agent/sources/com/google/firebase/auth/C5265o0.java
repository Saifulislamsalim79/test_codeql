package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p104firebaseauthapi.C3140em;
import com.google.firebase.auth.internal.InterfaceC5252y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.o0 */
/* loaded from: classes2.dex */
public final class C5265o0 implements InterfaceC5252y {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth f13070a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5265o0(FirebaseAuth firebaseAuth) {
        this.f13070a = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.InterfaceC5216c0
    /* renamed from: a */
    public final void mo25259a(C3140em c3140em, AbstractC5203f abstractC5203f) {
        com.google.android.gms.common.internal.s.j(c3140em);
        com.google.android.gms.common.internal.s.j(abstractC5203f);
        abstractC5203f.mo25301l0(c3140em);
        FirebaseAuth.m25401p(this.f13070a, abstractC5203f, c3140em, true, true);
    }

    @Override // com.google.firebase.auth.internal.InterfaceC5235m
    /* renamed from: b */
    public final void mo25258b(Status status) {
        if (status.m32097h() == 17011 || status.m32097h() == 17021 || status.m32097h() == 17005 || status.m32097h() == 17091) {
            this.f13070a.m25408i();
        }
    }
}
