package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p474a0.C11703b;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12789n;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13072h;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: IntersectionTypeConstructor.kt */
/* renamed from: kotlin.j0.o.c.p0.l.a0 */
/* loaded from: classes3.dex */
public final class C12956a0 implements InterfaceC13125t0, InterfaceC13072h {

    /* renamed from: a */
    private AbstractC12965b0 f29013a;

    /* renamed from: b */
    private final LinkedHashSet<AbstractC12965b0> f29014b;

    /* renamed from: c */
    private final int f29015c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntersectionTypeConstructor.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.a0$a */
    /* loaded from: classes3.dex */
    public static final class C12957a extends AbstractC11802m implements InterfaceC11767l<AbstractC13026h, AbstractC13010i0> {
        C12957a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final AbstractC13010i0 invoke(AbstractC13026h abstractC13026h) {
            l.f(abstractC13026h, "kotlinTypeRefiner");
            return C12956a0.this.mo5217b(abstractC13026h).m6354h();
        }
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.a0$b */
    /* loaded from: classes3.dex */
    public static final class C12958b<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m10416a;
            m10416a = C11703b.m10416a(((AbstractC12965b0) t).toString(), ((AbstractC12965b0) t2).toString());
            return m10416a;
        }
    }

    public C12956a0(Collection<? extends AbstractC12965b0> collection) {
        l.f(collection, "typesToIntersect");
        boolean z = !collection.isEmpty();
        if (C13668y.f30115a && !z) {
            throw new AssertionError("Attempt to create an empty intersection");
        }
        LinkedHashSet<AbstractC12965b0> linkedHashSet = new LinkedHashSet<>(collection);
        this.f29014b = linkedHashSet;
        this.f29015c = linkedHashSet.hashCode();
    }

    /* renamed from: j */
    private final String m6352j(Iterable<? extends AbstractC12965b0> iterable) {
        List m3777u0;
        String m3797a0;
        m3777u0 = C13742z.m3777u0(iterable, new C12958b());
        m3797a0 = C13742z.m3797a0(m3777u0, " & ", "{", "}", 0, null, null, 56, null);
        return m3797a0;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: a */
    public Collection<AbstractC12965b0> mo5218a() {
        return this.f29014b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: c */
    public List<InterfaceC13562z0> mo5207c() {
        List<InterfaceC13562z0> m3891e;
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: d */
    public InterfaceC13334h mo5206d() {
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: e */
    public boolean mo5205e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12956a0) {
            return l.b(this.f29014b, ((C12956a0) obj).f29014b);
        }
        return false;
    }

    /* renamed from: g */
    public final InterfaceC12777h m6355g() {
        return C12789n.f28681c.m6759a("member scope for intersection type", this.f29014b);
    }

    /* renamed from: h */
    public final AbstractC13010i0 m6354h() {
        List m3891e;
        C12969c0 c12969c0 = C12969c0.f29026a;
        InterfaceC13346g m5317b = InterfaceC13346g.f29516s.m5317b();
        m3891e = C13726r.m3891e();
        return C12969c0.m6307k(m5317b, this, m3891e, false, m6355g(), new C12957a());
    }

    public int hashCode() {
        return this.f29015c;
    }

    /* renamed from: i */
    public final AbstractC12965b0 m6353i() {
        return this.f29013a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: k */
    public C12956a0 mo5217b(AbstractC13026h abstractC13026h) {
        int m3867o;
        l.f(abstractC13026h, "kotlinTypeRefiner");
        Collection<AbstractC12965b0> mo5218a = mo5218a();
        m3867o = C13728s.m3867o(mo5218a, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        boolean z = false;
        for (AbstractC12965b0 abstractC12965b0 : mo5218a) {
            arrayList.add(abstractC12965b0.mo5768Y0(abstractC13026h));
            z = true;
        }
        C12956a0 c12956a0 = null;
        if (z) {
            AbstractC12965b0 m6353i = m6353i();
            c12956a0 = new C12956a0(arrayList).m6350l(m6353i != null ? m6353i.mo5768Y0(abstractC13026h) : null);
        }
        return c12956a0 == null ? this : c12956a0;
    }

    /* renamed from: l */
    public final C12956a0 m6350l(AbstractC12965b0 abstractC12965b0) {
        return new C12956a0(this.f29014b, abstractC12965b0);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: s */
    public AbstractC12046h mo5199s() {
        AbstractC12046h mo5199s = this.f29014b.iterator().next().mo5779W0().mo5199s();
        l.e(mo5199s, "intersectedTypes.iterator().next().constructor.builtIns");
        return mo5199s;
    }

    public String toString() {
        return m6352j(this.f29014b);
    }

    private C12956a0(Collection<? extends AbstractC12965b0> collection, AbstractC12965b0 abstractC12965b0) {
        this(collection);
        this.f29013a = abstractC12965b0;
    }
}
