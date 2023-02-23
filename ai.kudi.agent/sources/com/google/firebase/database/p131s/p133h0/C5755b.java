package com.google.firebase.database.p131s.p133h0;

import com.google.firebase.database.p131s.C5737e;
import com.google.firebase.database.p131s.C5743g;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.C5895z;
import com.google.firebase.database.p131s.p134i0.C5774b;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p134i0.InterfaceC5773a;
import com.google.firebase.database.p131s.p136j0.C5801a;
import com.google.firebase.database.p131s.p136j0.C5814i;
import com.google.firebase.database.p138t.C5899c;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5936g;
import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: DefaultPersistenceManager.java */
/* renamed from: com.google.firebase.database.s.h0.b */
/* loaded from: classes2.dex */
public class C5755b implements InterfaceC5758e {

    /* renamed from: a */
    private final InterfaceC5759f f14172a;

    /* renamed from: b */
    private final C5765i f14173b;

    /* renamed from: c */
    private final C5899c f14174c;

    /* renamed from: d */
    private final InterfaceC5754a f14175d;

    /* renamed from: e */
    private long f14176e;

    public C5755b(C5743g c5743g, InterfaceC5759f interfaceC5759f, InterfaceC5754a interfaceC5754a) {
        this(c5743g, interfaceC5759f, interfaceC5754a, new C5774b());
    }

    /* renamed from: p */
    private void m23894p() {
        long j = this.f14176e + 1;
        this.f14176e = j;
        if (this.f14175d.mo23890d(j)) {
            if (this.f14174c.m23362f()) {
                this.f14174c.m23366b("Reached prune check threshold.", new Object[0]);
            }
            this.f14176e = 0L;
            boolean z = true;
            long mo23859o = this.f14172a.mo23859o();
            if (this.f14174c.m23362f()) {
                C5899c c5899c = this.f14174c;
                c5899c.m23366b("Cache size: " + mo23859o, new Object[0]);
            }
            while (z && this.f14175d.mo23893a(mo23859o, this.f14173b.m23837f())) {
                C5760g m23827p = this.f14173b.m23827p(this.f14175d);
                if (m23827p.m23851e()) {
                    this.f14172a.mo23856r(C5830l.m23588X(), m23827p);
                } else {
                    z = false;
                }
                mo23859o = this.f14172a.mo23859o();
                if (this.f14174c.m23362f()) {
                    C5899c c5899c2 = this.f14174c;
                    c5899c2.m23366b("Cache size after prune: " + mo23859o, new Object[0]);
                }
            }
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: a */
    public void mo23888a(long j) {
        this.f14172a.mo23873a(j);
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: b */
    public void mo23887b(C5830l c5830l, InterfaceC5945n interfaceC5945n, long j) {
        this.f14172a.mo23872b(c5830l, interfaceC5945n, j);
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: c */
    public void mo23886c(C5830l c5830l, C5737e c5737e, long j) {
        this.f14172a.mo23871c(c5830l, c5737e, j);
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: d */
    public List<C5895z> mo23885d() {
        return this.f14172a.mo23870d();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: e */
    public void mo23884e(C5814i c5814i, Set<C5921b> set, Set<C5921b> set2) {
        boolean z = true;
        C5795m.m23744g(!c5814i.m23641g(), "We should only track keys for filtered queries.");
        C5764h m23834i = this.f14173b.m23834i(c5814i);
        C5795m.m23744g((m23834i == null || !m23834i.f14189e) ? false : false, "We only expect tracked keys for currently-active queries.");
        this.f14172a.mo23857q(m23834i.f14185a, set, set2);
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: f */
    public void mo23883f(C5814i c5814i, Set<C5921b> set) {
        boolean z = true;
        C5795m.m23744g(!c5814i.m23641g(), "We should only track keys for filtered queries.");
        C5764h m23834i = this.f14173b.m23834i(c5814i);
        C5795m.m23744g((m23834i == null || !m23834i.f14189e) ? false : false, "We only expect tracked keys for currently-active queries.");
        this.f14172a.mo23862l(m23834i.f14185a, set);
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: g */
    public void mo23882g(C5814i c5814i) {
        this.f14173b.m23822u(c5814i);
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: h */
    public void mo23881h(C5814i c5814i) {
        this.f14173b.m23819x(c5814i);
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: i */
    public void mo23880i(C5814i c5814i) {
        if (c5814i.m23641g()) {
            this.f14173b.m23823t(c5814i.m23643e());
        } else {
            this.f14173b.m23820w(c5814i);
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: j */
    public <T> T mo23879j(Callable<T> callable) {
        this.f14172a.beginTransaction();
        try {
            T call = callable.call();
            this.f14172a.setTransactionSuccessful();
            return call;
        } finally {
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: k */
    public void mo23878k(C5814i c5814i, InterfaceC5945n interfaceC5945n) {
        if (c5814i.m23641g()) {
            this.f14172a.mo23860n(c5814i.m23643e(), interfaceC5945n);
        } else {
            this.f14172a.mo23863k(c5814i.m23643e(), interfaceC5945n);
        }
        mo23880i(c5814i);
        m23894p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: l */
    public void mo23877l(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
        if (this.f14173b.m23831l(c5830l)) {
            return;
        }
        this.f14172a.mo23860n(c5830l, interfaceC5945n);
        this.f14173b.m23836g(c5830l);
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: m */
    public void mo23876m(C5830l c5830l, C5737e c5737e) {
        Iterator<Map.Entry<C5830l, InterfaceC5945n>> it = c5737e.iterator();
        while (it.hasNext()) {
            Map.Entry<C5830l, InterfaceC5945n> next = it.next();
            mo23877l(c5830l.m23593I(next.getKey()), next.getValue());
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: n */
    public void mo23875n(C5830l c5830l, C5737e c5737e) {
        this.f14172a.mo23867g(c5830l, c5737e);
        m23894p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: o */
    public C5801a mo23874o(C5814i c5814i) {
        Set<C5921b> m23833j;
        boolean z;
        if (this.f14173b.m23829n(c5814i)) {
            C5764h m23834i = this.f14173b.m23834i(c5814i);
            m23833j = (c5814i.m23641g() || m23834i == null || !m23834i.f14188d) ? null : this.f14172a.mo23868f(m23834i.f14185a);
            z = true;
        } else {
            m23833j = this.f14173b.m23833j(c5814i.m23643e());
            z = false;
        }
        InterfaceC5945n mo23866h = this.f14172a.mo23866h(c5814i.m23643e());
        if (m23833j != null) {
            InterfaceC5945n m23249P = C5936g.m23249P();
            for (C5921b c5921b : m23833j) {
                m23249P = m23249P.mo23216T(c5921b, mo23866h.mo23211L(c5921b));
            }
            return new C5801a(C5938i.m23239f(m23249P, c5814i.m23645c()), z, true);
        }
        return new C5801a(C5938i.m23239f(mo23866h, c5814i.m23645c()), z, false);
    }

    public C5755b(C5743g c5743g, InterfaceC5759f interfaceC5759f, InterfaceC5754a interfaceC5754a, InterfaceC5773a interfaceC5773a) {
        this.f14176e = 0L;
        this.f14172a = interfaceC5759f;
        this.f14174c = c5743g.m23924p("Persistence");
        this.f14173b = new C5765i(this.f14172a, this.f14174c, interfaceC5773a);
        this.f14175d = interfaceC5754a;
    }
}
