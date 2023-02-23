package com.google.firebase.inappmessaging.p154j0;

import android.text.TextUtils;
import com.google.android.gms.tasks.InterfaceC4456f;
import com.google.android.gms.tasks.InterfaceC4458g;
import com.google.android.gms.tasks.j;
import com.google.firebase.inappmessaging.C6010d0;
import com.google.firebase.inappmessaging.C6359k;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import com.google.firebase.inappmessaging.model.AbstractC6395m;
import com.google.firebase.inappmessaging.model.C6390k;
import com.google.firebase.inappmessaging.model.C6400o;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.p154j0.p158t3.InterfaceC6332a;
import com.google.firebase.installations.InterfaceC6432h;
import j.e.e0.e;
import java.util.Objects;
import p272h.p286c.p355d.p356a.p357a.p358a.C9370c;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9379b;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9388e;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11684l;
import p425j.p444e.InterfaceC11686n;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p449d0.AbstractC11285a;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.InterfaceC11292g;
import p577n.p586b.InterfaceC14455a;
/* compiled from: InAppMessageStreamManager.java */
/* renamed from: com.google.firebase.inappmessaging.j0.z2 */
/* loaded from: classes2.dex */
public class C6357z2 {

    /* renamed from: a */
    private final AbstractC11285a<String> f15378a;

    /* renamed from: b */
    private final AbstractC11285a<String> f15379b;

    /* renamed from: c */
    private final C6221m2 f15380c;

    /* renamed from: d */
    private final InterfaceC6332a f15381d;

    /* renamed from: e */
    private final C6208k2 f15382e;

    /* renamed from: f */
    private final C6232o3 f15383f;

    /* renamed from: g */
    private final C6349x2 f15384g;

    /* renamed from: h */
    private final C6222m3 f15385h;

    /* renamed from: i */
    private final AbstractC6395m f15386i;

    /* renamed from: j */
    private final C6202j2 f15387j;

    /* renamed from: k */
    private final C6253r3 f15388k;

    /* renamed from: l */
    private final C6195i2 f15389l;

    /* renamed from: m */
    private final InterfaceC6432h f15390m;

    /* renamed from: n */
    private final C6231o2 f15391n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppMessageStreamManager.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.z2$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C6358a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15392a;

