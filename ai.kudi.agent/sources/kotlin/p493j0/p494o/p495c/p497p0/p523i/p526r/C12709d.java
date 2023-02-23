package kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
/* compiled from: constantValues.kt */
/* renamed from: kotlin.j0.o.c.p0.i.r.d */
/* loaded from: classes3.dex */
public final class C12709d extends AbstractC12729o<Byte> {
    public C12709d(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
    /* renamed from: c */
    public AbstractC13010i0 mo6871a(InterfaceC13305c0 interfaceC13305c0) {
        l.f(interfaceC13305c0, "module");
        AbstractC13010i0 m9870t = interfaceC13305c0.mo4979s().m9870t();
        l.e(m9870t, "module.builtIns.byteType");
        return m9870t;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
    public String toString() {
        return mo6905b().intValue() + ".toByte()";
    }
}
