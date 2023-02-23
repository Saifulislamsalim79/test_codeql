package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12461v;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.EnumC12757e;
import kotlin.p557z.C13721o0;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13741y0;
import kotlin.p557z.C13742z;
import kotlin.p557z.C13745z0;
/* compiled from: SpecialGenericSignatures.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.z */
/* loaded from: classes3.dex */
public class C12393z {

    /* renamed from: a */
    public static final C12394a f27500a = new C12394a(null);

    /* renamed from: b */
    private static final List<C12394a.C12395a> f27501b;

    /* renamed from: c */
    private static final List<String> f27502c;

    /* renamed from: d */
    private static final Map<C12394a.C12395a, EnumC12397c> f27503d;

    /* renamed from: e */
    private static final Map<String, EnumC12397c> f27504e;

    /* renamed from: f */
    private static final Set<C12614f> f27505f;

    /* renamed from: g */
    private static final Set<String> f27506g;

    /* renamed from: h */
    private static final C12394a.C12395a f27507h;

    /* renamed from: i */
    private static final Map<C12394a.C12395a, C12614f> f27508i;

    /* renamed from: j */
    private static final Map<String, C12614f> f27509j;

    /* renamed from: k */
    private static final List<C12614f> f27510k;

    /* renamed from: l */
    private static final Map<C12614f, List<C12614f>> f27511l;

    /* compiled from: SpecialGenericSignatures.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.z$a */
    /* loaded from: classes3.dex */
    public static final class C12394a {

        /* compiled from: SpecialGenericSignatures.kt */
        /* renamed from: kotlin.j0.o.c.p0.d.a.z$a$a */
        /* loaded from: classes3.dex */
        public static final class C12395a {

            /* renamed from: a */
            private final C12614f f27512a;

            /* renamed from: b */
            private final String f27513b;

            public C12395a(C12614f c12614f, String str) {
                l.f(c12614f, "name");
                l.f(str, "signature");
                this.f27512a = c12614f;
                this.f27513b = str;
            }

            /* renamed from: a */
            public final C12614f m9024a() {
                return this.f27512a;
            }

            /* renamed from: b */
            public final String m9023b() {
                return this.f27513b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C12395a) {
                    C12395a c12395a = (C12395a) obj;
                    return l.b(this.f27512a, c12395a.f27512a) && l.b(this.f27513b, c12395a.f27513b);
                }
                return false;
            }

            public int hashCode() {
                return (this.f27512a.hashCode() * 31) + this.f27513b.hashCode();
            }

            public String toString() {
                return "NameAndSignature(name=" + this.f27512a + ", signature=" + this.f27513b + ')';
            }
        }

        private C12394a() {
        }

        public /* synthetic */ C12394a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public final C12395a m9025m(String str, String str2, String str3, String str4) {
            C12614f m7349i = C12614f.m7349i(str2);
            l.e(m7349i, "identifier(name)");
            C12461v c12461v = C12461v.f27635a;
            return new C12395a(m7349i, c12461v.m8841k(str, str2 + '(' + str3 + ')' + str4));
        }

        /* renamed from: b */
        public final List<C12614f> m9036b(C12614f c12614f) {
            List<C12614f> m3891e;
            l.f(c12614f, "name");
            List<C12614f> list = m9032f().get(c12614f);
            if (list == null) {
                m3891e = C13726r.m3891e();
                return m3891e;
            }
            return list;
        }

        /* renamed from: c */
        public final List<String> m9035c() {
            return C12393z.f27502c;
        }

        /* renamed from: d */
        public final Set<C12614f> m9034d() {
            return C12393z.f27505f;
        }

        /* renamed from: e */
        public final Set<String> m9033e() {
            return C12393z.f27506g;
        }

        /* renamed from: f */
        public final Map<C12614f, List<C12614f>> m9032f() {
            return C12393z.f27511l;
        }

        /* renamed from: g */
        public final List<C12614f> m9031g() {
            return C12393z.f27510k;
        }

        /* renamed from: h */
        public final C12395a m9030h() {
            return C12393z.f27507h;
        }

        /* renamed from: i */
        public final Map<String, EnumC12397c> m9029i() {
            return C12393z.f27504e;
        }

        /* renamed from: j */
        public final Map<String, C12614f> m9028j() {
            return C12393z.f27509j;
        }

