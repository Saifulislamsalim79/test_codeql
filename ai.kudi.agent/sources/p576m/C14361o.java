package p576m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Segment.java */
/* renamed from: m.o */
/* loaded from: classes3.dex */
public final class C14361o {

    /* renamed from: a */
    final byte[] f31652a;

    /* renamed from: b */
    int f31653b;

    /* renamed from: c */
    int f31654c;

    /* renamed from: d */
    boolean f31655d;

    /* renamed from: e */
    boolean f31656e;

    /* renamed from: f */
    C14361o f31657f;

    /* renamed from: g */
    C14361o f31658g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14361o() {
        this.f31652a = new byte[8192];
        this.f31656e = true;
        this.f31655d = false;
    }

    /* renamed from: a */
    public final void m1977a() {
        C14361o c14361o = this.f31658g;
        if (c14361o != this) {
            if (c14361o.f31656e) {
                int i = this.f31654c - this.f31653b;
                if (i > (8192 - c14361o.f31654c) + (c14361o.f31655d ? 0 : c14361o.f31653b)) {
                    return;
                }
                m1972f(this.f31658g, i);
                m1976b();
                C14362p.m1971a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final C14361o m1976b() {
        C14361o c14361o = this.f31657f;
        if (c14361o == this) {
            c14361o = null;
        }
        C14361o c14361o2 = this.f31658g;
        c14361o2.f31657f = this.f31657f;
        this.f31657f.f31658g = c14361o2;
        this.f31657f = null;
        this.f31658g = null;
        return c14361o;
    }

    /* renamed from: c */
    public final C14361o m1975c(C14361o c14361o) {
        c14361o.f31658g = this;
        c14361o.f31657f = this.f31657f;
        this.f31657f.f31658g = c14361o;
        this.f31657f = c14361o;
        return c14361o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final C14361o m1974d() {
        this.f31655d = true;
        return new C14361o(this.f31652a, this.f31653b, this.f31654c, true, false);
    }

    /* renamed from: e */
    public final C14361o m1973e(int i) {
        C14361o m1970b;
        if (i > 0 && i <= this.f31654c - this.f31653b) {
            if (i >= 1024) {
                m1970b = m1974d();
            } else {
                m1970b = C14362p.m1970b();
                System.arraycopy(this.f31652a, this.f31653b, m1970b.f31652a, 0, i);
            }
            m1970b.f31654c = m1970b.f31653b + i;
            this.f31653b += i;
            this.f31658g.m1975c(m1970b);
            return m1970b;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final void m1972f(C14361o c14361o, int i) {
        if (c14361o.f31656e) {
            int i2 = c14361o.f31654c;
            if (i2 + i > 8192) {
                if (!c14361o.f31655d) {
                    int i3 = c14361o.f31653b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = c14361o.f31652a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        c14361o.f31654c -= c14361o.f31653b;
                        c14361o.f31653b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f31652a, this.f31653b, c14361o.f31652a, c14361o.f31654c, i);
            c14361o.f31654c += i;
            this.f31653b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14361o(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f31652a = bArr;
        this.f31653b = i;
        this.f31654c = i2;
        this.f31655d = z;
        this.f31656e = z2;
    }
}
