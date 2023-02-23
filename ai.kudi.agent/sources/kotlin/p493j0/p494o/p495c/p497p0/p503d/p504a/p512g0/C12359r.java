package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0;

import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12386v;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC12966b1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13073i;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13742z;
import kotlin.p557z.C13745z0;
/* compiled from: typeEnchancementUtils.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.g0.r */
/* loaded from: classes3.dex */
public final class C12359r {
    /* renamed from: a */
    public static final C12306e m9136a(EnumC12310h enumC12310h, EnumC12308f enumC12308f, boolean z, boolean z2) {
        if (z2 && enumC12310h == EnumC12310h.NOT_NULL) {
            return new C12306e(enumC12310h, enumC12308f, true, z);
        }
        return new C12306e(enumC12310h, enumC12308f, false, z);
    }

    /* renamed from: b */
    public static final boolean m9135b(InterfaceC12966b1 interfaceC12966b1, InterfaceC13073i interfaceC13073i) {
        l.f(interfaceC12966b1, "<this>");
        l.f(interfaceC13073i, "type");
        C12609c c12609c = C12386v.f27482o;
        l.e(c12609c, "ENHANCED_NULLABILITY_ANNOTATION");
        return interfaceC12966b1.mo6060e0(interfaceC13073i, c12609c);
    }

    /* renamed from: c */
    public static final <T> T m9134c(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set m3768i;
        Set<? extends T> m3821F0;
        l.f(set, "<this>");
        l.f(t, "low");
        l.f(t2, "high");
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (l.b(t4, t) && l.b(t3, t2)) {
                return null;
            }
            return t3 == null ? t4 : t3;
        }
        if (t3 != null) {
            m3768i = C13745z0.m3768i(set, t3);
            m3821F0 = C13742z.m3821F0(m3768i);
            if (m3821F0 != null) {
                set = m3821F0;
            }
        }
        return (T) C13722p.m3916r0(set);
    }

    /* renamed from: d */
    public static final EnumC12310h m9133d(Set<? extends EnumC12310h> set, EnumC12310h enumC12310h, boolean z) {
        l.f(set, "<this>");
        EnumC12310h enumC12310h2 = EnumC12310h.FORCE_FLEXIBILITY;
        return enumC12310h == enumC12310h2 ? enumC12310h2 : (EnumC12310h) m9134c(set, EnumC12310h.NOT_NULL, EnumC12310h.NULLABLE, enumC12310h, z);
    }
}
