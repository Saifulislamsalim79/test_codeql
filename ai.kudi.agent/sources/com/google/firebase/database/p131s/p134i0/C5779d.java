package com.google.firebase.database.p131s.p134i0;

import com.google.firebase.database.p128q.AbstractC5653c;
import com.google.firebase.database.p128q.C5672l;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p139u.C5921b;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ImmutableTree.java */
/* renamed from: com.google.firebase.database.s.i0.d */
/* loaded from: classes2.dex */
public final class C5779d<T> implements Iterable<Map.Entry<C5830l, T>> {

    /* renamed from: e */
    private static final AbstractC5653c f14207e;

    /* renamed from: f */
    private static final C5779d f14208f;

    /* renamed from: c */
    private final T f14209c;

    /* renamed from: d */
    private final AbstractC5653c<C5921b, C5779d<T>> f14210d;

    /* compiled from: ImmutableTree.java */
    /* renamed from: com.google.firebase.database.s.i0.d$a */
    /* loaded from: classes2.dex */
    class C5780a implements InterfaceC5782c<T, Void> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f14211a;

        C5780a(C5779d c5779d, ArrayList arrayList) {
            this.f14211a = arrayList;
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5779d.InterfaceC5782c
        /* renamed from: b */
        public Void mo23405a(C5830l c5830l, T t, Void r3) {
            this.f14211a.add(t);
            return null;
        }
    }

    /* compiled from: ImmutableTree.java */
    /* renamed from: com.google.firebase.database.s.i0.d$b */
    /* loaded from: classes2.dex */
    class C5781b implements InterfaceC5782c<T, Void> {

        /* renamed from: a */
        final /* synthetic */ List f14212a;

        C5781b(C5779d c5779d, List list) {
            this.f14212a = list;
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5779d.InterfaceC5782c
        /* renamed from: b */
        public Void mo23405a(C5830l c5830l, T t, Void r4) {
            this.f14212a.add(new AbstractMap.SimpleImmutableEntry(c5830l, t));
            return null;
        }
    }

    /* compiled from: ImmutableTree.java */
    /* renamed from: com.google.firebase.database.s.i0.d$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC5782c<T, R> {
        /* renamed from: a */
        R mo23405a(C5830l c5830l, T t, R r);
    }

    static {
        AbstractC5653c m24246b = AbstractC5653c.C5654a.m24246b(C5672l.m24191b(C5921b.class));
        f14207e = m24246b;
        f14208f = new C5779d(null, m24246b);
    }

    public C5779d(T t, AbstractC5653c<C5921b, C5779d<T>> abstractC5653c) {
        this.f14209c = t;
        this.f14210d = abstractC5653c;
    }

    /* renamed from: e */
    public static <V> C5779d<V> m23785e() {
        return f14208f;
    }

    /* renamed from: k */
    private <R> R m23782k(C5830l c5830l, InterfaceC5782c<? super T, R> interfaceC5782c, R r) {
        Iterator<Map.Entry<C5921b, C5779d<T>>> it = this.f14210d.iterator();
        while (it.hasNext()) {
            Map.Entry<C5921b, C5779d<T>> next = it.next();
            r = (R) next.getValue().m23782k(c5830l.m23592J(next.getKey()), interfaceC5782c, r);
        }
        Object obj = this.f14209c;
        return obj != null ? interfaceC5782c.mo23405a(c5830l, obj, r) : r;
    }

    /* renamed from: E */
    public AbstractC5653c<C5921b, C5779d<T>> m23795E() {
        return this.f14210d;
    }

    /* renamed from: F */
    public T m23794F(C5830l c5830l) {
        return m23793I(c5830l, InterfaceC5787i.f14219a);
    }

