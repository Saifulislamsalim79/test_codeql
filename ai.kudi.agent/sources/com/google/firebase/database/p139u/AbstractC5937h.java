package com.google.firebase.database.p139u;

import com.google.firebase.database.p131s.C5830l;
import java.util.Comparator;
/* compiled from: Index.java */
/* renamed from: com.google.firebase.database.u.h */
/* loaded from: classes2.dex */
public abstract class AbstractC5937h implements Comparator<C5944m> {
    /* renamed from: b */
    public static AbstractC5937h m23246b(String str) {
        if (str.equals(".value")) {
            return C5955u.m23184j();
        }
        if (str.equals(".key")) {
            return C5939j.m23231j();
        }
        if (!str.equals(".priority")) {
            return new C5949p(new C5830l(str));
        }
        throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
    }

    /* renamed from: a */
    public int m23247a(C5944m c5944m, C5944m c5944m2, boolean z) {
        if (z) {
            return compare(c5944m2, c5944m);
        }
        return compare(c5944m, c5944m2);
    }

    /* renamed from: c */
    public abstract String mo23189c();

    /* renamed from: d */
    public boolean m23245d(InterfaceC5945n interfaceC5945n, InterfaceC5945n interfaceC5945n2) {
        return compare(new C5944m(C5921b.m23294i(), interfaceC5945n), new C5944m(C5921b.m23294i(), interfaceC5945n2)) != 0;
    }

    /* renamed from: e */
    public abstract boolean mo23188e(InterfaceC5945n interfaceC5945n);

    /* renamed from: f */
    public abstract C5944m mo23187f(C5921b c5921b, InterfaceC5945n interfaceC5945n);

    /* renamed from: g */
    public abstract C5944m mo23186g();

    /* renamed from: h */
    public C5944m m23244h() {
        return C5944m.m23223b();
    }
}
