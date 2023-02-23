package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.oa */
/* loaded from: classes2.dex */
public final class C3928oa {

    /* renamed from: f */
    private static final C3928oa f9596f = new C3928oa(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f9597a;

    /* renamed from: b */
    private int[] f9598b;

    /* renamed from: c */
    private Object[] f9599c;

    /* renamed from: d */
    private int f9600d;

    /* renamed from: e */
    private boolean f9601e;

    private C3928oa() {
        this(0, new int[8], new Object[8], true);
    }

    private C3928oa(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f9600d = -1;
        this.f9597a = i;
        this.f9598b = iArr;
        this.f9599c = objArr;
        this.f9601e = z;
    }

    /* renamed from: c */
    public static C3928oa m29243c() {
        return f9596f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C3928oa m29242d(C3928oa c3928oa, C3928oa c3928oa2) {
        int i = c3928oa.f9597a + c3928oa2.f9597a;
        int[] copyOf = Arrays.copyOf(c3928oa.f9598b, i);
        System.arraycopy(c3928oa2.f9598b, 0, copyOf, c3928oa.f9597a, c3928oa2.f9597a);
        Object[] copyOf2 = Arrays.copyOf(c3928oa.f9599c, i);
        System.arraycopy(c3928oa2.f9599c, 0, copyOf2, c3928oa.f9597a, c3928oa2.f9597a);
        return new C3928oa(i, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C3928oa m29241e() {
        return new C3928oa(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m29245a() {
        int m28874a;
        int m28873b;
        int i;
        int i2 = this.f9600d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f9597a; i4++) {
                int i5 = this.f9598b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ((Long) this.f9599c[i4]).longValue();
                        i = AbstractC4019u7.m28874a(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int m28874a2 = AbstractC4019u7.m28874a(i6 << 3);
                        int mo29340f = ((AbstractC3909n7) this.f9599c[i4]).mo29340f();
                        i3 += m28874a2 + AbstractC4019u7.m28874a(mo29340f) + mo29340f;
                    } else if (i7 == 3) {
                        int m28875D = AbstractC4019u7.m28875D(i6);
                        m28874a = m28875D + m28875D;
                        m28873b = ((C3928oa) this.f9599c[i4]).m29245a();
                    } else if (i7 == 5) {
                        ((Integer) this.f9599c[i4]).intValue();
                        i = AbstractC4019u7.m28874a(i6 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzkh.m28519a());
                    }
                    i3 += i;
                } else {
                    long longValue = ((Long) this.f9599c[i4]).longValue();
                    m28874a = AbstractC4019u7.m28874a(i6 << 3);
                    m28873b = AbstractC4019u7.m28873b(longValue);
                }
                i = m28874a + m28873b;
                i3 += i;
            }
            this.f9600d = i3;
            return i3;
        }
        return i2;
    }

    /* renamed from: b */
    public final int m29244b() {
        int i = this.f9600d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f9597a; i3++) {
                int i4 = this.f9598b[i3];
                int m28874a = AbstractC4019u7.m28874a(8);
                int mo29340f = ((AbstractC3909n7) this.f9599c[i3]).mo29340f();
                i2 += m28874a + m28874a + AbstractC4019u7.m28874a(16) + AbstractC4019u7.m28874a(i4 >>> 3) + AbstractC4019u7.m28874a(24) + AbstractC4019u7.m28874a(mo29340f) + mo29340f;
            }
            this.f9600d = i2;
            return i2;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C3928oa)) {
            C3928oa c3928oa = (C3928oa) obj;
            int i = this.f9597a;
            if (i == c3928oa.f9597a) {
                int[] iArr = this.f9598b;
                int[] iArr2 = c3928oa.f9598b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.f9599c;
                        Object[] objArr2 = c3928oa.f9599c;
                        int i3 = this.f9597a;
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
    public final void m29240f() {
        this.f9601e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m29239g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f9597a; i2++) {
            C3957q9.m29080b(sb, i, String.valueOf(this.f9598b[i2] >>> 3), this.f9599c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m29238h(int i, Object obj) {
        if (this.f9601e) {
            int i2 = this.f9597a;
            int[] iArr = this.f9598b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f9598b = Arrays.copyOf(iArr, i3);
                this.f9599c = Arrays.copyOf(this.f9599c, i3);
            }
            int[] iArr2 = this.f9598b;
            int i4 = this.f9597a;
            iArr2[i4] = i;
            this.f9599c[i4] = obj;
            this.f9597a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f9597a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f9598b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f9599c;
        int i7 = this.f9597a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void m29237i(C4035v7 c4035v7) throws IOException {
        if (this.f9597a != 0) {
            for (int i = 0; i < this.f9597a; i++) {
                int i2 = this.f9598b[i];
                Object obj = this.f9599c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    c4035v7.m28772E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    c4035v7.m28742x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    c4035v7.m28751o(i3, (AbstractC3909n7) obj);
                } else if (i4 == 3) {
                    c4035v7.m28761e(i3);
                    ((C3928oa) obj).m29237i(c4035v7);
                    c4035v7.m28747s(i3);
                } else if (i4 == 5) {
                    c4035v7.m28744v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkh.m28519a());
                }
            }
        }
    }
}
