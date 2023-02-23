package com.google.firebase.database.p131s.p136j0.p137m;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p136j0.C5803c;
import com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d;
import com.google.firebase.database.p139u.AbstractC5937h;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.C5944m;
import com.google.firebase.database.p139u.InterfaceC5945n;
/* compiled from: IndexedFilter.java */
/* renamed from: com.google.firebase.database.s.j0.m.b */
/* loaded from: classes2.dex */
public class C5824b implements InterfaceC5826d {

    /* renamed from: a */
    private final AbstractC5937h f14302a;

    public C5824b(AbstractC5937h abstractC5937h) {
        this.f14302a = abstractC5937h;
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: h */
    public AbstractC5937h mo23602h() {
        return this.f14302a;
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: i */
    public InterfaceC5826d mo23601i() {
        return this;
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: j */
    public C5938i mo23600j(C5938i c5938i, InterfaceC5945n interfaceC5945n) {
        return c5938i.m23236l().isEmpty() ? c5938i : c5938i.m23243E(interfaceC5945n);
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: k */
    public boolean mo23599k() {
        return false;
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: l */
    public C5938i mo23598l(C5938i c5938i, C5921b c5921b, InterfaceC5945n interfaceC5945n, C5830l c5830l, InterfaceC5826d.InterfaceC5827a interfaceC5827a, C5823a c5823a) {
        C5795m.m23744g(c5938i.m23234s(this.f14302a), "The index must match the filter");
        InterfaceC5945n m23236l = c5938i.m23236l();
        InterfaceC5945n mo23211L = m23236l.mo23211L(c5921b);
        if (mo23211L.mo23220B(c5830l).equals(interfaceC5945n.mo23220B(c5830l)) && mo23211L.isEmpty() == interfaceC5945n.isEmpty()) {
            return c5938i;
        }
        if (c5823a != null) {
            if (interfaceC5945n.isEmpty()) {
                if (m23236l.mo23210R(c5921b)) {
                    c5823a.m23611b(C5803c.m23681h(c5921b, mo23211L));
                } else {
                    C5795m.m23744g(m23236l.mo23217N(), "A child remove without an old child only makes sense on a leaf node");
                }
            } else if (mo23211L.isEmpty()) {
                c5823a.m23611b(C5803c.m23686c(c5921b, interfaceC5945n));
            } else {
                c5823a.m23611b(C5803c.m23684e(c5921b, interfaceC5945n, mo23211L));
            }
        }
        return (m23236l.mo23217N() && interfaceC5945n.isEmpty()) ? c5938i : c5938i.m23233u(c5921b, interfaceC5945n);
    }

    @Override // com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d
    /* renamed from: m */
    public C5938i mo23597m(C5938i c5938i, C5938i c5938i2, C5823a c5823a) {
        C5795m.m23744g(c5938i2.m23234s(this.f14302a), "Can't use IndexedNode that doesn't have filter's index");
        if (c5823a != null) {
            for (C5944m c5944m : c5938i.m23236l()) {
                if (!c5938i2.m23236l().mo23210R(c5944m.m23222c())) {
                    c5823a.m23611b(C5803c.m23681h(c5944m.m23222c(), c5944m.m23221d()));
                }
            }
            if (!c5938i2.m23236l().mo23217N()) {
                for (C5944m c5944m2 : c5938i2.m23236l()) {
                    if (c5938i.m23236l().mo23210R(c5944m2.m23222c())) {
                        InterfaceC5945n mo23211L = c5938i.m23236l().mo23211L(c5944m2.m23222c());
                        if (!mo23211L.equals(c5944m2.m23221d())) {
                            c5823a.m23611b(C5803c.m23684e(c5944m2.m23222c(), c5944m2.m23221d(), mo23211L));
                        }
                    } else {
                        c5823a.m23611b(C5803c.m23686c(c5944m2.m23222c(), c5944m2.m23221d()));
                    }
                }
            }
        }
        return c5938i2;
    }
}
