package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
/* compiled from: flexibleTypes.kt */
/* renamed from: kotlin.j0.o.c.p0.l.y */
/* loaded from: classes3.dex */
public final class C13136y {
    /* renamed from: a */
    public static final AbstractC13130v m5755a(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        return (AbstractC13130v) abstractC12965b0.mo6202Z0();
    }

    /* renamed from: b */
    public static final boolean m5754b(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        return abstractC12965b0.mo6202Z0() instanceof AbstractC13130v;
    }

    /* renamed from: c */
    public static final AbstractC13010i0 m5753c(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        AbstractC13005g1 mo6202Z0 = abstractC12965b0.mo6202Z0();
        if (mo6202Z0 instanceof AbstractC13130v) {
            return ((AbstractC13130v) mo6202Z0).m5777e1();
        }
        if (mo6202Z0 instanceof AbstractC13010i0) {
            return (AbstractC13010i0) mo6202Z0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final AbstractC13010i0 m5752d(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        AbstractC13005g1 mo6202Z0 = abstractC12965b0.mo6202Z0();
        if (mo6202Z0 instanceof AbstractC13130v) {
            return ((AbstractC13130v) mo6202Z0).m5776f1();
        }
        if (mo6202Z0 instanceof AbstractC13010i0) {
            return (AbstractC13010i0) mo6202Z0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
