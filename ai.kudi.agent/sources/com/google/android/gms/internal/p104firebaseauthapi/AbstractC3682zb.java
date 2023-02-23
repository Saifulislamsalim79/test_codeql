package com.google.android.gms.internal.p104firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zb */
/* loaded from: classes2.dex */
abstract class AbstractC3682zb implements InterfaceC3542u1 {

    /* renamed from: a */
    private final AbstractC3630xb f9141a;

    /* renamed from: b */
    private final AbstractC3630xb f9142b;

    public AbstractC3682zb(byte[] bArr) throws GeneralSecurityException {
        this.f9141a = mo29891c(bArr, 1);
        this.f9142b = mo29891c(bArr, 0);
    }

    /* renamed from: d */
    private final byte[] m29890d(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= this.f9141a.mo29889b() + 16) {
            int position = byteBuffer.position();
            byte[] bArr2 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] bArr3 = new byte[this.f9141a.mo29889b()];
            byteBuffer.get(bArr3);
            try {
                byte[] bArr4 = new byte[32];
                this.f9142b.m30031d(bArr3, 0).get(bArr4);
                int length = bArr.length;
                int i = length & 15;
                int i2 = i == 0 ? length : (length + 16) - i;
                int remaining = byteBuffer.remaining();
                int i3 = remaining % 16;
                int i4 = (i3 == 0 ? remaining : (remaining + 16) - i3) + i2;
                ByteBuffer order = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr);
                order.position(i2);
                order.put(byteBuffer);
                order.position(i4);
                order.putLong(length);
                order.putLong(remaining);
                if (C3578vb.m30129b(C3449qc.m30432a(bArr4, order.array()), bArr2)) {
                    byteBuffer.position(position);
                    return this.f9141a.m30027h(byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: a */
    public final byte[] mo29893a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return m29890d(ByteBuffer.wrap(bArr), bArr2);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3542u1
    /* renamed from: b */
    public final byte[] mo29892b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }

    /* renamed from: c */
    abstract AbstractC3630xb mo29891c(byte[] bArr, int i) throws InvalidKeyException;
}
