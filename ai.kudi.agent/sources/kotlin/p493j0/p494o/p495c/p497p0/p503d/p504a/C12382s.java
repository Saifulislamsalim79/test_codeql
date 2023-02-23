package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import java.util.List;
import kotlin.C13287o;
import kotlin.C13668y;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12393z;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0.C12153e;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0.InterfaceC12151c;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.AbstractC12434j;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12458t;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.InterfaceC12674e;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.s */
/* loaded from: classes3.dex */
public final class C12382s implements InterfaceC12674e {

    /* renamed from: a */
    public static final C12383a f27464a = new C12383a(null);

    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.s$a */
    /* loaded from: classes3.dex */
    public static final class C12383a {
        private C12383a() {
        }

        public /* synthetic */ C12383a(g gVar) {
            this();
        }

        /* renamed from: b */
        private final boolean m9084b(InterfaceC13554x interfaceC13554x) {
            if (interfaceC13554x.mo5072k().size() != 1) {
                return false;
            }
            InterfaceC13513m mo4687d = interfaceC13554x.mo4687d();
            InterfaceC13312e interfaceC13312e = mo4687d instanceof InterfaceC13312e ? (InterfaceC13312e) mo4687d : null;
            if (interfaceC13312e == null) {
                return false;
            }
            List<InterfaceC13307c1> mo5072k = interfaceC13554x.mo5072k();
            l.e(mo5072k, "f.valueParameters");
            InterfaceC13334h mo5206d = ((InterfaceC13307c1) C13722p.m3918q0(mo5072k)).mo5121c().mo5779W0().mo5206d();
            InterfaceC13312e interfaceC13312e2 = mo5206d instanceof InterfaceC13312e ? (InterfaceC13312e) mo5206d : null;
            return interfaceC13312e2 != null && AbstractC12046h.m9879o0(interfaceC13312e) && l.b(C12747a.m6861i(interfaceC13312e), C12747a.m6861i(interfaceC13312e2));
        }

        /* renamed from: c */
        private final AbstractC12434j m9083c(InterfaceC13554x interfaceC13554x, InterfaceC13307c1 interfaceC13307c1) {
            if (!C12458t.m8855e(interfaceC13554x) && !m9084b(interfaceC13554x)) {
                AbstractC12965b0 mo5121c = interfaceC13307c1.mo5121c();
                l.e(mo5121c, "valueParameterDescriptor.type");
                return C12458t.m8853g(mo5121c);
            }
            AbstractC12965b0 mo5121c2 = interfaceC13307c1.mo5121c();
            l.e(mo5121c2, "valueParameterDescriptor.type");
            return C12458t.m8853g(C13090a.m5891p(mo5121c2));
        }

