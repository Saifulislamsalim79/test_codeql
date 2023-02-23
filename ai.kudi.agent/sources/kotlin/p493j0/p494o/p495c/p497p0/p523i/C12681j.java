package kotlin.p493j0.p494o.p495c.p497p0.p523i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.C13287o;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.InterfaceC12674e;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12977d0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13136y;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13024g;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13014a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13038n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13022f;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13516n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13521q;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13382b0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13384c0;
import kotlin.reflect.jvm.internal.impl.utils.C13658h;
/* compiled from: OverridingUtil.java */
/* renamed from: kotlin.j0.o.c.p0.i.j */
/* loaded from: classes3.dex */
public class C12681j {

    /* renamed from: c */
    private static final List<InterfaceC12674e> f28538c;

    /* renamed from: d */
    public static final C12681j f28539d;

    /* renamed from: e */
    private static final InterfaceC13022f.InterfaceC13023a f28540e;

    /* renamed from: a */
    private final AbstractC13026h f28541a;

    /* renamed from: b */
    private final InterfaceC13022f.InterfaceC13023a f28542b;

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.j0.o.c.p0.i.j$a */
    /* loaded from: classes3.dex */
    static class C12682a implements InterfaceC13022f.InterfaceC13023a {
        C12682a() {
        }

        /* renamed from: b */
        private static /* synthetic */ void m6954b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13022f.InterfaceC13023a
        /* renamed from: a */
        public boolean mo6108a(InterfaceC13125t0 interfaceC13125t0, InterfaceC13125t0 interfaceC13125t02) {
            if (interfaceC13125t0 == null) {
                m6954b(0);
                throw null;
            } else if (interfaceC13125t02 != null) {
                return interfaceC13125t0.equals(interfaceC13125t02);
            } else {
                m6954b(1);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.j0.o.c.p0.i.j$b */
    /* loaded from: classes3.dex */
    public static class C12683b implements InterfaceC11771p<D, D, C13287o<InterfaceC13293a, InterfaceC13293a>> {
        C12683b() {
        }

        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/o<Lkotlin/reflect/jvm/internal/impl/descriptors/a;Lkotlin/reflect/jvm/internal/impl/descriptors/a;>; */
        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: a */
        public C13287o invoke(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2) {
            return new C13287o(interfaceC13293a, interfaceC13293a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.j0.o.c.p0.i.j$c */
    /* loaded from: classes3.dex */
    public static class C12684c implements InterfaceC11767l<InterfaceC13300b, Boolean> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13513m f28543c;

        C12684c(InterfaceC13513m interfaceC13513m) {
            this.f28543c = interfaceC13513m;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public Boolean invoke(InterfaceC13300b interfaceC13300b) {
            return Boolean.valueOf(interfaceC13300b.mo4687d() == this.f28543c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.j0.o.c.p0.i.j$d */
    /* loaded from: classes3.dex */
    public static class C12685d implements InterfaceC11767l<InterfaceC13300b, InterfaceC13293a> {
        C12685d() {
        }

        /* renamed from: a */
        public InterfaceC13300b m6951a(InterfaceC13300b interfaceC13300b) {
            return interfaceC13300b;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ InterfaceC13293a invoke(InterfaceC13300b interfaceC13300b) {
            InterfaceC13300b interfaceC13300b2 = interfaceC13300b;
            m6951a(interfaceC13300b2);
            return interfaceC13300b2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.j0.o.c.p0.i.j$e */
    /* loaded from: classes3.dex */
    public static class C12686e implements InterfaceC11767l<InterfaceC13300b, Boolean> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13312e f28544c;

        C12686e(InterfaceC13312e interfaceC13312e) {
            this.f28544c = interfaceC13312e;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public Boolean invoke(InterfaceC13300b interfaceC13300b) {
            return Boolean.valueOf(!C13530t.m4728g(interfaceC13300b.mo4659i()) && C13530t.m4727h(interfaceC13300b, this.f28544c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.j0.o.c.p0.i.j$f */
    /* loaded from: classes3.dex */
    public static class C12687f implements InterfaceC11767l<InterfaceC13300b, InterfaceC13293a> {
        C12687f() {
        }

        /* renamed from: a */
        public InterfaceC13293a m6949a(InterfaceC13300b interfaceC13300b) {
            return interfaceC13300b;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ InterfaceC13293a invoke(InterfaceC13300b interfaceC13300b) {
            InterfaceC13300b interfaceC13300b2 = interfaceC13300b;
            m6949a(interfaceC13300b2);
            return interfaceC13300b2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.j0.o.c.p0.i.j$g */
    /* loaded from: classes3.dex */
    public static class C12688g implements InterfaceC11767l<InterfaceC13300b, C13666w> {

        /* renamed from: c */
        final /* synthetic */ AbstractC12680i f28545c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC13300b f28546d;

        C12688g(AbstractC12680i abstractC12680i, InterfaceC13300b interfaceC13300b) {
            this.f28545c = abstractC12680i;
            this.f28546d = interfaceC13300b;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public C13666w invoke(InterfaceC13300b interfaceC13300b) {
            this.f28545c.mo6996b(this.f28546d, interfaceC13300b);
            return C13666w.f30112a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.j0.o.c.p0.i.j$h */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C12689h {

        /* renamed from: a */
        static final /* synthetic */ int[] f28547a;

        /* renamed from: b */
        static final /* synthetic */ int[] f28548b;

        /* renamed from: c */
        static final /* synthetic */ int[] f28549c;

        static {
            int[] iArr = new int[EnumC13560z.values().length];
            f28549c = iArr;
            try {
                iArr[EnumC13560z.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28549c[EnumC13560z.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28549c[EnumC13560z.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28549c[EnumC13560z.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C12690i.EnumC12691a.values().length];
            f28548b = iArr2;
            try {
                iArr2[C12690i.EnumC12691a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28548b[C12690i.EnumC12691a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28548b[C12690i.EnumC12691a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[InterfaceC12674e.EnumC12676b.values().length];
            f28547a = iArr3;
            try {
                iArr3[InterfaceC12674e.EnumC12676b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28547a[InterfaceC12674e.EnumC12676b.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28547a[InterfaceC12674e.EnumC12676b.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28547a[InterfaceC12674e.EnumC12676b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.j0.o.c.p0.i.j$i */
    /* loaded from: classes3.dex */
    public static class C12690i {

        /* renamed from: b */
        private static final C12690i f28550b = new C12690i(EnumC12691a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a */
        private final EnumC12691a f28551a;

        /* compiled from: OverridingUtil.java */
        /* renamed from: kotlin.j0.o.c.p0.i.j$i$a */
        /* loaded from: classes3.dex */
        public enum EnumC12691a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public C12690i(EnumC12691a enumC12691a, String str) {
            if (enumC12691a == null) {
                m6947a(3);
                throw null;
            } else if (str != null) {
                this.f28551a = enumC12691a;
            } else {
                m6947a(4);
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void m6947a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = 2
                goto L1c
            L1b:
                r5 = 3
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p523i.C12681j.C12690i.m6947a(int):void");
        }

        /* renamed from: b */
        public static C12690i m6946b(String str) {
            if (str != null) {
                return new C12690i(EnumC12691a.CONFLICT, str);
            }
            m6947a(2);
            throw null;
        }

        /* renamed from: d */
        public static C12690i m6944d(String str) {
            if (str != null) {
                return new C12690i(EnumC12691a.INCOMPATIBLE, str);
            }
            m6947a(1);
            throw null;
        }

        /* renamed from: e */
        public static C12690i m6943e() {
            C12690i c12690i = f28550b;
            if (c12690i != null) {
                return c12690i;
            }
            m6947a(0);
            throw null;
        }

        /* renamed from: c */
        public EnumC12691a m6945c() {
            EnumC12691a enumC12691a = this.f28551a;
            if (enumC12691a != null) {
                return enumC12691a;
            }
            m6947a(5);
            throw null;
        }
    }

    static {
        List<InterfaceC12674e> m3825B0;
        m3825B0 = C13742z.m3825B0(ServiceLoader.load(InterfaceC12674e.class, InterfaceC12674e.class.getClassLoader()));
        f28538c = m3825B0;
        C12682a c12682a = new C12682a();
        f28540e = c12682a;
        f28539d = new C12681j(c12682a, AbstractC13026h.C13027a.f29109a);
    }

    private C12681j(InterfaceC13022f.InterfaceC13023a interfaceC13023a, AbstractC13026h abstractC13026h) {
        if (interfaceC13023a == null) {
            m6980a(4);
            throw null;
        } else if (abstractC13026h != null) {
            this.f28542b = interfaceC13023a;
            this.f28541a = abstractC13026h;
        } else {
            m6980a(5);
            throw null;
        }
    }

    /* renamed from: A */
    public static Set<InterfaceC13300b> m6993A(InterfaceC13300b interfaceC13300b) {
        if (interfaceC13300b != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m6975f(interfaceC13300b, linkedHashSet);
            return linkedHashSet;
        }
        m6980a(13);
        throw null;
    }

    /* renamed from: B */
    private static boolean m6992B(InterfaceC13516n0 interfaceC13516n0, InterfaceC13516n0 interfaceC13516n02) {
        if (interfaceC13516n0 == null || interfaceC13516n02 == null) {
            return true;
        }
        return m6985I(interfaceC13516n0, interfaceC13516n02);
    }

    /* renamed from: C */
    public static boolean m6991C(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2) {
        if (interfaceC13293a == null) {
            m6980a(67);
            throw null;
        } else if (interfaceC13293a2 != null) {
            AbstractC12965b0 mo4943j = interfaceC13293a.mo4943j();
            AbstractC12965b0 mo4943j2 = interfaceC13293a2.mo4943j();
            if (m6985I(interfaceC13293a, interfaceC13293a2)) {
                C13287o<C13038n, C13014a> m6969l = f28539d.m6969l(interfaceC13293a.mo4942l(), interfaceC13293a2.mo4942l());
                if (interfaceC13293a instanceof InterfaceC13554x) {
                    return m6986H(interfaceC13293a, mo4943j, interfaceC13293a2, mo4943j2, m6969l);
                }
                if (interfaceC13293a instanceof InterfaceC13518o0) {
                    InterfaceC13518o0 interfaceC13518o0 = (InterfaceC13518o0) interfaceC13293a;
                    InterfaceC13518o0 interfaceC13518o02 = (InterfaceC13518o0) interfaceC13293a2;
                    if (m6992B(interfaceC13518o0.mo4748i0(), interfaceC13518o02.mo4748i0())) {
                        if (interfaceC13518o0.mo5093t0() && interfaceC13518o02.mo5093t0()) {
                            return m6969l.m5364c().m6070e(m6969l.m5363d(), mo4943j.mo6202Z0(), mo4943j2.mo6202Z0());
                        }
                        return (interfaceC13518o0.mo5093t0() || !interfaceC13518o02.mo5093t0()) && m6986H(interfaceC13293a, mo4943j, interfaceC13293a2, mo4943j2, m6969l);
                    }
                    return false;
                }
                throw new IllegalArgumentException("Unexpected callable: " + interfaceC13293a.getClass());
            }
            return false;
        } else {
            m6980a(68);
            throw null;
        }
    }

    /* renamed from: D */
    private static boolean m6990D(InterfaceC13293a interfaceC13293a, Collection<InterfaceC13293a> collection) {
        if (interfaceC13293a == null) {
            m6980a(71);
            throw null;
        } else if (collection != null) {
            for (InterfaceC13293a interfaceC13293a2 : collection) {
                if (!m6991C(interfaceC13293a, interfaceC13293a2)) {
                    return false;
                }
            }
            return true;
        } else {
            m6980a(72);
            throw null;
        }
    }

    /* renamed from: H */
    private static boolean m6986H(InterfaceC13293a interfaceC13293a, AbstractC12965b0 abstractC12965b0, InterfaceC13293a interfaceC13293a2, AbstractC12965b0 abstractC12965b02, C13287o<C13038n, C13014a> c13287o) {
        if (interfaceC13293a == null) {
            m6980a(73);
            throw null;
        } else if (abstractC12965b0 == null) {
            m6980a(74);
            throw null;
        } else if (interfaceC13293a2 == null) {
            m6980a(75);
            throw null;
        } else if (abstractC12965b02 == null) {
            m6980a(76);
            throw null;
        } else if (c13287o != null) {
            return c13287o.m5364c().m6068g(c13287o.m5363d(), abstractC12965b0.mo6202Z0(), abstractC12965b02.mo6202Z0());
        } else {
            m6980a(77);
            throw null;
        }
    }

    /* renamed from: I */
    private static boolean m6985I(InterfaceC13521q interfaceC13521q, InterfaceC13521q interfaceC13521q2) {
        if (interfaceC13521q == null) {
            m6980a(69);
            throw null;
        } else if (interfaceC13521q2 != null) {
            Integer m4731d = C13530t.m4731d(interfaceC13521q.mo4659i(), interfaceC13521q2.mo4659i());
            return m4731d == null || m4731d.intValue() >= 0;
        } else {
            m6980a(70);
            throw null;
        }
    }

    /* renamed from: J */
    public static boolean m6984J(InterfaceC13558y interfaceC13558y, InterfaceC13558y interfaceC13558y2) {
        if (interfaceC13558y == null) {
            m6980a(57);
            throw null;
        } else if (interfaceC13558y2 != null) {
            return !C13530t.m4728g(interfaceC13558y2.mo4659i()) && C13530t.m4727h(interfaceC13558y2, interfaceC13558y);
        } else {
            m6980a(58);
            throw null;
        }
    }

    /* renamed from: K */
    public static <D extends InterfaceC13293a> boolean m6983K(D d, D d2, boolean z, boolean z2) {
        if (d == null) {
            m6980a(11);
            throw null;
        } else if (d2 != null) {
            if (d.equals(d2) || !C12666b.f28520a.m7072d(d.mo4651a(), d2.mo4651a(), z, z2)) {
                InterfaceC13293a mo4651a = d2.mo4651a();
                for (InterfaceC13293a interfaceC13293a : C12673d.m7031d(d)) {
                    if (C12666b.f28520a.m7072d(mo4651a, interfaceC13293a, z, z2)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        } else {
            m6980a(12);
            throw null;
        }
    }

    /* renamed from: L */
    public static void m6982L(InterfaceC13300b interfaceC13300b, InterfaceC11767l<InterfaceC13300b, C13666w> interfaceC11767l) {
        AbstractC13544u abstractC13544u;
        if (interfaceC13300b != null) {
            for (InterfaceC13300b interfaceC13300b2 : interfaceC13300b.mo4685g()) {
                if (interfaceC13300b2.mo4659i() == C13530t.f29894g) {
                    m6982L(interfaceC13300b2, interfaceC11767l);
                }
            }
            if (interfaceC13300b.mo4659i() != C13530t.f29894g) {
                return;
            }
            AbstractC13544u m6973h = m6973h(interfaceC13300b);
            if (m6973h == null) {
                if (interfaceC11767l != null) {
                    interfaceC11767l.invoke(interfaceC13300b);
                }
                abstractC13544u = C13530t.f29892e;
            } else {
                abstractC13544u = m6973h;
            }
            if (interfaceC13300b instanceof C13384c0) {
                ((C13384c0) interfaceC13300b).m5250l1(abstractC13544u);
                for (InterfaceC13516n0 interfaceC13516n0 : ((InterfaceC13518o0) interfaceC13300b).mo4749C()) {
                    m6982L(interfaceC13516n0, m6973h == null ? null : interfaceC11767l);
                }
                return;
            } else if (interfaceC13300b instanceof AbstractC13426p) {
                ((AbstractC13426p) interfaceC13300b).m5058u1(abstractC13544u);
                return;
            } else {
                AbstractC13382b0 abstractC13382b0 = (AbstractC13382b0) interfaceC13300b;
                abstractC13382b0.m5270Z0(abstractC13544u);
                if (abstractC13544u != abstractC13382b0.mo4765J0().mo4659i()) {
                    abstractC13382b0.m5272X0(false);
                    return;
                }
                return;
            }
        }
        m6980a(107);
        throw null;
    }

    /* renamed from: M */
    public static <H> H m6981M(Collection<H> collection, InterfaceC11767l<H, InterfaceC13293a> interfaceC11767l) {
        List m3792f0;
        H h;
        if (collection == null) {
            m6980a(78);
            throw null;
        } else if (interfaceC11767l != null) {
            if (collection.size() == 1) {
                H h2 = (H) C13722p.m3955Q(collection);
                if (h2 != null) {
                    return h2;
                }
                m6980a(80);
                throw null;
            }
            ArrayList arrayList = new ArrayList(2);
            m3792f0 = C13742z.m3792f0(collection, interfaceC11767l);
            H h3 = (H) C13722p.m3955Q(collection);
            InterfaceC13293a invoke = interfaceC11767l.invoke(h3);
            for (H h4 : collection) {
                InterfaceC13293a invoke2 = interfaceC11767l.invoke(h4);
                if (m6990D(invoke2, m3792f0)) {
                    arrayList.add(h4);
                }
                if (m6991C(invoke2, invoke) && !m6991C(invoke, invoke2)) {
                    h3 = h4;
                }
            }
            if (arrayList.isEmpty()) {
                if (h3 != null) {
                    return h3;
                }
                m6980a(81);
                throw null;
            } else if (arrayList.size() == 1) {
                H h5 = (H) C13722p.m3955Q(arrayList);
                if (h5 != null) {
                    return h5;
                }
                m6980a(82);
                throw null;
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        h = null;
                        break;
                    }
                    h = (H) it.next();
                    if (!C13136y.m5754b(interfaceC11767l.invoke(h).mo4943j())) {
                        break;
                    }
                }
                if (h != null) {
                    if (h != null) {
                        return h;
                    }
                    m6980a(83);
                    throw null;
                }
                H h6 = (H) C13722p.m3955Q(arrayList);
                if (h6 != null) {
                    return h6;
                }
                m6980a(84);
                throw null;
            }
        } else {
            m6980a(79);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0163 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m6980a(int r24) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p523i.C12681j.m6980a(int):void");
    }

    /* renamed from: b */
    private static boolean m6979b(Collection<InterfaceC13300b> collection) {
        boolean m3820G;
        if (collection != null) {
            if (collection.size() < 2) {
                return true;
            }
            m3820G = C13742z.m3820G(collection, new C12684c(collection.iterator().next().mo4687d()));
            return m3820G;
        }
        m6980a(63);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        r1.remove();
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m6978c(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0 r5, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0 r6, kotlin.C13287o<kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13038n, kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13014a> r7) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L59
            if (r6 == 0) goto L53
            if (r7 == 0) goto L4d
            java.util.List r5 = r5.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r6 = r6.getUpperBounds()
            r0.<init>(r6)
            int r6 = r5.size()
            int r1 = r0.size()
            r2 = 0
            if (r6 == r1) goto L20
            return r2
        L20:
            java.util.Iterator r5 = r5.iterator()
        L24:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r5.next()
            kotlin.j0.o.c.p0.l.b0 r6 = (kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0) r6
            java.util.ListIterator r1 = r0.listIterator()
        L34:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r1.next()
            kotlin.j0.o.c.p0.l.b0 r3 = (kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0) r3
            boolean r3 = r4.m6977d(r6, r3, r7)
            if (r3 == 0) goto L34
            r1.remove()
            goto L24
        L4a:
            return r2
        L4b:
            r5 = 1
            return r5
        L4d:
            r5 = 51
            m6980a(r5)
            throw r0
        L53:
            r5 = 50
            m6980a(r5)
            throw r0
        L59:
            r5 = 49
            m6980a(r5)
            goto L60
        L5f:
            throw r0
        L60:
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p523i.C12681j.m6978c(kotlin.reflect.jvm.internal.impl.descriptors.z0, kotlin.reflect.jvm.internal.impl.descriptors.z0, kotlin.o):boolean");
    }

    /* renamed from: d */
    private boolean m6977d(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02, C13287o<C13038n, C13014a> c13287o) {
        if (abstractC12965b0 == null) {
            m6980a(46);
            throw null;
        } else if (abstractC12965b02 == null) {
            m6980a(47);
            throw null;
        } else if (c13287o != null) {
            if (C12977d0.m6274a(abstractC12965b0) && C12977d0.m6274a(abstractC12965b02)) {
                return true;
            }
            return c13287o.m5364c().m6070e(c13287o.m5363d(), abstractC12965b0.mo6202Z0(), abstractC12965b02.mo6202Z0());
        } else {
            m6980a(48);
            throw null;
        }
    }

    /* renamed from: e */
    private static C12690i m6976e(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2) {
        if ((interfaceC13293a.mo5056w0() == null) != (interfaceC13293a2.mo5056w0() == null)) {
            return C12690i.m6944d("Receiver presence mismatch");
        }
        if (interfaceC13293a.mo5072k().size() != interfaceC13293a2.mo5072k().size()) {
            return C12690i.m6944d("Value parameter number mismatch");
        }
        return null;
    }

    /* renamed from: f */
    private static void m6975f(InterfaceC13300b interfaceC13300b, Set<InterfaceC13300b> set) {
        if (interfaceC13300b == null) {
            m6980a(15);
            throw null;
        } else if (set != null) {
            if (interfaceC13300b.mo5057w().m5347a()) {
                set.add(interfaceC13300b);
            } else if (!interfaceC13300b.mo4685g().isEmpty()) {
                for (InterfaceC13300b interfaceC13300b2 : interfaceC13300b.mo4685g()) {
                    m6975f(interfaceC13300b2, set);
                }
            } else {
                throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC13300b);
            }
        } else {
            m6980a(16);
            throw null;
        }
    }

    /* renamed from: g */
    private static List<AbstractC12965b0> m6974g(InterfaceC13293a interfaceC13293a) {
        InterfaceC13524r0 mo5056w0 = interfaceC13293a.mo5056w0();
        ArrayList arrayList = new ArrayList();
        if (mo5056w0 != null) {
            arrayList.add(mo5056w0.mo5121c());
        }
        for (InterfaceC13307c1 interfaceC13307c1 : interfaceC13293a.mo5072k()) {
            arrayList.add(interfaceC13307c1.mo5121c());
        }
        return arrayList;
    }

    /* renamed from: h */
    private static AbstractC13544u m6973h(InterfaceC13300b interfaceC13300b) {
        if (interfaceC13300b != null) {
            Collection<? extends InterfaceC13300b> mo4685g = interfaceC13300b.mo4685g();
            AbstractC13544u m6959v = m6959v(mo4685g);
            if (m6959v == null) {
                return null;
            }
            if (interfaceC13300b.mo5057w() == InterfaceC13300b.EnumC13301a.FAKE_OVERRIDE) {
                for (InterfaceC13300b interfaceC13300b2 : mo4685g) {
                    if (interfaceC13300b2.mo4658o() != EnumC13560z.ABSTRACT && !interfaceC13300b2.mo4659i().equals(m6959v)) {
                        return null;
                    }
                }
                return m6959v;
            }
            return m6959v.mo4707f();
        }
        m6980a(108);
        throw null;
    }

    /* renamed from: i */
    public static C12681j m6972i(AbstractC13026h abstractC13026h, InterfaceC13022f.InterfaceC13023a interfaceC13023a) {
        if (abstractC13026h == null) {
            m6980a(2);
            throw null;
        } else if (interfaceC13023a != null) {
            return new C12681j(interfaceC13023a, abstractC13026h);
        } else {
            m6980a(3);
            throw null;
        }
    }

    /* renamed from: j */
    private static void m6971j(Collection<InterfaceC13300b> collection, InterfaceC13312e interfaceC13312e, AbstractC12680i abstractC12680i) {
        if (collection == null) {
            m6980a(85);
            throw null;
        } else if (interfaceC13312e == null) {
            m6980a(86);
            throw null;
        } else if (abstractC12680i != null) {
            Collection<InterfaceC13300b> m6960u = m6960u(interfaceC13312e, collection);
            boolean isEmpty = m6960u.isEmpty();
            if (!isEmpty) {
                collection = m6960u;
            }
            InterfaceC13300b mo5059u0 = ((InterfaceC13300b) m6981M(collection, new C12685d())).mo5059u0(interfaceC13312e, m6966o(collection, interfaceC13312e), isEmpty ? C13530t.f29895h : C13530t.f29894g, InterfaceC13300b.EnumC13301a.FAKE_OVERRIDE, false);
            abstractC12680i.mo6994d(mo5059u0, collection);
            abstractC12680i.mo5099a(mo5059u0);
        } else {
            m6980a(87);
            throw null;
        }
    }

    /* renamed from: k */
    private static void m6970k(InterfaceC13312e interfaceC13312e, Collection<InterfaceC13300b> collection, AbstractC12680i abstractC12680i) {
        if (interfaceC13312e == null) {
            m6980a(64);
            throw null;
        } else if (collection == null) {
            m6980a(65);
            throw null;
        } else if (abstractC12680i != null) {
            if (m6979b(collection)) {
                for (InterfaceC13300b interfaceC13300b : collection) {
                    m6971j(Collections.singleton(interfaceC13300b), interfaceC13312e, abstractC12680i);
                }
                return;
            }
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                m6971j(m6963r(C12698p.m6937a(linkedList), linkedList, abstractC12680i), interfaceC13312e, abstractC12680i);
            }
        } else {
            m6980a(66);
            throw null;
        }
    }

    /* renamed from: l */
    private C13287o<C13038n, C13014a> m6969l(List<InterfaceC13562z0> list, List<InterfaceC13562z0> list2) {
        if (list == null) {
            m6980a(40);
            throw null;
        } else if (list2 != null) {
            return new C13287o<>(new C13038n(this.f28541a, AbstractC13024g.C13025a.f29108a), m6968m(list, list2));
        } else {
            m6980a(41);
            throw null;
        }
    }

    /* renamed from: m */
    private C13014a m6968m(List<InterfaceC13562z0> list, List<InterfaceC13562z0> list2) {
        if (list == null) {
            m6980a(42);
            throw null;
        } else if (list2 != null) {
            if (list.isEmpty()) {
                C13014a c13014a = (C13014a) new C12692k(null, this.f28542b, this.f28541a).m6941w0(true, true);
                if (c13014a != null) {
                    return c13014a;
                }
                m6980a(44);
                throw null;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                hashMap.put(list.get(i).mo4649n(), list2.get(i).mo4649n());
            }
            C13014a c13014a2 = (C13014a) new C12692k(hashMap, this.f28542b, this.f28541a).m6941w0(true, true);
            if (c13014a2 != null) {
                return c13014a2;
            }
            m6980a(45);
            throw null;
        } else {
            m6980a(43);
            throw null;
        }
    }

    /* renamed from: n */
    public static C12681j m6967n(AbstractC13026h abstractC13026h) {
        if (abstractC13026h != null) {
            return new C12681j(f28540e, abstractC13026h);
        }
        m6980a(1);
        throw null;
    }

    /* renamed from: o */
    private static EnumC13560z m6966o(Collection<InterfaceC13300b> collection, InterfaceC13312e interfaceC13312e) {
        if (collection == null) {
            m6980a(88);
            throw null;
        } else if (interfaceC13312e != null) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (InterfaceC13300b interfaceC13300b : collection) {
                int i = C12689h.f28549c[interfaceC13300b.mo4658o().ordinal()];
                if (i == 1) {
                    EnumC13560z enumC13560z = EnumC13560z.FINAL;
                    if (enumC13560z != null) {
                        return enumC13560z;
                    }
                    m6980a(90);
                    throw null;
                } else if (i == 2) {
                    throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC13300b);
                } else if (i == 3) {
                    z2 = true;
                } else if (i == 4) {
                    z3 = true;
                }
            }
            if (interfaceC13312e.mo4660T() && interfaceC13312e.mo4658o() != EnumC13560z.ABSTRACT && interfaceC13312e.mo4658o() != EnumC13560z.SEALED) {
                z = true;
            }
            if (z2 && !z3) {
                EnumC13560z enumC13560z2 = EnumC13560z.OPEN;
                if (enumC13560z2 != null) {
                    return enumC13560z2;
                }
                m6980a(91);
                throw null;
            } else if (!z2 && z3) {
                EnumC13560z mo4658o = z ? interfaceC13312e.mo4658o() : EnumC13560z.ABSTRACT;
                if (mo4658o != null) {
                    return mo4658o;
                }
                m6980a(92);
                throw null;
            } else {
                HashSet hashSet = new HashSet();
                for (InterfaceC13300b interfaceC13300b2 : collection) {
                    hashSet.addAll(m6993A(interfaceC13300b2));
                }
                return m6955z(m6962s(hashSet), z, interfaceC13312e.mo4658o());
            }
        } else {
            m6980a(89);
            throw null;
        }
    }

    /* renamed from: p */
    private Collection<InterfaceC13300b> m6965p(InterfaceC13300b interfaceC13300b, Collection<? extends InterfaceC13300b> collection, InterfaceC13312e interfaceC13312e, AbstractC12680i abstractC12680i) {
        if (interfaceC13300b == null) {
            m6980a(59);
            throw null;
        } else if (collection == null) {
            m6980a(60);
            throw null;
        } else if (interfaceC13312e == null) {
            m6980a(61);
            throw null;
        } else if (abstractC12680i != null) {
            ArrayList arrayList = new ArrayList(collection.size());
            C13658h m4240d = C13658h.m4240d();
            for (InterfaceC13300b interfaceC13300b2 : collection) {
                C12690i.EnumC12691a m6945c = m6989E(interfaceC13300b2, interfaceC13300b, interfaceC13312e).m6945c();
                boolean m6984J = m6984J(interfaceC13300b, interfaceC13300b2);
                int i = C12689h.f28548b[m6945c.ordinal()];
                if (i == 1) {
                    if (m6984J) {
                        m4240d.add(interfaceC13300b2);
                    }
                    arrayList.add(interfaceC13300b2);
                } else if (i == 2) {
                    if (m6984J) {
                        abstractC12680i.mo6995c(interfaceC13300b2, interfaceC13300b);
                    }
                    arrayList.add(interfaceC13300b2);
                }
            }
            abstractC12680i.mo6994d(interfaceC13300b, m4240d);
            return arrayList;
        } else {
            m6980a(62);
            throw null;
        }
    }

    /* renamed from: q */
    public static <H> Collection<H> m6964q(H h, Collection<H> collection, InterfaceC11767l<H, InterfaceC13293a> interfaceC11767l, InterfaceC11767l<H, C13666w> interfaceC11767l2) {
        if (h == null) {
            m6980a(99);
            throw null;
        } else if (collection == null) {
            m6980a(100);
            throw null;
        } else if (interfaceC11767l == null) {
            m6980a(101);
            throw null;
        } else if (interfaceC11767l2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(h);
            InterfaceC13293a invoke = interfaceC11767l.invoke(h);
            Iterator<H> it = collection.iterator();
            while (it.hasNext()) {
                H next = it.next();
                InterfaceC13293a invoke2 = interfaceC11767l.invoke(next);
                if (h == next) {
                    it.remove();
                } else {
                    C12690i.EnumC12691a m6956y = m6956y(invoke, invoke2);
                    if (m6956y == C12690i.EnumC12691a.OVERRIDABLE) {
                        arrayList.add(next);
                        it.remove();
                    } else if (m6956y == C12690i.EnumC12691a.CONFLICT) {
                        interfaceC11767l2.invoke(next);
                        it.remove();
                    }
                }
            }
            return arrayList;
        } else {
            m6980a(102);
            throw null;
        }
    }

    /* renamed from: r */
    private static Collection<InterfaceC13300b> m6963r(InterfaceC13300b interfaceC13300b, Queue<InterfaceC13300b> queue, AbstractC12680i abstractC12680i) {
        if (interfaceC13300b == null) {
            m6980a(104);
            throw null;
        } else if (queue == null) {
            m6980a(105);
            throw null;
        } else if (abstractC12680i != null) {
            return m6964q(interfaceC13300b, queue, new C12687f(), new C12688g(abstractC12680i, interfaceC13300b));
        } else {
            m6980a(106);
            throw null;
        }
    }

    /* renamed from: s */
    public static <D extends InterfaceC13293a> Set<D> m6962s(Set<D> set) {
        if (set != null) {
            return m6961t(set, !set.isEmpty() && C12747a.m6853q(C12747a.m6858l(set.iterator().next())), null, new C12683b());
        }
        m6980a(6);
        throw null;
    }

    /* renamed from: t */
    public static <D> Set<D> m6961t(Set<D> set, boolean z, InterfaceC11756a<?> interfaceC11756a, InterfaceC11771p<? super D, ? super D, C13287o<InterfaceC13293a, InterfaceC13293a>> interfaceC11771p) {
        if (set == null) {
            m6980a(7);
            throw null;
        } else if (interfaceC11771p != null) {
            if (set.size() <= 1) {
                if (set != null) {
                    return set;
                }
                m6980a(9);
                throw null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (interfaceC11756a != null) {
                    interfaceC11756a.invoke();
                }
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C13287o<InterfaceC13293a, InterfaceC13293a> invoke = interfaceC11771p.invoke(obj, (Object) it.next());
                        InterfaceC13293a m5366a = invoke.m5366a();
                        InterfaceC13293a m5365b = invoke.m5365b();
                        if (m6983K(m5366a, m5365b, z, true)) {
                            it.remove();
                        } else if (m6983K(m5365b, m5366a, z, true)) {
                            break;
                        }
                    } else {
                        linkedHashSet.add(obj);
                        break;
                    }
                }
            }
            return linkedHashSet;
        } else {
            m6980a(8);
            throw null;
        }
    }

    /* renamed from: u */
    private static Collection<InterfaceC13300b> m6960u(InterfaceC13312e interfaceC13312e, Collection<InterfaceC13300b> collection) {
        List m3810N;
        if (interfaceC13312e == null) {
            m6980a(96);
            throw null;
        } else if (collection != null) {
            m3810N = C13742z.m3810N(collection, new C12686e(interfaceC13312e));
            if (m3810N != null) {
                return m3810N;
            }
            m6980a(98);
            throw null;
        } else {
            m6980a(97);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u m6959v(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b> r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L58
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.descriptors.u r5 = kotlin.reflect.jvm.internal.impl.descriptors.C13530t.f29897j
            return r5
        Lc:
            java.util.Iterator r1 = r5.iterator()
        L10:
            r2 = r0
        L11:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.b r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b) r3
            kotlin.reflect.jvm.internal.impl.descriptors.u r3 = r3.mo4659i()
            if (r2 != 0) goto L25
        L23:
            r2 = r3
            goto L11
        L25:
            java.lang.Integer r4 = kotlin.reflect.jvm.internal.impl.descriptors.C13530t.m4731d(r3, r2)
            if (r4 != 0) goto L2c
            goto L10
        L2c:
            int r4 = r4.intValue()
            if (r4 <= 0) goto L11
            goto L23
        L33:
            if (r2 != 0) goto L36
            return r0
        L36:
            java.util.Iterator r5 = r5.iterator()
        L3a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.b r1 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b) r1
            kotlin.reflect.jvm.internal.impl.descriptors.u r1 = r1.mo4659i()
            java.lang.Integer r1 = kotlin.reflect.jvm.internal.impl.descriptors.C13530t.m4731d(r2, r1)
            if (r1 == 0) goto L56
            int r1 = r1.intValue()
            if (r1 >= 0) goto L3a
        L56:
            return r0
        L57:
            return r2
        L58:
            r5 = 109(0x6d, float:1.53E-43)
            m6980a(r5)
            goto L5f
        L5e:
            throw r0
        L5f:
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p523i.C12681j.m6959v(java.util.Collection):kotlin.reflect.jvm.internal.impl.descriptors.u");
    }

    /* renamed from: x */
    public static C12690i m6957x(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2) {
        boolean z;
        if (interfaceC13293a == null) {
            m6980a(38);
            throw null;
        } else if (interfaceC13293a2 != null) {
            boolean z2 = interfaceC13293a instanceof InterfaceC13554x;
            if ((!z2 || (interfaceC13293a2 instanceof InterfaceC13554x)) && (!((z = interfaceC13293a instanceof InterfaceC13518o0)) || (interfaceC13293a2 instanceof InterfaceC13518o0))) {
                if (!z2 && !z) {
                    throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC13293a);
                } else if (!interfaceC13293a.mo5012b().equals(interfaceC13293a2.mo5012b())) {
                    return C12690i.m6944d("Name mismatch");
                } else {
                    C12690i m6976e = m6976e(interfaceC13293a, interfaceC13293a2);
                    if (m6976e != null) {
                        return m6976e;
                    }
                    return null;
                }
            }
            return C12690i.m6944d("Member kind mismatch");
        } else {
            m6980a(39);
            throw null;
        }
    }

    /* renamed from: y */
    public static C12690i.EnumC12691a m6956y(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2) {
        C12690i.EnumC12691a m6945c = f28539d.m6989E(interfaceC13293a2, interfaceC13293a, null).m6945c();
        C12690i.EnumC12691a m6945c2 = f28539d.m6989E(interfaceC13293a, interfaceC13293a2, null).m6945c();
        C12690i.EnumC12691a enumC12691a = C12690i.EnumC12691a.OVERRIDABLE;
        if (m6945c == enumC12691a && m6945c2 == enumC12691a) {
            return enumC12691a;
        }
        C12690i.EnumC12691a enumC12691a2 = C12690i.EnumC12691a.CONFLICT;
        return (m6945c == enumC12691a2 || m6945c2 == enumC12691a2) ? C12690i.EnumC12691a.CONFLICT : C12690i.EnumC12691a.INCOMPATIBLE;
    }

    /* renamed from: z */
    private static EnumC13560z m6955z(Collection<InterfaceC13300b> collection, boolean z, EnumC13560z enumC13560z) {
        if (collection == null) {
            m6980a(93);
            throw null;
        } else if (enumC13560z != null) {
            EnumC13560z enumC13560z2 = EnumC13560z.ABSTRACT;
            for (InterfaceC13300b interfaceC13300b : collection) {
                EnumC13560z mo4658o = (z && interfaceC13300b.mo4658o() == EnumC13560z.ABSTRACT) ? enumC13560z : interfaceC13300b.mo4658o();
                if (mo4658o.compareTo(enumC13560z2) < 0) {
                    enumC13560z2 = mo4658o;
                }
            }
            if (enumC13560z2 != null) {
                return enumC13560z2;
            }
            m6980a(95);
            throw null;
        } else {
            m6980a(94);
            throw null;
        }
    }

    /* renamed from: E */
    public C12690i m6989E(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2, InterfaceC13312e interfaceC13312e) {
        if (interfaceC13293a == null) {
            m6980a(17);
            throw null;
        } else if (interfaceC13293a2 != null) {
            C12690i m6988F = m6988F(interfaceC13293a, interfaceC13293a2, interfaceC13312e, false);
            if (m6988F != null) {
                return m6988F;
            }
            m6980a(19);
            throw null;
        } else {
            m6980a(18);
            throw null;
        }
    }

    /* renamed from: F */
    public C12690i m6988F(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2, InterfaceC13312e interfaceC13312e, boolean z) {
        if (interfaceC13293a == null) {
            m6980a(20);
            throw null;
        } else if (interfaceC13293a2 != null) {
            C12690i m6987G = m6987G(interfaceC13293a, interfaceC13293a2, z);
            boolean z2 = m6987G.m6945c() == C12690i.EnumC12691a.OVERRIDABLE;
            for (InterfaceC12674e interfaceC12674e : f28538c) {
                if (interfaceC12674e.mo7008a() != InterfaceC12674e.EnumC12675a.CONFLICTS_ONLY && (!z2 || interfaceC12674e.mo7008a() != InterfaceC12674e.EnumC12675a.SUCCESS_ONLY)) {
                    int i = C12689h.f28547a[interfaceC12674e.mo7007b(interfaceC13293a, interfaceC13293a2, interfaceC13312e).ordinal()];
                    if (i == 1) {
                        z2 = true;
                    } else if (i == 2) {
                        C12690i m6946b = C12690i.m6946b("External condition failed");
                        if (m6946b != null) {
                            return m6946b;
                        }
                        m6980a(22);
                        throw null;
                    } else if (i == 3) {
                        C12690i m6944d = C12690i.m6944d("External condition");
                        if (m6944d != null) {
                            return m6944d;
                        }
                        m6980a(23);
                        throw null;
                    }
                }
            }
            if (!z2) {
                if (m6987G != null) {
                    return m6987G;
                }
                m6980a(24);
                throw null;
            }
            for (InterfaceC12674e interfaceC12674e2 : f28538c) {
                if (interfaceC12674e2.mo7008a() == InterfaceC12674e.EnumC12675a.CONFLICTS_ONLY) {
                    int i2 = C12689h.f28547a[interfaceC12674e2.mo7007b(interfaceC13293a, interfaceC13293a2, interfaceC13312e).ordinal()];
                    if (i2 == 1) {
                        throw new IllegalStateException("Contract violation in " + interfaceC12674e2.getClass().getName() + " condition. It's not supposed to end with success");
                    } else if (i2 == 2) {
                        C12690i m6946b2 = C12690i.m6946b("External condition failed");
                        if (m6946b2 != null) {
                            return m6946b2;
                        }
                        m6980a(25);
                        throw null;
                    } else if (i2 == 3) {
                        C12690i m6944d2 = C12690i.m6944d("External condition");
                        if (m6944d2 != null) {
                            return m6944d2;
                        }
                        m6980a(26);
                        throw null;
                    }
                }
            }
            C12690i m6943e = C12690i.m6943e();
            if (m6943e != null) {
                return m6943e;
            }
            m6980a(27);
            throw null;
        } else {
            m6980a(21);
            throw null;
        }
    }

    /* renamed from: G */
    public C12690i m6987G(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2, boolean z) {
        if (interfaceC13293a == null) {
            m6980a(28);
            throw null;
        } else if (interfaceC13293a2 != null) {
            C12690i m6957x = m6957x(interfaceC13293a, interfaceC13293a2);
            if (m6957x != null) {
                if (m6957x != null) {
                    return m6957x;
                }
                m6980a(30);
                throw null;
            }
            List<AbstractC12965b0> m6974g = m6974g(interfaceC13293a);
            List<AbstractC12965b0> m6974g2 = m6974g(interfaceC13293a2);
            List<InterfaceC13562z0> mo4942l = interfaceC13293a.mo4942l();
            List<InterfaceC13562z0> mo4942l2 = interfaceC13293a2.mo4942l();
            int i = 0;
            if (mo4942l.size() != mo4942l2.size()) {
                while (i < m6974g.size()) {
                    if (!InterfaceC13022f.f29107a.mo6073b(m6974g.get(i), m6974g2.get(i))) {
                        C12690i m6944d = C12690i.m6944d("Type parameter number mismatch");
                        if (m6944d != null) {
                            return m6944d;
                        }
                        m6980a(31);
                        throw null;
                    }
                    i++;
                }
                C12690i m6946b = C12690i.m6946b("Type parameter number mismatch");
                if (m6946b != null) {
                    return m6946b;
                }
                m6980a(32);
                throw null;
            }
            C13287o<C13038n, C13014a> m6969l = m6969l(mo4942l, mo4942l2);
            for (int i2 = 0; i2 < mo4942l.size(); i2++) {
                if (!m6978c(mo4942l.get(i2), mo4942l2.get(i2), m6969l)) {
                    C12690i m6944d2 = C12690i.m6944d("Type parameter bounds mismatch");
                    if (m6944d2 != null) {
                        return m6944d2;
                    }
                    m6980a(33);
                    throw null;
                }
            }
            for (int i3 = 0; i3 < m6974g.size(); i3++) {
                if (!m6977d(m6974g.get(i3), m6974g2.get(i3), m6969l)) {
                    C12690i m6944d3 = C12690i.m6944d("Value parameter type mismatch");
                    if (m6944d3 != null) {
                        return m6944d3;
                    }
                    m6980a(34);
                    throw null;
                }
            }
            if ((interfaceC13293a instanceof InterfaceC13554x) && (interfaceC13293a2 instanceof InterfaceC13554x) && ((InterfaceC13554x) interfaceC13293a).mo4692G0() != ((InterfaceC13554x) interfaceC13293a2).mo4692G0()) {
                C12690i m6946b2 = C12690i.m6946b("Incompatible suspendability");
                if (m6946b2 != null) {
                    return m6946b2;
                }
                m6980a(35);
                throw null;
            }
            if (z) {
                AbstractC12965b0 mo4943j = interfaceC13293a.mo4943j();
                AbstractC12965b0 mo4943j2 = interfaceC13293a2.mo4943j();
                if (mo4943j != null && mo4943j2 != null) {
                    if (C12977d0.m6274a(mo4943j2) && C12977d0.m6274a(mo4943j)) {
                        i = 1;
                    }
                    if (i == 0 && !m6969l.m5364c().m6068g(m6969l.m5363d(), mo4943j2.mo6202Z0(), mo4943j.mo6202Z0())) {
                        C12690i m6946b3 = C12690i.m6946b("Return type mismatch");
                        if (m6946b3 != null) {
                            return m6946b3;
                        }
                        m6980a(36);
                        throw null;
                    }
                }
            }
            C12690i m6943e = C12690i.m6943e();
            if (m6943e != null) {
                return m6943e;
            }
            m6980a(37);
            throw null;
        } else {
            m6980a(29);
            throw null;
        }
    }

    /* renamed from: w */
    public void m6958w(C12614f c12614f, Collection<? extends InterfaceC13300b> collection, Collection<? extends InterfaceC13300b> collection2, InterfaceC13312e interfaceC13312e, AbstractC12680i abstractC12680i) {
        if (c12614f == null) {
            m6980a(52);
            throw null;
        } else if (collection == null) {
            m6980a(53);
            throw null;
        } else if (collection2 == null) {
            m6980a(54);
            throw null;
        } else if (interfaceC13312e == null) {
            m6980a(55);
            throw null;
        } else if (abstractC12680i != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
            for (InterfaceC13300b interfaceC13300b : collection2) {
                linkedHashSet.removeAll(m6965p(interfaceC13300b, collection, interfaceC13312e, abstractC12680i));
            }
            m6970k(interfaceC13312e, linkedHashSet, abstractC12680i);
        } else {
            m6980a(56);
            throw null;
        }
    }
}
