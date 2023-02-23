package com.google.firebase.database.p139u;

import com.google.firebase.database.p131s.C5830l;
/* compiled from: PathIndex.java */
/* renamed from: com.google.firebase.database.u.p */
/* loaded from: classes2.dex */
public final class C5949p extends AbstractC5937h {

    /* renamed from: c */
    private final C5830l f14594c;

    public C5949p(C5830l c5830l) {
        if (c5830l.size() == 1 && c5830l.m23587Z().m23292p()) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.f14594c = c5830l;
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: c */
    public String mo23189c() {
        return this.f14594c.m23582f0();
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: e */
    public boolean mo23188e(InterfaceC5945n interfaceC5945n) {
        return !interfaceC5945n.mo23220B(this.f14594c).isEmpty();
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5949p.class == obj.getClass() && this.f14594c.equals(((C5949p) obj).f14594c);
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: f */
    public C5944m mo23187f(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
        return new C5944m(c5921b, C5936g.m23249P().mo23218H(this.f14594c, interfaceC5945n));
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: g */
    public C5944m mo23186g() {
        return new C5944m(C5921b.m23295h(), C5936g.m23249P().mo23218H(this.f14594c, InterfaceC5945n.f14590q));
    }

    public int hashCode() {
        return this.f14594c.hashCode();
    }

    @Override // java.util.Comparator
    /* renamed from: i */
    public int compare(C5944m c5944m, C5944m c5944m2) {
        int compareTo = c5944m.m23221d().mo23220B(this.f14594c).compareTo(c5944m2.m23221d().mo23220B(this.f14594c));
        return compareTo == 0 ? c5944m.m23222c().compareTo(c5944m2.m23222c()) : compareTo;
    }
}
