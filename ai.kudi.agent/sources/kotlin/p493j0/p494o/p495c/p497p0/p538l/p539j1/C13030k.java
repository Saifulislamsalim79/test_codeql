package kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13218k;
import kotlin.C13668y;
import kotlin.EnumC13285m;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p524q.p525a.InterfaceC12700b;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: NewCapturedType.kt */
/* renamed from: kotlin.j0.o.c.p0.l.j1.k */
/* loaded from: classes3.dex */
public final class C13030k implements InterfaceC12700b {

    /* renamed from: a */
    private final InterfaceC13131v0 f29117a;

    /* renamed from: b */
    private InterfaceC11756a<? extends List<? extends AbstractC13005g1>> f29118b;

    /* renamed from: c */
    private final C13030k f29119c;

    /* renamed from: d */
    private final InterfaceC13562z0 f29120d;

    /* renamed from: e */
    private final InterfaceC11824h f29121e;

    /* compiled from: NewCapturedType.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.j1.k$a */
    /* loaded from: classes3.dex */
    static final class C13031a extends AbstractC11802m implements InterfaceC11756a<List<? extends AbstractC13005g1>> {

        /* renamed from: c */
        final /* synthetic */ List<AbstractC13005g1> f29122c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13031a(List<? extends AbstractC13005g1> list) {
            super(0);
            this.f29122c = list;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<AbstractC13005g1> invoke() {
            return this.f29122c;
        }
    }

    /* compiled from: NewCapturedType.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.j1.k$b */
    /* loaded from: classes3.dex */
    static final class C13032b extends AbstractC11802m implements InterfaceC11756a<List<? extends AbstractC13005g1>> {
        C13032b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<AbstractC13005g1> invoke() {
            InterfaceC11756a interfaceC11756a = C13030k.this.f29118b;
            if (interfaceC11756a == null) {
                return null;
            }
            return (List) interfaceC11756a.invoke();
        }
    }

    /* compiled from: NewCapturedType.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.j1.k$c */
    /* loaded from: classes3.dex */
    static final class C13033c extends AbstractC11802m implements InterfaceC11756a<List<? extends AbstractC13005g1>> {

        /* renamed from: c */
        final /* synthetic */ List<AbstractC13005g1> f29124c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13033c(List<? extends AbstractC13005g1> list) {
            super(0);
            this.f29124c = list;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<AbstractC13005g1> invoke() {
            return this.f29124c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewCapturedType.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.j1.k$d */
    /* loaded from: classes3.dex */
    public static final class C13034d extends AbstractC11802m implements InterfaceC11756a<List<? extends AbstractC13005g1>> {

        /* renamed from: d */
        final /* synthetic */ AbstractC13026h f29126d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13034d(AbstractC13026h abstractC13026h) {
            super(0);
            this.f29126d = abstractC13026h;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<AbstractC13005g1> invoke() {
            int m3867o;
            List<AbstractC13005g1> mo5218a = C13030k.this.mo5218a();
            AbstractC13026h abstractC13026h = this.f29126d;
            m3867o = C13728s.m3867o(mo5218a, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (AbstractC13005g1 abstractC13005g1 : mo5218a) {
                arrayList.add(abstractC13005g1.mo5766b1(abstractC13026h));
            }
            return arrayList;
        }
    }

    public C13030k(InterfaceC13131v0 interfaceC13131v0, InterfaceC11756a<? extends List<? extends AbstractC13005g1>> interfaceC11756a, C13030k c13030k, InterfaceC13562z0 interfaceC13562z0) {
        InterfaceC11824h m5626a;
        l.f(interfaceC13131v0, "projection");
        this.f29117a = interfaceC13131v0;
        this.f29118b = interfaceC11756a;
        this.f29119c = c13030k;
        this.f29120d = interfaceC13562z0;
        m5626a = C13218k.m5626a(EnumC13285m.PUBLICATION, new C13032b());
        this.f29121e = m5626a;
    }

    /* renamed from: i */
    private final List<AbstractC13005g1> m6085i() {
        return (List) this.f29121e.getValue();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: c */
    public List<InterfaceC13562z0> mo5207c() {
        List<InterfaceC13562z0> m3891e;
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: d */
    public InterfaceC13334h mo5206d() {
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: e */
    public boolean mo5205e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (l.b(C13030k.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                C13030k c13030k = (C13030k) obj;
                C13030k c13030k2 = this.f29119c;
                if (c13030k2 == null) {
                    c13030k2 = this;
                }
                C13030k c13030k3 = c13030k.f29119c;
                if (c13030k3 != null) {
                    c13030k = c13030k3;
                }
                return c13030k2 == c13030k;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        }
        return false;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p524q.p525a.InterfaceC12700b
    /* renamed from: f */
    public InterfaceC13131v0 mo6088f() {
        return this.f29117a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: h */
    public List<AbstractC13005g1> mo5218a() {
        List<AbstractC13005g1> m3891e;
        List<AbstractC13005g1> m6085i = m6085i();
        if (m6085i == null) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        return m6085i;
    }

    public int hashCode() {
        C13030k c13030k = this.f29119c;
        return c13030k == null ? super.hashCode() : c13030k.hashCode();
    }

    /* renamed from: j */
    public final void m6084j(List<? extends AbstractC13005g1> list) {
        l.f(list, "supertypes");
        boolean z = this.f29118b == null;
        if (C13668y.f30115a && !z) {
            throw new AssertionError("Already initialized! oldValue = " + this.f29118b + ", newValue = " + list);
        }
        this.f29118b = new C13033c(list);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: k */
    public C13030k mo5217b(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        InterfaceC13131v0 mo5759b = mo6088f().mo5759b(abstractC13026h);
        l.e(mo5759b, "projection.refine(kotlinTypeRefiner)");
        C13034d c13034d = this.f29118b == null ? null : new C13034d(abstractC13026h);
        C13030k c13030k = this.f29119c;
        if (c13030k == null) {
            c13030k = this;
        }
        return new C13030k(mo5759b, c13034d, c13030k, this.f29120d);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: s */
    public AbstractC12046h mo5199s() {
        AbstractC12965b0 mo5758c = mo6088f().mo5758c();
        l.e(mo5758c, "projection.type");
        return C13090a.m5899h(mo5758c);
    }

    public String toString() {
        return "CapturedType(" + mo6088f() + ')';
    }

    public /* synthetic */ C13030k(InterfaceC13131v0 interfaceC13131v0, InterfaceC11756a interfaceC11756a, C13030k c13030k, InterfaceC13562z0 interfaceC13562z0, int i, g gVar) {
        this(interfaceC13131v0, (i & 2) != 0 ? null : interfaceC11756a, (i & 4) != 0 ? null : c13030k, (i & 8) != 0 ? null : interfaceC13562z0);
    }

    public /* synthetic */ C13030k(InterfaceC13131v0 interfaceC13131v0, List list, C13030k c13030k, int i, g gVar) {
        this(interfaceC13131v0, list, (i & 4) != 0 ? null : c13030k);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13030k(InterfaceC13131v0 interfaceC13131v0, List<? extends AbstractC13005g1> list, C13030k c13030k) {
        this(interfaceC13131v0, new C13031a(list), c13030k, null, 8, null);
        l.f(interfaceC13131v0, "projection");
        l.f(list, "supertypes");
    }
}
