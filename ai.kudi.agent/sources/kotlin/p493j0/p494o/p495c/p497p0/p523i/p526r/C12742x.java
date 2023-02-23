package kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.reflect.jvm.internal.impl.descriptors.C13550w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
/* compiled from: constantValues.kt */
/* renamed from: kotlin.j0.o.c.p0.i.r.x */
/* loaded from: classes3.dex */
public final class C12742x extends AbstractC12706a0<Integer> {
    public C12742x(int i) {
        super(Integer.valueOf(i));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
    /* renamed from: a */
    public AbstractC12965b0 mo6871a(InterfaceC13305c0 interfaceC13305c0) {
        l.f(interfaceC13305c0, "module");
        InterfaceC13312e m4703a = C13550w.m4703a(interfaceC13305c0, C12059k.C12060a.f26838Z);
        AbstractC13010i0 mo5010x = m4703a == null ? null : m4703a.mo5010x();
        if (mo5010x == null) {
            AbstractC13010i0 m5811j = C13118t.m5811j("Unsigned type UInt not found");
            l.e(m5811j, "createErrorType(\"Unsigned type UInt not found\")");
            return m5811j;
        }
        return mo5010x;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
    public String toString() {
        return mo6905b().intValue() + ".toUInt()";
    }
}
