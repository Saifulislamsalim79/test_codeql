package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.p545m.C13176a;
import kotlin.p549l0.C13276s;
/* compiled from: JvmAbi.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.u */
/* loaded from: classes3.dex */
public final class C12385u {

    /* renamed from: a */
    public static final C12385u f27466a = new C12385u();

    /* renamed from: b */
    public static final C12609c f27467b = new C12609c("kotlin.jvm.JvmField");

    static {
        l.e(C12608b.m7384m(new C12609c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl")), "topLevel(FqName(\"kotlin.reflect.jvm.internal.ReflectionFactoryImpl\"))");
    }

    private C12385u() {
    }

    /* renamed from: a */
    public static final String m9080a(String str) {
        l.f(str, "propertyName");
        return m9076e(str) ? str : l.m("get", C13176a.m5715a(str));
    }

    /* renamed from: b */
    public static final boolean m9079b(String str) {
        boolean m5447E;
        boolean m5447E2;
        l.f(str, "name");
        m5447E = C13276s.m5447E(str, "get", false, 2, null);
        if (!m5447E) {
            m5447E2 = C13276s.m5447E(str, "is", false, 2, null);
            if (!m5447E2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m9078c(String str) {
        boolean m5447E;
        l.f(str, "name");
        m5447E = C13276s.m5447E(str, "set", false, 2, null);
        return m5447E;
    }

    /* renamed from: d */
    public static final String m9077d(String str) {
        String m5715a;
        l.f(str, "propertyName");
        if (m9076e(str)) {
            m5715a = str.substring(2);
            l.e(m5715a, "(this as java.lang.String).substring(startIndex)");
        } else {
            m5715a = C13176a.m5715a(str);
        }
        return l.m("set", m5715a);
    }

    /* renamed from: e */
    public static final boolean m9076e(String str) {
        boolean m5447E;
        l.f(str, "name");
        m5447E = C13276s.m5447E(str, "is", false, 2, null);
        if (m5447E && str.length() != 2) {
            char charAt = str.charAt(2);
            return l.h(97, charAt) > 0 || l.h(charAt, 122) > 0;
        }
        return false;
    }
}
