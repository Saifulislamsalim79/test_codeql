package p425j.p429b.p433b;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentedByteString.java */
/* renamed from: j.b.b.q */
/* loaded from: classes3.dex */
public final class C11168q extends C11152f {

    /* renamed from: x */
    final transient byte[][] f25253x;

    /* renamed from: y */
    final transient int[] f25254y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11168q(C11146c c11146c, int i) {
        super(null);
        C11173u.m11454b(c11146c.f25206d, 0L, i);
        C11166o c11166o = c11146c.f25205c;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c11166o.f25246c;
            int i6 = c11166o.f25245b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                c11166o = c11166o.f25249f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f25253x = new byte[i4];
        this.f25254y = new int[i4 * 2];
        C11166o c11166o2 = c11146c.f25205c;
        int i7 = 0;
        while (i2 < i) {
            this.f25253x[i7] = c11166o2.f25244a;
            i2 += c11166o2.f25246c - c11166o2.f25245b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f25254y;
            iArr[i7] = i2;
            iArr[this.f25253x.length + i7] = c11166o2.f25245b;
            c11166o2.f25247d = true;
            i7++;
            c11166o2 = c11166o2.f25249f;
        }
    }

    /* renamed from: S */
    private int m11464S(int i) {
        int binarySearch = Arrays.binarySearch(this.f25254y, 0, this.f25253x.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ (-1);
    }

    /* renamed from: U */
    private C11152f m11463U() {
        return new C11152f(mo11467O());
    }

    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: A */
    public C11152f mo11472A() {
        return m11463U().mo11472A();
    }

    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: C */
    public C11152f mo11471C() {
        return m11463U().mo11471C();
    }

    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: F */
    public int mo11470F() {
        return this.f25254y[this.f25253x.length - 1];
    }

    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: J */
    public C11152f mo11469J(int i, int i2) {
        return m11463U().mo11469J(i, i2);
    }

    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: M */
    public C11152f mo11468M() {
        return m11463U().mo11468M();
    }

    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: O */
    public byte[] mo11467O() {
        int[] iArr = this.f25254y;
        byte[][] bArr = this.f25253x;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f25254y;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f25253x[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: P */
    public String mo11466P() {
        return m11463U().mo11466P();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: Q */
    public void mo11465Q(C11146c c11146c) {
        int length = this.f25253x.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f25254y;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C11166o c11166o = new C11166o(this.f25253x[i], i3, (i3 + i4) - i2, true, false);
            C11166o c11166o2 = c11146c.f25205c;
            if (c11166o2 == null) {
                c11166o.f25250g = c11166o;
                c11166o.f25249f = c11166o;
                c11146c.f25205c = c11166o;
            } else {
                c11166o2.f25250g.m11479c(c11166o);
            }
            i++;
            i2 = i4;
        }
        c11146c.f25206d += i2;
    }

    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: a */
    public String mo11462a() {
        return m11463U().mo11462a();
    }

    @Override // p425j.p429b.p433b.C11152f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11152f) {
            C11152f c11152f = (C11152f) obj;
            if (c11152f.mo11470F() == mo11470F() && mo11457y(0, c11152f, 0, mo11470F())) {
                return true;
            }
        }
        return false;
    }

    @Override // p425j.p429b.p433b.C11152f
    public int hashCode() {
        int i = this.f25219d;
        if (i != 0) {
            return i;
        }
        int length = this.f25253x.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f25253x[i2];
            int[] iArr = this.f25254y;
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
        this.f25219d = i4;
        return i4;
    }

    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: p */
    public byte mo11461p(int i) {
        C11173u.m11454b(this.f25254y[this.f25253x.length - 1], i, 1L);
        int m11464S = m11464S(i);
        int i2 = m11464S == 0 ? 0 : this.f25254y[m11464S - 1];
        int[] iArr = this.f25254y;
        byte[][] bArr = this.f25253x;
        return bArr[m11464S][(i - i2) + iArr[bArr.length + m11464S]];
    }

    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: q */
    public String mo11460q() {
        return m11463U().mo11460q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: r */
    public byte[] mo11459r() {
        return mo11467O();
    }

    @Override // p425j.p429b.p433b.C11152f
    public String toString() {
        return m11463U().toString();
    }

    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: v */
    public C11152f mo11458v() {
        return m11463U().mo11458v();
    }

    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: y */
    public boolean mo11457y(int i, C11152f c11152f, int i2, int i3) {
        if (i < 0 || i > mo11470F() - i3) {
            return false;
        }
        int m11464S = m11464S(i);
        while (i3 > 0) {
            int i4 = m11464S == 0 ? 0 : this.f25254y[m11464S - 1];
            int min = Math.min(i3, ((this.f25254y[m11464S] - i4) + i4) - i);
            int[] iArr = this.f25254y;
            byte[][] bArr = this.f25253x;
            if (!c11152f.mo11456z(i2, bArr[m11464S], (i - i4) + iArr[bArr.length + m11464S], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            m11464S++;
        }
        return true;
    }

    @Override // p425j.p429b.p433b.C11152f
    /* renamed from: z */
    public boolean mo11456z(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo11470F() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int m11464S = m11464S(i);
        while (i3 > 0) {
            int i4 = m11464S == 0 ? 0 : this.f25254y[m11464S - 1];
            int min = Math.min(i3, ((this.f25254y[m11464S] - i4) + i4) - i);
            int[] iArr = this.f25254y;
            byte[][] bArr2 = this.f25253x;
            if (!C11173u.m11455a(bArr2[m11464S], (i - i4) + iArr[bArr2.length + m11464S], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            m11464S++;
        }
        return true;
    }
}
