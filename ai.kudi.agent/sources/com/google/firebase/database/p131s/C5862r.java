package com.google.firebase.database.p131s;

import com.google.firebase.database.p131s.AbstractC5730c0;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p134i0.InterfaceC5773a;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5924c;
import com.google.firebase.database.p139u.C5948o;
import com.google.firebase.database.p139u.C5951r;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ServerValues.java */
/* renamed from: com.google.firebase.database.s.r */
/* loaded from: classes2.dex */
public class C5862r {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServerValues.java */
    /* renamed from: com.google.firebase.database.s.r$a */
    /* loaded from: classes2.dex */
    public class C5863a extends C5924c.AbstractC5927c {

        /* renamed from: a */
        final /* synthetic */ AbstractC5730c0 f14404a;

        /* renamed from: b */
        final /* synthetic */ Map f14405b;

        /* renamed from: c */
        final /* synthetic */ C5864s f14406c;

        C5863a(AbstractC5730c0 abstractC5730c0, Map map, C5864s c5864s) {
            this.f14404a = abstractC5730c0;
            this.f14405b = map;
            this.f14406c = c5864s;
        }

        @Override // com.google.firebase.database.p139u.C5924c.AbstractC5927c
        /* renamed from: b */
        public void mo23272b(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
            InterfaceC5945n m23483h = C5862r.m23483h(interfaceC5945n, this.f14404a.mo23995a(c5921b), this.f14405b);
            if (m23483h != interfaceC5945n) {
                this.f14406c.m23478c(new C5830l(c5921b.m23298b()), m23483h);
            }
        }
    }

    /* renamed from: b */
    private static boolean m23489b(Number number) {
        return ((number instanceof Double) || (number instanceof Float)) ? false : true;
    }

    /* renamed from: c */
    public static Map<String, Object> m23488c(InterfaceC5773a interfaceC5773a) {
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(interfaceC5773a.mo23772a()));
        return hashMap;
    }

    /* renamed from: d */
    static Object m23487d(Map<String, Object> map, AbstractC5730c0 abstractC5730c0, Map<String, Object> map2) {
        if (map.containsKey("increment")) {
            Object obj = map.get("increment");
            if (obj instanceof Number) {
                Number number = (Number) obj;
                InterfaceC5945n mo23994b = abstractC5730c0.mo23994b();
                if (mo23994b.mo23217N() && (mo23994b.getValue() instanceof Number)) {
                    Number number2 = (Number) mo23994b.getValue();
                    if (m23489b(number) && m23489b(number2)) {
                        long longValue = number.longValue();
                        long longValue2 = number2.longValue();
                        long j = longValue + longValue2;
                        if (((longValue ^ j) & (longValue2 ^ j)) >= 0) {
                            return Long.valueOf(j);
                        }
                    }
                    return Double.valueOf(number.doubleValue() + number2.doubleValue());
                }
                return number;
            }
            return null;
        }
        return null;
    }

    /* renamed from: e */
    public static Object m23486e(Object obj, AbstractC5730c0 abstractC5730c0, Map<String, Object> map) {
        if (obj instanceof Map) {
            Map map2 = (Map) obj;
            if (map2.containsKey(".sv")) {
                Object obj2 = map2.get(".sv");
                Object obj3 = null;
                if (obj2 instanceof String) {
                    obj3 = m23481j((String) obj2, map);
                } else if (obj2 instanceof Map) {
                    obj3 = m23487d((Map) obj2, abstractC5730c0, map);
                }
                return obj3 == null ? obj : obj3;
            }
            return obj;
        }
        return obj;
    }

    /* renamed from: f */
    public static C5737e m23485f(C5737e c5737e, C5870v c5870v, C5830l c5830l, Map<String, Object> map) {
        C5737e m23963s = C5737e.m23963s();
        Iterator<Map.Entry<C5830l, InterfaceC5945n>> it = c5737e.iterator();
        while (it.hasNext()) {
            Map.Entry<C5830l, InterfaceC5945n> next = it.next();
            m23963s = m23963s.m23970d(next.getKey(), m23483h(next.getValue(), new AbstractC5730c0.C5731a(c5870v, c5830l.m23593I(next.getKey())), map));
        }
        return m23963s;
    }

    /* renamed from: g */
    public static InterfaceC5945n m23484g(InterfaceC5945n interfaceC5945n, C5870v c5870v, C5830l c5830l, Map<String, Object> map) {
        return m23483h(interfaceC5945n, new AbstractC5730c0.C5731a(c5870v, c5830l), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static InterfaceC5945n m23483h(InterfaceC5945n interfaceC5945n, AbstractC5730c0 abstractC5730c0, Map<String, Object> map) {
        Object value = interfaceC5945n.mo23208x().getValue();
        Object m23486e = m23486e(value, abstractC5730c0.mo23995a(C5921b.m23296g(".priority")), map);
        if (interfaceC5945n.mo23217N()) {
            Object m23486e2 = m23486e(interfaceC5945n.getValue(), abstractC5730c0, map);
            return (m23486e2.equals(interfaceC5945n.getValue()) && C5795m.m23747d(m23486e, value)) ? interfaceC5945n : C5948o.m23206b(m23486e2, C5951r.m23198d(m23486e));
        } else if (interfaceC5945n.isEmpty()) {
            return interfaceC5945n;
        } else {
            C5924c c5924c = (C5924c) interfaceC5945n;
            C5864s c5864s = new C5864s(c5924c);
            c5924c.m23284m(new C5863a(abstractC5730c0, map, c5864s));
            if (!c5864s.m23479b().mo23208x().equals(m23486e)) {
                return c5864s.m23479b().mo23195D(C5951r.m23198d(m23486e));
            }
            return c5864s.m23479b();
        }
    }

    /* renamed from: i */
    public static InterfaceC5945n m23482i(InterfaceC5945n interfaceC5945n, InterfaceC5945n interfaceC5945n2, Map<String, Object> map) {
        return m23483h(interfaceC5945n, new AbstractC5730c0.C5732b(interfaceC5945n2), map);
    }

    /* renamed from: j */
    static Object m23481j(String str, Map<String, Object> map) {
        if ("timestamp".equals(str) && map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }
}
