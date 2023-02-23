package kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
/* compiled from: ClassLiteralValue.kt */
/* renamed from: kotlin.j0.o.c.p0.i.r.f */
/* loaded from: classes3.dex */
public final class C12711f {

    /* renamed from: a */
    private final C12608b f28570a;

    /* renamed from: b */
    private final int f28571b;

    public C12711f(C12608b c12608b, int i) {
        l.f(c12608b, "classId");
        this.f28570a = c12608b;
        this.f28571b = i;
    }

    /* renamed from: a */
    public final C12608b m6916a() {
        return this.f28570a;
    }

    /* renamed from: b */
    public final int m6915b() {
        return this.f28571b;
    }

    /* renamed from: c */
    public final int m6914c() {
        return this.f28571b;
    }

    /* renamed from: d */
    public final C12608b m6913d() {
        return this.f28570a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12711f) {
            C12711f c12711f = (C12711f) obj;
            return l.b(this.f28570a, c12711f.f28570a) && this.f28571b == c12711f.f28571b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f28570a.hashCode() * 31) + this.f28571b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int m6914c = m6914c();
        for (int i = 0; i < m6914c; i++) {
            sb.append("kotlin/Array<");
        }
        sb.append(m6913d());
        int m6914c2 = m6914c();
        for (int i2 = 0; i2 < m6914c2; i2++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
