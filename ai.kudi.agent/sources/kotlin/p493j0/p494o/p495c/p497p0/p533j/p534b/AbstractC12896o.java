package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12536l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12539m;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12545o;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12552p;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.AbstractC12587a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12594d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.C12871i;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12845f;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
/* compiled from: DeserializedPackageFragmentImpl.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.o */
/* loaded from: classes3.dex */
public abstract class AbstractC12896o extends AbstractC12895n {

    /* renamed from: A */
    private final C12915w f28923A;

    /* renamed from: B */
    private C12539m f28924B;

    /* renamed from: C */
    private InterfaceC12777h f28925C;

    /* renamed from: x */
    private final AbstractC12587a f28926x;

    /* renamed from: y */
    private final InterfaceC12845f f28927y;

    /* renamed from: z */
    private final C12594d f28928z;

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.o$a */
    /* loaded from: classes3.dex */
    static final class C12897a extends AbstractC11802m implements InterfaceC11767l<C12608b, InterfaceC13545u0> {
        C12897a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC13545u0 invoke(C12608b c12608b) {
            l.f(c12608b, "it");
            InterfaceC12845f interfaceC12845f = AbstractC12896o.this.f28927y;
            if (interfaceC12845f == null) {
                InterfaceC13545u0 interfaceC13545u0 = InterfaceC13545u0.f29903a;
                l.e(interfaceC13545u0, "NO_SOURCE");
                return interfaceC13545u0;
            }
            return interfaceC12845f;
        }
    }

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.o$b */
    /* loaded from: classes3.dex */
    static final class C12898b extends AbstractC11802m implements InterfaceC11756a<Collection<? extends C12614f>> {
        C12898b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final Collection<C12614f> invoke() {
            int m3867o;
            Collection<C12608b> m6428b = AbstractC12896o.this.mo6464U0().m6428b();
            ArrayList<C12608b> arrayList = new ArrayList();
            for (Object obj : m6428b) {
                C12608b c12608b = (C12608b) obj;
                if ((c12608b.m7385l() || C12882h.f28883c.m6515a().contains(c12608b)) ? false : true) {
                    arrayList.add(obj);
                }
            }
            m3867o = C13728s.m3867o(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m3867o);
            for (C12608b c12608b2 : arrayList) {
                arrayList2.add(c12608b2.m7387j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12896o(C12609c c12609c, InterfaceC12954n interfaceC12954n, InterfaceC13305c0 interfaceC13305c0, C12539m c12539m, AbstractC12587a abstractC12587a, InterfaceC12845f interfaceC12845f) {
        super(c12609c, interfaceC12954n, interfaceC13305c0);
        l.f(c12609c, "fqName");
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC13305c0, "module");
        l.f(c12539m, "proto");
        l.f(abstractC12587a, "metadataVersion");
        this.f28926x = abstractC12587a;
        this.f28927y = interfaceC12845f;
        C12552p m8031O = c12539m.m8031O();
        l.e(m8031O, "proto.strings");
        C12545o m8032N = c12539m.m8032N();
        l.e(m8032N, "proto.qualifiedNames");
        C12594d c12594d = new C12594d(m8031O, m8032N);
        this.f28928z = c12594d;
        this.f28923A = new C12915w(c12539m, c12594d, this.f28926x, new C12897a());
        this.f28924B = c12539m;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.AbstractC12895n
    /* renamed from: W0 */
    public void mo6463W0(C12889j c12889j) {
        l.f(c12889j, "components");
        C12539m c12539m = this.f28924B;
        if (c12539m != null) {
            this.f28924B = null;
            C12536l m8033M = c12539m.m8033M();
            l.e(m8033M, "proto.`package`");
            this.f28925C = new C12871i(this, m8033M, this.f28928z, this.f28926x, this.f28927y, c12889j, new C12898b());
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.AbstractC12895n
    /* renamed from: Y0 */
    public C12915w mo6464U0() {
        return this.f28923A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0
    /* renamed from: u */
    public InterfaceC12777h mo5125u() {
        InterfaceC12777h interfaceC12777h = this.f28925C;
        if (interfaceC12777h != null) {
            return interfaceC12777h;
        }
        l.u("_memberScope");
        throw null;
    }
}
