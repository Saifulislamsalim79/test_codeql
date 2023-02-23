package com.google.firebase.database.p131s.p134i0;

import com.google.firebase.database.p139u.AbstractC5940k;
import com.google.firebase.database.p139u.C5920a;
import com.google.firebase.database.p139u.C5924c;
import com.google.firebase.database.p139u.C5935f;
import com.google.firebase.database.p139u.C5943l;
import com.google.firebase.database.p139u.C5944m;
import com.google.firebase.database.p139u.C5953t;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.Iterator;
/* compiled from: NodeSizeEstimator.java */
/* renamed from: com.google.firebase.database.s.i0.e */
/* loaded from: classes2.dex */
public class C5783e {
    /* renamed from: a */
    private static long m23775a(AbstractC5940k<?> abstractC5940k) {
        long j = 8;
        if (!(abstractC5940k instanceof C5935f) && !(abstractC5940k instanceof C5943l)) {
            if (abstractC5940k instanceof C5920a) {
                j = 4;
            } else if (abstractC5940k instanceof C5953t) {
                j = 2 + ((String) abstractC5940k.getValue()).length();
            } else {
                throw new IllegalArgumentException("Unknown leaf node type: " + abstractC5940k.getClass());
            }
        }
        return abstractC5940k.mo23208x().isEmpty() ? j : j + 24 + m23775a((AbstractC5940k) abstractC5940k.mo23208x());
    }

    /* renamed from: b */
    public static long m23774b(InterfaceC5945n interfaceC5945n) {
        if (interfaceC5945n.isEmpty()) {
            return 4L;
        }
        if (interfaceC5945n.mo23217N()) {
            return m23775a((AbstractC5940k) interfaceC5945n);
        }
        C5795m.m23744g(interfaceC5945n instanceof C5924c, "Unexpected node type: " + interfaceC5945n.getClass());
        long j = 1;
        for (C5944m c5944m : interfaceC5945n) {
            j = j + c5944m.m23222c().m23298b().length() + 4 + m23774b(c5944m.m23221d());
        }
        return !interfaceC5945n.mo23208x().isEmpty() ? j + 12 + m23775a((AbstractC5940k) interfaceC5945n.mo23208x()) : j;
    }

    /* renamed from: c */
    public static int m23773c(InterfaceC5945n interfaceC5945n) {
        int i = 0;
        if (interfaceC5945n.isEmpty()) {
            return 0;
        }
        if (interfaceC5945n.mo23217N()) {
            return 1;
        }
        C5795m.m23744g(interfaceC5945n instanceof C5924c, "Unexpected node type: " + interfaceC5945n.getClass());
        Iterator<C5944m> it = interfaceC5945n.iterator();
        while (it.hasNext()) {
            i += m23773c(it.next().m23221d());
        }
        return i;
    }
}
