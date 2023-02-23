package com.google.firebase.database.p139u;
/* compiled from: PriorityIndex.java */
/* renamed from: com.google.firebase.database.u.q */
/* loaded from: classes2.dex */
public class C5950q extends AbstractC5937h {

    /* renamed from: c */
    private static final C5950q f14595c = new C5950q();

    private C5950q() {
    }

    /* renamed from: j */
    public static C5950q m23202j() {
        return f14595c;
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: c */
    public String mo23189c() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: e */
    public boolean mo23188e(InterfaceC5945n interfaceC5945n) {
        return !interfaceC5945n.mo23208x().isEmpty();
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof C5950q;
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: f */
    public C5944m mo23187f(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
        return new C5944m(c5921b, new C5953t("[PRIORITY-POST]", interfaceC5945n));
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: g */
    public C5944m mo23186g() {
        return mo23187f(C5921b.m23295h(), InterfaceC5945n.f14590q);
    }

    public int hashCode() {
        return 3155577;
    }

    @Override // java.util.Comparator
    /* renamed from: i */
    public int compare(C5944m c5944m, C5944m c5944m2) {
        return C5948o.m23205c(c5944m.m23222c(), c5944m.m23221d().mo23208x(), c5944m2.m23222c(), c5944m2.m23221d().mo23208x());
    }

    public String toString() {
        return "PriorityIndex";
    }
}
