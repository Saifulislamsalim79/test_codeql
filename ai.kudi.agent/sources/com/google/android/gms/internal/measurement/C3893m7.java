package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.m7 */
/* loaded from: classes2.dex */
public class C3893m7 extends AbstractC3878l7 {

    /* renamed from: e */
    protected final byte[] f9493e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3893m7(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.f9493e = bArr;
    }

    /* renamed from: O */
    protected int mo29396O() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3909n7
    /* renamed from: d */
    public byte mo29342d(int i) {
        return this.f9493e[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC3909n7
    /* renamed from: e */
    public byte mo29341e(int i) {
        return this.f9493e[i];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3909n7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC3909n7) && mo29340f() == ((AbstractC3909n7) obj).mo29340f()) {
            if (mo29340f() == 0) {
                return true;
            }
            if (obj instanceof C3893m7) {
                C3893m7 c3893m7 = (C3893m7) obj;
                int m29346E = m29346E();
                int m29346E2 = c3893m7.m29346E();
                if (m29346E == 0 || m29346E2 == 0 || m29346E == m29346E2) {
                    int mo29340f = mo29340f();
                    if (mo29340f <= c3893m7.mo29340f()) {
                        if (mo29340f <= c3893m7.mo29340f()) {
                            if (c3893m7 instanceof C3893m7) {
                                byte[] bArr = this.f9493e;
                                byte[] bArr2 = c3893m7.f9493e;
                                c3893m7.mo29396O();
                                int i = 0;
                                int i2 = 0;
                                while (i < mo29340f) {
                                    if (bArr[i] != bArr2[i2]) {
                                        return false;
                                    }
                                    i++;
                                    i2++;
                                }
                                return true;
                            }
                            return c3893m7.mo29338k(0, mo29340f).equals(mo29338k(0, mo29340f));
                        }
                        int mo29340f2 = c3893m7.mo29340f();
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Ran off end of other: 0, ");
                        sb.append(mo29340f);
                        sb.append(", ");
                        sb.append(mo29340f2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    int mo29340f3 = mo29340f();
                    StringBuilder sb2 = new StringBuilder(40);
                    sb2.append("Length too large: ");
                    sb2.append(mo29340f);
                    sb2.append(mo29340f3);
                    throw new IllegalArgumentException(sb2.toString());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3909n7
    /* renamed from: f */
    public int mo29340f() {
        return this.f9493e.length;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3909n7
    /* renamed from: h */
    protected final int mo29339h(int i, int i2, int i3) {
        return C4004t8.m28906d(i, this.f9493e, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3909n7
    /* renamed from: k */
    public final AbstractC3909n7 mo29338k(int i, int i2) {
        int m29334u = AbstractC3909n7.m29334u(0, i2, mo29340f());
        return m29334u == 0 ? AbstractC3909n7.f9575d : new C3846j7(this.f9493e, 0, m29334u);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3909n7
    /* renamed from: l */
    protected final String mo29337l(Charset charset) {
        return new String(this.f9493e, 0, mo29340f(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC3909n7
    /* renamed from: m */
    public final void mo29336m(C3798g7 c3798g7) throws IOException {
        ((C4003t7) c3798g7).m28911E(this.f9493e, 0, mo29340f());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3909n7
    /* renamed from: s */
    public final boolean mo29335s() {
        return C3741cb.m29703f(this.f9493e, 0, mo29340f());
    }
}
