package kotlin.p493j0.p494o.p495c.p497p0.p501c;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.C12116e;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.EnumC12118f;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12111a;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12113c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
/* compiled from: utils.kt */
/* renamed from: kotlin.j0.o.c.p0.c.a */
/* loaded from: classes3.dex */
public final class C12110a {
    /* renamed from: a */
    public static final void m9687a(InterfaceC12113c interfaceC12113c, InterfaceC12112b interfaceC12112b, InterfaceC13312e interfaceC13312e, C12614f c12614f) {
        InterfaceC12111a location;
        l.f(interfaceC12113c, "<this>");
        l.f(interfaceC12112b, "from");
        l.f(interfaceC13312e, "scopeOwner");
        l.f(c12614f, "name");
        if (interfaceC12113c == InterfaceC12113c.C12114a.f27002a || (location = interfaceC12112b.getLocation()) == null) {
            return;
        }
        C12116e position = interfaceC12113c.mo9683a() ? location.getPosition() : C12116e.f27027e.m9679a();
        String m9684a = location.m9684a();
        String m7371b = C12673d.m7022m(interfaceC13312e).m7371b();
        l.e(m7371b, "getFqName(scopeOwner).asString()");
        EnumC12118f enumC12118f = EnumC12118f.CLASSIFIER;
        String m7353b = c12614f.m7353b();
        l.e(m7353b, "name.asString()");
        interfaceC12113c.mo9682b(m9684a, position, m7371b, enumC12118f, m7353b);
    }

    /* renamed from: b */
    public static final void m9686b(InterfaceC12113c interfaceC12113c, InterfaceC12112b interfaceC12112b, InterfaceC13320f0 interfaceC13320f0, C12614f c12614f) {
        l.f(interfaceC12113c, "<this>");
        l.f(interfaceC12112b, "from");
        l.f(interfaceC13320f0, "scopeOwner");
        l.f(c12614f, "name");
        String m7382b = interfaceC13320f0.mo4954f().m7382b();
        l.e(m7382b, "scopeOwner.fqName.asString()");
        String m7353b = c12614f.m7353b();
        l.e(m7353b, "name.asString()");
        m9685c(interfaceC12113c, interfaceC12112b, m7382b, m7353b);
    }

    /* renamed from: c */
    public static final void m9685c(InterfaceC12113c interfaceC12113c, InterfaceC12112b interfaceC12112b, String str, String str2) {
        InterfaceC12111a location;
        l.f(interfaceC12113c, "<this>");
        l.f(interfaceC12112b, "from");
        l.f(str, "packageFqName");
        l.f(str2, "name");
        if (interfaceC12113c == InterfaceC12113c.C12114a.f27002a || (location = interfaceC12112b.getLocation()) == null) {
            return;
        }
        interfaceC12113c.mo9682b(location.m9684a(), interfaceC12113c.mo9683a() ? location.getPosition() : C12116e.f27027e.m9679a(), str, EnumC12118f.PACKAGE, str2);
    }
}
