package p577n.p587c;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p577n.p587c.p588d.C14465e;
import p577n.p587c.p588d.C14467g;
import p577n.p587c.p588d.C14468h;
import p577n.p587c.p588d.C14469i;
import p577n.p587c.p589e.C14472c;
/* compiled from: LoggerFactory.java */
/* renamed from: n.c.c */
/* loaded from: classes3.dex */
public final class C14460c {

    /* renamed from: a */
    static int f31825a;

    /* renamed from: b */
    static C14468h f31826b = new C14468h();

    /* renamed from: c */
    static C14465e f31827c = new C14465e();

    /* renamed from: d */
    private static final String[] f31828d = {"1.6", "1.7"};

    /* renamed from: e */
    private static String f31829e = "org/slf4j/impl/StaticLoggerBinder.class";

    private C14460c() {
    }

    /* renamed from: a */
    private static final void m1685a() {
        try {
            Set m1683c = m1683c();
            m1674l(m1683c);
            C14472c.m1628c();
            f31825a = 3;
            m1675k(m1683c);
            m1682d();
        } catch (Exception e) {
            m1684b(e);
            throw new IllegalStateException("Unexpected initialization failure", e);
        } catch (NoClassDefFoundError e2) {
            if (m1677i(e2.getMessage())) {
                f31825a = 4;
                C14469i.m1648a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                C14469i.m1648a("Defaulting to no-operation (NOP) logger implementation");
                C14469i.m1648a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                return;
            }
            m1684b(e2);
            throw e2;
        } catch (NoSuchMethodError e3) {
            String message = e3.getMessage();
            if (message != null && message.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") != -1) {
                f31825a = 2;
                C14469i.m1648a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                C14469i.m1648a("Your binding is version 1.5.5 or earlier.");
                C14469i.m1648a("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        }
    }

    /* renamed from: b */
    static void m1684b(Throwable th) {
        f31825a = 2;
        C14469i.m1647b("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: c */
    private static Set m1683c() {
        Enumeration<URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C14460c.class.getClassLoader();
            if (classLoader == null) {
                resources = ClassLoader.getSystemResources(f31829e);
            } else {
                resources = classLoader.getResources(f31829e);
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
        } catch (IOException e) {
            C14469i.m1647b("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: d */
    private static final void m1682d() {
        List<C14467g> m1649c = f31826b.m1649c();
        if (m1649c.isEmpty()) {
            return;
        }
        C14469i.m1648a("The following set of substitute loggers may have been accessed");
        C14469i.m1648a("during the initialization phase. Logging calls during this");
        C14469i.m1648a("phase were not honored. However, subsequent logging calls to these");
        C14469i.m1648a("loggers will work as normally expected.");
        C14469i.m1648a("See also http://www.slf4j.org/codes.html#substituteLogger");
        for (C14467g c14467g : m1649c) {
            c14467g.m1651l(m1679g(c14467g.m1652k()));
            C14469i.m1648a(c14467g.m1652k());
        }
        f31826b.m1650b();
    }

    /* renamed from: e */
    public static InterfaceC14458a m1681e() {
        if (f31825a == 0) {
            f31825a = 1;
            m1676j();
        }
        int i = f31825a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return f31827c;
                    }
                    throw new IllegalStateException("Unreachable code");
                }
                return C14472c.m1628c().m1630a();
            }
            throw new IllegalStateException("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        return f31826b;
    }

    /* renamed from: f */
    public static InterfaceC14459b m1680f(Class cls) {
        return m1679g(cls.getName());
    }

    /* renamed from: g */
    public static InterfaceC14459b m1679g(String str) {
        return m1681e().mo1633a(str);
    }

    /* renamed from: h */
    private static boolean m1678h(Set set) {
        return set.size() > 1;
    }

    /* renamed from: i */
    private static boolean m1677i(String str) {
        if (str == null) {
            return false;
        }
        return (str.indexOf("org/slf4j/impl/StaticLoggerBinder") == -1 && str.indexOf("org.slf4j.impl.StaticLoggerBinder") == -1) ? false : true;
    }

    /* renamed from: j */
    private static final void m1676j() {
        m1685a();
        if (f31825a == 3) {
            m1673m();
        }
    }

    /* renamed from: k */
    private static void m1675k(Set set) {
        if (m1678h(set)) {
            C14469i.m1648a("Actual binding is of type [" + C14472c.m1628c().m1629b() + "]");
        }
    }

    /* renamed from: l */
    private static void m1674l(Set set) {
        if (m1678h(set)) {
            C14469i.m1648a("Class path contains multiple SLF4J bindings.");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C14469i.m1648a("Found binding in [" + ((URL) it.next()) + "]");
            }
            C14469i.m1648a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: m */
    private static final void m1673m() {
        try {
            String str = C14472c.f31840c;
            boolean z = false;
            for (int i = 0; i < f31828d.length; i++) {
                if (str.startsWith(f31828d[i])) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C14469i.m1648a("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f31828d).toString());
            C14469i.m1648a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C14469i.m1647b("Unexpected problem occured during version sanity check", th);
        }
    }
}
