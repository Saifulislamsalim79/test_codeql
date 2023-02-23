package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: StarProjectionImpl.kt */
/* renamed from: kotlin.j0.o.c.p0.l.o0 */
/* loaded from: classes3.dex */
public final class C13104o0 {

    /* compiled from: StarProjectionImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.o0$a */
    /* loaded from: classes3.dex */
    public static final class C13105a extends AbstractC13127u0 {

        /* renamed from: c */
        final /* synthetic */ List<InterfaceC13125t0> f29178c;

        /* JADX WARN: Multi-variable type inference failed */
        C13105a(List<? extends InterfaceC13125t0> list) {
            this.f29178c = list;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13127u0
        /* renamed from: j */
        public InterfaceC13131v0 mo5781j(InterfaceC13125t0 interfaceC13125t0) {
            l.f(interfaceC13125t0, "key");
            if (this.f29178c.contains(interfaceC13125t0)) {
                InterfaceC13334h mo5206d = interfaceC13125t0.mo5206d();
                if (mo5206d != null) {
                    return C12974c1.m6283s((InterfaceC13562z0) mo5206d);
                }
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final AbstractC12965b0 m5857a(InterfaceC13562z0 interfaceC13562z0) {
        int m3867o;
        l.f(interfaceC13562z0, "<this>");
        List<InterfaceC13562z0> mo5207c = ((InterfaceC13360i) interfaceC13562z0.mo4687d()).mo4649n().mo5207c();
        l.e(mo5207c, "classDescriptor.typeConstructor.parameters");
        m3867o = C13728s.m3867o(mo5207c, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (InterfaceC13562z0 interfaceC13562z02 : mo5207c) {
            arrayList.add(interfaceC13562z02.mo4649n());
        }
        C12959a1 m6342g = C12959a1.m6342g(new C13105a(arrayList));
        List<AbstractC12965b0> upperBounds = interfaceC13562z0.getUpperBounds();
        l.e(upperBounds, "this.upperBounds");
        AbstractC12965b0 m6333p = m6342g.m6333p((AbstractC12965b0) C13722p.m3954R(upperBounds), EnumC13008h1.OUT_VARIANCE);
        if (m6333p == null) {
            AbstractC13010i0 m9861y = C12747a.m6863g(interfaceC13562z0).m9861y();
            l.e(m9861y, "builtIns.defaultBound");
            return m9861y;
        }
        return m6333p;
    }
}
