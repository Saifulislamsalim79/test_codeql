package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C13668y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.C13065a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.EnumC13066b;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.EnumC13087t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13068d;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13069e;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13072h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13073i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13074j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13075k;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13076l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13077m;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13078n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13079o;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13086s;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13736w;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.utils.C13653g;
/* compiled from: AbstractTypeChecker.kt */
/* renamed from: kotlin.j0.o.c.p0.l.e */
/* loaded from: classes3.dex */
public final class C12979e {

    /* renamed from: a */
    public static final C12979e f29045a = new C12979e();

    /* renamed from: b */
    public static boolean f29046b;

    /* compiled from: AbstractTypeChecker.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.e$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12980a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29047a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f29048b;

        static {
            int[] iArr = new int[EnumC13087t.values().length];
            iArr[EnumC13087t.INV.ordinal()] = 1;
            iArr[EnumC13087t.OUT.ordinal()] = 2;
            iArr[EnumC13087t.IN.ordinal()] = 3;
            f29047a = iArr;
            int[] iArr2 = new int[AbstractC12984f.EnumC12985a.values().length];
            iArr2[AbstractC12984f.EnumC12985a.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr2[AbstractC12984f.EnumC12985a.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr2[AbstractC12984f.EnumC12985a.SKIP_LOWER.ordinal()] = 3;
            f29048b = iArr2;
        }
    }

    private C12979e() {
    }

    /* renamed from: a */
    private final Boolean m6272a(AbstractC12984f abstractC12984f, InterfaceC13074j interfaceC13074j, InterfaceC13074j interfaceC13074j2) {
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        if (mo6198j.mo5998C(interfaceC13074j) || mo6198j.mo5998C(interfaceC13074j2)) {
            if (mo6198j.mo5998C(interfaceC13074j) && mo6198j.mo5998C(interfaceC13074j2)) {
                return Boolean.TRUE;
            }
            if (mo6198j.mo5998C(interfaceC13074j)) {
                if (m6270c(mo6198j, abstractC12984f, interfaceC13074j, interfaceC13074j2, false)) {
                    return Boolean.TRUE;
                }
            } else if (mo6198j.mo5998C(interfaceC13074j2) && (m6271b(mo6198j, interfaceC13074j) || m6270c(mo6198j, abstractC12984f, interfaceC13074j2, interfaceC13074j, true))) {
                return Boolean.TRUE;
            }
            return null;
        }
        return null;
    }

