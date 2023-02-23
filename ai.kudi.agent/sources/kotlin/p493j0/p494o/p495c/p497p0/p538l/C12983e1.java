package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
/* compiled from: TypeWithEnhancement.kt */
/* renamed from: kotlin.j0.o.c.p0.l.e1 */
/* loaded from: classes3.dex */
public final class C12983e1 {
    /* renamed from: a */
    public static final AbstractC12965b0 m6250a(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        if (abstractC12965b0 instanceof InterfaceC12978d1) {
            return ((InterfaceC12978d1) abstractC12965b0).mo5770N();
        }
        return null;
    }

    /* renamed from: b */
    public static final AbstractC13005g1 m6249b(AbstractC13005g1 abstractC13005g1, AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC13005g1, "<this>");
        l.f(abstractC12965b0, "origin");
        return m6247d(abstractC13005g1, m6250a(abstractC12965b0));
    }

    /* renamed from: c */
    public static final AbstractC12965b0 m6248c(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        AbstractC12965b0 m6250a = m6250a(abstractC12965b0);
        return m6250a == null ? abstractC12965b0 : m6250a;
    }

    /* renamed from: d */
    public static final AbstractC13005g1 m6247d(AbstractC13005g1 abstractC13005g1, AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC13005g1, "<this>");
        if (abstractC12965b0 == null) {
            return abstractC13005g1;
        }
        if (abstractC13005g1 instanceof AbstractC13010i0) {
            return new C13060k0((AbstractC13010i0) abstractC13005g1, abstractC12965b0);
        }
        if (abstractC13005g1 instanceof AbstractC13130v) {
            return new C13134x((AbstractC13130v) abstractC13005g1, abstractC12965b0);
        }
        throw new NoWhenBranchMatchedException();
    }
}
