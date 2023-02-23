package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rc */
/* loaded from: classes2.dex */
public final class C3475rc implements InterfaceC3070c6 {

    /* renamed from: a */
    private final SecretKey f8908a;

    /* renamed from: b */
    private final byte[] f8909b;

    /* renamed from: c */
    private final byte[] f8910c;

    public C3475rc(byte[] bArr) throws GeneralSecurityException {
        C3657yc.m29961b(bArr.length);
        this.f8908a = new SecretKeySpec(bArr, "AES");
        Cipher m30379b = m30379b();
        m30379b.init(1, this.f8908a);
        byte[] m30168b = C3552ub.m30168b(m30379b.doFinal(new byte[16]));
        this.f8909b = m30168b;
        this.f8910c = C3552ub.m30168b(m30168b);
    }

    /* renamed from: b */
    private static Cipher m30379b() throws GeneralSecurityException {
        return C3184gc.f8504e.m31099a("AES/ECB/NoPadding");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3070c6
    /* renamed from: a */
    public final byte[] mo30216a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] m30127d;
        if (i <= 16) {
            Cipher m30379b = m30379b();
            m30379b.init(1, this.f8908a);
            int length = bArr.length;
            double d = length;
            Double.isNaN(d);
            int max = Math.max(1, (int) Math.ceil(d / 16.0d));
            if (max * 16 == length) {
                m30127d = C3578vb.m30126e(bArr, (max - 1) * 16, this.f8909b, 0, 16);
            } else {
                m30127d = C3578vb.m30127d(C3552ub.m30169a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f8910c);
            }
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr2 = m30379b.doFinal(C3578vb.m30126e(bArr2, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(m30379b.doFinal(C3578vb.m30127d(m30127d, bArr2)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
