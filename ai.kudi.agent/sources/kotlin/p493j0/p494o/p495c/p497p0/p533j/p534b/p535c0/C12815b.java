package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p535c0;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11799i;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11865d;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.InterfaceC12035a;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12113c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p530v.C12761b;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12820d;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12889j;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12894m;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12886i;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12890k;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12899p;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12901q;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12905t;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.C13313e0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13335h0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13362a;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13364b;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13365c;
import kotlin.reflect.jvm.internal.impl.protobuf.C13575f;
/* compiled from: BuiltInsLoaderImpl.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.c0.b */
/* loaded from: classes3.dex */
public final class C12815b implements InterfaceC12035a {

    /* renamed from: b */
    private final C12819d f28729b = new C12819d();

    /* compiled from: BuiltInsLoaderImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.c0.b$a */
    /* loaded from: classes3.dex */
    /* synthetic */ class C12816a extends C11799i implements InterfaceC11767l<String, InputStream> {
        C12816a(C12819d c12819d) {
            super(1, c12819d);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "loadResource";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(C12819d.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: l */
        public final InputStream invoke(String str) {
            l.f(str, "p0");
            return ((C12819d) this.f26478d).m6697a(str);
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p498b.InterfaceC12035a
    /* renamed from: a */
    public InterfaceC13332g0 mo6701a(InterfaceC12954n interfaceC12954n, InterfaceC13305c0 interfaceC13305c0, Iterable<? extends InterfaceC13364b> iterable, InterfaceC13365c interfaceC13365c, InterfaceC13362a interfaceC13362a, boolean z) {
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC13305c0, "builtInsModule");
        l.f(iterable, "classDescriptorFactories");
        l.f(interfaceC13365c, "platformDependentDeclarationFilter");
        l.f(interfaceC13362a, "additionalClassPartsProvider");
        return m6700b(interfaceC12954n, interfaceC13305c0, C12059k.f26812o, iterable, interfaceC13365c, interfaceC13362a, z, new C12816a(this.f28729b));
    }

    /* renamed from: b */
    public final InterfaceC13332g0 m6700b(InterfaceC12954n interfaceC12954n, InterfaceC13305c0 interfaceC13305c0, Set<C12609c> set, Iterable<? extends InterfaceC13364b> iterable, InterfaceC13365c interfaceC13365c, InterfaceC13362a interfaceC13362a, boolean z, InterfaceC11767l<? super String, ? extends InputStream> interfaceC11767l) {
        int m3867o;
        List m3891e;
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC13305c0, "module");
        l.f(set, "packageFqNames");
        l.f(iterable, "classDescriptorFactories");
        l.f(interfaceC13365c, "platformDependentDeclarationFilter");
        l.f(interfaceC13362a, "additionalClassPartsProvider");
        l.f(interfaceC11767l, "loadResource");
        m3867o = C13728s.m3867o(set, 10);
        ArrayList<C12817c> arrayList = new ArrayList(m3867o);
        for (C12609c c12609c : set) {
            String m6703n = C12814a.f28728m.m6703n(c12609c);
            InputStream invoke = interfaceC11767l.invoke(m6703n);
            if (invoke != null) {
                arrayList.add(C12817c.f28730D.m6698a(c12609c, interfaceC12954n, interfaceC13305c0, invoke, z));
            } else {
                throw new IllegalStateException(l.m("Resource not found in classpath: ", m6703n));
            }
        }
        C13335h0 c13335h0 = new C13335h0(arrayList);
        C13313e0 c13313e0 = new C13313e0(interfaceC12954n, interfaceC13305c0);
        InterfaceC12890k.C12891a c12891a = InterfaceC12890k.C12891a.f28912a;
        C12894m c12894m = new C12894m(c13335h0);
        C12820d c12820d = new C12820d(interfaceC13305c0, c13313e0, C12814a.f28728m);
        InterfaceC12905t.C12906a c12906a = InterfaceC12905t.C12906a.f28937a;
        InterfaceC12899p interfaceC12899p = InterfaceC12899p.f28931a;
        l.e(interfaceC12899p, "DO_NOTHING");
        InterfaceC12113c.C12114a c12114a = InterfaceC12113c.C12114a.f27002a;
        InterfaceC12901q.C12902a c12902a = InterfaceC12901q.C12902a.f28932a;
        InterfaceC12886i m6513a = InterfaceC12886i.f28890a.m6513a();
        C13575f m6745e = C12814a.f28728m.m6745e();
        m3891e = C13726r.m3891e();
        C12889j c12889j = new C12889j(interfaceC12954n, interfaceC13305c0, c12891a, c12894m, c12820d, c13335h0, c12906a, interfaceC12899p, c12114a, c12902a, iterable, c13313e0, m6513a, interfaceC13362a, interfaceC13365c, m6745e, null, new C12761b(interfaceC12954n, m3891e), null, 327680, null);
        for (C12817c c12817c : arrayList) {
            c12817c.mo6463W0(c12889j);
        }
        return c13335h0;
    }
}
