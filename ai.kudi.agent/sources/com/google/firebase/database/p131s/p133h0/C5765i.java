package com.google.firebase.database.p131s.p133h0;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p134i0.C5779d;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p134i0.InterfaceC5773a;
import com.google.firebase.database.p131s.p134i0.InterfaceC5787i;
import com.google.firebase.database.p131s.p136j0.C5811h;
import com.google.firebase.database.p131s.p136j0.C5814i;
import com.google.firebase.database.p138t.C5899c;
import com.google.firebase.database.p139u.C5921b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: TrackedQueryManager.java */
/* renamed from: com.google.firebase.database.s.h0.i */
/* loaded from: classes2.dex */
public class C5765i {

    /* renamed from: f */
    private static final InterfaceC5787i<Map<C5811h, C5764h>> f14190f = new C5766a();

    /* renamed from: g */
    private static final InterfaceC5787i<Map<C5811h, C5764h>> f14191g = new C5767b();

    /* renamed from: h */
    private static final InterfaceC5787i<C5764h> f14192h = new C5768c();

    /* renamed from: i */
    private static final InterfaceC5787i<C5764h> f14193i = new C5769d();

    /* renamed from: a */
    private C5779d<Map<C5811h, C5764h>> f14194a = new C5779d<>(null);

    /* renamed from: b */
    private final InterfaceC5759f f14195b;

    /* renamed from: c */
    private final C5899c f14196c;

    /* renamed from: d */
    private final InterfaceC5773a f14197d;

    /* renamed from: e */
    private long f14198e;

    /* compiled from: TrackedQueryManager.java */
    /* renamed from: com.google.firebase.database.s.h0.i$a */
    /* loaded from: classes2.dex */
    class C5766a implements InterfaceC5787i<Map<C5811h, C5764h>> {
        C5766a() {
        }

        @Override // com.google.firebase.database.p131s.p134i0.InterfaceC5787i
        /* renamed from: b */
        public boolean mo23768a(Map<C5811h, C5764h> map) {
            C5764h c5764h = map.get(C5811h.f14269i);
            return c5764h != null && c5764h.f14188d;
        }
    }

    /* compiled from: TrackedQueryManager.java */
    /* renamed from: com.google.firebase.database.s.h0.i$b */
    /* loaded from: classes2.dex */
    class C5767b implements InterfaceC5787i<Map<C5811h, C5764h>> {
        C5767b() {
        }

        @Override // com.google.firebase.database.p131s.p134i0.InterfaceC5787i
        /* renamed from: b */
        public boolean mo23768a(Map<C5811h, C5764h> map) {
            C5764h c5764h = map.get(C5811h.f14269i);
            return c5764h != null && c5764h.f14189e;
        }
    }

    /* compiled from: TrackedQueryManager.java */
    /* renamed from: com.google.firebase.database.s.h0.i$c */
    /* loaded from: classes2.dex */
    class C5768c implements InterfaceC5787i<C5764h> {
        C5768c() {
        }

        @Override // com.google.firebase.database.p131s.p134i0.InterfaceC5787i
        /* renamed from: b */
        public boolean mo23768a(C5764h c5764h) {
            return !c5764h.f14189e;
        }
    }

    /* compiled from: TrackedQueryManager.java */
    /* renamed from: com.google.firebase.database.s.h0.i$d */
    /* loaded from: classes2.dex */
    class C5769d implements InterfaceC5787i<C5764h> {
        C5769d() {
        }

        @Override // com.google.firebase.database.p131s.p134i0.InterfaceC5787i
        /* renamed from: b */
        public boolean mo23768a(C5764h c5764h) {
            return !C5765i.f14192h.mo23768a(c5764h);
        }
    }

    /* compiled from: TrackedQueryManager.java */
    /* renamed from: com.google.firebase.database.s.h0.i$e */
    /* loaded from: classes2.dex */
    class C5770e implements C5779d.InterfaceC5782c<Map<C5811h, C5764h>, Void> {
        C5770e() {
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5779d.InterfaceC5782c
        /* renamed from: b */
        public Void mo23405a(C5830l c5830l, Map<C5811h, C5764h> map, Void r3) {
            for (Map.Entry<C5811h, C5764h> entry : map.entrySet()) {
                C5764h value = entry.getValue();
                if (!value.f14188d) {
                    C5765i.this.m23824s(value.m23844b());
                }
            }
            return null;
        }
    }

    /* compiled from: TrackedQueryManager.java */
    /* renamed from: com.google.firebase.database.s.h0.i$f */
    /* loaded from: classes2.dex */
    class C5771f implements Comparator<C5764h> {
        C5771f(C5765i c5765i) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C5764h c5764h, C5764h c5764h2) {
            return C5795m.m23749b(c5764h.f14187c, c5764h2.f14187c);
        }
    }

