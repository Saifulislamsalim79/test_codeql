package com.google.firebase.database.p131s.p136j0.p137m;

import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p136j0.C5803c;
import com.google.firebase.database.p131s.p136j0.InterfaceC5805e;
import com.google.firebase.database.p139u.C5921b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ChildChangeAccumulator.java */
/* renamed from: com.google.firebase.database.s.j0.m.a */
/* loaded from: classes2.dex */
public class C5823a {

    /* renamed from: a */
    private final Map<C5921b, C5803c> f14301a = new HashMap();

    /* renamed from: a */
    public List<C5803c> m23612a() {
        return new ArrayList(this.f14301a.values());
    }

    /* renamed from: b */
    public void m23611b(C5803c c5803c) {
        InterfaceC5805e.EnumC5806a m23679j = c5803c.m23679j();
        C5921b m23680i = c5803c.m23680i();
        C5795m.m23744g(m23679j == InterfaceC5805e.EnumC5806a.CHILD_ADDED || m23679j == InterfaceC5805e.EnumC5806a.CHILD_CHANGED || m23679j == InterfaceC5805e.EnumC5806a.CHILD_REMOVED, "Only child changes supported for tracking");
        C5795m.m23745f(!c5803c.m23680i().m23292p());
        if (this.f14301a.containsKey(m23680i)) {
            C5803c c5803c2 = this.f14301a.get(m23680i);
            InterfaceC5805e.EnumC5806a m23679j2 = c5803c2.m23679j();
            if (m23679j == InterfaceC5805e.EnumC5806a.CHILD_ADDED && m23679j2 == InterfaceC5805e.EnumC5806a.CHILD_REMOVED) {
                this.f14301a.put(c5803c.m23680i(), C5803c.m23685d(m23680i, c5803c.m23678k(), c5803c2.m23678k()));
                return;
            } else if (m23679j == InterfaceC5805e.EnumC5806a.CHILD_REMOVED && m23679j2 == InterfaceC5805e.EnumC5806a.CHILD_ADDED) {
                this.f14301a.remove(m23680i);
                return;
            } else if (m23679j == InterfaceC5805e.EnumC5806a.CHILD_REMOVED && m23679j2 == InterfaceC5805e.EnumC5806a.CHILD_CHANGED) {
                this.f14301a.put(m23680i, C5803c.m23682g(m23680i, c5803c2.m23677l()));
                return;
            } else if (m23679j == InterfaceC5805e.EnumC5806a.CHILD_CHANGED && m23679j2 == InterfaceC5805e.EnumC5806a.CHILD_ADDED) {
                this.f14301a.put(m23680i, C5803c.m23687b(m23680i, c5803c.m23678k()));
                return;
            } else {
                InterfaceC5805e.EnumC5806a enumC5806a = InterfaceC5805e.EnumC5806a.CHILD_CHANGED;
                if (m23679j == enumC5806a && m23679j2 == enumC5806a) {
                    this.f14301a.put(m23680i, C5803c.m23685d(m23680i, c5803c.m23678k(), c5803c2.m23677l()));
                    return;
                }
                throw new IllegalStateException("Illegal combination of changes: " + c5803c + " occurred after " + c5803c2);
            }
        }
        this.f14301a.put(c5803c.m23680i(), c5803c);
    }
}
