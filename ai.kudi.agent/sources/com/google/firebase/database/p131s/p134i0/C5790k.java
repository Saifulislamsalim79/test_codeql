package com.google.firebase.database.p131s.p134i0;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p139u.C5921b;
import java.util.Map;
/* compiled from: Tree.java */
/* renamed from: com.google.firebase.database.s.i0.k */
/* loaded from: classes2.dex */
public class C5790k<T> {

    /* renamed from: a */
    private C5921b f14223a;

    /* renamed from: b */
    private C5790k<T> f14224b;

    /* renamed from: c */
    private C5794l<T> f14225c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Tree.java */
    /* renamed from: com.google.firebase.database.s.i0.k$a */
    /* loaded from: classes2.dex */
    public class C5791a implements InterfaceC5793c<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5793c f14226a;

        /* renamed from: b */
        final /* synthetic */ boolean f14227b;

        C5791a(C5790k c5790k, InterfaceC5793c interfaceC5793c, boolean z) {
            this.f14226a = interfaceC5793c;
            this.f14227b = z;
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5790k.InterfaceC5793c
        /* renamed from: a */
        public void mo23516a(C5790k<T> c5790k) {
            c5790k.m23761e(this.f14226a, true, this.f14227b);
        }
    }

    /* compiled from: Tree.java */
    /* renamed from: com.google.firebase.database.s.i0.k$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5792b<T> {
        /* renamed from: a */
        boolean mo23517a(C5790k<T> c5790k);
    }

    /* compiled from: Tree.java */
    /* renamed from: com.google.firebase.database.s.i0.k$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC5793c<T> {
        /* renamed from: a */
        void mo23516a(C5790k<T> c5790k);
    }

    public C5790k(C5921b c5921b, C5790k<T> c5790k, C5794l<T> c5794l) {
        this.f14223a = c5921b;
        this.f14224b = c5790k;
        this.f14225c = c5794l;
    }

    /* renamed from: m */
    private void m23753m(C5921b c5921b, C5790k<T> c5790k) {
        boolean m23757i = c5790k.m23757i();
        boolean containsKey = this.f14225c.f14228a.containsKey(c5921b);
        if (m23757i && containsKey) {
            this.f14225c.f14228a.remove(c5921b);
            m23752n();
        } else if (m23757i || containsKey) {
        } else {
            this.f14225c.f14228a.put(c5921b, c5790k.f14225c);
            m23752n();
        }
    }

    /* renamed from: n */
    private void m23752n() {
        C5790k<T> c5790k = this.f14224b;
        if (c5790k != null) {
            c5790k.m23753m(this.f14223a, this);
        }
    }

    /* renamed from: a */
    public boolean m23765a(InterfaceC5792b<T> interfaceC5792b) {
        return m23764b(interfaceC5792b, false);
    }

    /* renamed from: b */
    public boolean m23764b(InterfaceC5792b<T> interfaceC5792b, boolean z) {
        for (C5790k<T> c5790k = z ? this : this.f14224b; c5790k != null; c5790k = c5790k.f14224b) {
            if (interfaceC5792b.mo23517a(c5790k)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m23763c(InterfaceC5793c<T> interfaceC5793c) {
        for (Object obj : this.f14225c.f14228a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            interfaceC5793c.mo23516a(new C5790k<>((C5921b) entry.getKey(), this, (C5794l) entry.getValue()));
        }
    }

    /* renamed from: d */
    public void m23762d(InterfaceC5793c<T> interfaceC5793c) {
        m23761e(interfaceC5793c, false, false);
    }

    /* renamed from: e */
    public void m23761e(InterfaceC5793c<T> interfaceC5793c, boolean z, boolean z2) {
        if (z && !z2) {
            interfaceC5793c.mo23516a(this);
        }
        m23763c(new C5791a(this, interfaceC5793c, z2));
        if (z && z2) {
            interfaceC5793c.mo23516a(this);
        }
    }

    /* renamed from: f */
    public C5830l m23760f() {
        if (this.f14224b == null) {
            return this.f14223a != null ? new C5830l(this.f14223a) : C5830l.m23588X();
        }
        C5795m.m23745f(this.f14223a != null);
        return this.f14224b.m23760f().m23592J(this.f14223a);
    }

    /* renamed from: g */
    public T m23759g() {
        return this.f14225c.f14229b;
    }

    /* renamed from: h */
    public boolean m23758h() {
        return !this.f14225c.f14228a.isEmpty();
    }

    /* renamed from: i */
    public boolean m23757i() {
        C5794l<T> c5794l = this.f14225c;
        return c5794l.f14229b == null && c5794l.f14228a.isEmpty();
    }

    /* renamed from: j */
    public void m23756j(T t) {
        this.f14225c.f14229b = t;
        m23752n();
    }

    /* renamed from: k */
    public C5790k<T> m23755k(C5830l c5830l) {
        C5921b m23587Z = c5830l.m23587Z();
        C5790k<T> c5790k = this;
        while (m23587Z != null) {
            C5790k<T> c5790k2 = new C5790k<>(m23587Z, c5790k, c5790k.f14225c.f14228a.containsKey(m23587Z) ? c5790k.f14225c.f14228a.get(m23587Z) : new C5794l<>());
            c5830l = c5830l.m23583e0();
            m23587Z = c5830l.m23587Z();
            c5790k = c5790k2;
        }
        return c5790k;
    }

    /* renamed from: l */
    String m23754l(String str) {
        C5921b c5921b = this.f14223a;
        String m23298b = c5921b == null ? "<anon>" : c5921b.m23298b();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(m23298b);
        sb.append("\n");
        C5794l<T> c5794l = this.f14225c;
        sb.append(c5794l.m23751a(str + "\t"));
        return sb.toString();
    }

    public String toString() {
        return m23754l("");
    }

    public C5790k() {
        this(null, null, new C5794l());
    }
}
