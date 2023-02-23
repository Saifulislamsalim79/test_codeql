package com.google.firebase.database.p128q;

import com.google.firebase.database.p128q.InterfaceC5661h;
import java.util.Comparator;
/* compiled from: LLRBValueNode.java */
/* renamed from: com.google.firebase.database.q.j */
/* loaded from: classes2.dex */
public abstract class AbstractC5665j<K, V> implements InterfaceC5661h<K, V> {

    /* renamed from: a */
    private final K f13911a;

    /* renamed from: b */
    private final V f13912b;

    /* renamed from: c */
    private InterfaceC5661h<K, V> f13913c;

    /* renamed from: d */
    private final InterfaceC5661h<K, V> f13914d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5665j(K k, V v, InterfaceC5661h<K, V> interfaceC5661h, InterfaceC5661h<K, V> interfaceC5661h2) {
        this.f13911a = k;
        this.f13912b = v;
        this.f13913c = interfaceC5661h == null ? C5660g.m24234j() : interfaceC5661h;
        this.f13914d = interfaceC5661h2 == null ? C5660g.m24234j() : interfaceC5661h2;
    }

    /* renamed from: j */
    private AbstractC5665j<K, V> m24224j() {
        InterfaceC5661h<K, V> interfaceC5661h = this.f13913c;
        InterfaceC5661h<K, V> mo24227g = interfaceC5661h.mo24227g(null, null, m24217q(interfaceC5661h), null, null);
        InterfaceC5661h<K, V> interfaceC5661h2 = this.f13914d;
        return mo24227g(null, null, m24217q(this), mo24227g, interfaceC5661h2.mo24227g(null, null, m24217q(interfaceC5661h2), null, null));
    }

    /* renamed from: m */
    private AbstractC5665j<K, V> m24221m() {
        AbstractC5665j<K, V> m24215s = (!this.f13914d.mo24233e() || this.f13913c.mo24233e()) ? this : m24215s();
        if (m24215s.f13913c.mo24233e() && ((AbstractC5665j) m24215s.f13913c).f13913c.mo24233e()) {
            m24215s = m24215s.m24214t();
        }
        return (m24215s.f13913c.mo24233e() && m24215s.f13914d.mo24233e()) ? m24215s.m24224j() : m24215s;
    }

    /* renamed from: o */
    private AbstractC5665j<K, V> m24219o() {
        AbstractC5665j<K, V> m24224j = m24224j();
        return m24224j.mo24228f().mo24232a().mo24233e() ? m24224j.mo24222l(null, null, null, ((AbstractC5665j) m24224j.mo24228f()).m24214t()).m24215s().m24224j() : m24224j;
    }

    /* renamed from: p */
    private AbstractC5665j<K, V> m24218p() {
        AbstractC5665j<K, V> m24224j = m24224j();
        return m24224j.mo24232a().mo24232a().mo24233e() ? m24224j.m24214t().m24224j() : m24224j;
    }

    /* renamed from: q */
    private static InterfaceC5661h.EnumC5662a m24217q(InterfaceC5661h interfaceC5661h) {
        return interfaceC5661h.mo24233e() ? InterfaceC5661h.EnumC5662a.BLACK : InterfaceC5661h.EnumC5662a.RED;
    }

    /* renamed from: r */
    private InterfaceC5661h<K, V> m24216r() {
        if (this.f13913c.isEmpty()) {
            return C5660g.m24234j();
        }
        AbstractC5665j<K, V> m24219o = (mo24232a().mo24233e() || mo24232a().mo24232a().mo24233e()) ? this : m24219o();
        return m24219o.mo24222l(null, null, ((AbstractC5665j) m24219o.f13913c).m24216r(), null).m24221m();
    }

    /* renamed from: s */
    private AbstractC5665j<K, V> m24215s() {
        return (AbstractC5665j) this.f13914d.mo24227g(null, null, mo24220n(), mo24227g(null, null, InterfaceC5661h.EnumC5662a.RED, null, ((AbstractC5665j) this.f13914d).f13913c), null);
    }

