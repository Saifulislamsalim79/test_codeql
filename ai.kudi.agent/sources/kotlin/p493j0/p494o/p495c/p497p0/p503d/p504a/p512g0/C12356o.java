package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12377q;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: signatureEnhancement.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.g0.o */
/* loaded from: classes3.dex */
final class C12356o {

    /* renamed from: a */
    private final AbstractC12965b0 f27434a;

    /* renamed from: b */
    private final C12377q f27435b;

    /* renamed from: c */
    private final InterfaceC13562z0 f27436c;

    /* renamed from: d */
    private final boolean f27437d;

    public C12356o(AbstractC12965b0 abstractC12965b0, C12377q c12377q, InterfaceC13562z0 interfaceC13562z0, boolean z) {
        l.f(abstractC12965b0, "type");
        this.f27434a = abstractC12965b0;
        this.f27435b = c12377q;
        this.f27436c = interfaceC13562z0;
        this.f27437d = z;
    }

    /* renamed from: a */
    public final AbstractC12965b0 m9143a() {
        return this.f27434a;
    }

    /* renamed from: b */
    public final C12377q m9142b() {
        return this.f27435b;
    }

    /* renamed from: c */
    public final InterfaceC13562z0 m9141c() {
        return this.f27436c;
    }

    /* renamed from: d */
    public final boolean m9140d() {
        return this.f27437d;
    }

    /* renamed from: e */
    public final AbstractC12965b0 m9139e() {
        return this.f27434a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12356o) {
            C12356o c12356o = (C12356o) obj;
            return l.b(this.f27434a, c12356o.f27434a) && l.b(this.f27435b, c12356o.f27435b) && l.b(this.f27436c, c12356o.f27436c) && this.f27437d == c12356o.f27437d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f27434a.hashCode() * 31;
        C12377q c12377q = this.f27435b;
        int hashCode2 = (hashCode + (c12377q == null ? 0 : c12377q.hashCode())) * 31;
        InterfaceC13562z0 interfaceC13562z0 = this.f27436c;
        int hashCode3 = (hashCode2 + (interfaceC13562z0 != null ? interfaceC13562z0.hashCode() : 0)) * 31;
        boolean z = this.f27437d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "TypeAndDefaultQualifiers(type=" + this.f27434a + ", defaultQualifiers=" + this.f27435b + ", typeParameterForArgument=" + this.f27436c + ", isFromStarProjection=" + this.f27437d + ')';
    }
}
