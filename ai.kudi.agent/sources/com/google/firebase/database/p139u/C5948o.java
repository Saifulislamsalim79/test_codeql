package com.google.firebase.database.p139u;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.p128q.AbstractC5653c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: NodeUtilities.java */
/* renamed from: com.google.firebase.database.u.o */
/* loaded from: classes2.dex */
public class C5948o {
    /* renamed from: a */
    public static InterfaceC5945n m23207a(Object obj) throws DatabaseException {
        return m23206b(obj, C5951r.m23201a());
    }

    /* renamed from: b */
    public static InterfaceC5945n m23206b(Object obj, InterfaceC5945n interfaceC5945n) throws DatabaseException {
        HashMap hashMap;
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey(".priority")) {
                    interfaceC5945n = C5951r.m23198d(map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj = map.get(".value");
                }
            }
            if (obj == null) {
                return C5936g.m23249P();
            }
            if (obj instanceof String) {
                return new C5953t((String) obj, interfaceC5945n);
            }
            if (obj instanceof Long) {
                return new C5943l((Long) obj, interfaceC5945n);
            }
            if (obj instanceof Integer) {
                return new C5943l(Long.valueOf(((Integer) obj).intValue()), interfaceC5945n);
            }
            if (obj instanceof Double) {
                return new C5935f((Double) obj, interfaceC5945n);
            }
            if (obj instanceof Boolean) {
                return new C5920a((Boolean) obj, interfaceC5945n);
            }
            if (!(obj instanceof Map) && !(obj instanceof List)) {
                throw new DatabaseException("Failed to parse node with class " + obj.getClass().toString());
            }
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".sv")) {
                    return new C5934e(map2, interfaceC5945n);
                }
                hashMap = new HashMap(map2.size());
                for (String str : map2.keySet()) {
                    if (!str.startsWith(".")) {
                        InterfaceC5945n m23207a = m23207a(map2.get(str));
                        if (!m23207a.isEmpty()) {
                            hashMap.put(C5921b.m23296g(str), m23207a);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                hashMap = new HashMap(list.size());
                for (int i = 0; i < list.size(); i++) {
                    String str2 = "" + i;
                    InterfaceC5945n m23207a2 = m23207a(list.get(i));
                    if (!m23207a2.isEmpty()) {
                        hashMap.put(C5921b.m23296g(str2), m23207a2);
                    }
                }
            }
            if (hashMap.isEmpty()) {
                return C5936g.m23249P();
            }
            return new C5924c(AbstractC5653c.C5654a.m24245c(hashMap, C5924c.f14549f), interfaceC5945n);
        } catch (ClassCastException e) {
            throw new DatabaseException("Failed to parse node", e);
        }
    }

    /* renamed from: c */
    public static int m23205c(C5921b c5921b, InterfaceC5945n interfaceC5945n, C5921b c5921b2, InterfaceC5945n interfaceC5945n2) {
        int compareTo = interfaceC5945n.compareTo(interfaceC5945n2);
        return compareTo != 0 ? compareTo : c5921b.compareTo(c5921b2);
    }
}
