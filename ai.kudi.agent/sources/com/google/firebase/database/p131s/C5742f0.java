package com.google.firebase.database.p131s;

import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p136j0.C5814i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: ZombieEventManager.java */
/* renamed from: com.google.firebase.database.s.f0 */
/* loaded from: classes2.dex */
public class C5742f0 implements InterfaceC5800j {

    /* renamed from: b */
    private static C5742f0 f14132b = new C5742f0();

    /* renamed from: a */
    final HashMap<AbstractC5772i, List<AbstractC5772i>> f14133a = new HashMap<>();

    private C5742f0() {
    }

    /* renamed from: b */
    public static C5742f0 m23950b() {
        return f14132b;
    }

    /* renamed from: d */
    private void m23948d(AbstractC5772i abstractC5772i) {
        AbstractC5772i mo23812a;
        List<AbstractC5772i> list;
        synchronized (this.f14133a) {
            List<AbstractC5772i> list2 = this.f14133a.get(abstractC5772i);
            boolean z = true;
            int i = 0;
            int i2 = 0;
            if (list2 != null) {
                while (true) {
                    if (i2 >= list2.size()) {
                        i2 = 0;
                        break;
                    } else if (list2.get(i2) == abstractC5772i) {
                        list2.remove(i2);
                        i2 = 1;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (list2.isEmpty()) {
                    this.f14133a.remove(abstractC5772i);
                }
            }
            if (i2 == 0 && abstractC5772i.m23806g()) {
                z = false;
            }
            C5795m.m23745f(z);
            if (!abstractC5772i.mo23808e().m23642f() && (list = this.f14133a.get((mo23812a = abstractC5772i.mo23812a(C5814i.m23647a(abstractC5772i.mo23808e().m23643e()))))) != null) {
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (list.get(i) == abstractC5772i) {
                        list.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
                if (list.isEmpty()) {
                    this.f14133a.remove(mo23812a);
                }
            }
        }
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5800j
    /* renamed from: a */
    public void mo23696a(AbstractC5772i abstractC5772i) {
        m23948d(abstractC5772i);
    }

    /* renamed from: c */
    public void m23949c(AbstractC5772i abstractC5772i) {
        synchronized (this.f14133a) {
            List<AbstractC5772i> list = this.f14133a.get(abstractC5772i);
            if (list == null) {
                list = new ArrayList<>();
                this.f14133a.put(abstractC5772i, list);
            }
            list.add(abstractC5772i);
            if (!abstractC5772i.mo23808e().m23642f()) {
                AbstractC5772i mo23812a = abstractC5772i.mo23812a(C5814i.m23647a(abstractC5772i.mo23808e().m23643e()));
                List<AbstractC5772i> list2 = this.f14133a.get(mo23812a);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    this.f14133a.put(mo23812a, list2);
                }
                list2.add(abstractC5772i);
            }
            abstractC5772i.m23803j(true);
            abstractC5772i.m23802k(this);
        }
    }

    /* renamed from: e */
    public void m23947e(AbstractC5772i abstractC5772i) {
        synchronized (this.f14133a) {
            List<AbstractC5772i> list = this.f14133a.get(abstractC5772i);
            if (list != null && !list.isEmpty()) {
                if (abstractC5772i.mo23808e().m23642f()) {
                    HashSet hashSet = new HashSet();
                    for (int size = list.size() - 1; size >= 0; size--) {
                        AbstractC5772i abstractC5772i2 = list.get(size);
                        if (!hashSet.contains(abstractC5772i2.mo23808e())) {
                            hashSet.add(abstractC5772i2.mo23808e());
                            abstractC5772i2.m23801l();
                        }
                    }
                } else {
                    list.get(0).m23801l();
                }
            }
        }
    }
}
