package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.InvalidKeyException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wb */
/* loaded from: classes2.dex */
final class C3604wb extends AbstractC3630xb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3604wb(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3630xb
    /* renamed from: b */
    public final int mo29889b() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3630xb
    /* renamed from: c */
    final int[] mo29888c(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            AbstractC3630xb.m30029f(iArr2, this.f9082a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
