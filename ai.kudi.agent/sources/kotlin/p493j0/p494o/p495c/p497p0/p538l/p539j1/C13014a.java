package kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13127u0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13024g;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13073i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13074j;
/* compiled from: ClassicTypeCheckerContext.kt */
/* renamed from: kotlin.j0.o.c.p0.l.j1.a */
/* loaded from: classes3.dex */
public class C13014a extends AbstractC12984f {

    /* renamed from: k */
    public static final C13015a f29098k = new C13015a(null);

    /* renamed from: e */
    private final boolean f29099e;

    /* renamed from: f */
    private final boolean f29100f;

    /* renamed from: g */
    private final boolean f29101g;

    /* renamed from: h */
    private final AbstractC13026h f29102h;

    /* renamed from: i */
    private final AbstractC13024g f29103i;

    /* renamed from: j */
    private final InterfaceC13018c f29104j;

    /* compiled from: ClassicTypeCheckerContext.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.j1.a$a */
    /* loaded from: classes3.dex */
    public static final class C13015a {

        /* compiled from: ClassicTypeCheckerContext.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.j1.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C13016a extends AbstractC12984f.AbstractC12986b.AbstractC12987a {

            /* renamed from: a */
            final /* synthetic */ InterfaceC13018c f29105a;

            /* renamed from: b */
            final /* synthetic */ C12959a1 f29106b;

            C13016a(InterfaceC13018c interfaceC13018c, C12959a1 c12959a1) {
                this.f29105a = interfaceC13018c;
                this.f29106b = c12959a1;
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f.AbstractC12986b
            /* renamed from: a */
            public InterfaceC13074j mo6188a(AbstractC12984f abstractC12984f, InterfaceC13073i interfaceC13073i) {
                l.f(abstractC12984f, "context");
                l.f(interfaceC13073i, "type");
                InterfaceC13018c interfaceC13018c = this.f29105a;
                AbstractC12965b0 m6335n = this.f29106b.m6335n((AbstractC12965b0) interfaceC13018c.mo5976a0(interfaceC13073i), EnumC13008h1.INVARIANT);
                l.e(m6335n, "substitutor.safeSubstitute(\n                        type.lowerBoundIfFlexible() as KotlinType,\n                        Variance.INVARIANT\n                    )");
                InterfaceC13074j mo5977a = interfaceC13018c.mo5977a(m6335n);
                l.d(mo5977a);
                return mo5977a;
            }
        }

        private C13015a() {
        }

        public /* synthetic */ C13015a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final AbstractC12984f.AbstractC12986b.AbstractC12987a m6189a(InterfaceC13018c interfaceC13018c, InterfaceC13074j interfaceC13074j) {
            String m6186b;
            l.f(interfaceC13018c, "<this>");
            l.f(interfaceC13074j, "type");
            if (!(interfaceC13074j instanceof AbstractC13010i0)) {
                m6186b = C13017b.m6186b(interfaceC13074j);
                throw new IllegalArgumentException(m6186b.toString());
            }
            return new C13016a(interfaceC13018c, AbstractC13127u0.f29209b.m5786a((AbstractC12965b0) interfaceC13074j).m5750c());
        }
    }

    public /* synthetic */ C13014a(boolean z, boolean z2, boolean z3, AbstractC13026h abstractC13026h, AbstractC13024g abstractC13024g, InterfaceC13018c interfaceC13018c, int i, g gVar) {
        this(z, (i & 2) != 0 ? true : z2, (i & 4) == 0 ? z3 : true, (i & 8) != 0 ? AbstractC13026h.C13027a.f29109a : abstractC13026h, (i & 16) != 0 ? AbstractC13024g.C13025a.f29108a : abstractC13024g, (i & 32) != 0 ? C13042r.f29135a : interfaceC13018c);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f
    /* renamed from: l */
    public boolean mo6197l(InterfaceC13073i interfaceC13073i) {
        l.f(interfaceC13073i, "<this>");
        return (interfaceC13073i instanceof AbstractC13005g1) && this.f29101g && (((AbstractC13005g1) interfaceC13073i).mo5779W0() instanceof InterfaceC13039o);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f
    /* renamed from: n */
    public boolean mo6196n() {
        return this.f29099e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f
    /* renamed from: o */
    public boolean mo6195o() {
        return this.f29100f;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f
    /* renamed from: p */
    public InterfaceC13073i mo6194p(InterfaceC13073i interfaceC13073i) {
        String m6186b;
        l.f(interfaceC13073i, "type");
        if (!(interfaceC13073i instanceof AbstractC12965b0)) {
            m6186b = C13017b.m6186b(interfaceC13073i);
            throw new IllegalArgumentException(m6186b.toString());
        }
        return this.f29103i.m6107a(((AbstractC12965b0) interfaceC13073i).mo6202Z0());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f
    /* renamed from: q */
    public InterfaceC13073i mo6193q(InterfaceC13073i interfaceC13073i) {
        String m6186b;
        l.f(interfaceC13073i, "type");
        if (!(interfaceC13073i instanceof AbstractC12965b0)) {
            m6186b = C13017b.m6186b(interfaceC13073i);
            throw new IllegalArgumentException(m6186b.toString());
        }
        AbstractC12965b0 abstractC12965b0 = (AbstractC12965b0) interfaceC13073i;
        this.f29102h.mo6099g(abstractC12965b0);
        return abstractC12965b0;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f
    /* renamed from: s */
    public InterfaceC13018c mo6198j() {
        return this.f29104j;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f
    /* renamed from: t */
    public AbstractC12984f.AbstractC12986b.AbstractC12987a mo6192r(InterfaceC13074j interfaceC13074j) {
        l.f(interfaceC13074j, "type");
        return f29098k.m6189a(mo6198j(), interfaceC13074j);
    }

    public C13014a(boolean z, boolean z2, boolean z3, AbstractC13026h abstractC13026h, AbstractC13024g abstractC13024g, InterfaceC13018c interfaceC13018c) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        l.f(abstractC13024g, "kotlinTypePreparator");
        l.f(interfaceC13018c, "typeSystemContext");
        this.f29099e = z;
        this.f29100f = z2;
        this.f29101g = z3;
        this.f29102h = abstractC13026h;
        this.f29103i = abstractC13024g;
        this.f29104j = interfaceC13018c;
    }
}
