package kotlin.p493j0.p494o.p495c.p497p0.p498b;

import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
/* compiled from: CompanionObjectMappingUtils.kt */
/* renamed from: kotlin.j0.o.c.p0.b.d */
/* loaded from: classes3.dex */
public final class C12041d {
    /* renamed from: a */
    public static final boolean m9955a(C12039c c12039c, InterfaceC13312e interfaceC13312e) {
        boolean m3814J;
        l.f(c12039c, "<this>");
        l.f(interfaceC13312e, "classDescriptor");
        if (C12673d.m7011x(interfaceC13312e)) {
            Set<C12608b> m9957b = c12039c.m9957b();
            C12608b m6862h = C12747a.m6862h(interfaceC13312e);
            m3814J = C13742z.m3814J(m9957b, m6862h == null ? null : m6862h.m7390g());
            if (m3814J) {
                return true;
            }
        }
        return false;
    }
}
