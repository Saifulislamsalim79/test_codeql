package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import java.util.List;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.p545m.C13176a;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13726r;
/* compiled from: propertiesConventionUtil.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.x */
/* loaded from: classes3.dex */
public final class C12388x {
    /* renamed from: a */
    public static final List<C12614f> m9062a(C12614f c12614f) {
        List<C12614f> m3887i;
        l.f(c12614f, "name");
        String m7353b = c12614f.m7353b();
        l.e(m7353b, "name.asString()");
        C12385u c12385u = C12385u.f27466a;
        if (C12385u.m9079b(m7353b)) {
            m3887i = C13726r.m3887i(m9061b(c12614f));
            return m3887i;
        }
        C12385u c12385u2 = C12385u.f27466a;
        if (C12385u.m9078c(m7353b)) {
            return m9057f(c12614f);
        }
        return C12299g.f27335a.m9261b(c12614f);
    }

    /* renamed from: b */
    public static final C12614f m9061b(C12614f c12614f) {
        l.f(c12614f, "methodName");
        C12614f m9058e = m9058e(c12614f, "get", false, null, 12, null);
        return m9058e == null ? m9058e(c12614f, "is", false, null, 8, null) : m9058e;
    }

    /* renamed from: c */
    public static final C12614f m9060c(C12614f c12614f, boolean z) {
        l.f(c12614f, "methodName");
        return m9058e(c12614f, "set", false, z ? "is" : null, 4, null);
    }

    /* renamed from: d */
    private static final C12614f m9059d(C12614f c12614f, String str, boolean z, String str2) {
        boolean m5447E;
        String m5390k0;
        String m5390k02;
        if (c12614f.m7348j()) {
            return null;
        }
        String m7351g = c12614f.m7351g();
        l.e(m7351g, "methodName.identifier");
        boolean z2 = false;
        m5447E = C13276s.m5447E(m7351g, str, false, 2, null);
        if (m5447E && m7351g.length() != str.length()) {
            char charAt = m7351g.charAt(str.length());
            if ('a' <= charAt && charAt <= 'z') {
                z2 = true;
            }
            if (z2) {
                return null;
            }
            if (str2 != null) {
                if (!C13668y.f30115a || z) {
                    m5390k02 = C13277t.m5390k0(m7351g, str);
                    return C12614f.m7349i(l.m(str2, m5390k02));
                }
                throw new AssertionError("Assertion failed");
            } else if (z) {
                m5390k0 = C13277t.m5390k0(m7351g, str);
                String m5713c = C13176a.m5713c(m5390k0, true);
                if (C12614f.m7347m(m5713c)) {
                    return C12614f.m7349i(m5713c);
                }
                return null;
            } else {
                return c12614f;
            }
        }
        return null;
    }

    /* renamed from: e */
    static /* synthetic */ C12614f m9058e(C12614f c12614f, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return m9059d(c12614f, str, z, str2);
    }

    /* renamed from: f */
    public static final List<C12614f> m9057f(C12614f c12614f) {
        List<C12614f> m3886j;
        l.f(c12614f, "methodName");
        m3886j = C13726r.m3886j(m9060c(c12614f, false), m9060c(c12614f, true));
        return m3886j;
    }
}
