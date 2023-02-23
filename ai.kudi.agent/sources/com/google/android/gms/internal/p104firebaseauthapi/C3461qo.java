package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qo */
/* loaded from: classes2.dex */
public final class C3461qo extends AbstractC3409oo {

    /* renamed from: h */
    private final OutputStream f8903h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3461qo(OutputStream outputStream, int i) {
        super(i);
        this.f8903h = outputStream;
    }

    /* renamed from: N */
    private final void m30402N() throws IOException {
        this.f8903h.write(this.f8815d, 0, this.f8817f);
        this.f8817f = 0;
    }

    /* renamed from: O */
    private final void m30401O(int i) throws IOException {
        if (this.f8816e - this.f8817f < i) {
            m30402N();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: A */
    public final void mo30336A(int i, int i2) throws IOException {
        m30401O(20);
        m30482L(i << 3);
        m30482L(i2);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: B */
    public final void mo30335B(int i) throws IOException {
        m30401O(5);
        m30482L(i);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: C */
    public final void mo30334C(int i, long j) throws IOException {
        m30401O(20);
        m30482L(i << 3);
        m30481M(j);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: D */
    public final void mo30333D(long j) throws IOException {
        m30401O(10);
        m30481M(j);
    }

    /* renamed from: P */
    public final void m30400P(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f8816e;
        int i4 = this.f8817f;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, 0, this.f8815d, i4, i2);
            this.f8817f += i2;
            this.f8818g += i2;
            return;
        }
        System.arraycopy(bArr, 0, this.f8815d, i4, i5);
        int i6 = i2 - i5;
        this.f8817f = this.f8816e;
        this.f8818g += i5;
        m30402N();
        if (i6 <= this.f8816e) {
            System.arraycopy(bArr, i5, this.f8815d, 0, i6);
            this.f8817f = i6;
        } else {
            this.f8903h.write(bArr, i5, i6);
        }
        this.f8818g += i6;
    }

    /* renamed from: Q */
    public final void m30399Q(String str) throws IOException {
        int m30525c;
        try {
            int length = str.length() * 3;
            int m30324f = AbstractC3487ro.m30324f(length);
            int i = m30324f + length;
            int i2 = this.f8816e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int m30526b = C3386o1.m30526b(str, bArr, 0, length);
                mo30335B(m30526b);
                m30400P(bArr, 0, m30526b);
                return;
            }
            if (i > i2 - this.f8817f) {
                m30402N();
            }
            int m30324f2 = AbstractC3487ro.m30324f(str.length());
            int i3 = this.f8817f;
            try {
                if (m30324f2 == m30324f) {
                    int i4 = i3 + m30324f2;
                    this.f8817f = i4;
                    int m30526b2 = C3386o1.m30526b(str, this.f8815d, i4, this.f8816e - i4);
                    this.f8817f = i3;
                    m30525c = (m30526b2 - i3) - m30324f2;
                    m30482L(m30525c);
                    this.f8817f = m30526b2;
                } else {
                    m30525c = C3386o1.m30525c(str);
                    m30482L(m30525c);
                    this.f8817f = C3386o1.m30526b(str, this.f8815d, this.f8817f, m30525c);
                }
                this.f8818g += m30525c;
            } catch (C3360n1 e) {
                this.f8818g -= this.f8817f - i3;
                this.f8817f = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzzc(e2);
            }
        } catch (C3360n1 e3) {
            m30319k(str, e3);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3034ao
    /* renamed from: a */
    public final void mo30398a(byte[] bArr, int i, int i2) throws IOException {
        m30400P(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: m */
    public final void mo30317m() throws IOException {
        if (this.f8817f > 0) {
            m30402N();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: n */
    public final void mo30316n(byte b) throws IOException {
        if (this.f8817f == this.f8816e) {
            m30402N();
        }
        m30485I(b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: o */
    public final void mo30315o(int i, boolean z) throws IOException {
        m30401O(11);
        m30482L(i << 3);
        m30485I(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: p */
    public final void mo30314p(int i, AbstractC3223ho abstractC3223ho) throws IOException {
        mo30335B((i << 3) | 2);
        mo30335B(abstractC3223ho.mo31014f());
        abstractC3223ho.mo31008u(this);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: r */
    public final void mo30312r(int i, int i2) throws IOException {
        m30401O(14);
        m30482L((i << 3) | 5);
        m30484J(i2);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: s */
    public final void mo30311s(int i) throws IOException {
        m30401O(4);
        m30484J(i);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: t */
    public final void mo30310t(int i, long j) throws IOException {
        m30401O(18);
        m30482L((i << 3) | 1);
        m30483K(j);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: u */
    public final void mo30309u(long j) throws IOException {
        m30401O(8);
        m30483K(j);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: v */
    public final void mo30308v(int i, int i2) throws IOException {
        m30401O(20);
        m30482L(i << 3);
        if (i2 >= 0) {
            m30482L(i2);
        } else {
            m30481M(i2);
        }
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
        m30399Q(str);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3487ro
    /* renamed from: z */
    public final void mo30304z(int i, int i2) throws IOException {
        mo30335B((i << 3) | i2);
    }
}
