package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
/* compiled from: BuiltinSpecialProperties.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.g */
/* loaded from: classes3.dex */
public final class C12299g {

    /* renamed from: a */
    public static final C12299g f27335a = new C12299g();

    /* renamed from: b */
    private static final Map<C12609c, C12614f> f27336b;

    /* renamed from: c */
    private static final Map<C12614f, List<C12614f>> f27337c;

    /* renamed from: d */
    private static final Set<C12609c> f27338d;

    /* renamed from: e */
    private static final Set<C12614f> f27339e;

    static {
        C12609c m9118d;
        C12609c m9118d2;
        C12609c m9119c;
        C12609c m9119c2;
        C12609c m9118d3;
        C12609c m9119c3;
        C12609c m9119c4;
        C12609c m9119c5;
        Map<C12609c, C12614f> m3878n;
        int m3867o;
        int m3898f;
        int m3867o2;
        Set<C12614f> m3821F0;
        List m3813K;
        m9118d = C12363h.m9118d(C12059k.C12060a.f26858k, "name");
        m9118d2 = C12363h.m9118d(C12059k.C12060a.f26858k, "ordinal");
        m9119c = C12363h.m9119c(C12059k.C12060a.f26815C, "size");
        m9119c2 = C12363h.m9119c(C12059k.C12060a.f26819G, "size");
        m9118d3 = C12363h.m9118d(C12059k.C12060a.f26849f, "length");
        m9119c3 = C12363h.m9119c(C12059k.C12060a.f26819G, "keys");
        m9119c4 = C12363h.m9119c(C12059k.C12060a.f26819G, "values");
        m9119c5 = C12363h.m9119c(C12059k.C12060a.f26819G, "entries");
        m3878n = C13727r0.m3878n(C13664u.m4227a(m9118d, C12614f.m7349i("name")), C13664u.m4227a(m9118d2, C12614f.m7349i("ordinal")), C13664u.m4227a(m9119c, C12614f.m7349i("size")), C13664u.m4227a(m9119c2, C12614f.m7349i("size")), C13664u.m4227a(m9118d3, C12614f.m7349i("length")), C13664u.m4227a(m9119c3, C12614f.m7349i("keySet")), C13664u.m4227a(m9119c4, C12614f.m7349i("values")), C13664u.m4227a(m9119c5, C12614f.m7349i("entrySet")));
        f27336b = m3878n;
        Set<Map.Entry<C12609c, C12614f>> entrySet = m3878n.entrySet();
        m3867o = C13728s.m3867o(entrySet, 10);
        ArrayList<C13287o> arrayList = new ArrayList(m3867o);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new C13287o(((C12609c) entry.getKey()).m7377g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C13287o c13287o : arrayList) {
            C12614f c12614f = (C12614f) c13287o.m5363d();
            Object obj = linkedHashMap.get(c12614f);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c12614f, obj);
            }
            ((List) obj).add((C12614f) c13287o.m5364c());
        }
        m3898f = C13725q0.m3898f(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m3898f);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            m3813K = C13742z.m3813K((Iterable) entry2.getValue());
            linkedHashMap2.put(key, m3813K);
        }
        f27337c = linkedHashMap2;
        Set<C12609c> keySet = f27336b.keySet();
        f27338d = keySet;
        m3867o2 = C13728s.m3867o(keySet, 10);
        ArrayList arrayList2 = new ArrayList(m3867o2);
        for (C12609c c12609c : keySet) {
            arrayList2.add(c12609c.m7377g());
        }
        m3821F0 = C13742z.m3821F0(arrayList2);
        f27339e = m3821F0;
    }

    private C12299g() {
    }

    /* renamed from: a */
    public final Map<C12609c, C12614f> m9262a() {
        return f27336b;
    }

    /* renamed from: b */
    public final List<C12614f> m9261b(C12614f c12614f) {
        List<C12614f> m3891e;
        l.f(c12614f, "name1");
        List<C12614f> list = f27337c.get(c12614f);
        if (list == null) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        return list;
    }

    /* renamed from: c */
    public final Set<C12609c> m9260c() {
        return f27338d;
    }

    /* renamed from: d */
    public final Set<C12614f> m9259d() {
        return f27339e;
    }
}
