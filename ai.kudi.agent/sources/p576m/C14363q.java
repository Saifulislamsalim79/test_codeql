package p576m;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentedByteString.java */
/* renamed from: m.q */
/* loaded from: classes3.dex */
public final class C14363q extends C14347f {

    /* renamed from: x */
    final transient byte[][] f31661x;

    /* renamed from: y */
    final transient int[] f31662y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14363q(C14342c c14342c, int i) {
        super(null);
        C14368u.m1944b(c14342c.f31619d, 0L, i);
        C14361o c14361o = c14342c.f31618c;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c14361o.f31654c;
            int i6 = c14361o.f31653b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                c14361o = c14361o.f31657f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f31661x = new byte[i4];
        this.f31662y = new int[i4 * 2];
        C14361o c14361o2 = c14342c.f31618c;
        int i7 = 0;
        while (i2 < i) {
            this.f31661x[i7] = c14361o2.f31652a;
            i2 += c14361o2.f31654c - c14361o2.f31653b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f31662y;
            iArr[i7] = i2;
            iArr[this.f31661x.length + i7] = c14361o2.f31653b;
            c14361o2.f31655d = true;
            i7++;
            c14361o2 = c14361o2.f31657f;
        }
    }

    /* renamed from: P */
    private int m1963P(int i) {
        int binarySearch = Arrays.binarySearch(this.f31662y, 0, this.f31661x.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ (-1);
    }

    /* renamed from: Q */
    private C14347f m1962Q() {
        return new C14347f(mo1966J());
    }

    @Override // p576m.C14347f
    /* renamed from: A */
    public int mo1969A() {
        return this.f31662y[this.f31661x.length - 1];
    }

    @Override // p576m.C14347f
    /* renamed from: F */
    public C14347f mo1968F(int i, int i2) {
        return m1962Q().mo1968F(i, i2);
    }

    @Override // p576m.C14347f
    /* renamed from: I */
    public C14347f mo1967I() {
        return m1962Q().mo1967I();
    }

    @Override // p576m.C14347f
    /* renamed from: J */
    public byte[] mo1966J() {
        int[] iArr = this.f31662y;
        byte[][] bArr = this.f31661x;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f31662y;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f31661x[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // p576m.C14347f
    /* renamed from: M */
    public String mo1965M() {
        return m1962Q().mo1965M();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p576m.C14347f
    /* renamed from: O */
    public void mo1964O(C14342c c14342c) {
        int length = this.f31661x.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f31662y;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C14361o c14361o = new C14361o(this.f31661x[i], i3, (i3 + i4) - i2, true, false);
            C14361o c14361o2 = c14342c.f31618c;
            if (c14361o2 == null) {
                c14361o.f31658g = c14361o;
                c14361o.f31657f = c14361o;
                c14342c.f31618c = c14361o;
            } else {
                c14361o2.f31658g.m1975c(c14361o);
            }
            i++;
            i2 = i4;
        }
        c14342c.f31619d += i2;
    }

    @Override // p576m.C14347f
    /* renamed from: a */
    public String mo1961a() {
        return m1962Q().mo1961a();
    }

    @Override // p576m.C14347f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14347f) {
            C14347f c14347f = (C14347f) obj;
            if (c14347f.mo1969A() == mo1969A() && mo1957v(0, c14347f, 0, mo1969A())) {
                return true;
            }
        }
        return false;
    }

    @Override // p576m.C14347f
    public int hashCode() {
        int i = this.f31625d;
        if (i != 0) {
            return i;
        }
        int length = this.f31661x.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f31661x[i2];
            int[] iArr = this.f31662y;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f31625d = i4;
        return i4;
    }

    @Override // p576m.C14347f
    /* renamed from: n */
    public byte mo1960n(int i) {
        C14368u.m1944b(this.f31662y[this.f31661x.length - 1], i, 1L);
        int m1963P = m1963P(i);
        int i2 = m1963P == 0 ? 0 : this.f31662y[m1963P - 1];
        int[] iArr = this.f31662y;
        byte[][] bArr = this.f31661x;
        return bArr[m1963P][(i - i2) + iArr[bArr.length + m1963P]];
    }

    @Override // p576m.C14347f
    /* renamed from: p */
    public String mo1959p() {
        return m1962Q().mo1959p();
    }

    @Override // p576m.C14347f
    /* renamed from: q */
    public C14347f mo1958q() {
        return m1962Q().mo1958q();
    }

    @Override // p576m.C14347f
    public String toString() {
        return m1962Q().toString();
    }

    @Override // p576m.C14347f
    /* renamed from: v */
    public boolean mo1957v(int i, C14347f c14347f, int i2, int i3) {
        if (i < 0 || i > mo1969A() - i3) {
            return false;
        }
        int m1963P = m1963P(i);
        while (i3 > 0) {
            int i4 = m1963P == 0 ? 0 : this.f31662y[m1963P - 1];
            int min = Math.min(i3, ((this.f31662y[m1963P] - i4) + i4) - i);
            int[] iArr = this.f31662y;
            byte[][] bArr = this.f31661x;
            if (!c14347f.mo1956w(i2, bArr[m1963P], (i - i4) + iArr[bArr.length + m1963P], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            m1963P++;
        }
        return true;
    }

    @Override // p576m.C14347f
    /* renamed from: w */
    public boolean mo1956w(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo1969A() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int m1963P = m1963P(i);
        while (i3 > 0) {
            int i4 = m1963P == 0 ? 0 : this.f31662y[m1963P - 1];
            int min = Math.min(i3, ((this.f31662y[m1963P] - i4) + i4) - i);
            int[] iArr = this.f31662y;
            byte[][] bArr2 = this.f31661x;
            if (!C14368u.m1945a(bArr2[m1963P], (i - i4) + iArr[bArr2.length + m1963P], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            m1963P++;
        }
        return true;
    }

    @Override // p576m.C14347f
    /* renamed from: y */
    public C14347f mo1955y() {
        return m1962Q().mo1955y();
    }

    @Override // p576m.C14347f
    /* renamed from: z */
    public C14347f mo1954z() {
        return m1962Q().mo1954z();
    }
}
