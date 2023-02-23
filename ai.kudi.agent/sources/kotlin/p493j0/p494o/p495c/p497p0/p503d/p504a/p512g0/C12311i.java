package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
/* compiled from: NullabilityQualifierWithMigrationStatus.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.g0.i */
/* loaded from: classes3.dex */
public final class C12311i {

    /* renamed from: a */
    private final EnumC12310h f27363a;

    /* renamed from: b */
    private final boolean f27364b;

    public C12311i(EnumC12310h enumC12310h, boolean z) {
        l.f(enumC12310h, "qualifier");
        this.f27363a = enumC12310h;
        this.f27364b = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C12311i m9231b(C12311i c12311i, EnumC12310h enumC12310h, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC12310h = c12311i.f27363a;
        }
        if ((i & 2) != 0) {
            z = c12311i.f27364b;
        }
        return c12311i.m9232a(enumC12310h, z);
    }

    /* renamed from: a */
    public final C12311i m9232a(EnumC12310h enumC12310h, boolean z) {
        l.f(enumC12310h, "qualifier");
        return new C12311i(enumC12310h, z);
    }

    /* renamed from: c */
    public final EnumC12310h m9230c() {
        return this.f27363a;
    }

    /* renamed from: d */
    public final boolean m9229d() {
        return this.f27364b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12311i) {
            C12311i c12311i = (C12311i) obj;
            return this.f27363a == c12311i.f27363a && this.f27364b == c12311i.f27364b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f27363a.hashCode() * 31;
        boolean z = this.f27364b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f27363a + ", isForWarningOnly=" + this.f27364b + ')';
    }

    public /* synthetic */ C12311i(EnumC12310h enumC12310h, boolean z, int i, g gVar) {
        this(enumC12310h, (i & 2) != 0 ? false : z);
    }
}
