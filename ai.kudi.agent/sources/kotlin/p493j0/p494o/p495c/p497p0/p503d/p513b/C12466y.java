package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: TypeMappingMode.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.y */
/* loaded from: classes3.dex */
public final class C12466y {

    /* renamed from: k */
    public static final C12466y f27638k = new C12466y(false, false, false, false, false, null, false, null, null, false, 1023, null);

    /* renamed from: l */
    public static final C12466y f27639l = new C12466y(false, false, false, false, false, null, false, null, null, true, 511, null);

    /* renamed from: m */
    public static final C12466y f27640m = new C12466y(false, false, false, false, false, f27638k, false, null, null, false, 988, null);

    /* renamed from: a */
    private final boolean f27641a;

    /* renamed from: b */
    private final boolean f27642b;

    /* renamed from: c */
    private final boolean f27643c;

    /* renamed from: d */
    private final boolean f27644d;

    /* renamed from: e */
    private final boolean f27645e;

    /* renamed from: f */
    private final C12466y f27646f;

    /* renamed from: g */
    private final boolean f27647g;

    /* renamed from: h */
    private final C12466y f27648h;

    /* renamed from: i */
    private final C12466y f27649i;

    /* renamed from: j */
    private final boolean f27650j;

    /* compiled from: TypeMappingMode.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.y$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12467a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27651a;

        static {
            int[] iArr = new int[EnumC13008h1.values().length];
            iArr[EnumC13008h1.IN_VARIANCE.ordinal()] = 1;
            iArr[EnumC13008h1.INVARIANT.ordinal()] = 2;
            f27651a = iArr;
        }
    }

    public C12466y(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C12466y c12466y, boolean z6, C12466y c12466y2, C12466y c12466y3, boolean z7) {
        this.f27641a = z;
        this.f27642b = z2;
        this.f27643c = z3;
        this.f27644d = z4;
        this.f27645e = z5;
        this.f27646f = c12466y;
        this.f27647g = z6;
        this.f27648h = c12466y2;
        this.f27649i = c12466y3;
        this.f27650j = z7;
    }

    /* renamed from: a */
    public final boolean m8829a() {
        return this.f27647g;
    }

    /* renamed from: b */
    public final boolean m8828b() {
        return this.f27650j;
    }

    /* renamed from: c */
    public final boolean m8827c() {
        return this.f27642b;
    }

    /* renamed from: d */
    public final boolean m8826d() {
        return this.f27641a;
    }

    /* renamed from: e */
    public final boolean m8825e() {
        return this.f27643c;
    }

    /* renamed from: f */
    public final C12466y m8824f(EnumC13008h1 enumC13008h1, boolean z) {
        l.f(enumC13008h1, "effectiveVariance");
        if (!z || !this.f27643c) {
            int i = C12467a.f27651a[enumC13008h1.ordinal()];
            if (i == 1) {
                C12466y c12466y = this.f27648h;
                if (c12466y != null) {
                    return c12466y;
                }
            } else if (i != 2) {
                C12466y c12466y2 = this.f27646f;
                if (c12466y2 != null) {
                    return c12466y2;
                }
            } else {
                C12466y c12466y3 = this.f27649i;
                if (c12466y3 != null) {
                    return c12466y3;
                }
            }
        }
        return this;
    }

    /* renamed from: g */
    public final C12466y m8823g() {
        return new C12466y(this.f27641a, true, this.f27643c, this.f27644d, this.f27645e, this.f27646f, this.f27647g, this.f27648h, this.f27649i, false, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C12466y(boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12466y r17, boolean r18, kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12466y r19, kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12466y r20, boolean r21, int r22, kotlin.e0.d.g r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = r12
        La:
            r3 = r0 & 2
            if (r3 == 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = r13
        L11:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L18
            r4 = 0
            goto L19
        L18:
            r4 = r14
        L19:
            r6 = r0 & 8
            if (r6 == 0) goto L1f
            r6 = 0
            goto L20
        L1f:
            r6 = r15
        L20:
            r7 = r0 & 16
            if (r7 == 0) goto L26
            r7 = 0
            goto L28
        L26:
            r7 = r16
        L28:
            r8 = r0 & 32
            if (r8 == 0) goto L2e
            r8 = 0
            goto L30
        L2e:
            r8 = r17
        L30:
            r9 = r0 & 64
            if (r9 == 0) goto L35
            goto L37
        L35:
            r2 = r18
        L37:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L3d
            r9 = r8
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L45
            r10 = r8
            goto L47
        L45:
            r10 = r20
        L47:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r5 = r21
        L4e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r2
            r20 = r9
            r21 = r10
            r22 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12466y.<init>(boolean, boolean, boolean, boolean, boolean, kotlin.j0.o.c.p0.d.b.y, boolean, kotlin.j0.o.c.p0.d.b.y, kotlin.j0.o.c.p0.d.b.y, boolean, int, kotlin.e0.d.g):void");
    }
}
