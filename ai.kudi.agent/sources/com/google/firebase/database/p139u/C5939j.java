package com.google.firebase.database.p139u;

import com.google.firebase.database.p131s.p134i0.C5795m;
/* compiled from: KeyIndex.java */
/* renamed from: com.google.firebase.database.u.j */
/* loaded from: classes2.dex */
public class C5939j extends AbstractC5937h {

    /* renamed from: c */
    private static final C5939j f14576c = new C5939j();

    private C5939j() {
    }

    /* renamed from: j */
    public static C5939j m23231j() {
        return f14576c;
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: c */
    public String mo23189c() {
        return ".key";
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: e */
    public boolean mo23188e(InterfaceC5945n interfaceC5945n) {
        return true;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof C5939j;
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: f */
    public C5944m mo23187f(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
        C5795m.m23745f(interfaceC5945n instanceof C5953t);
        return new C5944m(C5921b.m23296g((String) interfaceC5945n.getValue()), C5936g.m23249P());
    }

    @Override // com.google.firebase.database.p139u.AbstractC5937h
    /* renamed from: g */
    public C5944m mo23186g() {
        return C5944m.m23224a();
    }

    public int hashCode() {
        return 37;
    }

    @Override // java.util.Comparator
    /* renamed from: i */
    public int compare(C5944m c5944m, C5944m c5944m2) {
        return c5944m.m23222c().compareTo(c5944m2.m23222c());
    }

    public String toString() {
        return "KeyIndex";
    }
}
