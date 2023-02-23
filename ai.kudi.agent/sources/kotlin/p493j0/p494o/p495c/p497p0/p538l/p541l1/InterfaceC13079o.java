package kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1;

import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.C11813x;
/* compiled from: TypeSystemContext.kt */
/* renamed from: kotlin.j0.o.c.p0.l.l1.o */
/* loaded from: classes3.dex */
public interface InterfaceC13079o extends InterfaceC13085r {

    /* compiled from: TypeSystemContext.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.l1.o$a */
    /* loaded from: classes3.dex */
    public static final class C13080a {
        /* renamed from: a */
        public static List<InterfaceC13074j> m5939a(InterfaceC13079o interfaceC13079o, InterfaceC13074j interfaceC13074j, InterfaceC13077m interfaceC13077m) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13074j, "receiver");
            l.f(interfaceC13077m, "constructor");
            return null;
        }

        /* renamed from: b */
        public static InterfaceC13076l m5938b(InterfaceC13079o interfaceC13079o, InterfaceC13075k interfaceC13075k, int i) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13075k, "receiver");
            if (interfaceC13075k instanceof InterfaceC13074j) {
                return interfaceC13079o.mo5978Z((InterfaceC13073i) interfaceC13075k, i);
            }
            if (interfaceC13075k instanceof C13065a) {
                InterfaceC13076l interfaceC13076l = ((C13065a) interfaceC13075k).get(i);
                l.e(interfaceC13076l, "get(index)");
                return interfaceC13076l;
            }
            throw new IllegalStateException(("unknown type argument list type: " + interfaceC13075k + ", " + C11813x.m10316b(interfaceC13075k.getClass())).toString());
        }

        /* renamed from: c */
        public static InterfaceC13076l m5937c(InterfaceC13079o interfaceC13079o, InterfaceC13074j interfaceC13074j, int i) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13074j, "receiver");
            boolean z = false;
            if (i >= 0 && i < interfaceC13079o.mo5966h(interfaceC13074j)) {
                z = true;
            }
            if (z) {
                return interfaceC13079o.mo5978Z(interfaceC13074j, i);
            }
            return null;
        }

        /* renamed from: d */
        public static boolean m5936d(InterfaceC13079o interfaceC13079o, InterfaceC13073i interfaceC13073i) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13073i, "receiver");
            return interfaceC13079o.mo5985Q(interfaceC13079o.mo5976a0(interfaceC13073i)) != interfaceC13079o.mo5985Q(interfaceC13079o.mo5988N(interfaceC13073i));
        }

        /* renamed from: e */
        public static boolean m5935e(InterfaceC13079o interfaceC13079o, InterfaceC13074j interfaceC13074j) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13074j, "receiver");
            return interfaceC13079o.mo5986P(interfaceC13079o.mo5975b(interfaceC13074j));
        }

        /* renamed from: f */
        public static boolean m5934f(InterfaceC13079o interfaceC13079o, InterfaceC13073i interfaceC13073i) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13073i, "receiver");
            InterfaceC13074j mo5977a = interfaceC13079o.mo5977a(interfaceC13073i);
            return (mo5977a == null ? null : interfaceC13079o.mo5959l0(mo5977a)) != null;
        }

        /* renamed from: g */
        public static boolean m5933g(InterfaceC13079o interfaceC13079o, InterfaceC13073i interfaceC13073i) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13073i, "receiver");
            InterfaceC13071g mo5996F = interfaceC13079o.mo5996F(interfaceC13073i);
            return (mo5996F == null ? null : interfaceC13079o.mo5950q0(mo5996F)) != null;
        }

        /* renamed from: h */
        public static boolean m5932h(InterfaceC13079o interfaceC13079o, InterfaceC13074j interfaceC13074j) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13074j, "receiver");
            return interfaceC13079o.mo5962j0(interfaceC13079o.mo5975b(interfaceC13074j));
        }

        /* renamed from: i */
        public static boolean m5931i(InterfaceC13079o interfaceC13079o, InterfaceC13073i interfaceC13073i) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13073i, "receiver");
            return (interfaceC13073i instanceof InterfaceC13074j) && interfaceC13079o.mo5985Q((InterfaceC13074j) interfaceC13073i);
        }

        /* renamed from: j */
        public static boolean m5930j(InterfaceC13079o interfaceC13079o, InterfaceC13073i interfaceC13073i) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13073i, "receiver");
            return interfaceC13079o.mo5957n(interfaceC13079o.mo5946t(interfaceC13073i)) && !interfaceC13079o.mo5963i0(interfaceC13073i);
        }

        /* renamed from: k */
        public static InterfaceC13074j m5929k(InterfaceC13079o interfaceC13079o, InterfaceC13073i interfaceC13073i) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13073i, "receiver");
            InterfaceC13071g mo5996F = interfaceC13079o.mo5996F(interfaceC13073i);
            if (mo5996F == null) {
                InterfaceC13074j mo5977a = interfaceC13079o.mo5977a(interfaceC13073i);
                l.d(mo5977a);
                return mo5977a;
            }
            return interfaceC13079o.mo5970e(mo5996F);
        }

        /* renamed from: l */
        public static int m5928l(InterfaceC13079o interfaceC13079o, InterfaceC13075k interfaceC13075k) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13075k, "receiver");
            if (interfaceC13075k instanceof InterfaceC13074j) {
                return interfaceC13079o.mo5966h((InterfaceC13073i) interfaceC13075k);
            }
            if (interfaceC13075k instanceof C13065a) {
                return ((C13065a) interfaceC13075k).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + interfaceC13075k + ", " + C11813x.m10316b(interfaceC13075k.getClass())).toString());
        }

        /* renamed from: m */
        public static InterfaceC13077m m5927m(InterfaceC13079o interfaceC13079o, InterfaceC13073i interfaceC13073i) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13073i, "receiver");
            InterfaceC13074j mo5977a = interfaceC13079o.mo5977a(interfaceC13073i);
            if (mo5977a == null) {
                mo5977a = interfaceC13079o.mo5976a0(interfaceC13073i);
            }
            return interfaceC13079o.mo5975b(mo5977a);
        }

        /* renamed from: n */
        public static InterfaceC13074j m5926n(InterfaceC13079o interfaceC13079o, InterfaceC13073i interfaceC13073i) {
            l.f(interfaceC13079o, "this");
            l.f(interfaceC13073i, "receiver");
            InterfaceC13071g mo5996F = interfaceC13079o.mo5996F(interfaceC13073i);
            if (mo5996F == null) {
                InterfaceC13074j mo5977a = interfaceC13079o.mo5977a(interfaceC13073i);
                l.d(mo5977a);
                return mo5977a;
            }
            return interfaceC13079o.mo5972d(mo5996F);
        }
    }

    /* renamed from: A */
    InterfaceC13073i mo6000A(InterfaceC13073i interfaceC13073i, boolean z);

    /* renamed from: B */
    InterfaceC13074j mo5999B(InterfaceC13069e interfaceC13069e);

    /* renamed from: C */
    boolean mo5998C(InterfaceC13074j interfaceC13074j);

    /* renamed from: E */
    boolean mo5997E(InterfaceC13076l interfaceC13076l);

    /* renamed from: F */
    InterfaceC13071g mo5996F(InterfaceC13073i interfaceC13073i);

    /* renamed from: G */
    EnumC13087t mo5995G(InterfaceC13078n interfaceC13078n);

    /* renamed from: H */
    InterfaceC13073i mo5994H(List<? extends InterfaceC13073i> list);

    /* renamed from: I */
    boolean mo5993I(InterfaceC13074j interfaceC13074j);

    /* renamed from: J */
    EnumC13066b mo5992J(InterfaceC13068d interfaceC13068d);

    /* renamed from: K */
    InterfaceC13073i mo5991K(InterfaceC13073i interfaceC13073i);

    /* renamed from: L */
    int mo5990L(InterfaceC13075k interfaceC13075k);

    /* renamed from: M */
    InterfaceC13076l mo5989M(InterfaceC13067c interfaceC13067c);

    /* renamed from: N */
    InterfaceC13074j mo5988N(InterfaceC13073i interfaceC13073i);

    /* renamed from: O */
    InterfaceC13073i mo5987O(InterfaceC13068d interfaceC13068d);

    /* renamed from: P */
    boolean mo5986P(InterfaceC13077m interfaceC13077m);

    /* renamed from: Q */
    boolean mo5985Q(InterfaceC13074j interfaceC13074j);

    /* renamed from: R */
    boolean mo5984R(InterfaceC13073i interfaceC13073i);

    /* renamed from: S */
    boolean mo5983S(InterfaceC13077m interfaceC13077m);

    /* renamed from: V */
    InterfaceC13076l mo5982V(InterfaceC13073i interfaceC13073i);

    /* renamed from: W */
    InterfaceC13067c mo5981W(InterfaceC13068d interfaceC13068d);

    /* renamed from: X */
    InterfaceC13068d mo5980X(InterfaceC13074j interfaceC13074j);

    /* renamed from: Y */
    boolean mo5979Y(InterfaceC13073i interfaceC13073i);

    /* renamed from: Z */
    InterfaceC13076l mo5978Z(InterfaceC13073i interfaceC13073i, int i);

    /* renamed from: a */
    InterfaceC13074j mo5977a(InterfaceC13073i interfaceC13073i);

    /* renamed from: a0 */
    InterfaceC13074j mo5976a0(InterfaceC13073i interfaceC13073i);

    /* renamed from: b */
    InterfaceC13077m mo5975b(InterfaceC13074j interfaceC13074j);

    /* renamed from: c */
    InterfaceC13074j mo5974c(InterfaceC13074j interfaceC13074j, boolean z);

    /* renamed from: c0 */
    EnumC13087t mo5973c0(InterfaceC13076l interfaceC13076l);

    /* renamed from: d */
    InterfaceC13074j mo5972d(InterfaceC13071g interfaceC13071g);

    /* renamed from: d0 */
    boolean mo5971d0(InterfaceC13077m interfaceC13077m);

    /* renamed from: e */
    InterfaceC13074j mo5970e(InterfaceC13071g interfaceC13071g);

    /* renamed from: f */
    int mo5969f(InterfaceC13077m interfaceC13077m);

    /* renamed from: f0 */
    InterfaceC13078n mo5968f0(InterfaceC13086s interfaceC13086s);

    /* renamed from: g0 */
    boolean mo5967g0(InterfaceC13074j interfaceC13074j);

    /* renamed from: h */
    int mo5966h(InterfaceC13073i interfaceC13073i);

    /* renamed from: h0 */
    boolean mo5965h0(InterfaceC13073i interfaceC13073i);

    /* renamed from: i */
    boolean mo5964i(InterfaceC13068d interfaceC13068d);

    /* renamed from: i0 */
    boolean mo5963i0(InterfaceC13073i interfaceC13073i);

    /* renamed from: j0 */
    boolean mo5962j0(InterfaceC13077m interfaceC13077m);

    /* renamed from: k0 */
    InterfaceC13074j mo5961k0(InterfaceC13074j interfaceC13074j, EnumC13066b enumC13066b);

    /* renamed from: l */
    List<InterfaceC13074j> mo5960l(InterfaceC13074j interfaceC13074j, InterfaceC13077m interfaceC13077m);

    /* renamed from: l0 */
    InterfaceC13069e mo5959l0(InterfaceC13074j interfaceC13074j);

    /* renamed from: m */
    boolean mo5958m(InterfaceC13078n interfaceC13078n, InterfaceC13077m interfaceC13077m);

    /* renamed from: n */
    boolean mo5957n(InterfaceC13077m interfaceC13077m);

    /* renamed from: n0 */
    boolean mo5956n0(InterfaceC13077m interfaceC13077m);

    /* renamed from: o */
    InterfaceC13075k mo5955o(InterfaceC13074j interfaceC13074j);

    /* renamed from: o0 */
    boolean mo5954o0(InterfaceC13074j interfaceC13074j);

    /* renamed from: p */
    boolean mo5953p(InterfaceC13073i interfaceC13073i);

    /* renamed from: p0 */
    InterfaceC13073i mo5952p0(InterfaceC13076l interfaceC13076l);

    /* renamed from: q */
    Collection<InterfaceC13073i> mo5951q(InterfaceC13077m interfaceC13077m);

    /* renamed from: q0 */
    InterfaceC13070f mo5950q0(InterfaceC13071g interfaceC13071g);

    /* renamed from: r */
    InterfaceC13076l mo5949r(InterfaceC13075k interfaceC13075k, int i);

    /* renamed from: r0 */
    boolean mo5948r0(InterfaceC13077m interfaceC13077m, InterfaceC13077m interfaceC13077m2);

    /* renamed from: s */
    Collection<InterfaceC13073i> mo5947s(InterfaceC13074j interfaceC13074j);

    /* renamed from: t */
    InterfaceC13077m mo5946t(InterfaceC13073i interfaceC13073i);

    /* renamed from: t0 */
    InterfaceC13076l mo5945t0(InterfaceC13074j interfaceC13074j, int i);

    /* renamed from: u */
    boolean mo5944u(InterfaceC13077m interfaceC13077m);

    /* renamed from: u0 */
    boolean mo5943u0(InterfaceC13074j interfaceC13074j);

    /* renamed from: v */
    boolean mo5942v(InterfaceC13073i interfaceC13073i);

    /* renamed from: w */
    boolean mo5941w(InterfaceC13073i interfaceC13073i);

    /* renamed from: x */
    InterfaceC13078n mo5940x(InterfaceC13077m interfaceC13077m, int i);
}
