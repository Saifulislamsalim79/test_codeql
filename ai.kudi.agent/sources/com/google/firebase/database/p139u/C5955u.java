package com.google.firebase.database.p139u;
/* compiled from: ValueIndex.java */
/* renamed from: com.google.firebase.database.u.u */
/* loaded from: classes2.dex */
public class C5955u extends AbstractC5937h {

    /* renamed from: c */
    private static final C5955u f14601c = new C5955u();

    private C5955u() {
    }

    /* renamed from: j */
    public static C5955u m23184j() {
        return f14601c;
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: c */
    public String mo23189c() {
        return ".value";
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: e */
    public boolean mo23188e(InterfaceC5945n interfaceC5945n) {
        return true;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof C5955u;
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: f */
    public C5944m mo23187f(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
        return new C5944m(c5921b, interfaceC5945n);
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: g */
    public C5944m mo23186g() {
        return new C5944m(C5921b.m23295h(), InterfaceC5945n.f14590q);
    }

    public int hashCode() {
        return 4;
    }

    @Override // java.util.Comparator
    /* renamed from: i */
    public int compare(C5944m c5944m, C5944m c5944m2) {
        int compareTo = c5944m.m23221d().compareTo(c5944m2.m23221d());
        return compareTo == 0 ? c5944m.m23222c().compareTo(c5944m2.m23222c()) : compareTo;
    }

    public String toString() {
        return "ValueIndex";
    }
}
