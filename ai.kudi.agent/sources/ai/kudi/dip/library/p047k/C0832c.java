package ai.kudi.dip.library.p047k;
/* compiled from: RatingData.kt */
/* renamed from: ai.kudi.dip.library.k.c */
/* loaded from: classes2.dex */
public final class C0832c {

    /* renamed from: a */
    private final int f2336a;

    /* renamed from: b */
    private boolean f2337b;

    public C0832c(int i) {
        this.f2336a = i;
    }

    /* renamed from: a */
    public final int m37909a() {
        return this.f2336a;
    }

    /* renamed from: b */
    public final boolean m37908b() {
        return this.f2337b;
    }

    /* renamed from: c */
    public final void m37907c(boolean z) {
        this.f2337b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0832c) && this.f2336a == ((C0832c) obj).f2336a;
    }

    public int hashCode() {
        return this.f2336a;
    }

    public String toString() {
        return "RatingData(rating=" + this.f2336a + ')';
    }
}
