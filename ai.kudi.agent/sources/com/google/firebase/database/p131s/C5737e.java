package com.google.firebase.database.p131s;

import com.google.firebase.database.p131s.p134i0.C5779d;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5944m;
import com.google.firebase.database.p139u.C5948o;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: CompoundWrite.java */
/* renamed from: com.google.firebase.database.s.e */
/* loaded from: classes2.dex */
public final class C5737e implements Iterable<Map.Entry<C5830l, InterfaceC5945n>> {

    /* renamed from: d */
    private static final C5737e f14121d = new C5737e(new C5779d(null));

    /* renamed from: c */
    private final C5779d<InterfaceC5945n> f14122c;

    /* compiled from: CompoundWrite.java */
    /* renamed from: com.google.firebase.database.s.e$a */
    /* loaded from: classes2.dex */
    class C5738a implements C5779d.InterfaceC5782c<InterfaceC5945n, C5737e> {

        /* renamed from: a */
        final /* synthetic */ C5830l f14123a;

        C5738a(C5737e c5737e, C5830l c5830l) {
            this.f14123a = c5830l;
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5779d.InterfaceC5782c
        /* renamed from: b */
        public C5737e mo23405a(C5830l c5830l, InterfaceC5945n interfaceC5945n, C5737e c5737e) {
            return c5737e.m23970d(this.f14123a.m23593I(c5830l), interfaceC5945n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompoundWrite.java */
    /* renamed from: com.google.firebase.database.s.e$b */
    /* loaded from: classes2.dex */
    public class C5739b implements C5779d.InterfaceC5782c<InterfaceC5945n, Void> {

        /* renamed from: a */
        final /* synthetic */ Map f14124a;

        /* renamed from: b */
        final /* synthetic */ boolean f14125b;

        C5739b(C5737e c5737e, Map map, boolean z) {
            this.f14124a = map;
            this.f14125b = z;
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5779d.InterfaceC5782c
        /* renamed from: b */
        public Void mo23405a(C5830l c5830l, InterfaceC5945n interfaceC5945n, Void r4) {
            this.f14124a.put(c5830l.m23582f0(), interfaceC5945n.mo23215W(this.f14125b));
            return null;
        }
    }

    private C5737e(C5779d<InterfaceC5945n> c5779d) {
        this.f14122c = c5779d;
    }

    /* renamed from: E */
    public static C5737e m23977E(Map<String, Object> map) {
        C5779d m23785e = C5779d.m23785e();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            m23785e = m23785e.m23789V(new C5830l(entry.getKey()), new C5779d(C5948o.m23207a(entry.getValue())));
        }
        return new C5737e(m23785e);
    }

    /* renamed from: k */
    private InterfaceC5945n m23966k(C5830l c5830l, C5779d<InterfaceC5945n> c5779d, InterfaceC5945n interfaceC5945n) {
        if (c5779d.getValue() != null) {
            return interfaceC5945n.mo23218H(c5830l, c5779d.getValue());
        }
        InterfaceC5945n interfaceC5945n2 = null;
        Iterator<Map.Entry<C5921b, C5779d<InterfaceC5945n>>> it = c5779d.m23795E().iterator();
        while (it.hasNext()) {
            Map.Entry<C5921b, C5779d<InterfaceC5945n>> next = it.next();
            C5779d<InterfaceC5945n> value = next.getValue();
            C5921b key = next.getKey();
            if (key.m23292p()) {
                C5795m.m23744g(value.getValue() != null, "Priority writes must always be leaf nodes");
                interfaceC5945n2 = value.getValue();
            } else {
                interfaceC5945n = m23966k(c5830l.m23592J(key), value, interfaceC5945n);
            }
        }
        return (interfaceC5945n.mo23220B(c5830l).isEmpty() || interfaceC5945n2 == null) ? interfaceC5945n : interfaceC5945n.mo23218H(c5830l.m23592J(C5921b.m23293j()), interfaceC5945n2);
    }

    /* renamed from: s */
    public static C5737e m23963s() {
        return f14121d;
    }

    /* renamed from: u */
    public static C5737e m23962u(Map<C5830l, InterfaceC5945n> map) {
        C5779d m23785e = C5779d.m23785e();
        for (Map.Entry<C5830l, InterfaceC5945n> entry : map.entrySet()) {
            m23785e = m23785e.m23789V(entry.getKey(), new C5779d(entry.getValue()));
        }
        return new C5737e(m23785e);
    }

    /* renamed from: F */
    public List<C5944m> m23976F() {
        ArrayList arrayList = new ArrayList();
        if (this.f14122c.getValue() != null) {
            for (C5944m c5944m : this.f14122c.getValue()) {
                arrayList.add(new C5944m(c5944m.m23222c(), c5944m.m23221d()));
            }
        } else {
            Iterator<Map.Entry<C5921b, C5779d<InterfaceC5945n>>> it = this.f14122c.m23795E().iterator();
            while (it.hasNext()) {
                Map.Entry<C5921b, C5779d<InterfaceC5945n>> next = it.next();
                C5779d<InterfaceC5945n> value = next.getValue();
                if (value.getValue() != null) {
                    arrayList.add(new C5944m(next.getKey(), value.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: I */
    public InterfaceC5945n m23975I(C5830l c5830l) {
        C5830l m23783h = this.f14122c.m23783h(c5830l);
        if (m23783h != null) {
            return this.f14122c.m23779s(m23783h).mo23220B(C5830l.m23585d0(m23783h, c5830l));
        }
        return null;
    }

    /* renamed from: J */
    public Map<String, Object> m23974J(boolean z) {
        HashMap hashMap = new HashMap();
        this.f14122c.m23780m(new C5739b(this, hashMap, z));
        return hashMap;
    }

    /* renamed from: O */
    public boolean m23973O(C5830l c5830l) {
        return m23975I(c5830l) != null;
    }

    /* renamed from: P */
    public C5737e m23972P(C5830l c5830l) {
        if (c5830l.isEmpty()) {
            return f14121d;
        }
        return new C5737e(this.f14122c.m23789V(c5830l, C5779d.m23785e()));
    }

    /* renamed from: V */
    public InterfaceC5945n m23971V() {
        return this.f14122c.getValue();
    }

    /* renamed from: d */
    public C5737e m23970d(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
        if (c5830l.isEmpty()) {
            return new C5737e(new C5779d(interfaceC5945n));
        }
        C5830l m23783h = this.f14122c.m23783h(c5830l);
        if (m23783h != null) {
            C5830l m23585d0 = C5830l.m23585d0(m23783h, c5830l);
            InterfaceC5945n m23779s = this.f14122c.m23779s(m23783h);
            C5921b m23589V = m23585d0.m23589V();
            if (m23589V != null && m23589V.m23292p() && m23779s.mo23220B(m23585d0.m23586b0()).isEmpty()) {
                return this;
            }
            return new C5737e(this.f14122c.m23790P(m23783h, m23779s.mo23218H(m23585d0, interfaceC5945n)));
        }
        return new C5737e(this.f14122c.m23789V(c5830l, new C5779d<>(interfaceC5945n)));
    }

    /* renamed from: e */
    public C5737e m23969e(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
        return m23970d(new C5830l(c5921b), interfaceC5945n);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C5737e.class) {
            return false;
        }
        return ((C5737e) obj).m23974J(true).equals(m23974J(true));
    }

    /* renamed from: f */
    public C5737e m23968f(C5830l c5830l, C5737e c5737e) {
        return (C5737e) c5737e.f14122c.m23781l(this, new C5738a(this, c5830l));
    }

    /* renamed from: h */
    public InterfaceC5945n m23967h(InterfaceC5945n interfaceC5945n) {
        return m23966k(C5830l.m23588X(), this.f14122c, interfaceC5945n);
    }

    public int hashCode() {
        return m23974J(true).hashCode();
    }

    public boolean isEmpty() {
        return this.f14122c.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<C5830l, InterfaceC5945n>> iterator() {
        return this.f14122c.iterator();
    }

    /* renamed from: l */
    public C5737e m23965l(C5830l c5830l) {
        if (c5830l.isEmpty()) {
            return this;
        }
        InterfaceC5945n m23975I = m23975I(c5830l);
        if (m23975I != null) {
            return new C5737e(new C5779d(m23975I));
        }
        return new C5737e(this.f14122c.m23788X(c5830l));
    }

    /* renamed from: m */
    public Map<C5921b, C5737e> m23964m() {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<C5921b, C5779d<InterfaceC5945n>>> it = this.f14122c.m23795E().iterator();
        while (it.hasNext()) {
            Map.Entry<C5921b, C5779d<InterfaceC5945n>> next = it.next();
            hashMap.put(next.getKey(), new C5737e(next.getValue()));
        }
        return hashMap;
    }

    public String toString() {
        return "CompoundWrite{" + m23974J(true).toString() + "}";
    }
}
