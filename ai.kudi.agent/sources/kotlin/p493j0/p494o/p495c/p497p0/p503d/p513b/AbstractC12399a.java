package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.C12034a;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12064o;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12455r;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12513d;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12524g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12531i;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12565s;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12572u;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.C12470a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.AbstractC12491d;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12489b;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12497g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12588b;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12596e;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12597f;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12598g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.C12756d;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.AbstractC12916x;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.EnumC12805b;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12946g;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.a */
/* loaded from: classes3.dex */
public abstract class AbstractC12399a<A, C> implements InterfaceC12813c<A, C> {

    /* renamed from: a */
    private final InterfaceC12442m f27524a;

    /* renamed from: b */
    private final InterfaceC12946g<InterfaceC12447o, C12401b<A, C>> f27525b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.a$a */
    /* loaded from: classes3.dex */
    public enum EnumC12400a {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.a$b */
    /* loaded from: classes3.dex */
    public static final class C12401b<A, C> {

        /* renamed from: a */
        private final Map<C12455r, List<A>> f27530a;

        /* renamed from: b */
        private final Map<C12455r, C> f27531b;

        /* JADX WARN: Multi-variable type inference failed */
        public C12401b(Map<C12455r, ? extends List<? extends A>> map, Map<C12455r, ? extends C> map2) {
            l.f(map, "memberAnnotations");
            l.f(map2, "propertyConstants");
            this.f27530a = map;
            this.f27531b = map2;
        }

        /* renamed from: a */
        public final Map<C12455r, List<A>> m9003a() {
            return this.f27530a;
        }

