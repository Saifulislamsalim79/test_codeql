package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n4 */
/* loaded from: classes2.dex */
public final class C3363n4 implements InterfaceC3542u1 {

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f8749b = new C3337m4();

    /* renamed from: a */
    private final SecretKey f8750a;

    public C3363n4(byte[] bArr) throws GeneralSecurityException {
        C3657yc.m29961b(bArr.length);
        this.f8750a = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: a */
    public final byte[] mo29893a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec ivParameterSpec;
        if (bArr.length >= 28) {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                ivParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            } catch (ClassNotFoundException unused) {
                if (C3631xc.m30024b()) {
                    ivParameterSpec = new IvParameterSpec(bArr, 0, 12);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            f8749b.get().init(2, this.f8750a, ivParameterSpec);
            if (bArr2.length != 0) {
                f8749b.get().updateAAD(bArr2);
            }
            return f8749b.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: b */
    public final byte[] mo29892b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
