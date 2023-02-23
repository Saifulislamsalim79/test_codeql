package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12984f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13068d;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13073i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13074j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13077m;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13079o;
import kotlin.p557z.C13742z;
/* compiled from: AbstractTypeChecker.kt */
/* renamed from: kotlin.j0.o.c.p0.l.c */
/* loaded from: classes3.dex */
public final class C12968c {

    /* renamed from: a */
    public static final C12968c f29025a = new C12968c();

    private C12968c() {
    }

    /* renamed from: c */
    private final boolean m6320c(AbstractC12984f abstractC12984f, InterfaceC13074j interfaceC13074j, InterfaceC13077m interfaceC13077m) {
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        if (mo6198j.mo5979Y(interfaceC13074j)) {
            return true;
        }
        if (mo6198j.mo5985Q(interfaceC13074j)) {
            return false;
        }
        if (abstractC12984f.mo6195o() && mo6198j.mo5967g0(interfaceC13074j)) {
            return true;
        }
        return mo6198j.mo5948r0(mo6198j.mo5975b(interfaceC13074j), interfaceC13077m);
    }

    /* renamed from: e */
    private final boolean m6318e(AbstractC12984f abstractC12984f, InterfaceC13074j interfaceC13074j, InterfaceC13074j interfaceC13074j2) {
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        if (C12979e.f29046b) {
            boolean z = mo6198j.mo5993I(interfaceC13074j) || mo6198j.mo5983S(mo6198j.mo5975b(interfaceC13074j)) || abstractC12984f.m6236m(interfaceC13074j);
            if (C13668y.f30115a && !z) {
                throw new AssertionError(l.m("Not singleClassifierType and not intersection subType: ", interfaceC13074j));
            }
            boolean z2 = mo6198j.mo5993I(interfaceC13074j2) || abstractC12984f.m6236m(interfaceC13074j2);
            if (C13668y.f30115a && !z2) {
                throw new AssertionError(l.m("Not singleClassifierType superType: ", interfaceC13074j2));
            }
        }
        if (mo6198j.mo5985Q(interfaceC13074j2) || mo6198j.mo5941w(interfaceC13074j)) {
            return true;
        }
        if (((interfaceC13074j instanceof InterfaceC13068d) && mo6198j.mo5964i((InterfaceC13068d) interfaceC13074j)) || f29025a.m6322a(abstractC12984f, interfaceC13074j, AbstractC12984f.AbstractC12986b.C12988b.f29062a)) {
            return true;
        }
        if (mo6198j.mo5941w(interfaceC13074j2) || f29025a.m6322a(abstractC12984f, interfaceC13074j2, AbstractC12984f.AbstractC12986b.C12990d.f29064a) || mo6198j.mo5954o0(interfaceC13074j)) {
            return false;
        }
        return f29025a.m6321b(abstractC12984f, interfaceC13074j, mo6198j.mo5975b(interfaceC13074j2));
    }

    /* renamed from: a */
    public final boolean m6322a(AbstractC12984f abstractC12984f, InterfaceC13074j interfaceC13074j, AbstractC12984f.AbstractC12986b abstractC12986b) {
        String m3797a0;
        l.f(abstractC12984f, "<this>");
        l.f(interfaceC13074j, "type");
        l.f(abstractC12986b, "supertypesPolicy");
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        if (!((mo6198j.mo5954o0(interfaceC13074j) && !mo6198j.mo5985Q(interfaceC13074j)) || mo6198j.mo5941w(interfaceC13074j))) {
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
                        AbstractC12984f.AbstractC12986b abstractC12986b2 = mo6198j.mo5985Q(pop) ? AbstractC12984f.AbstractC12986b.C12989c.f29063a : abstractC12986b;
                        if (!(!l.b(abstractC12986b2, AbstractC12984f.AbstractC12986b.C12989c.f29063a))) {
                            abstractC12986b2 = null;
                        }
                        if (abstractC12986b2 == null) {
                            continue;
                        } else {
                            InterfaceC13079o mo6198j2 = abstractC12984f.mo6198j();
                            for (InterfaceC13073i interfaceC13073i : mo6198j2.mo5951q(mo6198j2.mo5975b(pop))) {
                                InterfaceC13074j mo6188a = abstractC12986b2.mo6188a(abstractC12984f, interfaceC13073i);
                                if ((mo6198j.mo5954o0(mo6188a) && !mo6198j.mo5985Q(mo6188a)) || mo6198j.mo5941w(mo6188a)) {
                                    abstractC12984f.m6242e();
                                } else {
                                    m6239h.add(mo6188a);
                                }
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
        return true;
    }

    /* renamed from: b */
    public final boolean m6321b(AbstractC12984f abstractC12984f, InterfaceC13074j interfaceC13074j, InterfaceC13077m interfaceC13077m) {
        String m3797a0;
        l.f(abstractC12984f, "context");
        l.f(interfaceC13074j, OpsMetricTracker.START);
        l.f(interfaceC13077m, "end");
        InterfaceC13079o mo6198j = abstractC12984f.mo6198j();
        if (f29025a.m6320c(abstractC12984f, interfaceC13074j, interfaceC13077m)) {
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
                    AbstractC12984f.AbstractC12986b abstractC12986b = mo6198j.mo5985Q(pop) ? AbstractC12984f.AbstractC12986b.C12989c.f29063a : AbstractC12984f.AbstractC12986b.C12988b.f29062a;
                    if (!(!l.b(abstractC12986b, AbstractC12984f.AbstractC12986b.C12989c.f29063a))) {
                        abstractC12986b = null;
                    }
                    if (abstractC12986b == null) {
                        continue;
                    } else {
                        InterfaceC13079o mo6198j2 = abstractC12984f.mo6198j();
                        for (InterfaceC13073i interfaceC13073i : mo6198j2.mo5951q(mo6198j2.mo5975b(pop))) {
                            InterfaceC13074j mo6188a = abstractC12986b.mo6188a(abstractC12984f, interfaceC13073i);
                            if (f29025a.m6320c(abstractC12984f, mo6188a, interfaceC13077m)) {
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

    /* renamed from: d */
    public final boolean m6319d(AbstractC12984f abstractC12984f, InterfaceC13074j interfaceC13074j, InterfaceC13074j interfaceC13074j2) {
        l.f(abstractC12984f, "context");
        l.f(interfaceC13074j, "subType");
        l.f(interfaceC13074j2, "superType");
        return m6318e(abstractC12984f, interfaceC13074j, interfaceC13074j2);
    }
}
