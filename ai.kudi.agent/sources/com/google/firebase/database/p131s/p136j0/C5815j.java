package com.google.firebase.database.p131s.p136j0;

import com.google.firebase.database.C5611c;
import com.google.firebase.database.p131s.AbstractC5772i;
import com.google.firebase.database.p131s.C5740e0;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p132g0.AbstractC5748d;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p136j0.C5818l;
import com.google.firebase.database.p131s.p136j0.p137m.C5824b;
import com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d;
import com.google.firebase.database.p139u.C5936g;
import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.C5944m;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: View.java */
/* renamed from: com.google.firebase.database.s.j0.j */
/* loaded from: classes2.dex */
public class C5815j {

    /* renamed from: a */
    private final C5814i f14284a;

    /* renamed from: b */
    private final C5818l f14285b;

    /* renamed from: c */
    private C5817k f14286c;

    /* renamed from: d */
    private final List<AbstractC5772i> f14287d;

    /* renamed from: e */
    private final C5807f f14288e;

    /* compiled from: View.java */
    /* renamed from: com.google.firebase.database.s.j0.j$a */
    /* loaded from: classes2.dex */
    public static class C5816a {

        /* renamed from: a */
        public final List<C5804d> f14289a;

        /* renamed from: b */
        public final List<C5803c> f14290b;

        public C5816a(List<C5804d> list, List<C5803c> list2) {
            this.f14289a = list;
            this.f14290b = list2;
        }
    }

    public C5815j(C5814i c5814i, C5817k c5817k) {
        this.f14284a = c5814i;
        C5824b c5824b = new C5824b(c5814i.m23645c());
        InterfaceC5826d m23657h = c5814i.m23644d().m23657h();
        this.f14285b = new C5818l(m23657h);
        C5801a m23626d = c5817k.m23626d();
        C5801a m23627c = c5817k.m23627c();
        C5938i m23239f = C5938i.m23239f(C5936g.m23249P(), c5814i.m23645c());
        C5938i m23695a = m23626d.m23695a();
        c5824b.mo23597m(m23239f, m23695a, null);
        C5938i mo23597m = m23657h.mo23597m(m23239f, m23627c.m23695a(), null);
        this.f14286c = new C5817k(new C5801a(mo23597m, m23627c.m23690f(), m23657h.mo23599k()), new C5801a(m23695a, m23626d.m23690f(), c5824b.mo23599k()));
        this.f14287d = new ArrayList();
        this.f14288e = new C5807f(c5814i);
    }

    /* renamed from: c */
    private List<C5804d> m23638c(List<C5803c> list, C5938i c5938i, AbstractC5772i abstractC5772i) {
        List<AbstractC5772i> asList;
        if (abstractC5772i == null) {
            asList = this.f14287d;
        } else {
            asList = Arrays.asList(abstractC5772i);
        }
        return this.f14288e.m23669d(list, c5938i, asList);
    }

    /* renamed from: a */
    public void m23640a(AbstractC5772i abstractC5772i) {
        this.f14287d.add(abstractC5772i);
    }

    /* renamed from: b */
    public C5816a m23639b(AbstractC5748d abstractC5748d, C5740e0 c5740e0, InterfaceC5945n interfaceC5945n) {
        boolean z = false;
        if (abstractC5748d.m23906c() == AbstractC5748d.EnumC5749a.Merge && abstractC5748d.m23907b().m23904b() != null) {
            C5795m.m23744g(this.f14286c.m23628b() != null, "We should always have a full cache before handling merges");
            C5795m.m23744g(this.f14286c.m23629a() != null, "Missing event cache, even though we have a server cache");
        }
        C5817k c5817k = this.f14286c;
        C5818l.C5821c m23622b = this.f14285b.m23622b(c5817k, abstractC5748d, c5740e0, interfaceC5945n);
        C5795m.m23744g((m23622b.f14296a.m23626d().m23690f() || !c5817k.m23626d().m23690f()) ? true : true, "Once a server snap is complete, it should never go back");
        C5817k c5817k2 = m23622b.f14296a;
        this.f14286c = c5817k2;
        return new C5816a(m23638c(m23622b.f14297b, c5817k2.m23627c().m23695a(), null), m23622b.f14297b);
    }

    /* renamed from: d */
    public InterfaceC5945n m23637d() {
        return this.f14286c.m23629a();
    }

    /* renamed from: e */
    public InterfaceC5945n m23636e(C5830l c5830l) {
        InterfaceC5945n m23628b = this.f14286c.m23628b();
        if (m23628b != null) {
            if (this.f14284a.m23641g() || !(c5830l.isEmpty() || m23628b.mo23211L(c5830l.m23587Z()).isEmpty())) {
                return m23628b.mo23220B(c5830l);
            }
            return null;
        }
        return null;
    }

    /* renamed from: f */
    public InterfaceC5945n m23635f() {
        return this.f14286c.m23627c().m23694b();
    }

    /* renamed from: g */
    public List<C5804d> m23634g(AbstractC5772i abstractC5772i) {
        C5801a m23627c = this.f14286c.m23627c();
        ArrayList arrayList = new ArrayList();
        for (C5944m c5944m : m23627c.m23694b()) {
            arrayList.add(C5803c.m23686c(c5944m.m23222c(), c5944m.m23221d()));
        }
        if (m23627c.m23690f()) {
            arrayList.add(C5803c.m23676m(m23627c.m23695a()));
        }
        return m23638c(arrayList, m23627c.m23695a(), abstractC5772i);
    }

    /* renamed from: h */
    public C5814i m23633h() {
        return this.f14284a;
    }

    /* renamed from: i */
    public InterfaceC5945n m23632i() {
        return this.f14286c.m23626d().m23694b();
    }

    /* renamed from: j */
    public boolean m23631j() {
        return this.f14287d.isEmpty();
    }

    /* renamed from: k */
    public List<InterfaceC5805e> m23630k(AbstractC5772i abstractC5772i, C5611c c5611c) {
        List<InterfaceC5805e> emptyList;
        int i = 0;
        if (c5611c != null) {
            emptyList = new ArrayList<>();
            C5795m.m23744g(abstractC5772i == null, "A cancel should cancel all event registrations");
            C5830l m23643e = this.f14284a.m23643e();
            for (AbstractC5772i abstractC5772i2 : this.f14287d) {
                emptyList.add(new C5802b(abstractC5772i2, c5611c, m23643e));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        if (abstractC5772i != null) {
            int i2 = -1;
            while (true) {
                if (i >= this.f14287d.size()) {
                    i = i2;
                    break;
                }
                AbstractC5772i abstractC5772i3 = this.f14287d.get(i);
                if (abstractC5772i3.mo23807f(abstractC5772i)) {
                    if (abstractC5772i3.m23805h()) {
                        break;
                    }
                    i2 = i;
                }
                i++;
            }
            if (i != -1) {
                this.f14287d.remove(i);
                this.f14287d.get(i).m23801l();
            }
        } else {
            for (AbstractC5772i abstractC5772i4 : this.f14287d) {
                abstractC5772i4.m23801l();
            }
            this.f14287d.clear();
        }
        return emptyList;
    }
}
