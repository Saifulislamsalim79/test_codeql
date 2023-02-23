package kotlin.p493j0.p494o.p495c.p497p0.p522h;

import kotlin.e0.d.g;
/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.j0.o.c.p0.h.a */
/* loaded from: classes3.dex */
public enum EnumC12619a {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);
    

    /* renamed from: c */
    private final boolean f28398c;

    /* renamed from: d */
    private final boolean f28399d;

    EnumC12619a(boolean z, boolean z2) {
        this.f28398c = z;
        this.f28399d = z2;
    }

    /* renamed from: b */
    public final boolean m7339b() {
        return this.f28398c;
    }

    /* renamed from: e */
    public final boolean m7338e() {
        return this.f28399d;
    }

    /* synthetic */ EnumC12619a(boolean z, boolean z2, int i, g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
