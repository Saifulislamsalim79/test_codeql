package kotlin.p493j0.p494o.p495c.p497p0.p522h;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12610d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
/* compiled from: RenderingUtils.kt */
/* renamed from: kotlin.j0.o.c.p0.h.n */
/* loaded from: classes3.dex */
public final class C12664n {
    /* renamed from: a */
    public static final String m7081a(C12610d c12610d) {
        l.f(c12610d, "<this>");
        List<C12614f> m7365h = c12610d.m7365h();
        l.e(m7365h, "pathSegments()");
        return m7079c(m7365h);
    }

    /* renamed from: b */
    public static final String m7080b(C12614f c12614f) {
        l.f(c12614f, "<this>");
        if (!m7078d(c12614f)) {
            String m7353b = c12614f.m7353b();
            l.e(m7353b, "asString()");
            return m7353b;
        }
        String m7353b2 = c12614f.m7353b();
        l.e(m7353b2, "asString()");
        return l.m(String.valueOf('`') + m7353b2, "`");
    }

    /* renamed from: c */
    public static final String m7079c(List<C12614f> list) {
        l.f(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (C12614f c12614f : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m7080b(c12614f));
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: d */
    private static final boolean m7078d(C12614f c12614f) {
        boolean z;
        if (c12614f.m7348j()) {
            return false;
        }
        String m7353b = c12614f.m7353b();
        l.e(m7353b, "asString()");
        if (!C12657i.f28503a.contains(m7353b)) {
            int i = 0;
            while (true) {
                if (i >= m7353b.length()) {
                    z = false;
                    break;
                }
                char charAt = m7353b.charAt(i);
                if ((Character.isLetterOrDigit(charAt) || charAt == '_') ? false : true) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
