package p201g.p259r;

import kotlin.e0.d.g;
/* compiled from: PagingConfig.kt */
/* renamed from: g.r.q0 */
/* loaded from: classes2.dex */
public final class C8003q0 {

    /* renamed from: a */
    public final int f19271a;

    /* renamed from: b */
    public final int f19272b;

    /* renamed from: c */
    public final boolean f19273c;

    /* renamed from: d */
    public final int f19274d;

    /* renamed from: e */
    public final int f19275e;

    /* renamed from: f */
    public final int f19276f;

    public C8003q0(int i, int i2, boolean z, int i3, int i4, int i5) {
        this.f19271a = i;
        this.f19272b = i2;
        this.f19273c = z;
        this.f19274d = i3;
        this.f19275e = i4;
        this.f19276f = i5;
        if (!z && i2 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        int i6 = this.f19275e;
        if (i6 != Integer.MAX_VALUE && i6 < this.f19271a + (this.f19272b * 2)) {
            throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.f19271a + ", prefetchDist=" + this.f19272b + ", maxSize=" + this.f19275e);
        }
        int i7 = this.f19276f;
        if (!(i7 == Integer.MIN_VALUE || i7 > 0)) {
            throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.".toString());
        }
    }

    public /* synthetic */ C8003q0(int i, int i2, boolean z, int i3, int i4, int i5, int i6, g gVar) {
        this(i, (i6 & 2) != 0 ? i : i2, (i6 & 4) != 0 ? true : z, (i6 & 8) != 0 ? i * 3 : i3, (i6 & 16) != 0 ? Integer.MAX_VALUE : i4, (i6 & 32) != 0 ? Integer.MIN_VALUE : i5);
    }
}
