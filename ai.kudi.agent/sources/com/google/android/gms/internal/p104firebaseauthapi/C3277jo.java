package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jo */
/* loaded from: classes2.dex */
public final class C3277jo extends AbstractC3304ko {

    /* renamed from: c */
    private final byte[] f8653c;

    /* renamed from: d */
    private int f8654d;

    /* renamed from: e */
    private int f8655e;

    /* renamed from: f */
    private int f8656f;

    /* renamed from: g */
    private int f8657g;

    /* renamed from: h */
    private int f8658h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3277jo(byte[] bArr, int i, int i2, boolean z, C3250io c3250io) {
        super(null);
        this.f8658h = Integer.MAX_VALUE;
        this.f8653c = bArr;
        this.f8654d = i2;
        this.f8656f = 0;
    }

    /* renamed from: t */
    private final void m30885t() {
        int i = this.f8654d + this.f8655e;
        this.f8654d = i;
        int i2 = this.f8658h;
        if (i <= i2) {
            this.f8655e = 0;
            return;
        }
        int i3 = i - i2;
        this.f8655e = i3;
        this.f8654d = i - i3;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3304ko
    /* renamed from: a */
    public final int mo30829a() {
        return this.f8656f;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3304ko
    /* renamed from: b */
    public final int mo30828b(int i) throws zzaae {
        if (i >= 0) {
            int i2 = i + this.f8656f;
            if (i2 >= 0) {
                int i3 = this.f8658h;
                if (i2 <= i3) {
                    this.f8658h = i2;
                    m30885t();
                    return i3;
                }
                throw zzaae.m29865i();
            }
            throw zzaae.m29867g();
        }
        throw zzaae.m29868f();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3304ko
    /* renamed from: c */
    public final int mo30827c() throws IOException {
        if (mo30821i()) {
            this.f8657g = 0;
            return 0;
        }
        int m30889p = m30889p();
        this.f8657g = m30889p;
        if ((m30889p >>> 3) != 0) {
            return m30889p;
        }
        throw zzaae.m29871c();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3304ko
    /* renamed from: d */
    public final AbstractC3223ho mo30826d() throws IOException {
        int m30889p = m30889p();
        if (m30889p > 0) {
            int i = this.f8654d;
            int i2 = this.f8656f;
            if (m30889p <= i - i2) {
                AbstractC3223ho m31021O = AbstractC3223ho.m31021O(this.f8653c, i2, m30889p);
                this.f8656f += m30889p;
                return m31021O;
            }
        }
        if (m30889p != 0) {
            if (m30889p > 0) {
                int i3 = this.f8654d;
                int i4 = this.f8656f;
                if (m30889p <= i3 - i4) {
                    int i5 = m30889p + i4;
                    this.f8656f = i5;
                    return AbstractC3223ho.m31019V(Arrays.copyOfRange(this.f8653c, i4, i5));
                }
            }
            if (m30889p <= 0) {
                throw zzaae.m29868f();
            }
            throw zzaae.m29865i();
        }
        return AbstractC3223ho.f8571d;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3304ko
    /* renamed from: e */
    public final String mo30825e() throws IOException {
        int m30889p = m30889p();
        if (m30889p > 0) {
            int i = this.f8654d;
            int i2 = this.f8656f;
            if (m30889p <= i - i2) {
                String str = new String(this.f8653c, i2, m30889p, C3117e.f8412a);
                this.f8656f += m30889p;
                return str;
            }
        }
        if (m30889p == 0) {
            return "";
        }
        if (m30889p < 0) {
            throw zzaae.m29868f();
        }
        throw zzaae.m29865i();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3304ko
    /* renamed from: f */
    public final String mo30824f() throws IOException {
        int m30889p = m30889p();
        if (m30889p > 0) {
            int i = this.f8654d;
            int i2 = this.f8656f;
            if (m30889p <= i - i2) {
                String m30524d = C3386o1.m30524d(this.f8653c, i2, m30889p);
                this.f8656f += m30889p;
                return m30524d;
            }
        }
        if (m30889p == 0) {
            return "";
        }
        if (m30889p <= 0) {
            throw zzaae.m29868f();
        }
        throw zzaae.m29865i();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3304ko
    /* renamed from: g */
    public final void mo30823g(int i) throws zzaae {
        if (this.f8657g != i) {
            throw zzaae.m29872b();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3304ko
    /* renamed from: h */
    public final void mo30822h(int i) {
        this.f8658h = i;
        m30885t();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3304ko
    /* renamed from: i */
    public final boolean mo30821i() throws IOException {
        return this.f8656f == this.f8654d;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3304ko
    /* renamed from: j */
    public final boolean mo30820j() throws IOException {
        return m30887r() != 0;
    }

    /* renamed from: n */
    public final byte m30891n() throws IOException {
        int i = this.f8656f;
        if (i != this.f8654d) {
            byte[] bArr = this.f8653c;
            this.f8656f = i + 1;
            return bArr[i];
        }
        throw zzaae.m29865i();
    }

    /* renamed from: o */
    public final int m30890o() throws IOException {
        int i = this.f8656f;
        if (this.f8654d - i >= 4) {
            byte[] bArr = this.f8653c;
            this.f8656f = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzaae.m29865i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m30889p() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f8656f
            int r1 = r5.f8654d
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f8653c
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f8656f = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.f8656f = r1
            return r0
        L6c:
            long r0 = r5.m30886s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p104firebaseauthapi.C3277jo.m30889p():int");
    }

    /* renamed from: q */
    public final long m30888q() throws IOException {
        int i = this.f8656f;
        if (this.f8654d - i >= 8) {
            byte[] bArr = this.f8653c;
            this.f8656f = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw zzaae.m29865i();
    }

    /* renamed from: r */
    public final long m30887r() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.f8656f;
        int i3 = this.f8654d;
        if (i3 != i2) {
            byte[] bArr = this.f8653c;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f8656f = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            long j5 = (bArr[i5] << 28) ^ i9;
                            if (j5 < 0) {
                                int i10 = i7 + 1;
                                long j6 = j5 ^ (bArr[i7] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i10 + 1;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i10 = i7 + 1;
                                        j6 = j5 ^ (bArr[i7] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i10 + 1;
                                            j = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i10 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                    i5 = i10;
                                                    this.f8656f = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.f8656f = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.f8656f = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.f8656f = i5;
                return j2;
            }
        }
        return m30886s();
    }

    /* renamed from: s */
    final long m30886s() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m30891n = m30891n();
            j |= (m30891n & Byte.MAX_VALUE) << i;
            if ((m30891n & 128) == 0) {
                return j;
            }
        }
        throw zzaae.m29869e();
    }
}
