package kotlin.p493j0.p494o.p495c.p497p0.p498b.p499p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.InterfaceC12038b;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.InterfaceC12044f;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p499p.EnumC12069c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13741y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13364b;
/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
/* renamed from: kotlin.j0.o.c.p0.b.p.a */
/* loaded from: classes3.dex */
public final class C12065a implements InterfaceC13364b {

    /* renamed from: a */
    private final InterfaceC12954n f26896a;

    /* renamed from: b */
    private final InterfaceC13305c0 f26897b;

    public C12065a(InterfaceC12954n interfaceC12954n, InterfaceC13305c0 interfaceC13305c0) {
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC13305c0, "module");
        this.f26896a = interfaceC12954n;
        this.f26897b = interfaceC13305c0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13364b
    /* renamed from: a */
    public Collection<InterfaceC13312e> mo5291a(C12609c c12609c) {
        Set m3831b;
        l.f(c12609c, "packageFqName");
        m3831b = C13741y0.m3831b();
        return m3831b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13364b
    /* renamed from: b */
    public boolean mo5290b(C12609c c12609c, C12614f c12614f) {
        boolean m5447E;
        boolean m5447E2;
        boolean m5447E3;
        boolean m5447E4;
        l.f(c12609c, "packageFqName");
        l.f(c12614f, "name");
        String m7353b = c12614f.m7353b();
        l.e(m7353b, "name.asString()");
        m5447E = C13276s.m5447E(m7353b, "Function", false, 2, null);
        if (!m5447E) {
            m5447E2 = C13276s.m5447E(m7353b, "KFunction", false, 2, null);
            if (!m5447E2) {
                m5447E3 = C13276s.m5447E(m7353b, "SuspendFunction", false, 2, null);
                if (!m5447E3) {
                    m5447E4 = C13276s.m5447E(m7353b, "KSuspendFunction", false, 2, null);
                    if (!m5447E4) {
                        return false;
                    }
                }
            }
        }
        return EnumC12069c.f26909e.m9793c(m7353b, c12609c) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13364b
    /* renamed from: c */
    public InterfaceC13312e mo5289c(C12608b c12608b) {
        boolean m5421J;
        l.f(c12608b, "classId");
        if (c12608b.m7386k() || c12608b.m7385l()) {
            return null;
        }
        String m7382b = c12608b.m7388i().m7382b();
        l.e(m7382b, "classId.relativeClassName.asString()");
        m5421J = C13277t.m5421J(m7382b, "Function", false, 2, null);
        if (m5421J) {
            C12609c m7389h = c12608b.m7389h();
            l.e(m7389h, "classId.packageFqName");
            EnumC12069c.C12070a.C12071a m9793c = EnumC12069c.f26909e.m9793c(m7382b, m7389h);
            if (m9793c == null) {
                return null;
            }
            EnumC12069c m9791a = m9793c.m9791a();
            int m9790b = m9793c.m9790b();
            List<InterfaceC13320f0> mo4951O = this.f26897b.mo4996V(m7389h).mo4951O();
            ArrayList arrayList = new ArrayList();
            for (Object obj : mo4951O) {
                if (obj instanceof InterfaceC12038b) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 instanceof InterfaceC12044f) {
                    arrayList2.add(obj2);
                }
            }
            InterfaceC13320f0 interfaceC13320f0 = (InterfaceC12044f) C13722p.m3952T(arrayList2);
            if (interfaceC13320f0 == null) {
                interfaceC13320f0 = (InterfaceC12038b) C13722p.m3954R(arrayList);
            }
            return new C12066b(this.f26896a, interfaceC13320f0, m9791a, m9790b);
        }
        return null;
    }
}
