package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mb */
/* loaded from: classes2.dex */
public final class C3344mb implements InterfaceC3397oc {

    /* renamed from: d */
    private static final ThreadLocal<Cipher> f8720d = new C3318lb();

    /* renamed from: a */
    private final SecretKeySpec f8721a;

    /* renamed from: b */
    private final int f8722b;

    /* renamed from: c */
    private final int f8723c;

    public C3344mb(byte[] bArr, int i) throws GeneralSecurityException {
        C3657yc.m29961b(bArr.length);
        this.f8721a = new SecretKeySpec(bArr, "AES");
        int blockSize = f8720d.get().getBlockSize();
        this.f8723c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f8722b = i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3397oc
    /* renamed from: a */
    public final byte[] mo30032a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f8722b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.f8722b;
            int i3 = length - i2;
            byte[] bArr3 = new byte[i3];
            Cipher cipher = f8720d.get();
            byte[] bArr4 = new byte[this.f8723c];
            System.arraycopy(bArr2, 0, bArr4, 0, this.f8722b);
            cipher.init(2, this.f8721a, new IvParameterSpec(bArr4));
            if (cipher.doFinal(bArr, i2, i3, bArr3, 0) == i3) {
                return bArr3;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
