package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.go */
/* loaded from: classes2.dex */
public class C3196go extends AbstractC3169fo {

    /* renamed from: e */
    protected final byte[] f8520e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3196go(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.f8520e = bArr;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: E */
    public final boolean mo31025E() {
        return C3386o1.m30522f(this.f8520e, 0, mo31014f());
    }

    /* renamed from: b0 */
    protected int mo31090b0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: d */
    public byte mo31016d(int i) {
        return this.f8520e[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: e */
    public byte mo31015e(int i) {
        return this.f8520e[i];
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC3223ho) && mo31014f() == ((AbstractC3223ho) obj).mo31014f()) {
            if (mo31014f() == 0) {
                return true;
            }
            if (obj instanceof C3196go) {
                C3196go c3196go = (C3196go) obj;
                int m31023I = m31023I();
                int m31023I2 = c3196go.m31023I();
                if (m31023I == 0 || m31023I2 == 0 || m31023I == m31023I2) {
                    int mo31014f = mo31014f();
                    if (mo31014f <= c3196go.mo31014f()) {
                        if (mo31014f <= c3196go.mo31014f()) {
                            if (c3196go instanceof C3196go) {
                                byte[] bArr = this.f8520e;
                                byte[] bArr2 = c3196go.f8520e;
                                c3196go.mo31090b0();
                                int i = 0;
                                int i2 = 0;
                                while (i < mo31014f) {
                                    if (bArr[i] != bArr2[i2]) {
                                        return false;
                                    }
                                    i++;
                                    i2++;
                                }
                                return true;
                            }
                            return c3196go.mo31011l(0, mo31014f).equals(mo31011l(0, mo31014f));
                        }
                        int mo31014f2 = c3196go.mo31014f();
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Ran off end of other: 0, ");
                        sb.append(mo31014f);
                        sb.append(", ");
                        sb.append(mo31014f2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    int mo31014f3 = mo31014f();
                    StringBuilder sb2 = new StringBuilder(40);
                    sb2.append("Length too large: ");
                    sb2.append(mo31014f);
                    sb2.append(mo31014f3);
                    throw new IllegalArgumentException(sb2.toString());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: f */
    public int mo31014f() {
        return this.f8520e.length;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: h */
    protected void mo31013h(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f8520e, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: k */
    protected final int mo31012k(int i, int i2, int i3) {
        return C3117e.m31222d(i, this.f8520e, 0, i3);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: l */
    public final AbstractC3223ho mo31011l(int i, int i2) {
        int m31024F = AbstractC3223ho.m31024F(0, i2, mo31014f());
        return m31024F == 0 ? AbstractC3223ho.f8571d : new C3115do(this.f8520e, 0, m31024F);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: m */
    public final AbstractC3304ko mo31010m() {
        return AbstractC3304ko.m30817m(this.f8520e, 0, mo31014f(), true);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: s */
    protected final String mo31009s(Charset charset) {
        return new String(this.f8520e, 0, mo31014f(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: u */
    public final void mo31008u(AbstractC3034ao abstractC3034ao) throws IOException {
        abstractC3034ao.mo30398a(this.f8520e, 0, mo31014f());
    }
}
