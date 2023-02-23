package p201g.p219f.p223b.p224k.p225m;

import p201g.p219f.p223b.p224k.C7558d;
import p201g.p219f.p223b.p224k.C7561e;
/* compiled from: WidgetRun.java */
/* renamed from: g.f.b.k.m.p */
/* loaded from: classes2.dex */
public abstract class AbstractC7593p implements InterfaceC7577d {

    /* renamed from: a */
    public int f18255a;

    /* renamed from: b */
    C7561e f18256b;

    /* renamed from: c */
    C7588m f18257c;

    /* renamed from: d */
    protected C7561e.EnumC7563b f18258d;

    /* renamed from: e */
    C7581g f18259e = new C7581g(this);

    /* renamed from: f */
    public int f18260f = 0;

    /* renamed from: g */
    boolean f18261g = false;

    /* renamed from: h */
    public C7579f f18262h = new C7579f(this);

    /* renamed from: i */
    public C7579f f18263i = new C7579f(this);

    /* renamed from: j */
    protected EnumC7595b f18264j = EnumC7595b.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetRun.java */
    /* renamed from: g.f.b.k.m.p$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C7594a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18265a;

        static {
            int[] iArr = new int[C7558d.EnumC7560b.values().length];
            f18265a = iArr;
            try {
                iArr[C7558d.EnumC7560b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18265a[C7558d.EnumC7560b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18265a[C7558d.EnumC7560b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18265a[C7558d.EnumC7560b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18265a[C7558d.EnumC7560b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    /* renamed from: g.f.b.k.m.p$b */
    /* loaded from: classes2.dex */
    enum EnumC7595b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC7593p(C7561e c7561e) {
        this.f18256b = c7561e;
    }

    /* renamed from: l */
    private void m18078l(int i, int i2) {
        int i3;
        int i4 = this.f18255a;
        if (i4 == 0) {
            this.f18259e.mo18122d(m18083g(i2, i));
        } else if (i4 == 1) {
            this.f18259e.mo18122d(Math.min(m18083g(this.f18259e.f18238m, i), i2));
        } else if (i4 == 2) {
            C7561e m18288I = this.f18256b.m18288I();
            if (m18288I != null) {
                AbstractC7593p abstractC7593p = i == 0 ? m18288I.f18118d : m18288I.f18120e;
                if (abstractC7593p.f18259e.f18226j) {
                    C7561e c7561e = this.f18256b;
                    this.f18259e.mo18122d(m18083g((int) ((abstractC7593p.f18259e.f18223g * (i == 0 ? c7561e.f18144s : c7561e.f18147v)) + 0.5f), i));
                }
            }
        } else if (i4 != 3) {
        } else {
            C7561e c7561e2 = this.f18256b;
            C7586l c7586l = c7561e2.f18118d;
            C7561e.EnumC7563b enumC7563b = c7586l.f18258d;
            C7561e.EnumC7563b enumC7563b2 = C7561e.EnumC7563b.MATCH_CONSTRAINT;
            if (enumC7563b == enumC7563b2 && c7586l.f18255a == 3) {
                C7589n c7589n = c7561e2.f18120e;
                if (c7589n.f18258d == enumC7563b2 && c7589n.f18255a == 3) {
                    return;
                }
            }
            C7561e c7561e3 = this.f18256b;
            AbstractC7593p abstractC7593p2 = i == 0 ? c7561e3.f18120e : c7561e3.f18118d;
            if (abstractC7593p2.f18259e.f18226j) {
                float m18226t = this.f18256b.m18226t();
                if (i == 1) {
                    i3 = (int) ((abstractC7593p2.f18259e.f18223g / m18226t) + 0.5f);
                } else {
                    i3 = (int) ((m18226t * abstractC7593p2.f18259e.f18223g) + 0.5f);
                }
                this.f18259e.mo18122d(i3);
            }
        }
    }

