package kotlin.p493j0.p494o.p495c.p497p0.p498b;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11799i;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11865d;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
/* compiled from: CompanionObjectMapping.kt */
/* renamed from: kotlin.j0.o.c.p0.b.c */
/* loaded from: classes3.dex */
public final class C12039c {

    /* renamed from: a */
    public static final C12039c f26758a = new C12039c();

    /* renamed from: b */
    private static final Set<C12608b> f26759b;

    /* compiled from: CompanionObjectMapping.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.c$a */
    /* loaded from: classes3.dex */
    /* synthetic */ class C12040a extends C11799i implements InterfaceC11767l<EnumC12052i, C12609c> {
        C12040a(C12059k c12059k) {
            super(1, c12059k);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "getPrimitiveFqName";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(C12059k.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "getPrimitiveFqName(Lorg/jetbrains/kotlin/builtins/PrimitiveType;)Lorg/jetbrains/kotlin/name/FqName;";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: l */
        public final C12609c invoke(EnumC12052i enumC12052i) {
            l.f(enumC12052i, "p0");
            return C12059k.m9836c(enumC12052i);
        }
    }

    static {
        int m3867o;
        List m3783o0;
        List m3783o02;
        List<C12609c> m3783o03;
        Set<EnumC12052i> set = EnumC12052i.f26781w;
        C12059k c12059k = C12059k.f26798a;
        C12040a c12040a = new C12040a(C12059k.f26798a);
        m3867o = C13728s.m3867o(set, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (Object obj : set) {
            arrayList.add(c12040a.invoke(obj));
        }
        C12609c m7361l = C12059k.C12060a.f26851g.m7361l();
        l.e(m7361l, "string.toSafe()");
        m3783o0 = C13742z.m3783o0(arrayList, m7361l);
        C12609c m7361l2 = C12059k.C12060a.f26855i.m7361l();
        l.e(m7361l2, "_boolean.toSafe()");
        m3783o02 = C13742z.m3783o0(m3783o0, m7361l2);
        C12609c m7361l3 = C12059k.C12060a.f26858k.m7361l();
        l.e(m7361l3, "_enum.toSafe()");
        m3783o03 = C13742z.m3783o0(m3783o02, m7361l3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C12609c c12609c : m3783o03) {
            linkedHashSet.add(C12608b.m7384m(c12609c));
        }
        f26759b = linkedHashSet;
    }

    private C12039c() {
    }

    /* renamed from: a */
    public final Set<C12608b> m9958a() {
        return f26759b;
    }

    /* renamed from: b */
    public final Set<C12608b> m9957b() {
        return f26759b;
    }
}
