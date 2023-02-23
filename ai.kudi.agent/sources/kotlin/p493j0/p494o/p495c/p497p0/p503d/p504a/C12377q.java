package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import java.util.Collection;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0.C12311i;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0.EnumC12310h;
/* compiled from: AnnotationQualifiersFqNames.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.q */
/* loaded from: classes3.dex */
public final class C12377q {

    /* renamed from: a */
    private final C12311i f27457a;

    /* renamed from: b */
    private final Collection<EnumC12119a> f27458b;

    /* renamed from: c */
    private final boolean f27459c;

    /* JADX WARN: Multi-variable type inference failed */
    public C12377q(C12311i c12311i, Collection<? extends EnumC12119a> collection, boolean z) {
        l.f(c12311i, "nullabilityQualifier");
        l.f(collection, "qualifierApplicabilityTypes");
        this.f27457a = c12311i;
        this.f27458b = collection;
        this.f27459c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ C12377q m9101b(C12377q c12377q, C12311i c12311i, Collection collection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            c12311i = c12377q.f27457a;
        }
        if ((i & 2) != 0) {
            collection = c12377q.f27458b;
        }
        if ((i & 4) != 0) {
            z = c12377q.f27459c;
        }
        return c12377q.m9102a(c12311i, collection, z);
    }

    /* renamed from: a */
    public final C12377q m9102a(C12311i c12311i, Collection<? extends EnumC12119a> collection, boolean z) {
        l.f(c12311i, "nullabilityQualifier");
        l.f(collection, "qualifierApplicabilityTypes");
        return new C12377q(c12311i, collection, z);
    }

    /* renamed from: c */
    public final boolean m9100c() {
        return this.f27459c;
    }

    /* renamed from: d */
    public final boolean m9099d() {
        return this.f27457a.m9230c() == EnumC12310h.NOT_NULL && this.f27459c;
    }

    /* renamed from: e */
    public final C12311i m9098e() {
        return this.f27457a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12377q) {
            C12377q c12377q = (C12377q) obj;
            return l.b(this.f27457a, c12377q.f27457a) && l.b(this.f27458b, c12377q.f27458b) && this.f27459c == c12377q.f27459c;
        }
        return false;
    }

    /* renamed from: f */
    public final Collection<EnumC12119a> m9097f() {
        return this.f27458b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f27457a.hashCode() * 31) + this.f27458b.hashCode()) * 31;
        boolean z = this.f27459c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f27457a + ", qualifierApplicabilityTypes=" + this.f27458b + ", affectsTypeParameterBasedTypes=" + this.f27459c + ')';
    }

    public /* synthetic */ C12377q(C12311i c12311i, Collection collection, boolean z, int i, g gVar) {
        this(c12311i, collection, (i & 4) != 0 ? c12311i.m9230c() == EnumC12310h.NOT_NULL : z);
    }
}
