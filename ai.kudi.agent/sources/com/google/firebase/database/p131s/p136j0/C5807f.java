package com.google.firebase.database.p131s.p136j0;

import com.google.firebase.database.p131s.AbstractC5772i;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p136j0.InterfaceC5805e;
import com.google.firebase.database.p139u.AbstractC5937h;
import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.C5944m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: EventGenerator.java */
/* renamed from: com.google.firebase.database.s.j0.f */
/* loaded from: classes2.dex */
public class C5807f {

    /* renamed from: a */
    private final C5814i f14262a;

    /* renamed from: b */
    private final AbstractC5937h f14263b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventGenerator.java */
    /* renamed from: com.google.firebase.database.s.j0.f$a */
    /* loaded from: classes2.dex */
    public class C5808a implements Comparator<C5803c> {
        C5808a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C5803c c5803c, C5803c c5803c2) {
            C5795m.m23745f((c5803c.m23680i() == null || c5803c2.m23680i() == null) ? false : true);
            return C5807f.this.f14263b.compare(new C5944m(c5803c.m23680i(), c5803c.m23678k().m23236l()), new C5944m(c5803c2.m23680i(), c5803c2.m23678k().m23236l()));
        }
    }

    public C5807f(C5814i c5814i) {
        this.f14262a = c5814i;
        this.f14263b = c5814i.m23645c();
    }

    /* renamed from: b */
    private Comparator<C5803c> m23671b() {
        return new C5808a();
    }

    /* renamed from: c */
    private C5804d m23670c(C5803c c5803c, AbstractC5772i abstractC5772i, C5938i c5938i) {
        if (!c5803c.m23679j().equals(InterfaceC5805e.EnumC5806a.VALUE) && !c5803c.m23679j().equals(InterfaceC5805e.EnumC5806a.CHILD_REMOVED)) {
            c5803c = c5803c.m23688a(c5938i.m23235m(c5803c.m23680i(), c5803c.m23678k().m23236l(), this.f14263b));
        }
        return abstractC5772i.mo23811b(c5803c, this.f14262a);
    }

    /* renamed from: e */
    private void m23668e(List<C5804d> list, InterfaceC5805e.EnumC5806a enumC5806a, List<C5803c> list2, List<AbstractC5772i> list3, C5938i c5938i) {
        ArrayList<C5803c> arrayList = new ArrayList();
        for (C5803c c5803c : list2) {
            if (c5803c.m23679j().equals(enumC5806a)) {
                arrayList.add(c5803c);
            }
        }
        Collections.sort(arrayList, m23671b());
        for (C5803c c5803c2 : arrayList) {
            for (AbstractC5772i abstractC5772i : list3) {
                if (abstractC5772i.mo23804i(enumC5806a)) {
                    list.add(m23670c(c5803c2, abstractC5772i, c5938i));
                }
            }
        }
    }

    /* renamed from: d */
    public List<C5804d> m23669d(List<C5803c> list, C5938i c5938i, List<AbstractC5772i> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C5803c c5803c : list) {
            if (c5803c.m23679j().equals(InterfaceC5805e.EnumC5806a.CHILD_CHANGED) && this.f14263b.m23245d(c5803c.m23677l().m23236l(), c5803c.m23678k().m23236l())) {
                arrayList2.add(C5803c.m23683f(c5803c.m23680i(), c5803c.m23678k()));
            }
        }
        m23668e(arrayList, InterfaceC5805e.EnumC5806a.CHILD_REMOVED, list, list2, c5938i);
        m23668e(arrayList, InterfaceC5805e.EnumC5806a.CHILD_ADDED, list, list2, c5938i);
        m23668e(arrayList, InterfaceC5805e.EnumC5806a.CHILD_MOVED, arrayList2, list2, c5938i);
        m23668e(arrayList, InterfaceC5805e.EnumC5806a.CHILD_CHANGED, list, list2, c5938i);
        m23668e(arrayList, InterfaceC5805e.EnumC5806a.VALUE, list, list2, c5938i);
        return arrayList;
    }
}
