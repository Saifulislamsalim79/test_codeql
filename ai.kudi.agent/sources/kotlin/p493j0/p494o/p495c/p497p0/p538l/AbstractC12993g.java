package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.Collection;
import java.util.List;
import kotlin.C13218k;
import kotlin.C13666w;
import kotlin.EnumC13285m;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13028i;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13556x0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: AbstractTypeConstructor.kt */
/* renamed from: kotlin.j0.o.c.p0.l.g */
/* loaded from: classes3.dex */
public abstract class AbstractC12993g implements InterfaceC13125t0 {

    /* renamed from: a */
    private int f29066a;

    /* renamed from: b */
    private final InterfaceC12948i<C12996b> f29067b;

    /* renamed from: c */
    private final boolean f29068c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.g$a */
    /* loaded from: classes3.dex */
    public final class C12994a implements InterfaceC13125t0 {

        /* renamed from: a */
        private final AbstractC13026h f29069a;

        /* renamed from: b */
        private final InterfaceC11824h f29070b;

        /* renamed from: c */
        final /* synthetic */ AbstractC12993g f29071c;

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.g$a$a */
        /* loaded from: classes3.dex */
        static final class C12995a extends AbstractC11802m implements InterfaceC11756a<List<? extends AbstractC12965b0>> {

            /* renamed from: d */
            final /* synthetic */ AbstractC12993g f29073d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12995a(AbstractC12993g abstractC12993g) {
                super(0);
                this.f29073d = abstractC12993g;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<AbstractC12965b0> invoke() {
                return C13028i.m6096b(C12994a.this.f29069a, this.f29073d.mo5218a());
            }
        }

        public C12994a(AbstractC12993g abstractC12993g, AbstractC13026h abstractC13026h) {
            InterfaceC11824h m5626a;
            l.f(abstractC12993g, "this$0");
            l.f(abstractC13026h, "kotlinTypeRefiner");
            this.f29071c = abstractC12993g;
            this.f29069a = abstractC13026h;
            m5626a = C13218k.m5626a(EnumC13285m.PUBLICATION, new C12995a(this.f29071c));
            this.f29070b = m5626a;
        }

