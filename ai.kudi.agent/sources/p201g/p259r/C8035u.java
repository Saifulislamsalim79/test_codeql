package p201g.p259r;

import kotlin.e0.d.l;
import p201g.p259r.AbstractC7982n1;
/* compiled from: HintHandler.kt */
/* renamed from: g.r.u */
/* loaded from: classes2.dex */
public final class C8035u {
    /* renamed from: a */
    public static final boolean m16839a(AbstractC7982n1 abstractC7982n1, AbstractC7982n1 abstractC7982n12, EnumC7830b0 enumC7830b0) {
        l.f(abstractC7982n1, "<this>");
        l.f(enumC7830b0, "loadType");
        if (abstractC7982n12 != null && (!(abstractC7982n12 instanceof AbstractC7982n1.C7984b) || !(abstractC7982n1 instanceof AbstractC7982n1.C7983a))) {
            if ((abstractC7982n1 instanceof AbstractC7982n1.C7984b) && (abstractC7982n12 instanceof AbstractC7982n1.C7983a)) {
                return false;
            }
            if (abstractC7982n1.m16948a() == abstractC7982n12.m16948a() && abstractC7982n1.m16947b() == abstractC7982n12.m16947b() && abstractC7982n12.m16944e(enumC7830b0) <= abstractC7982n1.m16944e(enumC7830b0)) {
                return false;
            }
        }
        return true;
    }
}
