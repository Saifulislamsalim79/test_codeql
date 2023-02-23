package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0;

import java.util.Iterator;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.C12127c;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12947h;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: LazyJavaAnnotations.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.d0.e */
/* loaded from: classes3.dex */
public final class C12169e implements InterfaceC13346g {

    /* renamed from: c */
    private final C12174h f27144c;

    /* renamed from: d */
    private final InterfaceC12272d f27145d;

    /* renamed from: e */
    private final boolean f27146e;

    /* renamed from: f */
    private final InterfaceC12947h<InterfaceC12265a, InterfaceC13340c> f27147f;

    /* compiled from: LazyJavaAnnotations.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.e$a */
    /* loaded from: classes3.dex */
    static final class C12170a extends AbstractC11802m implements InterfaceC11767l<InterfaceC12265a, InterfaceC13340c> {
        C12170a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC13340c invoke(InterfaceC12265a interfaceC12265a) {
            l.f(interfaceC12265a, "annotation");
            return C12127c.f27062a.m9652e(interfaceC12265a, C12169e.this.f27144c, C12169e.this.f27146e);
        }
    }

    public C12169e(C12174h c12174h, InterfaceC12272d interfaceC12272d, boolean z) {
        l.f(c12174h, "c");
        l.f(interfaceC12272d, "annotationOwner");
        this.f27144c = c12174h;
        this.f27145d = interfaceC12272d;
        this.f27146e = z;
        this.f27147f = c12174h.m9538a().m9553u().mo6362i(new C12170a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    /* renamed from: Q */
    public boolean mo5304Q(C12609c c12609c) {
        return InterfaceC13346g.C13349b.m5314b(this, c12609c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    public boolean isEmpty() {
        return this.f27145d.mo4770y().isEmpty() && !this.f27145d.mo4771q();
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC13340c> iterator() {
        InterfaceC13230h m3818H;
        InterfaceC13230h m5569r;
        InterfaceC13230h m5566u;
        InterfaceC13230h m5572o;
        m3818H = C13742z.m3818H(this.f27145d.mo4770y());
        m5569r = C13242n.m5569r(m3818H, this.f27147f);
        m5566u = C13242n.m5566u(m5569r, C12127c.f27062a.m9656a(C12059k.C12060a.f26861n, this.f27145d, this.f27144c));
        m5572o = C13242n.m5572o(m5566u);
        return m5572o.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    /* renamed from: r */
    public InterfaceC13340c mo5302r(C12609c c12609c) {
        l.f(c12609c, "fqName");
        InterfaceC12265a mo4777r = this.f27145d.mo4777r(c12609c);
        InterfaceC13340c invoke = mo4777r == null ? null : this.f27147f.invoke(mo4777r);
        return invoke == null ? C12127c.f27062a.m9656a(c12609c, this.f27145d, this.f27144c) : invoke;
    }

    public /* synthetic */ C12169e(C12174h c12174h, InterfaceC12272d interfaceC12272d, boolean z, int i, g gVar) {
        this(c12174h, interfaceC12272d, (i & 4) != 0 ? false : z);
    }
}
