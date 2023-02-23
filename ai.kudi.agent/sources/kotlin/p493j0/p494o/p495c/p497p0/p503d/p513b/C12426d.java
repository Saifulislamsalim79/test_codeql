package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q.C12087f;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12113c;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12172g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12497g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p530v.C12761b;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12889j;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12886i;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12890k;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12899p;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12905t;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13036m;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.C13313e0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13362a;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13365c;
import kotlin.reflect.jvm.internal.impl.protobuf.C13575f;
/* compiled from: DeserializationComponentsForJava.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.d */
/* loaded from: classes3.dex */
public final class C12426d {

    /* renamed from: a */
    private final C12889j f27599a;

    public C12426d(InterfaceC12954n interfaceC12954n, InterfaceC13305c0 interfaceC13305c0, InterfaceC12890k interfaceC12890k, C12430f c12430f, C12420b c12420b, C12172g c12172g, C13313e0 c13313e0, InterfaceC12899p interfaceC12899p, InterfaceC12113c interfaceC12113c, InterfaceC12886i interfaceC12886i, InterfaceC13036m interfaceC13036m) {
        List m3891e;
        List m3891e2;
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC13305c0, "moduleDescriptor");
        l.f(interfaceC12890k, "configuration");
        l.f(c12430f, "classDataFinder");
        l.f(c12420b, "annotationAndConstantLoader");
        l.f(c12172g, "packageFragmentProvider");
        l.f(c13313e0, "notFoundClasses");
        l.f(interfaceC12899p, "errorReporter");
        l.f(interfaceC12113c, "lookupTracker");
        l.f(interfaceC12886i, "contractDeserializer");
        l.f(interfaceC13036m, "kotlinTypeChecker");
        AbstractC12046h mo4979s = interfaceC13305c0.mo4979s();
        C12087f c12087f = mo4979s instanceof C12087f ? (C12087f) mo4979s : null;
        InterfaceC12905t.C12906a c12906a = InterfaceC12905t.C12906a.f28937a;
        C12431g c12431g = C12431g.f27610a;
        m3891e = C13726r.m3891e();
        InterfaceC13362a m9738F0 = c12087f == null ? null : c12087f.m9738F0();
        InterfaceC13362a interfaceC13362a = m9738F0 == null ? InterfaceC13362a.C13363a.f29579a : m9738F0;
        InterfaceC13365c m9738F02 = c12087f != null ? c12087f.m9738F0() : null;
        InterfaceC13365c interfaceC13365c = m9738F02 == null ? InterfaceC13365c.C13367b.f29581a : m9738F02;
        C13575f m8640a = C12497g.f27759a.m8640a();
        m3891e2 = C13726r.m3891e();
        this.f27599a = new C12889j(interfaceC12954n, interfaceC13305c0, interfaceC12890k, c12430f, c12420b, c12172g, c12906a, interfaceC12899p, interfaceC12113c, c12431g, m3891e, c13313e0, interfaceC12886i, interfaceC13362a, interfaceC13365c, m8640a, interfaceC13036m, new C12761b(interfaceC12954n, m3891e2), null, 262144, null);
    }

    /* renamed from: a */
    public final C12889j m8944a() {
        return this.f27599a;
    }
}
