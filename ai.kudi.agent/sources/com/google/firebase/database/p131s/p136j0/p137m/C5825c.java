package com.google.firebase.database.p131s.p136j0.p137m;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p136j0.C5803c;
import com.google.firebase.database.p131s.p136j0.C5811h;
import com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d;
import com.google.firebase.database.p139u.AbstractC5937h;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5936g;
import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.C5944m;
import com.google.firebase.database.p139u.C5951r;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.Iterator;
/* compiled from: LimitedFilter.java */
/* renamed from: com.google.firebase.database.s.j0.m.c */
/* loaded from: classes2.dex */
public class C5825c implements InterfaceC5826d {

    /* renamed from: a */
    private final C5828e f14303a;

    /* renamed from: b */
    private final AbstractC5937h f14304b;

    /* renamed from: c */
    private final int f14305c;

    /* renamed from: d */
    private final boolean f14306d;

    public C5825c(C5811h c5811h) {
        this.f14303a = new C5828e(c5811h);
        this.f14304b = c5811h.m23663b();
        this.f14305c = c5811h.m23658g();
        this.f14306d = !c5811h.m23651n();
    }

    /* renamed from: a */
    private C5938i m23610a(C5938i c5938i, C5921b c5921b, InterfaceC5945n interfaceC5945n, InterfaceC5826d.InterfaceC5827a interfaceC5827a, C5823a c5823a) {
        boolean z = false;
        C5795m.m23745f(c5938i.m23236l().mo23213o() == this.f14305c);
        C5944m c5944m = new C5944m(c5921b, interfaceC5945n);
        C5944m m23238h = this.f14306d ? c5938i.m23238h() : c5938i.m23237k();
        boolean m23603e = this.f14303a.m23603e(c5944m);
        if (c5938i.m23236l().mo23210R(c5921b)) {
            InterfaceC5945n mo23211L = c5938i.m23236l().mo23211L(c5921b);
            C5944m mo23609a = interfaceC5827a.mo23609a(this.f14304b, m23238h, this.f14306d);
            while (mo23609a != null && (mo23609a.m23222c().equals(c5921b) || c5938i.m23236l().mo23210R(mo23609a.m23222c()))) {
                mo23609a = interfaceC5827a.mo23609a(this.f14304b, mo23609a, this.f14306d);
            }
            if (m23603e && !interfaceC5945n.isEmpty() && (mo23609a == null ? 1 : this.f14304b.m23247a(mo23609a, c5944m, this.f14306d)) >= 0) {
                if (c5823a != null) {
                    c5823a.m23611b(C5803c.m23684e(c5921b, interfaceC5945n, mo23211L));
                }
                return c5938i.m23233u(c5921b, interfaceC5945n);
            }
            if (c5823a != null) {
                c5823a.m23611b(C5803c.m23681h(c5921b, mo23211L));
            }
            C5938i m23233u = c5938i.m23233u(c5921b, C5936g.m23249P());
            if (mo23609a != null && this.f14303a.m23603e(mo23609a)) {
                z = true;
            }
            if (z) {
                if (c5823a != null) {
                    c5823a.m23611b(C5803c.m23686c(mo23609a.m23222c(), mo23609a.m23221d()));
                }
                return m23233u.m23233u(mo23609a.m23222c(), mo23609a.m23221d());
            }
            return m23233u;
        } else if (!interfaceC5945n.isEmpty() && m23603e && this.f14304b.m23247a(m23238h, c5944m, this.f14306d) >= 0) {
            if (c5823a != null) {
                c5823a.m23611b(C5803c.m23681h(m23238h.m23222c(), m23238h.m23221d()));
                c5823a.m23611b(C5803c.m23686c(c5921b, interfaceC5945n));
            }
            return c5938i.m23233u(c5921b, interfaceC5945n).m23233u(m23238h.m23222c(), C5936g.m23249P());
        } else {
            return c5938i;
        }
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: h */
    public AbstractC5937h mo23602h() {
        return this.f14304b;
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: i */
    public InterfaceC5826d mo23601i() {
        return this.f14303a.mo23601i();
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: j */
    public C5938i mo23600j(C5938i c5938i, InterfaceC5945n interfaceC5945n) {
        return c5938i;
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: k */
    public boolean mo23599k() {
        return true;
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: l */
    public C5938i mo23598l(C5938i c5938i, C5921b c5921b, InterfaceC5945n interfaceC5945n, C5830l c5830l, InterfaceC5826d.InterfaceC5827a interfaceC5827a, C5823a c5823a) {
        if (!this.f14303a.m23603e(new C5944m(c5921b, interfaceC5945n))) {
            interfaceC5945n = C5936g.m23249P();
        }
        InterfaceC5945n interfaceC5945n2 = interfaceC5945n;
        if (c5938i.m23236l().mo23211L(c5921b).equals(interfaceC5945n2)) {
            return c5938i;
        }
        if (c5938i.m23236l().mo23213o() < this.f14305c) {
            return this.f14303a.mo23601i().mo23598l(c5938i, c5921b, interfaceC5945n2, c5830l, interfaceC5827a, c5823a);
        }
        return m23610a(c5938i, c5921b, interfaceC5945n2, interfaceC5827a, c5823a);
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: m */
    public C5938i mo23597m(C5938i c5938i, C5938i c5938i2, C5823a c5823a) {
        C5938i m23239f;
        Iterator<C5944m> it;
        C5944m m23605c;
        C5944m m23607a;
        int i;
        if (!c5938i2.m23236l().mo23217N() && !c5938i2.m23236l().isEmpty()) {
            m23239f = c5938i2.m23243E(C5951r.m23201a());
            if (this.f14306d) {
                it = c5938i2.m23242a0();
                m23605c = this.f14303a.m23607a();
                m23607a = this.f14303a.m23605c();
                i = -1;
            } else {
                it = c5938i2.iterator();
                m23605c = this.f14303a.m23605c();
                m23607a = this.f14303a.m23607a();
                i = 1;
            }
            boolean z = false;
            int i2 = 0;
            while (it.hasNext()) {
                C5944m next = it.next();
                if (!z && this.f14304b.compare(m23605c, next) * i <= 0) {
                    z = true;
                }
                if (z && i2 < this.f14305c && this.f14304b.compare(next, m23607a) * i <= 0) {
                    i2++;
                } else {
                    m23239f = m23239f.m23233u(next.m23222c(), C5936g.m23249P());
                }
            }
        } else {
            m23239f = C5938i.m23239f(C5936g.m23249P(), this.f14304b);
        }
        return this.f14303a.mo23601i().mo23597m(c5938i, m23239f, c5823a);
    }
}
