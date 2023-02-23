package kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13135x0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13140z0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: IntegerLiteralTypeConstructor.kt */
/* renamed from: kotlin.j0.o.c.p0.i.r.n */
/* loaded from: classes3.dex */
public final class C12723n implements InterfaceC13125t0 {

    /* renamed from: f */
    public static final C12724a f28580f = new C12724a(null);

    /* renamed from: a */
    private final long f28581a;

    /* renamed from: b */
    private final InterfaceC13305c0 f28582b;

    /* renamed from: c */
    private final Set<AbstractC12965b0> f28583c;

    /* renamed from: d */
    private final AbstractC13010i0 f28584d;

    /* renamed from: e */
    private final InterfaceC11824h f28585e;

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.r.n$a */
    /* loaded from: classes3.dex */
    public static final class C12724a {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IntegerLiteralTypeConstructor.kt */
        /* renamed from: kotlin.j0.o.c.p0.i.r.n$a$a */
        /* loaded from: classes3.dex */
        public enum EnumC12725a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* compiled from: IntegerLiteralTypeConstructor.kt */
        /* renamed from: kotlin.j0.o.c.p0.i.r.n$a$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C12726b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f28589a;

            static {
                int[] iArr = new int[EnumC12725a.values().length];
                iArr[EnumC12725a.COMMON_SUPER_TYPE.ordinal()] = 1;
                iArr[EnumC12725a.INTERSECTION_TYPE.ordinal()] = 2;
                f28589a = iArr;
            }
        }

        private C12724a() {
        }

        public /* synthetic */ C12724a(g gVar) {
            this();
        }

        /* renamed from: a */
        private final AbstractC13010i0 m6891a(Collection<? extends AbstractC13010i0> collection, EnumC12725a enumC12725a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    C12724a c12724a = C12723n.f28580f;
                    next = c12724a.m6887e((AbstractC13010i0) next, (AbstractC13010i0) it.next(), enumC12725a);
                }
                return (AbstractC13010i0) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        /* renamed from: c */
        private final AbstractC13010i0 m6889c(C12723n c12723n, C12723n c12723n2, EnumC12725a enumC12725a) {
            Set m3801W;
            int i = C12726b.f28589a[enumC12725a.ordinal()];
            if (i == 1) {
                m3801W = C13742z.m3801W(c12723n.m6895k(), c12723n2.m6895k());
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                m3801W = C13742z.m3819G0(c12723n.m6895k(), c12723n2.m6895k());
            }
            C12723n c12723n3 = new C12723n(c12723n.f28581a, c12723n.f28582b, m3801W, null);
            C12969c0 c12969c0 = C12969c0.f29026a;
            return C12969c0.m6313e(InterfaceC13346g.f29516s.m5317b(), c12723n3, false);
        }

        /* renamed from: d */
        private final AbstractC13010i0 m6888d(C12723n c12723n, AbstractC13010i0 abstractC13010i0) {
            if (c12723n.m6895k().contains(abstractC13010i0)) {
                return abstractC13010i0;
            }
            return null;
        }

        /* renamed from: e */
        private final AbstractC13010i0 m6887e(AbstractC13010i0 abstractC13010i0, AbstractC13010i0 abstractC13010i02, EnumC12725a enumC12725a) {
            if (abstractC13010i0 == null || abstractC13010i02 == null) {
                return null;
            }
            InterfaceC13125t0 mo5779W0 = abstractC13010i0.mo5779W0();
            InterfaceC13125t0 mo5779W02 = abstractC13010i02.mo5779W0();
            boolean z = mo5779W0 instanceof C12723n;
            if (z && (mo5779W02 instanceof C12723n)) {
                return m6889c((C12723n) mo5779W0, (C12723n) mo5779W02, enumC12725a);
            }
            if (z) {
                return m6888d((C12723n) mo5779W0, abstractC13010i02);
            }
            if (mo5779W02 instanceof C12723n) {
                return m6888d((C12723n) mo5779W02, abstractC13010i0);
            }
            return null;
        }

        /* renamed from: b */
        public final AbstractC13010i0 m6890b(Collection<? extends AbstractC13010i0> collection) {
            l.f(collection, "types");
            return m6891a(collection, EnumC12725a.INTERSECTION_TYPE);
        }
    }

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.r.n$b */
    /* loaded from: classes3.dex */
    static final class C12727b extends AbstractC11802m implements InterfaceC11756a<List<AbstractC13010i0>> {
        C12727b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<AbstractC13010i0> invoke() {
            List m3901b;
            List<AbstractC13010i0> m3885k;
            AbstractC13010i0 mo5010x = C12723n.this.mo5199s().m9863x().mo5010x();
            l.e(mo5010x, "builtIns.comparable.defaultType");
            m3901b = C13724q.m3901b(new C13135x0(EnumC13008h1.IN_VARIANCE, C12723n.this.f28584d));
            m3885k = C13726r.m3885k(C13140z0.m5736f(mo5010x, m3901b, null, 2, null));
            if (!C12723n.this.m6893m()) {
                m3885k.add(C12723n.this.mo5199s().m9921L());
            }
            return m3885k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.r.n$c */
    /* loaded from: classes3.dex */
    public static final class C12728c extends AbstractC11802m implements InterfaceC11767l<AbstractC12965b0, CharSequence> {

        /* renamed from: c */
        public static final C12728c f28591c = new C12728c();

        C12728c() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final CharSequence invoke(AbstractC12965b0 abstractC12965b0) {
            l.f(abstractC12965b0, "it");
            return abstractC12965b0.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12723n(long j, InterfaceC13305c0 interfaceC13305c0, Set<? extends AbstractC12965b0> set) {
        InterfaceC11824h m5625b;
        C12969c0 c12969c0 = C12969c0.f29026a;
        this.f28584d = C12969c0.m6313e(InterfaceC13346g.f29516s.m5317b(), this, false);
        m5625b = C13218k.m5625b(new C12727b());
        this.f28585e = m5625b;
        this.f28581a = j;
        this.f28582b = interfaceC13305c0;
        this.f28583c = set;
    }

    public /* synthetic */ C12723n(long j, InterfaceC13305c0 interfaceC13305c0, Set set, g gVar) {
        this(j, interfaceC13305c0, set);
    }

    /* renamed from: l */
    private final List<AbstractC12965b0> m6894l() {
        return (List) this.f28585e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final boolean m6893m() {
        Collection<AbstractC12965b0> m6874a = C12738t.m6874a(this.f28582b);
        if ((m6874a instanceof Collection) && m6874a.isEmpty()) {
            return true;
        }
        for (AbstractC12965b0 abstractC12965b0 : m6874a) {
            if (!(!m6895k().contains(abstractC12965b0))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    private final String m6892n() {
        String m3797a0;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        m3797a0 = C13742z.m3797a0(this.f28583c, ",", null, null, 0, null, C12728c.f28591c, 30, null);
        sb.append(m3797a0);
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: a */
    public Collection<AbstractC12965b0> mo5218a() {
        return m6894l();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: b */
    public InterfaceC13125t0 mo5217b(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        return this;
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

    /* renamed from: k */
    public final Set<AbstractC12965b0> m6895k() {
        return this.f28583c;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: s */
    public AbstractC12046h mo5199s() {
        return this.f28582b.mo4979s();
    }

    public String toString() {
        return l.m("IntegerLiteralType", m6892n());
    }
}
