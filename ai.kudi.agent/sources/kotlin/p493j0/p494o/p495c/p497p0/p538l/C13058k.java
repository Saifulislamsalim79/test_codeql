package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.C13668y;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13029j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13040p;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13039o;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13069e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.j0.o.c.p0.l.k */
/* loaded from: classes3.dex */
public final class C13058k extends AbstractC13088m implements InterfaceC13012j, InterfaceC13069e {

    /* renamed from: f */
    public static final C13059a f29146f = new C13059a(null);

    /* renamed from: d */
    private final AbstractC13010i0 f29147d;

    /* renamed from: e */
    private final boolean f29148e;

    /* compiled from: SpecialTypes.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.k$a */
    /* loaded from: classes3.dex */
    public static final class C13059a {
        private C13059a() {
        }

        public /* synthetic */ C13059a(g gVar) {
            this();
        }

        /* renamed from: a */
        private final boolean m6026a(AbstractC13005g1 abstractC13005g1) {
            return (abstractC13005g1.mo5779W0() instanceof InterfaceC13039o) || (abstractC13005g1.mo5779W0().mo5206d() instanceof InterfaceC13562z0) || (abstractC13005g1 instanceof C13029j);
        }

        /* renamed from: c */
        public static /* synthetic */ C13058k m6024c(C13059a c13059a, AbstractC13005g1 abstractC13005g1, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return c13059a.m6025b(abstractC13005g1, z);
        }

        /* renamed from: d */
        private final boolean m6023d(AbstractC13005g1 abstractC13005g1, boolean z) {
            if (m6026a(abstractC13005g1)) {
                if (z && (abstractC13005g1.mo5779W0().mo5206d() instanceof InterfaceC13562z0)) {
                    return C12974c1.m6290l(abstractC13005g1);
                }
                return !C13040p.f29133a.m6066a(abstractC13005g1);
            }
            return false;
        }

        /* renamed from: b */
        public final C13058k m6025b(AbstractC13005g1 abstractC13005g1, boolean z) {
            l.f(abstractC13005g1, "type");
            if (abstractC13005g1 instanceof C13058k) {
                return (C13058k) abstractC13005g1;
            }
            if (m6023d(abstractC13005g1, z)) {
                if (abstractC13005g1 instanceof AbstractC13130v) {
                    AbstractC13130v abstractC13130v = (AbstractC13130v) abstractC13005g1;
                    boolean b = l.b(abstractC13130v.m5777e1().mo5779W0(), abstractC13130v.m5776f1().mo5779W0());
                    if (C13668y.f30115a && !b) {
                        throw new AssertionError("DefinitelyNotNullType for flexible type (" + abstractC13005g1 + ") can be created only from type variable with the same constructor for bounds");
                    }
                }
                return new C13058k(C13136y.m5753c(abstractC13005g1), z, null);
            }
            return null;
        }
    }

    private C13058k(AbstractC13010i0 abstractC13010i0, boolean z) {
        this.f29147d = abstractC13010i0;
        this.f29148e = z;
    }

    public /* synthetic */ C13058k(AbstractC13010i0 abstractC13010i0, boolean z, g gVar) {
        this(abstractC13010i0, z);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13012j
    /* renamed from: R */
    public AbstractC12965b0 mo5774R(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "replacement");
        return C13064l0.m6013e(abstractC12965b0.mo6202Z0(), this.f29148e);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m, kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: X0 */
    public boolean mo5778X0() {
        return false;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13012j
    /* renamed from: b */
    public boolean mo5773b() {
        return (mo5884f1().mo5779W0() instanceof InterfaceC13039o) || (mo5884f1().mo5779W0().mo5206d() instanceof InterfaceC13562z0);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: d1 */
    public AbstractC13010i0 mo5767a1(boolean z) {
        return z ? mo5884f1().mo5826d1(z) : this;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m
    /* renamed from: f1 */
    protected AbstractC13010i0 mo5884f1() {
        return this.f29147d;
    }

    /* renamed from: i1 */
    public final AbstractC13010i0 m6029i1() {
        return this.f29147d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0
    /* renamed from: j1 */
    public C13058k mo5825e1(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "newAnnotations");
        return new C13058k(mo5884f1().mo5825e1(interfaceC13346g), this.f29148e);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m
    /* renamed from: k1 */
    public C13058k mo5907h1(AbstractC13010i0 abstractC13010i0) {
        l.f(abstractC13010i0, "delegate");
        return new C13058k(abstractC13010i0, this.f29148e);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0
    public String toString() {
        return mo5884f1() + "!!";
    }
}
