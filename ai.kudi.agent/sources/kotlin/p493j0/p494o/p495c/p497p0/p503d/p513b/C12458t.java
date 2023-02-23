package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q.C12080c;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12262f;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12389y;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.AbstractC12434j;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12610d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.C12756d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.EnumC12757e;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p557z.C13722p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13452l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: methodSignatureMapping.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.t */
/* loaded from: classes3.dex */
public final class C12458t {
    /* renamed from: a */
    private static final void m8859a(StringBuilder sb, AbstractC12965b0 abstractC12965b0) {
        sb.append(m8853g(abstractC12965b0));
    }

    /* renamed from: b */
    public static final String m8858b(InterfaceC13554x interfaceC13554x, boolean z, boolean z2) {
        String m7353b;
        l.f(interfaceC13554x, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (interfaceC13554x instanceof InterfaceC13452l) {
                m7353b = "<init>";
            } else {
                m7353b = interfaceC13554x.mo5012b().m7353b();
                l.e(m7353b, "name.asString()");
            }
            sb.append(m7353b);
        }
        sb.append("(");
        InterfaceC13524r0 mo5056w0 = interfaceC13554x.mo5056w0();
        if (mo5056w0 != null) {
            AbstractC12965b0 mo5121c = mo5056w0.mo5121c();
            l.e(mo5121c, "it.type");
            m8859a(sb, mo5121c);
        }
        for (InterfaceC13307c1 interfaceC13307c1 : interfaceC13554x.mo5072k()) {
            AbstractC12965b0 mo5121c2 = interfaceC13307c1.mo5121c();
            l.e(mo5121c2, "parameter.type");
            m8859a(sb, mo5121c2);
        }
        sb.append(")");
        if (z) {
            if (C12425c.m8947c(interfaceC13554x)) {
                sb.append("V");
            } else {
                AbstractC12965b0 mo4943j = interfaceC13554x.mo4943j();
                l.d(mo4943j);
                m8859a(sb, mo4943j);
            }
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    public static /* synthetic */ String m8857c(InterfaceC13554x interfaceC13554x, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m8858b(interfaceC13554x, z, z2);
    }

    /* renamed from: d */
    public static final String m8856d(InterfaceC13293a interfaceC13293a) {
        l.f(interfaceC13293a, "<this>");
        C12461v c12461v = C12461v.f27635a;
        if (C12673d.m7043E(interfaceC13293a)) {
            return null;
        }
        InterfaceC13513m mo4687d = interfaceC13293a.mo4687d();
        InterfaceC13312e interfaceC13312e = mo4687d instanceof InterfaceC13312e ? (InterfaceC13312e) mo4687d : null;
        if (interfaceC13312e == null || interfaceC13312e.mo5012b().m7348j()) {
            return null;
        }
        InterfaceC13293a mo4651a = interfaceC13293a.mo4651a();
        InterfaceC13543t0 interfaceC13543t0 = mo4651a instanceof InterfaceC13543t0 ? (InterfaceC13543t0) mo4651a : null;
        if (interfaceC13543t0 == null) {
            return null;
        }
        return C12457s.m8860a(c12461v, interfaceC13312e, m8857c(interfaceC13543t0, false, false, 3, null));
    }

    /* renamed from: e */
    public static final boolean m8855e(InterfaceC13293a interfaceC13293a) {
        l.f(interfaceC13293a, "f");
        if (interfaceC13293a instanceof InterfaceC13554x) {
            InterfaceC13554x interfaceC13554x = (InterfaceC13554x) interfaceC13293a;
            if (l.b(interfaceC13554x.mo5012b().m7353b(), "remove") && interfaceC13554x.mo5072k().size() == 1 && !C12389y.m9049h((InterfaceC13300b) interfaceC13293a)) {
                List<InterfaceC13307c1> mo5072k = interfaceC13554x.mo4651a().mo5072k();
                l.e(mo5072k, "f.original.valueParameters");
                AbstractC12965b0 mo5121c = ((InterfaceC13307c1) C13722p.m3918q0(mo5072k)).mo5121c();
                l.e(mo5121c, "f.original.valueParameters.single().type");
                AbstractC12434j m8853g = m8853g(mo5121c);
                AbstractC12434j.C12438d c12438d = m8853g instanceof AbstractC12434j.C12438d ? (AbstractC12434j.C12438d) m8853g : null;
                if ((c12438d != null ? c12438d.m8901i() : null) != EnumC12757e.INT) {
                    return false;
                }
                C12262f c12262f = C12262f.f27329m;
                InterfaceC13554x m9278k = C12262f.m9278k(interfaceC13554x);
                if (m9278k == null) {
                    return false;
                }
                List<InterfaceC13307c1> mo5072k2 = m9278k.mo4651a().mo5072k();
                l.e(mo5072k2, "overridden.original.valueParameters");
                AbstractC12965b0 mo5121c2 = ((InterfaceC13307c1) C13722p.m3918q0(mo5072k2)).mo5121c();
                l.e(mo5121c2, "overridden.original.valueParameters.single().type");
                AbstractC12434j m8853g2 = m8853g(mo5121c2);
                InterfaceC13513m mo4687d = m9278k.mo4687d();
                l.e(mo4687d, "overridden.containingDeclaration");
                return l.b(C12747a.m6860j(mo4687d), C12059k.C12060a.f26823K.m7374j()) && (m8853g2 instanceof AbstractC12434j.C12437c) && l.b(((AbstractC12434j.C12437c) m8853g2).m8902i(), "java/lang/Object");
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public static final String m8854f(InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC13312e, "<this>");
        C12080c c12080c = C12080c.f26925a;
        C12610d m7374j = C12747a.m6861i(interfaceC13312e).m7374j();
        l.e(m7374j, "fqNameSafe.toUnsafe()");
        C12608b m9766o = c12080c.m9766o(m7374j);
        if (m9766o == null) {
            return C12425c.m8948b(interfaceC13312e, null, 2, null);
        }
        String m6831f = C12756d.m6835b(m9766o).m6831f();
        l.e(m6831f, "byClassId(it).internalName");
        return m6831f;
    }

    /* renamed from: g */
    public static final AbstractC12434j m8853g(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        return (AbstractC12434j) C12425c.m8945e(abstractC12965b0, C12440l.f27626a, C12466y.f27640m, C12465x.f27637a, null, null, 32, null);
    }
}
