package com.google.firebase.database.p131s;

import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p134i0.InterfaceC5787i;
import com.google.firebase.database.p131s.p136j0.C5801a;
import com.google.firebase.database.p139u.AbstractC5937h;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5936g;
import com.google.firebase.database.p139u.C5944m;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: WriteTree.java */
/* renamed from: com.google.firebase.database.s.d0 */
/* loaded from: classes2.dex */
public class C5734d0 {

    /* renamed from: d */
    private static final InterfaceC5787i<C5895z> f14114d = new C5736b();

    /* renamed from: a */
    private C5737e f14115a = C5737e.m23963s();

    /* renamed from: b */
    private List<C5895z> f14116b = new ArrayList();

    /* renamed from: c */
    private Long f14117c = -1L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WriteTree.java */
    /* renamed from: com.google.firebase.database.s.d0$a */
    /* loaded from: classes2.dex */
    public class C5735a implements InterfaceC5787i<C5895z> {

        /* renamed from: b */
        final /* synthetic */ boolean f14118b;

        /* renamed from: c */
        final /* synthetic */ List f14119c;

        /* renamed from: d */
        final /* synthetic */ C5830l f14120d;

        C5735a(C5734d0 c5734d0, boolean z, List list, C5830l c5830l) {
            this.f14118b = z;
            this.f14119c = list;
            this.f14120d = c5830l;
        }

        @Override // com.google.firebase.database.p131s.p134i0.InterfaceC5787i
        /* renamed from: b */
        public boolean mo23768a(C5895z c5895z) {
            return (c5895z.m23374f() || this.f14118b) && !this.f14119c.contains(Long.valueOf(c5895z.m23376d())) && (c5895z.m23377c().m23590P(this.f14120d) || this.f14120d.m23590P(c5895z.m23377c()));
        }
    }

    /* compiled from: WriteTree.java */
    /* renamed from: com.google.firebase.database.s.d0$b */
    /* loaded from: classes2.dex */
    class C5736b implements InterfaceC5787i<C5895z> {
        C5736b() {
        }

        @Override // com.google.firebase.database.p131s.p134i0.InterfaceC5787i
        /* renamed from: b */
        public boolean mo23768a(C5895z c5895z) {
            return c5895z.m23374f();
        }
    }

    /* renamed from: j */
    private static C5737e m23984j(List<C5895z> list, InterfaceC5787i<C5895z> interfaceC5787i, C5830l c5830l) {
        C5737e m23963s = C5737e.m23963s();
        for (C5895z c5895z : list) {
            if (interfaceC5787i.mo23768a(c5895z)) {
                C5830l m23377c = c5895z.m23377c();
                if (c5895z.m23375e()) {
                    if (c5830l.m23590P(m23377c)) {
                        m23963s = m23963s.m23970d(C5830l.m23585d0(c5830l, m23377c), c5895z.m23378b());
                    } else if (m23377c.m23590P(c5830l)) {
                        m23963s = m23963s.m23970d(C5830l.m23588X(), c5895z.m23378b().mo23220B(C5830l.m23585d0(m23377c, c5830l)));
                    }
                } else if (c5830l.m23590P(m23377c)) {
                    m23963s = m23963s.m23968f(C5830l.m23585d0(c5830l, m23377c), c5895z.m23379a());
                } else if (m23377c.m23590P(c5830l)) {
                    C5830l m23585d0 = C5830l.m23585d0(m23377c, c5830l);
                    if (m23585d0.isEmpty()) {
                        m23963s = m23963s.m23968f(C5830l.m23588X(), c5895z.m23379a());
                    } else {
                        InterfaceC5945n m23975I = c5895z.m23379a().m23975I(m23585d0);
                        if (m23975I != null) {
                            m23963s = m23963s.m23970d(C5830l.m23588X(), m23975I);
                        }
                    }
                }
            }
        }
        return m23963s;
    }

