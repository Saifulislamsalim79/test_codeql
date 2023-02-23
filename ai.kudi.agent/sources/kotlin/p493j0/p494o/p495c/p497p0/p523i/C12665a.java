package kotlin.p493j0.p494o.p495c.p497p0.p523i;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.EnumC12115d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12768d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
/* compiled from: SealedClassInheritorsProvider.kt */
/* renamed from: kotlin.j0.o.c.p0.i.a */
/* loaded from: classes3.dex */
public final class C12665a extends AbstractC12697o {

    /* renamed from: a */
    public static final C12665a f28519a = new C12665a();

    private C12665a() {
    }

    /* renamed from: b */
    private static final void m7076b(InterfaceC13312e interfaceC13312e, LinkedHashSet<InterfaceC13312e> linkedHashSet, InterfaceC12777h interfaceC12777h, boolean z) {
        for (InterfaceC13513m interfaceC13513m : InterfaceC12783k.C12784a.m6774a(interfaceC12777h, C12768d.f28649q, null, 2, null)) {
            if (interfaceC13513m instanceof InterfaceC13312e) {
                InterfaceC13312e interfaceC13312e2 = (InterfaceC13312e) interfaceC13513m;
                if (interfaceC13312e2.mo4660T()) {
                    C12614f mo5012b = interfaceC13312e2.mo5012b();
                    l.e(mo5012b, "descriptor.name");
                    InterfaceC13334h mo5794f = interfaceC12777h.mo5794f(mo5012b, EnumC12115d.WHEN_GET_ALL_DESCRIPTORS);
                    if (mo5794f instanceof InterfaceC13312e) {
                        interfaceC13312e2 = (InterfaceC13312e) mo5794f;
                    } else {
                        interfaceC13312e2 = mo5794f instanceof InterfaceC13559y0 ? ((InterfaceC13559y0) mo5794f).mo4655v() : null;
                    }
                }
                if (interfaceC13312e2 != null) {
                    if (C12673d.m7009z(interfaceC13312e2, interfaceC13312e)) {
                        linkedHashSet.add(interfaceC13312e2);
                    }
                    if (z) {
                        InterfaceC12777h mo5018I0 = interfaceC13312e2.mo5018I0();
                        l.e(mo5018I0, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        m7076b(interfaceC13312e, linkedHashSet, mo5018I0, z);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Collection<InterfaceC13312e> m7077a(InterfaceC13312e interfaceC13312e, boolean z) {
        InterfaceC13513m interfaceC13513m;
        InterfaceC13513m interfaceC13513m2;
        List m3891e;
        l.f(interfaceC13312e, "sealedClass");
        if (interfaceC13312e.mo4658o() != EnumC13560z.SEALED) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z) {
            interfaceC13513m2 = interfaceC13312e.mo4687d();
        } else {
            Iterator<InterfaceC13513m> it = C12747a.m6857m(interfaceC13312e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC13513m = null;
                    break;
                }
                interfaceC13513m = it.next();
                if (interfaceC13513m instanceof InterfaceC13320f0) {
                    break;
                }
            }
            interfaceC13513m2 = interfaceC13513m;
        }
        if (interfaceC13513m2 instanceof InterfaceC13320f0) {
            m7076b(interfaceC13312e, linkedHashSet, ((InterfaceC13320f0) interfaceC13513m2).mo5125u(), z);
        }
        InterfaceC12777h mo5018I0 = interfaceC13312e.mo5018I0();
        l.e(mo5018I0, "sealedClass.unsubstitutedInnerClassesScope");
        m7076b(interfaceC13312e, linkedHashSet, mo5018I0, true);
        return linkedHashSet;
    }
}
