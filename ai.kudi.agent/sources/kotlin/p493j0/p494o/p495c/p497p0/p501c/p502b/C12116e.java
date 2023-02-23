package kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b;

import java.io.Serializable;
import kotlin.e0.d.g;
/* compiled from: LookupLocation.kt */
/* renamed from: kotlin.j0.o.c.p0.c.b.e */
/* loaded from: classes3.dex */
public final class C12116e implements Serializable {

    /* renamed from: e */
    public static final C12117a f27027e = new C12117a(null);

    /* renamed from: f */
    private static final C12116e f27028f = new C12116e(-1, -1);

    /* renamed from: c */
    private final int f27029c;

    /* renamed from: d */
    private final int f27030d;

    /* compiled from: LookupLocation.kt */
    /* renamed from: kotlin.j0.o.c.p0.c.b.e$a */
    /* loaded from: classes3.dex */
    public static final class C12117a {
        private C12117a() {
        }

        public /* synthetic */ C12117a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final C12116e m9679a() {
            return C12116e.f27028f;
        }
    }

    public C12116e(int i, int i2) {
        this.f27029c = i;
        this.f27030d = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12116e) {
            C12116e c12116e = (C12116e) obj;
            return this.f27029c == c12116e.f27029c && this.f27030d == c12116e.f27030d;
        }
        return false;
    }

    public int hashCode() {
        return (this.f27029c * 31) + this.f27030d;
    }

    public String toString() {
        return "Position(line=" + this.f27029c + ", column=" + this.f27030d + ')';
    }
}