        /* renamed from: h */
        private final List<AbstractC12965b0> m6222h() {
            return (List) this.f29070b.getValue();
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: b */
        public InterfaceC13125t0 mo5217b(AbstractC13026h abstractC13026h) {
            l.f(abstractC13026h, "kotlinTypeRefiner");
            return this.f29071c.mo5217b(abstractC13026h);
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: c */
        public List<InterfaceC13562z0> mo5207c() {
            List<InterfaceC13562z0> mo5207c = this.f29071c.mo5207c();
            l.e(mo5207c, "this@AbstractTypeConstructor.parameters");
            return mo5207c;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: d */
        public InterfaceC13334h mo5206d() {
            return this.f29071c.mo5206d();
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: e */
        public boolean mo5205e() {
            return this.f29071c.mo5205e();
        }

        public boolean equals(Object obj) {
            return this.f29071c.equals(obj);
        }

        public int hashCode() {
            return this.f29071c.hashCode();
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: i */
        public List<AbstractC12965b0> mo5218a() {
            return m6222h();
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: s */
        public AbstractC12046h mo5199s() {
            AbstractC12046h mo5199s = this.f29071c.mo5199s();
            l.e(mo5199s, "this@AbstractTypeConstructor.builtIns");
            return mo5199s;
        }

        public String toString() {
            return this.f29071c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.g$b */
    /* loaded from: classes3.dex */
    public static final class C12996b {

        /* renamed from: a */
        private final Collection<AbstractC12965b0> f29074a;

        /* renamed from: b */
        private List<? extends AbstractC12965b0> f29075b;

        /* JADX WARN: Multi-variable type inference failed */
        public C12996b(Collection<? extends AbstractC12965b0> collection) {
            List<? extends AbstractC12965b0> m3901b;
            l.f(collection, "allSupertypes");
            this.f29074a = collection;
            m3901b = C13724q.m3901b(C13118t.f29199c);
            this.f29075b = m3901b;
        }

        /* renamed from: a */
        public final Collection<AbstractC12965b0> m6219a() {
            return this.f29074a;
        }

        /* renamed from: b */
        public final List<AbstractC12965b0> m6218b() {
            return this.f29075b;
        }

        /* renamed from: c */
        public final void m6217c(List<? extends AbstractC12965b0> list) {
            l.f(list, "<set-?>");
            this.f29075b = list;
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.g$c */
    /* loaded from: classes3.dex */
    static final class C12997c extends AbstractC11802m implements InterfaceC11756a<C12996b> {
        C12997c() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C12996b invoke() {
            return new C12996b(AbstractC12993g.this.mo5204j());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.g$d */
    /* loaded from: classes3.dex */
    static final class C12998d extends AbstractC11802m implements InterfaceC11767l<Boolean, C12996b> {

        /* renamed from: c */
        public static final C12998d f29077c = new C12998d();

        C12998d() {
            super(1);
        }

        /* renamed from: a */
        public final C12996b m6215a(boolean z) {
            List m3901b;
            m3901b = C13724q.m3901b(C13118t.f29199c);
            return new C12996b(m3901b);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C12996b invoke(Boolean bool) {
            return m6215a(bool.booleanValue());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.g$e */
    /* loaded from: classes3.dex */
    static final class C12999e extends AbstractC11802m implements InterfaceC11767l<C12996b, C13666w> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.g$e$a */
        /* loaded from: classes3.dex */
        public static final class C13000a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13125t0, Iterable<? extends AbstractC12965b0>> {

            /* renamed from: c */
            final /* synthetic */ AbstractC12993g f29079c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13000a(AbstractC12993g abstractC12993g) {
                super(1);
                this.f29079c = abstractC12993g;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public final Iterable<AbstractC12965b0> invoke(InterfaceC13125t0 interfaceC13125t0) {
                l.f(interfaceC13125t0, "it");
                return this.f29079c.m6229i(interfaceC13125t0, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.g$e$b */
        /* loaded from: classes3.dex */
        public static final class C13001b extends AbstractC11802m implements InterfaceC11767l<AbstractC12965b0, C13666w> {

            /* renamed from: c */
            final /* synthetic */ AbstractC12993g f29080c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13001b(AbstractC12993g abstractC12993g) {
                super(1);
                this.f29080c = abstractC12993g;
            }

            /* renamed from: a */
            public final void m6212a(AbstractC12965b0 abstractC12965b0) {
                l.f(abstractC12965b0, "it");
                this.f29080c.m6224t(abstractC12965b0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            public /* bridge */ /* synthetic */ C13666w invoke(AbstractC12965b0 abstractC12965b0) {
                m6212a(abstractC12965b0);
                return C13666w.f30112a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.g$e$c */
        /* loaded from: classes3.dex */
        public static final class C13002c extends AbstractC11802m implements InterfaceC11767l<InterfaceC13125t0, Iterable<? extends AbstractC12965b0>> {

            /* renamed from: c */
            final /* synthetic */ AbstractC12993g f29081c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13002c(AbstractC12993g abstractC12993g) {
                super(1);
                this.f29081c = abstractC12993g;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public final Iterable<AbstractC12965b0> invoke(InterfaceC13125t0 interfaceC13125t0) {
                l.f(interfaceC13125t0, "it");
                return this.f29081c.m6229i(interfaceC13125t0, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.g$e$d */
        /* loaded from: classes3.dex */
        public static final class C13003d extends AbstractC11802m implements InterfaceC11767l<AbstractC12965b0, C13666w> {

            /* renamed from: c */
            final /* synthetic */ AbstractC12993g f29082c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13003d(AbstractC12993g abstractC12993g) {
                super(1);
                this.f29082c = abstractC12993g;
            }

            /* renamed from: a */
            public final void m6210a(AbstractC12965b0 abstractC12965b0) {
                l.f(abstractC12965b0, "it");
                this.f29082c.mo5198u(abstractC12965b0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            public /* bridge */ /* synthetic */ C13666w invoke(AbstractC12965b0 abstractC12965b0) {
                m6210a(abstractC12965b0);
                return C13666w.f30112a;
            }
        }

        C12999e() {
            super(1);
        }

        /* renamed from: a */
        public final void m6214a(C12996b c12996b) {
            l.f(c12996b, "supertypes");
            Collection<AbstractC12965b0> mo4663a = AbstractC12993g.this.mo5202n().mo4663a(AbstractC12993g.this, c12996b.m6219a(), new C13002c(AbstractC12993g.this), new C13003d(AbstractC12993g.this));
            if (mo4663a.isEmpty()) {
                AbstractC12965b0 mo5203k = AbstractC12993g.this.mo5203k();
                mo4663a = mo5203k == null ? null : C13724q.m3901b(mo5203k);
                if (mo4663a == null) {
                    mo4663a = C13726r.m3891e();
                }
            }
            if (AbstractC12993g.this.m6227m()) {
                InterfaceC13556x0 mo5202n = AbstractC12993g.this.mo5202n();
                AbstractC12993g abstractC12993g = AbstractC12993g.this;
                mo5202n.mo4663a(abstractC12993g, mo4663a, new C13000a(abstractC12993g), new C13001b(AbstractC12993g.this));
            }
            AbstractC12993g abstractC12993g2 = AbstractC12993g.this;
            List<AbstractC12965b0> list = mo4663a instanceof List ? (List) mo4663a : null;
            if (list == null) {
                list = C13742z.m3825B0(mo4663a);
            }
            c12996b.m6217c(abstractC12993g2.mo5200r(list));
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(C12996b c12996b) {
            m6214a(c12996b);
            return C13666w.f30112a;
        }
    }

    public AbstractC12993g(InterfaceC12954n interfaceC12954n) {
        l.f(interfaceC12954n, "storageManager");
        this.f29067b = interfaceC12954n.mo6364g(new C12997c(), C12998d.f29077c, new C12999e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final Collection<AbstractC12965b0> m6229i(InterfaceC13125t0 interfaceC13125t0, boolean z) {
        AbstractC12993g abstractC12993g = interfaceC13125t0 instanceof AbstractC12993g ? (AbstractC12993g) interfaceC13125t0 : null;
        List m3784n0 = abstractC12993g != null ? C13742z.m3784n0(abstractC12993g.f29067b.invoke().m6219a(), abstractC12993g.mo6228l(z)) : null;
        if (m3784n0 == null) {
            Collection<AbstractC12965b0> mo5218a = interfaceC13125t0.mo5218a();
            l.e(mo5218a, "supertypes");
            return mo5218a;
        }
        return m3784n0;
    }

    /* renamed from: p */
    private final boolean m6225p(InterfaceC13334h interfaceC13334h) {
        return (C13118t.m5803r(interfaceC13334h) || C12673d.m7043E(interfaceC13334h)) ? false : true;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: b */
    public InterfaceC13125t0 mo5217b(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        return new C12994a(this, abstractC13026h);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: d */
    public abstract InterfaceC13334h mo5206d();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC13125t0) && obj.hashCode() == hashCode()) {
            InterfaceC13125t0 interfaceC13125t0 = (InterfaceC13125t0) obj;
            if (interfaceC13125t0.mo5207c().size() != mo5207c().size()) {
                return false;
            }
            InterfaceC13334h mo5206d = mo5206d();
            InterfaceC13334h mo5206d2 = interfaceC13125t0.mo5206d();
            if (mo5206d2 != null && m6225p(mo5206d) && m6225p(mo5206d2)) {
                return mo5201q(mo5206d2);
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean m6230h(InterfaceC13334h interfaceC13334h, InterfaceC13334h interfaceC13334h2) {
        l.f(interfaceC13334h, "first");
        l.f(interfaceC13334h2, "second");
        if (l.b(interfaceC13334h.mo5012b(), interfaceC13334h2.mo5012b())) {
            InterfaceC13513m mo4687d = interfaceC13334h.mo4687d();
            for (InterfaceC13513m mo4687d2 = interfaceC13334h2.mo4687d(); mo4687d != null && mo4687d2 != null; mo4687d2 = mo4687d2.mo4687d()) {
                if (mo4687d instanceof InterfaceC13305c0) {
                    return mo4687d2 instanceof InterfaceC13305c0;
                }
                if (mo4687d2 instanceof InterfaceC13305c0) {
                    return false;
                }
                if (mo4687d instanceof InterfaceC13320f0) {
                    return (mo4687d2 instanceof InterfaceC13320f0) && l.b(((InterfaceC13320f0) mo4687d).mo4954f(), ((InterfaceC13320f0) mo4687d2).mo4954f());
                } else if ((mo4687d2 instanceof InterfaceC13320f0) || !l.b(mo4687d.mo5012b(), mo4687d2.mo5012b())) {
                    return false;
                } else {
                    mo4687d = mo4687d.mo4687d();
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int identityHashCode;
        int i = this.f29066a;
        if (i != 0) {
            return i;
        }
        InterfaceC13334h mo5206d = mo5206d();
        if (m6225p(mo5206d)) {
            identityHashCode = C12673d.m7022m(mo5206d).hashCode();
        } else {
            identityHashCode = System.identityHashCode(this);
        }
        this.f29066a = identityHashCode;
        return identityHashCode;
    }

    /* renamed from: j */
    protected abstract Collection<AbstractC12965b0> mo5204j();

    /* renamed from: k */
    protected AbstractC12965b0 mo5203k() {
        return null;
    }

    /* renamed from: l */
    protected Collection<AbstractC12965b0> mo6228l(boolean z) {
        List m3891e;
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    /* renamed from: m */
    protected boolean m6227m() {
        return this.f29068c;
    }

    /* renamed from: n */
    protected abstract InterfaceC13556x0 mo5202n();

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: o */
    public List<AbstractC12965b0> mo5218a() {
        return this.f29067b.invoke().m6218b();
    }

    /* renamed from: q */
    protected abstract boolean mo5201q(InterfaceC13334h interfaceC13334h);

    /* renamed from: r */
    protected List<AbstractC12965b0> mo5200r(List<AbstractC12965b0> list) {
        l.f(list, "supertypes");
        return list;
    }

    /* renamed from: t */
    protected void m6224t(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "type");
    }

    /* renamed from: u */
    protected void mo5198u(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "type");
    }
}
