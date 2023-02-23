package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.AbstractC12849h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13446z;
/* compiled from: DeserializedPackageFragment.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.n */
/* loaded from: classes3.dex */
public abstract class AbstractC12895n extends AbstractC13446z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12895n(C12609c c12609c, InterfaceC12954n interfaceC12954n, InterfaceC13305c0 interfaceC13305c0) {
        super(interfaceC13305c0, c12609c);
        l.f(c12609c, "fqName");
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC13305c0, "module");
    }

    /* renamed from: U0 */
    public abstract InterfaceC12881g mo6464U0();

    /* renamed from: V0 */
    public boolean m6465V0(C12614f c12614f) {
        l.f(c12614f, "name");
        InterfaceC12777h mo5125u = mo5125u();
        return (mo5125u instanceof AbstractC12849h) && ((AbstractC12849h) mo5125u).m6623r().contains(c12614f);
    }

    /* renamed from: W0 */
    public abstract void mo6463W0(C12889j c12889j);
}
