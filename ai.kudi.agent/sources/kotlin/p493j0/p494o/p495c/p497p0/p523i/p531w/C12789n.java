package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C13287o;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12693l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.p546n.C13177a;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
import kotlin.reflect.jvm.internal.impl.utils.C13653g;
/* compiled from: TypeIntersectionScope.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.n */
/* loaded from: classes3.dex */
public final class C12789n extends AbstractC12762a {

    /* renamed from: c */
    public static final C12790a f28681c = new C12790a(null);

    /* renamed from: b */
    private final InterfaceC12777h f28682b;

    /* compiled from: TypeIntersectionScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.n$a */
    /* loaded from: classes3.dex */
    public static final class C12790a {
        private C12790a() {
        }

        public /* synthetic */ C12790a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC12777h m6759a(String str, Collection<? extends AbstractC12965b0> collection) {
            int m3867o;
            l.f(str, MetricTracker.Object.MESSAGE);
            l.f(collection, "types");
            m3867o = C13728s.m3867o(collection, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (AbstractC12965b0 abstractC12965b0 : collection) {
                arrayList.add(abstractC12965b0.mo5775u());
            }
            C13653g<InterfaceC12777h> m5708b = C13177a.m5708b(arrayList);
            InterfaceC12777h m6813b = C12763b.f28629d.m6813b(str, m5708b);
            return m5708b.size() <= 1 ? m6813b : new C12789n(str, m6813b, null);
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.n$b */
    /* loaded from: classes3.dex */
    static final class C12791b extends AbstractC11802m implements InterfaceC11767l<InterfaceC13293a, InterfaceC13293a> {

        /* renamed from: c */
        public static final C12791b f28683c = new C12791b();

        C12791b() {
            super(1);
        }

        /* renamed from: a */
        public final InterfaceC13293a m6758a(InterfaceC13293a interfaceC13293a) {
            l.f(interfaceC13293a, "$this$selectMostSpecificInEachOverridableGroup");
            return interfaceC13293a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ InterfaceC13293a invoke(InterfaceC13293a interfaceC13293a) {
            InterfaceC13293a interfaceC13293a2 = interfaceC13293a;
            m6758a(interfaceC13293a2);
            return interfaceC13293a2;
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.n$c */
    /* loaded from: classes3.dex */
    static final class C12792c extends AbstractC11802m implements InterfaceC11767l<InterfaceC13543t0, InterfaceC13293a> {

        /* renamed from: c */
        public static final C12792c f28684c = new C12792c();

        C12792c() {
            super(1);
        }

        /* renamed from: a */
        public final InterfaceC13293a m6757a(InterfaceC13543t0 interfaceC13543t0) {
            l.f(interfaceC13543t0, "$this$selectMostSpecificInEachOverridableGroup");
            return interfaceC13543t0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ InterfaceC13293a invoke(InterfaceC13543t0 interfaceC13543t0) {
            InterfaceC13543t0 interfaceC13543t02 = interfaceC13543t0;
            m6757a(interfaceC13543t02);
            return interfaceC13543t02;
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.n$d */
    /* loaded from: classes3.dex */
    static final class C12793d extends AbstractC11802m implements InterfaceC11767l<InterfaceC13518o0, InterfaceC13293a> {

        /* renamed from: c */
        public static final C12793d f28685c = new C12793d();

        C12793d() {
            super(1);
        }

        /* renamed from: a */
        public final InterfaceC13293a m6756a(InterfaceC13518o0 interfaceC13518o0) {
            l.f(interfaceC13518o0, "$this$selectMostSpecificInEachOverridableGroup");
            return interfaceC13518o0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ InterfaceC13293a invoke(InterfaceC13518o0 interfaceC13518o0) {
            InterfaceC13518o0 interfaceC13518o02 = interfaceC13518o0;
            m6756a(interfaceC13518o02);
            return interfaceC13518o02;
        }
    }

    private C12789n(String str, InterfaceC12777h interfaceC12777h) {
        this.f28682b = interfaceC12777h;
    }

    public /* synthetic */ C12789n(String str, InterfaceC12777h interfaceC12777h, g gVar) {
        this(str, interfaceC12777h);
    }

    /* renamed from: j */
    public static final InterfaceC12777h m6760j(String str, Collection<? extends AbstractC12965b0> collection) {
        return f28681c.m6759a(str, collection);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12762a, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: a */
    public Collection<InterfaceC13543t0> mo5117a(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        return C12693l.m6940a(super.mo5117a(c12614f, interfaceC12112b), C12792c.f28684c);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12762a, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: c */
    public Collection<InterfaceC13518o0> mo5115c(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        return C12693l.m6940a(super.mo5115c(c12614f, interfaceC12112b), C12793d.f28685c);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12762a, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: g */
    public Collection<InterfaceC13513m> mo5112g(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        List m3784n0;
        l.f(c12768d, "kindFilter");
        l.f(interfaceC11767l, "nameFilter");
        Collection<InterfaceC13513m> mo5112g = super.mo5112g(c12768d, interfaceC11767l);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : mo5112g) {
            if (((InterfaceC13513m) obj) instanceof InterfaceC13293a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        C13287o c13287o = new C13287o(arrayList, arrayList2);
        m3784n0 = C13742z.m3784n0(C12693l.m6940a((List) c13287o.m5366a(), C12791b.f28683c), (List) c13287o.m5365b());
        return m3784n0;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12762a
    /* renamed from: i */
    protected InterfaceC12777h mo6761i() {
        return this.f28682b;
    }
}
