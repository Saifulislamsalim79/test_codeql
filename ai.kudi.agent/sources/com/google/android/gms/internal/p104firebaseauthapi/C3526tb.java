package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.tb */
/* loaded from: classes2.dex */
public final class C3526tb implements InterfaceC3646y1 {

    /* renamed from: c */
    private static final Collection<Integer> f8973c = Arrays.asList(64);

    /* renamed from: d */
    private static final byte[] f8974d = new byte[16];

    /* renamed from: a */
    private final C3475rc f8975a;

    /* renamed from: b */
    private final byte[] f8976b;

    public C3526tb(byte[] bArr) throws GeneralSecurityException {
        Collection<Integer> collection = f8973c;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
            this.f8976b = Arrays.copyOfRange(bArr, i, length);
            this.f8975a = new C3475rc(copyOfRange);
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("invalid key size: ");
        sb.append(length);
        sb.append(" bytes; key must have 64 bytes");
        throw new InvalidKeyException(sb.toString());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3646y1
    /* renamed from: a */
    public final byte[] mo29977a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] m30127d;
        int length = bArr.length;
        if (length >= 16) {
            Cipher m31099a = C3184gc.f8504e.m31099a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            m31099a.init(2, new SecretKeySpec(this.f8976b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
            byte[] doFinal = m31099a.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && C3631xc.m30024b()) {
                doFinal = new byte[0];
            }
            byte[][] bArr4 = {bArr2, doFinal};
            byte[] mo30216a = this.f8975a.mo30216a(f8974d, 16);
            for (char c = 0; c <= 0; c = 1) {
                byte[] bArr5 = bArr4[0];
                if (bArr5 == null) {
                    bArr5 = new byte[0];
                }
                mo30216a = C3578vb.m30127d(C3552ub.m30168b(mo30216a), this.f8975a.mo30216a(bArr5, 16));
            }
            byte[] bArr6 = bArr4[1];
            int length2 = bArr6.length;
            if (length2 >= 16) {
                int length3 = mo30216a.length;
                if (length2 >= length3) {
                    int i = length2 - length3;
                    m30127d = Arrays.copyOf(bArr6, length2);
                    for (int i2 = 0; i2 < mo30216a.length; i2++) {
                        int i3 = i + i2;
                        m30127d[i3] = (byte) (m30127d[i3] ^ mo30216a[i2]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                m30127d = C3578vb.m30127d(C3552ub.m30169a(bArr6), C3552ub.m30168b(mo30216a));
            }
            if (C3578vb.m30129b(copyOfRange, this.f8975a.mo30216a(m30127d, 16))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
