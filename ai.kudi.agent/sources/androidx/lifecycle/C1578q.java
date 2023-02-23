package androidx.lifecycle;

import androidx.lifecycle.AbstractC1565i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p201g.p210b.p211a.p212a.C7498a;
import p201g.p210b.p211a.p213b.C7503a;
import p201g.p210b.p211a.p213b.C7504b;
/* compiled from: LifecycleRegistry.java */
/* renamed from: androidx.lifecycle.q */
/* loaded from: classes2.dex */
public class C1578q extends AbstractC1565i {

    /* renamed from: b */
    private C7503a<n, C1579a> f4779b;

    /* renamed from: c */
    private AbstractC1565i.c f4780c;

    /* renamed from: d */
    private final WeakReference<o> f4781d;

    /* renamed from: e */
    private int f4782e;

    /* renamed from: f */
    private boolean f4783f;

    /* renamed from: g */
    private boolean f4784g;

    /* renamed from: h */
    private ArrayList<AbstractC1565i.c> f4785h;

    /* renamed from: i */
    private final boolean f4786i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LifecycleRegistry.java */
    /* renamed from: androidx.lifecycle.q$a */
    /* loaded from: classes2.dex */
    public static class C1579a {

        /* renamed from: a */
        AbstractC1565i.c f4787a;

        /* renamed from: b */
        InterfaceC1572l f4788b;

        C1579a(n nVar, AbstractC1565i.c cVar) {
            this.f4788b = C1581s.m35484f(nVar);
            this.f4787a = cVar;
        }

        /* renamed from: a */
        void m35490a(o oVar, AbstractC1565i.b bVar) {
            AbstractC1565i.c b = bVar.b();
            this.f4787a = C1578q.m35496k(this.f4787a, b);
            this.f4788b.mo34271m(oVar, bVar);
            this.f4787a = b;
        }
    }

    public C1578q(o oVar) {
        this(oVar, true);
    }

