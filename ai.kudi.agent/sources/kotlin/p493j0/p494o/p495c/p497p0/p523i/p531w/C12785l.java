package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w;

import java.util.List;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12671c;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12953m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
import kotlin.reflect.jvm.internal.impl.utils.C13653g;
/* compiled from: StaticScopeForKotlinEnum.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.l */
/* loaded from: classes3.dex */
public final class C12785l extends AbstractC12781i {

    /* renamed from: d */
    static final /* synthetic */ InterfaceC11872i<Object>[] f28672d = {C11813x.m10312f(new C11808s(C11813x.m10316b(C12785l.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: b */
    private final InterfaceC13312e f28673b;

    /* renamed from: c */
    private final InterfaceC12948i f28674c;

    /* compiled from: StaticScopeForKotlinEnum.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.l$a */
    /* loaded from: classes3.dex */
    static final class C12786a extends AbstractC11802m implements InterfaceC11756a<List<? extends InterfaceC13543t0>> {
        C12786a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<InterfaceC13543t0> invoke() {
            List<InterfaceC13543t0> m3888h;
            m3888h = C13726r.m3888h(C12671c.m7059d(C12785l.this.f28673b), C12671c.m7058e(C12785l.this.f28673b));
            return m3888h;
        }
    }

    public C12785l(InterfaceC12954n interfaceC12954n, InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC13312e, "containingClass");
        this.f28673b = interfaceC13312e;
        boolean z = interfaceC13312e.mo4957w() == EnumC13319f.ENUM_CLASS;
        if (C13668y.f30115a && !z) {
            throw new AssertionError(l.m("Class should be an enum: ", this.f28673b));
        }
        this.f28674c = interfaceC12954n.mo6367d(new C12786a());
    }

    /* renamed from: l */
    private final List<InterfaceC13543t0> m6769l() {
        return (List) C12953m.m6372a(this.f28674c, this, f28672d[0]);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC13334h mo5794f(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        return (InterfaceC13334h) m6772i(c12614f, interfaceC12112b);
    }

    /* renamed from: i */
    public Void m6772i(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: j */
    public List<InterfaceC13543t0> mo5112g(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        l.f(c12768d, "kindFilter");
        l.f(interfaceC11767l, "nameFilter");
        return m6769l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: k */
    public C13653g<InterfaceC13543t0> mo5117a(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        List<InterfaceC13543t0> m6769l = m6769l();
        C13653g<InterfaceC13543t0> c13653g = new C13653g<>();
        for (Object obj : m6769l) {
            if (l.b(((InterfaceC13543t0) obj).mo5012b(), c12614f)) {
                c13653g.add(obj);
            }
        }
        return c13653g;
    }
}
