package kotlin.p493j0.p494o.p495c.p497p0.p523i;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p557z.C13722p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13311d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13520p0;
/* compiled from: inlineClassesUtils.kt */
/* renamed from: kotlin.j0.o.c.p0.i.f */
/* loaded from: classes3.dex */
public final class C12677f {
    static {
        new C12609c("kotlin.jvm.JvmInline");
    }

    /* renamed from: a */
    public static final boolean m7006a(InterfaceC13293a interfaceC13293a) {
        l.f(interfaceC13293a, "<this>");
        if (interfaceC13293a instanceof InterfaceC13520p0) {
            InterfaceC13518o0 mo4765J0 = ((InterfaceC13520p0) interfaceC13293a).mo4765J0();
            l.e(mo4765J0, "correspondingProperty");
            if (m7003d(mo4765J0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m7005b(InterfaceC13513m interfaceC13513m) {
        l.f(interfaceC13513m, "<this>");
        if (interfaceC13513m instanceof InterfaceC13312e) {
            InterfaceC13312e interfaceC13312e = (InterfaceC13312e) interfaceC13513m;
            if (interfaceC13312e.mo4955z() || interfaceC13312e.mo4970Q()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m7004c(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        if (mo5206d == null) {
            return false;
        }
        return m7005b(mo5206d);
    }

    /* renamed from: d */
    public static final boolean m7003d(InterfaceC13311d1 interfaceC13311d1) {
        l.f(interfaceC13311d1, "<this>");
        if (interfaceC13311d1.mo5056w0() != null) {
            return false;
        }
        InterfaceC13513m mo4687d = interfaceC13311d1.mo4687d();
        l.e(mo4687d, "this.containingDeclaration");
        if (m7005b(mo4687d)) {
            InterfaceC13307c1 m7001f = m7001f((InterfaceC13312e) mo4687d);
            return l.b(m7001f == null ? null : m7001f.mo5012b(), interfaceC13311d1.mo5012b());
        }
        return false;
    }

    /* renamed from: e */
    public static final AbstractC12965b0 m7002e(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        InterfaceC13307c1 m7000g = m7000g(abstractC12965b0);
        if (m7000g == null) {
            return null;
        }
        return C12959a1.m6343f(abstractC12965b0).m6333p(m7000g.mo5121c(), EnumC13008h1.INVARIANT);
    }

    /* renamed from: f */
    public static final InterfaceC13307c1 m7001f(InterfaceC13312e interfaceC13312e) {
        InterfaceC13309d mo4962Z;
        List<InterfaceC13307c1> mo5072k;
        l.f(interfaceC13312e, "<this>");
        if (!m7005b(interfaceC13312e) || (mo4962Z = interfaceC13312e.mo4962Z()) == null || (mo5072k = mo4962Z.mo5072k()) == null) {
            return null;
        }
        return (InterfaceC13307c1) C13722p.m3915s0(mo5072k);
    }

    /* renamed from: g */
    public static final InterfaceC13307c1 m7000g(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        if (!(mo5206d instanceof InterfaceC13312e)) {
            mo5206d = null;
        }
        InterfaceC13312e interfaceC13312e = (InterfaceC13312e) mo5206d;
        if (interfaceC13312e == null) {
            return null;
        }
        return m7001f(interfaceC13312e);
    }
}