    /* renamed from: b */
    private static final boolean m6271b(InterfaceC13079o interfaceC13079o, InterfaceC13074j interfaceC13074j) {
        boolean z;
        InterfaceC13077m mo5975b = interfaceC13079o.mo5975b(interfaceC13074j);
        if (mo5975b instanceof InterfaceC13072h) {
            Collection<InterfaceC13073i> mo5951q = interfaceC13079o.mo5951q(mo5975b);
            if (!(mo5951q instanceof Collection) || !mo5951q.isEmpty()) {
                for (InterfaceC13073i interfaceC13073i : mo5951q) {
                    InterfaceC13074j mo5977a = interfaceC13079o.mo5977a(interfaceC13073i);
                    if (l.b(mo5977a == null ? null : Boolean.valueOf(interfaceC13079o.mo5998C(mo5977a)), Boolean.TRUE)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static final boolean m6270c(InterfaceC13079o interfaceC13079o, AbstractC12984f abstractC12984f, InterfaceC13074j interfaceC13074j, InterfaceC13074j interfaceC13074j2, boolean z) {
        boolean z2;
        Collection<InterfaceC13073i> mo5947s = interfaceC13079o.mo5947s(interfaceC13074j);
        if (!(mo5947s instanceof Collection) || !mo5947s.isEmpty()) {
            for (InterfaceC13073i interfaceC13073i : mo5947s) {
                if (l.b(interfaceC13079o.mo5946t(interfaceC13073i), interfaceC13079o.mo5975b(interfaceC13074j2)) || (z && m6257p(f29045a, abstractC12984f, interfaceC13074j2, interfaceC13073i, false, 8, null))) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    private final Boolean m6269d(AbstractC12984f abstractC12984f, InterfaceC13074j interfaceC13074j, InterfaceC13074j interfaceC13074j2) {
        InterfaceC13074j interfaceC13074j3;
        InterfaceC13078n m6262k;
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        boolean z = false;
        if (mo6198j.mo5984R(interfaceC13074j) || mo6198j.mo5984R(interfaceC13074j2)) {
            return abstractC12984f.mo6196n() ? Boolean.TRUE : (!mo6198j.mo5985Q(interfaceC13074j) || mo6198j.mo5985Q(interfaceC13074j2)) ? Boolean.valueOf(C12976d.f29044a.m6276b(mo6198j, mo6198j.mo5974c(interfaceC13074j, false), mo6198j.mo5974c(interfaceC13074j2, false))) : Boolean.FALSE;
        } else if (!mo6198j.mo5967g0(interfaceC13074j) && !mo6198j.mo5967g0(interfaceC13074j2)) {
            InterfaceC13069e mo5959l0 = mo6198j.mo5959l0(interfaceC13074j2);
            if (mo5959l0 == null || (interfaceC13074j3 = mo6198j.mo5999B(mo5959l0)) == null) {
                interfaceC13074j3 = interfaceC13074j2;
            }
            InterfaceC13068d mo5980X = mo6198j.mo5980X(interfaceC13074j3);
            InterfaceC13073i mo5987O = mo5980X == null ? null : mo6198j.mo5987O(mo5980X);
            if (mo5980X != null && mo5987O != null) {
                if (mo6198j.mo5985Q(interfaceC13074j2)) {
                    mo5987O = mo6198j.mo6000A(mo5987O, true);
                } else if (mo6198j.mo5941w(interfaceC13074j2)) {
                    mo5987O = mo6198j.mo5991K(mo5987O);
                }
                InterfaceC13073i interfaceC13073i = mo5987O;
                int i = C12980a.f29048b[abstractC12984f.m6240g(interfaceC13074j, mo5980X).ordinal()];
                if (i != 1) {
                    if (i == 2 && m6257p(f29045a, abstractC12984f, interfaceC13074j, interfaceC13073i, false, 8, null)) {
                        return Boolean.TRUE;
                    }
                } else {
                    return Boolean.valueOf(m6257p(f29045a, abstractC12984f, interfaceC13074j, interfaceC13073i, false, 8, null));
                }
            }
            InterfaceC13077m mo5975b = mo6198j.mo5975b(interfaceC13074j2);
            if (!mo6198j.mo5983S(mo5975b)) {
                if ((interfaceC13074j instanceof InterfaceC13068d) && (m6262k = f29045a.m6262k(abstractC12984f.mo6198j(), interfaceC13074j2, interfaceC13074j)) != null && mo6198j.mo5958m(m6262k, mo6198j.mo5975b(interfaceC13074j2))) {
                    return Boolean.TRUE;
                } else {
                    return null;
                }
            }
            boolean z2 = !mo6198j.mo5985Q(interfaceC13074j2);
            if (!C13668y.f30115a || z2) {
                Collection<InterfaceC13073i> mo5951q = mo6198j.mo5951q(mo5975b);
                if (!(mo5951q instanceof Collection) || !mo5951q.isEmpty()) {
                    for (InterfaceC13073i interfaceC13073i2 : mo5951q) {
                        if (!m6257p(f29045a, abstractC12984f, interfaceC13074j, interfaceC13073i2, false, 8, null)) {
                            break;
                        }
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            }
            throw new AssertionError(l.m("Intersection type should not be marked nullable!: ", interfaceC13074j2));
        } else {
            return Boolean.valueOf(abstractC12984f.mo6195o());
        }
    }

    /* renamed from: e */
    private final List<InterfaceC13074j> m6268e(AbstractC12984f abstractC12984f, InterfaceC13074j interfaceC13074j, InterfaceC13077m interfaceC13077m) {
        String m3797a0;
        AbstractC12984f.AbstractC12986b mo6192r;
        List<InterfaceC13074j> m3891e;
        List<InterfaceC13074j> m3901b;
        List<InterfaceC13074j> m3891e2;
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        List<InterfaceC13074j> mo5960l = mo6198j.mo5960l(interfaceC13074j, interfaceC13077m);
        if (mo5960l == null) {
            if (!mo6198j.mo5986P(interfaceC13077m) && mo6198j.mo5954o0(interfaceC13074j)) {
                m3891e2 = C13726r.m3891e();
                return m3891e2;
            } else if (mo6198j.mo5956n0(interfaceC13077m)) {
                if (mo6198j.mo5948r0(mo6198j.mo5975b(interfaceC13074j), interfaceC13077m)) {
                    InterfaceC13074j mo5961k0 = mo6198j.mo5961k0(interfaceC13074j, EnumC13066b.FOR_SUBTYPING);
                    if (mo5961k0 != null) {
                        interfaceC13074j = mo5961k0;
                    }
                    m3901b = C13724q.m3901b(interfaceC13074j);
                    return m3901b;
                }
                m3891e = C13726r.m3891e();
                return m3891e;
            } else {
                mo5960l = new C13653g<>();
                abstractC12984f.m6237k();
                ArrayDeque<InterfaceC13074j> m6239h = abstractC12984f.m6239h();
                l.d(m6239h);
                Set<InterfaceC13074j> m6238i = abstractC12984f.m6238i();
                l.d(m6238i);
                m6239h.push(interfaceC13074j);
                while (!m6239h.isEmpty()) {
                    if (m6238i.size() <= 1000) {
                        InterfaceC13074j pop = m6239h.pop();
                        l.e(pop, "current");
                        if (m6238i.add(pop)) {
                            InterfaceC13074j mo5961k02 = mo6198j.mo5961k0(pop, EnumC13066b.FOR_SUBTYPING);
                            if (mo5961k02 == null) {
                                mo5961k02 = pop;
                            }
                            if (mo6198j.mo5948r0(mo6198j.mo5975b(mo5961k02), interfaceC13077m)) {
                                mo5960l.add(mo5961k02);
                                mo6192r = AbstractC12984f.AbstractC12986b.C12989c.f29063a;
                            } else if (mo6198j.mo5966h(mo5961k02) == 0) {
                                mo6192r = AbstractC12984f.AbstractC12986b.C12988b.f29062a;
                            } else {
                                mo6192r = abstractC12984f.mo6192r(mo5961k02);
                            }
                            if (!(!l.b(mo6192r, AbstractC12984f.AbstractC12986b.C12989c.f29063a))) {
                                mo6192r = null;
                            }
                            if (mo6192r != null) {
                                InterfaceC13079o mo6198j2 = abstractC12984f.mo6198j();
                                for (InterfaceC13073i interfaceC13073i : mo6198j2.mo5951q(mo6198j2.mo5975b(pop))) {
                                    m6239h.add(mo6192r.mo6188a(abstractC12984f, interfaceC13073i));
                                }
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Too many supertypes for type: ");
                        sb.append(interfaceC13074j);
                        sb.append(". Supertypes = ");
                        m3797a0 = C13742z.m3797a0(m6238i, null, null, null, 0, null, null, 63, null);
                        sb.append(m3797a0);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                abstractC12984f.m6242e();
            }
        }
        return mo5960l;
    }

    /* renamed from: f */
    private final List<InterfaceC13074j> m6267f(AbstractC12984f abstractC12984f, InterfaceC13074j interfaceC13074j, InterfaceC13077m interfaceC13077m) {
        return m6254s(abstractC12984f, m6268e(abstractC12984f, interfaceC13074j, interfaceC13077m));
    }

    /* renamed from: g */
    private final boolean m6266g(AbstractC12984f abstractC12984f, InterfaceC13073i interfaceC13073i, InterfaceC13073i interfaceC13073i2, boolean z) {
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        InterfaceC13073i mo6194p = abstractC12984f.mo6194p(abstractC12984f.mo6193q(interfaceC13073i));
        InterfaceC13073i mo6194p2 = abstractC12984f.mo6194p(abstractC12984f.mo6193q(interfaceC13073i2));
        Boolean m6269d = f29045a.m6269d(abstractC12984f, mo6198j.mo5976a0(mo6194p), mo6198j.mo5988N(mo6194p2));
        if (m6269d == null) {
            Boolean m6244c = abstractC12984f.m6244c(mo6194p, mo6194p2, z);
            if (m6244c == null) {
                return f29045a.m6256q(abstractC12984f, mo6198j.mo5976a0(mo6194p), mo6198j.mo5988N(mo6194p2));
            }
            return m6244c.booleanValue();
        }
        boolean booleanValue = m6269d.booleanValue();
        abstractC12984f.m6244c(mo6194p, mo6194p2, z);
        return booleanValue;
    }

    /* renamed from: k */
    private final InterfaceC13078n m6262k(InterfaceC13079o interfaceC13079o, InterfaceC13073i interfaceC13073i, InterfaceC13073i interfaceC13073i2) {
        int mo5966h = interfaceC13079o.mo5966h(interfaceC13073i);
        if (mo5966h > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                InterfaceC13076l mo5978Z = interfaceC13079o.mo5978Z(interfaceC13073i, i);
                if (!(!interfaceC13079o.mo5997E(mo5978Z))) {
                    mo5978Z = null;
                }
                if (mo5978Z != null) {
                    if (l.b(interfaceC13079o.mo5952p0(mo5978Z), interfaceC13073i2)) {
                        return interfaceC13079o.mo5940x(interfaceC13079o.mo5946t(interfaceC13073i), i);
                    }
                    InterfaceC13078n m6262k = m6262k(interfaceC13079o, interfaceC13079o.mo5952p0(mo5978Z), interfaceC13073i2);
                    if (m6262k != null) {
                        return m6262k;
                    }
                }
                if (i2 >= mo5966h) {
                    break;
                }
                i = i2;
            }
        }
        return null;
    }

    /* renamed from: l */
    private final boolean m6261l(AbstractC12984f abstractC12984f, InterfaceC13074j interfaceC13074j) {
        String m3797a0;
        AbstractC12984f.AbstractC12986b abstractC12986b;
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        InterfaceC13077m mo5975b = mo6198j.mo5975b(interfaceC13074j);
        if (mo6198j.mo5986P(mo5975b)) {
            return mo6198j.mo5957n(mo5975b);
        }
        if (mo6198j.mo5957n(mo6198j.mo5975b(interfaceC13074j))) {
            return true;
        }
        abstractC12984f.m6237k();
        ArrayDeque<InterfaceC13074j> m6239h = abstractC12984f.m6239h();
        l.d(m6239h);
        Set<InterfaceC13074j> m6238i = abstractC12984f.m6238i();
        l.d(m6238i);
        m6239h.push(interfaceC13074j);
        while (!m6239h.isEmpty()) {
            if (m6238i.size() <= 1000) {
                InterfaceC13074j pop = m6239h.pop();
                l.e(pop, "current");
                if (m6238i.add(pop)) {
                    if (mo6198j.mo5954o0(pop)) {
                        abstractC12986b = AbstractC12984f.AbstractC12986b.C12989c.f29063a;
                    } else {
                        abstractC12986b = AbstractC12984f.AbstractC12986b.C12988b.f29062a;
                    }
                    if (!(!l.b(abstractC12986b, AbstractC12984f.AbstractC12986b.C12989c.f29063a))) {
                        abstractC12986b = null;
                    }
                    if (abstractC12986b == null) {
                        continue;
                    } else {
                        InterfaceC13079o mo6198j2 = abstractC12984f.mo6198j();
                        for (InterfaceC13073i interfaceC13073i : mo6198j2.mo5951q(mo6198j2.mo5975b(pop))) {
                            InterfaceC13074j mo6188a = abstractC12986b.mo6188a(abstractC12984f, interfaceC13073i);
                            if (mo6198j.mo5957n(mo6198j.mo5975b(mo6188a))) {
                                abstractC12984f.m6242e();
                                return true;
                            }
                            m6239h.add(mo6188a);
                        }
                        continue;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many supertypes for type: ");
                sb.append(interfaceC13074j);
                sb.append(". Supertypes = ");
                m3797a0 = C13742z.m3797a0(m6238i, null, null, null, 0, null, null, 63, null);
                sb.append(m3797a0);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        abstractC12984f.m6242e();
        return false;
    }

    /* renamed from: m */
    private final boolean m6260m(InterfaceC13079o interfaceC13079o, InterfaceC13073i interfaceC13073i) {
        return interfaceC13079o.mo5944u(interfaceC13079o.mo5946t(interfaceC13073i)) && !interfaceC13079o.mo5953p(interfaceC13073i) && !interfaceC13079o.mo5941w(interfaceC13073i) && l.b(interfaceC13079o.mo5975b(interfaceC13079o.mo5976a0(interfaceC13073i)), interfaceC13079o.mo5975b(interfaceC13079o.mo5988N(interfaceC13073i)));
    }

    /* renamed from: p */
    public static /* synthetic */ boolean m6257p(C12979e c12979e, AbstractC12984f abstractC12984f, InterfaceC13073i interfaceC13073i, InterfaceC13073i interfaceC13073i2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c12979e.m6258o(abstractC12984f, interfaceC13073i, interfaceC13073i2, z);
    }

    /* renamed from: q */
    private final boolean m6256q(AbstractC12984f abstractC12984f, InterfaceC13074j interfaceC13074j, InterfaceC13074j interfaceC13074j2) {
        int m3867o;
        boolean z;
        int m3867o2;
        InterfaceC13077m interfaceC13077m;
        InterfaceC13077m interfaceC13077m2;
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        if (f29046b) {
            boolean z2 = mo6198j.mo5993I(interfaceC13074j) || mo6198j.mo5983S(mo6198j.mo5975b(interfaceC13074j)) || abstractC12984f.m6236m(interfaceC13074j);
            if (C13668y.f30115a && !z2) {
                throw new AssertionError(l.m("Not singleClassifierType and not intersection subType: ", interfaceC13074j));
            }
            boolean z3 = mo6198j.mo5993I(interfaceC13074j2) || abstractC12984f.m6236m(interfaceC13074j2);
            if (C13668y.f30115a && !z3) {
                throw new AssertionError(l.m("Not singleClassifierType superType: ", interfaceC13074j2));
            }
        }
        if (C12968c.f29025a.m6319d(abstractC12984f, interfaceC13074j, interfaceC13074j2)) {
            Boolean m6272a = f29045a.m6272a(abstractC12984f, mo6198j.mo5976a0(interfaceC13074j), mo6198j.mo5988N(interfaceC13074j2));
            if (m6272a == null) {
                InterfaceC13077m mo5975b = mo6198j.mo5975b(interfaceC13074j2);
                if ((mo6198j.mo5948r0(mo6198j.mo5975b(interfaceC13074j), mo5975b) && mo6198j.mo5969f(mo5975b) == 0) || mo6198j.mo5971d0(mo6198j.mo5975b(interfaceC13074j2))) {
                    return true;
                }
                List<InterfaceC13074j> m6263j = f29045a.m6263j(abstractC12984f, interfaceC13074j, mo5975b);
                int i = 10;
                m3867o = C13728s.m3867o(m6263j, 10);
                ArrayList<InterfaceC13074j> arrayList = new ArrayList(m3867o);
                for (InterfaceC13074j interfaceC13074j3 : m6263j) {
                    InterfaceC13074j mo5977a = mo6198j.mo5977a(abstractC12984f.mo6194p(interfaceC13074j3));
                    if (mo5977a != null) {
                        interfaceC13074j3 = mo5977a;
                    }
                    arrayList.add(interfaceC13074j3);
                }
                int size = arrayList.size();
                if (size != 0) {
                    if (size != 1) {
                        C13065a c13065a = new C13065a(mo6198j.mo5969f(mo5975b));
                        int mo5969f = mo6198j.mo5969f(mo5975b);
                        if (mo5969f > 0) {
                            int i2 = 0;
                            z = false;
                            while (true) {
                                int i3 = i2 + 1;
                                z = z || mo6198j.mo5995G(mo6198j.mo5940x(mo5975b, i2)) != EnumC13087t.OUT;
                                if (z) {
                                    interfaceC13077m = mo5975b;
                                } else {
                                    m3867o2 = C13728s.m3867o(arrayList, i);
                                    List<? extends InterfaceC13073i> arrayList2 = new ArrayList<>(m3867o2);
                                    for (InterfaceC13074j interfaceC13074j4 : arrayList) {
                                        InterfaceC13076l mo5945t0 = mo6198j.mo5945t0(interfaceC13074j4, i2);
                                        InterfaceC13073i interfaceC13073i = null;
                                        if (mo5945t0 == null) {
                                            interfaceC13077m2 = mo5975b;
                                        } else {
                                            interfaceC13077m2 = mo5975b;
                                            if (!(mo6198j.mo5973c0(mo5945t0) == EnumC13087t.INV)) {
                                                mo5945t0 = null;
                                            }
                                            if (mo5945t0 != null) {
                                                interfaceC13073i = mo6198j.mo5952p0(mo5945t0);
                                            }
                                        }
                                        InterfaceC13073i interfaceC13073i2 = interfaceC13073i;
                                        if (interfaceC13073i2 == null) {
                                            throw new IllegalStateException(("Incorrect type: " + interfaceC13074j4 + ", subType: " + interfaceC13074j + ", superType: " + interfaceC13074j2).toString());
                                        }
                                        arrayList2.add(interfaceC13073i2);
                                        mo5975b = interfaceC13077m2;
                                    }
                                    interfaceC13077m = mo5975b;
                                    c13065a.add(mo6198j.mo5982V(mo6198j.mo5994H(arrayList2)));
                                }
                                if (i3 >= mo5969f) {
                                    break;
                                }
                                i2 = i3;
                                mo5975b = interfaceC13077m;
                                i = 10;
                            }
                        } else {
                            z = false;
                        }
                        if (z || !f29045a.m6259n(abstractC12984f, c13065a, interfaceC13074j2)) {
                            if (!arrayList.isEmpty()) {
                                for (InterfaceC13074j interfaceC13074j5 : arrayList) {
                                    if (f29045a.m6259n(abstractC12984f, mo6198j.mo5955o(interfaceC13074j5), interfaceC13074j2)) {
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        return true;
                    }
                    return f29045a.m6259n(abstractC12984f, mo6198j.mo5955o((InterfaceC13074j) C13722p.m3954R(arrayList)), interfaceC13074j2);
                }
                return f29045a.m6261l(abstractC12984f, interfaceC13074j);
            }
            boolean booleanValue = m6272a.booleanValue();
            AbstractC12984f.m6243d(abstractC12984f, interfaceC13074j, interfaceC13074j2, false, 4, null);
            return booleanValue;
        }
        return false;
    }

    /* renamed from: r */
    private final boolean m6255r(InterfaceC13079o interfaceC13079o, InterfaceC13073i interfaceC13073i, InterfaceC13073i interfaceC13073i2, InterfaceC13077m interfaceC13077m) {
        InterfaceC13074j mo5977a = interfaceC13079o.mo5977a(interfaceC13073i);
        if (mo5977a instanceof InterfaceC13068d) {
            InterfaceC13068d interfaceC13068d = (InterfaceC13068d) mo5977a;
            if (interfaceC13079o.mo5997E(interfaceC13079o.mo5989M(interfaceC13079o.mo5981W(interfaceC13068d))) && interfaceC13079o.mo5992J(interfaceC13068d) == EnumC13066b.FOR_SUBTYPING) {
                InterfaceC13077m mo5946t = interfaceC13079o.mo5946t(interfaceC13073i2);
                InterfaceC13086s interfaceC13086s = mo5946t instanceof InterfaceC13086s ? (InterfaceC13086s) mo5946t : null;
                if (interfaceC13086s == null) {
                    return false;
                }
                InterfaceC13078n mo5968f0 = interfaceC13079o.mo5968f0(interfaceC13086s);
                return l.b(mo5968f0 != null ? Boolean.valueOf(interfaceC13079o.mo5958m(mo5968f0, interfaceC13077m)) : null, Boolean.TRUE);
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    private final List<InterfaceC13074j> m6254s(AbstractC12984f abstractC12984f, List<? extends InterfaceC13074j> list) {
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC13075k mo5955o = mo6198j.mo5955o((InterfaceC13074j) next);
            int mo5990L = mo6198j.mo5990L(mo5955o);
            int i = 0;
            while (true) {
                if (i >= mo5990L) {
                    break;
                }
                if (!(mo6198j.mo5996F(mo6198j.mo5952p0(mo6198j.mo5949r(mo5955o, i))) == null)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : list;
    }

    /* renamed from: h */
    public final EnumC13087t m6265h(EnumC13087t enumC13087t, EnumC13087t enumC13087t2) {
        l.f(enumC13087t, "declared");
        l.f(enumC13087t2, "useSite");
        EnumC13087t enumC13087t3 = EnumC13087t.INV;
        if (enumC13087t == enumC13087t3) {
            return enumC13087t2;
        }
        if (enumC13087t2 == enumC13087t3 || enumC13087t == enumC13087t2) {
            return enumC13087t;
        }
        return null;
    }

    /* renamed from: i */
    public final boolean m6264i(AbstractC12984f abstractC12984f, InterfaceC13073i interfaceC13073i, InterfaceC13073i interfaceC13073i2) {
        l.f(abstractC12984f, "context");
        l.f(interfaceC13073i, "a");
        l.f(interfaceC13073i2, "b");
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        if (interfaceC13073i == interfaceC13073i2) {
            return true;
        }
        if (f29045a.m6260m(mo6198j, interfaceC13073i) && f29045a.m6260m(mo6198j, interfaceC13073i2)) {
            InterfaceC13073i mo6193q = abstractC12984f.mo6193q(interfaceC13073i);
            InterfaceC13073i mo6193q2 = abstractC12984f.mo6193q(interfaceC13073i2);
            InterfaceC13074j mo5976a0 = mo6198j.mo5976a0(mo6193q);
            if (!mo6198j.mo5948r0(mo6198j.mo5946t(mo6193q), mo6198j.mo5946t(mo6193q2))) {
                return false;
            }
            if (mo6198j.mo5966h(mo5976a0) == 0) {
                return mo6198j.mo5942v(mo6193q) || mo6198j.mo5942v(mo6193q2) || mo6198j.mo5985Q(mo5976a0) == mo6198j.mo5985Q(mo6198j.mo5976a0(mo6193q2));
            }
        }
        return m6257p(f29045a, abstractC12984f, interfaceC13073i, interfaceC13073i2, false, 8, null) && m6257p(f29045a, abstractC12984f, interfaceC13073i2, interfaceC13073i, false, 8, null);
    }

    /* renamed from: j */
    public final List<InterfaceC13074j> m6263j(AbstractC12984f abstractC12984f, InterfaceC13074j interfaceC13074j, InterfaceC13077m interfaceC13077m) {
        String m3797a0;
        AbstractC12984f.AbstractC12986b abstractC12986b;
        l.f(abstractC12984f, "context");
        l.f(interfaceC13074j, "subType");
        l.f(interfaceC13077m, "superConstructor");
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        if (mo6198j.mo5954o0(interfaceC13074j)) {
            return f29045a.m6267f(abstractC12984f, interfaceC13074j, interfaceC13077m);
        }
        if (!mo6198j.mo5986P(interfaceC13077m) && !mo6198j.mo5962j0(interfaceC13077m)) {
            return f29045a.m6268e(abstractC12984f, interfaceC13074j, interfaceC13077m);
        }
        C13653g<InterfaceC13074j> c13653g = new C13653g();
        abstractC12984f.m6237k();
        ArrayDeque<InterfaceC13074j> m6239h = abstractC12984f.m6239h();
        l.d(m6239h);
        Set<InterfaceC13074j> m6238i = abstractC12984f.m6238i();
        l.d(m6238i);
        m6239h.push(interfaceC13074j);
        while (!m6239h.isEmpty()) {
            if (m6238i.size() <= 1000) {
                InterfaceC13074j pop = m6239h.pop();
                l.e(pop, "current");
                if (m6238i.add(pop)) {
                    if (mo6198j.mo5954o0(pop)) {
                        c13653g.add(pop);
                        abstractC12986b = AbstractC12984f.AbstractC12986b.C12989c.f29063a;
                    } else {
                        abstractC12986b = AbstractC12984f.AbstractC12986b.C12988b.f29062a;
                    }
                    if (!(!l.b(abstractC12986b, AbstractC12984f.AbstractC12986b.C12989c.f29063a))) {
                        abstractC12986b = null;
                    }
                    if (abstractC12986b != null) {
                        InterfaceC13079o mo6198j2 = abstractC12984f.mo6198j();
                        for (InterfaceC13073i interfaceC13073i : mo6198j2.mo5951q(mo6198j2.mo5975b(pop))) {
                            m6239h.add(abstractC12986b.mo6188a(abstractC12984f, interfaceC13073i));
                        }
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many supertypes for type: ");
                sb.append(interfaceC13074j);
                sb.append(". Supertypes = ");
                m3797a0 = C13742z.m3797a0(m6238i, null, null, null, 0, null, null, 63, null);
                sb.append(m3797a0);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        abstractC12984f.m6242e();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC13074j interfaceC13074j2 : c13653g) {
            C12979e c12979e = f29045a;
            l.e(interfaceC13074j2, "it");
            C13736w.m3850v(arrayList, c12979e.m6267f(abstractC12984f, interfaceC13074j2, interfaceC13077m));
        }
        return arrayList;
    }

    /* renamed from: n */
    public final boolean m6259n(AbstractC12984f abstractC12984f, InterfaceC13075k interfaceC13075k, InterfaceC13074j interfaceC13074j) {
        int i;
        int i2;
        boolean m6264i;
        int i3;
        l.f(abstractC12984f, "<this>");
        l.f(interfaceC13075k, "capturedSubArguments");
        l.f(interfaceC13074j, "superType");
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        InterfaceC13077m mo5975b = mo6198j.mo5975b(interfaceC13074j);
        int mo5990L = mo6198j.mo5990L(interfaceC13075k);
        int mo5969f = mo6198j.mo5969f(mo5975b);
        if (mo5990L == mo5969f && mo5990L == mo6198j.mo5966h(interfaceC13074j)) {
            if (mo5969f > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    InterfaceC13076l mo5978Z = mo6198j.mo5978Z(interfaceC13074j, i4);
                    if (!mo6198j.mo5997E(mo5978Z)) {
                        InterfaceC13073i mo5952p0 = mo6198j.mo5952p0(mo5978Z);
                        InterfaceC13076l mo5949r = mo6198j.mo5949r(interfaceC13075k, i4);
                        boolean z = mo6198j.mo5973c0(mo5949r) == EnumC13087t.INV;
                        if (C13668y.f30115a && !z) {
                            throw new AssertionError(l.m("Incorrect sub argument: ", mo5949r));
                        }
                        InterfaceC13073i mo5952p02 = mo6198j.mo5952p0(mo5949r);
                        EnumC13087t m6265h = f29045a.m6265h(mo6198j.mo5995G(mo6198j.mo5940x(mo5975b, i4)), mo6198j.mo5973c0(mo5978Z));
                        if (m6265h == null) {
                            return abstractC12984f.mo6196n();
                        }
                        if (!(m6265h == EnumC13087t.INV && (f29045a.m6255r(mo6198j, mo5952p02, mo5952p0, mo5975b) || f29045a.m6255r(mo6198j, mo5952p0, mo5952p02, mo5975b)))) {
                            i = abstractC12984f.f29054a;
                            if (i <= 100) {
                                i2 = abstractC12984f.f29054a;
                                abstractC12984f.f29054a = i2 + 1;
                                int i6 = C12980a.f29047a[m6265h.ordinal()];
                                if (i6 == 1) {
                                    m6264i = f29045a.m6264i(abstractC12984f, mo5952p02, mo5952p0);
                                } else if (i6 == 2) {
                                    m6264i = m6257p(f29045a, abstractC12984f, mo5952p02, mo5952p0, false, 8, null);
                                } else if (i6 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    m6264i = m6257p(f29045a, abstractC12984f, mo5952p0, mo5952p02, false, 8, null);
                                }
                                i3 = abstractC12984f.f29054a;
                                abstractC12984f.f29054a = i3 - 1;
                                if (!m6264i) {
                                    return false;
                                }
                            } else {
                                throw new IllegalStateException(l.m("Arguments depth is too high. Some related argument: ", mo5952p02).toString());
                            }
                        }
                    }
                    if (i5 >= mo5969f) {
                        break;
                    }
                    i4 = i5;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m6258o(AbstractC12984f abstractC12984f, InterfaceC13073i interfaceC13073i, InterfaceC13073i interfaceC13073i2, boolean z) {
        l.f(abstractC12984f, "context");
        l.f(interfaceC13073i, "subType");
        l.f(interfaceC13073i2, "superType");
        if (interfaceC13073i == interfaceC13073i2) {
            return true;
        }
        if (abstractC12984f.m6241f(interfaceC13073i, interfaceC13073i2)) {
            return m6266g(abstractC12984f, interfaceC13073i, interfaceC13073i2, z);
        }
        return false;
    }
}
