package p201g.p219f.p223b.p224k.p225m;

import java.util.ArrayList;
import p201g.p219f.p223b.p224k.C7564f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RunGroup.java */
/* renamed from: g.f.b.k.m.m */
/* loaded from: classes2.dex */
public class C7588m {

    /* renamed from: d */
    public static int f18242d;

    /* renamed from: a */
    public boolean f18243a;

    /* renamed from: b */
    AbstractC7593p f18244b;

    /* renamed from: c */
    ArrayList<AbstractC7593p> f18245c = new ArrayList<>();

    public C7588m(AbstractC7593p abstractC7593p, int i) {
        this.f18244b = null;
        f18242d++;
        this.f18244b = abstractC7593p;
    }

    /* renamed from: c */
    private long m18102c(C7579f c7579f, long j) {
        AbstractC7593p abstractC7593p = c7579f.f18220d;
        if (abstractC7593p instanceof C7585k) {
            return j;
        }
        int size = c7579f.f18227k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC7577d interfaceC7577d = c7579f.f18227k.get(i);
            if (interfaceC7577d instanceof C7579f) {
                C7579f c7579f2 = (C7579f) interfaceC7577d;
                if (c7579f2.f18220d != abstractC7593p) {
                    j2 = Math.min(j2, m18102c(c7579f2, c7579f2.f18222f + j));
                }
            }
        }
        if (c7579f == abstractC7593p.f18263i) {
            long mo18080j = j - abstractC7593p.mo18080j();
            return Math.min(Math.min(j2, m18102c(abstractC7593p.f18262h, mo18080j)), mo18080j - abstractC7593p.f18262h.f18222f);
        }
        return j2;
    }

    /* renamed from: d */
    private long m18101d(C7579f c7579f, long j) {
        AbstractC7593p abstractC7593p = c7579f.f18220d;
        if (abstractC7593p instanceof C7585k) {
            return j;
        }
        int size = c7579f.f18227k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC7577d interfaceC7577d = c7579f.f18227k.get(i);
            if (interfaceC7577d instanceof C7579f) {
                C7579f c7579f2 = (C7579f) interfaceC7577d;
                if (c7579f2.f18220d != abstractC7593p) {
                    j2 = Math.max(j2, m18101d(c7579f2, c7579f2.f18222f + j));
                }
            }
        }
        if (c7579f == abstractC7593p.f18262h) {
            long mo18080j = j + abstractC7593p.mo18080j();
            return Math.max(Math.max(j2, m18101d(abstractC7593p.f18263i, mo18080j)), mo18080j - abstractC7593p.f18263i.f18222f);
        }
        return j2;
    }

    /* renamed from: a */
    public void m18104a(AbstractC7593p abstractC7593p) {
        this.f18245c.add(abstractC7593p);
    }

    /* renamed from: b */
    public long m18103b(C7564f c7564f, int i) {
        long mo18080j;
        int i2;
        AbstractC7593p abstractC7593p = this.f18244b;
        if (abstractC7593p instanceof C7576c) {
            if (((C7576c) abstractC7593p).f18260f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(abstractC7593p instanceof C7586l)) {
                return 0L;
            }
        } else if (!(abstractC7593p instanceof C7589n)) {
            return 0L;
        }
        C7579f c7579f = (i == 0 ? c7564f.f18118d : c7564f.f18120e).f18262h;
        C7579f c7579f2 = (i == 0 ? c7564f.f18118d : c7564f.f18120e).f18263i;
        boolean contains = this.f18244b.f18262h.f18228l.contains(c7579f);
        boolean contains2 = this.f18244b.f18263i.f18228l.contains(c7579f2);
        long mo18080j2 = this.f18244b.mo18080j();
        if (contains && contains2) {
            long m18101d = m18101d(this.f18244b.f18262h, 0L);
            long m18102c = m18102c(this.f18244b.f18263i, 0L);
            long j = m18101d - mo18080j2;
            int i3 = this.f18244b.f18263i.f18222f;
            if (j >= (-i3)) {
                j += i3;
            }
            int i4 = this.f18244b.f18262h.f18222f;
            long j2 = ((-m18102c) - mo18080j2) - i4;
            if (j2 >= i4) {
                j2 -= i4;
            }
            float m18236o = this.f18244b.f18256b.m18236o(i);
            float f = (float) (m18236o > 0.0f ? (((float) j2) / m18236o) + (((float) j) / (1.0f - m18236o)) : 0L);
            long j3 = (f * m18236o) + 0.5f + mo18080j2 + (f * (1.0f - m18236o)) + 0.5f;
            AbstractC7593p abstractC7593p2 = this.f18244b;
            mo18080j = abstractC7593p2.f18262h.f18222f + j3;
            i2 = abstractC7593p2.f18263i.f18222f;
        } else if (contains) {
            C7579f c7579f3 = this.f18244b.f18262h;
            return Math.max(m18101d(c7579f3, c7579f3.f18222f), this.f18244b.f18262h.f18222f + mo18080j2);
        } else if (contains2) {
            C7579f c7579f4 = this.f18244b.f18263i;
            return Math.max(-m18102c(c7579f4, c7579f4.f18222f), (-this.f18244b.f18263i.f18222f) + mo18080j2);
        } else {
            AbstractC7593p abstractC7593p3 = this.f18244b;
            mo18080j = abstractC7593p3.f18262h.f18222f + abstractC7593p3.mo18080j();
            i2 = this.f18244b.f18263i.f18222f;
        }
        return mo18080j - i2;
    }
}
