package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.p099l.C2946a;
import com.google.android.gms.tasks.InterfaceC4456f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xk */
/* loaded from: classes2.dex */
public final class C3639xk implements InterfaceC4456f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3639xk(C3058bl c3058bl) {
    }

    @Override // com.google.android.gms.tasks.InterfaceC4456f
    /* renamed from: b */
    public final void mo15657b(Exception exc) {
        C2946a c2946a;
        c2946a = C3058bl.f8250d;
        String valueOf = String.valueOf(exc.getMessage());
        c2946a.m31583c(valueOf.length() != 0 ? "SmsRetrieverClient failed to start: ".concat(valueOf) : new String("SmsRetrieverClient failed to start: "), new Object[0]);
    }
}
