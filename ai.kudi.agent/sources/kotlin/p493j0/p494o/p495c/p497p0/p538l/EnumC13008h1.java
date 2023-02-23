package kotlin.p493j0.p494o.p495c.p497p0.p538l;
/* compiled from: Variance.kt */
/* renamed from: kotlin.j0.o.c.p0.l.h1 */
/* loaded from: classes3.dex */
public enum EnumC13008h1 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    

    /* renamed from: c */
    private final String f29088c;

    /* renamed from: d */
    private final boolean f29089d;

    EnumC13008h1(String str, boolean z, boolean z2, int i) {
        this.f29088c = str;
        this.f29089d = z2;
    }

    /* renamed from: b */
    public final boolean m6206b() {
        return this.f29089d;
    }

    /* renamed from: e */
    public final String m6205e() {
        return this.f29088c;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f29088c;
    }
}