    public C5765i(InterfaceC5759f interfaceC5759f, C5899c c5899c, InterfaceC5773a interfaceC5773a) {
        this.f14198e = 0L;
        this.f14195b = interfaceC5759f;
        this.f14196c = c5899c;
        this.f14197d = interfaceC5773a;
        m23825r();
        for (C5764h c5764h : this.f14195b.mo23858p()) {
            this.f14198e = Math.max(c5764h.f14185a + 1, this.f14198e);
            m23839d(c5764h);
        }
    }

    /* renamed from: c */
    private static void m23840c(C5814i c5814i) {
        C5795m.m23744g(!c5814i.m23641g() || c5814i.m23642f(), "Can't have tracked non-default query that loads all data");
    }

    /* renamed from: d */
    private void m23839d(C5764h c5764h) {
        m23840c(c5764h.f14186b);
        Map<C5811h, C5764h> m23779s = this.f14194a.m23779s(c5764h.f14186b.m23643e());
        if (m23779s == null) {
            m23779s = new HashMap<>();
            this.f14194a = this.f14194a.m23790P(c5764h.f14186b.m23643e(), m23779s);
        }
        C5764h c5764h2 = m23779s.get(c5764h.f14186b.m23644d());
        C5795m.m23745f(c5764h2 == null || c5764h2.f14185a == c5764h.f14185a);
        m23779s.put(c5764h.f14186b.m23644d(), c5764h);
    }

    /* renamed from: e */
    private static long m23838e(InterfaceC5754a interfaceC5754a, long j) {
        return j - Math.min((long) Math.floor(((float) j) * (1.0f - interfaceC5754a.mo23891c())), interfaceC5754a.mo23892b());
    }

