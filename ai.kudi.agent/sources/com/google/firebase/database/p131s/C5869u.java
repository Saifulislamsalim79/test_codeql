package com.google.firebase.database.p131s;

import com.google.firebase.database.C5611c;
import com.google.firebase.database.p131s.p132g0.AbstractC5748d;
import com.google.firebase.database.p131s.p133h0.InterfaceC5758e;
import com.google.firebase.database.p131s.p134i0.C5785g;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p136j0.C5801a;
import com.google.firebase.database.p131s.p136j0.C5803c;
import com.google.firebase.database.p131s.p136j0.C5804d;
import com.google.firebase.database.p131s.p136j0.C5811h;
import com.google.firebase.database.p131s.p136j0.C5814i;
import com.google.firebase.database.p131s.p136j0.C5815j;
import com.google.firebase.database.p131s.p136j0.C5817k;
import com.google.firebase.database.p131s.p136j0.InterfaceC5805e;
import com.google.firebase.database.p139u.C5936g;
import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.C5944m;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: SyncPoint.java */
/* renamed from: com.google.firebase.database.s.u */
/* loaded from: classes2.dex */
public class C5869u {

    /* renamed from: a */
    private final Map<C5811h, C5815j> f14412a = new HashMap();

    /* renamed from: b */
    private final InterfaceC5758e f14413b;

    public C5869u(InterfaceC5758e interfaceC5758e) {
        this.f14413b = interfaceC5758e;
    }

    /* renamed from: c */
    private List<C5804d> m23471c(C5815j c5815j, AbstractC5748d abstractC5748d, C5740e0 c5740e0, InterfaceC5945n interfaceC5945n) {
        C5815j.C5816a m23639b = c5815j.m23639b(abstractC5748d, c5740e0, interfaceC5945n);
        if (!c5815j.m23633h().m23641g()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (C5803c c5803c : m23639b.f14290b) {
                InterfaceC5805e.EnumC5806a m23679j = c5803c.m23679j();
                if (m23679j == InterfaceC5805e.EnumC5806a.CHILD_ADDED) {
                    hashSet2.add(c5803c.m23680i());
                } else if (m23679j == InterfaceC5805e.EnumC5806a.CHILD_REMOVED) {
                    hashSet.add(c5803c.m23680i());
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.f14413b.mo23884e(c5815j.m23633h(), hashSet2, hashSet);
            }
        }
        return m23639b.f14289a;
    }

    /* renamed from: a */
    public List<C5804d> m23473a(AbstractC5772i abstractC5772i, C5740e0 c5740e0, C5801a c5801a) {
        C5814i mo23808e = abstractC5772i.mo23808e();
        C5815j m23467g = m23467g(mo23808e, c5740e0, c5801a);
        if (!mo23808e.m23641g()) {
            HashSet hashSet = new HashSet();
            for (C5944m c5944m : m23467g.m23635f()) {
                hashSet.add(c5944m.m23222c());
            }
            this.f14413b.mo23883f(mo23808e, hashSet);
        }
        if (!this.f14412a.containsKey(mo23808e.m23644d())) {
            this.f14412a.put(mo23808e.m23644d(), m23467g);
        }
        this.f14412a.put(mo23808e.m23644d(), m23467g);
        m23467g.m23640a(abstractC5772i);
        return m23467g.m23634g(abstractC5772i);
    }

    /* renamed from: b */
    public List<C5804d> m23472b(AbstractC5748d abstractC5748d, C5740e0 c5740e0, InterfaceC5945n interfaceC5945n) {
        C5811h m23904b = abstractC5748d.m23907b().m23904b();
        if (m23904b != null) {
            C5815j c5815j = this.f14412a.get(m23904b);
            C5795m.m23745f(c5815j != null);
            return m23471c(c5815j, abstractC5748d, c5740e0, interfaceC5945n);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C5811h, C5815j> entry : this.f14412a.entrySet()) {
            arrayList.addAll(m23471c(entry.getValue(), abstractC5748d, c5740e0, interfaceC5945n));
        }
        return arrayList;
    }

    /* renamed from: d */
    public InterfaceC5945n m23470d(C5830l c5830l) {
        for (C5815j c5815j : this.f14412a.values()) {
            if (c5815j.m23636e(c5830l) != null) {
                return c5815j.m23636e(c5830l);
            }
        }
        return null;
    }

    /* renamed from: e */
    public C5815j m23469e() {
        for (Map.Entry<C5811h, C5815j> entry : this.f14412a.entrySet()) {
            C5815j value = entry.getValue();
            if (value.m23633h().m23641g()) {
                return value;
            }
        }
        return null;
    }

    /* renamed from: f */
    public List<C5815j> m23468f() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C5811h, C5815j> entry : this.f14412a.entrySet()) {
            C5815j value = entry.getValue();
            if (!value.m23633h().m23641g()) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public C5815j m23467g(C5814i c5814i, C5740e0 c5740e0, C5801a c5801a) {
        boolean z;
        C5815j c5815j = this.f14412a.get(c5814i.m23644d());
        if (c5815j == null) {
            InterfaceC5945n m23958b = c5740e0.m23958b(c5801a.m23690f() ? c5801a.m23694b() : null);
            if (m23958b != null) {
                z = true;
            } else {
                m23958b = c5740e0.m23955e(c5801a.m23694b() != null ? c5801a.m23694b() : C5936g.m23249P());
                z = false;
            }
            return new C5815j(c5814i, new C5817k(new C5801a(C5938i.m23239f(m23958b, c5814i.m23645c()), z, false), c5801a));
        }
        return c5815j;
    }

    /* renamed from: h */
    public boolean m23466h() {
        return m23469e() != null;
    }

    /* renamed from: i */
    public boolean m23465i() {
        return this.f14412a.isEmpty();
    }

    /* renamed from: j */
    public C5785g<List<C5814i>, List<InterfaceC5805e>> m23464j(C5814i c5814i, AbstractC5772i abstractC5772i, C5611c c5611c) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean m23466h = m23466h();
        if (c5814i.m23642f()) {
            Iterator<Map.Entry<C5811h, C5815j>> it = this.f14412a.entrySet().iterator();
            while (it.hasNext()) {
                C5815j value = it.next().getValue();
                arrayList2.addAll(value.m23630k(abstractC5772i, c5611c));
                if (value.m23631j()) {
                    it.remove();
                    if (!value.m23633h().m23641g()) {
                        arrayList.add(value.m23633h());
                    }
                }
            }
        } else {
            C5815j c5815j = this.f14412a.get(c5814i.m23644d());
            if (c5815j != null) {
                arrayList2.addAll(c5815j.m23630k(abstractC5772i, c5611c));
                if (c5815j.m23631j()) {
                    this.f14412a.remove(c5814i.m23644d());
                    if (!c5815j.m23633h().m23641g()) {
                        arrayList.add(c5815j.m23633h());
                    }
                }
            }
        }
        if (m23466h && !m23466h()) {
            arrayList.add(C5814i.m23647a(c5814i.m23643e()));
        }
        return new C5785g<>(arrayList, arrayList2);
    }

    /* renamed from: k */
    public boolean m23463k(C5814i c5814i) {
        return m23462l(c5814i) != null;
    }

    /* renamed from: l */
    public C5815j m23462l(C5814i c5814i) {
        if (c5814i.m23641g()) {
            return m23469e();
        }
        return this.f14412a.get(c5814i.m23644d());
    }
}
