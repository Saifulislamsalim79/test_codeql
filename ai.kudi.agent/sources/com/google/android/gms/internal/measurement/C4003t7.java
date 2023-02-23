package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.t7 */
/* loaded from: classes2.dex */
public final class C4003t7 extends AbstractC4019u7 {

    /* renamed from: d */
    private final byte[] f9710d;

    /* renamed from: e */
    private final int f9711e;

    /* renamed from: f */
    private int f9712f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4003t7(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f9710d = bArr;
            this.f9712f = 0;
            this.f9711e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
    }

    /* renamed from: E */
    public final void m28911E(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f9710d, this.f9712f, i2);
            this.f9712f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9712f), Integer.valueOf(this.f9711e), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: F */
    public final void m28910F(String str) throws IOException {
        int i = this.f9712f;
        try {
            int m28874a = AbstractC4019u7.m28874a(str.length() * 3);
            int m28874a2 = AbstractC4019u7.m28874a(str.length());
            if (m28874a2 == m28874a) {
                int i2 = i + m28874a2;
                this.f9712f = i2;
                int m29707b = C3741cb.m29707b(str, this.f9710d, i2, this.f9711e - i2);
                this.f9712f = i;
                mo28854u((m29707b - i) - m28874a2);
                this.f9712f = m29707b;
                return;
            }
            mo28854u(C3741cb.m29706c(str));
            byte[] bArr = this.f9710d;
            int i3 = this.f9712f;
            this.f9712f = C3741cb.m29707b(str, bArr, i3, this.f9711e - i3);
        } catch (C3725bb e) {
            this.f9712f = i;
            m28870e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjd(e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: g */
    public final int mo28868g() {
        return this.f9711e - this.f9712f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: h */
    public final void mo28867h(byte b) throws IOException {
        try {
            byte[] bArr = this.f9710d;
            int i = this.f9712f;
            this.f9712f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9712f), Integer.valueOf(this.f9711e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: i */
    public final void mo28866i(int i, boolean z) throws IOException {
        mo28854u(i << 3);
        mo28867h(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: j */
    public final void mo28865j(int i, AbstractC3909n7 abstractC3909n7) throws IOException {
        mo28854u((i << 3) | 2);
        mo28854u(abstractC3909n7.mo29340f());
        abstractC3909n7.mo29336m(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: k */
    public final void mo28864k(int i, int i2) throws IOException {
        mo28854u((i << 3) | 5);
        mo28863l(i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: l */
    public final void mo28863l(int i) throws IOException {
        try {
            byte[] bArr = this.f9710d;
            int i2 = this.f9712f;
            int i3 = i2 + 1;
            this.f9712f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f9712f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f9712f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f9712f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9712f), Integer.valueOf(this.f9711e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: m */
    public final void mo28862m(int i, long j) throws IOException {
        mo28854u((i << 3) | 1);
        mo28861n(j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: n */
    public final void mo28861n(long j) throws IOException {
        try {
            byte[] bArr = this.f9710d;
            int i = this.f9712f;
            int i2 = i + 1;
            this.f9712f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f9712f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f9712f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f9712f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f9712f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f9712f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f9712f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f9712f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9712f), Integer.valueOf(this.f9711e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: o */
    public final void mo28860o(int i, int i2) throws IOException {
        mo28854u(i << 3);
        mo28859p(i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: p */
    public final void mo28859p(int i) throws IOException {
        if (i >= 0) {
            mo28854u(i);
        } else {
            mo28852w(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: q */
    public final void mo28858q(byte[] bArr, int i, int i2) throws IOException {
        m28911E(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: r */
    public final void mo28857r(int i, String str) throws IOException {
        mo28854u((i << 3) | 2);
        m28910F(str);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: s */
    public final void mo28856s(int i, int i2) throws IOException {
        mo28854u((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: t */
    public final void mo28855t(int i, int i2) throws IOException {
        mo28854u(i << 3);
        mo28854u(i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: u */
    public final void mo28854u(int i) throws IOException {
        boolean z;
        z = AbstractC4019u7.f9730c;
        if (z) {
            int i2 = C3737c7.f9222a;
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f9710d;
                int i3 = this.f9712f;
                this.f9712f = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9712f), Integer.valueOf(this.f9711e), 1), e);
            }
        }
        byte[] bArr2 = this.f9710d;
        int i4 = this.f9712f;
        this.f9712f = i4 + 1;
        bArr2[i4] = (byte) i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: v */
    public final void mo28853v(int i, long j) throws IOException {
        mo28854u(i << 3);
        mo28852w(j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4019u7
    /* renamed from: w */
    public final void mo28852w(long j) throws IOException {
        boolean z;
        z = AbstractC4019u7.f9730c;
        if (z && this.f9711e - this.f9712f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f9710d;
                int i = this.f9712f;
                this.f9712f = i + 1;
                C4070xa.m28629s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f9710d;
            int i2 = this.f9712f;
            this.f9712f = i2 + 1;
            C4070xa.m28629s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f9710d;
                int i3 = this.f9712f;
                this.f9712f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9712f), Integer.valueOf(this.f9711e), 1), e);
            }
        }
        byte[] bArr4 = this.f9710d;
        int i4 = this.f9712f;
        this.f9712f = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
