package kotlin.p493j0.p494o;

import java.util.Iterator;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p493j0.InterfaceC11864c;
import kotlin.p493j0.InterfaceC11873j;
import kotlin.p493j0.InterfaceC11874k;
import kotlin.p493j0.p494o.p495c.C11899d0;
import kotlin.p493j0.p494o.p495c.C13213z;
import kotlin.p557z.C13722p;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
/* compiled from: KTypesJvm.kt */
/* renamed from: kotlin.j0.o.a */
/* loaded from: classes3.dex */
public final class C11879a {
    /* renamed from: a */
    public static final InterfaceC11863b<?> m10220a(InterfaceC11864c interfaceC11864c) {
        Object obj;
        InterfaceC11863b<?> m10219b;
        boolean z;
        l.f(interfaceC11864c, "$this$jvmErasure");
        if (interfaceC11864c instanceof InterfaceC11863b) {
            return (InterfaceC11863b) interfaceC11864c;
        }
        if (interfaceC11864c instanceof InterfaceC11874k) {
            List<InterfaceC11873j> upperBounds = ((InterfaceC11874k) interfaceC11864c).getUpperBounds();
            Iterator<T> it = upperBounds.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                InterfaceC11873j interfaceC11873j = (InterfaceC11873j) next;
                if (interfaceC11873j != null) {
                    Object mo5206d = ((C13213z) interfaceC11873j).m5632d().mo5779W0().mo5206d();
                    InterfaceC13312e interfaceC13312e = (InterfaceC13312e) (mo5206d instanceof InterfaceC13312e ? mo5206d : null);
                    if (interfaceC13312e == null || interfaceC13312e.mo4957w() == EnumC13319f.INTERFACE || interfaceC13312e.mo4957w() == EnumC13319f.ANNOTATION_CLASS) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        obj = next;
                        break;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                }
            }
            InterfaceC11873j interfaceC11873j2 = (InterfaceC11873j) obj;
            if (interfaceC11873j2 == null) {
                interfaceC11873j2 = (InterfaceC11873j) C13722p.m3952T(upperBounds);
            }
            return (interfaceC11873j2 == null || (m10219b = m10219b(interfaceC11873j2)) == null) ? C11813x.m10316b(Object.class) : m10219b;
        }
        throw new C11899d0("Cannot calculate JVM erasure for type: " + interfaceC11864c);
    }

    /* renamed from: b */
    public static final InterfaceC11863b<?> m10219b(InterfaceC11873j interfaceC11873j) {
        InterfaceC11863b<?> m10220a;
        l.f(interfaceC11873j, "$this$jvmErasure");
        InterfaceC11864c mo5631g = interfaceC11873j.mo5631g();
        if (mo5631g == null || (m10220a = m10220a(mo5631g)) == null) {
            throw new C11899d0("Cannot calculate JVM erasure for type: " + interfaceC11873j);
        }
        return m10220a;
    }
}
