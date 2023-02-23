package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.y7 */
/* loaded from: classes2.dex */
final class C4083y7 {

    /* renamed from: a */
    private final Object f9859a;

    /* renamed from: b */
    private final int f9860b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4083y7(Object obj, int i) {
        this.f9859a = obj;
        this.f9860b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4083y7) {
            C4083y7 c4083y7 = (C4083y7) obj;
            return this.f9859a == c4083y7.f9859a && this.f9860b == c4083y7.f9860b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f9859a) * 65535) + this.f9860b;
    }
}
