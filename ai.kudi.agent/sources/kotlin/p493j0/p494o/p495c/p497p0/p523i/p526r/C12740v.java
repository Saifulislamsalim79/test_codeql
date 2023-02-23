package kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
/* compiled from: constantValues.kt */
/* renamed from: kotlin.j0.o.c.p0.i.r.v */
/* loaded from: classes3.dex */
public final class C12740v extends AbstractC12712g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12740v(String str) {
        super(str);
        l.f(str, "value");
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
    /* renamed from: c */
    public AbstractC13010i0 mo6871a(InterfaceC13305c0 interfaceC13305c0) {
        l.f(interfaceC13305c0, "module");
        AbstractC13010i0 m9912V = interfaceC13305c0.mo4979s().m9912V();
        l.e(m9912V, "module.builtIns.stringType");
        return m9912V;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
    public String toString() {
        return '\"' + mo6905b() + '\"';
    }
}