    /* renamed from: h */
    private Set<Long> m23835h(C5830l c5830l) {
        HashSet hashSet = new HashSet();
        Map<C5811h, C5764h> m23779s = this.f14194a.m23779s(c5830l);
        if (m23779s != null) {
            for (C5764h c5764h : m23779s.values()) {
                if (!c5764h.f14186b.m23641g()) {
                    hashSet.add(Long.valueOf(c5764h.f14185a));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: k */
    private List<C5764h> m23832k(InterfaceC5787i<C5764h> interfaceC5787i) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<C5830l, Map<C5811h, C5764h>>> it = this.f14194a.iterator();
        while (it.hasNext()) {
            for (C5764h c5764h : it.next().getValue().values()) {
                if (interfaceC5787i.mo23768a(c5764h)) {
                    arrayList.add(c5764h);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    private boolean m23830m(C5830l c5830l) {
        return this.f14194a.m23784f(c5830l, f14190f) != null;
    }

    /* renamed from: o */
    private static C5814i m23828o(C5814i c5814i) {
        return c5814i.m23641g() ? C5814i.m23647a(c5814i.m23643e()) : c5814i;
    }

    /* renamed from: r */
    private void m23825r() {
        try {
            this.f14195b.beginTransaction();
            this.f14195b.mo23864j(this.f14197d.mo23772a());
            this.f14195b.setTransactionSuccessful();
        } finally {
            this.f14195b.endTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m23824s(C5764h c5764h) {
        m23839d(c5764h);
        this.f14195b.mo23861m(c5764h);
    }

    /* renamed from: v */
    private void m23821v(C5814i c5814i, boolean z) {
        C5764h c5764h;
        C5814i m23828o = m23828o(c5814i);
        C5764h m23834i = m23834i(m23828o);
        long mo23772a = this.f14197d.mo23772a();
        if (m23834i != null) {
            c5764h = m23834i.m23843c(mo23772a).m23845a(z);
        } else {
            C5795m.m23744g(z, "If we're setting the query to inactive, we should already be tracking it!");
            long j = this.f14198e;
            this.f14198e = 1 + j;
            c5764h = new C5764h(j, m23828o, mo23772a, false, z);
        }
        m23824s(c5764h);
    }

    /* renamed from: f */
    public long m23837f() {
        return m23832k(f14192h).size();
    }

    /* renamed from: g */
    public void m23836g(C5830l c5830l) {
        C5764h m23844b;
        if (m23830m(c5830l)) {
            return;
        }
        C5814i m23647a = C5814i.m23647a(c5830l);
        C5764h m23834i = m23834i(m23647a);
        if (m23834i == null) {
            long j = this.f14198e;
            this.f14198e = 1 + j;
            m23844b = new C5764h(j, m23647a, this.f14197d.mo23772a(), true, false);
        } else {
            C5795m.m23744g(!m23834i.f14188d, "This should have been handled above!");
            m23844b = m23834i.m23844b();
        }
        m23824s(m23844b);
    }

    /* renamed from: i */
    public C5764h m23834i(C5814i c5814i) {
        C5814i m23828o = m23828o(c5814i);
        Map<C5811h, C5764h> m23779s = this.f14194a.m23779s(m23828o.m23643e());
        if (m23779s != null) {
            return m23779s.get(m23828o.m23644d());
        }
        return null;
    }

    /* renamed from: j */
    public Set<C5921b> m23833j(C5830l c5830l) {
        C5795m.m23744g(!m23829n(C5814i.m23647a(c5830l)), "Path is fully complete.");
        HashSet hashSet = new HashSet();
        Set<Long> m23835h = m23835h(c5830l);
        if (!m23835h.isEmpty()) {
            hashSet.addAll(this.f14195b.mo23865i(m23835h));
        }
        Iterator<Map.Entry<C5921b, C5779d<Map<C5811h, C5764h>>>> it = this.f14194a.m23788X(c5830l).m23795E().iterator();
        while (it.hasNext()) {
            Map.Entry<C5921b, C5779d<Map<C5811h, C5764h>>> next = it.next();
            C5921b key = next.getKey();
            C5779d<Map<C5811h, C5764h>> value = next.getValue();
            if (value.getValue() != null && f14190f.mo23768a(value.getValue())) {
                hashSet.add(key);
            }
        }
        return hashSet;
    }

    /* renamed from: l */
    public boolean m23831l(C5830l c5830l) {
        return this.f14194a.m23791O(c5830l, f14191g) != null;
    }

    /* renamed from: n */
    public boolean m23829n(C5814i c5814i) {
        Map<C5811h, C5764h> m23779s;
        if (m23830m(c5814i.m23643e())) {
            return true;
        }
        return !c5814i.m23641g() && (m23779s = this.f14194a.m23779s(c5814i.m23643e())) != null && m23779s.containsKey(c5814i.m23644d()) && m23779s.get(c5814i.m23644d()).f14188d;
    }

    /* renamed from: p */
    public C5760g m23827p(InterfaceC5754a interfaceC5754a) {
        List<C5764h> m23832k = m23832k(f14192h);
        long m23838e = m23838e(interfaceC5754a, m23832k.size());
        C5760g c5760g = new C5760g();
        if (this.f14196c.m23362f()) {
            C5899c c5899c = this.f14196c;
            c5899c.m23366b("Pruning old queries.  Prunable: " + m23832k.size() + " Count to prune: " + m23838e, new Object[0]);
        }
        Collections.sort(m23832k, new C5771f(this));
        for (int i = 0; i < m23838e; i++) {
            C5764h c5764h = m23832k.get(i);
            c5760g = c5760g.m23852d(c5764h.f14186b.m23643e());
            m23826q(c5764h.f14186b);
        }
        for (int i2 = (int) m23838e; i2 < m23832k.size(); i2++) {
            c5760g = c5760g.m23853c(m23832k.get(i2).f14186b.m23643e());
        }
        List<C5764h> m23832k2 = m23832k(f14193i);
        if (this.f14196c.m23362f()) {
            C5899c c5899c2 = this.f14196c;
            c5899c2.m23366b("Unprunable queries: " + m23832k2.size(), new Object[0]);
        }
        for (C5764h c5764h2 : m23832k2) {
            c5760g = c5760g.m23853c(c5764h2.f14186b.m23643e());
        }
        return c5760g;
    }

    /* renamed from: q */
    public void m23826q(C5814i c5814i) {
        C5814i m23828o = m23828o(c5814i);
        C5764h m23834i = m23834i(m23828o);
        C5795m.m23744g(m23834i != null, "Query must exist to be removed.");
        this.f14195b.mo23869e(m23834i.f14185a);
        Map<C5811h, C5764h> m23779s = this.f14194a.m23779s(m23828o.m23643e());
        m23779s.remove(m23828o.m23644d());
        if (m23779s.isEmpty()) {
            this.f14194a = this.f14194a.m23792J(m23828o.m23643e());
        }
    }

    /* renamed from: t */
    public void m23823t(C5830l c5830l) {
        this.f14194a.m23788X(c5830l).m23780m(new C5770e());
    }

    /* renamed from: u */
    public void m23822u(C5814i c5814i) {
        m23821v(c5814i, true);
    }

    /* renamed from: w */
    public void m23820w(C5814i c5814i) {
        C5764h m23834i = m23834i(m23828o(c5814i));
        if (m23834i == null || m23834i.f14188d) {
            return;
        }
        m23824s(m23834i.m23844b());
    }

    /* renamed from: x */
    public void m23819x(C5814i c5814i) {
        m23821v(c5814i, false);
    }
}
