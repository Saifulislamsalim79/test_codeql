package kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.e0.d.l;
import kotlin.p480d0.C11750c;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
/* compiled from: ClassMapperLite.kt */
/* renamed from: kotlin.j0.o.c.p0.e.a0.b.b */
/* loaded from: classes3.dex */
public final class C12489b {

    /* renamed from: a */
    public static final C12489b f27740a = new C12489b();

    /* renamed from: b */
    private static final String f27741b;

    /* renamed from: c */
    private static final Map<String, String> f27742c;

    static {
        List m3888h;
        String m3797a0;
        List m3888h2;
        List<String> m3888h3;
        List<String> m3888h4;
        List<String> m3888h5;
        int i = 0;
        m3888h = C13726r.m3888h('k', 'o', 't', 'l', 'i', 'n');
        m3797a0 = C13742z.m3797a0(m3888h, "", null, null, 0, null, null, 62, null);
        f27741b = m3797a0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m3888h2 = C13726r.m3888h("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int m10369b = C11750c.m10369b(0, m3888h2.size() - 1, 2);
        if (m10369b >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 2;
                int i4 = i2 + 1;
                linkedHashMap.put(f27741b + '/' + ((String) m3888h2.get(i2)), m3888h2.get(i4));
                linkedHashMap.put(f27741b + '/' + ((String) m3888h2.get(i2)) + "Array", l.m("[", m3888h2.get(i4)));
                if (i2 == m10369b) {
                    break;
                }
                i2 = i3;
            }
        }
        linkedHashMap.put(l.m(f27741b, "/Unit"), "V");
        m8650a(linkedHashMap, "Any", "java/lang/Object");
        m8650a(linkedHashMap, "Nothing", "java/lang/Void");
        m8650a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        m3888h3 = C13726r.m3888h("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum");
        for (String str : m3888h3) {
            m8650a(linkedHashMap, str, l.m("java/lang/", str));
        }
        m3888h4 = C13726r.m3888h("Iterator", "Collection", "List", "Set", "Map", "ListIterator");
        for (String str2 : m3888h4) {
            m8650a(linkedHashMap, l.m("collections/", str2), l.m("java/util/", str2));
            m8650a(linkedHashMap, l.m("collections/Mutable", str2), l.m("java/util/", str2));
        }
        m8650a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m8650a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m8650a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m8650a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        while (true) {
            int i5 = i + 1;
            m8650a(linkedHashMap, l.m("Function", Integer.valueOf(i)), f27741b + "/jvm/functions/Function" + i);
            m8650a(linkedHashMap, l.m("reflect/KFunction", Integer.valueOf(i)), l.m(f27741b, "/reflect/KFunction"));
            if (i5 > 22) {
                break;
            }
            i = i5;
        }
        m3888h5 = C13726r.m3888h("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum");
        for (String str3 : m3888h5) {
            m8650a(linkedHashMap, l.m(str3, ".Companion"), f27741b + "/jvm/internal/" + str3 + "CompanionObject");
        }
        f27742c = linkedHashMap;
    }

    private C12489b() {
    }

    /* renamed from: a */
    private static final void m8650a(Map<String, String> map, String str, String str2) {
        map.put(f27741b + '/' + str, 'L' + str2 + ';');
    }

    /* renamed from: b */
    public static final String m8649b(String str) {
        String m5435z;
        l.f(str, "classId");
        String str2 = f27742c.get(str);
        if (str2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append('L');
            m5435z = C13276s.m5435z(str, '.', '$', false, 4, null);
            sb.append(m5435z);
            sb.append(';');
            return sb.toString();
        }
        return str2;
    }
}
