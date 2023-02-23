package com.google.android.gms.internal.p104firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xb */
/* loaded from: classes2.dex */
abstract class AbstractC3630xb implements InterfaceC3397oc {

    /* renamed from: c */
    private static final int[] f9081c = m30026i(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    int[] f9082a;

    /* renamed from: b */
    private final int f9083b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3630xb(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f9082a = m30026i(bArr);
            this.f9083b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: e */
    static void m30030e(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> (-16)) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> (-12)) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> (-8)) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> (-7)) | (i15 << 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m30029f(int[] iArr, int[] iArr2) {
        int[] iArr3 = f9081c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, f9081c.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m30028g(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            m30030e(iArr, 0, 4, 8, 12);
            m30030e(iArr, 1, 5, 9, 13);
            m30030e(iArr, 2, 6, 10, 14);
            m30030e(iArr, 3, 7, 11, 15);
            m30030e(iArr, 0, 5, 10, 15);
            m30030e(iArr, 1, 6, 11, 12);
            m30030e(iArr, 2, 7, 8, 13);
            m30030e(iArr, 3, 4, 9, 14);
        }
    }

    /* renamed from: i */
    static int[] m30026i(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3397oc
    /* renamed from: a */
    public final byte[] mo30032a(byte[] bArr) throws GeneralSecurityException {
        return m30027h(ByteBuffer.wrap(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo29889b();

    /* renamed from: c */
    abstract int[] mo29888c(int[] iArr, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final ByteBuffer m30031d(byte[] bArr, int i) {
        int[] mo29888c = mo29888c(m30026i(bArr), i);
        int[] iArr = (int[]) mo29888c.clone();
        m30028g(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            mo29888c[i2] = mo29888c[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(mo29888c, 0, 16);
        return order;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final byte[] m30027h(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= mo29889b()) {
            byte[] bArr = new byte[mo29889b()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            int remaining = byteBuffer.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer m30031d = m30031d(bArr, this.f9083b + i2);
                if (i2 == i - 1) {
                    C3578vb.m30130a(allocate, byteBuffer, m30031d, remaining % 64);
                } else {
                    C3578vb.m30130a(allocate, byteBuffer, m30031d, 64);
                }
            }
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
