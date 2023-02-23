package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import java.util.Set;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p557z.C13739x0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
/* compiled from: ClassDeserializer.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.h */
/* loaded from: classes3.dex */
public final class C12882h {

    /* renamed from: c */
    public static final C12884b f28883c = new C12884b(null);

    /* renamed from: d */
    private static final Set<C12608b> f28884d;

    /* renamed from: a */
    private final C12889j f28885a;

    /* renamed from: b */
    private final InterfaceC11767l<C12883a, InterfaceC13312e> f28886b;

    /* compiled from: ClassDeserializer.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.h$a */
    /* loaded from: classes3.dex */
    public static final class C12883a {

        /* renamed from: a */
        private final C12608b f28887a;

        /* renamed from: b */
        private final C12880f f28888b;

        public C12883a(C12608b c12608b, C12880f c12880f) {
            l.f(c12608b, "classId");
            this.f28887a = c12608b;
            this.f28888b = c12880f;
        }

        /* renamed from: a */
        public final C12880f m6517a() {
            return this.f28888b;
        }

        /* renamed from: b */
        public final C12608b m6516b() {
            return this.f28887a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C12883a) && l.b(this.f28887a, ((C12883a) obj).f28887a);
        }

        public int hashCode() {
            return this.f28887a.hashCode();
        }
    }

    /* compiled from: ClassDeserializer.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.h$b */
    /* loaded from: classes3.dex */
    public static final class C12884b {
        private C12884b() {
        }

        public /* synthetic */ C12884b(g gVar) {
            this();
        }

        /* renamed from: a */
        public final Set<C12608b> m6515a() {
            return C12882h.f28884d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassDeserializer.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.h$c */
    /* loaded from: classes3.dex */
    public static final class C12885c extends AbstractC11802m implements InterfaceC11767l<C12883a, InterfaceC13312e> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12885c() {
            super(1);
            C12882h.this = r1;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC13312e invoke(C12883a c12883a) {
            l.f(c12883a, "key");
            return C12882h.this.m6520c(c12883a);
        }
    }

    static {
        Set<C12608b> m3832a;
        m3832a = C13739x0.m3832a(C12608b.m7384m(C12059k.C12060a.f26845d.m7361l()));
        f28884d = m3832a;
    }

    public C12882h(C12889j c12889j) {
        l.f(c12889j, "components");
        this.f28885a = c12889j;
        this.f28886b = c12889j.m6491u().mo6362i(new C12885c());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b9 A[EDGE_INSN: B:104:0x00b9->B:96:0x00b9 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e m6520c(kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12882h.C12883a r13) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12882h.m6520c(kotlin.j0.o.c.p0.j.b.h$a):kotlin.reflect.jvm.internal.impl.descriptors.e");
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC13312e m6518e(C12882h c12882h, C12608b c12608b, C12880f c12880f, int i, Object obj) {
        if ((i & 2) != 0) {
            c12880f = null;
        }
        return c12882h.m6519d(c12608b, c12880f);
    }

    /* renamed from: d */
    public final InterfaceC13312e m6519d(C12608b c12608b, C12880f c12880f) {
        l.f(c12608b, "classId");
        return this.f28886b.invoke(new C12883a(c12608b, c12880f));
    }
}
