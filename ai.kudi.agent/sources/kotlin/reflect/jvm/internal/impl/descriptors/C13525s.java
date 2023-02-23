package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
/* compiled from: descriptorUtil.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.s */
/* loaded from: classes3.dex */
public final class C13525s {
    /* renamed from: a */
    public static final InterfaceC13334h m4744a(InterfaceC13513m interfaceC13513m) {
        kotlin.e0.d.l.f(interfaceC13513m, "<this>");
        InterfaceC13513m mo4687d = interfaceC13513m.mo4687d();
        if (mo4687d == null || (interfaceC13513m instanceof InterfaceC13320f0)) {
            return null;
        }
        if (!m4743b(mo4687d)) {
            return m4744a(mo4687d);
        }
        if (mo4687d instanceof InterfaceC13334h) {
            return (InterfaceC13334h) mo4687d;
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m4743b(InterfaceC13513m interfaceC13513m) {
        kotlin.e0.d.l.f(interfaceC13513m, "<this>");
        return interfaceC13513m.mo4687d() instanceof InterfaceC13320f0;
    }

    /* renamed from: c */
    public static final InterfaceC13312e m4742c(InterfaceC13305c0 interfaceC13305c0, C12609c c12609c, InterfaceC12112b interfaceC12112b) {
        InterfaceC12777h mo5018I0;
        InterfaceC13334h mo5794f;
        kotlin.e0.d.l.f(interfaceC13305c0, "<this>");
        kotlin.e0.d.l.f(c12609c, "fqName");
        kotlin.e0.d.l.f(interfaceC12112b, "lookupLocation");
        if (c12609c.m7380d()) {
            return null;
        }
        C12609c m7379e = c12609c.m7379e();
        kotlin.e0.d.l.e(m7379e, "fqName.parent()");
        InterfaceC12777h mo4949u = interfaceC13305c0.mo4996V(m7379e).mo4949u();
        C12614f m7377g = c12609c.m7377g();
        kotlin.e0.d.l.e(m7377g, "fqName.shortName()");
        InterfaceC13334h mo5794f2 = mo4949u.mo5794f(m7377g, interfaceC12112b);
        InterfaceC13312e interfaceC13312e = mo5794f2 instanceof InterfaceC13312e ? (InterfaceC13312e) mo5794f2 : null;
        if (interfaceC13312e == null) {
            C12609c m7379e2 = c12609c.m7379e();
            kotlin.e0.d.l.e(m7379e2, "fqName.parent()");
            InterfaceC13312e m4742c = m4742c(interfaceC13305c0, m7379e2, interfaceC12112b);
            if (m4742c == null || (mo5018I0 = m4742c.mo5018I0()) == null) {
                mo5794f = null;
            } else {
                C12614f m7377g2 = c12609c.m7377g();
                kotlin.e0.d.l.e(m7377g2, "fqName.shortName()");
                mo5794f = mo5018I0.mo5794f(m7377g2, interfaceC12112b);
            }
            if (mo5794f instanceof InterfaceC13312e) {
                return (InterfaceC13312e) mo5794f;
            }
            return null;
        }
        return interfaceC13312e;
    }
}
