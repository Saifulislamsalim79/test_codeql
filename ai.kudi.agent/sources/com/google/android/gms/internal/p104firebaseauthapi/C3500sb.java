package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sb */
/* loaded from: classes2.dex */
public final class C3500sb implements InterfaceC3542u1 {

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f8939b = new C3448qb();

    /* renamed from: a */
    private final SecretKey f8940a;

    public C3500sb(byte[] bArr) throws GeneralSecurityException {
        C3657yc.m29961b(bArr.length);
        this.f8940a = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: a */
    public final byte[] mo29893a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec gCMParameterSpec;
        int length = bArr.length;
        if (length >= 28) {
            if (C3631xc.m30024b() && C3631xc.m30025a() <= 19) {
                gCMParameterSpec = new IvParameterSpec(bArr, 0, 12);
            } else {
                gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            }
            f8939b.get().init(2, this.f8940a, gCMParameterSpec);
            if (bArr2.length != 0) {
                f8939b.get().updateAAD(bArr2);
            }
            return f8939b.get().doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: b */
    public final byte[] mo29892b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
