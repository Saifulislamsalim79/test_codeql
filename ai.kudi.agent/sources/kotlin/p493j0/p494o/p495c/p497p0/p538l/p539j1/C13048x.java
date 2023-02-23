package kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C13668y;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11799i;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11865d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12723n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12956a0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13064l0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13136y;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
/* compiled from: IntersectionType.kt */
/* renamed from: kotlin.j0.o.c.p0.l.j1.x */
/* loaded from: classes3.dex */
public final class C13048x {

    /* renamed from: a */
    public static final C13048x f29139a = new C13048x();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntersectionType.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.j1.x$a */
    /* loaded from: classes3.dex */
    private static final class EnumC13049a {

        /* renamed from: c */
        public static final EnumC13049a f29140c = new C13052c("START", 0);

        /* renamed from: d */
        public static final EnumC13049a f29141d = new C13050a("ACCEPT_NULL", 1);

        /* renamed from: e */
        public static final EnumC13049a f29142e = new C13053d("UNKNOWN", 2);

        /* renamed from: f */
        public static final EnumC13049a f29143f = new C13051b("NOT_NULL", 3);

        /* renamed from: w */
        private static final /* synthetic */ EnumC13049a[] f29144w = m6039a();

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.j1.x$a$a */
        /* loaded from: classes3.dex */
        static final class C13050a extends EnumC13049a {
            C13050a(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13048x.EnumC13049a
            /* renamed from: b */
            public EnumC13049a mo6036b(AbstractC13005g1 abstractC13005g1) {
                l.f(abstractC13005g1, "nextType");
                return m6038e(abstractC13005g1);
            }
        }

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.j1.x$a$b */
        /* loaded from: classes3.dex */
        static final class C13051b extends EnumC13049a {
            C13051b(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13048x.EnumC13049a
            /* renamed from: b */
            public /* bridge */ /* synthetic */ EnumC13049a mo6036b(AbstractC13005g1 abstractC13005g1) {
                m6037g(abstractC13005g1);
                return this;
            }

            /* renamed from: g */
            public C13051b m6037g(AbstractC13005g1 abstractC13005g1) {
                l.f(abstractC13005g1, "nextType");
                return this;
            }
        }

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.j1.x$a$c */
        /* loaded from: classes3.dex */
        static final class C13052c extends EnumC13049a {
            C13052c(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13048x.EnumC13049a
            /* renamed from: b */
            public EnumC13049a mo6036b(AbstractC13005g1 abstractC13005g1) {
                l.f(abstractC13005g1, "nextType");
                return m6038e(abstractC13005g1);
            }
        }

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.j0.o.c.p0.l.j1.x$a$d */
        /* loaded from: classes3.dex */
        static final class C13053d extends EnumC13049a {
            C13053d(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13048x.EnumC13049a
            /* renamed from: b */
            public EnumC13049a mo6036b(AbstractC13005g1 abstractC13005g1) {
                l.f(abstractC13005g1, "nextType");
                EnumC13049a m6038e = m6038e(abstractC13005g1);
                return m6038e == EnumC13049a.f29141d ? this : m6038e;
            }
        }

        private EnumC13049a(String str, int i) {
        }

        public /* synthetic */ EnumC13049a(String str, int i, g gVar) {
            this(str, i);
        }

        /* renamed from: a */
        private static final /* synthetic */ EnumC13049a[] m6039a() {
            return new EnumC13049a[]{f29140c, f29141d, f29142e, f29143f};
        }

        public static EnumC13049a valueOf(String str) {
            return (EnumC13049a) Enum.valueOf(EnumC13049a.class, str);
        }

        public static EnumC13049a[] values() {
            return (EnumC13049a[]) f29144w.clone();
        }

        /* renamed from: b */
        public abstract EnumC13049a mo6036b(AbstractC13005g1 abstractC13005g1);

