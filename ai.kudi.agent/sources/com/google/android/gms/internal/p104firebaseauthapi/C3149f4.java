package com.google.android.gms.internal.p104firebaseauthapi;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f4 */
/* loaded from: classes2.dex */
public final class C3149f4 implements InterfaceC3542u1 {

    /* renamed from: c */
    private static final byte[] f8456c = new byte[0];

    /* renamed from: a */
    private final C3020aa f8457a;

    /* renamed from: b */
    private final InterfaceC3542u1 f8458b;

    public C3149f4(C3020aa c3020aa, InterfaceC3542u1 interfaceC3542u1) {
        this.f8457a = c3020aa;
        this.f8458b = interfaceC3542u1;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: a */
    public final byte[] mo29893a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i > 0 && i <= bArr.length - 4) {
                byte[] bArr3 = new byte[i];
                wrap.get(bArr3, 0, i);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                return ((InterfaceC3542u1) C3067c3.m31300i(this.f8457a.m31430E(), this.f8458b.mo29893a(bArr3, f8456c), InterfaceC3542u1.class)).mo29893a(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: b */
    public final byte[] mo29892b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
