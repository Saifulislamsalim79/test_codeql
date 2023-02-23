package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0;

import java.util.Map;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.C12245m;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12297y;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12298z;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12947h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.utils.C13634a;
/* compiled from: resolvers.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.d0.i */
/* loaded from: classes3.dex */
public final class C12175i implements InterfaceC12179l {

    /* renamed from: a */
    private final C12174h f27158a;

    /* renamed from: b */
    private final InterfaceC13513m f27159b;

    /* renamed from: c */
    private final int f27160c;

    /* renamed from: d */
    private final Map<InterfaceC12297y, Integer> f27161d;

    /* renamed from: e */
    private final InterfaceC12947h<InterfaceC12297y, C12245m> f27162e;

    /* compiled from: resolvers.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.i$a */
    /* loaded from: classes3.dex */
    static final class C12176a extends AbstractC11802m implements InterfaceC11767l<InterfaceC12297y, C12245m> {
        C12176a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final C12245m invoke(InterfaceC12297y interfaceC12297y) {
            l.f(interfaceC12297y, "typeParameter");
            Integer num = (Integer) C12175i.this.f27161d.get(interfaceC12297y);
            if (num == null) {
                return null;
            }
            C12175i c12175i = C12175i.this;
            return new C12245m(C12161a.m9578h(C12161a.m9584b(c12175i.f27158a, c12175i), c12175i.f27159b.mo4956y()), interfaceC12297y, c12175i.f27160c + num.intValue(), c12175i.f27159b);
        }
    }

    public C12175i(C12174h c12174h, InterfaceC13513m interfaceC13513m, InterfaceC12298z interfaceC12298z, int i) {
        l.f(c12174h, "c");
        l.f(interfaceC13513m, "containingDeclaration");
        l.f(interfaceC12298z, "typeParameterOwner");
        this.f27158a = c12174h;
        this.f27159b = interfaceC13513m;
        this.f27160c = i;
        this.f27161d = C13634a.m4284d(interfaceC12298z.mo4802l());
        this.f27162e = this.f27158a.m9534e().mo6362i(new C12176a());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.InterfaceC12179l
    /* renamed from: a */
    public InterfaceC13562z0 mo9523a(InterfaceC12297y interfaceC12297y) {
        l.f(interfaceC12297y, "javaTypeParameter");
        C12245m invoke = this.f27162e.invoke(interfaceC12297y);
        return invoke == null ? this.f27158a.m9533f().mo9523a(interfaceC12297y) : invoke;
    }
}
