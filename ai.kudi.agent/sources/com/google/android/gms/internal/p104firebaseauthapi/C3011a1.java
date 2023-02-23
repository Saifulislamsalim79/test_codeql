package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a1 */
/* loaded from: classes2.dex */
public final class C3011a1 {

    /* renamed from: f */
    private static final C3011a1 f8183f = new C3011a1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f8184a;

    /* renamed from: b */
    private int[] f8185b;

    /* renamed from: c */
    private Object[] f8186c;

    /* renamed from: d */
    private int f8187d;

    /* renamed from: e */
    private boolean f8188e;

    private C3011a1() {
        this(0, new int[8], new Object[8], true);
    }

    private C3011a1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f8187d = -1;
        this.f8184a = i;
        this.f8185b = iArr;
        this.f8186c = objArr;
        this.f8188e = z;
    }

    /* renamed from: c */
    public static C3011a1 m31462c() {
        return f8183f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C3011a1 m31461d(C3011a1 c3011a1, C3011a1 c3011a12) {
        int i = c3011a1.f8184a + c3011a12.f8184a;
        int[] copyOf = Arrays.copyOf(c3011a1.f8185b, i);
        System.arraycopy(c3011a12.f8185b, 0, copyOf, c3011a1.f8184a, c3011a12.f8184a);
        Object[] copyOf2 = Arrays.copyOf(c3011a1.f8186c, i);
        System.arraycopy(c3011a12.f8186c, 0, copyOf2, c3011a1.f8184a, c3011a12.f8184a);
        return new C3011a1(i, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C3011a1 m31460e() {
        return new C3011a1(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m31464a() {
        int m30324f;
        int m30323g;
        int i;
        int i2 = this.f8187d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f8184a; i4++) {
                int i5 = this.f8185b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ((Long) this.f8186c[i4]).longValue();
                        i = AbstractC3487ro.m30324f(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int m30324f2 = AbstractC3487ro.m30324f(i6 << 3);
                        int mo31014f = ((AbstractC3223ho) this.f8186c[i4]).mo31014f();
                        i3 += m30324f2 + AbstractC3487ro.m30324f(mo31014f) + mo31014f;
                    } else if (i7 == 3) {
                        int m30325e = AbstractC3487ro.m30325e(i6);
                        m30324f = m30325e + m30325e;
                        m30323g = ((C3011a1) this.f8186c[i4]).m31464a();
                    } else if (i7 == 5) {
                        ((Integer) this.f8186c[i4]).intValue();
                        i = AbstractC3487ro.m30324f(i6 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzaae.m29873a());
                    }
                    i3 += i;
                } else {
                    long longValue = ((Long) this.f8186c[i4]).longValue();
                    m30324f = AbstractC3487ro.m30324f(i6 << 3);
                    m30323g = AbstractC3487ro.m30323g(longValue);
                }
                i = m30324f + m30323g;
                i3 += i;
            }
            this.f8187d = i3;
            return i3;
        }
        return i2;
    }

    /* renamed from: b */
    public final int m31463b() {
        int i = this.f8187d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f8184a; i3++) {
                int i4 = this.f8185b[i3];
                int m30324f = AbstractC3487ro.m30324f(8);
                int mo31014f = ((AbstractC3223ho) this.f8186c[i3]).mo31014f();
                i2 += m30324f + m30324f + AbstractC3487ro.m30324f(16) + AbstractC3487ro.m30324f(i4 >>> 3) + AbstractC3487ro.m30324f(24) + AbstractC3487ro.m30324f(mo31014f) + mo31014f;
            }
            this.f8187d = i2;
            return i2;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C3011a1)) {
            C3011a1 c3011a1 = (C3011a1) obj;
            int i = this.f8184a;
            if (i == c3011a1.f8184a) {
                int[] iArr = this.f8185b;
                int[] iArr2 = c3011a1.f8185b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.f8186c;
                        Object[] objArr2 = c3011a1.f8186c;
                        int i3 = this.f8184a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final void m31459f() {
        this.f8188e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m31458g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f8184a; i2++) {
            C3037b0.m31412b(sb, i, String.valueOf(this.f8185b[i2] >>> 3), this.f8186c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m31457h(int i, Object obj) {
        if (this.f8188e) {
            int i2 = this.f8184a;
            int[] iArr = this.f8185b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f8185b = Arrays.copyOf(iArr, i3);
                this.f8186c = Arrays.copyOf(this.f8186c, i3);
            }
            int[] iArr2 = this.f8185b;
            int i4 = this.f8184a;
            iArr2[i4] = i;
            this.f8186c[i4] = obj;
            this.f8184a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f8184a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f8185b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f8186c;
        int i7 = this.f8184a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void m31456i(C3513so c3513so) throws IOException {
        if (this.f8184a != 0) {
            for (int i = 0; i < this.f8184a; i++) {
                int i2 = this.f8185b[i];
                Object obj = this.f8186c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    c3513so.m30259E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    c3513so.m30229x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    c3513so.m30238o(i3, (AbstractC3223ho) obj);
                } else if (i4 == 3) {
                    c3513so.m30248e(i3);
                    ((C3011a1) obj).m31456i(c3513so);
                    c3513so.m30234s(i3);
                } else if (i4 == 5) {
                    c3513so.m30231v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzaae.m29873a());
                }
            }
        }
    }
}
