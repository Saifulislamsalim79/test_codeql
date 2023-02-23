package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p524q.p525a.C12702d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13553w0;
import kotlin.reflect.jvm.internal.impl.utils.C13634a;
/* compiled from: SubstitutingScope.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.m */
/* loaded from: classes3.dex */
public final class C12787m implements InterfaceC12777h {

    /* renamed from: b */
    private final InterfaceC12777h f28676b;

    /* renamed from: c */
    private final C12959a1 f28677c;

    /* renamed from: d */
    private Map<InterfaceC13513m, InterfaceC13513m> f28678d;

    /* renamed from: e */
    private final InterfaceC11824h f28679e;

    /* compiled from: SubstitutingScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.m$a */
    /* loaded from: classes3.dex */
    static final class C12788a extends AbstractC11802m implements InterfaceC11756a<Collection<? extends InterfaceC13513m>> {
        C12788a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final Collection<InterfaceC13513m> invoke() {
            C12787m c12787m = C12787m.this;
            return c12787m.m6764k(InterfaceC12783k.C12784a.m6774a(c12787m.f28676b, null, null, 3, null));
        }
    }

    public C12787m(InterfaceC12777h interfaceC12777h, C12959a1 c12959a1) {
        InterfaceC11824h m5625b;
        l.f(interfaceC12777h, "workerScope");
        l.f(c12959a1, "givenSubstitutor");
        this.f28676b = interfaceC12777h;
        AbstractC13137y0 m6339j = c12959a1.m6339j();
        l.e(m6339j, "givenSubstitutor.substitution");
        this.f28677c = C12702d.m6923f(m6339j, false, 1, null).m5750c();
        m5625b = C13218k.m5625b(new C12788a());
        this.f28679e = m5625b;
    }

    /* renamed from: j */
    private final Collection<InterfaceC13513m> m6765j() {
        return (Collection) this.f28679e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final <D extends InterfaceC13513m> Collection<D> m6764k(Collection<? extends D> collection) {
        if (this.f28677c.m6338k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet m4281g = C13634a.m4281g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m4281g.add(m6763l((InterfaceC13513m) it.next()));
        }
        return m4281g;
    }

    /* renamed from: l */
    private final <D extends InterfaceC13513m> D m6763l(D d) {
        if (this.f28677c.m6338k()) {
            return d;
        }
        if (this.f28678d == null) {
            this.f28678d = new HashMap();
        }
        Map<InterfaceC13513m, InterfaceC13513m> map = this.f28678d;
        l.d(map);
        InterfaceC13513m interfaceC13513m = map.get(d);
        if (interfaceC13513m == null) {
            if (!(d instanceof InterfaceC13553w0)) {
                throw new IllegalStateException(l.m("Unknown descriptor in scope: ", d).toString());
            }
            interfaceC13513m = ((InterfaceC13553w0) d).mo4686e(this.f28677c);
            if (interfaceC13513m != null) {
                map.put(d, interfaceC13513m);
            } else {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
            }
        }
        return (D) interfaceC13513m;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: a */
    public Collection<? extends InterfaceC13543t0> mo5117a(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        return m6764k(this.f28676b.mo5117a(c12614f, interfaceC12112b));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: b */
    public Set<C12614f> mo5116b() {
        return this.f28676b.mo5116b();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: c */
    public Collection<? extends InterfaceC13518o0> mo5115c(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        return m6764k(this.f28676b.mo5115c(c12614f, interfaceC12112b));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: d */
    public Set<C12614f> mo5114d() {
        return this.f28676b.mo5114d();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: e */
    public Set<C12614f> mo5113e() {
        return this.f28676b.mo5113e();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: f */
    public InterfaceC13334h mo5794f(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        InterfaceC13334h mo5794f = this.f28676b.mo5794f(c12614f, interfaceC12112b);
        if (mo5794f == null) {
            return null;
        }
        return (InterfaceC13334h) m6763l(mo5794f);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: g */
    public Collection<InterfaceC13513m> mo5112g(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        l.f(c12768d, "kindFilter");
        l.f(interfaceC11767l, "nameFilter");
        return m6765j();
    }
}