    /* renamed from: k */
    private boolean m23983k(C5895z c5895z, C5830l c5830l) {
        if (c5895z.m23375e()) {
            return c5895z.m23377c().m23590P(c5830l);
        }
        Iterator<Map.Entry<C5830l, InterfaceC5945n>> it = c5895z.m23379a().iterator();
        while (it.hasNext()) {
            if (c5895z.m23377c().m23593I(it.next().getKey()).m23590P(c5830l)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    private void m23981m() {
        this.f14115a = m23984j(this.f14116b, f14114d, C5830l.m23588X());
        if (this.f14116b.size() > 0) {
            List<C5895z> list = this.f14116b;
            this.f14117c = Long.valueOf(list.get(list.size() - 1).m23376d());
            return;
        }
        this.f14117c = -1L;
    }

    /* renamed from: a */
    public void m23993a(C5830l c5830l, C5737e c5737e, Long l) {
        C5795m.m23745f(l.longValue() > this.f14117c.longValue());
        this.f14116b.add(new C5895z(l.longValue(), c5830l, c5737e));
        this.f14115a = this.f14115a.m23968f(c5830l, c5737e);
        this.f14117c = l;
    }

    /* renamed from: b */
    public void m23992b(C5830l c5830l, InterfaceC5945n interfaceC5945n, Long l, boolean z) {
        C5795m.m23745f(l.longValue() > this.f14117c.longValue());
        this.f14116b.add(new C5895z(l.longValue(), c5830l, interfaceC5945n, z));
        if (z) {
            this.f14115a = this.f14115a.m23970d(c5830l, interfaceC5945n);
        }
        this.f14117c = l;
    }

    /* renamed from: c */
    public InterfaceC5945n m23991c(C5830l c5830l, C5921b c5921b, C5801a c5801a) {
        C5830l m23592J = c5830l.m23592J(c5921b);
        InterfaceC5945n m23975I = this.f14115a.m23975I(m23592J);
        if (m23975I != null) {
            return m23975I;
        }
        if (c5801a.m23693c(c5921b)) {
            return this.f14115a.m23965l(m23592J).m23967h(c5801a.m23694b().mo23211L(c5921b));
        }
        return null;
    }

    /* renamed from: d */
    public InterfaceC5945n m23990d(C5830l c5830l, InterfaceC5945n interfaceC5945n, List<Long> list, boolean z) {
        if (list.isEmpty() && !z) {
            InterfaceC5945n m23975I = this.f14115a.m23975I(c5830l);
            if (m23975I != null) {
                return m23975I;
            }
            C5737e m23965l = this.f14115a.m23965l(c5830l);
            if (m23965l.isEmpty()) {
                return interfaceC5945n;
            }
            if (interfaceC5945n != null || m23965l.m23973O(C5830l.m23588X())) {
                if (interfaceC5945n == null) {
                    interfaceC5945n = C5936g.m23249P();
                }
                return m23965l.m23967h(interfaceC5945n);
            }
            return null;
        }
        C5737e m23965l2 = this.f14115a.m23965l(c5830l);
        if (z || !m23965l2.isEmpty()) {
            if (z || interfaceC5945n != null || m23965l2.m23973O(C5830l.m23588X())) {
                C5737e m23984j = m23984j(this.f14116b, new C5735a(this, z, list, c5830l), c5830l);
                if (interfaceC5945n == null) {
                    interfaceC5945n = C5936g.m23249P();
                }
                return m23984j.m23967h(interfaceC5945n);
            }
            return null;
        }
        return interfaceC5945n;
    }

    /* renamed from: e */
    public InterfaceC5945n m23989e(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
        InterfaceC5945n m23249P = C5936g.m23249P();
        InterfaceC5945n m23975I = this.f14115a.m23975I(c5830l);
        if (m23975I != null) {
            if (!m23975I.mo23217N()) {
                for (C5944m c5944m : m23975I) {
                    m23249P = m23249P.mo23216T(c5944m.m23222c(), c5944m.m23221d());
                }
            }
            return m23249P;
        }
        C5737e m23965l = this.f14115a.m23965l(c5830l);
        for (C5944m c5944m2 : interfaceC5945n) {
            m23249P = m23249P.mo23216T(c5944m2.m23222c(), m23965l.m23965l(new C5830l(c5944m2.m23222c())).m23967h(c5944m2.m23221d()));
        }
        for (C5944m c5944m3 : m23965l.m23976F()) {
            m23249P = m23249P.mo23216T(c5944m3.m23222c(), c5944m3.m23221d());
        }
        return m23249P;
    }

    /* renamed from: f */
    public InterfaceC5945n m23988f(C5830l c5830l, C5830l c5830l2, InterfaceC5945n interfaceC5945n, InterfaceC5945n interfaceC5945n2) {
        C5795m.m23744g((interfaceC5945n == null && interfaceC5945n2 == null) ? false : true, "Either existingEventSnap or existingServerSnap must exist");
        C5830l m23593I = c5830l.m23593I(c5830l2);
        if (this.f14115a.m23973O(m23593I)) {
            return null;
        }
        C5737e m23965l = this.f14115a.m23965l(m23593I);
        if (m23965l.isEmpty()) {
            return interfaceC5945n2.mo23220B(c5830l2);
        }
        return m23965l.m23967h(interfaceC5945n2.mo23220B(c5830l2));
    }

    /* renamed from: g */
    public C5944m m23987g(C5830l c5830l, InterfaceC5945n interfaceC5945n, C5944m c5944m, boolean z, AbstractC5937h abstractC5937h) {
        C5737e m23965l = this.f14115a.m23965l(c5830l);
        InterfaceC5945n m23975I = m23965l.m23975I(C5830l.m23588X());
        C5944m c5944m2 = null;
        if (m23975I == null) {
            if (interfaceC5945n != null) {
                m23975I = m23965l.m23967h(interfaceC5945n);
            }
            return c5944m2;
        }
        for (C5944m c5944m3 : m23975I) {
            if (abstractC5937h.m23247a(c5944m3, c5944m, z) > 0 && (c5944m2 == null || abstractC5937h.m23247a(c5944m3, c5944m2, z) < 0)) {
                c5944m2 = c5944m3;
            }
        }
        return c5944m2;
    }

    /* renamed from: h */
    public C5740e0 m23986h(C5830l c5830l) {
        return new C5740e0(c5830l, this);
    }

    /* renamed from: i */
    public C5895z m23985i(long j) {
        for (C5895z c5895z : this.f14116b) {
            if (c5895z.m23376d() == j) {
                return c5895z;
            }
        }
        return null;
    }

    /* renamed from: l */
    public boolean m23982l(long j) {
        C5895z c5895z;
        Iterator<C5895z> it = this.f14116b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                c5895z = null;
                break;
            }
            c5895z = it.next();
            if (c5895z.m23376d() == j) {
                break;
            }
            i++;
        }
        C5795m.m23744g(c5895z != null, "removeWrite called with nonexistent writeId");
        this.f14116b.remove(c5895z);
        boolean m23374f = c5895z.m23374f();
        boolean z = false;
        for (int size = this.f14116b.size() - 1; m23374f && size >= 0; size--) {
            C5895z c5895z2 = this.f14116b.get(size);
            if (c5895z2.m23374f()) {
                if (size >= i && m23983k(c5895z2, c5895z.m23377c())) {
                    m23374f = false;
                } else if (c5895z.m23377c().m23590P(c5895z2.m23377c())) {
                    z = true;
                }
            }
        }
        if (m23374f) {
            if (z) {
                m23981m();
                return true;
            }
            if (c5895z.m23375e()) {
                this.f14115a = this.f14115a.m23972P(c5895z.m23377c());
            } else {
                Iterator<Map.Entry<C5830l, InterfaceC5945n>> it2 = c5895z.m23379a().iterator();
                while (it2.hasNext()) {
                    this.f14115a = this.f14115a.m23972P(c5895z.m23377c().m23593I(it2.next().getKey()));
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public InterfaceC5945n m23980n(C5830l c5830l) {
        return this.f14115a.m23975I(c5830l);
    }
}
