package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.t6 */
/* loaded from: classes2.dex */
final class C4002t6<T> extends AbstractC3970r6<T> {

    /* renamed from: c */
    private final T f9709c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4002t6(T t) {
        this.f9709c = t;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3970r6
    /* renamed from: a */
    public final T mo28913a() {
        return this.f9709c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3970r6
    /* renamed from: b */
    public final boolean mo28912b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4002t6) {
            return this.f9709c.equals(((C4002t6) obj).f9709c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9709c.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f9709c.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 13);
        sb.append("Optional.of(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