    /* renamed from: I */
    public T m23793I(C5830l c5830l, InterfaceC5787i<? super T> interfaceC5787i) {
        Object obj = (T) this.f14209c;
        T t = (obj == null || !interfaceC5787i.mo23768a(obj)) ? null : this.f14209c;
        Iterator<C5921b> it = c5830l.iterator();
        C5779d<T> c5779d = this;
        while (it.hasNext()) {
            c5779d = c5779d.f14210d.mo24207e(it.next());
            if (c5779d == null) {
                return t;
            }
            Object obj2 = (T) c5779d.f14209c;
            if (obj2 != null && interfaceC5787i.mo23768a(obj2)) {
                t = c5779d.f14209c;
            }
        }
        return t;
    }

    /* renamed from: J */
    public C5779d<T> m23792J(C5830l c5830l) {
        AbstractC5653c<C5921b, C5779d<T>> mo24201s;
        if (c5830l.isEmpty()) {
            if (this.f14210d.isEmpty()) {
                return m23785e();
            }
            return new C5779d<>(null, this.f14210d);
        }
        C5921b m23587Z = c5830l.m23587Z();
        C5779d<T> mo24207e = this.f14210d.mo24207e(m23587Z);
        if (mo24207e != null) {
            C5779d<T> m23792J = mo24207e.m23792J(c5830l.m23583e0());
            if (m23792J.isEmpty()) {
                mo24201s = this.f14210d.mo24200u(m23587Z);
            } else {
                mo24201s = this.f14210d.mo24201s(m23587Z, m23792J);
            }
            if (this.f14209c == null && mo24201s.isEmpty()) {
                return m23785e();
            }
            return new C5779d<>(this.f14209c, mo24201s);
        }
        return this;
    }

    /* renamed from: O */
    public T m23791O(C5830l c5830l, InterfaceC5787i<? super T> interfaceC5787i) {
        Object obj = (T) this.f14209c;
        if (obj != null && interfaceC5787i.mo23768a(obj)) {
            return this.f14209c;
        }
        Iterator<C5921b> it = c5830l.iterator();
        C5779d<T> c5779d = this;
        while (it.hasNext()) {
            c5779d = c5779d.f14210d.mo24207e(it.next());
            if (c5779d == null) {
                return null;
            }
            Object obj2 = (T) c5779d.f14209c;
            if (obj2 != null && interfaceC5787i.mo23768a(obj2)) {
                return c5779d.f14209c;
            }
        }
        return null;
    }

    /* renamed from: P */
    public C5779d<T> m23790P(C5830l c5830l, T t) {
        if (c5830l.isEmpty()) {
            return new C5779d<>(t, this.f14210d);
        }
        C5921b m23587Z = c5830l.m23587Z();
        C5779d<T> mo24207e = this.f14210d.mo24207e(m23587Z);
        if (mo24207e == null) {
            mo24207e = m23785e();
        }
        return new C5779d<>(this.f14209c, this.f14210d.mo24201s(m23587Z, mo24207e.m23790P(c5830l.m23583e0(), t)));
    }

    /* renamed from: V */
    public C5779d<T> m23789V(C5830l c5830l, C5779d<T> c5779d) {
        AbstractC5653c<C5921b, C5779d<T>> mo24201s;
        if (c5830l.isEmpty()) {
            return c5779d;
        }
        C5921b m23587Z = c5830l.m23587Z();
        C5779d<T> mo24207e = this.f14210d.mo24207e(m23587Z);
        if (mo24207e == null) {
            mo24207e = m23785e();
        }
        C5779d<T> m23789V = mo24207e.m23789V(c5830l.m23583e0(), c5779d);
        if (m23789V.isEmpty()) {
            mo24201s = this.f14210d.mo24200u(m23587Z);
        } else {
            mo24201s = this.f14210d.mo24201s(m23587Z, m23789V);
        }
        return new C5779d<>(this.f14209c, mo24201s);
    }

    /* renamed from: X */
    public C5779d<T> m23788X(C5830l c5830l) {
        if (c5830l.isEmpty()) {
            return this;
        }
        C5779d<T> mo24207e = this.f14210d.mo24207e(c5830l.m23587Z());
        if (mo24207e != null) {
            return mo24207e.m23788X(c5830l.m23583e0());
        }
        return m23785e();
    }

