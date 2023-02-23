package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import java.util.List;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12113c;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.AbstractC12587a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12598g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12604i;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p530v.InterfaceC12760a;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12845f;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13036m;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.C13313e0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13362a;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13364b;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13365c;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13369e;
import kotlin.reflect.jvm.internal.impl.protobuf.C13575f;
/* compiled from: context.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.j */
/* loaded from: classes3.dex */
public final class C12889j {

    /* renamed from: a */
    private final InterfaceC12954n f28893a;

    /* renamed from: b */
    private final InterfaceC13305c0 f28894b;

    /* renamed from: c */
    private final InterfaceC12890k f28895c;

    /* renamed from: d */
    private final InterfaceC12881g f28896d;

    /* renamed from: e */
    private final InterfaceC12813c<InterfaceC13340c, AbstractC12712g<?>> f28897e;

    /* renamed from: f */
    private final InterfaceC13332g0 f28898f;

    /* renamed from: g */
    private final InterfaceC12905t f28899g;

    /* renamed from: h */
    private final InterfaceC12899p f28900h;

    /* renamed from: i */
    private final InterfaceC12113c f28901i;

    /* renamed from: j */
    private final InterfaceC12901q f28902j;

    /* renamed from: k */
    private final Iterable<InterfaceC13364b> f28903k;

    /* renamed from: l */
    private final C13313e0 f28904l;

    /* renamed from: m */
    private final InterfaceC12886i f28905m;

    /* renamed from: n */
    private final InterfaceC13362a f28906n;

    /* renamed from: o */
    private final InterfaceC13365c f28907o;

    /* renamed from: p */
    private final C13575f f28908p;

    /* renamed from: q */
    private final InterfaceC13036m f28909q;

    /* renamed from: r */
    private final InterfaceC13369e f28910r;

    /* renamed from: s */
    private final C12882h f28911s;

