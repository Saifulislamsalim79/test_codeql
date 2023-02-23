package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: TypeAliasExpansion.kt */
/* renamed from: kotlin.j0.o.c.p0.l.q0 */
/* loaded from: classes3.dex */
public final class C13111q0 {

    /* renamed from: e */
    public static final C13112a f29186e = new C13112a(null);

    /* renamed from: a */
    private final C13111q0 f29187a;

    /* renamed from: b */
    private final InterfaceC13559y0 f29188b;

    /* renamed from: c */
    private final List<InterfaceC13131v0> f29189c;

    /* renamed from: d */
    private final Map<InterfaceC13562z0, InterfaceC13131v0> f29190d;

    /* compiled from: TypeAliasExpansion.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.q0$a */
    /* loaded from: classes3.dex */
    public static final class C13112a {
        private C13112a() {
        }

        public /* synthetic */ C13112a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final C13111q0 m5832a(C13111q0 c13111q0, InterfaceC13559y0 interfaceC13559y0, List<? extends InterfaceC13131v0> list) {
            int m3867o;
            List m3815I0;
            Map m3872t;
            l.f(interfaceC13559y0, "typeAliasDescriptor");
            l.f(list, "arguments");
            List<InterfaceC13562z0> mo5207c = interfaceC13559y0.mo4649n().mo5207c();
            l.e(mo5207c, "typeAliasDescriptor.typeConstructor.parameters");
            m3867o = C13728s.m3867o(mo5207c, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (InterfaceC13562z0 interfaceC13562z0 : mo5207c) {
                arrayList.add(interfaceC13562z0.mo4651a());
            }
            m3815I0 = C13742z.m3815I0(arrayList, list);
            m3872t = C13727r0.m3872t(m3815I0);
            return new C13111q0(c13111q0, interfaceC13559y0, list, m3872t, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C13111q0(C13111q0 c13111q0, InterfaceC13559y0 interfaceC13559y0, List<? extends InterfaceC13131v0> list, Map<InterfaceC13562z0, ? extends InterfaceC13131v0> map) {
        this.f29187a = c13111q0;
        this.f29188b = interfaceC13559y0;
        this.f29189c = list;
        this.f29190d = map;
    }

    public /* synthetic */ C13111q0(C13111q0 c13111q0, InterfaceC13559y0 interfaceC13559y0, List list, Map map, g gVar) {
        this(c13111q0, interfaceC13559y0, list, map);
    }

    /* renamed from: a */
    public final List<InterfaceC13131v0> m5836a() {
        return this.f29189c;
    }

    /* renamed from: b */
    public final InterfaceC13559y0 m5835b() {
        return this.f29188b;
    }

    /* renamed from: c */
    public final InterfaceC13131v0 m5834c(InterfaceC13125t0 interfaceC13125t0) {
        l.f(interfaceC13125t0, "constructor");
        InterfaceC13334h mo5206d = interfaceC13125t0.mo5206d();
        if (mo5206d instanceof InterfaceC13562z0) {
            return this.f29190d.get(mo5206d);
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m5833d(InterfaceC13559y0 interfaceC13559y0) {
        l.f(interfaceC13559y0, "descriptor");
        if (!l.b(this.f29188b, interfaceC13559y0)) {
            C13111q0 c13111q0 = this.f29187a;
            if (!(c13111q0 == null ? false : c13111q0.m5833d(interfaceC13559y0))) {
                return false;
            }
        }
        return true;
    }
}
