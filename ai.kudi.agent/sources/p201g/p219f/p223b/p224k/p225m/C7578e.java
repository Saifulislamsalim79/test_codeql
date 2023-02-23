package p201g.p219f.p223b.p224k.p225m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p201g.p219f.p223b.p224k.C7558d;
import p201g.p219f.p223b.p224k.C7561e;
import p201g.p219f.p223b.p224k.C7564f;
import p201g.p219f.p223b.p224k.C7565g;
import p201g.p219f.p223b.p224k.C7568i;
import p201g.p219f.p223b.p224k.p225m.C7573b;
/* compiled from: DependencyGraph.java */
/* renamed from: g.f.b.k.m.e */
/* loaded from: classes2.dex */
public class C7578e {

    /* renamed from: a */
    private C7564f f18209a;

    /* renamed from: d */
    private C7564f f18212d;

    /* renamed from: f */
    private C7573b.InterfaceC7575b f18214f;

    /* renamed from: g */
    private C7573b.C7574a f18215g;

    /* renamed from: h */
    ArrayList<C7588m> f18216h;

    /* renamed from: b */
    private boolean f18210b = true;

    /* renamed from: c */
    private boolean f18211c = true;

    /* renamed from: e */
    private ArrayList<AbstractC7593p> f18213e = new ArrayList<>();

    public C7578e(C7564f c7564f) {
        new ArrayList();
        this.f18214f = null;
        this.f18215g = new C7573b.C7574a();
        this.f18216h = new ArrayList<>();
        this.f18209a = c7564f;
        this.f18212d = c7564f;
    }

