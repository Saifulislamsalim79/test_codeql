package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.ArrayList;
import java.util.List;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p524q.p525a.C12702d;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13030k;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p543n1.C13097b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.C13354k;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.C13357l;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.utils.C13642c;
/* compiled from: TypeSubstitutor.java */
/* renamed from: kotlin.j0.o.c.p0.l.a1 */
/* loaded from: classes3.dex */
public class C12959a1 {

    /* renamed from: b */
    public static final C12959a1 f29017b = m6342g(AbstractC13137y0.f29220a);

    /* renamed from: a */
    private final AbstractC13137y0 f29018a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeSubstitutor.java */
    /* renamed from: kotlin.j0.o.c.p0.l.a1$a */
    /* loaded from: classes3.dex */
    public static class C12960a implements InterfaceC11767l<C12609c, Boolean> {
        C12960a() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m6327a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: b */
        public Boolean invoke(C12609c c12609c) {
            if (c12609c != null) {
                return Boolean.valueOf(!c12609c.equals(C12059k.C12060a.f26873z));
            }
            m6327a(0);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeSubstitutor.java */
    /* renamed from: kotlin.j0.o.c.p0.l.a1$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C12961b {

        /* renamed from: a */
        static final /* synthetic */ int[] f29019a;

        static {
            int[] iArr = new int[EnumC12963d.values().length];
            f29019a = iArr;
            try {
                iArr[EnumC12963d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29019a[EnumC12963d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29019a[EnumC12963d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TypeSubstitutor.java */
    /* renamed from: kotlin.j0.o.c.p0.l.a1$c */
    /* loaded from: classes3.dex */
    public static final class C12962c extends Exception {
        public C12962c(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TypeSubstitutor.java */
    /* renamed from: kotlin.j0.o.c.p0.l.a1$d */
    /* loaded from: classes3.dex */
    public enum EnumC12963d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected C12959a1(AbstractC13137y0 abstractC13137y0) {
        if (abstractC13137y0 != null) {
            this.f29018a = abstractC13137y0;
        } else {
            m6348a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m6348a(int r13) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1.m6348a(int):void");
    }

    /* renamed from: b */
    private static void m6347b(int i, InterfaceC13131v0 interfaceC13131v0, AbstractC13137y0 abstractC13137y0) {
        if (i <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m6334o(interfaceC13131v0) + "; substitution: " + m6334o(abstractC13137y0));
    }

    /* renamed from: c */
    public static EnumC13008h1 m6346c(EnumC13008h1 enumC13008h1, InterfaceC13131v0 interfaceC13131v0) {
        if (enumC13008h1 == null) {
            m6348a(34);
            throw null;
        } else if (interfaceC13131v0 != null) {
            if (interfaceC13131v0.mo5757d()) {
                EnumC13008h1 enumC13008h12 = EnumC13008h1.OUT_VARIANCE;
                if (enumC13008h12 != null) {
                    return enumC13008h12;
                }
                m6348a(36);
                throw null;
            }
            return m6345d(enumC13008h1, interfaceC13131v0.mo5760a());
        } else {
            m6348a(35);
            throw null;
        }
    }

    /* renamed from: d */
    public static EnumC13008h1 m6345d(EnumC13008h1 enumC13008h1, EnumC13008h1 enumC13008h12) {
        if (enumC13008h1 == null) {
            m6348a(37);
            throw null;
        } else if (enumC13008h12 != null) {
            EnumC13008h1 enumC13008h13 = EnumC13008h1.INVARIANT;
            if (enumC13008h1 == enumC13008h13) {
                if (enumC13008h12 != null) {
                    return enumC13008h12;
                }
                m6348a(39);
                throw null;
            } else if (enumC13008h12 == enumC13008h13) {
                if (enumC13008h1 != null) {
                    return enumC13008h1;
                }
                m6348a(40);
                throw null;
            } else if (enumC13008h1 == enumC13008h12) {
                if (enumC13008h12 != null) {
                    return enumC13008h12;
                }
                m6348a(41);
                throw null;
            } else {
                throw new AssertionError("Variance conflict: type parameter variance '" + enumC13008h1 + "' and projection kind '" + enumC13008h12 + "' cannot be combined");
            }
        } else {
            m6348a(38);
            throw null;
        }
    }

    /* renamed from: e */
    private static EnumC12963d m6344e(EnumC13008h1 enumC13008h1, EnumC13008h1 enumC13008h12) {
        if (enumC13008h1 == EnumC13008h1.IN_VARIANCE && enumC13008h12 == EnumC13008h1.OUT_VARIANCE) {
            return EnumC12963d.OUT_IN_IN_POSITION;
        }
        if (enumC13008h1 == EnumC13008h1.OUT_VARIANCE && enumC13008h12 == EnumC13008h1.IN_VARIANCE) {
            return EnumC12963d.IN_IN_OUT_POSITION;
        }
        return EnumC12963d.NO_CONFLICT;
    }

    /* renamed from: f */
    public static C12959a1 m6343f(AbstractC12965b0 abstractC12965b0) {
        if (abstractC12965b0 != null) {
            return m6342g(AbstractC13127u0.m5788h(abstractC12965b0.mo5779W0(), abstractC12965b0.mo5780V0()));
        }
        m6348a(6);
        throw null;
    }

    /* renamed from: g */
    public static C12959a1 m6342g(AbstractC13137y0 abstractC13137y0) {
        if (abstractC13137y0 != null) {
            return new C12959a1(abstractC13137y0);
        }
        m6348a(0);
        throw null;
    }

    /* renamed from: h */
    public static C12959a1 m6341h(AbstractC13137y0 abstractC13137y0, AbstractC13137y0 abstractC13137y02) {
        if (abstractC13137y0 == null) {
            m6348a(3);
            throw null;
        } else if (abstractC13137y02 != null) {
            return m6342g(C13106p.m5856h(abstractC13137y0, abstractC13137y02));
        } else {
            m6348a(4);
            throw null;
        }
    }

    /* renamed from: i */
    private static InterfaceC13346g m6340i(InterfaceC13346g interfaceC13346g) {
        if (interfaceC13346g != null) {
            if (interfaceC13346g.mo5304Q(C12059k.C12060a.f26873z)) {
                return new C13357l(interfaceC13346g, new C12960a());
            }
            if (interfaceC13346g != null) {
                return interfaceC13346g;
            }
            m6348a(33);
            throw null;
        }
        m6348a(32);
        throw null;
    }

    /* renamed from: l */
    private static InterfaceC13131v0 m6337l(AbstractC12965b0 abstractC12965b0, InterfaceC13131v0 interfaceC13131v0, InterfaceC13562z0 interfaceC13562z0, InterfaceC13131v0 interfaceC13131v02) {
        if (abstractC12965b0 == null) {
            m6348a(25);
            throw null;
        } else if (interfaceC13131v0 == null) {
            m6348a(26);
            throw null;
        } else if (interfaceC13131v02 != null) {
            if (!abstractC12965b0.mo4956y().mo5304Q(C12059k.C12060a.f26873z)) {
                if (interfaceC13131v0 != null) {
                    return interfaceC13131v0;
                }
                m6348a(28);
                throw null;
            }
            InterfaceC13125t0 mo5779W0 = interfaceC13131v0.mo5758c().mo5779W0();
            if (!(mo5779W0 instanceof C13030k)) {
                if (interfaceC13131v0 != null) {
                    return interfaceC13131v0;
                }
                m6348a(29);
                throw null;
            }
            InterfaceC13131v0 mo6088f = ((C13030k) mo5779W0).mo6088f();
            EnumC13008h1 mo5760a = mo6088f.mo5760a();
            if (m6344e(interfaceC13131v02.mo5760a(), mo5760a) == EnumC12963d.OUT_IN_IN_POSITION) {
                return new C13135x0(mo6088f.mo5758c());
            }
            if (interfaceC13562z0 == null) {
                if (interfaceC13131v0 != null) {
                    return interfaceC13131v0;
                }
                m6348a(30);
                throw null;
            } else if (m6344e(interfaceC13562z0.mo4648r(), mo5760a) == EnumC12963d.OUT_IN_IN_POSITION) {
                return new C13135x0(mo6088f.mo5758c());
            } else {
                if (interfaceC13131v0 != null) {
                    return interfaceC13131v0;
                }
                m6348a(31);
                throw null;
            }
        } else {
            m6348a(27);
            throw null;
        }
    }

    /* renamed from: o */
    private static String m6334o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (!C13642c.m4268a(th)) {
                return "[Exception while computing toString(): " + th + "]";
            }
            throw th;
        }
    }

    /* renamed from: r */
    private InterfaceC13131v0 m6331r(InterfaceC13131v0 interfaceC13131v0, int i) throws C12962c {
        AbstractC12965b0 mo5758c = interfaceC13131v0.mo5758c();
        EnumC13008h1 mo5760a = interfaceC13131v0.mo5760a();
        if (mo5758c.mo5779W0().mo5206d() instanceof InterfaceC13562z0) {
            return interfaceC13131v0;
        }
        AbstractC13010i0 m6016b = C13064l0.m6016b(mo5758c);
        AbstractC12965b0 m6333p = m6016b != null ? m6336m().m6333p(m6016b, EnumC13008h1.INVARIANT) : null;
        AbstractC12965b0 m5740b = C13140z0.m5740b(mo5758c, m6330s(mo5758c.mo5779W0().mo5207c(), mo5758c.mo5780V0(), i), this.f29018a.mo5749d(mo5758c.mo4956y()));
        if ((m5740b instanceof AbstractC13010i0) && (m6333p instanceof AbstractC13010i0)) {
            m5740b = C13064l0.m6008j((AbstractC13010i0) m5740b, (AbstractC13010i0) m6333p);
        }
        return new C13135x0(mo5760a, m5740b);
    }

    /* renamed from: s */
    private List<InterfaceC13131v0> m6330s(List<InterfaceC13562z0> list, List<InterfaceC13131v0> list2, int i) throws C12962c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC13562z0 interfaceC13562z0 = list.get(i2);
            InterfaceC13131v0 interfaceC13131v0 = list2.get(i2);
            InterfaceC13131v0 m6328u = m6328u(interfaceC13131v0, interfaceC13562z0, i + 1);
            int i3 = C12961b.f29019a[m6344e(interfaceC13562z0.mo4648r(), m6328u.mo5760a()).ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 && interfaceC13562z0.mo4648r() != EnumC13008h1.INVARIANT && !m6328u.mo5757d()) {
                    m6328u = new C13135x0(EnumC13008h1.INVARIANT, m6328u.mo5758c());
                }
            } else {
                m6328u = C12974c1.m6283s(interfaceC13562z0);
            }
            if (m6328u != interfaceC13131v0) {
                z = true;
            }
            arrayList.add(m6328u);
        }
        return !z ? list2 : arrayList;
    }

    /* renamed from: u */
    private InterfaceC13131v0 m6328u(InterfaceC13131v0 interfaceC13131v0, InterfaceC13562z0 interfaceC13562z0, int i) throws C12962c {
        AbstractC12965b0 m6285q;
        if (interfaceC13131v0 != null) {
            m6347b(i, interfaceC13131v0, this.f29018a);
            if (interfaceC13131v0.mo5757d()) {
                if (interfaceC13131v0 != null) {
                    return interfaceC13131v0;
                }
                m6348a(19);
                throw null;
            }
            AbstractC12965b0 mo5758c = interfaceC13131v0.mo5758c();
            if (mo5758c instanceof InterfaceC12978d1) {
                InterfaceC12978d1 interfaceC12978d1 = (InterfaceC12978d1) mo5758c;
                AbstractC13005g1 mo5769N0 = interfaceC12978d1.mo5769N0();
                AbstractC12965b0 mo5770N = interfaceC12978d1.mo5770N();
                InterfaceC13131v0 m6328u = m6328u(new C13135x0(interfaceC13131v0.mo5760a(), mo5769N0), interfaceC13562z0, i + 1);
                AbstractC12965b0 m6333p = m6333p(mo5770N, interfaceC13131v0.mo5760a());
                AbstractC13005g1 mo6202Z0 = m6328u.mo5758c().mo6202Z0();
                if (m6333p instanceof InterfaceC12978d1) {
                    m6333p = ((InterfaceC12978d1) m6333p).mo5770N();
                }
                return new C13135x0(m6328u.mo5760a(), C12983e1.m6247d(mo6202Z0, m6333p));
            } else if (C13113r.m5831a(mo5758c) || (mo5758c.mo6202Z0() instanceof InterfaceC13007h0)) {
                if (interfaceC13131v0 != null) {
                    return interfaceC13131v0;
                }
                m6348a(20);
                throw null;
            } else {
                InterfaceC13131v0 mo5745e = this.f29018a.mo5745e(mo5758c);
                InterfaceC13131v0 m6337l = mo5745e != null ? m6337l(mo5758c, mo5745e, interfaceC13562z0, interfaceC13131v0) : null;
                EnumC13008h1 mo5760a = interfaceC13131v0.mo5760a();
                if (m6337l == null && C13136y.m5754b(mo5758c) && !C13117s0.m5821b(mo5758c)) {
                    AbstractC13130v m5755a = C13136y.m5755a(mo5758c);
                    int i2 = i + 1;
                    InterfaceC13131v0 m6328u2 = m6328u(new C13135x0(mo5760a, m5755a.m5777e1()), interfaceC13562z0, i2);
                    InterfaceC13131v0 m6328u3 = m6328u(new C13135x0(mo5760a, m5755a.m5776f1()), interfaceC13562z0, i2);
                    EnumC13008h1 mo5760a2 = m6328u2.mo5760a();
                    if (m6328u2.mo5758c() == m5755a.m5777e1() && m6328u3.mo5758c() == m5755a.m5776f1()) {
                        if (interfaceC13131v0 != null) {
                            return interfaceC13131v0;
                        }
                        m6348a(21);
                        throw null;
                    }
                    return new C13135x0(mo5760a2, C12969c0.m6314d(C13140z0.m5741a(m6328u2.mo5758c()), C13140z0.m5741a(m6328u3.mo5758c())));
                } else if (AbstractC12046h.m9887k0(mo5758c) || C12977d0.m6274a(mo5758c)) {
                    if (interfaceC13131v0 != null) {
                        return interfaceC13131v0;
                    }
                    m6348a(22);
                    throw null;
                } else if (m6337l != null) {
                    EnumC12963d m6344e = m6344e(mo5760a, m6337l.mo5760a());
                    if (!C12702d.m6925d(mo5758c)) {
                        int i3 = C12961b.f29019a[m6344e.ordinal()];
                        if (i3 == 1) {
                            throw new C12962c("Out-projection in in-position");
                        }
                        if (i3 == 2) {
                            return new C13135x0(EnumC13008h1.OUT_VARIANCE, mo5758c.mo5779W0().mo5199s().m9924I());
                        }
                    }
                    InterfaceC13012j m5822a = C13117s0.m5822a(mo5758c);
                    if (m6337l.mo5757d()) {
                        if (m6337l != null) {
                            return m6337l;
                        }
                        m6348a(23);
                        throw null;
                    }
                    if (m5822a != null) {
                        m6285q = m5822a.mo5774R(m6337l.mo5758c());
                    } else {
                        m6285q = C12974c1.m6285q(m6337l.mo5758c(), mo5758c.mo5778X0());
                    }
                    if (!mo5758c.mo4956y().isEmpty()) {
                        m6285q = C13090a.m5890q(m6285q, new C13354k(m6285q.mo4956y(), m6340i(this.f29018a.mo5749d(mo5758c.mo4956y()))));
                    }
                    if (m6344e == EnumC12963d.NO_CONFLICT) {
                        mo5760a = m6345d(mo5760a, m6337l.mo5760a());
                    }
                    return new C13135x0(mo5760a, m6285q);
                } else {
                    InterfaceC13131v0 m6331r = m6331r(interfaceC13131v0, i);
                    if (m6331r != null) {
                        return m6331r;
                    }
                    m6348a(24);
                    throw null;
                }
            }
        }
        m6348a(18);
        throw null;
    }

    /* renamed from: j */
    public AbstractC13137y0 m6339j() {
        AbstractC13137y0 abstractC13137y0 = this.f29018a;
        if (abstractC13137y0 != null) {
            return abstractC13137y0;
        }
        m6348a(8);
        throw null;
    }

    /* renamed from: k */
    public boolean m6338k() {
        return this.f29018a.mo5744f();
    }

    /* renamed from: m */
    public C12959a1 m6336m() {
        AbstractC13137y0 abstractC13137y0 = this.f29018a;
        return ((abstractC13137y0 instanceof C13139z) && abstractC13137y0.mo5746b()) ? new C12959a1(new C13139z(((C13139z) this.f29018a).m5742i(), ((C13139z) this.f29018a).m5743h(), false)) : this;
    }

    /* renamed from: n */
    public AbstractC12965b0 m6335n(AbstractC12965b0 abstractC12965b0, EnumC13008h1 enumC13008h1) {
        if (abstractC12965b0 == null) {
            m6348a(9);
            throw null;
        } else if (enumC13008h1 != null) {
            if (m6338k()) {
                if (abstractC12965b0 != null) {
                    return abstractC12965b0;
                }
                m6348a(11);
                throw null;
            }
            try {
                AbstractC12965b0 mo5758c = m6328u(new C13135x0(enumC13008h1, abstractC12965b0), null, 0).mo5758c();
                if (mo5758c != null) {
                    return mo5758c;
                }
                m6348a(12);
                throw null;
            } catch (C12962c e) {
                AbstractC13010i0 m5811j = C13118t.m5811j(e.getMessage());
                if (m5811j != null) {
                    return m5811j;
                }
                m6348a(13);
                throw null;
            }
        } else {
            m6348a(10);
            throw null;
        }
    }

    /* renamed from: p */
    public AbstractC12965b0 m6333p(AbstractC12965b0 abstractC12965b0, EnumC13008h1 enumC13008h1) {
        if (abstractC12965b0 == null) {
            m6348a(14);
            throw null;
        } else if (enumC13008h1 != null) {
            InterfaceC13131v0 m6332q = m6332q(new C13135x0(enumC13008h1, m6339j().mo5748g(abstractC12965b0, enumC13008h1)));
            if (m6332q == null) {
                return null;
            }
            return m6332q.mo5758c();
        } else {
            m6348a(15);
            throw null;
        }
    }

    /* renamed from: q */
    public InterfaceC13131v0 m6332q(InterfaceC13131v0 interfaceC13131v0) {
        if (interfaceC13131v0 != null) {
            InterfaceC13131v0 m6329t = m6329t(interfaceC13131v0);
            return (this.f29018a.mo5751a() || this.f29018a.mo5746b()) ? C13097b.m5873c(m6329t, this.f29018a.mo5746b()) : m6329t;
        }
        m6348a(16);
        throw null;
    }

    /* renamed from: t */
    public InterfaceC13131v0 m6329t(InterfaceC13131v0 interfaceC13131v0) {
        if (interfaceC13131v0 != null) {
            if (m6338k()) {
                return interfaceC13131v0;
            }
            try {
                return m6328u(interfaceC13131v0, null, 0);
            } catch (C12962c unused) {
                return null;
            }
        }
        m6348a(17);
        throw null;
    }
}
