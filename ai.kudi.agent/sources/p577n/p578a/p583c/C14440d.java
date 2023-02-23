package p577n.p578a.p583c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p577n.p578a.p579a.C14377h;
import p577n.p578a.p579a.C14388m;
import p577n.p578a.p579a.C14389n;
import p577n.p578a.p582b.AbstractC14412a;
import p577n.p578a.p582b.AbstractC14429r;
import p577n.p578a.p583c.p584f.InterfaceC14449e;
import p577n.p578a.p583c.p585g.InterfaceC14453a;
/* compiled from: Parser.java */
/* renamed from: n.a.c.d */
/* loaded from: classes3.dex */
public class C14440d {

    /* renamed from: a */
    private final List<InterfaceC14449e> f31816a;

    /* renamed from: b */
    private final List<InterfaceC14453a> f31817b;

    /* renamed from: c */
    private final InterfaceC14439c f31818c;

    /* renamed from: d */
    private final List<InterfaceC14444e> f31819d;

    /* compiled from: Parser.java */
    /* renamed from: n.a.c.d$b */
    /* loaded from: classes3.dex */
    public static class C14442b {

        /* renamed from: a */
        private final List<InterfaceC14449e> f31820a = new ArrayList();

        /* renamed from: b */
        private final List<InterfaceC14453a> f31821b = new ArrayList();

        /* renamed from: c */
        private final List<InterfaceC14444e> f31822c = new ArrayList();

        /* renamed from: d */
        private Set<Class<? extends AbstractC14412a>> f31823d = C14377h.m1912t();

        /* renamed from: e */
        private InterfaceC14439c f31824e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Parser.java */
        /* renamed from: n.a.c.d$b$a */
        /* loaded from: classes3.dex */
        public class C14443a implements InterfaceC14439c {
            C14443a(C14442b c14442b) {
            }

            @Override // p577n.p578a.p583c.InterfaceC14439c
            /* renamed from: a */
            public InterfaceC14437a mo1728a(InterfaceC14438b interfaceC14438b) {
                return new C14389n(interfaceC14438b);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public InterfaceC14439c m1729g() {
            InterfaceC14439c interfaceC14439c = this.f31824e;
            return interfaceC14439c != null ? interfaceC14439c : new C14443a(this);
        }

        /* renamed from: f */
        public C14440d m1730f() {
            return new C14440d(this);
        }
    }

    /* renamed from: a */
    private C14377h m1738a() {
        return new C14377h(this.f31816a, this.f31818c, this.f31817b);
    }

    /* renamed from: c */
    private AbstractC14429r m1736c(AbstractC14429r abstractC14429r) {
        for (InterfaceC14444e interfaceC14444e : this.f31819d) {
            abstractC14429r = interfaceC14444e.m1727a(abstractC14429r);
        }
        return abstractC14429r;
    }

    /* renamed from: b */
    public AbstractC14429r m1737b(String str) {
        if (str != null) {
            return m1736c(m1738a().m1910v(str));
        }
        throw new NullPointerException("input must not be null");
    }

    private C14440d(C14442b c14442b) {
        this.f31816a = C14377h.m1919m(c14442b.f31820a, c14442b.f31823d);
        this.f31818c = c14442b.m1729g();
        this.f31819d = c14442b.f31822c;
        List<InterfaceC14453a> list = c14442b.f31821b;
        this.f31817b = list;
        this.f31818c.mo1728a(new C14388m(list, Collections.emptyMap()));
    }
}
