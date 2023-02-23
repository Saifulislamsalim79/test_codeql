package com.google.firebase.database.p131s.p133h0;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p134i0.C5779d;
import com.google.firebase.database.p131s.p134i0.InterfaceC5787i;
import com.google.firebase.database.p139u.C5921b;
/* compiled from: PruneForest.java */
/* renamed from: com.google.firebase.database.s.h0.g */
/* loaded from: classes2.dex */
public class C5760g {

    /* renamed from: b */
    private static final InterfaceC5787i<Boolean> f14179b = new C5761a();

    /* renamed from: c */
    private static final InterfaceC5787i<Boolean> f14180c = new C5762b();

    /* renamed from: d */
    private static final C5779d<Boolean> f14181d = new C5779d<>(Boolean.TRUE);

    /* renamed from: e */
    private static final C5779d<Boolean> f14182e = new C5779d<>(Boolean.FALSE);

    /* renamed from: a */
    private final C5779d<Boolean> f14183a;

    /* compiled from: PruneForest.java */
    /* renamed from: com.google.firebase.database.s.h0.g$a */
    /* loaded from: classes2.dex */
    class C5761a implements InterfaceC5787i<Boolean> {
        C5761a() {
        }

        @Override // com.google.firebase.database.p131s.p134i0.InterfaceC5787i
        /* renamed from: b */
        public boolean mo23768a(Boolean bool) {
            return !bool.booleanValue();
        }
    }

    /* compiled from: PruneForest.java */
    /* renamed from: com.google.firebase.database.s.h0.g$b */
    /* loaded from: classes2.dex */
    class C5762b implements InterfaceC5787i<Boolean> {
        C5762b() {
        }

        @Override // com.google.firebase.database.p131s.p134i0.InterfaceC5787i
        /* renamed from: b */
        public boolean mo23768a(Boolean bool) {
            return bool.booleanValue();
        }
    }

    /* compiled from: PruneForest.java */
    /* renamed from: com.google.firebase.database.s.h0.g$c */
    /* loaded from: classes2.dex */
    class C5763c implements C5779d.InterfaceC5782c<Boolean, T> {

        /* renamed from: a */
        final /* synthetic */ C5779d.InterfaceC5782c f14184a;

        C5763c(C5760g c5760g, C5779d.InterfaceC5782c interfaceC5782c) {
            this.f14184a = interfaceC5782c;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // com.google.firebase.database.p131s.p134i0.C5779d.InterfaceC5782c
        /* renamed from: b */
        public T mo23405a(C5830l c5830l, Boolean bool, T t) {
            return !bool.booleanValue() ? this.f14184a.mo23405a(c5830l, null, t) : t;
        }
    }

    public C5760g() {
        this.f14183a = C5779d.m23785e();
    }

    /* renamed from: a */
    public C5760g m23855a(C5921b c5921b) {
        C5779d<Boolean> m23778u = this.f14183a.m23778u(c5921b);
        if (m23778u == null) {
            m23778u = new C5779d<>(this.f14183a.getValue());
        } else if (m23778u.getValue() == null && this.f14183a.getValue() != null) {
            m23778u = m23778u.m23790P(C5830l.m23588X(), this.f14183a.getValue());
        }
        return new C5760g(m23778u);
    }

    /* renamed from: b */
    public <T> T m23854b(T t, C5779d.InterfaceC5782c<Void, T> interfaceC5782c) {
        return (T) this.f14183a.m23781l(t, new C5763c(this, interfaceC5782c));
    }

    /* renamed from: c */
    public C5760g m23853c(C5830l c5830l) {
        return this.f14183a.m23791O(c5830l, f14179b) != null ? this : new C5760g(this.f14183a.m23789V(c5830l, f14182e));
    }

    /* renamed from: d */
    public C5760g m23852d(C5830l c5830l) {
        if (this.f14183a.m23791O(c5830l, f14179b) == null) {
            return this.f14183a.m23791O(c5830l, f14180c) != null ? this : new C5760g(this.f14183a.m23789V(c5830l, f14181d));
        }
        throw new IllegalArgumentException("Can't prune path that was kept previously!");
    }

    /* renamed from: e */
    public boolean m23851e() {
        return this.f14183a.m23786d(f14180c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5760g) && this.f14183a.equals(((C5760g) obj).f14183a);
    }

    /* renamed from: f */
    public boolean m23850f(C5830l c5830l) {
        Boolean m23794F = this.f14183a.m23794F(c5830l);
        return (m23794F == null || m23794F.booleanValue()) ? false : true;
    }

    /* renamed from: g */
    public boolean m23849g(C5830l c5830l) {
        Boolean m23794F = this.f14183a.m23794F(c5830l);
        return m23794F != null && m23794F.booleanValue();
    }

    public int hashCode() {
        return this.f14183a.hashCode();
    }

    public String toString() {
        return "{PruneForest:" + this.f14183a.toString() + "}";
    }

    private C5760g(C5779d<Boolean> c5779d) {
        this.f14183a = c5779d;
    }
}