        /* renamed from: a */
        public final boolean m9085a(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2) {
            List<C13287o> m3815I0;
            l.f(interfaceC13293a, "superDescriptor");
            l.f(interfaceC13293a2, "subDescriptor");
            if ((interfaceC13293a2 instanceof C12153e) && (interfaceC13293a instanceof InterfaceC13554x)) {
                C12153e c12153e = (C12153e) interfaceC13293a2;
                InterfaceC13554x interfaceC13554x = (InterfaceC13554x) interfaceC13293a;
                boolean z = c12153e.mo5072k().size() == interfaceC13554x.mo5072k().size();
                if (C13668y.f30115a && !z) {
                    throw new AssertionError("External overridability condition with CONFLICTS_ONLY should not be run with different value parameters size");
                }
                List<InterfaceC13307c1> mo5072k = c12153e.mo4651a().mo5072k();
                l.e(mo5072k, "subDescriptor.original.valueParameters");
                List<InterfaceC13307c1> mo5072k2 = interfaceC13554x.mo4651a().mo5072k();
                l.e(mo5072k2, "superDescriptor.original.valueParameters");
                m3815I0 = C13742z.m3815I0(mo5072k, mo5072k2);
                for (C13287o c13287o : m3815I0) {
                    InterfaceC13307c1 interfaceC13307c1 = (InterfaceC13307c1) c13287o.m5366a();
                    InterfaceC13307c1 interfaceC13307c12 = (InterfaceC13307c1) c13287o.m5365b();
                    l.e(interfaceC13307c1, "subParameter");
                    boolean z2 = m9083c((InterfaceC13554x) interfaceC13293a2, interfaceC13307c1) instanceof AbstractC12434j.C12438d;
                    l.e(interfaceC13307c12, "superParameter");
                    if (z2 != (m9083c(interfaceC13554x, interfaceC13307c12) instanceof AbstractC12434j.C12438d)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m9086c(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2, InterfaceC13312e interfaceC13312e) {
        if ((interfaceC13293a instanceof InterfaceC13300b) && (interfaceC13293a2 instanceof InterfaceC13554x) && !AbstractC12046h.m9900d0(interfaceC13293a2)) {
            C12262f c12262f = C12262f.f27329m;
            InterfaceC13554x interfaceC13554x = (InterfaceC13554x) interfaceC13293a2;
            C12614f mo5012b = interfaceC13554x.mo5012b();
            l.e(mo5012b, "subDescriptor.name");
            if (!c12262f.m9277l(mo5012b)) {
                C12393z.C12394a c12394a = C12393z.f27500a;
                C12614f mo5012b2 = interfaceC13554x.mo5012b();
                l.e(mo5012b2, "subDescriptor.name");
                if (!c12394a.m9027k(mo5012b2)) {
                    return false;
                }
            }
            InterfaceC13300b m9052e = C12389y.m9052e((InterfaceC13300b) interfaceC13293a);
            Boolean valueOf = Boolean.valueOf(interfaceC13554x.mo4693F0());
            boolean z = interfaceC13293a instanceof InterfaceC13554x;
            InterfaceC13554x interfaceC13554x2 = z ? (InterfaceC13554x) interfaceC13293a : null;
            if ((!l.b(valueOf, interfaceC13554x2 == null ? null : Boolean.valueOf(interfaceC13554x2.mo4693F0()))) && (m9052e == null || !interfaceC13554x.mo4693F0())) {
                return true;
            }
            if ((interfaceC13312e instanceof InterfaceC12151c) && interfaceC13554x.mo4684n0() == null && m9052e != null && !C12389y.m9051f(interfaceC13312e, m9052e)) {
                if ((m9052e instanceof InterfaceC13554x) && z) {
                    C12262f c12262f2 = C12262f.f27329m;
                    if (C12262f.m9278k((InterfaceC13554x) m9052e) != null) {
                        String m8857c = C12458t.m8857c(interfaceC13554x, false, false, 2, null);
                        InterfaceC13554x mo4651a = ((InterfaceC13554x) interfaceC13293a).mo4651a();
                        l.e(mo4651a, "superDescriptor.original");
                        if (l.b(m8857c, C12458t.m8857c(mo4651a, false, false, 2, null))) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.InterfaceC12674e
    /* renamed from: a */
    public InterfaceC12674e.EnumC12675a mo7008a() {
        return InterfaceC12674e.EnumC12675a.CONFLICTS_ONLY;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.InterfaceC12674e
    /* renamed from: b */
    public InterfaceC12674e.EnumC12676b mo7007b(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2, InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC13293a, "superDescriptor");
        l.f(interfaceC13293a2, "subDescriptor");
        if (m9086c(interfaceC13293a, interfaceC13293a2, interfaceC13312e)) {
            return InterfaceC12674e.EnumC12676b.INCOMPATIBLE;
        }
        if (f27464a.m9085a(interfaceC13293a, interfaceC13293a2)) {
            return InterfaceC12674e.EnumC12676b.INCOMPATIBLE;
        }
        return InterfaceC12674e.EnumC12676b.UNKNOWN;
    }
}
