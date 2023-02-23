package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0;

import java.util.Collection;
import java.util.Map;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0.InterfaceC12157g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12174h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12268b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12953m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13727r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.b0.b */
/* loaded from: classes3.dex */
public class C12125b implements InterfaceC13340c, InterfaceC12157g {

    /* renamed from: f */
    static final /* synthetic */ InterfaceC11872i<Object>[] f27054f = {C11813x.m10312f(new C11808s(C11813x.m10316b(C12125b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a */
    private final C12609c f27055a;

    /* renamed from: b */
    private final InterfaceC13545u0 f27056b;

    /* renamed from: c */
    private final InterfaceC12948i f27057c;

    /* renamed from: d */
    private final InterfaceC12268b f27058d;

    /* renamed from: e */
    private final boolean f27059e;

    /* compiled from: JavaAnnotationMapper.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.b0.b$a */
    /* loaded from: classes3.dex */
    static final class C12126a extends AbstractC11802m implements InterfaceC11756a<AbstractC13010i0> {

        /* renamed from: c */
        final /* synthetic */ C12174h f27060c;

        /* renamed from: d */
        final /* synthetic */ C12125b f27061d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12126a(C12174h c12174h, C12125b c12125b) {
            super(0);
            this.f27060c = c12174h;
            this.f27061d = c12125b;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final AbstractC13010i0 invoke() {
            AbstractC13010i0 mo5010x = this.f27060c.m9535d().mo4979s().m9880o(this.f27061d.mo5309f()).mo5010x();
            l.e(mo5010x, "c.module.builtIns.getBuiltInClassByFqName(fqName).defaultType");
            return mo5010x;
        }
    }

    public C12125b(C12174h c12174h, InterfaceC12265a interfaceC12265a, C12609c c12609c) {
        Collection<InterfaceC12268b> mo4882N;
        l.f(c12174h, "c");
        l.f(c12609c, "fqName");
        this.f27055a = c12609c;
        InterfaceC13545u0 mo4903a = interfaceC12265a == null ? null : c12174h.m9538a().m9554t().mo4903a(interfaceC12265a);
        if (mo4903a == null) {
            mo4903a = InterfaceC13545u0.f29903a;
            l.e(mo4903a, "NO_SOURCE");
        }
        this.f27056b = mo4903a;
        this.f27057c = c12174h.m9534e().mo6367d(new C12126a(c12174h, this));
        this.f27058d = (interfaceC12265a == null || (mo4882N = interfaceC12265a.mo4882N()) == null) ? null : (InterfaceC12268b) C13722p.m3953S(mo4882N);
        this.f27059e = l.b(interfaceC12265a != null ? Boolean.valueOf(interfaceC12265a.mo4878n()) : null, Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: a */
    public Map<C12614f, AbstractC12712g<?>> mo5312a() {
        Map<C12614f, AbstractC12712g<?>> m3881k;
        m3881k = C13727r0.m3881k();
        return m3881k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final InterfaceC12268b m9659b() {
        return this.f27058d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: d */
    public AbstractC13010i0 mo5310c() {
        return (AbstractC13010i0) C12953m.m6372a(this.f27057c, this, f27054f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: f */
    public C12609c mo5309f() {
        return this.f27055a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: m */
    public InterfaceC13545u0 mo5308m() {
        return this.f27056b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0.InterfaceC12157g
    /* renamed from: n */
    public boolean mo9497n() {
        return this.f27059e;
    }
}
