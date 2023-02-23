package kotlin.p493j0.p494o.p495c.p497p0.p523i.p524q.p525a;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13287o;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12981e0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13063l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13135x0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13139z;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: CapturedTypeConstructor.kt */
/* renamed from: kotlin.j0.o.c.p0.i.q.a.d */
/* loaded from: classes3.dex */
public final class C12702d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CapturedTypeConstructor.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.q.a.d$a */
    /* loaded from: classes3.dex */
    public static final class C12703a extends AbstractC11802m implements InterfaceC11756a<AbstractC12965b0> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13131v0 f28567c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12703a(InterfaceC13131v0 interfaceC13131v0) {
            super(0);
            this.f28567c = interfaceC13131v0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final AbstractC12965b0 invoke() {
            AbstractC12965b0 mo5758c = this.f28567c.mo5758c();
            l.e(mo5758c, "this@createCapturedIfNeeded.type");
            return mo5758c;
        }
    }

    /* compiled from: CapturedTypeConstructor.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.q.a.d$b */
    /* loaded from: classes3.dex */
    public static final class C12704b extends C13063l {

        /* renamed from: c */
        final /* synthetic */ boolean f28568c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12704b(boolean z, AbstractC13137y0 abstractC13137y0) {
            super(abstractC13137y0);
            this.f28568c = z;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
        /* renamed from: b */
        public boolean mo5746b() {
            return this.f28568c;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.C13063l, kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
        /* renamed from: e */
        public InterfaceC13131v0 mo5745e(AbstractC12965b0 abstractC12965b0) {
            l.f(abstractC12965b0, "key");
            InterfaceC13131v0 mo5745e = super.mo5745e(abstractC12965b0);
            if (mo5745e == null) {
                return null;
            }
            InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
            return C12702d.m6927b(mo5745e, mo5206d instanceof InterfaceC13562z0 ? (InterfaceC13562z0) mo5206d : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final InterfaceC13131v0 m6927b(InterfaceC13131v0 interfaceC13131v0, InterfaceC13562z0 interfaceC13562z0) {
        if (interfaceC13562z0 == null || interfaceC13131v0.mo5760a() == EnumC13008h1.INVARIANT) {
            return interfaceC13131v0;
        }
        if (interfaceC13562z0.mo4648r() == interfaceC13131v0.mo5760a()) {
            if (interfaceC13131v0.mo5757d()) {
                InterfaceC12954n interfaceC12954n = C12928f.f28984e;
                l.e(interfaceC12954n, "NO_LOCKS");
                return new C13135x0(new C12981e0(interfaceC12954n, new C12703a(interfaceC13131v0)));
            }
            return new C13135x0(interfaceC13131v0.mo5758c());
        }
        return new C13135x0(m6926c(interfaceC13131v0));
    }

    /* renamed from: c */
    public static final AbstractC12965b0 m6926c(InterfaceC13131v0 interfaceC13131v0) {
        l.f(interfaceC13131v0, "typeProjection");
        return new C12699a(interfaceC13131v0, null, false, null, 14, null);
    }

    /* renamed from: d */
    public static final boolean m6925d(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        return abstractC12965b0.mo5779W0() instanceof InterfaceC12700b;
    }

    /* renamed from: e */
    public static final AbstractC13137y0 m6924e(AbstractC13137y0 abstractC13137y0, boolean z) {
        List<C13287o> m4010o0;
        int m3867o;
        l.f(abstractC13137y0, "<this>");
        if (abstractC13137y0 instanceof C13139z) {
            C13139z c13139z = (C13139z) abstractC13137y0;
            InterfaceC13562z0[] m5742i = c13139z.m5742i();
            m4010o0 = C13715n.m4010o0(c13139z.m5743h(), c13139z.m5742i());
            m3867o = C13728s.m3867o(m4010o0, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (C13287o c13287o : m4010o0) {
                arrayList.add(m6927b((InterfaceC13131v0) c13287o.m5364c(), (InterfaceC13562z0) c13287o.m5363d()));
            }
            Object[] array = arrayList.toArray(new InterfaceC13131v0[0]);
            if (array != null) {
                return new C13139z(m5742i, (InterfaceC13131v0[]) array, z);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        return new C12704b(z, abstractC13137y0);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC13137y0 m6923f(AbstractC13137y0 abstractC13137y0, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m6924e(abstractC13137y0, z);
    }
}
