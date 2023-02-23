package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p201g.p218e.C7526d;
import p201g.p218e.C7534g;
import p201g.p227h.p237k.C7673f;
import p201g.p227h.p237k.InterfaceC7672e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewInfoStore.java */
/* renamed from: androidx.recyclerview.widget.c0 */
/* loaded from: classes2.dex */
public class C1678c0 {

    /* renamed from: a */
    final C7534g<RecyclerView.AbstractC1620e0, C1679a> f5152a = new C7534g<>();

    /* renamed from: b */
    final C7526d<RecyclerView.AbstractC1620e0> f5153b = new C7526d<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* renamed from: androidx.recyclerview.widget.c0$a */
    /* loaded from: classes2.dex */
    public static class C1679a {

        /* renamed from: d */
        static InterfaceC7672e<C1679a> f5154d = new C7673f(20);

        /* renamed from: a */
        int f5155a;

        /* renamed from: b */
        RecyclerView.AbstractC1629m.C1632c f5156b;

        /* renamed from: c */
        RecyclerView.AbstractC1629m.C1632c f5157c;

        private C1679a() {
        }

        /* renamed from: a */
        static void m34829a() {
            do {
            } while (f5154d.mo11982b() != null);
        }

        /* renamed from: b */
        static C1679a m34828b() {
            C1679a mo11982b = f5154d.mo11982b();
            return mo11982b == null ? new C1679a() : mo11982b;
        }

        /* renamed from: c */
        static void m34827c(C1679a c1679a) {
            c1679a.f5155a = 0;
            c1679a.f5156b = null;
            c1679a.f5157c = null;
            f5154d.mo11983a(c1679a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* renamed from: androidx.recyclerview.widget.c0$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1680b {
        /* renamed from: a */
        void mo34826a(RecyclerView.AbstractC1620e0 abstractC1620e0);

        /* renamed from: b */
        void mo34825b(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1629m.C1632c c1632c, RecyclerView.AbstractC1629m.C1632c c1632c2);

        /* renamed from: c */
        void mo34824c(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1629m.C1632c c1632c, RecyclerView.AbstractC1629m.C1632c c1632c2);

        /* renamed from: d */
        void mo34823d(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1629m.C1632c c1632c, RecyclerView.AbstractC1629m.C1632c c1632c2);
    }

    /* renamed from: l */
    private RecyclerView.AbstractC1629m.C1632c m34835l(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        C1679a m18448o;
        RecyclerView.AbstractC1629m.C1632c c1632c;
        int m18455h = this.f5152a.m18455h(abstractC1620e0);
        if (m18455h >= 0 && (m18448o = this.f5152a.m18448o(m18455h)) != null) {
            int i2 = m18448o.f5155a;
            if ((i2 & i) != 0) {
                m18448o.f5155a = (i ^ (-1)) & i2;
                if (i == 4) {
                    c1632c = m18448o.f5156b;
                } else if (i == 8) {
                    c1632c = m18448o.f5157c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((m18448o.f5155a & 12) == 0) {
                    this.f5152a.mo18450m(m18455h);
                    C1679a.m34827c(m18448o);
                }
                return c1632c;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m34846a(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1629m.C1632c c1632c) {
        C1679a c1679a = this.f5152a.get(abstractC1620e0);
        if (c1679a == null) {
            c1679a = C1679a.m34828b();
            this.f5152a.put(abstractC1620e0, c1679a);
        }
        c1679a.f5155a |= 2;
        c1679a.f5156b = c1632c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m34845b(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        C1679a c1679a = this.f5152a.get(abstractC1620e0);
        if (c1679a == null) {
            c1679a = C1679a.m34828b();
            this.f5152a.put(abstractC1620e0, c1679a);
        }
        c1679a.f5155a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m34844c(long j, RecyclerView.AbstractC1620e0 abstractC1620e0) {
        this.f5153b.m18494k(j, abstractC1620e0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m34843d(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1629m.C1632c c1632c) {
        C1679a c1679a = this.f5152a.get(abstractC1620e0);
        if (c1679a == null) {
            c1679a = C1679a.m34828b();
            this.f5152a.put(abstractC1620e0, c1679a);
        }
        c1679a.f5157c = c1632c;
        c1679a.f5155a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m34842e(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1629m.C1632c c1632c) {
        C1679a c1679a = this.f5152a.get(abstractC1620e0);
        if (c1679a == null) {
            c1679a = C1679a.m34828b();
            this.f5152a.put(abstractC1620e0, c1679a);
        }
        c1679a.f5156b = c1632c;
        c1679a.f5155a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m34841f() {
        this.f5152a.clear();
        this.f5153b.m18503b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.AbstractC1620e0 m34840g(long j) {
        return this.f5153b.m18499f(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m34839h(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        C1679a c1679a = this.f5152a.get(abstractC1620e0);
        return (c1679a == null || (c1679a.f5155a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m34838i(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        C1679a c1679a = this.f5152a.get(abstractC1620e0);
        return (c1679a == null || (c1679a.f5155a & 4) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m34837j() {
        C1679a.m34829a();
    }

    /* renamed from: k */
    public void m34836k(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        m34831p(abstractC1620e0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.AbstractC1629m.C1632c m34834m(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        return m34835l(abstractC1620e0, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.AbstractC1629m.C1632c m34833n(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        return m34835l(abstractC1620e0, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m34832o(InterfaceC1680b interfaceC1680b) {
        for (int size = this.f5152a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC1620e0 m18452k = this.f5152a.m18452k(size);
            C1679a mo18450m = this.f5152a.mo18450m(size);
            int i = mo18450m.f5155a;
            if ((i & 3) == 3) {
                interfaceC1680b.mo34826a(m18452k);
            } else if ((i & 1) != 0) {
                RecyclerView.AbstractC1629m.C1632c c1632c = mo18450m.f5156b;
                if (c1632c == null) {
                    interfaceC1680b.mo34826a(m18452k);
                } else {
                    interfaceC1680b.mo34824c(m18452k, c1632c, mo18450m.f5157c);
                }
            } else if ((i & 14) == 14) {
                interfaceC1680b.mo34825b(m18452k, mo18450m.f5156b, mo18450m.f5157c);
            } else if ((i & 12) == 12) {
                interfaceC1680b.mo34823d(m18452k, mo18450m.f5156b, mo18450m.f5157c);
            } else if ((i & 4) != 0) {
                interfaceC1680b.mo34824c(m18452k, mo18450m.f5156b, null);
            } else if ((i & 8) != 0) {
                interfaceC1680b.mo34825b(m18452k, mo18450m.f5156b, mo18450m.f5157c);
            }
            C1679a.m34827c(mo18450m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m34831p(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        C1679a c1679a = this.f5152a.get(abstractC1620e0);
        if (c1679a == null) {
            return;
        }
        c1679a.f5155a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m34830q(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        int m18491o = this.f5153b.m18491o() - 1;
        while (true) {
            if (m18491o < 0) {
                break;
            } else if (abstractC1620e0 == this.f5153b.m18490p(m18491o)) {
                this.f5153b.m18492n(m18491o);
                break;
            } else {
                m18491o--;
            }
        }
        C1679a remove = this.f5152a.remove(abstractC1620e0);
        if (remove != null) {
            C1679a.m34827c(remove);
        }
    }
}
