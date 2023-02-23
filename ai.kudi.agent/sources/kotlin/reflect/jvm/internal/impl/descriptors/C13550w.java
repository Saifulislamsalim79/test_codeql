package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11799i;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11865d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p548k0.C13234l;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
/* compiled from: findClassInModule.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.w */
/* loaded from: classes3.dex */
public final class C13550w {

    /* compiled from: findClassInModule.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.w$a */
    /* loaded from: classes3.dex */
    /* synthetic */ class C13551a extends C11799i implements InterfaceC11767l<C12608b, C12608b> {

        /* renamed from: B */
        public static final C13551a f29905B = new C13551a();

        C13551a() {
            super(1);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "getOuterClassId";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(C12608b.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: l */
        public final C12608b invoke(C12608b c12608b) {
            kotlin.e0.d.l.f(c12608b, "p0");
            return c12608b.m7390g();
        }
    }

    /* compiled from: findClassInModule.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.w$b */
    /* loaded from: classes3.dex */
    static final class C13552b extends AbstractC11802m implements InterfaceC11767l<C12608b, Integer> {

        /* renamed from: c */
        public static final C13552b f29906c = new C13552b();

        C13552b() {
            super(1);
        }

        /* renamed from: a */
        public final int m4695a(C12608b c12608b) {
            kotlin.e0.d.l.f(c12608b, "it");
            return 0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Integer invoke(C12608b c12608b) {
            return Integer.valueOf(m4695a(c12608b));
        }
    }

    /* renamed from: a */
    public static final InterfaceC13312e m4703a(InterfaceC13305c0 interfaceC13305c0, C12608b c12608b) {
        kotlin.e0.d.l.f(interfaceC13305c0, "<this>");
        kotlin.e0.d.l.f(c12608b, "classId");
        InterfaceC13334h m4702b = m4702b(interfaceC13305c0, c12608b);
        if (m4702b instanceof InterfaceC13312e) {
            return (InterfaceC13312e) m4702b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h m4702b(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0 r10, kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b r11) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.C13550w.m4702b(kotlin.reflect.jvm.internal.impl.descriptors.c0, kotlin.j0.o.c.p0.f.b):kotlin.reflect.jvm.internal.impl.descriptors.h");
    }

    /* renamed from: c */
    public static final InterfaceC13312e m4701c(InterfaceC13305c0 interfaceC13305c0, C12608b c12608b, C13313e0 c13313e0) {
        InterfaceC13230h m5583f;
        InterfaceC13230h m5569r;
        List<Integer> m5563x;
        kotlin.e0.d.l.f(interfaceC13305c0, "<this>");
        kotlin.e0.d.l.f(c12608b, "classId");
        kotlin.e0.d.l.f(c13313e0, "notFoundClasses");
        InterfaceC13312e m4703a = m4703a(interfaceC13305c0, c12608b);
        if (m4703a != null) {
            return m4703a;
        }
        m5583f = C13234l.m5583f(c12608b, C13551a.f29905B);
        m5569r = C13242n.m5569r(m5583f, C13552b.f29906c);
        m5563x = C13242n.m5563x(m5569r);
        return c13313e0.m5340d(c12608b, m5563x);
    }

    /* renamed from: d */
    public static final InterfaceC13559y0 m4700d(InterfaceC13305c0 interfaceC13305c0, C12608b c12608b) {
        kotlin.e0.d.l.f(interfaceC13305c0, "<this>");
        kotlin.e0.d.l.f(c12608b, "classId");
        InterfaceC13334h m4702b = m4702b(interfaceC13305c0, c12608b);
        if (m4702b instanceof InterfaceC13559y0) {
            return (InterfaceC13559y0) m4702b;
        }
        return null;
    }
}
