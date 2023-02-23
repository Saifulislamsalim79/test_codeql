package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12513d;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12524g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12531i;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12565s;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12572u;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12596e;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.C12801a;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.AbstractC12916x;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.C13313e0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
/* compiled from: AnnotationAndConstantLoaderImpl.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.d */
/* loaded from: classes3.dex */
public final class C12820d implements InterfaceC12813c<InterfaceC13340c, AbstractC12712g<?>> {

    /* renamed from: a */
    private final C12801a f28731a;

    /* renamed from: b */
    private final C12878e f28732b;

    /* compiled from: AnnotationAndConstantLoaderImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.d$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12821a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28733a;

        static {
            int[] iArr = new int[EnumC12805b.values().length];
            iArr[EnumC12805b.PROPERTY.ordinal()] = 1;
            iArr[EnumC12805b.PROPERTY_GETTER.ordinal()] = 2;
            iArr[EnumC12805b.PROPERTY_SETTER.ordinal()] = 3;
            f28733a = iArr;
        }
    }

    public C12820d(InterfaceC13305c0 interfaceC13305c0, C13313e0 c13313e0, C12801a c12801a) {
        l.f(interfaceC13305c0, "module");
        l.f(c13313e0, "notFoundClasses");
        l.f(c12801a, "protocol");
        this.f28731a = c12801a;
        this.f28732b = new C12878e(interfaceC13305c0, c13313e0);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: a */
    public List<InterfaceC13340c> mo6696a(C12565s c12565s, InterfaceC12593c interfaceC12593c) {
        int m3867o;
        l.f(c12565s, "proto");
        l.f(interfaceC12593c, "nameResolver");
        List<C12499b> list = (List) c12565s.m4428u(this.f28731a.m6738l());
        if (list == null) {
            list = C13726r.m3891e();
        }
        m3867o = C13728s.m3867o(list, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (C12499b c12499b : list) {
            arrayList.add(this.f28732b.m6533a(c12499b, interfaceC12593c));
        }
        return arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: b */
    public List<InterfaceC13340c> mo6695b(AbstractC12916x abstractC12916x, InterfaceC13601o interfaceC13601o, EnumC12805b enumC12805b, int i, C12572u c12572u) {
        int m3867o;
        l.f(abstractC12916x, "container");
        l.f(interfaceC13601o, "callableProto");
        l.f(enumC12805b, "kind");
        l.f(c12572u, "proto");
        List<C12499b> list = (List) c12572u.m4428u(this.f28731a.m6743g());
        if (list == null) {
            list = C13726r.m3891e();
        }
        m3867o = C13728s.m3867o(list, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (C12499b c12499b : list) {
            arrayList.add(this.f28732b.m6533a(c12499b, abstractC12916x.m6427b()));
        }
        return arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: c */
    public List<InterfaceC13340c> mo6694c(AbstractC12916x.C12917a c12917a) {
        int m3867o;
        l.f(c12917a, "container");
        List<C12499b> list = (List) c12917a.m6423f().m4428u(this.f28731a.m6749a());
        if (list == null) {
            list = C13726r.m3891e();
        }
        m3867o = C13728s.m3867o(list, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (C12499b c12499b : list) {
            arrayList.add(this.f28732b.m6533a(c12499b, c12917a.m6427b()));
        }
        return arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: d */
    public List<InterfaceC13340c> mo6693d(C12555q c12555q, InterfaceC12593c interfaceC12593c) {
        int m3867o;
        l.f(c12555q, "proto");
        l.f(interfaceC12593c, "nameResolver");
        List<C12499b> list = (List) c12555q.m4428u(this.f28731a.m6739k());
        if (list == null) {
            list = C13726r.m3891e();
        }
        m3867o = C13728s.m3867o(list, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (C12499b c12499b : list) {
            arrayList.add(this.f28732b.m6533a(c12499b, interfaceC12593c));
        }
        return arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: f */
    public List<InterfaceC13340c> mo6691f(AbstractC12916x abstractC12916x, C12524g c12524g) {
        int m3867o;
        l.f(abstractC12916x, "container");
        l.f(c12524g, "proto");
        List<C12499b> list = (List) c12524g.m4428u(this.f28731a.m6746d());
        if (list == null) {
            list = C13726r.m3891e();
        }
        m3867o = C13728s.m3867o(list, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (C12499b c12499b : list) {
            arrayList.add(this.f28732b.m6533a(c12499b, abstractC12916x.m6427b()));
        }
        return arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: g */
    public List<InterfaceC13340c> mo6690g(AbstractC12916x abstractC12916x, C12542n c12542n) {
        List<InterfaceC13340c> m3891e;
        l.f(abstractC12916x, "container");
        l.f(c12542n, "proto");
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: h */
    public List<InterfaceC13340c> mo6689h(AbstractC12916x abstractC12916x, InterfaceC13601o interfaceC13601o, EnumC12805b enumC12805b) {
        List<InterfaceC13340c> m3891e;
        l.f(abstractC12916x, "container");
        l.f(interfaceC13601o, "proto");
        l.f(enumC12805b, "kind");
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: i */
    public List<InterfaceC13340c> mo6688i(AbstractC12916x abstractC12916x, C12542n c12542n) {
        List<InterfaceC13340c> m3891e;
        l.f(abstractC12916x, "container");
        l.f(c12542n, "proto");
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: j */
    public List<InterfaceC13340c> mo6687j(AbstractC12916x abstractC12916x, InterfaceC13601o interfaceC13601o, EnumC12805b enumC12805b) {
        List<C12499b> list;
        int m3867o;
        l.f(abstractC12916x, "container");
        l.f(interfaceC13601o, "proto");
        l.f(enumC12805b, "kind");
        if (interfaceC13601o instanceof C12513d) {
            list = (List) ((C12513d) interfaceC13601o).m4428u(this.f28731a.m6747c());
        } else if (interfaceC13601o instanceof C12531i) {
            list = (List) ((C12531i) interfaceC13601o).m4428u(this.f28731a.m6744f());
        } else if (!(interfaceC13601o instanceof C12542n)) {
            throw new IllegalStateException(l.m("Unknown message: ", interfaceC13601o).toString());
        } else {
            int i = C12821a.f28733a[enumC12805b.ordinal()];
            if (i == 1) {
                list = (List) ((C12542n) interfaceC13601o).m4428u(this.f28731a.m6742h());
            } else if (i == 2) {
                list = (List) ((C12542n) interfaceC13601o).m4428u(this.f28731a.m6741i());
            } else if (i == 3) {
                list = (List) ((C12542n) interfaceC13601o).m4428u(this.f28731a.m6740j());
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        }
        if (list == null) {
            list = C13726r.m3891e();
        }
        m3867o = C13728s.m3867o(list, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (C12499b c12499b : list) {
            arrayList.add(this.f28732b.m6533a(c12499b, abstractC12916x.m6427b()));
        }
        return arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: k */
    public AbstractC12712g<?> mo6692e(AbstractC12916x abstractC12916x, C12542n c12542n, AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12916x, "container");
        l.f(c12542n, "proto");
        l.f(abstractC12965b0, "expectedType");
        C12499b.C12501b.C12504c c12504c = (C12499b.C12501b.C12504c) C12596e.m7430a(c12542n, this.f28731a.m6748b());
        if (c12504c == null) {
            return null;
        }
        return this.f28732b.m6528f(abstractC12965b0, c12504c, abstractC12916x.m6427b());
    }
}
