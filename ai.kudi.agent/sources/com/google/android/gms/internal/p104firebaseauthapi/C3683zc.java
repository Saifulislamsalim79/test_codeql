package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zc */
/* loaded from: classes2.dex */
final class C3683zc extends AbstractC3630xb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3683zc(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3630xb
    /* renamed from: b */
    public final int mo29889b() {
        return 24;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3630xb
    /* renamed from: c */
    final int[] mo29888c(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            AbstractC3630xb.m30029f(r0, this.f9082a);
            int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
            AbstractC3630xb.m30028g(iArr3);
            AbstractC3630xb.m30029f(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
