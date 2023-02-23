package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
/* compiled from: IncompatibleVersionErrorData.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.r */
/* loaded from: classes3.dex */
public final class C12903r<T> {

    /* renamed from: a */
    private final T f28933a;

    /* renamed from: b */
    private final T f28934b;

    /* renamed from: c */
    private final String f28935c;

    /* renamed from: d */
    private final C12608b f28936d;

    public C12903r(T t, T t2, String str, C12608b c12608b) {
        l.f(str, "filePath");
        l.f(c12608b, "classId");
        this.f28933a = t;
        this.f28934b = t2;
        this.f28935c = str;
        this.f28936d = c12608b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12903r) {
            C12903r c12903r = (C12903r) obj;
            return l.b(this.f28933a, c12903r.f28933a) && l.b(this.f28934b, c12903r.f28934b) && l.b(this.f28935c, c12903r.f28935c) && l.b(this.f28936d, c12903r.f28936d);
        }
        return false;
    }

    public int hashCode() {
        T t = this.f28933a;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f28934b;
        return ((((hashCode + (t2 != null ? t2.hashCode() : 0)) * 31) + this.f28935c.hashCode()) * 31) + this.f28936d.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f28933a + ", expectedVersion=" + this.f28934b + ", filePath=" + this.f28935c + ", classId=" + this.f28936d + ')';
    }
}
