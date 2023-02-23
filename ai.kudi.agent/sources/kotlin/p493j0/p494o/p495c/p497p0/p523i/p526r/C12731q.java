package kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12977d0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13135x0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13724q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13550w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: constantValues.kt */
/* renamed from: kotlin.j0.o.c.p0.i.r.q */
/* loaded from: classes3.dex */
public final class C12731q extends AbstractC12712g<AbstractC12733b> {

    /* renamed from: b */
    public static final C12732a f28595b = new C12732a(null);

    /* compiled from: constantValues.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.r.q$a */
    /* loaded from: classes3.dex */
    public static final class C12732a {
        private C12732a() {
        }

        public /* synthetic */ C12732a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final AbstractC12712g<?> m6881a(AbstractC12965b0 abstractC12965b0) {
            l.f(abstractC12965b0, "argumentType");
            if (C12977d0.m6274a(abstractC12965b0)) {
                return null;
            }
            AbstractC12965b0 abstractC12965b02 = abstractC12965b0;
            int i = 0;
            while (AbstractC12046h.m9904b0(abstractC12965b02)) {
                abstractC12965b02 = ((InterfaceC13131v0) C13722p.m3918q0(abstractC12965b02.mo5780V0())).mo5758c();
                l.e(abstractC12965b02, "type.arguments.single().type");
                i++;
            }
            InterfaceC13334h mo5206d = abstractC12965b02.mo5779W0().mo5206d();
            if (mo5206d instanceof InterfaceC13312e) {
                C12608b m6862h = C12747a.m6862h(mo5206d);
                return m6862h == null ? new C12731q(new AbstractC12733b.C12734a(abstractC12965b0)) : new C12731q(m6862h, i);
            } else if (mo5206d instanceof InterfaceC13562z0) {
                C12608b m7384m = C12608b.m7384m(C12059k.C12060a.f26841b.m7361l());
                l.e(m7384m, "topLevel(StandardNames.FqNames.any.toSafe())");
                return new C12731q(m7384m, 0);
            } else {
                return null;
            }
        }
    }

    /* compiled from: constantValues.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.r.q$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC12733b {

        /* compiled from: constantValues.kt */
        /* renamed from: kotlin.j0.o.c.p0.i.r.q$b$a */
        /* loaded from: classes3.dex */
        public static final class C12734a extends AbstractC12733b {

            /* renamed from: a */
            private final AbstractC12965b0 f28596a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12734a(AbstractC12965b0 abstractC12965b0) {
                super(null);
                l.f(abstractC12965b0, "type");
                this.f28596a = abstractC12965b0;
            }

            /* renamed from: a */
            public final AbstractC12965b0 m6880a() {
                return this.f28596a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C12734a) && l.b(this.f28596a, ((C12734a) obj).f28596a);
            }

            public int hashCode() {
                return this.f28596a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f28596a + ')';
            }
        }

        /* compiled from: constantValues.kt */
        /* renamed from: kotlin.j0.o.c.p0.i.r.q$b$b */
        /* loaded from: classes3.dex */
        public static final class C12735b extends AbstractC12733b {

            /* renamed from: a */
            private final C12711f f28597a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12735b(C12711f c12711f) {
                super(null);
                l.f(c12711f, "value");
                this.f28597a = c12711f;
            }

            /* renamed from: a */
            public final int m6879a() {
                return this.f28597a.m6914c();
            }

            /* renamed from: b */
            public final C12608b m6878b() {
                return this.f28597a.m6913d();
            }

            /* renamed from: c */
            public final C12711f m6877c() {
                return this.f28597a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C12735b) && l.b(this.f28597a, ((C12735b) obj).f28597a);
            }

            public int hashCode() {
                return this.f28597a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f28597a + ')';
            }
        }

        private AbstractC12733b() {
        }

        public /* synthetic */ AbstractC12733b(g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12731q(AbstractC12733b abstractC12733b) {
        super(abstractC12733b);
        l.f(abstractC12733b, "value");
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
    /* renamed from: a */
    public AbstractC12965b0 mo6871a(InterfaceC13305c0 interfaceC13305c0) {
        List m3901b;
        l.f(interfaceC13305c0, "module");
        C12969c0 c12969c0 = C12969c0.f29026a;
        InterfaceC13346g m5317b = InterfaceC13346g.f29516s.m5317b();
        InterfaceC13312e m9928E = interfaceC13305c0.mo4979s().m9928E();
        l.e(m9928E, "module.builtIns.kClass");
        m3901b = C13724q.m3901b(new C13135x0(m6882c(interfaceC13305c0)));
        return C12969c0.m6311g(m5317b, m9928E, m3901b);
    }

    /* renamed from: c */
    public final AbstractC12965b0 m6882c(InterfaceC13305c0 interfaceC13305c0) {
        l.f(interfaceC13305c0, "module");
        AbstractC12733b mo6905b = mo6905b();
        if (mo6905b instanceof AbstractC12733b.C12734a) {
            return ((AbstractC12733b.C12734a) mo6905b()).m6880a();
        }
        if (mo6905b instanceof AbstractC12733b.C12735b) {
            C12711f m6877c = ((AbstractC12733b.C12735b) mo6905b()).m6877c();
            C12608b m6916a = m6877c.m6916a();
            int m6915b = m6877c.m6915b();
            InterfaceC13312e m4703a = C13550w.m4703a(interfaceC13305c0, m6916a);
            if (m4703a == null) {
                AbstractC13010i0 m5811j = C13118t.m5811j("Unresolved type: " + m6916a + " (arrayDimensions=" + m6915b + ')');
                l.e(m5811j, "createErrorType(\"Unresolved type: $classId (arrayDimensions=$arrayDimensions)\")");
                return m5811j;
            }
            AbstractC13010i0 mo5010x = m4703a.mo5010x();
            l.e(mo5010x, "descriptor.defaultType");
            AbstractC12965b0 m5888s = C13090a.m5888s(mo5010x);
            for (int i = 0; i < m6915b; i++) {
                m5888s = interfaceC13305c0.mo4979s().m9886l(EnumC13008h1.INVARIANT, m5888s);
                l.e(m5888s, "module.builtIns.getArrayType(Variance.INVARIANT, type)");
            }
            return m5888s;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12731q(C12711f c12711f) {
        this(new AbstractC12733b.C12735b(c12711f));
        l.f(c12711f, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12731q(C12608b c12608b, int i) {
        this(new C12711f(c12608b, i));
        l.f(c12608b, "classId");
    }
}
