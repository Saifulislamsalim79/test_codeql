package com.google.android.gms.internal.p104firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fc */
/* loaded from: classes2.dex */
public final class C3157fc implements InterfaceC3542u1 {

    /* renamed from: a */
    private final InterfaceC3397oc f8461a;

    /* renamed from: b */
    private final InterfaceC3439q2 f8462b;

    /* renamed from: c */
    private final int f8463c;

    public C3157fc(InterfaceC3397oc interfaceC3397oc, InterfaceC3439q2 interfaceC3439q2, int i) {
        this.f8461a = interfaceC3397oc;
        this.f8462b = interfaceC3439q2;
        this.f8463c = i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: a */
    public final byte[] mo29893a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f8463c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
            this.f8462b.mo30167a(Arrays.copyOfRange(bArr, length - this.f8463c, length), C3578vb.m30128c(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.f8461a.mo30032a(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: b */
    public final byte[] mo29892b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
