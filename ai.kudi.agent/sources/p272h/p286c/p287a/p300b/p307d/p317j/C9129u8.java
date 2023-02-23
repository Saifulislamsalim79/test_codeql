package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.android.gms.common.internal.C2906q;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.u8 */
/* loaded from: classes2.dex */
public final class C9129u8 {

    /* renamed from: a */
    private final EnumC9084r8 f21502a;

    /* renamed from: b */
    private final EnumC9055p8 f21503b;

    /* renamed from: c */
    private final EnumC9099s8 f21504c;

    /* renamed from: d */
    private final EnumC9070q8 f21505d;

    /* renamed from: e */
    private final Boolean f21506e;

    /* renamed from: f */
    private final Float f21507f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C9129u8(C9040o8 c9040o8, C9114t8 c9114t8) {
        EnumC9084r8 enumC9084r8;
        EnumC9055p8 enumC9055p8;
        EnumC9099s8 enumC9099s8;
        EnumC9070q8 enumC9070q8;
        Boolean bool;
        Float f;
        enumC9084r8 = c9040o8.f21414a;
        this.f21502a = enumC9084r8;
        enumC9055p8 = c9040o8.f21415b;
        this.f21503b = enumC9055p8;
        enumC9099s8 = c9040o8.f21416c;
        this.f21504c = enumC9099s8;
        enumC9070q8 = c9040o8.f21417d;
        this.f21505d = enumC9070q8;
        bool = c9040o8.f21418e;
        this.f21506e = bool;
        f = c9040o8.f21419f;
        this.f21507f = f;
    }

    @w1(zza = 2)
    /* renamed from: a */
    public final EnumC9055p8 m15534a() {
        return this.f21503b;
    }

    @w1(zza = 4)
    /* renamed from: b */
    public final EnumC9070q8 m15533b() {
        return this.f21505d;
    }

    @w1(zza = 1)
    /* renamed from: c */
    public final EnumC9084r8 m15532c() {
        return this.f21502a;
    }

    @w1(zza = 3)
    /* renamed from: d */
    public final EnumC9099s8 m15531d() {
        return this.f21504c;
    }

    @w1(zza = 5)
    /* renamed from: e */
    public final Boolean m15530e() {
        return this.f21506e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9129u8) {
            C9129u8 c9129u8 = (C9129u8) obj;
            return C2906q.m31701a(this.f21502a, c9129u8.f21502a) && C2906q.m31701a(this.f21503b, c9129u8.f21503b) && C2906q.m31701a(this.f21504c, c9129u8.f21504c) && C2906q.m31701a(this.f21505d, c9129u8.f21505d) && C2906q.m31701a(this.f21506e, c9129u8.f21506e) && C2906q.m31701a(this.f21507f, c9129u8.f21507f);
        }
        return false;
    }

    @w1(zza = 6)
    /* renamed from: f */
    public final Float m15529f() {
        return this.f21507f;
    }

    public final int hashCode() {
        return C2906q.m31700b(this.f21502a, this.f21503b, this.f21504c, this.f21505d, this.f21506e, this.f21507f);
    }
}