        /* renamed from: b */
        public final Map<C12455r, C> m9002b() {
            return this.f27531b;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.a$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12402c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27532a;

        static {
            int[] iArr = new int[EnumC12805b.values().length];
            iArr[EnumC12805b.PROPERTY_GETTER.ordinal()] = 1;
            iArr[EnumC12805b.PROPERTY_SETTER.ordinal()] = 2;
            iArr[EnumC12805b.PROPERTY.ordinal()] = 3;
            f27532a = iArr;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.a$d */
    /* loaded from: classes3.dex */
    public static final class C12403d implements InterfaceC12447o.InterfaceC12451d {

        /* renamed from: a */
        final /* synthetic */ AbstractC12399a<A, C> f27533a;

        /* renamed from: b */
        final /* synthetic */ HashMap<C12455r, List<A>> f27534b;

        /* renamed from: c */
        final /* synthetic */ HashMap<C12455r, C> f27535c;

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        /* renamed from: kotlin.j0.o.c.p0.d.b.a$d$a */
        /* loaded from: classes3.dex */
        public final class C12404a extends C12405b implements InterfaceC12447o.InterfaceC12452e {

            /* renamed from: d */
            final /* synthetic */ C12403d f27536d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12404a(C12403d c12403d, C12455r c12455r) {
                super(c12403d, c12455r);
                l.f(c12403d, "this$0");
                l.f(c12455r, "signature");
                this.f27536d = c12403d;
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12452e
            /* renamed from: c */
            public InterfaceC12447o.InterfaceC12448a mo8868c(int i, C12608b c12608b, InterfaceC13545u0 interfaceC13545u0) {
                l.f(c12608b, "classId");
                l.f(interfaceC13545u0, TransactionField.TRANSACTION_CHANNEL);
                C12455r m8861e = C12455r.f27632b.m8861e(m9001d(), i);
                List<A> list = this.f27536d.f27534b.get(m8861e);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f27536d.f27534b.put(m8861e, list);
                }
                return this.f27536d.f27533a.m9006x(c12608b, interfaceC13545u0, list);
            }
        }

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        /* renamed from: kotlin.j0.o.c.p0.d.b.a$d$b */
        /* loaded from: classes3.dex */
        public class C12405b implements InterfaceC12447o.InterfaceC12450c {

            /* renamed from: a */
            private final C12455r f27537a;

            /* renamed from: b */
            private final ArrayList<A> f27538b;

            /* renamed from: c */
            final /* synthetic */ C12403d f27539c;

            public C12405b(C12403d c12403d, C12455r c12455r) {
                l.f(c12403d, "this$0");
                l.f(c12455r, "signature");
                this.f27539c = c12403d;
                this.f27537a = c12455r;
                this.f27538b = new ArrayList<>();
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12450c
            /* renamed from: a */
            public void mo8872a() {
                if (!this.f27538b.isEmpty()) {
                    this.f27539c.f27534b.put(this.f27537a, this.f27538b);
                }
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12450c
            /* renamed from: b */
            public InterfaceC12447o.InterfaceC12448a mo8871b(C12608b c12608b, InterfaceC13545u0 interfaceC13545u0) {
                l.f(c12608b, "classId");
                l.f(interfaceC13545u0, TransactionField.TRANSACTION_CHANNEL);
                return this.f27539c.f27533a.m9006x(c12608b, interfaceC13545u0, this.f27538b);
            }

            /* renamed from: d */
            protected final C12455r m9001d() {
                return this.f27537a;
            }
        }

        C12403d(AbstractC12399a<A, C> abstractC12399a, HashMap<C12455r, List<A>> hashMap, HashMap<C12455r, C> hashMap2) {
            this.f27533a = abstractC12399a;
            this.f27534b = hashMap;
            this.f27535c = hashMap2;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12451d
        /* renamed from: a */
        public InterfaceC12447o.InterfaceC12450c mo8870a(C12614f c12614f, String str, Object obj) {
            C mo8954z;
            l.f(c12614f, "name");
            l.f(str, KudiPin.KUDI_PIN_DESC);
            C12455r.C12456a c12456a = C12455r.f27632b;
            String m7353b = c12614f.m7353b();
            l.e(m7353b, "name.asString()");
            C12455r m8865a = c12456a.m8865a(m7353b, str);
            if (obj != null && (mo8954z = this.f27533a.mo8954z(str, obj)) != null) {
                this.f27535c.put(m8865a, mo8954z);
            }
            return new C12405b(this, m8865a);
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12451d
        /* renamed from: b */
        public InterfaceC12447o.InterfaceC12452e mo8869b(C12614f c12614f, String str) {
            l.f(c12614f, "name");
            l.f(str, KudiPin.KUDI_PIN_DESC);
            C12455r.C12456a c12456a = C12455r.f27632b;
            String m7353b = c12614f.m7353b();
            l.e(m7353b, "name.asString()");
            return new C12404a(this, c12456a.m8862d(m7353b, str));
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.a$e */
    /* loaded from: classes3.dex */
    public static final class C12406e implements InterfaceC12447o.InterfaceC12450c {

        /* renamed from: a */
        final /* synthetic */ AbstractC12399a<A, C> f27540a;

        /* renamed from: b */
        final /* synthetic */ ArrayList<A> f27541b;

        C12406e(AbstractC12399a<A, C> abstractC12399a, ArrayList<A> arrayList) {
            this.f27540a = abstractC12399a;
            this.f27541b = arrayList;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12450c
        /* renamed from: a */
        public void mo8872a() {
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12450c
        /* renamed from: b */
        public InterfaceC12447o.InterfaceC12448a mo8871b(C12608b c12608b, InterfaceC13545u0 interfaceC13545u0) {
            l.f(c12608b, "classId");
            l.f(interfaceC13545u0, TransactionField.TRANSACTION_CHANNEL);
            return this.f27540a.m9006x(c12608b, interfaceC13545u0, this.f27541b);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.a$f */
    /* loaded from: classes3.dex */
    static final class C12407f extends AbstractC11802m implements InterfaceC11767l<InterfaceC12447o, C12401b<? extends A, ? extends C>> {

        /* renamed from: c */
        final /* synthetic */ AbstractC12399a<A, C> f27542c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12407f(AbstractC12399a<A, C> abstractC12399a) {
            super(1);
            this.f27542c = abstractC12399a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final C12401b<A, C> invoke(InterfaceC12447o interfaceC12447o) {
            l.f(interfaceC12447o, "kotlinClass");
            return this.f27542c.m9005y(interfaceC12447o);
        }
    }

    public AbstractC12399a(InterfaceC12954n interfaceC12954n, InterfaceC12442m interfaceC12442m) {
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC12442m, "kotlinClassFinder");
        this.f27524a = interfaceC12442m;
        this.f27525b = interfaceC12954n.mo6363h(new C12407f(this));
    }

    /* renamed from: A */
    private final List<A> m9020A(AbstractC12916x abstractC12916x, C12542n c12542n, EnumC12400a enumC12400a) {
        boolean m5421J;
        List<A> m3891e;
        List<A> m3891e2;
        List<A> m3891e3;
        Boolean mo7435d = C12588b.f28303A.mo7435d(c12542n.m7983S());
        l.e(mo7435d, "IS_CONST.get(proto.flags)");
        boolean booleanValue = mo7435d.booleanValue();
        C12497g c12497g = C12497g.f27759a;
        boolean m8635f = C12497g.m8635f(c12542n);
        if (enumC12400a == EnumC12400a.PROPERTY) {
            C12455r m9008u = m9008u(this, c12542n, abstractC12916x.m6427b(), abstractC12916x.m6425d(), false, true, false, 40, null);
            if (m9008u == null) {
                m3891e3 = C13726r.m3891e();
                return m3891e3;
            }
            return m9014o(this, abstractC12916x, m9008u, true, false, Boolean.valueOf(booleanValue), m8635f, 8, null);
        }
        C12455r m9008u2 = m9008u(this, c12542n, abstractC12916x.m6427b(), abstractC12916x.m6425d(), true, false, false, 48, null);
        if (m9008u2 == null) {
            m3891e2 = C13726r.m3891e();
            return m3891e2;
        }
        m5421J = C13277t.m5421J(m9008u2.m8866a(), "$delegate", false, 2, null);
        if (m5421J != (enumC12400a == EnumC12400a.DELEGATE_FIELD)) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        return m9015n(abstractC12916x, m9008u2, true, true, Boolean.valueOf(booleanValue), m8635f);
    }

    /* renamed from: C */
    private final InterfaceC12447o m9019C(AbstractC12916x.C12917a c12917a) {
        InterfaceC13545u0 m6426c = c12917a.m6426c();
        C12454q c12454q = m6426c instanceof C12454q ? (C12454q) m6426c : null;
        if (c12454q == null) {
            return null;
        }
        return c12454q.m8867d();
    }

    /* renamed from: m */
    private final int m9016m(AbstractC12916x abstractC12916x, InterfaceC13601o interfaceC13601o) {
        if (interfaceC13601o instanceof C12531i) {
            if (C12597f.m7425d((C12531i) interfaceC13601o)) {
                return 1;
            }
        } else if (interfaceC13601o instanceof C12542n) {
            if (C12597f.m7424e((C12542n) interfaceC13601o)) {
                return 1;
            }
        } else if (interfaceC13601o instanceof C12513d) {
            AbstractC12916x.C12917a c12917a = (AbstractC12916x.C12917a) abstractC12916x;
            if (c12917a.m6422g() == C12509c.EnumC12512c.ENUM_CLASS) {
                return 2;
            }
            if (c12917a.m6420i()) {
                return 1;
            }
        } else {
            throw new UnsupportedOperationException(l.m("Unsupported message: ", interfaceC13601o.getClass()));
        }
        return 0;
    }

    /* renamed from: n */
    private final List<A> m9015n(AbstractC12916x abstractC12916x, C12455r c12455r, boolean z, boolean z2, Boolean bool, boolean z3) {
        List<A> m3891e;
        List<A> m3891e2;
        InterfaceC12447o m9013p = m9013p(abstractC12916x, m9007v(abstractC12916x, z, z2, bool, z3));
        if (m9013p == null) {
            m3891e2 = C13726r.m3891e();
            return m3891e2;
        }
        List<A> list = this.f27525b.invoke(m9013p).m9003a().get(c12455r);
        if (list == null) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        return list;
    }

    /* renamed from: o */
    static /* synthetic */ List m9014o(AbstractC12399a abstractC12399a, AbstractC12916x abstractC12916x, C12455r c12455r, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj == null) {
            return abstractC12399a.m9015n(abstractC12916x, c12455r, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    /* renamed from: p */
    private final InterfaceC12447o m9013p(AbstractC12916x abstractC12916x, InterfaceC12447o interfaceC12447o) {
        if (interfaceC12447o != null) {
            return interfaceC12447o;
        }
        if (abstractC12916x instanceof AbstractC12916x.C12917a) {
            return m9019C((AbstractC12916x.C12917a) abstractC12916x);
        }
        return null;
    }

    /* renamed from: r */
    private final C12455r m9011r(InterfaceC13601o interfaceC13601o, InterfaceC12593c interfaceC12593c, C12598g c12598g, EnumC12805b enumC12805b, boolean z) {
        if (interfaceC13601o instanceof C12513d) {
            C12455r.C12456a c12456a = C12455r.f27632b;
            AbstractC12491d.C12493b m8639b = C12497g.f27759a.m8639b((C12513d) interfaceC13601o, interfaceC12593c, c12598g);
            if (m8639b == null) {
                return null;
            }
            return c12456a.m8864b(m8639b);
        } else if (interfaceC13601o instanceof C12531i) {
            C12455r.C12456a c12456a2 = C12455r.f27632b;
            AbstractC12491d.C12493b m8636e = C12497g.f27759a.m8636e((C12531i) interfaceC13601o, interfaceC12593c, c12598g);
            if (m8636e == null) {
                return null;
            }
            return c12456a2.m8864b(m8636e);
        } else if (interfaceC13601o instanceof C12542n) {
            AbstractC13580h.C13587f<C12542n, C12470a.C12478d> c13587f = C12470a.f27655d;
            l.e(c13587f, "propertySignature");
            C12470a.C12478d c12478d = (C12470a.C12478d) C12596e.m7430a((AbstractC13580h.AbstractC13584d) interfaceC13601o, c13587f);
            if (c12478d == null) {
                return null;
            }
            int i = C12402c.f27532a[enumC12805b.ordinal()];
            if (i == 1) {
                if (c12478d.m8761E()) {
                    C12455r.C12456a c12456a3 = C12455r.f27632b;
                    C12470a.C12475c m8765A = c12478d.m8765A();
                    l.e(m8765A, "signature.getter");
                    return c12456a3.m8863c(interfaceC12593c, m8765A);
                }
                return null;
            } else if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return m9009t((C12542n) interfaceC13601o, interfaceC12593c, c12598g, true, true, z);
            } else if (c12478d.m8760F()) {
                C12455r.C12456a c12456a4 = C12455r.f27632b;
                C12470a.C12475c m8764B = c12478d.m8764B();
                l.e(m8764B, "signature.setter");
                return c12456a4.m8863c(interfaceC12593c, m8764B);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    /* renamed from: s */
    static /* synthetic */ C12455r m9010s(AbstractC12399a abstractC12399a, InterfaceC13601o interfaceC13601o, InterfaceC12593c interfaceC12593c, C12598g c12598g, EnumC12805b enumC12805b, boolean z, int i, Object obj) {
        if (obj == null) {
            return abstractC12399a.m9011r(interfaceC13601o, interfaceC12593c, c12598g, enumC12805b, (i & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    /* renamed from: t */
    private final C12455r m9009t(C12542n c12542n, InterfaceC12593c interfaceC12593c, C12598g c12598g, boolean z, boolean z2, boolean z3) {
        AbstractC13580h.C13587f<C12542n, C12470a.C12478d> c13587f = C12470a.f27655d;
        l.e(c13587f, "propertySignature");
        C12470a.C12478d c12478d = (C12470a.C12478d) C12596e.m7430a(c12542n, c13587f);
        if (c12478d == null) {
            return null;
        }
        if (z) {
            AbstractC12491d.C12492a m8638c = C12497g.f27759a.m8638c(c12542n, interfaceC12593c, c12598g, z3);
            if (m8638c == null) {
                return null;
            }
            return C12455r.f27632b.m8864b(m8638c);
        } else if (z2 && c12478d.m8759G()) {
            C12455r.C12456a c12456a = C12455r.f27632b;
            C12470a.C12475c m8763C = c12478d.m8763C();
            l.e(m8763C, "signature.syntheticMethod");
            return c12456a.m8863c(interfaceC12593c, m8763C);
        } else {
            return null;
        }
    }

    /* renamed from: u */
    static /* synthetic */ C12455r m9008u(AbstractC12399a abstractC12399a, C12542n c12542n, InterfaceC12593c interfaceC12593c, C12598g c12598g, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            return abstractC12399a.m9009t(c12542n, interfaceC12593c, c12598g, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    /* renamed from: v */
    private final InterfaceC12447o m9007v(AbstractC12916x abstractC12916x, boolean z, boolean z2, Boolean bool, boolean z3) {
        AbstractC12916x.C12917a m6421h;
        String m5435z;
        if (z) {
            if (bool != null) {
                if (abstractC12916x instanceof AbstractC12916x.C12917a) {
                    AbstractC12916x.C12917a c12917a = (AbstractC12916x.C12917a) abstractC12916x;
                    if (c12917a.m6422g() == C12509c.EnumC12512c.INTERFACE) {
                        InterfaceC12442m interfaceC12442m = this.f27524a;
                        C12608b m7393d = c12917a.m6424e().m7393d(C12614f.m7349i("DefaultImpls"));
                        l.e(m7393d, "container.classId.createNestedClassId(Name.identifier(JvmAbi.DEFAULT_IMPLS_CLASS_NAME))");
                        return C12446n.m8884b(interfaceC12442m, m7393d);
                    }
                }
                if (bool.booleanValue() && (abstractC12916x instanceof AbstractC12916x.C12918b)) {
                    InterfaceC13545u0 m6426c = abstractC12916x.m6426c();
                    C12433i c12433i = m6426c instanceof C12433i ? (C12433i) m6426c : null;
                    C12756d m8922e = c12433i == null ? null : c12433i.m8922e();
                    if (m8922e != null) {
                        InterfaceC12442m interfaceC12442m2 = this.f27524a;
                        String m6831f = m8922e.m6831f();
                        l.e(m6831f, "facadeClassName.internalName");
                        m5435z = C13276s.m5435z(m6831f, '/', '.', false, 4, null);
                        C12608b m7384m = C12608b.m7384m(new C12609c(m5435z));
                        l.e(m7384m, "topLevel(FqName(facadeClassName.internalName.replace('/', '.')))");
                        return C12446n.m8884b(interfaceC12442m2, m7384m);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + abstractC12916x + ')').toString());
            }
        }
        if (z2 && (abstractC12916x instanceof AbstractC12916x.C12917a)) {
            AbstractC12916x.C12917a c12917a2 = (AbstractC12916x.C12917a) abstractC12916x;
            if (c12917a2.m6422g() == C12509c.EnumC12512c.COMPANION_OBJECT && (m6421h = c12917a2.m6421h()) != null && (m6421h.m6422g() == C12509c.EnumC12512c.CLASS || m6421h.m6422g() == C12509c.EnumC12512c.ENUM_CLASS || (z3 && (m6421h.m6422g() == C12509c.EnumC12512c.INTERFACE || m6421h.m6422g() == C12509c.EnumC12512c.ANNOTATION_CLASS)))) {
                return m9019C(m6421h);
            }
        }
        if ((abstractC12916x instanceof AbstractC12916x.C12918b) && (abstractC12916x.m6426c() instanceof C12433i)) {
            InterfaceC13545u0 m6426c2 = abstractC12916x.m6426c();
            if (m6426c2 != null) {
                C12433i c12433i2 = (C12433i) m6426c2;
                InterfaceC12447o m8921f = c12433i2.m8921f();
                return m8921f == null ? C12446n.m8884b(this.f27524a, c12433i2.m8923d()) : m8921f;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final InterfaceC12447o.InterfaceC12448a m9006x(C12608b c12608b, InterfaceC13545u0 interfaceC13545u0, List<A> list) {
        if (C12034a.f26752a.m9961a().contains(c12608b)) {
            return null;
        }
        return mo8955w(c12608b, interfaceC13545u0, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final C12401b<A, C> m9005y(InterfaceC12447o interfaceC12447o) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        interfaceC12447o.mo4924c(new C12403d(this, hashMap, hashMap2), m9012q(interfaceC12447o));
        return new C12401b<>(hashMap, hashMap2);
    }

    /* renamed from: B */
    protected abstract A mo8961B(C12499b c12499b, InterfaceC12593c interfaceC12593c);

    /* renamed from: D */
    protected abstract C mo8960D(C c);

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: a */
    public List<A> mo6696a(C12565s c12565s, InterfaceC12593c interfaceC12593c) {
        int m3867o;
        l.f(c12565s, "proto");
        l.f(interfaceC12593c, "nameResolver");
        Object m4428u = c12565s.m4428u(C12470a.f27659h);
        l.e(m4428u, "proto.getExtension(JvmProtoBuf.typeParameterAnnotation)");
        Iterable<C12499b> iterable = (Iterable) m4428u;
        m3867o = C13728s.m3867o(iterable, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (C12499b c12499b : iterable) {
            l.e(c12499b, "it");
            arrayList.add(mo8961B(c12499b, interfaceC12593c));
        }
        return arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: b */
    public List<A> mo6695b(AbstractC12916x abstractC12916x, InterfaceC13601o interfaceC13601o, EnumC12805b enumC12805b, int i, C12572u c12572u) {
        List<A> m3891e;
        l.f(abstractC12916x, "container");
        l.f(interfaceC13601o, "callableProto");
        l.f(enumC12805b, "kind");
        l.f(c12572u, "proto");
        C12455r m9010s = m9010s(this, interfaceC13601o, abstractC12916x.m6427b(), abstractC12916x.m6425d(), enumC12805b, false, 16, null);
        if (m9010s != null) {
            return m9014o(this, abstractC12916x, C12455r.f27632b.m8861e(m9010s, i + m9016m(abstractC12916x, interfaceC13601o)), false, false, null, false, 60, null);
        }
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: c */
    public List<A> mo6694c(AbstractC12916x.C12917a c12917a) {
        l.f(c12917a, "container");
        InterfaceC12447o m9019C = m9019C(c12917a);
        if (m9019C != null) {
            ArrayList arrayList = new ArrayList(1);
            m9019C.mo4925b(new C12406e(this, arrayList), m9012q(m9019C));
            return arrayList;
        }
        throw new IllegalStateException(l.m("Class for loading annotations is not found: ", c12917a.mo6419a()).toString());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: d */
    public List<A> mo6693d(C12555q c12555q, InterfaceC12593c interfaceC12593c) {
        int m3867o;
        l.f(c12555q, "proto");
        l.f(interfaceC12593c, "nameResolver");
        Object m4428u = c12555q.m4428u(C12470a.f27657f);
        l.e(m4428u, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<C12499b> iterable = (Iterable) m4428u;
        m3867o = C13728s.m3867o(iterable, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (C12499b c12499b : iterable) {
            l.e(c12499b, "it");
            arrayList.add(mo8961B(c12499b, interfaceC12593c));
        }
        return arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: e */
    public C mo6692e(AbstractC12916x abstractC12916x, C12542n c12542n, AbstractC12965b0 abstractC12965b0) {
        C c;
        l.f(abstractC12916x, "container");
        l.f(c12542n, "proto");
        l.f(abstractC12965b0, "expectedType");
        Boolean mo7435d = C12588b.f28303A.mo7435d(c12542n.m7983S());
        C12497g c12497g = C12497g.f27759a;
        InterfaceC12447o m9013p = m9013p(abstractC12916x, m9007v(abstractC12916x, true, true, mo7435d, C12497g.m8635f(c12542n)));
        if (m9013p == null) {
            return null;
        }
        C12455r m9011r = m9011r(c12542n, abstractC12916x.m6427b(), abstractC12916x.m6425d(), EnumC12805b.PROPERTY, m9013p.mo4926a().m8996d().m7451d(C12427e.f27600b.m8929a()));
        if (m9011r == null || (c = this.f27525b.invoke(m9013p).m9002b().get(m9011r)) == null) {
            return null;
        }
        C12064o c12064o = C12064o.f26891a;
        return C12064o.m9816d(abstractC12965b0) ? mo8960D(c) : c;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: f */
    public List<A> mo6691f(AbstractC12916x abstractC12916x, C12524g c12524g) {
        l.f(abstractC12916x, "container");
        l.f(c12524g, "proto");
        C12455r.C12456a c12456a = C12455r.f27632b;
        String string = abstractC12916x.m6427b().getString(c12524g.m8258F());
        C12489b c12489b = C12489b.f27740a;
        String m7394c = ((AbstractC12916x.C12917a) abstractC12916x).m6424e().m7394c();
        l.e(m7394c, "container as ProtoContainer.Class).classId.asString()");
        return m9014o(this, abstractC12916x, c12456a.m8865a(string, C12489b.m8649b(m7394c)), false, false, null, false, 60, null);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: g */
    public List<A> mo6690g(AbstractC12916x abstractC12916x, C12542n c12542n) {
        l.f(abstractC12916x, "container");
        l.f(c12542n, "proto");
        return m9020A(abstractC12916x, c12542n, EnumC12400a.BACKING_FIELD);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: h */
    public List<A> mo6689h(AbstractC12916x abstractC12916x, InterfaceC13601o interfaceC13601o, EnumC12805b enumC12805b) {
        List<A> m3891e;
        l.f(abstractC12916x, "container");
        l.f(interfaceC13601o, "proto");
        l.f(enumC12805b, "kind");
        C12455r m9010s = m9010s(this, interfaceC13601o, abstractC12916x.m6427b(), abstractC12916x.m6425d(), enumC12805b, false, 16, null);
        if (m9010s != null) {
            return m9014o(this, abstractC12916x, C12455r.f27632b.m8861e(m9010s, 0), false, false, null, false, 60, null);
        }
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: i */
    public List<A> mo6688i(AbstractC12916x abstractC12916x, C12542n c12542n) {
        l.f(abstractC12916x, "container");
        l.f(c12542n, "proto");
        return m9020A(abstractC12916x, c12542n, EnumC12400a.DELEGATE_FIELD);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12813c
    /* renamed from: j */
    public List<A> mo6687j(AbstractC12916x abstractC12916x, InterfaceC13601o interfaceC13601o, EnumC12805b enumC12805b) {
        List<A> m3891e;
        l.f(abstractC12916x, "container");
        l.f(interfaceC13601o, "proto");
        l.f(enumC12805b, "kind");
        if (enumC12805b == EnumC12805b.PROPERTY) {
            return m9020A(abstractC12916x, (C12542n) interfaceC13601o, EnumC12400a.PROPERTY);
        }
        C12455r m9010s = m9010s(this, interfaceC13601o, abstractC12916x.m6427b(), abstractC12916x.m6425d(), enumC12805b, false, 16, null);
        if (m9010s == null) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        return m9014o(this, abstractC12916x, m9010s, false, false, null, false, 60, null);
    }

    /* renamed from: q */
    protected byte[] m9012q(InterfaceC12447o interfaceC12447o) {
        l.f(interfaceC12447o, "kotlinClass");
        return null;
    }

    /* renamed from: w */
    protected abstract InterfaceC12447o.InterfaceC12448a mo8955w(C12608b c12608b, InterfaceC13545u0 interfaceC13545u0, List<A> list);

    /* renamed from: z */
    protected abstract C mo8954z(String str, Object obj);
}
