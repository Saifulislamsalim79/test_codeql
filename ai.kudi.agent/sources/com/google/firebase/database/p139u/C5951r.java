package com.google.firebase.database.p139u;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.p131s.C5830l;
/* compiled from: PriorityUtilities.java */
/* renamed from: com.google.firebase.database.u.r */
/* loaded from: classes2.dex */
public class C5951r {
    /* renamed from: a */
    public static InterfaceC5945n m23201a() {
        return C5936g.m23249P();
    }

    /* renamed from: b */
    public static boolean m23200b(InterfaceC5945n interfaceC5945n) {
        return interfaceC5945n.mo23208x().isEmpty() && (interfaceC5945n.isEmpty() || (interfaceC5945n instanceof C5935f) || (interfaceC5945n instanceof C5953t) || (interfaceC5945n instanceof C5934e));
    }

    /* renamed from: c */
    public static InterfaceC5945n m23199c(C5830l c5830l, Object obj) {
        String str;
        InterfaceC5945n m23207a = C5948o.m23207a(obj);
        if (m23207a instanceof C5943l) {
            m23207a = new C5935f(Double.valueOf(((Long) m23207a.getValue()).longValue()), m23201a());
        }
        if (m23200b(m23207a)) {
            return m23207a;
        }
        StringBuilder sb = new StringBuilder();
        if (c5830l != null) {
            str = "Path '" + c5830l + "'";
        } else {
            str = "Node";
        }
        sb.append(str);
        sb.append(" contains invalid priority: Must be a string, double, ServerValue, or null");
        throw new DatabaseException(sb.toString());
    }

    /* renamed from: d */
    public static InterfaceC5945n m23198d(Object obj) {
        return m23199c(null, obj);
    }
}
