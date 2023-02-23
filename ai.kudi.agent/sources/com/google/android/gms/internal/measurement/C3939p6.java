package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.p6 */
/* loaded from: classes2.dex */
final class C3939p6<T> extends AbstractC3970r6<T> {

    /* renamed from: c */
    static final C3939p6<Object> f9613c = new C3939p6<>();

    private C3939p6() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3970r6
    /* renamed from: a */
    public final T mo28913a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3970r6
    /* renamed from: b */
    public final boolean mo28912b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
