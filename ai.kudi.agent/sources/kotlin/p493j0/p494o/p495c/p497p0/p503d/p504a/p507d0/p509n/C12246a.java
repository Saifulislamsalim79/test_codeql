package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p509n;

import java.util.Set;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.EnumC12143k;
import kotlin.p557z.C13739x0;
import kotlin.p557z.C13745z0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: JavaTypeResolver.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.d0.n.a */
/* loaded from: classes3.dex */
public final class C12246a {

    /* renamed from: a */
    private final EnumC12143k f27302a;

    /* renamed from: b */
    private final EnumC12247b f27303b;

    /* renamed from: c */
    private final boolean f27304c;

    /* renamed from: d */
    private final Set<InterfaceC13562z0> f27305d;

    /* JADX WARN: Multi-variable type inference failed */
    public C12246a(EnumC12143k enumC12143k, EnumC12247b enumC12247b, boolean z, Set<? extends InterfaceC13562z0> set) {
        l.f(enumC12143k, "howThisTypeIsUsed");
        l.f(enumC12247b, "flexibility");
        this.f27302a = enumC12143k;
        this.f27303b = enumC12247b;
        this.f27304c = z;
        this.f27305d = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ C12246a m9330b(C12246a c12246a, EnumC12143k enumC12143k, EnumC12247b enumC12247b, boolean z, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC12143k = c12246a.f27302a;
        }
        if ((i & 2) != 0) {
            enumC12247b = c12246a.f27303b;
        }
        if ((i & 4) != 0) {
            z = c12246a.f27304c;
        }
        if ((i & 8) != 0) {
            set = c12246a.f27305d;
        }
        return c12246a.m9331a(enumC12143k, enumC12247b, z, set);
    }

    /* renamed from: a */
    public final C12246a m9331a(EnumC12143k enumC12143k, EnumC12247b enumC12247b, boolean z, Set<? extends InterfaceC13562z0> set) {
        l.f(enumC12143k, "howThisTypeIsUsed");
        l.f(enumC12247b, "flexibility");
        return new C12246a(enumC12143k, enumC12247b, z, set);
    }

    /* renamed from: c */
    public final EnumC12247b m9329c() {
        return this.f27303b;
    }

    /* renamed from: d */
    public final EnumC12143k m9328d() {
        return this.f27302a;
    }

    /* renamed from: e */
    public final Set<InterfaceC13562z0> m9327e() {
        return this.f27305d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12246a) {
            C12246a c12246a = (C12246a) obj;
            return this.f27302a == c12246a.f27302a && this.f27303b == c12246a.f27303b && this.f27304c == c12246a.f27304c && l.b(this.f27305d, c12246a.f27305d);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m9326f() {
        return this.f27304c;
    }

    /* renamed from: g */
    public final C12246a m9325g(EnumC12247b enumC12247b) {
        l.f(enumC12247b, "flexibility");
        return m9330b(this, null, enumC12247b, false, null, 13, null);
    }

    /* renamed from: h */
    public final C12246a m9324h(InterfaceC13562z0 interfaceC13562z0) {
        l.f(interfaceC13562z0, "typeParameter");
        Set<InterfaceC13562z0> set = this.f27305d;
        return m9330b(this, null, null, false, set != null ? C13745z0.m3768i(set, interfaceC13562z0) : C13739x0.m3832a(interfaceC13562z0), 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f27302a.hashCode() * 31) + this.f27303b.hashCode()) * 31;
        boolean z = this.f27304c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Set<InterfaceC13562z0> set = this.f27305d;
        return i2 + (set == null ? 0 : set.hashCode());
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f27302a + ", flexibility=" + this.f27303b + ", isForAnnotationParameter=" + this.f27304c + ", visitedTypeParameters=" + this.f27305d + ')';
    }

    public /* synthetic */ C12246a(EnumC12143k enumC12143k, EnumC12247b enumC12247b, boolean z, Set set, int i, g gVar) {
        this(enumC12143k, (i & 2) != 0 ? EnumC12247b.INFLEXIBLE : enumC12247b, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : set);
    }
}