        /* renamed from: k */
        public final boolean m9027k(C12614f c12614f) {
            l.f(c12614f, "<this>");
            return m9031g().contains(c12614f);
        }

        /* renamed from: l */
        public final EnumC12396b m9026l(String str) {
            l.f(str, "builtinSignature");
            if (m9035c().contains(str)) {
                return EnumC12396b.ONE_COLLECTION_PARAMETER;
            }
            if (((EnumC12397c) C13721o0.m3982l(m9029i(), str)) == EnumC12397c.f27518d) {
                return EnumC12396b.OBJECT_PARAMETER_GENERIC;
            }
            return EnumC12396b.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    /* compiled from: SpecialGenericSignatures.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.z$b */
    /* loaded from: classes3.dex */
    public enum EnumC12396b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        EnumC12396b(String str, boolean z) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialGenericSignatures.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.z$c */
    /* loaded from: classes3.dex */
    public static final class EnumC12397c {

        /* renamed from: d */
        public static final EnumC12397c f27518d = new EnumC12397c("NULL", 0, null);

        /* renamed from: e */
        public static final EnumC12397c f27519e = new EnumC12397c("INDEX", 1, -1);

        /* renamed from: f */
        public static final EnumC12397c f27520f = new EnumC12397c("FALSE", 2, Boolean.FALSE);

        /* renamed from: w */
        public static final EnumC12397c f27521w = new C12398a("MAP_GET_OR_DEFAULT", 3);

        /* renamed from: x */
        private static final /* synthetic */ EnumC12397c[] f27522x = m9021a();

        /* renamed from: c */
        private final Object f27523c;

        /* compiled from: SpecialGenericSignatures.kt */
        /* renamed from: kotlin.j0.o.c.p0.d.a.z$c$a */
        /* loaded from: classes3.dex */
        static final class C12398a extends EnumC12397c {
            C12398a(String str, int i) {
                super(str, i, null, null);
            }
        }

        private EnumC12397c(String str, int i, Object obj) {
            this.f27523c = obj;
        }

        public /* synthetic */ EnumC12397c(String str, int i, Object obj, g gVar) {
            this(str, i, obj);
        }

        /* renamed from: a */
        private static final /* synthetic */ EnumC12397c[] m9021a() {
            return new EnumC12397c[]{f27518d, f27519e, f27520f, f27521w};
        }

        public static EnumC12397c valueOf(String str) {
            return (EnumC12397c) Enum.valueOf(EnumC12397c.class, str);
        }

        public static EnumC12397c[] values() {
            return (EnumC12397c[]) f27522x.clone();
        }
    }

    static {
        Set<String> m3827f;
        int m3867o;
        int m3867o2;
        int m3867o3;
        Map<C12394a.C12395a, EnumC12397c> m3878n;
        int m3898f;
        Set<C12394a.C12395a> m3769h;
        int m3867o4;
        Set<C12614f> m3821F0;
        int m3867o5;
        Set<String> m3821F02;
        Map<C12394a.C12395a, C12614f> m3878n2;
        int m3898f2;
        int m3867o6;
        int m3867o7;
        m3827f = C13741y0.m3827f("containsAll", "removeAll", "retainAll");
        m3867o = C13728s.m3867o(m3827f, 10);
        ArrayList<C12394a.C12395a> arrayList = new ArrayList(m3867o);
        for (String str : m3827f) {
            C12394a c12394a = f27500a;
            String m6826g = EnumC12757e.BOOLEAN.m6826g();
            l.e(m6826g, "BOOLEAN.desc");
            arrayList.add(c12394a.m9025m("java/util/Collection", str, "Ljava/util/Collection;", m6826g));
        }
        f27501b = arrayList;
        m3867o2 = C13728s.m3867o(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m3867o2);
        for (C12394a.C12395a c12395a : arrayList) {
            arrayList2.add(c12395a.m9023b());
        }
        f27502c = arrayList2;
        List<C12394a.C12395a> list = f27501b;
        m3867o3 = C13728s.m3867o(list, 10);
        ArrayList arrayList3 = new ArrayList(m3867o3);
        for (C12394a.C12395a c12395a2 : list) {
            arrayList3.add(c12395a2.m9024a().m7353b());
        }
        C12461v c12461v = C12461v.f27635a;
        C12394a c12394a2 = f27500a;
        String m8843i = c12461v.m8843i("Collection");
        String m6826g2 = EnumC12757e.BOOLEAN.m6826g();
        l.e(m6826g2, "BOOLEAN.desc");
        C12394a c12394a3 = f27500a;
        String m8843i2 = c12461v.m8843i("Collection");
        String m6826g3 = EnumC12757e.BOOLEAN.m6826g();
        l.e(m6826g3, "BOOLEAN.desc");
        C12394a c12394a4 = f27500a;
        String m8843i3 = c12461v.m8843i("Map");
        String m6826g4 = EnumC12757e.BOOLEAN.m6826g();
        l.e(m6826g4, "BOOLEAN.desc");
        C12394a c12394a5 = f27500a;
        String m8843i4 = c12461v.m8843i("Map");
        String m6826g5 = EnumC12757e.BOOLEAN.m6826g();
        l.e(m6826g5, "BOOLEAN.desc");
        C12394a c12394a6 = f27500a;
        String m8843i5 = c12461v.m8843i("Map");
        String m6826g6 = EnumC12757e.BOOLEAN.m6826g();
        l.e(m6826g6, "BOOLEAN.desc");
        C12394a c12394a7 = f27500a;
        String m8843i6 = c12461v.m8843i("List");
        String m6826g7 = EnumC12757e.INT.m6826g();
        l.e(m6826g7, "INT.desc");
        C12394a c12394a8 = f27500a;
        String m8843i7 = c12461v.m8843i("List");
        String m6826g8 = EnumC12757e.INT.m6826g();
        l.e(m6826g8, "INT.desc");
        m3878n = C13727r0.m3878n(C13664u.m4227a(c12394a2.m9025m(m8843i, "contains", "Ljava/lang/Object;", m6826g2), EnumC12397c.f27520f), C13664u.m4227a(c12394a3.m9025m(m8843i2, "remove", "Ljava/lang/Object;", m6826g3), EnumC12397c.f27520f), C13664u.m4227a(c12394a4.m9025m(m8843i3, "containsKey", "Ljava/lang/Object;", m6826g4), EnumC12397c.f27520f), C13664u.m4227a(c12394a5.m9025m(m8843i4, "containsValue", "Ljava/lang/Object;", m6826g5), EnumC12397c.f27520f), C13664u.m4227a(c12394a6.m9025m(m8843i5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", m6826g6), EnumC12397c.f27520f), C13664u.m4227a(f27500a.m9025m(c12461v.m8843i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), EnumC12397c.f27521w), C13664u.m4227a(f27500a.m9025m(c12461v.m8843i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;"), EnumC12397c.f27518d), C13664u.m4227a(f27500a.m9025m(c12461v.m8843i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), EnumC12397c.f27518d), C13664u.m4227a(c12394a7.m9025m(m8843i6, "indexOf", "Ljava/lang/Object;", m6826g7), EnumC12397c.f27519e), C13664u.m4227a(c12394a8.m9025m(m8843i7, "lastIndexOf", "Ljava/lang/Object;", m6826g8), EnumC12397c.f27519e));
        f27503d = m3878n;
        m3898f = C13725q0.m3898f(m3878n.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3898f);
        Iterator<T> it = m3878n.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((C12394a.C12395a) entry.getKey()).m9023b(), entry.getValue());
        }
        f27504e = linkedHashMap;
        m3769h = C13745z0.m3769h(f27503d.keySet(), f27501b);
        m3867o4 = C13728s.m3867o(m3769h, 10);
        ArrayList arrayList4 = new ArrayList(m3867o4);
        for (C12394a.C12395a c12395a3 : m3769h) {
            arrayList4.add(c12395a3.m9024a());
        }
        m3821F0 = C13742z.m3821F0(arrayList4);
        f27505f = m3821F0;
        m3867o5 = C13728s.m3867o(m3769h, 10);
        ArrayList arrayList5 = new ArrayList(m3867o5);
        for (C12394a.C12395a c12395a4 : m3769h) {
            arrayList5.add(c12395a4.m9023b());
        }
        m3821F02 = C13742z.m3821F0(arrayList5);
        f27506g = m3821F02;
        C12394a c12394a9 = f27500a;
        String m6826g9 = EnumC12757e.INT.m6826g();
        l.e(m6826g9, "INT.desc");
        f27507h = c12394a9.m9025m("java/util/List", "removeAt", m6826g9, "Ljava/lang/Object;");
        C12461v c12461v2 = C12461v.f27635a;
        C12394a c12394a10 = f27500a;
        String m8844h = c12461v2.m8844h("Number");
        String m6826g10 = EnumC12757e.BYTE.m6826g();
        l.e(m6826g10, "BYTE.desc");
        C12394a c12394a11 = f27500a;
        String m8844h2 = c12461v2.m8844h("Number");
        String m6826g11 = EnumC12757e.SHORT.m6826g();
        l.e(m6826g11, "SHORT.desc");
        C12394a c12394a12 = f27500a;
        String m8844h3 = c12461v2.m8844h("Number");
        String m6826g12 = EnumC12757e.INT.m6826g();
        l.e(m6826g12, "INT.desc");
        C12394a c12394a13 = f27500a;
        String m8844h4 = c12461v2.m8844h("Number");
        String m6826g13 = EnumC12757e.LONG.m6826g();
        l.e(m6826g13, "LONG.desc");
        C12394a c12394a14 = f27500a;
        String m8844h5 = c12461v2.m8844h("Number");
        String m6826g14 = EnumC12757e.FLOAT.m6826g();
        l.e(m6826g14, "FLOAT.desc");
        C12394a c12394a15 = f27500a;
        String m8844h6 = c12461v2.m8844h("Number");
        String m6826g15 = EnumC12757e.DOUBLE.m6826g();
        l.e(m6826g15, "DOUBLE.desc");
        C12394a c12394a16 = f27500a;
        String m8844h7 = c12461v2.m8844h("CharSequence");
        String m6826g16 = EnumC12757e.INT.m6826g();
        l.e(m6826g16, "INT.desc");
        String m6826g17 = EnumC12757e.CHAR.m6826g();
        l.e(m6826g17, "CHAR.desc");
        m3878n2 = C13727r0.m3878n(C13664u.m4227a(c12394a10.m9025m(m8844h, "toByte", "", m6826g10), C12614f.m7349i("byteValue")), C13664u.m4227a(c12394a11.m9025m(m8844h2, "toShort", "", m6826g11), C12614f.m7349i("shortValue")), C13664u.m4227a(c12394a12.m9025m(m8844h3, "toInt", "", m6826g12), C12614f.m7349i("intValue")), C13664u.m4227a(c12394a13.m9025m(m8844h4, "toLong", "", m6826g13), C12614f.m7349i("longValue")), C13664u.m4227a(c12394a14.m9025m(m8844h5, "toFloat", "", m6826g14), C12614f.m7349i("floatValue")), C13664u.m4227a(c12394a15.m9025m(m8844h6, "toDouble", "", m6826g15), C12614f.m7349i("doubleValue")), C13664u.m4227a(f27507h, C12614f.m7349i("remove")), C13664u.m4227a(c12394a16.m9025m(m8844h7, "get", m6826g16, m6826g17), C12614f.m7349i("charAt")));
        f27508i = m3878n2;
        m3898f2 = C13725q0.m3898f(m3878n2.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m3898f2);
        Iterator<T> it2 = m3878n2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(((C12394a.C12395a) entry2.getKey()).m9023b(), entry2.getValue());
        }
        f27509j = linkedHashMap2;
        Set<C12394a.C12395a> keySet = f27508i.keySet();
        m3867o6 = C13728s.m3867o(keySet, 10);
        ArrayList arrayList6 = new ArrayList(m3867o6);
        for (C12394a.C12395a c12395a5 : keySet) {
            arrayList6.add(c12395a5.m9024a());
        }
        f27510k = arrayList6;
        Set<Map.Entry<C12394a.C12395a, C12614f>> entrySet = f27508i.entrySet();
        m3867o7 = C13728s.m3867o(entrySet, 10);
        ArrayList<C13287o> arrayList7 = new ArrayList(m3867o7);
        Iterator<T> it3 = entrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            arrayList7.add(new C13287o(((C12394a.C12395a) entry3.getKey()).m9024a(), entry3.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (C13287o c13287o : arrayList7) {
            C12614f c12614f = (C12614f) c13287o.m5363d();
            Object obj = linkedHashMap3.get(c12614f);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap3.put(c12614f, obj);
            }
            ((List) obj).add((C12614f) c13287o.m5364c());
        }
        f27511l = linkedHashMap3;
    }
}
