package kotlin.p493j0.p494o.p495c.p497p0.p523i;

import java.util.Collection;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
/* compiled from: VisibilityUtil.kt */
/* renamed from: kotlin.j0.o.c.p0.i.p */
/* loaded from: classes3.dex */
public final class C12698p {
    /* renamed from: a */
    public static final InterfaceC13300b m6937a(Collection<? extends InterfaceC13300b> collection) {
        Integer m4731d;
        l.f(collection, "descriptors");
        boolean z = !collection.isEmpty();
        if (!C13668y.f30115a || z) {
            InterfaceC13300b interfaceC13300b = null;
            for (InterfaceC13300b interfaceC13300b2 : collection) {
                if (interfaceC13300b == null || ((m4731d = C13530t.m4731d(interfaceC13300b.mo4659i(), interfaceC13300b2.mo4659i())) != null && m4731d.intValue() < 0)) {
                    interfaceC13300b = interfaceC13300b2;
                }
            }
            l.d(interfaceC13300b);
            return interfaceC13300b;
        }
        throw new AssertionError("Assertion failed");
    }
}
