package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.HashSet;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13073i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13074j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13077m;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13078n;
/* compiled from: expandedTypeUtils.kt */
/* renamed from: kotlin.j0.o.c.p0.l.u */
/* loaded from: classes3.dex */
public final class C13126u {
    /* renamed from: a */
    public static final InterfaceC13073i m5790a(InterfaceC12966b1 interfaceC12966b1, InterfaceC13073i interfaceC13073i) {
        l.f(interfaceC12966b1, "<this>");
        l.f(interfaceC13073i, "inlineClassType");
        return m5789b(interfaceC12966b1, interfaceC13073i, new HashSet());
    }

    /* renamed from: b */
    private static final InterfaceC13073i m5789b(InterfaceC12966b1 interfaceC12966b1, InterfaceC13073i interfaceC13073i, HashSet<InterfaceC13077m> hashSet) {
        InterfaceC13073i m5789b;
        InterfaceC13077m mo5946t = interfaceC12966b1.mo5946t(interfaceC13073i);
        if (hashSet.add(mo5946t)) {
            InterfaceC13078n mo6053z = interfaceC12966b1.mo6053z(mo5946t);
            if (mo6053z != null) {
                m5789b = m5789b(interfaceC12966b1, interfaceC12966b1.mo6057k(mo6053z), hashSet);
                if (m5789b == null) {
                    return null;
                }
                if (!interfaceC12966b1.mo5963i0(m5789b) && interfaceC12966b1.mo5965h0(interfaceC13073i)) {
                    return interfaceC12966b1.mo6056s0(m5789b);
                }
            } else if (!interfaceC12966b1.mo6063T(mo5946t)) {
                return interfaceC13073i;
            } else {
                InterfaceC13073i mo6062U = interfaceC12966b1.mo6062U(interfaceC13073i);
                if (mo6062U == null || (m5789b = m5789b(interfaceC12966b1, mo6062U, hashSet)) == null) {
                    return null;
                }
                if (interfaceC12966b1.mo5963i0(interfaceC13073i)) {
                    return interfaceC12966b1.mo5963i0(m5789b) ? interfaceC13073i : ((m5789b instanceof InterfaceC13074j) && interfaceC12966b1.mo5943u0((InterfaceC13074j) m5789b)) ? interfaceC13073i : interfaceC12966b1.mo6056s0(m5789b);
                }
            }
            return m5789b;
        }
        return null;
    }
}
