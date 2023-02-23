package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.x6 */
/* loaded from: classes2.dex */
final class C4066x6<T> implements Serializable, InterfaceC4018u6 {

    /* renamed from: c */
    final T f9837c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4066x6(T t) {
        this.f9837c = t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4066x6) {
            T t = this.f9837c;
            T t2 = ((C4066x6) obj).f9837c;
            return t == t2 || t.equals(t2);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9837c});
    }

    public final String toString() {
        String obj = this.f9837c.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4018u6
    public final T zza() {
        return this.f9837c;
    }
}
