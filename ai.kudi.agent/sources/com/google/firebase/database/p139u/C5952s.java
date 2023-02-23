package com.google.firebase.database.p139u;

import com.google.firebase.database.p129r.C5709p;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p134i0.C5795m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: RangeMerge.java */
/* renamed from: com.google.firebase.database.u.s */
/* loaded from: classes2.dex */
public class C5952s {

    /* renamed from: a */
    private final C5830l f14596a;

    /* renamed from: b */
    private final C5830l f14597b;

    /* renamed from: c */
    private final InterfaceC5945n f14598c;

    public C5952s(C5709p c5709p) {
        List<String> m24051a = c5709p.m24051a();
        this.f14596a = m24051a != null ? new C5830l(m24051a) : null;
        List<String> m24050b = c5709p.m24050b();
        this.f14597b = m24050b != null ? new C5830l(m24050b) : null;
        this.f14598c = C5948o.m23207a(c5709p.m24049c());
    }

    /* renamed from: b */
    private InterfaceC5945n m23196b(C5830l c5830l, InterfaceC5945n interfaceC5945n, InterfaceC5945n interfaceC5945n2) {
        C5830l c5830l2 = this.f14596a;
        boolean z = true;
        int compareTo = c5830l2 == null ? 1 : c5830l.compareTo(c5830l2);
        C5830l c5830l3 = this.f14597b;
        int compareTo2 = c5830l3 == null ? -1 : c5830l.compareTo(c5830l3);
        C5830l c5830l4 = this.f14596a;
        boolean z2 = c5830l4 != null && c5830l.m23590P(c5830l4);
        C5830l c5830l5 = this.f14597b;
        boolean z3 = c5830l5 != null && c5830l.m23590P(c5830l5);
        if (compareTo <= 0 || compareTo2 >= 0 || z3) {
            if (compareTo > 0 && z3 && interfaceC5945n2.mo23217N()) {
                return interfaceC5945n2;
            }
            if (compareTo > 0 && compareTo2 == 0) {
                C5795m.m23745f(z3);
                C5795m.m23745f(!interfaceC5945n2.mo23217N());
                return interfaceC5945n.mo23217N() ? C5936g.m23249P() : interfaceC5945n;
            } else if (!z2 && !z3) {
                if (compareTo2 <= 0 && compareTo > 0) {
                    z = false;
                }
                C5795m.m23745f(z);
                return interfaceC5945n;
            } else {
                HashSet hashSet = new HashSet();
                Iterator<C5944m> it = interfaceC5945n.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().m23222c());
                }
                Iterator<C5944m> it2 = interfaceC5945n2.iterator();
                while (it2.hasNext()) {
                    hashSet.add(it2.next().m23222c());
                }
                ArrayList<C5921b> arrayList = new ArrayList(hashSet.size() + 1);
                arrayList.addAll(hashSet);
                if (!interfaceC5945n2.mo23208x().isEmpty() || !interfaceC5945n.mo23208x().isEmpty()) {
                    arrayList.add(C5921b.m23293j());
                }
                InterfaceC5945n interfaceC5945n3 = interfaceC5945n;
                for (C5921b c5921b : arrayList) {
                    InterfaceC5945n mo23211L = interfaceC5945n.mo23211L(c5921b);
                    InterfaceC5945n m23196b = m23196b(c5830l.m23592J(c5921b), interfaceC5945n.mo23211L(c5921b), interfaceC5945n2.mo23211L(c5921b));
                    if (m23196b != mo23211L) {
                        interfaceC5945n3 = interfaceC5945n3.mo23216T(c5921b, m23196b);
                    }
                }
                return interfaceC5945n3;
            }
        }
        return interfaceC5945n2;
    }

    /* renamed from: a */
    public InterfaceC5945n m23197a(InterfaceC5945n interfaceC5945n) {
        return m23196b(C5830l.m23588X(), interfaceC5945n, this.f14598c);
    }

    public String toString() {
        return "RangeMerge{optExclusiveStart=" + this.f14596a + ", optInclusiveEnd=" + this.f14597b + ", snap=" + this.f14598c + '}';
    }
}
