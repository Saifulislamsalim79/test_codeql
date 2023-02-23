package kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r;

import java.util.List;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
/* compiled from: constantValues.kt */
/* renamed from: kotlin.j0.o.c.p0.i.r.b */
/* loaded from: classes3.dex */
public final class C12707b extends AbstractC12712g<List<? extends AbstractC12712g<?>>> {

    /* renamed from: b */
    private final InterfaceC11767l<InterfaceC13305c0, AbstractC12965b0> f28569b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12707b(List<? extends AbstractC12712g<?>> list, InterfaceC11767l<? super InterfaceC13305c0, ? extends AbstractC12965b0> interfaceC11767l) {
        super(list);
        l.f(list, "value");
        l.f(interfaceC11767l, "computeType");
        this.f28569b = interfaceC11767l;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
    /* renamed from: a */
    public AbstractC12965b0 mo6871a(InterfaceC13305c0 interfaceC13305c0) {
        l.f(interfaceC13305c0, "module");
        AbstractC12965b0 invoke = this.f28569b.invoke(interfaceC13305c0);
        boolean z = AbstractC12046h.m9904b0(invoke) || AbstractC12046h.m9881n0(invoke) || AbstractC12046h.m9933A0(invoke);
        if (!C13668y.f30115a || z) {
            return invoke;
        }
        throw new AssertionError("Type should be an array, but was " + invoke + ": " + mo6905b());
    }
}
