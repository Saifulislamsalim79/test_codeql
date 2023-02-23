package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.j0.o.c.p0.l.u0 */
/* loaded from: classes3.dex */
public abstract class AbstractC13127u0 extends AbstractC13137y0 {

    /* renamed from: b */
    public static final C13128a f29209b = new C13128a(null);

    /* compiled from: TypeSubstitution.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.u0$a */
    /* loaded from: classes3.dex */
    public static final class C13128a {

        /* compiled from: TypeSubstitution.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.u0$a$a */
        /* loaded from: classes3.dex */
        public static final class C13129a extends AbstractC13127u0 {

            /* renamed from: c */
            final /* synthetic */ Map<InterfaceC13125t0, InterfaceC13131v0> f29210c;

            /* renamed from: d */
            final /* synthetic */ boolean f29211d;

            /* JADX WARN: Multi-variable type inference failed */
            C13129a(Map<InterfaceC13125t0, ? extends InterfaceC13131v0> map, boolean z) {
                this.f29210c = map;
                this.f29211d = z;
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
            /* renamed from: a */
            public boolean mo5751a() {
                return this.f29211d;
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
            /* renamed from: f */
            public boolean mo5744f() {
                return this.f29210c.isEmpty();
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13127u0
            /* renamed from: j */
            public InterfaceC13131v0 mo5781j(InterfaceC13125t0 interfaceC13125t0) {
                l.f(interfaceC13125t0, "key");
                return this.f29210c.get(interfaceC13125t0);
            }
        }

        private C13128a() {
        }

        public /* synthetic */ C13128a(g gVar) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ AbstractC13127u0 m5782e(C13128a c13128a, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return c13128a.m5783d(map, z);
        }

        /* renamed from: a */
        public final AbstractC13137y0 m5786a(AbstractC12965b0 abstractC12965b0) {
            l.f(abstractC12965b0, "kotlinType");
            return m5785b(abstractC12965b0.mo5779W0(), abstractC12965b0.mo5780V0());
        }

        /* renamed from: b */
        public final AbstractC13137y0 m5785b(InterfaceC13125t0 interfaceC13125t0, List<? extends InterfaceC13131v0> list) {
            int m3867o;
            List m3815I0;
            Map m3872t;
            l.f(interfaceC13125t0, "typeConstructor");
            l.f(list, "arguments");
            List<InterfaceC13562z0> mo5207c = interfaceC13125t0.mo5207c();
            l.e(mo5207c, "typeConstructor.parameters");
            InterfaceC13562z0 interfaceC13562z0 = (InterfaceC13562z0) C13722p.m3940e0(mo5207c);
            if (l.b(interfaceC13562z0 == null ? null : Boolean.valueOf(interfaceC13562z0.mo4646y0()), Boolean.TRUE)) {
                List<InterfaceC13562z0> mo5207c2 = interfaceC13125t0.mo5207c();
                l.e(mo5207c2, "typeConstructor.parameters");
                m3867o = C13728s.m3867o(mo5207c2, 10);
                ArrayList arrayList = new ArrayList(m3867o);
                for (InterfaceC13562z0 interfaceC13562z02 : mo5207c2) {
                    arrayList.add(interfaceC13562z02.mo4649n());
                }
                m3815I0 = C13742z.m3815I0(arrayList, list);
                m3872t = C13727r0.m3872t(m3815I0);
                return m5782e(this, m3872t, false, 2, null);
            }
            return new C13139z(mo5207c, list);
        }

        /* renamed from: c */
        public final AbstractC13127u0 m5784c(Map<InterfaceC13125t0, ? extends InterfaceC13131v0> map) {
            l.f(map, "map");
            return m5782e(this, map, false, 2, null);
        }

        /* renamed from: d */
        public final AbstractC13127u0 m5783d(Map<InterfaceC13125t0, ? extends InterfaceC13131v0> map, boolean z) {
            l.f(map, "map");
            return new C13129a(map, z);
        }
    }

    /* renamed from: h */
    public static final AbstractC13137y0 m5788h(InterfaceC13125t0 interfaceC13125t0, List<? extends InterfaceC13131v0> list) {
        return f29209b.m5785b(interfaceC13125t0, list);
    }

    /* renamed from: i */
    public static final AbstractC13127u0 m5787i(Map<InterfaceC13125t0, ? extends InterfaceC13131v0> map) {
        return f29209b.m5784c(map);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
    /* renamed from: e */
    public InterfaceC13131v0 mo5745e(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "key");
        return mo5781j(abstractC12965b0.mo5779W0());
    }

    /* renamed from: j */
    public abstract InterfaceC13131v0 mo5781j(InterfaceC13125t0 interfaceC13125t0);
}
