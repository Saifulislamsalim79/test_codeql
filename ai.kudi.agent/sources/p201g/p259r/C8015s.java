package p201g.p259r;

import kotlin.e0.d.l;
/* compiled from: PageFetcherSnapshot.kt */
/* renamed from: g.r.s */
/* loaded from: classes2.dex */
public final class C8015s {

    /* renamed from: a */
    private final int f19315a;

    /* renamed from: b */
    private final AbstractC7982n1 f19316b;

    public C8015s(int i, AbstractC7982n1 abstractC7982n1) {
        l.f(abstractC7982n1, "hint");
        this.f19315a = i;
        this.f19316b = abstractC7982n1;
    }

    /* renamed from: a */
    public final int m16892a() {
        return this.f19315a;
    }

    /* renamed from: b */
    public final AbstractC7982n1 m16891b() {
        return this.f19316b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8015s) {
            C8015s c8015s = (C8015s) obj;
            return this.f19315a == c8015s.f19315a && l.b(this.f19316b, c8015s.f19316b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f19315a * 31) + this.f19316b.hashCode();
    }

    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.f19315a + ", hint=" + this.f19316b + ')';
    }
}
