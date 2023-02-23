package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.po */
/* loaded from: classes2.dex */
public final class C3435po extends AbstractC3487ro {

    /* renamed from: d */
    private final byte[] f8863d;

    /* renamed from: e */
    private final int f8864e;

    /* renamed from: f */
    private int f8865f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3435po(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f8863d = bArr;
            this.f8865f = 0;
            this.f8864e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: A */
    public final void mo30336A(int i, int i2) throws IOException {
        mo30335B(i << 3);
        mo30335B(i2);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: B */
    public final void mo30335B(int i) throws IOException {
        boolean z;
        z = AbstractC3487ro.f8925c;
        if (z) {
            int i2 = C3616wn.f9068a;
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f8863d;
                int i3 = this.f8865f;
                this.f8865f = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8865f), Integer.valueOf(this.f8864e), 1), e);
            }
        }
        byte[] bArr2 = this.f8863d;
        int i4 = this.f8865f;
        this.f8865f = i4 + 1;
        bArr2[i4] = (byte) i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: C */
    public final void mo30334C(int i, long j) throws IOException {
        mo30335B(i << 3);
        mo30333D(j);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: D */
    public final void mo30333D(long j) throws IOException {
        boolean z;
        z = AbstractC3487ro.f8925c;
        if (z && this.f8864e - this.f8865f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f8863d;
                int i = this.f8865f;
                this.f8865f = i + 1;
                C3254j1.m30915s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f8863d;
            int i2 = this.f8865f;
            this.f8865f = i2 + 1;
            C3254j1.m30915s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f8863d;
                int i3 = this.f8865f;
                this.f8865f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8865f), Integer.valueOf(this.f8864e), 1), e);
            }
        }
        byte[] bArr4 = this.f8863d;
        int i4 = this.f8865f;
        this.f8865f = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    /* renamed from: I */
    public final void m30458I(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f8863d, this.f8865f, i2);
            this.f8865f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8865f), Integer.valueOf(this.f8864e), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: J */
    public final void m30457J(String str) throws IOException {
        int i = this.f8865f;
        try {
            int m30324f = AbstractC3487ro.m30324f(str.length() * 3);
            int m30324f2 = AbstractC3487ro.m30324f(str.length());
            if (m30324f2 == m30324f) {
                int i2 = i + m30324f2;
                this.f8865f = i2;
                int m30526b = C3386o1.m30526b(str, this.f8863d, i2, this.f8864e - i2);
                this.f8865f = i;
                mo30335B((m30526b - i) - m30324f2);
                this.f8865f = m30526b;
                return;
            }
            mo30335B(C3386o1.m30525c(str));
            byte[] bArr = this.f8863d;
            int i3 = this.f8865f;
            this.f8865f = C3386o1.m30526b(str, bArr, i3, this.f8864e - i3);
        } catch (C3360n1 e) {
            this.f8865f = i;
            m30319k(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzzc(e2);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3034ao
    /* renamed from: a */
    public final void mo30398a(byte[] bArr, int i, int i2) throws IOException {
        m30458I(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: m */
    public final void mo30317m() {
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: n */
    public final void mo30316n(byte b) throws IOException {
        try {
            byte[] bArr = this.f8863d;
            int i = this.f8865f;
            this.f8865f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8865f), Integer.valueOf(this.f8864e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: o */
    public final void mo30315o(int i, boolean z) throws IOException {
        mo30335B(i << 3);
        mo30316n(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: p */
    public final void mo30314p(int i, AbstractC3223ho abstractC3223ho) throws IOException {
        mo30335B((i << 3) | 2);
        mo30335B(abstractC3223ho.mo31014f());
        abstractC3223ho.mo31008u(this);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: q */
    public final int mo30313q() {
        return this.f8864e - this.f8865f;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: r */
    public final void mo30312r(int i, int i2) throws IOException {
        mo30335B((i << 3) | 5);
        mo30311s(i2);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: s */
    public final void mo30311s(int i) throws IOException {
        try {
            byte[] bArr = this.f8863d;
            int i2 = this.f8865f;
            int i3 = i2 + 1;
            this.f8865f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f8865f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f8865f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f8865f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8865f), Integer.valueOf(this.f8864e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: t */
    public final void mo30310t(int i, long j) throws IOException {
        mo30335B((i << 3) | 1);
        mo30309u(j);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: u */
    public final void mo30309u(long j) throws IOException {
        try {
            byte[] bArr = this.f8863d;
            int i = this.f8865f;
            int i2 = i + 1;
            this.f8865f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f8865f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f8865f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f8865f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f8865f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f8865f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f8865f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f8865f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8865f), Integer.valueOf(this.f8864e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: v */
    public final void mo30308v(int i, int i2) throws IOException {
        mo30335B(i << 3);
        mo30307w(i2);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: w */
    public final void mo30307w(int i) throws IOException {
        if (i >= 0) {
            mo30335B(i);
        } else {
            mo30333D(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: x */
    public final void mo30306x(int i, InterfaceC3644y interfaceC3644y, InterfaceC3307l0 interfaceC3307l0) throws IOException {
        mo30335B((i << 3) | 2);
        AbstractC3564un abstractC3564un = (AbstractC3564un) interfaceC3644y;
        int mo30163a = abstractC3564un.mo30163a();
        if (mo30163a == -1) {
            mo30163a = interfaceC3307l0.mo30813d(abstractC3564un);
            abstractC3564un.mo30162b(mo30163a);
        }
        mo30335B(mo30163a);
        interfaceC3307l0.mo30811f(interfaceC3644y, this.f8926a);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: y */
    public final void mo30305y(int i, String str) throws IOException {
        mo30335B((i << 3) | 2);
        m30457J(str);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: z */
    public final void mo30304z(int i, int i2) throws IOException {
        mo30335B((i << 3) | i2);
    }
}
