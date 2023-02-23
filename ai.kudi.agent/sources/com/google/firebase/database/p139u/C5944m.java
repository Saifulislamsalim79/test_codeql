package com.google.firebase.database.p139u;
/* compiled from: NamedNode.java */
/* renamed from: com.google.firebase.database.u.m */
/* loaded from: classes2.dex */
public final class C5944m {

    /* renamed from: c */
    private static final C5944m f14586c = new C5944m(C5921b.m23294i(), C5936g.m23249P());

    /* renamed from: d */
    private static final C5944m f14587d = new C5944m(C5921b.m23295h(), InterfaceC5945n.f14590q);

    /* renamed from: a */
    private final C5921b f14588a;

    /* renamed from: b */
    private final InterfaceC5945n f14589b;

    public C5944m(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
        this.f14588a = c5921b;
        this.f14589b = interfaceC5945n;
    }

    /* renamed from: a */
    public static C5944m m23224a() {
        return f14587d;
    }

    /* renamed from: b */
    public static C5944m m23223b() {
        return f14586c;
    }

    /* renamed from: c */
    public C5921b m23222c() {
        return this.f14588a;
    }

    /* renamed from: d */
    public InterfaceC5945n m23221d() {
        return this.f14589b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5944m.class != obj.getClass()) {
            return false;
        }
        C5944m c5944m = (C5944m) obj;
        return this.f14588a.equals(c5944m.f14588a) && this.f14589b.equals(c5944m.f14589b);
    }

    public int hashCode() {
        return (this.f14588a.hashCode() * 31) + this.f14589b.hashCode();
    }

    public String toString() {
        return "NamedNode{name=" + this.f14588a + ", node=" + this.f14589b + '}';
    }
}
