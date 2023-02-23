package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0;

import kotlin.e0.d.l;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: typeEnhancement.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.g0.c */
/* loaded from: classes3.dex */
public final class C12302c<T> {

    /* renamed from: a */
    private final T f27342a;

    /* renamed from: b */
    private final InterfaceC13346g f27343b;

    public C12302c(T t, InterfaceC13346g interfaceC13346g) {
        this.f27342a = t;
        this.f27343b = interfaceC13346g;
    }

    /* renamed from: a */
    public final T m9256a() {
        return this.f27342a;
    }

    /* renamed from: b */
    public final InterfaceC13346g m9255b() {
        return this.f27343b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12302c) {
            C12302c c12302c = (C12302c) obj;
            return l.b(this.f27342a, c12302c.f27342a) && l.b(this.f27343b, c12302c.f27343b);
        }
        return false;
    }

    public int hashCode() {
        T t = this.f27342a;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        InterfaceC13346g interfaceC13346g = this.f27343b;
        return hashCode + (interfaceC13346g != null ? interfaceC13346g.hashCode() : 0);
    }

    public String toString() {
        return "EnhancementResult(result=" + this.f27342a + ", enhancementAnnotations=" + this.f27343b + ')';
    }
}
