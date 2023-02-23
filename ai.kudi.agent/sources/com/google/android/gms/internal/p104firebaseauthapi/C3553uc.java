package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.uc */
/* loaded from: classes2.dex */
public final class C3553uc implements InterfaceC3439q2 {

    /* renamed from: a */
    private final InterfaceC3070c6 f8997a;

    /* renamed from: b */
    private final int f8998b;

    public C3553uc(InterfaceC3070c6 interfaceC3070c6, int i) throws GeneralSecurityException {
        this.f8997a = interfaceC3070c6;
        this.f8998b = i;
        if (i >= 10) {
            interfaceC3070c6.mo30216a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3439q2
    /* renamed from: a */
    public final void mo30167a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!C3578vb.m30129b(this.f8997a.mo30216a(bArr2, this.f8998b), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
