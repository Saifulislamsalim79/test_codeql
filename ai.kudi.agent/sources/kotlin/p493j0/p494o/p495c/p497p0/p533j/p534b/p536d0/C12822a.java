package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0;

import java.util.Iterator;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12953m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: DeserializedAnnotations.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.d0.a */
/* loaded from: classes3.dex */
public class C12822a implements InterfaceC13346g {

    /* renamed from: d */
    static final /* synthetic */ InterfaceC11872i<Object>[] f28734d = {C11813x.m10312f(new C11808s(C11813x.m10316b(C12822a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: c */
    private final InterfaceC12948i f28735c;

    public C12822a(InterfaceC12954n interfaceC12954n, InterfaceC11756a<? extends List<? extends InterfaceC13340c>> interfaceC11756a) {
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC11756a, "compute");
        this.f28735c = interfaceC12954n.mo6367d(interfaceC11756a);
    }

    /* renamed from: e */
    private final List<InterfaceC13340c> m6685e() {
        return (List) C12953m.m6372a(this.f28735c, this, f28734d[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    /* renamed from: Q */
    public boolean mo5304Q(C12609c c12609c) {
        return InterfaceC13346g.C13349b.m5314b(this, c12609c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    public boolean isEmpty() {
        return m6685e().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC13340c> iterator() {
        return m6685e().iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
    /* renamed from: r */
    public InterfaceC13340c mo5302r(C12609c c12609c) {
        return InterfaceC13346g.C13349b.m5315a(this, c12609c);
    }
}
