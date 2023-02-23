package kotlin.p483e0.p485d;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC11746d;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11757b;
import kotlin.p483e0.p484c.InterfaceC11758c;
import kotlin.p483e0.p484c.InterfaceC11759d;
import kotlin.p483e0.p484c.InterfaceC11760e;
import kotlin.p483e0.p484c.InterfaceC11761f;
import kotlin.p483e0.p484c.InterfaceC11762g;
import kotlin.p483e0.p484c.InterfaceC11763h;
import kotlin.p483e0.p484c.InterfaceC11764i;
import kotlin.p483e0.p484c.InterfaceC11765j;
import kotlin.p483e0.p484c.InterfaceC11766k;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11768m;
import kotlin.p483e0.p484c.InterfaceC11769n;
import kotlin.p483e0.p484c.InterfaceC11770o;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p484c.InterfaceC11773r;
import kotlin.p483e0.p484c.InterfaceC11774s;
import kotlin.p483e0.p484c.InterfaceC11775t;
import kotlin.p483e0.p484c.InterfaceC11776u;
import kotlin.p483e0.p484c.InterfaceC11777v;
import kotlin.p483e0.p484c.InterfaceC11778w;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
import kotlin.p483e0.p485d.p486e0.InterfaceC11792b;
import kotlin.p483e0.p485d.p486e0.InterfaceC11793c;
import kotlin.p483e0.p485d.p486e0.InterfaceC11794d;
import kotlin.p483e0.p485d.p486e0.InterfaceC11796e;
/* compiled from: TypeIntrinsics.java */
/* renamed from: kotlin.e0.d.b0 */
/* loaded from: classes3.dex */
public class C11782b0 {
    /* renamed from: a */
    public static Collection m10350a(Object obj) {
        if ((obj instanceof InterfaceC11791a) && !(obj instanceof InterfaceC11792b)) {
            m10335p(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        return m10344g(obj);
    }

    /* renamed from: b */
    public static Iterable m10349b(Object obj) {
        if ((obj instanceof InterfaceC11791a) && !(obj instanceof InterfaceC11793c)) {
            m10335p(obj, "kotlin.collections.MutableIterable");
            throw null;
        }
        return m10343h(obj);
    }

    /* renamed from: c */
    public static Map m10348c(Object obj) {
        if ((obj instanceof InterfaceC11791a) && !(obj instanceof InterfaceC11794d)) {
            m10335p(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        return m10342i(obj);
    }

    /* renamed from: d */
    public static Map.Entry m10347d(Object obj) {
        if ((obj instanceof InterfaceC11791a) && !(obj instanceof InterfaceC11794d.InterfaceC11795a)) {
            m10335p(obj, "kotlin.collections.MutableMap.MutableEntry");
            throw null;
        }
        return m10341j(obj);
    }

    /* renamed from: e */
    public static Set m10346e(Object obj) {
        if ((obj instanceof InterfaceC11791a) && !(obj instanceof InterfaceC11796e)) {
            m10335p(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        return m10340k(obj);
    }

    /* renamed from: f */
    public static Object m10345f(Object obj, int i) {
        if (obj == null || m10338m(obj, i)) {
            return obj;
        }
        m10335p(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* renamed from: g */
    public static Collection m10344g(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            m10336o(e);
            throw null;
        }
    }

    /* renamed from: h */
    public static Iterable m10343h(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            m10336o(e);
            throw null;
        }
    }

    /* renamed from: i */
    public static Map m10342i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            m10336o(e);
            throw null;
        }
    }

    /* renamed from: j */
    public static Map.Entry m10341j(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            m10336o(e);
            throw null;
        }
    }

    /* renamed from: k */
    public static Set m10340k(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            m10336o(e);
            throw null;
        }
    }

    /* renamed from: l */
    public static int m10339l(Object obj) {
        if (obj instanceof InterfaceC11798h) {
            return ((InterfaceC11798h) obj).getArity();
        }
        if (obj instanceof InterfaceC11756a) {
            return 0;
        }
        if (obj instanceof InterfaceC11767l) {
            return 1;
        }
        if (obj instanceof InterfaceC11771p) {
            return 2;
        }
        if (obj instanceof InterfaceC11772q) {
            return 3;
        }
        if (obj instanceof InterfaceC11773r) {
            return 4;
        }
        if (obj instanceof InterfaceC11774s) {
            return 5;
        }
        if (obj instanceof InterfaceC11775t) {
            return 6;
        }
        if (obj instanceof InterfaceC11776u) {
            return 7;
        }
        if (obj instanceof InterfaceC11777v) {
            return 8;
        }
        if (obj instanceof InterfaceC11778w) {
            return 9;
        }
        if (obj instanceof InterfaceC11757b) {
            return 10;
        }
        if (obj instanceof InterfaceC11758c) {
            return 11;
        }
        if (obj instanceof InterfaceC11759d) {
            return 12;
        }
        if (obj instanceof InterfaceC11760e) {
            return 13;
        }
        if (obj instanceof InterfaceC11761f) {
            return 14;
        }
        if (obj instanceof InterfaceC11762g) {
            return 15;
        }
        if (obj instanceof InterfaceC11763h) {
            return 16;
        }
        if (obj instanceof InterfaceC11764i) {
            return 17;
        }
        if (obj instanceof InterfaceC11765j) {
            return 18;
        }
        if (obj instanceof InterfaceC11766k) {
            return 19;
        }
        if (obj instanceof InterfaceC11768m) {
            return 20;
        }
        if (obj instanceof InterfaceC11769n) {
            return 21;
        }
        return obj instanceof InterfaceC11770o ? 22 : -1;
    }

    /* renamed from: m */
    public static boolean m10338m(Object obj, int i) {
        return (obj instanceof InterfaceC11746d) && m10339l(obj) == i;
    }

    /* renamed from: n */
    private static <T extends Throwable> T m10337n(T t) {
        l.l(t, C11782b0.class.getName());
        return t;
    }

    /* renamed from: o */
    public static ClassCastException m10336o(ClassCastException classCastException) {
        m10337n(classCastException);
        throw classCastException;
    }

    /* renamed from: p */
    public static void m10335p(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m10334q(name + " cannot be cast to " + str);
        throw null;
    }

    /* renamed from: q */
    public static void m10334q(String str) {
        m10336o(new ClassCastException(str));
        throw null;
    }
}
