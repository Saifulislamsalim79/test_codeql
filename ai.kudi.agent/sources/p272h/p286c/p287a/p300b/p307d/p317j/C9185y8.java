package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.android.gms.common.internal.C2906q;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.y8 */
/* loaded from: classes2.dex */
public final class C9185y8 {

    /* renamed from: a */
    private final EnumC9157w8 f21555a;

    /* renamed from: b */
    private final Integer f21556b;

    /* renamed from: c */
    private final Integer f21557c;

    /* renamed from: d */
    private final Boolean f21558d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C9185y8(C9143v8 c9143v8, C9171x8 c9171x8) {
        EnumC9157w8 enumC9157w8;
        Integer num;
        enumC9157w8 = c9143v8.f21512a;
        this.f21555a = enumC9157w8;
        num = c9143v8.f21513b;
        this.f21556b = num;
        this.f21557c = null;
        this.f21558d = null;
    }

    @w1(zza = 1)
    /* renamed from: a */
    public final EnumC9157w8 m15493a() {
        return this.f21555a;
    }

    @w1(zza = 2)
    /* renamed from: b */
    public final Integer m15492b() {
        return this.f21556b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9185y8) {
            C9185y8 c9185y8 = (C9185y8) obj;
            if (C2906q.m31701a(this.f21555a, c9185y8.f21555a) && C2906q.m31701a(this.f21556b, c9185y8.f21556b)) {
                Integer num = c9185y8.f21557c;
                if (C2906q.m31701a(null, null)) {
                    Boolean bool = c9185y8.f21558d;
                    if (C2906q.m31701a(null, null)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C2906q.m31700b(this.f21555a, this.f21556b, null, null);
    }
}