    /* renamed from: Z */
    public Collection<T> m23787Z() {
        ArrayList arrayList = new ArrayList();
        m23780m(new C5780a(this, arrayList));
        return arrayList;
    }

    /* renamed from: d */
    public boolean m23786d(InterfaceC5787i<? super T> interfaceC5787i) {
        Object obj = (T) this.f14209c;
        if (obj == null || !interfaceC5787i.mo23768a(obj)) {
            Iterator<Map.Entry<C5921b, C5779d<T>>> it = this.f14210d.iterator();
            while (it.hasNext()) {
                if (it.next().getValue().m23786d(interfaceC5787i)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5779d.class != obj.getClass()) {
            return false;
        }
        C5779d c5779d = (C5779d) obj;
        AbstractC5653c<C5921b, C5779d<T>> abstractC5653c = this.f14210d;
        if (abstractC5653c == null ? c5779d.f14210d == null : abstractC5653c.equals(c5779d.f14210d)) {
            T t = this.f14209c;
            T t2 = c5779d.f14209c;
            return t == null ? t2 == null : t.equals(t2);
        }
        return false;
    }

    /* renamed from: f */
    public C5830l m23784f(C5830l c5830l, InterfaceC5787i<? super T> interfaceC5787i) {
        C5921b m23587Z;
        C5779d<T> mo24207e;
        C5830l m23784f;
        Object obj = (T) this.f14209c;
        if (obj != null && interfaceC5787i.mo23768a(obj)) {
            return C5830l.m23588X();
        }
        if (c5830l.isEmpty() || (mo24207e = this.f14210d.mo24207e((m23587Z = c5830l.m23587Z()))) == null || (m23784f = mo24207e.m23784f(c5830l.m23583e0(), interfaceC5787i)) == null) {
            return null;
        }
        return new C5830l(m23587Z).m23593I(m23784f);
    }

    public T getValue() {
        return this.f14209c;
    }

    /* renamed from: h */
    public C5830l m23783h(C5830l c5830l) {
        return m23784f(c5830l, InterfaceC5787i.f14219a);
    }

    public int hashCode() {
        T t = this.f14209c;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        AbstractC5653c<C5921b, C5779d<T>> abstractC5653c = this.f14210d;
        return hashCode + (abstractC5653c != null ? abstractC5653c.hashCode() : 0);
    }

    public boolean isEmpty() {
        return this.f14209c == null && this.f14210d.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<C5830l, T>> iterator() {
        ArrayList arrayList = new ArrayList();
        m23780m(new C5781b(this, arrayList));
        return arrayList.iterator();
    }

    /* renamed from: l */
    public <R> R m23781l(R r, InterfaceC5782c<? super T, R> interfaceC5782c) {
        return (R) m23782k(C5830l.m23588X(), interfaceC5782c, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public void m23780m(InterfaceC5782c<T, Void> interfaceC5782c) {
        m23782k(C5830l.m23588X(), interfaceC5782c, null);
    }

    /* renamed from: s */
    public T m23779s(C5830l c5830l) {
        if (c5830l.isEmpty()) {
            return this.f14209c;
        }
        C5779d<T> mo24207e = this.f14210d.mo24207e(c5830l.m23587Z());
        if (mo24207e != null) {
            return mo24207e.m23779s(c5830l.m23583e0());
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImmutableTree { value=");
        sb.append(getValue());
        sb.append(", children={");
        Iterator<Map.Entry<C5921b, C5779d<T>>> it = this.f14210d.iterator();
        while (it.hasNext()) {
            Map.Entry<C5921b, C5779d<T>> next = it.next();
            sb.append(next.getKey().m23298b());
            sb.append("=");
            sb.append(next.getValue());
        }
        sb.append("} }");
        return sb.toString();
    }

    /* renamed from: u */
    public C5779d<T> m23778u(C5921b c5921b) {
        C5779d<T> mo24207e = this.f14210d.mo24207e(c5921b);
        return mo24207e != null ? mo24207e : m23785e();
    }

    public C5779d(T t) {
        this(t, f14207e);
    }
}
