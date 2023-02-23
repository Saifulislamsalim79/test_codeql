package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.internal.C2906q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.g0 */
/* loaded from: classes2.dex */
public final class C2770g0 {

    /* renamed from: a */
    private final C2754b<?> f7774a;

    /* renamed from: b */
    private final C2830d f7775b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2770g0(C2754b c2754b, C2830d c2830d, C2767f0 c2767f0) {
        this.f7774a = c2754b;
        this.f7775b = c2830d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C2830d m32012a(C2770g0 c2770g0) {
        return c2770g0.f7775b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ C2754b m32011b(C2770g0 c2770g0) {
        return c2770g0.f7774a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2770g0)) {
            C2770g0 c2770g0 = (C2770g0) obj;
            if (C2906q.m31701a(this.f7774a, c2770g0.f7774a) && C2906q.m31701a(this.f7775b, c2770g0.f7775b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2906q.m31700b(this.f7774a, this.f7775b);
    }

    public final String toString() {
        C2906q.C2907a m31699c = C2906q.m31699c(this);
        m31699c.m31698a("key", this.f7774a);
        m31699c.m31698a("feature", this.f7775b);
        return m31699c.toString();
    }
}