    /* renamed from: t */
    private AbstractC5665j<K, V> m24214t() {
        return (AbstractC5665j) this.f13913c.mo24227g(null, null, mo24220n(), null, mo24227g(null, null, InterfaceC5661h.EnumC5662a.RED, ((AbstractC5665j) this.f13913c).f13914d, null));
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: a */
    public InterfaceC5661h<K, V> mo24232a() {
        return this.f13913c;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: b */
    public InterfaceC5661h<K, V> mo24231b(K k, V v, Comparator<K> comparator) {
        AbstractC5665j<K, V> mo24222l;
        int compare = comparator.compare(k, this.f13911a);
        if (compare < 0) {
            mo24222l = mo24222l(null, null, this.f13913c.mo24231b(k, v, comparator), null);
        } else if (compare == 0) {
            mo24222l = mo24222l(k, v, null, null);
        } else {
            mo24222l = mo24222l(null, null, null, this.f13914d.mo24231b(k, v, comparator));
        }
        return mo24222l.m24221m();
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: c */
    public InterfaceC5661h<K, V> mo24230c(K k, Comparator<K> comparator) {
        AbstractC5665j<K, V> mo24222l;
        if (comparator.compare(k, this.f13911a) < 0) {
            AbstractC5665j<K, V> m24219o = (this.f13913c.isEmpty() || this.f13913c.mo24233e() || ((AbstractC5665j) this.f13913c).f13913c.mo24233e()) ? this : m24219o();
            mo24222l = m24219o.mo24222l(null, null, m24219o.f13913c.mo24230c(k, comparator), null);
        } else {
            AbstractC5665j<K, V> m24214t = this.f13913c.mo24233e() ? m24214t() : this;
            if (!m24214t.f13914d.isEmpty() && !m24214t.f13914d.mo24233e() && !((AbstractC5665j) m24214t.f13914d).f13913c.mo24233e()) {
                m24214t = m24214t.m24218p();
            }
            if (comparator.compare(k, m24214t.f13911a) == 0) {
                if (m24214t.f13914d.isEmpty()) {
                    return C5660g.m24234j();
                }
                InterfaceC5661h<K, V> mo24226h = m24214t.f13914d.mo24226h();
                m24214t = m24214t.mo24222l(mo24226h.getKey(), mo24226h.getValue(), null, ((AbstractC5665j) m24214t.f13914d).m24216r());
            }
            mo24222l = m24214t.mo24222l(null, null, null, m24214t.f13914d.mo24230c(k, comparator));
        }
        return mo24222l.m24221m();
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: d */
    public void mo24229d(InterfaceC5661h.AbstractC5663b<K, V> abstractC5663b) {
        this.f13913c.mo24229d(abstractC5663b);
        abstractC5663b.mo23281a(this.f13911a, this.f13912b);
        this.f13914d.mo24229d(abstractC5663b);
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: f */
    public InterfaceC5661h<K, V> mo24228f() {
        return this.f13914d;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    public K getKey() {
        return this.f13911a;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    public V getValue() {
        return this.f13912b;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: h */
    public InterfaceC5661h<K, V> mo24226h() {
        return this.f13913c.isEmpty() ? this : this.f13913c.mo24226h();
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: i */
    public InterfaceC5661h<K, V> mo24225i() {
        return this.f13914d.isEmpty() ? this : this.f13914d.mo24225i();
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: k */
    public AbstractC5665j<K, V> mo24227g(K k, V v, InterfaceC5661h.EnumC5662a enumC5662a, InterfaceC5661h<K, V> interfaceC5661h, InterfaceC5661h<K, V> interfaceC5661h2) {
        if (k == null) {
            k = this.f13911a;
        }
        if (v == null) {
            v = this.f13912b;
        }
        if (interfaceC5661h == null) {
            interfaceC5661h = this.f13913c;
        }
        if (interfaceC5661h2 == null) {
            interfaceC5661h2 = this.f13914d;
        }
        if (enumC5662a == InterfaceC5661h.EnumC5662a.RED) {
            return new C5664i(k, v, interfaceC5661h, interfaceC5661h2);
        }
        return new C5659f(k, v, interfaceC5661h, interfaceC5661h2);
    }

    /* renamed from: l */
    protected abstract AbstractC5665j<K, V> mo24222l(K k, V v, InterfaceC5661h<K, V> interfaceC5661h, InterfaceC5661h<K, V> interfaceC5661h2);

    /* renamed from: n */
    protected abstract InterfaceC5661h.EnumC5662a mo24220n();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo24213u(InterfaceC5661h<K, V> interfaceC5661h) {
        this.f13913c = interfaceC5661h;
    }
}