    /* renamed from: d */
    private void m35503d(o oVar) {
        Iterator<Map.Entry<n, C1579a>> descendingIterator = this.f4779b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f4784g) {
            Map.Entry<n, C1579a> next = descendingIterator.next();
            C1579a value = next.getValue();
            while (value.f4787a.compareTo(this.f4780c) > 0 && !this.f4784g && this.f4779b.contains(next.getKey())) {
                AbstractC1565i.b a = AbstractC1565i.b.a(value.f4787a);
                if (a != null) {
                    m35493n(a.b());
                    value.m35490a(oVar, a);
                    m35494m();
                } else {
                    throw new IllegalStateException("no event down from " + value.f4787a);
                }
            }
        }
    }

    /* renamed from: e */
    private AbstractC1565i.c m35502e(n nVar) {
        Map.Entry<n, C1579a> m18541s = this.f4779b.m18541s(nVar);
        AbstractC1565i.c cVar = null;
        AbstractC1565i.c cVar2 = m18541s != null ? m18541s.getValue().f4787a : null;
        if (!this.f4785h.isEmpty()) {
            ArrayList<AbstractC1565i.c> arrayList = this.f4785h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return m35496k(m35496k(this.f4780c, cVar2), cVar);
    }

    /* renamed from: f */
    private void m35501f(String str) {
        if (!this.f4786i || C7498a.m18547f().mo18543c()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private void m35500g(o oVar) {
        C7504b<n, C1579a>.C7508d m18538f = this.f4779b.m18538f();
        while (m18538f.hasNext() && !this.f4784g) {
            Map.Entry next = m18538f.next();
            C1579a c1579a = (C1579a) next.getValue();
            while (c1579a.f4787a.compareTo(this.f4780c) < 0 && !this.f4784g && this.f4779b.contains(next.getKey())) {
                m35493n(c1579a.f4787a);
                AbstractC1565i.b e = AbstractC1565i.b.e(c1579a.f4787a);
                if (e != null) {
                    c1579a.m35490a(oVar, e);
                    m35494m();
                } else {
                    throw new IllegalStateException("no event up from " + c1579a.f4787a);
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m35498i() {
        if (this.f4779b.size() == 0) {
            return true;
        }
        AbstractC1565i.c cVar = this.f4779b.m18540d().getValue().f4787a;
        AbstractC1565i.c cVar2 = this.f4779b.m18537h().getValue().f4787a;
        return cVar == cVar2 && this.f4780c == cVar2;
    }

    /* renamed from: k */
    static AbstractC1565i.c m35496k(AbstractC1565i.c cVar, AbstractC1565i.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    /* renamed from: l */
    private void m35495l(AbstractC1565i.c cVar) {
        if (this.f4780c == cVar) {
            return;
        }
        this.f4780c = cVar;
        if (!this.f4783f && this.f4782e == 0) {
            this.f4783f = true;
            m35491p();
            this.f4783f = false;
            return;
        }
        this.f4784g = true;
    }

    /* renamed from: m */
    private void m35494m() {
        ArrayList<AbstractC1565i.c> arrayList = this.f4785h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    private void m35493n(AbstractC1565i.c cVar) {
        this.f4785h.add(cVar);
    }

    /* renamed from: p */
    private void m35491p() {
        o oVar = this.f4781d.get();
        if (oVar != null) {
            while (!m35498i()) {
                this.f4784g = false;
                if (this.f4780c.compareTo(this.f4779b.m18540d().getValue().f4787a) < 0) {
                    m35503d(oVar);
                }
                Map.Entry<n, C1579a> m18537h = this.f4779b.m18537h();
                if (!this.f4784g && m18537h != null && this.f4780c.compareTo(m18537h.getValue().f4787a) > 0) {
                    m35500g(oVar);
                }
            }
            this.f4784g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.AbstractC1565i
    /* renamed from: a */
    public void mo35506a(n nVar) {
        o oVar;
        m35501f("addObserver");
        AbstractC1565i.c cVar = this.f4780c;
        AbstractC1565i.c cVar2 = AbstractC1565i.c.c;
        if (cVar != cVar2) {
            cVar2 = AbstractC1565i.c.d;
        }
        C1579a c1579a = new C1579a(nVar, cVar2);
        if (this.f4779b.mo18535l(nVar, c1579a) == null && (oVar = this.f4781d.get()) != null) {
            boolean z = this.f4782e != 0 || this.f4783f;
            AbstractC1565i.c m35502e = m35502e(nVar);
            this.f4782e++;
            while (c1579a.f4787a.compareTo(m35502e) < 0 && this.f4779b.contains(nVar)) {
                m35493n(c1579a.f4787a);
                AbstractC1565i.b e = AbstractC1565i.b.e(c1579a.f4787a);
                if (e != null) {
                    c1579a.m35490a(oVar, e);
                    m35494m();
                    m35502e = m35502e(nVar);
                } else {
                    throw new IllegalStateException("no event up from " + c1579a.f4787a);
                }
            }
            if (!z) {
                m35491p();
            }
            this.f4782e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1565i
    /* renamed from: b */
    public AbstractC1565i.c mo35505b() {
        return this.f4780c;
    }

    @Override // androidx.lifecycle.AbstractC1565i
    /* renamed from: c */
    public void mo35504c(n nVar) {
        m35501f("removeObserver");
        this.f4779b.mo18534m(nVar);
    }

    /* renamed from: h */
    public void m35499h(AbstractC1565i.b bVar) {
        m35501f("handleLifecycleEvent");
        m35495l(bVar.b());
    }

    @Deprecated
    /* renamed from: j */
    public void m35497j(AbstractC1565i.c cVar) {
        m35501f("markState");
        m35492o(cVar);
    }

    /* renamed from: o */
    public void m35492o(AbstractC1565i.c cVar) {
        m35501f("setCurrentState");
        m35495l(cVar);
    }

    private C1578q(o oVar, boolean z) {
        this.f4779b = new C7503a<>();
        this.f4782e = 0;
        this.f4783f = false;
        this.f4784g = false;
        this.f4785h = new ArrayList<>();
        this.f4781d = new WeakReference<>(oVar);
        this.f4780c = AbstractC1565i.c.d;
        this.f4786i = z;
    }
}