    /* JADX WARN: Multi-variable type inference failed */
    public C12889j(InterfaceC12954n interfaceC12954n, InterfaceC13305c0 interfaceC13305c0, InterfaceC12890k interfaceC12890k, InterfaceC12881g interfaceC12881g, InterfaceC12813c<? extends InterfaceC13340c, ? extends AbstractC12712g<?>> interfaceC12813c, InterfaceC13332g0 interfaceC13332g0, InterfaceC12905t interfaceC12905t, InterfaceC12899p interfaceC12899p, InterfaceC12113c interfaceC12113c, InterfaceC12901q interfaceC12901q, Iterable<? extends InterfaceC13364b> iterable, C13313e0 c13313e0, InterfaceC12886i interfaceC12886i, InterfaceC13362a interfaceC13362a, InterfaceC13365c interfaceC13365c, C13575f c13575f, InterfaceC13036m interfaceC13036m, InterfaceC12760a interfaceC12760a, InterfaceC13369e interfaceC13369e) {
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC13305c0, "moduleDescriptor");
        l.f(interfaceC12890k, "configuration");
        l.f(interfaceC12881g, "classDataFinder");
        l.f(interfaceC12813c, "annotationAndConstantLoader");
        l.f(interfaceC13332g0, "packageFragmentProvider");
        l.f(interfaceC12905t, "localClassifierTypeSettings");
        l.f(interfaceC12899p, "errorReporter");
        l.f(interfaceC12113c, "lookupTracker");
        l.f(interfaceC12901q, "flexibleTypeDeserializer");
        l.f(iterable, "fictitiousClassDescriptorFactories");
        l.f(c13313e0, "notFoundClasses");
        l.f(interfaceC12886i, "contractDeserializer");
        l.f(interfaceC13362a, "additionalClassPartsProvider");
        l.f(interfaceC13365c, "platformDependentDeclarationFilter");
        l.f(c13575f, "extensionRegistryLite");
        l.f(interfaceC13036m, "kotlinTypeChecker");
        l.f(interfaceC12760a, "samConversionResolver");
        l.f(interfaceC13369e, "platformDependentTypeTransformer");
        this.f28893a = interfaceC12954n;
        this.f28894b = interfaceC13305c0;
        this.f28895c = interfaceC12890k;
        this.f28896d = interfaceC12881g;
        this.f28897e = interfaceC12813c;
        this.f28898f = interfaceC13332g0;
        this.f28899g = interfaceC12905t;
        this.f28900h = interfaceC12899p;
        this.f28901i = interfaceC12113c;
        this.f28902j = interfaceC12901q;
        this.f28903k = iterable;
        this.f28904l = c13313e0;
        this.f28905m = interfaceC12886i;
        this.f28906n = interfaceC13362a;
        this.f28907o = interfaceC13365c;
        this.f28908p = c13575f;
        this.f28909q = interfaceC13036m;
        this.f28910r = interfaceC13369e;
        this.f28911s = new C12882h(this);
    }

    /* renamed from: a */
    public final C12893l m6511a(InterfaceC13320f0 interfaceC13320f0, InterfaceC12593c interfaceC12593c, C12598g c12598g, C12604i c12604i, AbstractC12587a abstractC12587a, InterfaceC12845f interfaceC12845f) {
        List m3891e;
        l.f(interfaceC13320f0, "descriptor");
        l.f(interfaceC12593c, "nameResolver");
        l.f(c12598g, "typeTable");
        l.f(c12604i, "versionRequirementTable");
        l.f(abstractC12587a, "metadataVersion");
        m3891e = C13726r.m3891e();
        return new C12893l(this, interfaceC12593c, interfaceC13320f0, c12598g, c12604i, abstractC12587a, interfaceC12845f, null, m3891e);
    }

    /* renamed from: b */
    public final InterfaceC13312e m6510b(C12608b c12608b) {
        l.f(c12608b, "classId");
        return C12882h.m6518e(this.f28911s, c12608b, null, 2, null);
    }

    /* renamed from: c */
    public final InterfaceC13362a m6509c() {
        return this.f28906n;
    }

    /* renamed from: d */
    public final InterfaceC12813c<InterfaceC13340c, AbstractC12712g<?>> m6508d() {
        return this.f28897e;
    }

    /* renamed from: e */
    public final InterfaceC12881g m6507e() {
        return this.f28896d;
    }

    /* renamed from: f */
    public final C12882h m6506f() {
        return this.f28911s;
    }

    /* renamed from: g */
    public final InterfaceC12890k m6505g() {
        return this.f28895c;
    }

    /* renamed from: h */
    public final InterfaceC12886i m6504h() {
        return this.f28905m;
    }

    /* renamed from: i */
    public final InterfaceC12899p m6503i() {
        return this.f28900h;
    }

    /* renamed from: j */
    public final C13575f m6502j() {
        return this.f28908p;
    }

    /* renamed from: k */
    public final Iterable<InterfaceC13364b> m6501k() {
        return this.f28903k;
    }

    /* renamed from: l */
    public final InterfaceC12901q m6500l() {
        return this.f28902j;
    }

    /* renamed from: m */
    public final InterfaceC13036m m6499m() {
        return this.f28909q;
    }

    /* renamed from: n */
    public final InterfaceC12905t m6498n() {
        return this.f28899g;
    }

    /* renamed from: o */
    public final InterfaceC12113c m6497o() {
        return this.f28901i;
    }

    /* renamed from: p */
    public final InterfaceC13305c0 m6496p() {
        return this.f28894b;
    }

    /* renamed from: q */
    public final C13313e0 m6495q() {
        return this.f28904l;
    }

    /* renamed from: r */
    public final InterfaceC13332g0 m6494r() {
        return this.f28898f;
    }

    /* renamed from: s */
    public final InterfaceC13365c m6493s() {
        return this.f28907o;
    }

    /* renamed from: t */
    public final InterfaceC13369e m6492t() {
        return this.f28910r;
    }

    /* renamed from: u */
    public final InterfaceC12954n m6491u() {
        return this.f28893a;
    }

    public /* synthetic */ C12889j(InterfaceC12954n interfaceC12954n, InterfaceC13305c0 interfaceC13305c0, InterfaceC12890k interfaceC12890k, InterfaceC12881g interfaceC12881g, InterfaceC12813c interfaceC12813c, InterfaceC13332g0 interfaceC13332g0, InterfaceC12905t interfaceC12905t, InterfaceC12899p interfaceC12899p, InterfaceC12113c interfaceC12113c, InterfaceC12901q interfaceC12901q, Iterable iterable, C13313e0 c13313e0, InterfaceC12886i interfaceC12886i, InterfaceC13362a interfaceC13362a, InterfaceC13365c interfaceC13365c, C13575f c13575f, InterfaceC13036m interfaceC13036m, InterfaceC12760a interfaceC12760a, InterfaceC13369e interfaceC13369e, int i, g gVar) {
        this(interfaceC12954n, interfaceC13305c0, interfaceC12890k, interfaceC12881g, interfaceC12813c, interfaceC13332g0, interfaceC12905t, interfaceC12899p, interfaceC12113c, interfaceC12901q, iterable, c13313e0, interfaceC12886i, (i & 8192) != 0 ? InterfaceC13362a.C13363a.f29579a : interfaceC13362a, (i & 16384) != 0 ? InterfaceC13365c.C13366a.f29580a : interfaceC13365c, c13575f, (65536 & i) != 0 ? InterfaceC13036m.f29127b.m6075a() : interfaceC13036m, interfaceC12760a, (i & 262144) != 0 ? InterfaceC13369e.C13370a.f29583a : interfaceC13369e);
    }
}
