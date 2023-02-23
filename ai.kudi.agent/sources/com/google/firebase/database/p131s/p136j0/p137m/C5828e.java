package com.google.firebase.database.p131s.p136j0.p137m;

import com.google.firebase.database.p131s.C5830l;
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
/* compiled from: RangedFilter.java */
/* renamed from: com.google.firebase.database.s.j0.m.e */
/* loaded from: classes2.dex */
public class C5828e implements InterfaceC5826d {

    /* renamed from: a */
    private final C5824b f14307a;

    /* renamed from: b */
    private final AbstractC5937h f14308b;

    /* renamed from: c */
    private final C5944m f14309c;

    /* renamed from: d */
    private final C5944m f14310d;

    public C5828e(C5811h c5811h) {
        this.f14307a = new C5824b(c5811h.m23663b());
        this.f14308b = c5811h.m23663b();
        this.f14309c = m23604d(c5811h);
        this.f14310d = m23606b(c5811h);
    }

    /* renamed from: b */
    private static C5944m m23606b(C5811h c5811h) {
        if (c5811h.m23655j()) {
            return c5811h.m23663b().mo23187f(c5811h.m23662c(), c5811h.m23661d());
        }
        return c5811h.m23663b().mo23186g();
    }

    /* renamed from: d */
    private static C5944m m23604d(C5811h c5811h) {
        if (c5811h.m23653l()) {
            return c5811h.m23663b().mo23187f(c5811h.m23660e(), c5811h.m23659f());
        }
        return c5811h.m23663b().m23244h();
    }

    /* renamed from: a */
    public C5944m m23607a() {
        return this.f14310d;
    }

    /* renamed from: c */
    public C5944m m23605c() {
        return this.f14309c;
    }

    /* renamed from: e */
    public boolean m23603e(C5944m c5944m) {
        return this.f14308b.compare(m23605c(), c5944m) <= 0 && this.f14308b.compare(c5944m, m23607a()) <= 0;
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: h */
    public AbstractC5937h mo23602h() {
        return this.f14308b;
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: i */
    public InterfaceC5826d mo23601i() {
        return this.f14307a;
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
        if (!m23603e(new C5944m(c5921b, interfaceC5945n))) {
            interfaceC5945n = C5936g.m23249P();
        }
        return this.f14307a.mo23598l(c5938i, c5921b, interfaceC5945n, c5830l, interfaceC5827a, c5823a);
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: m */
    public C5938i mo23597m(C5938i c5938i, C5938i c5938i2, C5823a c5823a) {
        C5938i c5938i3;
        if (c5938i2.m23236l().mo23217N()) {
            c5938i3 = C5938i.m23239f(C5936g.m23249P(), this.f14308b);
        } else {
            C5938i m23243E = c5938i2.m23243E(C5951r.m23201a());
            Iterator<C5944m> it = c5938i2.iterator();
            while (it.hasNext()) {
                C5944m next = it.next();
                if (!m23603e(next)) {
                    m23243E = m23243E.m23233u(next.m23222c(), C5936g.m23249P());
                }
            }
            c5938i3 = m23243E;
        }
        this.f14307a.mo23597m(c5938i, c5938i3, c5823a);
        return c5938i3;
    }
}
