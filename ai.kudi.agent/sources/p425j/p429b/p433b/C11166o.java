package p425j.p429b.p433b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Segment.java */
/* renamed from: j.b.b.o */
/* loaded from: classes3.dex */
public final class C11166o {

    /* renamed from: a */
    final byte[] f25244a;

    /* renamed from: b */
    int f25245b;

    /* renamed from: c */
    int f25246c;

    /* renamed from: d */
    boolean f25247d;

    /* renamed from: e */
    boolean f25248e;

    /* renamed from: f */
    C11166o f25249f;

    /* renamed from: g */
    C11166o f25250g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11166o() {
        this.f25244a = new byte[8192];
        this.f25248e = true;
        this.f25247d = false;
    }

    /* renamed from: a */
    public final void m11481a() {
        C11166o c11166o = this.f25250g;
        if (c11166o != this) {
            if (c11166o.f25248e) {
                int i = this.f25246c - this.f25245b;
                if (i > (8192 - c11166o.f25246c) + (c11166o.f25247d ? 0 : c11166o.f25245b)) {
                    return;
                }
                m11475g(this.f25250g, i);
                m11480b();
                C11167p.m11474a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final C11166o m11480b() {
        C11166o c11166o = this.f25249f;
        if (c11166o == this) {
            c11166o = null;
        }
        C11166o c11166o2 = this.f25250g;
        c11166o2.f25249f = this.f25249f;
        this.f25249f.f25250g = c11166o2;
        this.f25249f = null;
        this.f25250g = null;
        return c11166o;
    }

    /* renamed from: c */
    public final C11166o m11479c(C11166o c11166o) {
        c11166o.f25250g = this;
        c11166o.f25249f = this.f25249f;
        this.f25249f.f25250g = c11166o;
        this.f25249f = c11166o;
        return c11166o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final C11166o m11478d() {
        this.f25247d = true;
        return new C11166o(this.f25244a, this.f25245b, this.f25246c, true, false);
    }

    /* renamed from: e */
    public final C11166o m11477e(int i) {
        C11166o m11473b;
        if (i > 0 && i <= this.f25246c - this.f25245b) {
            if (i >= 1024) {
                m11473b = m11478d();
            } else {
                m11473b = C11167p.m11473b();
                System.arraycopy(this.f25244a, this.f25245b, m11473b.f25244a, 0, i);
            }
            m11473b.f25246c = m11473b.f25245b + i;
            this.f25245b += i;
            this.f25250g.m11479c(m11473b);
            return m11473b;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final C11166o m11476f() {
        return new C11166o((byte[]) this.f25244a.clone(), this.f25245b, this.f25246c, false, true);
    }

    /* renamed from: g */
    public final void m11475g(C11166o c11166o, int i) {
        if (c11166o.f25248e) {
            int i2 = c11166o.f25246c;
            if (i2 + i > 8192) {
                if (!c11166o.f25247d) {
                    int i3 = c11166o.f25245b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = c11166o.f25244a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        c11166o.f25246c -= c11166o.f25245b;
                        c11166o.f25245b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f25244a, this.f25245b, c11166o.f25244a, c11166o.f25246c, i);
            c11166o.f25246c += i;
            this.f25245b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11166o(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f25244a = bArr;
        this.f25245b = i;
        this.f25246c = i2;
        this.f25247d = z;
        this.f25248e = z2;
    }
}
