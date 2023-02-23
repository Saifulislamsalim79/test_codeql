package p201g.p219f.p223b;

import java.util.ArrayList;
import p201g.p219f.p223b.C7543d;
import p201g.p219f.p223b.C7552i;
/* compiled from: ArrayRow.java */
/* renamed from: g.f.b.b */
/* loaded from: classes2.dex */
public class C7540b implements C7543d.InterfaceC7544a {

    /* renamed from: c */
    boolean f17935c;

    /* renamed from: e */
    public InterfaceC7541a f17937e;

    /* renamed from: a */
    C7552i f17933a = null;

    /* renamed from: b */
    float f17934b = 0.0f;

    /* renamed from: d */
    ArrayList<C7552i> f17936d = new ArrayList<>();

    /* renamed from: f */
    boolean f17938f = false;

    /* compiled from: ArrayRow.java */
    /* renamed from: g.f.b.b$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC7541a {
        /* renamed from: a */
        int mo18355a();

        /* renamed from: b */
        C7552i mo18354b(int i);

        /* renamed from: c */
        void mo18353c();

        void clear();

        /* renamed from: d */
        float mo18352d(int i);

        /* renamed from: e */
        void mo18351e(C7552i c7552i, float f, boolean z);

        /* renamed from: f */
        float mo18350f(C7552i c7552i);

        /* renamed from: g */
        boolean mo18349g(C7552i c7552i);

        /* renamed from: h */
        float mo18348h(C7540b c7540b, boolean z);

        /* renamed from: i */
        void mo18347i(C7552i c7552i, float f);

        /* renamed from: j */
        float mo18346j(C7552i c7552i, boolean z);

