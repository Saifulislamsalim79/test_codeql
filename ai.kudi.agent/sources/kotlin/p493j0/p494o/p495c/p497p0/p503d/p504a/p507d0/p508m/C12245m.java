package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.EnumC12143k;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12169e;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12174h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p509n.C12251d;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12280j;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12297y;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13381b;
/* compiled from: LazyJavaTypeParameterDescriptor.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.m */
/* loaded from: classes3.dex */
public final class C12245m extends AbstractC13381b {

    /* renamed from: C */
    private final C12174h f27300C;

    /* renamed from: D */
    private final InterfaceC12297y f27301D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12245m(C12174h c12174h, InterfaceC12297y interfaceC12297y, int i, InterfaceC13513m interfaceC13513m) {
        super(c12174h.m9534e(), interfaceC13513m, new C12169e(c12174h, interfaceC12297y, false, 4, null), interfaceC12297y.mo4785b(), EnumC13008h1.INVARIANT, false, i, InterfaceC13545u0.f29903a, c12174h.m9538a().m9552v());
        l.f(c12174h, "c");
        l.f(interfaceC12297y, "javaTypeParameter");
        l.f(interfaceC13513m, "containingDeclaration");
        this.f27300C = c12174h;
        this.f27301D = interfaceC12297y;
    }

    /* renamed from: X0 */
    private final List<AbstractC12965b0> m9332X0() {
        int m3867o;
        List<AbstractC12965b0> m3901b;
        Collection<InterfaceC12280j> upperBounds = this.f27301D.getUpperBounds();
        if (upperBounds.isEmpty()) {
            C12969c0 c12969c0 = C12969c0.f29026a;
            AbstractC13010i0 m9892i = this.f27300C.m9535d().mo4979s().m9892i();
            l.e(m9892i, "c.module.builtIns.anyType");
            AbstractC13010i0 m9924I = this.f27300C.m9535d().mo4979s().m9924I();
            l.e(m9924I, "c.module.builtIns.nullableAnyType");
            m3901b = C13724q.m3901b(C12969c0.m6314d(m9892i, m9924I));
            return m3901b;
        }
        m3867o = C13728s.m3867o(upperBounds, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (InterfaceC12280j interfaceC12280j : upperBounds) {
            arrayList.add(this.f27300C.m9532g().m9309n(interfaceC12280j, C12251d.m9300f(EnumC12143k.COMMON, false, this, 1, null)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13391e
    /* renamed from: U0 */
    protected List<AbstractC12965b0> mo5211U0(List<? extends AbstractC12965b0> list) {
        l.f(list, "bounds");
        return this.f27300C.m9538a().m9556r().m9188g(this, list, this.f27300C);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13391e
    /* renamed from: V0 */
    protected void mo5152V0(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "type");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13391e
    /* renamed from: W0 */
    protected List<AbstractC12965b0> mo5151W0() {
        return m9332X0();
    }
}
