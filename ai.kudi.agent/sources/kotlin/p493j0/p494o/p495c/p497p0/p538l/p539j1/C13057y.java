package kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p524q.p525a.C12702d;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13127u0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p543n1.C13097b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
/* compiled from: utils.kt */
/* renamed from: kotlin.j0.o.c.p0.l.j1.y */
/* loaded from: classes3.dex */
public final class C13057y {
    /* renamed from: a */
    private static final AbstractC12965b0 m6033a(AbstractC12965b0 abstractC12965b0) {
        return C13097b.m5875a(abstractC12965b0).m5876d();
    }

    /* renamed from: b */
    private static final String m6032b(InterfaceC13125t0 interfaceC13125t0) {
        StringBuilder sb = new StringBuilder();
        m6031c(l.m("type: ", interfaceC13125t0), sb);
        m6031c(l.m("hashCode: ", Integer.valueOf(interfaceC13125t0.hashCode())), sb);
        m6031c(l.m("javaClass: ", interfaceC13125t0.getClass().getCanonicalName()), sb);
        for (InterfaceC13513m mo5206d = interfaceC13125t0.mo5206d(); mo5206d != null; mo5206d = mo5206d.mo4687d()) {
            m6031c(l.m("fqName: ", AbstractC12624c.f28404b.mo7207q(mo5206d)), sb);
            m6031c(l.m("javaClass: ", mo5206d.getClass().getCanonicalName()), sb);
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    private static final StringBuilder m6031c(String str, StringBuilder sb) {
        l.f(str, "<this>");
        sb.append(str);
        l.e(sb, "append(value)");
        sb.append('\n');
        l.e(sb, "append('\\n')");
        return sb;
    }

    /* renamed from: d */
    public static final AbstractC12965b0 m6030d(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02, InterfaceC13047w interfaceC13047w) {
        boolean z;
        boolean z2;
        l.f(abstractC12965b0, "subtype");
        l.f(abstractC12965b02, "supertype");
        l.f(interfaceC13047w, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new C13044t(abstractC12965b0, null));
        InterfaceC13125t0 mo5779W0 = abstractC12965b02.mo5779W0();
        while (!arrayDeque.isEmpty()) {
            C13044t c13044t = (C13044t) arrayDeque.poll();
            AbstractC12965b0 m6050b = c13044t.m6050b();
            InterfaceC13125t0 mo5779W02 = m6050b.mo5779W0();
            if (interfaceC13047w.mo6045a(mo5779W02, mo5779W0)) {
                boolean mo5778X0 = m6050b.mo5778X0();
                for (C13044t m6051a = c13044t.m6051a(); m6051a != null; m6051a = m6051a.m6051a()) {
                    AbstractC12965b0 m6050b2 = m6051a.m6050b();
                    List<InterfaceC13131v0> mo5780V0 = m6050b2.mo5780V0();
                    if (!(mo5780V0 instanceof Collection) || !mo5780V0.isEmpty()) {
                        for (InterfaceC13131v0 interfaceC13131v0 : mo5780V0) {
                            if (interfaceC13131v0.mo5760a() != EnumC13008h1.INVARIANT) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                        AbstractC12965b0 m6335n = C12702d.m6923f(AbstractC13127u0.f29209b.m5786a(m6050b2), false, 1, null).m5750c().m6335n(m6050b, EnumC13008h1.INVARIANT);
                        l.e(m6335n, "TypeConstructorSubstitution.create(currentType)\n                            .wrapWithCapturingSubstitution().buildSubstitutor()\n                            .safeSubstitute(substituted, Variance.INVARIANT)");
                        m6050b = m6033a(m6335n);
                    } else {
                        m6050b = AbstractC13127u0.f29209b.m5786a(m6050b2).m5750c().m6335n(m6050b, EnumC13008h1.INVARIANT);
                        l.e(m6050b, "{\n                    TypeConstructorSubstitution.create(currentType)\n                            .buildSubstitutor()\n                            .safeSubstitute(substituted, Variance.INVARIANT)\n                }");
                    }
                    mo5778X0 = mo5778X0 || m6050b2.mo5778X0();
                }
                InterfaceC13125t0 mo5779W03 = m6050b.mo5779W0();
                if (interfaceC13047w.mo6045a(mo5779W03, mo5779W0)) {
                    return C12974c1.m6286p(m6050b, mo5778X0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + m6032b(mo5779W03) + ", \n\nsupertype: " + m6032b(mo5779W0) + " \n" + interfaceC13047w.mo6045a(mo5779W03, mo5779W0));
            }
            for (AbstractC12965b0 abstractC12965b03 : mo5779W02.mo5218a()) {
                l.e(abstractC12965b03, "immediateSupertype");
                arrayDeque.add(new C13044t(abstractC12965b03, c13044t));
            }
        }
        return null;
    }
}
