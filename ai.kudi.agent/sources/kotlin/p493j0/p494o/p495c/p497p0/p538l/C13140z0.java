package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.j0.o.c.p0.l.z0 */
/* loaded from: classes3.dex */
public final class C13140z0 {
    /* renamed from: a */
    public static final AbstractC13010i0 m5741a(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        AbstractC13005g1 mo6202Z0 = abstractC12965b0.mo6202Z0();
        AbstractC13010i0 abstractC13010i0 = mo6202Z0 instanceof AbstractC13010i0 ? (AbstractC13010i0) mo6202Z0 : null;
        if (abstractC13010i0 != null) {
            return abstractC13010i0;
        }
        throw new IllegalStateException(l.m("This is should be simple type: ", abstractC12965b0).toString());
    }

    /* renamed from: b */
    public static final AbstractC12965b0 m5740b(AbstractC12965b0 abstractC12965b0, List<? extends InterfaceC13131v0> list, InterfaceC13346g interfaceC13346g) {
        l.f(abstractC12965b0, "<this>");
        l.f(list, "newArguments");
        l.f(interfaceC13346g, "newAnnotations");
        return m5737e(abstractC12965b0, list, interfaceC13346g, null, 4, null);
    }

    /* renamed from: c */
    public static final AbstractC12965b0 m5739c(AbstractC12965b0 abstractC12965b0, List<? extends InterfaceC13131v0> list, InterfaceC13346g interfaceC13346g, List<? extends InterfaceC13131v0> list2) {
        l.f(abstractC12965b0, "<this>");
        l.f(list, "newArguments");
        l.f(interfaceC13346g, "newAnnotations");
        l.f(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == abstractC12965b0.mo5780V0()) && interfaceC13346g == abstractC12965b0.mo4956y()) {
            return abstractC12965b0;
        }
        AbstractC13005g1 mo6202Z0 = abstractC12965b0.mo6202Z0();
        if (mo6202Z0 instanceof AbstractC13130v) {
            C12969c0 c12969c0 = C12969c0.f29026a;
            AbstractC13130v abstractC13130v = (AbstractC13130v) mo6202Z0;
            return C12969c0.m6314d(m5738d(abstractC13130v.m5777e1(), list, interfaceC13346g), m5738d(abstractC13130v.m5776f1(), list2, interfaceC13346g));
        } else if (mo6202Z0 instanceof AbstractC13010i0) {
            return m5738d((AbstractC13010i0) mo6202Z0, list, interfaceC13346g);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    public static final AbstractC13010i0 m5738d(AbstractC13010i0 abstractC13010i0, List<? extends InterfaceC13131v0> list, InterfaceC13346g interfaceC13346g) {
        l.f(abstractC13010i0, "<this>");
        l.f(list, "newArguments");
        l.f(interfaceC13346g, "newAnnotations");
        if (list.isEmpty() && interfaceC13346g == abstractC13010i0.mo4956y()) {
            return abstractC13010i0;
        }
        if (list.isEmpty()) {
            return abstractC13010i0.mo5825e1(interfaceC13346g);
        }
        C12969c0 c12969c0 = C12969c0.f29026a;
        return C12969c0.m6309i(interfaceC13346g, abstractC13010i0.mo5779W0(), list, abstractC13010i0.mo5778X0(), null, 16, null);
    }

    /* renamed from: e */
    public static /* synthetic */ AbstractC12965b0 m5737e(AbstractC12965b0 abstractC12965b0, List list, InterfaceC13346g interfaceC13346g, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = abstractC12965b0.mo5780V0();
        }
        if ((i & 2) != 0) {
            interfaceC13346g = abstractC12965b0.mo4956y();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return m5739c(abstractC12965b0, list, interfaceC13346g, list2);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC13010i0 m5736f(AbstractC13010i0 abstractC13010i0, List list, InterfaceC13346g interfaceC13346g, int i, Object obj) {
        if ((i & 1) != 0) {
            list = abstractC13010i0.mo5780V0();
        }
        if ((i & 2) != 0) {
            interfaceC13346g = abstractC13010i0.mo4956y();
        }
        return m5738d(abstractC13010i0, list, interfaceC13346g);
    }
}