        /* renamed from: e */
        protected final EnumC13049a m6038e(AbstractC13005g1 abstractC13005g1) {
            l.f(abstractC13005g1, "<this>");
            return abstractC13005g1.mo5778X0() ? f29141d : C13040p.f29133a.m6066a(abstractC13005g1) ? f29143f : f29142e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntersectionType.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.j1.x$b */
    /* loaded from: classes3.dex */
    public static final class C13054b extends AbstractC11802m implements InterfaceC11756a<String> {

        /* renamed from: c */
        final /* synthetic */ Set<AbstractC13010i0> f29145c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13054b(Set<? extends AbstractC13010i0> set) {
            super(0);
            this.f29145c = set;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public final String invoke() {
            String m3797a0;
            m3797a0 = C13742z.m3797a0(this.f29145c, null, null, null, 0, null, null, 63, null);
            return l.m("This collections cannot be empty! input types: ", m3797a0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntersectionType.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.j1.x$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13055c extends C11799i implements InterfaceC11771p<AbstractC12965b0, AbstractC12965b0, Boolean> {
        C13055c(C13048x c13048x) {
            super(2, c13048x);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "isStrictSupertype";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(C13048x.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Boolean invoke(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02) {
            return Boolean.valueOf(m6035l(abstractC12965b0, abstractC12965b02));
        }

        /* renamed from: l */
        public final boolean m6035l(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02) {
            l.f(abstractC12965b0, "p0");
            l.f(abstractC12965b02, "p1");
            return ((C13048x) this.f26478d).m6040e(abstractC12965b0, abstractC12965b02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntersectionType.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.j1.x$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13056d extends C11799i implements InterfaceC11771p<AbstractC12965b0, AbstractC12965b0, Boolean> {
        C13056d(C13038n c13038n) {
            super(2, c13038n);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "equalTypes";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(C13038n.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Boolean invoke(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02) {
            return Boolean.valueOf(m6034l(abstractC12965b0, abstractC12965b02));
        }

        /* renamed from: l */
        public final boolean m6034l(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02) {
            l.f(abstractC12965b0, "p0");
            l.f(abstractC12965b02, "p1");
            return ((C13038n) this.f26478d).mo6073b(abstractC12965b0, abstractC12965b02);
        }
    }

    private C13048x() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051 A[EDGE_INSN: B:27:0x0051->B:18:0x0051 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Collection<kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0> m6043b(java.util.Collection<? extends kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0> r8, kotlin.p483e0.p484c.InterfaceC11771p<? super kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0, ? super kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            kotlin.e0.d.l.e(r8, r1)
        Le:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r8.next()
            kotlin.j0.o.c.p0.l.i0 r1 = (kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0) r1
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L24
        L22:
            r3 = 0
            goto L51
        L24:
            java.util.Iterator r2 = r0.iterator()
        L28:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L22
            java.lang.Object r5 = r2.next()
            kotlin.j0.o.c.p0.l.i0 r5 = (kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0) r5
            if (r5 == r1) goto L4e
            java.lang.String r6 = "lower"
            kotlin.e0.d.l.e(r5, r6)
            java.lang.String r6 = "upper"
            kotlin.e0.d.l.e(r1, r6)
            java.lang.Object r5 = r9.invoke(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4e
            r5 = 1
            goto L4f
        L4e:
            r5 = 0
        L4f:
            if (r5 == 0) goto L28
        L51:
            if (r3 == 0) goto Le
            r8.remove()
            goto Le
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13048x.m6043b(java.util.Collection, kotlin.e0.c.p):java.util.Collection");
    }

    /* renamed from: d */
    private final AbstractC13010i0 m6041d(Set<? extends AbstractC13010i0> set) {
        if (set.size() == 1) {
            return (AbstractC13010i0) C13722p.m3919p0(set);
        }
        C13054b c13054b = new C13054b(set);
        Collection<AbstractC13010i0> m6043b = m6043b(set, new C13055c(this));
        boolean z = !m6043b.isEmpty();
        if (!C13668y.f30115a || z) {
            AbstractC13010i0 m6890b = C12723n.f28580f.m6890b(m6043b);
            if (m6890b == null) {
                Collection<AbstractC13010i0> m6043b2 = m6043b(m6043b, new C13056d(InterfaceC13036m.f29127b.m6075a()));
                boolean isEmpty = true ^ m6043b2.isEmpty();
                if (!C13668y.f30115a || isEmpty) {
                    return m6043b2.size() < 2 ? (AbstractC13010i0) C13722p.m3919p0(m6043b2) : new C12956a0(set).m6354h();
                }
                throw new AssertionError(c13054b.invoke());
            }
            return m6890b;
        }
        throw new AssertionError(c13054b.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m6040e(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02) {
        C13038n m6075a = InterfaceC13036m.f29127b.m6075a();
        return m6075a.mo6071d(abstractC12965b0, abstractC12965b02) && !m6075a.mo6071d(abstractC12965b02, abstractC12965b0);
    }

    /* renamed from: c */
    public final AbstractC13010i0 m6042c(List<? extends AbstractC13010i0> list) {
        int m3867o;
        l.f(list, "types");
        boolean z = list.size() > 1;
        if (C13668y.f30115a && !z) {
            throw new AssertionError(l.m("Size should be at least 2, but it is ", Integer.valueOf(list.size())));
        }
        ArrayList<AbstractC13005g1> arrayList = new ArrayList();
        for (AbstractC13010i0 abstractC13010i0 : list) {
            if (abstractC13010i0.mo5779W0() instanceof C12956a0) {
                Collection<AbstractC12965b0> mo5218a = abstractC13010i0.mo5779W0().mo5218a();
                l.e(mo5218a, "type.constructor.supertypes");
                m3867o = C13728s.m3867o(mo5218a, 10);
                ArrayList arrayList2 = new ArrayList(m3867o);
                for (AbstractC12965b0 abstractC12965b0 : mo5218a) {
                    l.e(abstractC12965b0, "it");
                    AbstractC13010i0 m5752d = C13136y.m5752d(abstractC12965b0);
                    if (abstractC13010i0.mo5778X0()) {
                        m5752d = m5752d.mo5826d1(true);
                    }
                    arrayList2.add(m5752d);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(abstractC13010i0);
            }
        }
        EnumC13049a enumC13049a = EnumC13049a.f29140c;
        for (AbstractC13005g1 abstractC13005g1 : arrayList) {
            enumC13049a = enumC13049a.mo6036b(abstractC13005g1);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC13010i0 abstractC13010i02 = (AbstractC13010i0) it.next();
            if (enumC13049a == EnumC13049a.f29143f) {
                if (abstractC13010i02 instanceof C13029j) {
                    abstractC13010i02 = C13064l0.m6007k((C13029j) abstractC13010i02);
                }
                abstractC13010i02 = C13064l0.m6009i(abstractC13010i02, false, 1, null);
            }
            linkedHashSet.add(abstractC13010i02);
        }
        return m6041d(linkedHashSet);
    }
}