    /* renamed from: a */
    private void m18138a(C7579f c7579f, int i, int i2, C7579f c7579f2, ArrayList<C7588m> arrayList, C7588m c7588m) {
        AbstractC7593p abstractC7593p = c7579f.f18220d;
        if (abstractC7593p.f18257c == null) {
            C7564f c7564f = this.f18209a;
            if (abstractC7593p == c7564f.f18118d || abstractC7593p == c7564f.f18120e) {
                return;
            }
            if (c7588m == null) {
                c7588m = new C7588m(abstractC7593p, i2);
                arrayList.add(c7588m);
            }
            abstractC7593p.f18257c = c7588m;
            c7588m.m18104a(abstractC7593p);
            for (InterfaceC7577d interfaceC7577d : abstractC7593p.f18262h.f18227k) {
                if (interfaceC7577d instanceof C7579f) {
                    m18138a((C7579f) interfaceC7577d, i, 0, c7579f2, arrayList, c7588m);
                }
            }
            for (InterfaceC7577d interfaceC7577d2 : abstractC7593p.f18263i.f18227k) {
                if (interfaceC7577d2 instanceof C7579f) {
                    m18138a((C7579f) interfaceC7577d2, i, 1, c7579f2, arrayList, c7588m);
                }
            }
            if (i == 1 && (abstractC7593p instanceof C7589n)) {
                for (InterfaceC7577d interfaceC7577d3 : ((C7589n) abstractC7593p).f18246k.f18227k) {
                    if (interfaceC7577d3 instanceof C7579f) {
                        m18138a((C7579f) interfaceC7577d3, i, 2, c7579f2, arrayList, c7588m);
                    }
                }
            }
            for (C7579f c7579f3 : abstractC7593p.f18262h.f18228l) {
                if (c7579f3 == c7579f2) {
                    c7588m.f18243a = true;
                }
                m18138a(c7579f3, i, 0, c7579f2, arrayList, c7588m);
            }
            for (C7579f c7579f4 : abstractC7593p.f18263i.f18228l) {
                if (c7579f4 == c7579f2) {
                    c7588m.f18243a = true;
                }
                m18138a(c7579f4, i, 1, c7579f2, arrayList, c7588m);
            }
            if (i == 1 && (abstractC7593p instanceof C7589n)) {
                for (C7579f c7579f5 : ((C7589n) abstractC7593p).f18246k.f18228l) {
                    m18138a(c7579f5, i, 2, c7579f2, arrayList, c7588m);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m18137b(C7564f c7564f) {
        int i;
        int i2;
        int i3;
        Iterator<C7561e> it = c7564f.f18190p0.iterator();
        while (it.hasNext()) {
            C7561e next = it.next();
            C7561e.EnumC7563b[] enumC7563bArr = next.f18102Q;
            C7561e.EnumC7563b enumC7563b = enumC7563bArr[0];
            C7561e.EnumC7563b enumC7563b2 = enumC7563bArr[1];
            if (next.m18272Q() == 8) {
                next.f18112a = true;
            } else {
                if (next.f18144s < 1.0f && enumC7563b == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
                    next.f18138n = 2;
                }
                if (next.f18147v < 1.0f && enumC7563b2 == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
                    next.f18140o = 2;
                }
                if (next.m18226t() > 0.0f) {
                    if (enumC7563b == C7561e.EnumC7563b.MATCH_CONSTRAINT && (enumC7563b2 == C7561e.EnumC7563b.WRAP_CONTENT || enumC7563b2 == C7561e.EnumC7563b.FIXED)) {
                        next.f18138n = 3;
                    } else if (enumC7563b2 == C7561e.EnumC7563b.MATCH_CONSTRAINT && (enumC7563b == C7561e.EnumC7563b.WRAP_CONTENT || enumC7563b == C7561e.EnumC7563b.FIXED)) {
                        next.f18140o = 3;
                    } else {
                        C7561e.EnumC7563b enumC7563b3 = C7561e.EnumC7563b.MATCH_CONSTRAINT;
                        if (enumC7563b == enumC7563b3 && enumC7563b2 == enumC7563b3) {
                            if (next.f18138n == 0) {
                                next.f18138n = 3;
                            }
                            if (next.f18140o == 0) {
                                next.f18140o = 3;
                            }
                        }
                    }
                }
                if (enumC7563b == C7561e.EnumC7563b.MATCH_CONSTRAINT && next.f18138n == 1 && (next.f18091F.f18070f == null || next.f18093H.f18070f == null)) {
                    enumC7563b = C7561e.EnumC7563b.WRAP_CONTENT;
                }
                C7561e.EnumC7563b enumC7563b4 = enumC7563b;
                if (enumC7563b2 == C7561e.EnumC7563b.MATCH_CONSTRAINT && next.f18140o == 1 && (next.f18092G.f18070f == null || next.f18094I.f18070f == null)) {
                    enumC7563b2 = C7561e.EnumC7563b.WRAP_CONTENT;
                }
                C7561e.EnumC7563b enumC7563b5 = enumC7563b2;
                C7586l c7586l = next.f18118d;
                c7586l.f18258d = enumC7563b4;
                c7586l.f18255a = next.f18138n;
                C7589n c7589n = next.f18120e;
                c7589n.f18258d = enumC7563b5;
                c7589n.f18255a = next.f18140o;
                if ((enumC7563b4 != C7561e.EnumC7563b.MATCH_PARENT && enumC7563b4 != C7561e.EnumC7563b.FIXED && enumC7563b4 != C7561e.EnumC7563b.WRAP_CONTENT) || (enumC7563b5 != C7561e.EnumC7563b.MATCH_PARENT && enumC7563b5 != C7561e.EnumC7563b.FIXED && enumC7563b5 != C7561e.EnumC7563b.WRAP_CONTENT)) {
                    if (enumC7563b4 == C7561e.EnumC7563b.MATCH_CONSTRAINT && (enumC7563b5 == C7561e.EnumC7563b.WRAP_CONTENT || enumC7563b5 == C7561e.EnumC7563b.FIXED)) {
                        int i4 = next.f18138n;
                        if (i4 == 3) {
                            C7561e.EnumC7563b enumC7563b6 = C7561e.EnumC7563b.WRAP_CONTENT;
                            if (enumC7563b5 == enumC7563b6) {
                                m18127l(next, enumC7563b6, 0, enumC7563b6, 0);
                            }
                            int m18222v = next.m18222v();
                            C7561e.EnumC7563b enumC7563b7 = C7561e.EnumC7563b.FIXED;
                            m18127l(next, enumC7563b7, (int) ((m18222v * next.f18106U) + 0.5f), enumC7563b7, m18222v);
                            next.f18118d.f18259e.mo18122d(next.m18270R());
                            next.f18120e.f18259e.mo18122d(next.m18222v());
                            next.f18112a = true;
                        } else if (i4 == 1) {
                            m18127l(next, C7561e.EnumC7563b.WRAP_CONTENT, 0, enumC7563b5, 0);
                            next.f18118d.f18259e.f18238m = next.m18270R();
                        } else if (i4 == 2) {
                            C7561e.EnumC7563b[] enumC7563bArr2 = c7564f.f18102Q;
                            if (enumC7563bArr2[0] == C7561e.EnumC7563b.FIXED || enumC7563bArr2[0] == C7561e.EnumC7563b.MATCH_PARENT) {
                                m18127l(next, C7561e.EnumC7563b.FIXED, (int) ((next.f18144s * c7564f.m18270R()) + 0.5f), enumC7563b5, next.m18222v());
                                next.f18118d.f18259e.mo18122d(next.m18270R());
                                next.f18120e.f18259e.mo18122d(next.m18222v());
                                next.f18112a = true;
                            }
                        } else {
                            C7558d[] c7558dArr = next.f18099N;
                            if (c7558dArr[0].f18070f == null || c7558dArr[1].f18070f == null) {
                                m18127l(next, C7561e.EnumC7563b.WRAP_CONTENT, 0, enumC7563b5, 0);
                                next.f18118d.f18259e.mo18122d(next.m18270R());
                                next.f18120e.f18259e.mo18122d(next.m18222v());
                                next.f18112a = true;
                            }
                        }
                    }
                    if (enumC7563b5 == C7561e.EnumC7563b.MATCH_CONSTRAINT && (enumC7563b4 == C7561e.EnumC7563b.WRAP_CONTENT || enumC7563b4 == C7561e.EnumC7563b.FIXED)) {
                        int i5 = next.f18140o;
                        if (i5 == 3) {
                            C7561e.EnumC7563b enumC7563b8 = C7561e.EnumC7563b.WRAP_CONTENT;
                            if (enumC7563b4 == enumC7563b8) {
                                m18127l(next, enumC7563b8, 0, enumC7563b8, 0);
                            }
                            int m18270R = next.m18270R();
                            float f = next.f18106U;
                            if (next.m18224u() == -1) {
                                f = 1.0f / f;
                            }
                            C7561e.EnumC7563b enumC7563b9 = C7561e.EnumC7563b.FIXED;
                            m18127l(next, enumC7563b9, m18270R, enumC7563b9, (int) ((m18270R * f) + 0.5f));
                            next.f18118d.f18259e.mo18122d(next.m18270R());
                            next.f18120e.f18259e.mo18122d(next.m18222v());
                            next.f18112a = true;
                        } else if (i5 == 1) {
                            m18127l(next, enumC7563b4, 0, C7561e.EnumC7563b.WRAP_CONTENT, 0);
                            next.f18120e.f18259e.f18238m = next.m18222v();
                        } else if (i5 == 2) {
                            C7561e.EnumC7563b[] enumC7563bArr3 = c7564f.f18102Q;
                            if (enumC7563bArr3[1] == C7561e.EnumC7563b.FIXED || enumC7563bArr3[1] == C7561e.EnumC7563b.MATCH_PARENT) {
                                m18127l(next, enumC7563b4, next.m18270R(), C7561e.EnumC7563b.FIXED, (int) ((next.f18147v * c7564f.m18222v()) + 0.5f));
                                next.f18118d.f18259e.mo18122d(next.m18270R());
                                next.f18120e.f18259e.mo18122d(next.m18222v());
                                next.f18112a = true;
                            }
                        } else {
                            C7558d[] c7558dArr2 = next.f18099N;
                            if (c7558dArr2[2].f18070f == null || c7558dArr2[3].f18070f == null) {
                                m18127l(next, C7561e.EnumC7563b.WRAP_CONTENT, 0, enumC7563b5, 0);
                                next.f18118d.f18259e.mo18122d(next.m18270R());
                                next.f18120e.f18259e.mo18122d(next.m18222v());
                                next.f18112a = true;
                            }
                        }
                    }
                    C7561e.EnumC7563b enumC7563b10 = C7561e.EnumC7563b.MATCH_CONSTRAINT;
                    if (enumC7563b4 == enumC7563b10 && enumC7563b5 == enumC7563b10) {
                        int i6 = next.f18138n;
                        if (i6 == 1 || (i3 = next.f18140o) == 1) {
                            C7561e.EnumC7563b enumC7563b11 = C7561e.EnumC7563b.WRAP_CONTENT;
                            m18127l(next, enumC7563b11, 0, enumC7563b11, 0);
                            next.f18118d.f18259e.f18238m = next.m18270R();
                            next.f18120e.f18259e.f18238m = next.m18222v();
                        } else if (i3 == 2 && i6 == 2) {
                            C7561e.EnumC7563b[] enumC7563bArr4 = c7564f.f18102Q;
                            C7561e.EnumC7563b enumC7563b12 = enumC7563bArr4[0];
                            C7561e.EnumC7563b enumC7563b13 = C7561e.EnumC7563b.FIXED;
                            if (enumC7563b12 == enumC7563b13 || enumC7563bArr4[0] == enumC7563b13) {
                                C7561e.EnumC7563b[] enumC7563bArr5 = c7564f.f18102Q;
                                C7561e.EnumC7563b enumC7563b14 = enumC7563bArr5[1];
                                C7561e.EnumC7563b enumC7563b15 = C7561e.EnumC7563b.FIXED;
                                if (enumC7563b14 == enumC7563b15 || enumC7563bArr5[1] == enumC7563b15) {
                                    float f2 = next.f18144s;
                                    float f3 = next.f18147v;
                                    C7561e.EnumC7563b enumC7563b16 = C7561e.EnumC7563b.FIXED;
                                    m18127l(next, enumC7563b16, (int) ((f2 * c7564f.m18270R()) + 0.5f), enumC7563b16, (int) ((f3 * c7564f.m18222v()) + 0.5f));
                                    next.f18118d.f18259e.mo18122d(next.m18270R());
                                    next.f18120e.f18259e.mo18122d(next.m18222v());
                                    next.f18112a = true;
                                }
                            }
                        }
                    }
                } else {
                    int m18270R2 = next.m18270R();
                    if (enumC7563b4 == C7561e.EnumC7563b.MATCH_PARENT) {
                        i = (c7564f.m18270R() - next.f18091F.f18071g) - next.f18093H.f18071g;
                        enumC7563b4 = C7561e.EnumC7563b.FIXED;
                    } else {
                        i = m18270R2;
                    }
                    int m18222v2 = next.m18222v();
                    if (enumC7563b5 == C7561e.EnumC7563b.MATCH_PARENT) {
                        i2 = (c7564f.m18222v() - next.f18092G.f18071g) - next.f18094I.f18071g;
                        enumC7563b5 = C7561e.EnumC7563b.FIXED;
                    } else {
                        i2 = m18222v2;
                    }
                    m18127l(next, enumC7563b4, i, enumC7563b5, i2);
                    next.f18118d.f18259e.mo18122d(next.m18270R());
                    next.f18120e.f18259e.mo18122d(next.m18222v());
                    next.f18112a = true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private int m18134e(C7564f c7564f, int i) {
        int size = this.f18216h.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f18216h.get(i2).m18103b(c7564f, i));
        }
        return (int) j;
    }

    /* renamed from: i */
    private void m18130i(AbstractC7593p abstractC7593p, int i, ArrayList<C7588m> arrayList) {
        for (InterfaceC7577d interfaceC7577d : abstractC7593p.f18262h.f18227k) {
            if (interfaceC7577d instanceof C7579f) {
                m18138a((C7579f) interfaceC7577d, i, 0, abstractC7593p.f18263i, arrayList, null);
            } else if (interfaceC7577d instanceof AbstractC7593p) {
                m18138a(((AbstractC7593p) interfaceC7577d).f18262h, i, 0, abstractC7593p.f18263i, arrayList, null);
            }
        }
        for (InterfaceC7577d interfaceC7577d2 : abstractC7593p.f18263i.f18227k) {
            if (interfaceC7577d2 instanceof C7579f) {
                m18138a((C7579f) interfaceC7577d2, i, 1, abstractC7593p.f18262h, arrayList, null);
            } else if (interfaceC7577d2 instanceof AbstractC7593p) {
                m18138a(((AbstractC7593p) interfaceC7577d2).f18263i, i, 1, abstractC7593p.f18262h, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC7577d interfaceC7577d3 : ((C7589n) abstractC7593p).f18246k.f18227k) {
                if (interfaceC7577d3 instanceof C7579f) {
                    m18138a((C7579f) interfaceC7577d3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m18127l(C7561e c7561e, C7561e.EnumC7563b enumC7563b, int i, C7561e.EnumC7563b enumC7563b2, int i2) {
        C7573b.C7574a c7574a = this.f18215g;
        c7574a.f18197a = enumC7563b;
        c7574a.f18198b = enumC7563b2;
        c7574a.f18199c = i;
        c7574a.f18200d = i2;
        this.f18214f.mo18142b(c7561e, c7574a);
        c7561e.m18263U0(this.f18215g.f18201e);
        c7561e.m18221v0(this.f18215g.f18202f);
        c7561e.m18223u0(this.f18215g.f18204h);
        c7561e.m18242k0(this.f18215g.f18203g);
    }

    /* renamed from: c */
    public void m18136c() {
        m18135d(this.f18213e);
        this.f18216h.clear();
        C7588m.f18242d = 0;
        m18130i(this.f18209a.f18118d, 0, this.f18216h);
        m18130i(this.f18209a.f18120e, 1, this.f18216h);
        this.f18210b = false;
    }

    /* renamed from: d */
    public void m18135d(ArrayList<AbstractC7593p> arrayList) {
        arrayList.clear();
        this.f18212d.f18118d.mo18084f();
        this.f18212d.f18120e.mo18084f();
        arrayList.add(this.f18212d.f18118d);
        arrayList.add(this.f18212d.f18120e);
        Iterator<C7561e> it = this.f18212d.f18190p0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C7561e next = it.next();
            if (next instanceof C7565g) {
                arrayList.add(new C7584j(next));
            } else {
                if (next.m18255Z()) {
                    if (next.f18114b == null) {
                        next.f18114b = new C7576c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f18114b);
                } else {
                    arrayList.add(next.f18118d);
                }
                if (next.m18253b0()) {
                    if (next.f18116c == null) {
                        next.f18116c = new C7576c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f18116c);
                } else {
                    arrayList.add(next.f18120e);
                }
                if (next instanceof C7568i) {
                    arrayList.add(new C7585k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC7593p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo18084f();
        }
        Iterator<AbstractC7593p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC7593p next2 = it3.next();
            if (next2.f18256b != this.f18212d) {
                next2.mo18086d();
            }
        }
    }

    /* renamed from: f */
    public boolean m18133f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f18210b || this.f18211c) {
            Iterator<C7561e> it = this.f18209a.f18190p0.iterator();
            while (it.hasNext()) {
                C7561e next = it.next();
                next.m18241l();
                next.f18112a = false;
                next.f18118d.m18105r();
                next.f18120e.m18100q();
            }
            this.f18209a.m18241l();
            C7564f c7564f = this.f18209a;
            c7564f.f18112a = false;
            c7564f.f18118d.m18105r();
            this.f18209a.f18120e.m18100q();
            this.f18211c = false;
        }
        if (m18137b(this.f18212d)) {
            return false;
        }
        this.f18209a.m18261V0(0);
        this.f18209a.m18259W0(0);
        C7561e.EnumC7563b m18228s = this.f18209a.m18228s(0);
        C7561e.EnumC7563b m18228s2 = this.f18209a.m18228s(1);
        if (this.f18210b) {
            m18136c();
        }
        int m18268S = this.f18209a.m18268S();
        int m18266T = this.f18209a.m18266T();
        this.f18209a.f18118d.f18262h.mo18122d(m18268S);
        this.f18209a.f18120e.f18262h.mo18122d(m18266T);
        m18126m();
        C7561e.EnumC7563b enumC7563b = C7561e.EnumC7563b.WRAP_CONTENT;
        if (m18228s == enumC7563b || m18228s2 == enumC7563b) {
            if (z4) {
                Iterator<AbstractC7593p> it2 = this.f18213e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().mo18077m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && m18228s == C7561e.EnumC7563b.WRAP_CONTENT) {
                this.f18209a.m18213z0(C7561e.EnumC7563b.FIXED);
                C7564f c7564f2 = this.f18209a;
                c7564f2.m18263U0(m18134e(c7564f2, 0));
                C7564f c7564f3 = this.f18209a;
                c7564f3.f18118d.f18259e.mo18122d(c7564f3.m18270R());
            }
            if (z4 && m18228s2 == C7561e.EnumC7563b.WRAP_CONTENT) {
                this.f18209a.m18271Q0(C7561e.EnumC7563b.FIXED);
                C7564f c7564f4 = this.f18209a;
                c7564f4.m18221v0(m18134e(c7564f4, 1));
                C7564f c7564f5 = this.f18209a;
                c7564f5.f18120e.f18259e.mo18122d(c7564f5.m18222v());
            }
        }
        C7561e.EnumC7563b[] enumC7563bArr = this.f18209a.f18102Q;
        if (enumC7563bArr[0] == C7561e.EnumC7563b.FIXED || enumC7563bArr[0] == C7561e.EnumC7563b.MATCH_PARENT) {
            int m18270R = this.f18209a.m18270R() + m18268S;
            this.f18209a.f18118d.f18263i.mo18122d(m18270R);
            this.f18209a.f18118d.f18259e.mo18122d(m18270R - m18268S);
            m18126m();
            C7561e.EnumC7563b[] enumC7563bArr2 = this.f18209a.f18102Q;
            if (enumC7563bArr2[1] == C7561e.EnumC7563b.FIXED || enumC7563bArr2[1] == C7561e.EnumC7563b.MATCH_PARENT) {
                int m18222v = this.f18209a.m18222v() + m18266T;
                this.f18209a.f18120e.f18263i.mo18122d(m18222v);
                this.f18209a.f18120e.f18259e.mo18122d(m18222v - m18266T);
            }
            m18126m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<AbstractC7593p> it3 = this.f18213e.iterator();
        while (it3.hasNext()) {
            AbstractC7593p next2 = it3.next();
            if (next2.f18256b != this.f18209a || next2.f18261g) {
                next2.mo18085e();
            }
        }
        Iterator<AbstractC7593p> it4 = this.f18213e.iterator();
        while (it4.hasNext()) {
            AbstractC7593p next3 = it4.next();
            if (z2 || next3.f18256b != this.f18209a) {
                if (!next3.f18262h.f18226j || ((!next3.f18263i.f18226j && !(next3 instanceof C7584j)) || (!next3.f18259e.f18226j && !(next3 instanceof C7576c) && !(next3 instanceof C7584j)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f18209a.m18213z0(m18228s);
        this.f18209a.m18271Q0(m18228s2);
        return z3;
    }

    /* renamed from: g */
    public boolean m18132g(boolean z) {
        if (this.f18210b) {
            Iterator<C7561e> it = this.f18209a.f18190p0.iterator();
            while (it.hasNext()) {
                C7561e next = it.next();
                next.m18241l();
                next.f18112a = false;
                C7586l c7586l = next.f18118d;
                c7586l.f18259e.f18226j = false;
                c7586l.f18261g = false;
                c7586l.m18105r();
                C7589n c7589n = next.f18120e;
                c7589n.f18259e.f18226j = false;
                c7589n.f18261g = false;
                c7589n.m18100q();
            }
            this.f18209a.m18241l();
            C7564f c7564f = this.f18209a;
            c7564f.f18112a = false;
            C7586l c7586l2 = c7564f.f18118d;
            c7586l2.f18259e.f18226j = false;
            c7586l2.f18261g = false;
            c7586l2.m18105r();
            C7589n c7589n2 = this.f18209a.f18120e;
            c7589n2.f18259e.f18226j = false;
            c7589n2.f18261g = false;
            c7589n2.m18100q();
            m18136c();
        }
        if (m18137b(this.f18212d)) {
            return false;
        }
        this.f18209a.m18261V0(0);
        this.f18209a.m18259W0(0);
        this.f18209a.f18118d.f18262h.mo18122d(0);
        this.f18209a.f18120e.f18262h.mo18122d(0);
        return true;
    }

    /* renamed from: h */
    public boolean m18131h(boolean z, int i) {
        boolean z2;
        C7561e.EnumC7563b enumC7563b;
        boolean z3 = true;
        boolean z4 = z & true;
        C7561e.EnumC7563b m18228s = this.f18209a.m18228s(0);
        C7561e.EnumC7563b m18228s2 = this.f18209a.m18228s(1);
        int m18268S = this.f18209a.m18268S();
        int m18266T = this.f18209a.m18266T();
        if (z4 && (m18228s == (enumC7563b = C7561e.EnumC7563b.WRAP_CONTENT) || m18228s2 == enumC7563b)) {
            Iterator<AbstractC7593p> it = this.f18213e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC7593p next = it.next();
                if (next.f18260f == i && !next.mo18077m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && m18228s == C7561e.EnumC7563b.WRAP_CONTENT) {
                    this.f18209a.m18213z0(C7561e.EnumC7563b.FIXED);
                    C7564f c7564f = this.f18209a;
                    c7564f.m18263U0(m18134e(c7564f, 0));
                    C7564f c7564f2 = this.f18209a;
                    c7564f2.f18118d.f18259e.mo18122d(c7564f2.m18270R());
                }
            } else if (z4 && m18228s2 == C7561e.EnumC7563b.WRAP_CONTENT) {
                this.f18209a.m18271Q0(C7561e.EnumC7563b.FIXED);
                C7564f c7564f3 = this.f18209a;
                c7564f3.m18221v0(m18134e(c7564f3, 1));
                C7564f c7564f4 = this.f18209a;
                c7564f4.f18120e.f18259e.mo18122d(c7564f4.m18222v());
            }
        }
        if (i == 0) {
            C7561e.EnumC7563b[] enumC7563bArr = this.f18209a.f18102Q;
            if (enumC7563bArr[0] == C7561e.EnumC7563b.FIXED || enumC7563bArr[0] == C7561e.EnumC7563b.MATCH_PARENT) {
                int m18270R = this.f18209a.m18270R() + m18268S;
                this.f18209a.f18118d.f18263i.mo18122d(m18270R);
                this.f18209a.f18118d.f18259e.mo18122d(m18270R - m18268S);
                z2 = true;
            }
            z2 = false;
        } else {
            C7561e.EnumC7563b[] enumC7563bArr2 = this.f18209a.f18102Q;
            if (enumC7563bArr2[1] == C7561e.EnumC7563b.FIXED || enumC7563bArr2[1] == C7561e.EnumC7563b.MATCH_PARENT) {
                int m18222v = this.f18209a.m18222v() + m18266T;
                this.f18209a.f18120e.f18263i.mo18122d(m18222v);
                this.f18209a.f18120e.f18259e.mo18122d(m18222v - m18266T);
                z2 = true;
            }
            z2 = false;
        }
        m18126m();
        Iterator<AbstractC7593p> it2 = this.f18213e.iterator();
        while (it2.hasNext()) {
            AbstractC7593p next2 = it2.next();
            if (next2.f18260f == i && (next2.f18256b != this.f18209a || next2.f18261g)) {
                next2.mo18085e();
            }
        }
        Iterator<AbstractC7593p> it3 = this.f18213e.iterator();
        while (it3.hasNext()) {
            AbstractC7593p next3 = it3.next();
            if (next3.f18260f == i && (z2 || next3.f18256b != this.f18209a)) {
                if (!next3.f18262h.f18226j || !next3.f18263i.f18226j || (!(next3 instanceof C7576c) && !next3.f18259e.f18226j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f18209a.m18213z0(m18228s);
        this.f18209a.m18271Q0(m18228s2);
        return z3;
    }

    /* renamed from: j */
    public void m18129j() {
        this.f18210b = true;
    }

    /* renamed from: k */
    public void m18128k() {
        this.f18211c = true;
    }

    /* renamed from: m */
    public void m18126m() {
        C7581g c7581g;
        Iterator<C7561e> it = this.f18209a.f18190p0.iterator();
        while (it.hasNext()) {
            C7561e next = it.next();
            if (!next.f18112a) {
                C7561e.EnumC7563b[] enumC7563bArr = next.f18102Q;
                boolean z = false;
                C7561e.EnumC7563b enumC7563b = enumC7563bArr[0];
                C7561e.EnumC7563b enumC7563b2 = enumC7563bArr[1];
                int i = next.f18138n;
                int i2 = next.f18140o;
                boolean z2 = enumC7563b == C7561e.EnumC7563b.WRAP_CONTENT || (enumC7563b == C7561e.EnumC7563b.MATCH_CONSTRAINT && i == 1);
                if (enumC7563b2 == C7561e.EnumC7563b.WRAP_CONTENT || (enumC7563b2 == C7561e.EnumC7563b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C7581g c7581g2 = next.f18118d.f18259e;
                boolean z3 = c7581g2.f18226j;
                C7581g c7581g3 = next.f18120e.f18259e;
                boolean z4 = c7581g3.f18226j;
                if (z3 && z4) {
                    C7561e.EnumC7563b enumC7563b3 = C7561e.EnumC7563b.FIXED;
                    m18127l(next, enumC7563b3, c7581g2.f18223g, enumC7563b3, c7581g3.f18223g);
                    next.f18112a = true;
                } else if (z3 && z) {
                    m18127l(next, C7561e.EnumC7563b.FIXED, next.f18118d.f18259e.f18223g, C7561e.EnumC7563b.WRAP_CONTENT, next.f18120e.f18259e.f18223g);
                    if (enumC7563b2 == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
                        next.f18120e.f18259e.f18238m = next.m18222v();
                    } else {
                        next.f18120e.f18259e.mo18122d(next.m18222v());
                        next.f18112a = true;
                    }
                } else if (z4 && z2) {
                    m18127l(next, C7561e.EnumC7563b.WRAP_CONTENT, next.f18118d.f18259e.f18223g, C7561e.EnumC7563b.FIXED, next.f18120e.f18259e.f18223g);
                    if (enumC7563b == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
                        next.f18118d.f18259e.f18238m = next.m18270R();
                    } else {
                        next.f18118d.f18259e.mo18122d(next.m18270R());
                        next.f18112a = true;
                    }
                }
                if (next.f18112a && (c7581g = next.f18120e.f18247l) != null) {
                    c7581g.mo18122d(next.m18238n());
                }
            }
        }
    }

    /* renamed from: n */
    public void m18125n(C7573b.InterfaceC7575b interfaceC7575b) {
        this.f18214f = interfaceC7575b;
    }
}
