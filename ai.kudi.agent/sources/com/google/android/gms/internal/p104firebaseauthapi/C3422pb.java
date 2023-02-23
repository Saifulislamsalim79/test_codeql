package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pb */
/* loaded from: classes2.dex */
public final class C3422pb implements InterfaceC3542u1 {

    /* renamed from: e */
    private static final ThreadLocal<Cipher> f8843e = new C3370nb();

    /* renamed from: f */
    private static final ThreadLocal<Cipher> f8844f = new C3396ob();

    /* renamed from: a */
    private final byte[] f8845a;

    /* renamed from: b */
    private final byte[] f8846b;

    /* renamed from: c */
    private final SecretKeySpec f8847c;

    /* renamed from: d */
    private final int f8848d;

    public C3422pb(byte[] bArr, int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f8848d = i;
        C3657yc.m29961b(bArr.length);
        this.f8847c = new SecretKeySpec(bArr, "AES");
        Cipher cipher = f8843e.get();
        cipher.init(1, this.f8847c);
        byte[] m30468c = m30468c(cipher.doFinal(new byte[16]));
        this.f8845a = m30468c;
        this.f8846b = m30468c(m30468c);
    }

    /* renamed from: c */
    private static byte[] m30468c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    /* renamed from: d */
    private final byte[] m30467d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m30466e(bArr3, this.f8845a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m30466e(copyOfRange, this.f8845a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f8846b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m30466e(doFinal, bArr2));
    }

    /* renamed from: e */
    private static byte[] m30466e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: a */
    public final byte[] mo29893a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = (length - this.f8848d) - 16;
        if (i >= 0) {
            Cipher cipher = f8843e.get();
            cipher.init(1, this.f8847c);
            byte[] m30467d = m30467d(cipher, 0, bArr, 0, this.f8848d);
            byte[] m30467d2 = m30467d(cipher, 1, bArr2, 0, bArr2.length);
            byte[] m30467d3 = m30467d(cipher, 2, bArr, this.f8848d, i);
            int i2 = length - 16;
            byte b = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                b = (byte) (b | (((bArr[i2 + i3] ^ m30467d2[i3]) ^ m30467d[i3]) ^ m30467d3[i3]));
            }
            if (b == 0) {
                Cipher cipher2 = f8844f.get();
                cipher2.init(1, this.f8847c, new IvParameterSpec(m30467d));
                return cipher2.doFinal(bArr, this.f8848d, i);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: b */
    public final byte[] mo29892b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
