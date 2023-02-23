package kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q;

import java.util.List;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12771e;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13400g0;
/* compiled from: CloneableClassScope.kt */
/* renamed from: kotlin.j0.o.c.p0.b.q.a */
/* loaded from: classes3.dex */
public final class C12076a extends AbstractC12771e {

    /* renamed from: e */
    public static final C12077a f26921e = new C12077a(null);

    /* renamed from: f */
    private static final C12614f f26922f;

    /* compiled from: CloneableClassScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.q.a$a */
    /* loaded from: classes3.dex */
    public static final class C12077a {
        private C12077a() {
        }

        public /* synthetic */ C12077a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final C12614f m9784a() {
            return C12076a.f26922f;
        }
    }

    static {
        C12614f m7349i = C12614f.m7349i("clone");
        l.e(m7349i, "identifier(\"clone\")");
        f26922f = m7349i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12076a(InterfaceC12954n interfaceC12954n, InterfaceC13312e interfaceC13312e) {
        super(interfaceC12954n, interfaceC13312e);
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC13312e, "containingClass");
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12771e
    /* renamed from: i */
    protected List<InterfaceC13554x> mo6784i() {
        List<? extends InterfaceC13562z0> m3891e;
        List<InterfaceC13307c1> m3891e2;
        List<InterfaceC13554x> m3901b;
        C13400g0 m5179w1 = C13400g0.m5179w1(m6781l(), InterfaceC13346g.f29516s.m5317b(), f26922f, InterfaceC13300b.EnumC13301a.DECLARATION, InterfaceC13545u0.f29903a);
        InterfaceC13524r0 mo5015T0 = m6781l().mo5015T0();
        m3891e = C13726r.m3891e();
        m3891e2 = C13726r.m3891e();
        m5179w1.mo5080c1(null, mo5015T0, m3891e, m3891e2, C12747a.m6863g(m6781l()).m9892i(), EnumC13560z.OPEN, C13530t.f29890c);
        m3901b = C13724q.m3901b(m5179w1);
        return m3901b;
    }
}
