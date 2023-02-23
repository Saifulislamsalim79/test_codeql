package kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z;

import java.util.List;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12575v;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12580w;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
/* compiled from: VersionRequirement.kt */
/* renamed from: kotlin.j0.o.c.p0.e.z.i */
/* loaded from: classes3.dex */
public final class C12604i {

    /* renamed from: b */
    public static final C12605a f28362b = new C12605a(null);

    /* renamed from: c */
    private static final C12604i f28363c;

    /* renamed from: a */
    private final List<C12575v> f28364a;

    /* compiled from: VersionRequirement.kt */
    /* renamed from: kotlin.j0.o.c.p0.e.z.i$a */
    /* loaded from: classes3.dex */
    public static final class C12605a {
        private C12605a() {
        }

        public /* synthetic */ C12605a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final C12604i m7403a(C12580w c12580w) {
            l.f(c12580w, "table");
            if (c12580w.m7472w() == 0) {
                return m7402b();
            }
            List<C12575v> m7471x = c12580w.m7471x();
            l.e(m7471x, "table.requirementList");
            return new C12604i(m7471x, null);
        }

        /* renamed from: b */
        public final C12604i m7402b() {
            return C12604i.f28363c;
        }
    }

    static {
        List m3891e;
        m3891e = C13726r.m3891e();
        f28363c = new C12604i(m3891e);
    }

    private C12604i(List<C12575v> list) {
        this.f28364a = list;
    }

    public /* synthetic */ C12604i(List list, g gVar) {
        this(list);
    }

    /* renamed from: b */
    public final C12575v m7404b(int i) {
        return (C12575v) C13722p.m3951U(this.f28364a, i);
    }
}
