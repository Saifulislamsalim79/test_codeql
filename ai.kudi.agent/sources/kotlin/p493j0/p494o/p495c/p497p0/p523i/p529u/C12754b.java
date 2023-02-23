package kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u;

import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12677f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: inlineClassManglingRules.kt */
/* renamed from: kotlin.j0.o.c.p0.i.u.b */
/* loaded from: classes3.dex */
public final class C12754b {
    /* renamed from: a */
    private static final boolean m6844a(InterfaceC13312e interfaceC13312e) {
        return l.b(C12747a.m6861i(interfaceC13312e), C12059k.f26805h);
    }

    /* renamed from: b */
    public static final boolean m6843b(InterfaceC13513m interfaceC13513m) {
        l.f(interfaceC13513m, "<this>");
        return C12677f.m7005b(interfaceC13513m) && !m6844a((InterfaceC13312e) interfaceC13513m);
    }

    /* renamed from: c */
    public static final boolean m6842c(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        return l.b(mo5206d == null ? null : Boolean.valueOf(m6843b(mo5206d)), Boolean.TRUE);
    }

    /* renamed from: d */
    private static final boolean m6841d(AbstractC12965b0 abstractC12965b0) {
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        InterfaceC13562z0 interfaceC13562z0 = mo5206d instanceof InterfaceC13562z0 ? (InterfaceC13562z0) mo5206d : null;
        if (interfaceC13562z0 == null) {
            return false;
        }
        return m6840e(C13090a.m5898i(interfaceC13562z0));
    }

    /* renamed from: e */
    private static final boolean m6840e(AbstractC12965b0 abstractC12965b0) {
        return m6842c(abstractC12965b0) || m6841d(abstractC12965b0);
    }

    /* renamed from: f */
    public static final boolean m6839f(InterfaceC13300b interfaceC13300b) {
        l.f(interfaceC13300b, "descriptor");
        InterfaceC13309d interfaceC13309d = interfaceC13300b instanceof InterfaceC13309d ? (InterfaceC13309d) interfaceC13300b : null;
        if (interfaceC13309d == null || C13530t.m4728g(interfaceC13309d.mo4659i())) {
            return false;
        }
        InterfaceC13312e mo4944I = interfaceC13309d.mo4944I();
        l.e(mo4944I, "constructorDescriptor.constructedClass");
        if (C12677f.m7005b(mo4944I) || C12673d.m7041G(interfaceC13309d.mo4944I())) {
            return false;
        }
        List<InterfaceC13307c1> mo5072k = interfaceC13309d.mo5072k();
        l.e(mo5072k, "constructorDescriptor.valueParameters");
        if ((mo5072k instanceof Collection) && mo5072k.isEmpty()) {
            return false;
        }
        for (InterfaceC13307c1 interfaceC13307c1 : mo5072k) {
            AbstractC12965b0 mo5121c = interfaceC13307c1.mo5121c();
            l.e(mo5121c, "it.type");
            if (m6840e(mo5121c)) {
                return true;
            }
        }
        return false;
    }
}