    @Override // p201g.p219f.p223b.p224k.p225m.InterfaceC7577d
    /* renamed from: a */
    public void mo18089a(InterfaceC7577d interfaceC7577d) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m18088b(C7579f c7579f, C7579f c7579f2, int i) {
        c7579f.f18228l.add(c7579f2);
        c7579f.f18222f = i;
        c7579f2.f18227k.add(c7579f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m18087c(C7579f c7579f, C7579f c7579f2, int i, C7581g c7581g) {
        c7579f.f18228l.add(c7579f2);
        c7579f.f18228l.add(this.f18259e);
        c7579f.f18224h = i;
        c7579f.f18225i = c7581g;
        c7579f2.f18227k.add(c7579f);
        c7581g.f18227k.add(c7579f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo18086d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo18085e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo18084f();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final int m18083g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C7561e c7561e = this.f18256b;
            int i3 = c7561e.f18143r;
            max = Math.max(c7561e.f18142q, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C7561e c7561e2 = this.f18256b;
            int i4 = c7561e2.f18146u;
            max = Math.max(c7561e2.f18145t, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final C7579f m18082h(C7558d c7558d) {
        C7558d c7558d2 = c7558d.f18070f;
        if (c7558d2 == null) {
            return null;
        }
        C7561e c7561e = c7558d2.f18068d;
        int i = C7594a.f18265a[c7558d2.f18069e.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return c7561e.f18120e.f18263i;
                    }
                    return c7561e.f18120e.f18246k;
                }
                return c7561e.f18120e.f18262h;
            }
            return c7561e.f18118d.f18263i;
        }
        return c7561e.f18118d.f18262h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final C7579f m18081i(C7558d c7558d, int i) {
        C7558d c7558d2 = c7558d.f18070f;
        if (c7558d2 == null) {
            return null;
        }
        C7561e c7561e = c7558d2.f18068d;
        AbstractC7593p abstractC7593p = i == 0 ? c7561e.f18118d : c7561e.f18120e;
        int i2 = C7594a.f18265a[c7558d.f18070f.f18069e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC7593p.f18263i;
        }
        return abstractC7593p.f18262h;
    }

    /* renamed from: j */
    public long mo18080j() {
        C7581g c7581g = this.f18259e;
        if (c7581g.f18226j) {
            return c7581g.f18223g;
        }
        return 0L;
    }

    /* renamed from: k */
    public boolean m18079k() {
        return this.f18261g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo18077m();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void m18076n(InterfaceC7577d interfaceC7577d, C7558d c7558d, C7558d c7558d2, int i) {
        C7579f m18082h = m18082h(c7558d);
        C7579f m18082h2 = m18082h(c7558d2);
        if (m18082h.f18226j && m18082h2.f18226j) {
            int m18319e = m18082h.f18223g + c7558d.m18319e();
            int m18319e2 = m18082h2.f18223g - c7558d2.m18319e();
            int i2 = m18319e2 - m18319e;
            if (!this.f18259e.f18226j && this.f18258d == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
                m18078l(i, i2);
            }
            C7581g c7581g = this.f18259e;
            if (c7581g.f18226j) {
                if (c7581g.f18223g == i2) {
                    this.f18262h.mo18122d(m18319e);
                    this.f18263i.mo18122d(m18319e2);
                    return;
                }
                C7561e c7561e = this.f18256b;
                float m18220w = i == 0 ? c7561e.m18220w() : c7561e.m18280M();
                if (m18082h == m18082h2) {
                    m18319e = m18082h.f18223g;
                    m18319e2 = m18082h2.f18223g;
                    m18220w = 0.5f;
                }
                this.f18262h.mo18122d((int) (m18319e + 0.5f + (((m18319e2 - m18319e) - this.f18259e.f18223g) * m18220w)));
                this.f18263i.mo18122d(this.f18262h.f18223g + this.f18259e.f18223g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void m18075o(InterfaceC7577d interfaceC7577d) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void m18074p(InterfaceC7577d interfaceC7577d) {
    }
}
