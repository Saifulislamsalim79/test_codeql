package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.android.gms.common.internal.C2906q;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.o2 */
/* loaded from: classes2.dex */
public final class C9034o2 {

    /* renamed from: a */
    private final EnumC8981k9 f21338a;

    /* renamed from: b */
    private final Boolean f21339b;

    /* renamed from: c */
    private final C9185y8 f21340c = null;

    /* renamed from: d */
    private final C9129u8 f21341d;

    /* renamed from: e */
    private final Integer f21342e;

    /* renamed from: f */
    private final Integer f21343f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C9034o2(C9004m2 c9004m2, C9019n2 c9019n2) {
        this.f21338a = C9004m2.m15646h(c9004m2);
        this.f21339b = C9004m2.m15645i(c9004m2);
        this.f21341d = C9004m2.m15647g(c9004m2);
        this.f21342e = C9004m2.m15644j(c9004m2);
        this.f21343f = C9004m2.m15643k(c9004m2);
    }

    @w1(zza = 4)
    /* renamed from: a */
    public final C9129u8 m15613a() {
        return this.f21341d;
    }

    @w1(zza = 1)
    /* renamed from: b */
    public final EnumC8981k9 m15612b() {
        return this.f21338a;
    }

    @w1(zza = 2)
    /* renamed from: c */
    public final Boolean m15611c() {
        return this.f21339b;
    }

    @w1(zza = 5)
    /* renamed from: d */
    public final Integer m15610d() {
        return this.f21342e;
    }

    @w1(zza = 6)
    /* renamed from: e */
    public final Integer m15609e() {
        return this.f21343f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9034o2) {
            C9034o2 c9034o2 = (C9034o2) obj;
            if (C2906q.m31701a(this.f21338a, c9034o2.f21338a) && C2906q.m31701a(this.f21339b, c9034o2.f21339b)) {
                C9185y8 c9185y8 = c9034o2.f21340c;
                if (C2906q.m31701a(null, null) && C2906q.m31701a(this.f21341d, c9034o2.f21341d) && C2906q.m31701a(this.f21342e, c9034o2.f21342e) && C2906q.m31701a(this.f21343f, c9034o2.f21343f)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C2906q.m31700b(this.f21338a, this.f21339b, null, this.f21341d, this.f21342e, this.f21343f);
    }
}
