package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13664u;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12268b;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12283m;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12707b;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12717j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13736w;
import kotlin.p557z.C13741y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.EnumC13358m;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.EnumC13359n;
/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.b0.d */
/* loaded from: classes3.dex */
public final class C12128d {

    /* renamed from: a */
    public static final C12128d f27067a = new C12128d();

    /* renamed from: b */
    private static final Map<String, EnumSet<EnumC13359n>> f27068b;

    /* renamed from: c */
    private static final Map<String, EnumC13358m> f27069c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JavaAnnotationMapper.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.b0.d$a */
    /* loaded from: classes3.dex */
    public static final class C12129a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13305c0, AbstractC12965b0> {

        /* renamed from: c */
        public static final C12129a f27070c = new C12129a();

        C12129a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final AbstractC12965b0 invoke(InterfaceC13305c0 interfaceC13305c0) {
            l.f(interfaceC13305c0, "module");
            InterfaceC13307c1 m9666b = C12122a.m9666b(C12127c.f27062a.m9653d(), interfaceC13305c0.mo4979s().m9880o(C12059k.C12060a.f26867t));
            AbstractC12965b0 mo5121c = m9666b == null ? null : m9666b.mo5121c();
            if (mo5121c == null) {
                AbstractC13010i0 m5811j = C13118t.m5811j("Error: AnnotationTarget[]");
                l.e(m5811j, "createErrorType(\"Error: AnnotationTarget[]\")");
                return m5811j;
            }
            return mo5121c;
        }
    }

    static {
        Map<String, EnumSet<EnumC13359n>> m3878n;
        Map<String, EnumC13358m> m3878n2;
        m3878n = C13727r0.m3878n(C13664u.m4227a("PACKAGE", EnumSet.noneOf(EnumC13359n.class)), C13664u.m4227a("TYPE", EnumSet.of(EnumC13359n.CLASS, EnumC13359n.FILE)), C13664u.m4227a("ANNOTATION_TYPE", EnumSet.of(EnumC13359n.ANNOTATION_CLASS)), C13664u.m4227a("TYPE_PARAMETER", EnumSet.of(EnumC13359n.TYPE_PARAMETER)), C13664u.m4227a("FIELD", EnumSet.of(EnumC13359n.FIELD)), C13664u.m4227a("LOCAL_VARIABLE", EnumSet.of(EnumC13359n.LOCAL_VARIABLE)), C13664u.m4227a("PARAMETER", EnumSet.of(EnumC13359n.VALUE_PARAMETER)), C13664u.m4227a("CONSTRUCTOR", EnumSet.of(EnumC13359n.CONSTRUCTOR)), C13664u.m4227a("METHOD", EnumSet.of(EnumC13359n.FUNCTION, EnumC13359n.PROPERTY_GETTER, EnumC13359n.PROPERTY_SETTER)), C13664u.m4227a("TYPE_USE", EnumSet.of(EnumC13359n.TYPE)));
        f27068b = m3878n;
        m3878n2 = C13727r0.m3878n(C13664u.m4227a("RUNTIME", EnumC13358m.RUNTIME), C13664u.m4227a("CLASS", EnumC13358m.BINARY), C13664u.m4227a("SOURCE", EnumC13358m.SOURCE));
        f27069c = m3878n2;
    }

    private C12128d() {
    }

    /* renamed from: a */
    public final AbstractC12712g<?> m9650a(InterfaceC12268b interfaceC12268b) {
        InterfaceC12283m interfaceC12283m = interfaceC12268b instanceof InterfaceC12283m ? (InterfaceC12283m) interfaceC12268b : null;
        if (interfaceC12283m == null) {
            return null;
        }
        Map<String, EnumC13358m> map = f27069c;
        C12614f mo4823e = interfaceC12283m.mo4823e();
        EnumC13358m enumC13358m = map.get(mo4823e == null ? null : mo4823e.m7353b());
        if (enumC13358m == null) {
            return null;
        }
        C12608b m7384m = C12608b.m7384m(C12059k.C12060a.f26869v);
        l.e(m7384m, "topLevel(StandardNames.FqNames.annotationRetention)");
        C12614f m7349i = C12614f.m7349i(enumC13358m.name());
        l.e(m7349i, "identifier(retention.name)");
        return new C12717j(m7384m, m7349i);
    }

    /* renamed from: b */
    public final Set<EnumC13359n> m9649b(String str) {
        Set<EnumC13359n> m3831b;
        EnumSet<EnumC13359n> enumSet = f27068b.get(str);
        if (enumSet == null) {
            m3831b = C13741y0.m3831b();
            return m3831b;
        }
        return enumSet;
    }

    /* renamed from: c */
    public final AbstractC12712g<?> m9648c(List<? extends InterfaceC12268b> list) {
        int m3867o;
        l.f(list, "arguments");
        ArrayList<InterfaceC12283m> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC12283m) {
                arrayList.add(obj);
            }
        }
        ArrayList<EnumC13359n> arrayList2 = new ArrayList();
        for (InterfaceC12283m interfaceC12283m : arrayList) {
            C12128d c12128d = f27067a;
            C12614f mo4823e = interfaceC12283m.mo4823e();
            C13736w.m3850v(arrayList2, c12128d.m9649b(mo4823e == null ? null : mo4823e.m7353b()));
        }
        m3867o = C13728s.m3867o(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(m3867o);
        for (EnumC13359n enumC13359n : arrayList2) {
            C12608b m7384m = C12608b.m7384m(C12059k.C12060a.f26868u);
            l.e(m7384m, "topLevel(StandardNames.FqNames.annotationTarget)");
            C12614f m7349i = C12614f.m7349i(enumC13359n.name());
            l.e(m7349i, "identifier(kotlinTarget.name)");
            arrayList3.add(new C12717j(m7384m, m7349i));
        }
        return new C12707b(arrayList3, C12129a.f27070c);
    }
}
