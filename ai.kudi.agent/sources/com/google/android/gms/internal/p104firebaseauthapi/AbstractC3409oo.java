package com.google.android.gms.internal.p104firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.oo */
/* loaded from: classes2.dex */
public abstract class AbstractC3409oo extends AbstractC3487ro {

    /* renamed from: d */
    final byte[] f8815d;

    /* renamed from: e */
    final int f8816e;

    /* renamed from: f */
    int f8817f;

    /* renamed from: g */
    int f8818g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3409oo(int i) {
        super(null);
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f8815d = bArr;
            this.f8816e = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final void m30485I(byte b) {
        byte[] bArr = this.f8815d;
        int i = this.f8817f;
        this.f8817f = i + 1;
        bArr[i] = b;
        this.f8818g++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final void m30484J(int i) {
        byte[] bArr = this.f8815d;
        int i2 = this.f8817f;
        int i3 = i2 + 1;
        this.f8817f = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.f8817f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.f8817f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f8817f = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f8818g += 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final void m30483K(long j) {
        byte[] bArr = this.f8815d;
        int i = this.f8817f;
        int i2 = i + 1;
        this.f8817f = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        this.f8817f = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        this.f8817f = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        this.f8817f = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        this.f8817f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.f8817f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.f8817f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f8817f = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f8818g += 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public final void m30482L(int i) {
        boolean z;
        z = AbstractC3487ro.f8925c;
        if (z) {
            long j = this.f8817f;
            while ((i & (-128)) != 0) {
                byte[] bArr = this.f8815d;
                int i2 = this.f8817f;
                this.f8817f = i2 + 1;
                C3254j1.m30915s(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.f8815d;
            int i3 = this.f8817f;
            this.f8817f = i3 + 1;
            C3254j1.m30915s(bArr2, i3, (byte) i);
            this.f8818g += (int) (this.f8817f - j);
            return;
        }
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.f8815d;
            int i4 = this.f8817f;
            this.f8817f = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.f8818g++;
            i >>>= 7;
        }
        byte[] bArr4 = this.f8815d;
        int i5 = this.f8817f;
        this.f8817f = i5 + 1;
        bArr4[i5] = (byte) i;
        this.f8818g++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final void m30481M(long j) {
        boolean z;
        z = AbstractC3487ro.f8925c;
        if (z) {
            long j2 = this.f8817f;
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f8815d;
                int i = this.f8817f;
                this.f8817f = i + 1;
                C3254j1.m30915s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f8815d;
            int i2 = this.f8817f;
            this.f8817f = i2 + 1;
            C3254j1.m30915s(bArr2, i2, (byte) j);
            this.f8818g += (int) (this.f8817f - j2);
            return;
        }
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.f8815d;
            int i3 = this.f8817f;
            this.f8817f = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.f8818g++;
            j >>>= 7;
        }
        byte[] bArr4 = this.f8815d;
        int i4 = this.f8817f;
        this.f8817f = i4 + 1;
        bArr4[i4] = (byte) j;
        this.f8818g++;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: q */
    public final int mo30313q() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