        /* renamed from: k */
        void mo18345k(float f);
    }

    public C7540b() {
    }

    /* renamed from: u */
    private boolean m18415u(C7552i c7552i, C7543d c7543d) {
        return c7552i.f18018m <= 1;
    }

    /* renamed from: w */
    private C7552i m18413w(boolean[] zArr, C7552i c7552i) {
        C7552i.EnumC7553a enumC7553a;
        int mo18355a = this.f17937e.mo18355a();
        C7552i c7552i2 = null;
        float f = 0.0f;
        for (int i = 0; i < mo18355a; i++) {
            float mo18352d = this.f17937e.mo18352d(i);
            if (mo18352d < 0.0f) {
                C7552i mo18354b = this.f17937e.mo18354b(i);
                if ((zArr == null || !zArr[mo18354b.f18008c]) && mo18354b != c7552i && (((enumC7553a = mo18354b.f18015j) == C7552i.EnumC7553a.SLACK || enumC7553a == C7552i.EnumC7553a.ERROR) && mo18352d < f)) {
                    f = mo18352d;
                    c7552i2 = mo18354b;
                }
            }
        }
        return c7552i2;
    }

    /* renamed from: A */
    public void m18435A(C7543d c7543d, C7552i c7552i, boolean z) {
        if (c7552i.f18012g) {
            this.f17934b += c7552i.f18011f * this.f17937e.mo18350f(c7552i);
            this.f17937e.mo18346j(c7552i, z);
            if (z) {
                c7552i.m18360c(this);
            }
            if (C7543d.f17945t && c7552i != null && this.f17937e.mo18355a() == 0) {
                this.f17938f = true;
                c7543d.f17952a = true;
            }
        }
    }

    /* renamed from: B */
    public void mo18374B(C7543d c7543d, C7540b c7540b, boolean z) {
        this.f17934b += c7540b.f17934b * this.f17937e.mo18348h(c7540b, z);
        if (z) {
            c7540b.f17933a.m18360c(this);
        }
        if (C7543d.f17945t && this.f17933a != null && this.f17937e.mo18355a() == 0) {
            this.f17938f = true;
            c7543d.f17952a = true;
        }
    }

    /* renamed from: C */
    public void m18434C(C7543d c7543d, C7552i c7552i, boolean z) {
        if (c7552i.f18019n) {
            float mo18350f = this.f17937e.mo18350f(c7552i);
            this.f17934b += c7552i.f18021p * mo18350f;
            this.f17937e.mo18346j(c7552i, z);
            if (z) {
                c7552i.m18360c(this);
            }
            this.f17937e.mo18351e(c7543d.f17965n.f17942d[c7552i.f18020o], mo18350f, z);
            if (C7543d.f17945t && c7552i != null && this.f17937e.mo18355a() == 0) {
                this.f17938f = true;
                c7543d.f17952a = true;
            }
        }
    }

    /* renamed from: D */
    public void m18433D(C7543d c7543d) {
        if (c7543d.f17958g.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int mo18355a = this.f17937e.mo18355a();
            for (int i = 0; i < mo18355a; i++) {
                C7552i mo18354b = this.f17937e.mo18354b(i);
                if (mo18354b.f18009d != -1 || mo18354b.f18012g || mo18354b.f18019n) {
                    this.f17936d.add(mo18354b);
                }
            }
            int size = this.f17936d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    C7552i c7552i = this.f17936d.get(i2);
                    if (c7552i.f18012g) {
                        m18435A(c7543d, c7552i, true);
                    } else if (c7552i.f18019n) {
                        m18434C(c7543d, c7552i, true);
                    } else {
                        mo18374B(c7543d, c7543d.f17958g[c7552i.f18009d], true);
                    }
                }
                this.f17936d.clear();
            } else {
                z = true;
            }
        }
        if (C7543d.f17945t && this.f17933a != null && this.f17937e.mo18355a() == 0) {
            this.f17938f = true;
            c7543d.f17952a = true;
        }
    }

    @Override // p201g.p219f.p223b.C7543d.InterfaceC7544a
    /* renamed from: a */
    public void mo18370a(C7552i c7552i) {
        int i = c7552i.f18010e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f17937e.mo18347i(c7552i, f);
    }

    @Override // p201g.p219f.p223b.C7543d.InterfaceC7544a
    /* renamed from: b */
    public C7552i mo18369b(C7543d c7543d, boolean[] zArr) {
        return m18413w(zArr, null);
    }

    @Override // p201g.p219f.p223b.C7543d.InterfaceC7544a
    /* renamed from: c */
    public void mo18378c(C7543d.InterfaceC7544a interfaceC7544a) {
        if (interfaceC7544a instanceof C7540b) {
            C7540b c7540b = (C7540b) interfaceC7544a;
            this.f17933a = null;
            this.f17937e.clear();
            for (int i = 0; i < c7540b.f17937e.mo18355a(); i++) {
                this.f17937e.mo18351e(c7540b.f17937e.mo18354b(i), c7540b.f17937e.mo18352d(i), true);
            }
        }
    }

    @Override // p201g.p219f.p223b.C7543d.InterfaceC7544a
    public void clear() {
        this.f17937e.clear();
        this.f17933a = null;
        this.f17934b = 0.0f;
    }

    /* renamed from: d */
    public C7540b m18432d(C7543d c7543d, int i) {
        this.f17937e.mo18347i(c7543d.m18390o(i, "ep"), 1.0f);
        this.f17937e.mo18347i(c7543d.m18390o(i, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C7540b m18431e(C7552i c7552i, int i) {
        this.f17937e.mo18347i(c7552i, i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m18430f(C7543d c7543d) {
        boolean z;
        C7552i m18429g = m18429g(c7543d);
        if (m18429g == null) {
            z = true;
        } else {
            m18412x(m18429g);
            z = false;
        }
        if (this.f17937e.mo18355a() == 0) {
            this.f17938f = true;
        }
        return z;
    }

    /* renamed from: g */
    C7552i m18429g(C7543d c7543d) {
        boolean m18415u;
        boolean m18415u2;
        int mo18355a = this.f17937e.mo18355a();
        C7552i c7552i = null;
        C7552i c7552i2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < mo18355a; i++) {
            float mo18352d = this.f17937e.mo18352d(i);
            C7552i mo18354b = this.f17937e.mo18354b(i);
            if (mo18354b.f18015j == C7552i.EnumC7553a.UNRESTRICTED) {
                if (c7552i == null) {
                    m18415u2 = m18415u(mo18354b, c7543d);
                } else if (f > mo18352d) {
                    m18415u2 = m18415u(mo18354b, c7543d);
                } else if (!z && m18415u(mo18354b, c7543d)) {
                    f = mo18352d;
                    c7552i = mo18354b;
                    z = true;
                }
                z = m18415u2;
                f = mo18352d;
                c7552i = mo18354b;
            } else if (c7552i == null && mo18352d < 0.0f) {
                if (c7552i2 == null) {
                    m18415u = m18415u(mo18354b, c7543d);
                } else if (f2 > mo18352d) {
                    m18415u = m18415u(mo18354b, c7543d);
                } else if (!z2 && m18415u(mo18354b, c7543d)) {
                    f2 = mo18352d;
                    c7552i2 = mo18354b;
                    z2 = true;
                }
                z2 = m18415u;
                f2 = mo18352d;
                c7552i2 = mo18354b;
            }
        }
        return c7552i != null ? c7552i : c7552i2;
    }

    @Override // p201g.p219f.p223b.C7543d.InterfaceC7544a
    public C7552i getKey() {
        return this.f17933a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C7540b m18428h(C7552i c7552i, C7552i c7552i2, int i, float f, C7552i c7552i3, C7552i c7552i4, int i2) {
        if (c7552i2 == c7552i3) {
            this.f17937e.mo18347i(c7552i, 1.0f);
            this.f17937e.mo18347i(c7552i4, 1.0f);
            this.f17937e.mo18347i(c7552i2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f17937e.mo18347i(c7552i, 1.0f);
            this.f17937e.mo18347i(c7552i2, -1.0f);
            this.f17937e.mo18347i(c7552i3, -1.0f);
            this.f17937e.mo18347i(c7552i4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f17934b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.f17937e.mo18347i(c7552i, -1.0f);
            this.f17937e.mo18347i(c7552i2, 1.0f);
            this.f17934b = i;
        } else if (f >= 1.0f) {
            this.f17937e.mo18347i(c7552i4, -1.0f);
            this.f17937e.mo18347i(c7552i3, 1.0f);
            this.f17934b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.f17937e.mo18347i(c7552i, f2 * 1.0f);
            this.f17937e.mo18347i(c7552i2, f2 * (-1.0f));
            this.f17937e.mo18347i(c7552i3, (-1.0f) * f);
            this.f17937e.mo18347i(c7552i4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f17934b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C7540b m18427i(C7552i c7552i, int i) {
        this.f17933a = c7552i;
        float f = i;
        c7552i.f18011f = f;
        this.f17934b = f;
        this.f17938f = true;
        return this;
    }

    @Override // p201g.p219f.p223b.C7543d.InterfaceC7544a
    public boolean isEmpty() {
        return this.f17933a == null && this.f17934b == 0.0f && this.f17937e.mo18355a() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C7540b m18426j(C7552i c7552i, C7552i c7552i2, float f) {
        this.f17937e.mo18347i(c7552i, -1.0f);
        this.f17937e.mo18347i(c7552i2, f);
        return this;
    }

    /* renamed from: k */
    public C7540b m18425k(C7552i c7552i, C7552i c7552i2, C7552i c7552i3, C7552i c7552i4, float f) {
        this.f17937e.mo18347i(c7552i, -1.0f);
        this.f17937e.mo18347i(c7552i2, 1.0f);
        this.f17937e.mo18347i(c7552i3, f);
        this.f17937e.mo18347i(c7552i4, -f);
        return this;
    }

    /* renamed from: l */
    public C7540b m18424l(float f, float f2, float f3, C7552i c7552i, C7552i c7552i2, C7552i c7552i3, C7552i c7552i4) {
        this.f17934b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f17937e.mo18347i(c7552i, 1.0f);
            this.f17937e.mo18347i(c7552i2, -1.0f);
            this.f17937e.mo18347i(c7552i4, 1.0f);
            this.f17937e.mo18347i(c7552i3, -1.0f);
        } else if (f == 0.0f) {
            this.f17937e.mo18347i(c7552i, 1.0f);
            this.f17937e.mo18347i(c7552i2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f17937e.mo18347i(c7552i3, 1.0f);
            this.f17937e.mo18347i(c7552i4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f17937e.mo18347i(c7552i, 1.0f);
            this.f17937e.mo18347i(c7552i2, -1.0f);
            this.f17937e.mo18347i(c7552i4, f4);
            this.f17937e.mo18347i(c7552i3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public C7540b m18423m(C7552i c7552i, int i) {
        if (i < 0) {
            this.f17934b = i * (-1);
            this.f17937e.mo18347i(c7552i, 1.0f);
        } else {
            this.f17934b = i;
            this.f17937e.mo18347i(c7552i, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C7540b m18422n(C7552i c7552i, C7552i c7552i2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f17934b = i;
        }
        if (!z) {
            this.f17937e.mo18347i(c7552i, -1.0f);
            this.f17937e.mo18347i(c7552i2, 1.0f);
        } else {
            this.f17937e.mo18347i(c7552i, 1.0f);
            this.f17937e.mo18347i(c7552i2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C7540b m18421o(C7552i c7552i, C7552i c7552i2, C7552i c7552i3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f17934b = i;
        }
        if (!z) {
            this.f17937e.mo18347i(c7552i, -1.0f);
            this.f17937e.mo18347i(c7552i2, 1.0f);
            this.f17937e.mo18347i(c7552i3, 1.0f);
        } else {
            this.f17937e.mo18347i(c7552i, 1.0f);
            this.f17937e.mo18347i(c7552i2, -1.0f);
            this.f17937e.mo18347i(c7552i3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C7540b m18420p(C7552i c7552i, C7552i c7552i2, C7552i c7552i3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f17934b = i;
        }
        if (!z) {
            this.f17937e.mo18347i(c7552i, -1.0f);
            this.f17937e.mo18347i(c7552i2, 1.0f);
            this.f17937e.mo18347i(c7552i3, -1.0f);
        } else {
            this.f17937e.mo18347i(c7552i, 1.0f);
            this.f17937e.mo18347i(c7552i2, -1.0f);
            this.f17937e.mo18347i(c7552i3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C7540b m18419q(C7552i c7552i, C7552i c7552i2, C7552i c7552i3, C7552i c7552i4, float f) {
        this.f17937e.mo18347i(c7552i3, 0.5f);
        this.f17937e.mo18347i(c7552i4, 0.5f);
        this.f17937e.mo18347i(c7552i, -0.5f);
        this.f17937e.mo18347i(c7552i2, -0.5f);
        this.f17934b = -f;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m18418r() {
        float f = this.f17934b;
        if (f < 0.0f) {
            this.f17934b = f * (-1.0f);
            this.f17937e.mo18353c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m18417s() {
        C7552i c7552i = this.f17933a;
        return c7552i != null && (c7552i.f18015j == C7552i.EnumC7553a.UNRESTRICTED || this.f17934b >= 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m18416t(C7552i c7552i) {
        return this.f17937e.mo18349g(c7552i);
    }

    public String toString() {
        return m18410z();
    }

    /* renamed from: v */
    public C7552i m18414v(C7552i c7552i) {
        return m18413w(null, c7552i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m18412x(C7552i c7552i) {
        C7552i c7552i2 = this.f17933a;
        if (c7552i2 != null) {
            this.f17937e.mo18347i(c7552i2, -1.0f);
            this.f17933a.f18009d = -1;
            this.f17933a = null;
        }
        float mo18346j = this.f17937e.mo18346j(c7552i, true) * (-1.0f);
        this.f17933a = c7552i;
        if (mo18346j == 1.0f) {
            return;
        }
        this.f17934b /= mo18346j;
        this.f17937e.mo18345k(mo18346j);
    }

    /* renamed from: y */
    public void m18411y() {
        this.f17933a = null;
        this.f17937e.clear();
        this.f17934b = 0.0f;
        this.f17938f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String m18410z() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p219f.p223b.C7540b.m18410z():java.lang.String");
    }

    public C7540b(C7542c c7542c) {
        this.f17937e = new C7539a(this, c7542c);
    }
}