        static {
            int[] iArr = new int[C6010d0.EnumC6012b.values().length];
            f15392a = iArr;
            try {
                iArr[C6010d0.EnumC6012b.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15392a[C6010d0.EnumC6012b.IMAGE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15392a[C6010d0.EnumC6012b.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15392a[C6010d0.EnumC6012b.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C6357z2(AbstractC11285a<String> abstractC11285a, AbstractC11285a<String> abstractC11285a2, C6221m2 c6221m2, InterfaceC6332a interfaceC6332a, C6208k2 c6208k2, C6202j2 c6202j2, C6232o3 c6232o3, C6349x2 c6349x2, C6222m3 c6222m3, AbstractC6395m abstractC6395m, C6253r3 c6253r3, InterfaceC6432h interfaceC6432h, C6231o2 c6231o2, C6195i2 c6195i2) {
        this.f15378a = abstractC11285a;
        this.f15379b = abstractC11285a2;
        this.f15380c = c6221m2;
        this.f15381d = interfaceC6332a;
        this.f15382e = c6208k2;
        this.f15387j = c6202j2;
        this.f15383f = c6232o3;
        this.f15384g = c6349x2;
        this.f15385h = c6222m3;
        this.f15386i = abstractC6395m;
        this.f15388k = c6253r3;
        this.f15391n = c6231o2;
        this.f15390m = interfaceC6432h;
        this.f15389l = c6195i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ boolean m22251H(Boolean bool) throws Exception {
        return !bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static /* synthetic */ boolean m22249J(Boolean bool) throws Exception {
        return !bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static /* synthetic */ C9370c m22248K(C9370c c9370c, Boolean bool) throws Exception {
        return c9370c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static /* synthetic */ void m22244O(InterfaceC11684l interfaceC11684l, Object obj) {
        interfaceC11684l.mo10552c(obj);
        interfaceC11684l.mo10554a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static /* synthetic */ void m22243P(InterfaceC11684l interfaceC11684l, Exception exc) {
        interfaceC11684l.mo10553b(exc);
        interfaceC11684l.mo10554a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public static /* synthetic */ void m22242Q(j jVar, final InterfaceC11684l interfaceC11684l) throws Exception {
        jVar.f(new InterfaceC4458g() { // from class: com.google.firebase.inappmessaging.j0.v0
            @Override // com.google.android.gms.tasks.InterfaceC4458g
            /* renamed from: c */
            public final void mo18742c(Object obj) {
                C6357z2.m22244O(InterfaceC11684l.this, obj);
            }
        });
        jVar.d(new InterfaceC4456f() { // from class: com.google.firebase.inappmessaging.j0.g0
            @Override // com.google.android.gms.tasks.InterfaceC4456f
            /* renamed from: b */
            public final void mo15657b(Exception exc) {
                C6357z2.m22243P(InterfaceC11684l.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static void m22241R(C9370c c9370c, Boolean bool) {
        if (c9370c.m14932W().equals(C9370c.EnumC9373c.VANILLA_PAYLOAD)) {
            C6163c3.m22619c(String.format("Already impressed campaign %s ? : %s", c9370c.m14929Z().m14923U(), bool));
        } else if (c9370c.m14932W().equals(C9370c.EnumC9373c.EXPERIMENTAL_PAYLOAD)) {
            C6163c3.m22619c(String.format("Already impressed experiment %s ? : %s", c9370c.m14934U().m14941U(), bool));
        }
    }

    /* renamed from: S */
    private boolean m22240S(String str) {
        if (this.f15388k.m22477a()) {
            return m22227j(str);
        }
        return this.f15388k.m22476b();
    }

    /* renamed from: T */
    private static <T> AbstractC11677k<T> m22239T(final j<T> jVar) {
        return AbstractC11677k.m10600b(new InterfaceC11686n() { // from class: com.google.firebase.inappmessaging.j0.h1
            @Override // p425j.p444e.InterfaceC11686n
            /* renamed from: a */
            public final void mo10547a(InterfaceC11684l interfaceC11684l) {
                C6357z2.m22242Q(jVar, interfaceC11684l);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public AbstractC11677k<C6400o> m22245N(C9370c c9370c, String str) {
        String m14942T;
        String m14941U;
        if (c9370c.m14932W().equals(C9370c.EnumC9373c.VANILLA_PAYLOAD)) {
            m14942T = c9370c.m14929Z().m14924T();
            m14941U = c9370c.m14929Z().m14923U();
        } else if (c9370c.m14932W().equals(C9370c.EnumC9373c.EXPERIMENTAL_PAYLOAD)) {
            m14942T = c9370c.m14934U().m14942T();
            m14941U = c9370c.m14934U().m14941U();
            if (!c9370c.m14933V()) {
                this.f15389l.m22590b(c9370c.m14934U().m14938X());
            }
        } else {
            return AbstractC11677k.m10596g();
        }
        AbstractC6386i m22136c = C6390k.m22136c(c9370c.m14936S(), m14942T, m14941U, c9370c.m14933V(), c9370c.m14935T());
        if (m22136c.m22151c().equals(MessageType.UNSUPPORTED)) {
            return AbstractC11677k.m10596g();
        }
        return AbstractC11677k.m10589n(new C6400o(m22136c, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static boolean m22237V(AbstractC6158b3 abstractC6158b3) {
        return (TextUtils.isEmpty(abstractC6158b3.mo22553b()) || TextUtils.isEmpty(abstractC6158b3.mo22552c().mo22047b())) ? false : true;
    }

    /* renamed from: a */
    static C9388e m22236a() {
        C9388e.C9390b m14868W = C9388e.m14868W();
        m14868W.m14865F(1L);
        return m14868W.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m22235b(C9370c c9370c, C9370c c9370c2) {
        if (!c9370c.m14933V() || c9370c2.m14933V()) {
            if (!c9370c2.m14933V() || c9370c.m14933V()) {
                return Integer.compare(c9370c.m14931X().m22637T(), c9370c2.m14931X().m22637T());
            }
            return 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m22234c(java.lang.String r4, p272h.p286c.p355d.p356a.p357a.p358a.C9370c r5) {
        /*
            boolean r0 = m22227j(r4)
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r5.m14933V()
            if (r0 == 0) goto Le
            return r1
        Le:
            java.util.List r5 = r5.m14930Y()
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r0 = r5.hasNext()
            r2 = 0
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r5.next()
            com.google.firebase.inappmessaging.k r0 = (com.google.firebase.inappmessaging.C6359k) r0
            boolean r3 = m22229h(r0, r4)
            if (r3 != 0) goto L2f
            boolean r0 = m22230g(r0, r4)
            if (r0 == 0) goto L16
        L2f:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r4
            java.lang.String r4 = "The event %s is contained in the list of triggers"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            com.google.firebase.inappmessaging.p154j0.C6163c3.m22621a(r4)
            return r1
        L3d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.inappmessaging.p154j0.C6357z2.m22234c(java.lang.String, h.c.d.a.a.a.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public AbstractC11677k<C9370c> m22220q(String str, final C9370c c9370c) {
        if (!c9370c.m14933V() && m22227j(str)) {
            return this.f15385h.m22527g(this.f15386i).m10443g(C6166d1.f15019c).m10435o(AbstractC11696w.m10438l(Boolean.FALSE)).m10442h(C6234p0.f15133c).m10588o(new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.g1
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    C9370c c9370c2 = C9370c.this;
                    C6357z2.m22248K(c9370c2, (Boolean) obj);
                    return c9370c2;
                }
            });
        }
        return AbstractC11677k.m10589n(c9370c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public AbstractC11677k<C6400o> m22218s(final String str, InterfaceC11291f<C9370c, AbstractC11677k<C9370c>> interfaceC11291f, InterfaceC11291f<C9370c, AbstractC11677k<C9370c>> interfaceC11291f2, InterfaceC11291f<C9370c, AbstractC11677k<C9370c>> interfaceC11291f3, C9388e c9388e) {
        return AbstractC11293f.m11165t(c9388e.m14869V()).m11174k(new InterfaceC11292g() { // from class: com.google.firebase.inappmessaging.j0.r0
            @Override // p425j.p444e.p450e0.InterfaceC11292g
            /* renamed from: c */
            public final boolean mo10557c(Object obj) {
                return C6357z2.this.m22247L((C9370c) obj);
            }
        }).m11174k(new InterfaceC11292g() { // from class: com.google.firebase.inappmessaging.j0.j0
            @Override // p425j.p444e.p450e0.InterfaceC11292g
            /* renamed from: c */
            public final boolean mo10557c(Object obj) {
                boolean m22234c;
                m22234c = C6357z2.m22234c(str, (C9370c) obj);
                return m22234c;
            }
        }).m11168q(interfaceC11291f).m11168q(interfaceC11291f2).m11168q(interfaceC11291f3).m11192G(C6329t0.f15338c).m11173l().m10594i(new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.f1
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6357z2.this.m22245N(str, (C9370c) obj);
            }
        });
    }

    /* renamed from: g */
    private static boolean m22230g(C6359k c6359k, String str) {
        return c6359k.m22209S().m22644T().equals(str);
    }

    /* renamed from: h */
    private static boolean m22229h(C6359k c6359k, String str) {
        return c6359k.m22208T().toString().equals(str);
    }

    /* renamed from: i */
    private static boolean m22228i(InterfaceC6332a interfaceC6332a, C9370c c9370c) {
        long m14940V;
        long m14943S;
        if (c9370c.m14932W().equals(C9370c.EnumC9373c.VANILLA_PAYLOAD)) {
            m14940V = c9370c.m14929Z().m14922V();
            m14943S = c9370c.m14929Z().m14925S();
        } else if (!c9370c.m14932W().equals(C9370c.EnumC9373c.EXPERIMENTAL_PAYLOAD)) {
            return false;
        } else {
            m14940V = c9370c.m14934U().m14940V();
            m14943S = c9370c.m14934U().m14943S();
        }
        long mo22281a = interfaceC6332a.mo22281a();
        return mo22281a > m14940V && mo22281a < m14943S;
    }

    /* renamed from: j */
    public static boolean m22227j(String str) {
        return str.equals("ON_FOREGROUND");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static /* synthetic */ C9370c m22222o(C9370c c9370c, Boolean bool) throws Exception {
        return c9370c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static /* synthetic */ AbstractC11677k m22219r(C9370c c9370c) throws Exception {
        int i = C6358a.f15392a[c9370c.m14936S().m22995W().ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            C6163c3.m22621a("Filtering non-displayable message");
            return AbstractC11677k.m10596g();
        }
        return AbstractC11677k.m10589n(c9370c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public /* synthetic */ InterfaceC14455a m22258A(final String str) throws Exception {
        AbstractC11677k<C9388e> m10586q = this.f15380c.m22541a().m10597f(C6156b1.f15008c).m10598e(C6255s0.f15179c).m10586q(AbstractC11677k.m10596g());
        e eVar = new e() { // from class: com.google.firebase.inappmessaging.j0.y0
            public final void accept(Object obj) {
                C6357z2.this.m22254E((C9388e) obj);
            }
        };
        final InterfaceC11291f interfaceC11291f = new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.k0
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6357z2.this.m22221p((C9370c) obj);
            }
        };
        final InterfaceC11291f interfaceC11291f2 = new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.o0
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6357z2.this.m22220q(str, (C9370c) obj);
            }
        };
        final C6219m0 c6219m0 = C6219m0.f15098c;
        InterfaceC11291f<? super C9388e, ? extends InterfaceC11687o<? extends R>> interfaceC11291f3 = new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.n0
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6357z2.this.m22218s(str, interfaceC11291f, interfaceC11291f2, c6219m0, (C9388e) obj);
            }
        };
        AbstractC11677k<C9379b> m10586q2 = this.f15384g.m22271d().m10598e(C6201j1.f15069c).m10599c(C9379b.m14906W()).m10586q(AbstractC11677k.m10589n(C9379b.m14906W()));
        final AbstractC11677k m10587p = AbstractC11677k.m10602A(m22239T(this.f15390m.mo22049h()), m22239T(this.f15390m.mo22050a(false)), C6190h2.f15053a).m10587p(this.f15383f.m22506a());
        InterfaceC11291f<? super C9379b, ? extends InterfaceC11687o<? extends R>> interfaceC11291f4 = new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.l0
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6357z2.this.m22211z(m10587p, (C9379b) obj);
            }
        };
        if (m22240S(str)) {
            C6163c3.m22619c(String.format("Forcing fetch from service rather than cache. Test Device: %s | App Fresh Install: %s", Boolean.valueOf(this.f15388k.m22476b()), Boolean.valueOf(this.f15388k.m22477a())));
            return m10586q2.m10594i(interfaceC11291f4).m10594i(interfaceC11291f3).m10578y();
        }
        C6163c3.m22621a("Attempting to fetch campaigns using cache");
        return m10586q.m10579x(m10586q2.m10594i(interfaceC11291f4).m10597f(eVar)).m10594i(interfaceC11291f3).m10578y();
    }

    /* renamed from: E */
    public /* synthetic */ void m22254E(C9388e c9388e) throws Exception {
        this.f15380c.m22534h(c9388e).m11244g(C6151a1.f14990a).m11243h(C6347x0.f15362c).m11235p(C6343w0.f15357c).m11234q();
    }

    /* renamed from: L */
    public /* synthetic */ boolean m22247L(C9370c c9370c) throws Exception {
        return this.f15388k.m22476b() || m22228i(this.f15381d, c9370c);
    }

    /* renamed from: d */
    public AbstractC11293f<C6400o> m22233d() {
        return AbstractC11293f.m11161x(this.f15378a, this.f15387j.m22575d(), this.f15379b).m11177h(C6165d0.f15018c).m11160y(this.f15383f.m22506a()).m11181d(new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.f0
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6357z2.this.m22258A((String) obj);
            }
        }).m11160y(this.f15383f.m22505b());
    }

    /* renamed from: p */
    public /* synthetic */ AbstractC11677k m22221p(final C9370c c9370c) throws Exception {
        if (c9370c.m14933V()) {
            return AbstractC11677k.m10589n(c9370c);
        }
        return this.f15384g.m22269f(c9370c).m10444f(C6335u0.f15343c).m10435o(AbstractC11696w.m10438l(Boolean.FALSE)).m10443g(new e() { // from class: com.google.firebase.inappmessaging.j0.i1
            public final void accept(Object obj) {
                C6357z2.m22241R(C9370c.this, (Boolean) obj);
            }
        }).m10442h(C6173e1.f15033c).m10588o(new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.c1
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                C9370c c9370c2 = C9370c.this;
                C6357z2.m22222o(c9370c2, (Boolean) obj);
                return c9370c2;
            }
        });
    }

    /* renamed from: u */
    public /* synthetic */ C9388e m22216u(C9379b c9379b, AbstractC6158b3 abstractC6158b3) throws Exception {
        return this.f15382e.m22571c(abstractC6158b3, c9379b);
    }

    /* renamed from: w */
    public /* synthetic */ void m22214w(C9388e c9388e) throws Exception {
        this.f15384g.m22273b(c9388e).m11234q();
    }

    /* renamed from: z */
    public /* synthetic */ AbstractC11677k m22211z(AbstractC11677k abstractC11677k, final C9379b c9379b) throws Exception {
        if (!this.f15391n.m22510a()) {
            C6163c3.m22619c("Automatic data collection is disabled, not attempting campaign fetch from service.");
            return AbstractC11677k.m10589n(m22236a());
        }
        AbstractC11677k m10597f = abstractC11677k.m10595h(C6172e0.f15032c).m10588o(new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.i0
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6357z2.this.m22216u(c9379b, (AbstractC6158b3) obj);
            }
        }).m10579x(AbstractC11677k.m10589n(m22236a())).m10597f(C6188h0.f15051c).m10597f(new e() { // from class: com.google.firebase.inappmessaging.j0.z0
            public final void accept(Object obj) {
                C6357z2.this.m22214w((C9388e) obj);
            }
        });
        final C6202j2 c6202j2 = this.f15387j;
        Objects.requireNonNull(c6202j2);
        AbstractC11677k m10597f2 = m10597f.m10597f(new e() { // from class: com.google.firebase.inappmessaging.j0.f2
            public final void accept(Object obj) {
                C6202j2.this.m22574e((C9388e) obj);
            }
        });
        final C6253r3 c6253r3 = this.f15388k;
        Objects.requireNonNull(c6253r3);
        return m10597f2.m10597f(new e() { // from class: com.google.firebase.inappmessaging.j0.o1
            public final void accept(Object obj) {
                C6253r3.this.m22475c((C9388e) obj);
            }
        }).m10598e(C6245q0.f15152c).m10586q(AbstractC11677k.m10596g());
    }
}
