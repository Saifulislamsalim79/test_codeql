package p565l.p566g0.p568f;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14216l;
import p565l.C14229s;
import p565l.C14231t;
import p565l.InterfaceC14217m;
import p565l.p566g0.C14148c;
import p576m.C14347f;
/* compiled from: HttpHeaders.java */
/* renamed from: l.g0.f.e */
/* loaded from: classes3.dex */
public final class C14172e {
    static {
        C14347f.m2035m("\"\\");
        C14347f.m2035m("\t ,=");
    }

    /* renamed from: a */
    public static long m2729a(C14229s c14229s) {
        return m2720j(c14229s.m2550c("Content-Length"));
    }

    /* renamed from: b */
    public static long m2728b(C14131c0 c14131c0) {
        return m2729a(c14131c0.m2883P());
    }

    /* renamed from: c */
    public static boolean m2727c(C14131c0 c14131c0) {
        if (c14131c0.m2873k0().m2915g().equals("HEAD")) {
            return false;
        }
        int m2887F = c14131c0.m2887F();
        return (((m2887F >= 100 && m2887F < 200) || m2887F == 204 || m2887F == 304) && m2728b(c14131c0) == -1 && !"chunked".equalsIgnoreCase(c14131c0.m2885J("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: d */
    public static boolean m2726d(C14229s c14229s) {
        return m2719k(c14229s).contains("*");
    }

    /* renamed from: e */
    public static boolean m2725e(C14131c0 c14131c0) {
        return m2726d(c14131c0.m2883P());
    }

    /* renamed from: f */
    public static int m2724f(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: g */
    public static void m2723g(InterfaceC14217m interfaceC14217m, C14231t c14231t, C14229s c14229s) {
        if (interfaceC14217m == InterfaceC14217m.f31129a) {
            return;
        }
        List<C14216l> m2601f = C14216l.m2601f(c14231t, c14229s);
        if (m2601f.isEmpty()) {
            return;
        }
        interfaceC14217m.mo2595a(c14231t, m2601f);
    }

    /* renamed from: h */
    public static int m2722h(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: i */
    public static int m2721i(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    /* renamed from: j */
    private static long m2720j(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: k */
    public static Set<String> m2719k(C14229s c14229s) {
        Set<String> emptySet = Collections.emptySet();
        int m2545h = c14229s.m2545h();
        for (int i = 0; i < m2545h; i++) {
            if ("Vary".equalsIgnoreCase(c14229s.m2548e(i))) {
                String m2544i = c14229s.m2544i(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : m2544i.split(",")) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    /* renamed from: l */
    private static Set<String> m2718l(C14131c0 c14131c0) {
        return m2719k(c14131c0.m2883P());
    }

    /* renamed from: m */
    public static C14229s m2717m(C14229s c14229s, C14229s c14229s2) {
        Set<String> m2719k = m2719k(c14229s2);
        if (m2719k.isEmpty()) {
            return new C14229s.C14230a().m2539d();
        }
        C14229s.C14230a c14230a = new C14229s.C14230a();
        int m2545h = c14229s.m2545h();
        for (int i = 0; i < m2545h; i++) {
            String m2548e = c14229s.m2548e(i);
            if (m2719k.contains(m2548e)) {
                c14230a.m2542a(m2548e, c14229s.m2544i(i));
            }
        }
        return c14230a.m2539d();
    }

    /* renamed from: n */
    public static C14229s m2716n(C14131c0 c14131c0) {
        return m2717m(c14131c0.m2880Z().m2873k0().m2917e(), c14131c0.m2883P());
    }

    /* renamed from: o */
    public static boolean m2715o(C14131c0 c14131c0, C14229s c14229s, C14116a0 c14116a0) {
        for (String str : m2718l(c14131c0)) {
            if (!C14148c.m2791q(c14229s.m2543j(str), c14116a0.m2918d(str))) {
                return false;
            }
        }
        return true;
    }
}
