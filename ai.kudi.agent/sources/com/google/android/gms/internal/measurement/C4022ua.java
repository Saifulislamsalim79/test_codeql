package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ua */
/* loaded from: classes2.dex */
final class C4022ua extends AbstractC4054wa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4022ua(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4054wa
    /* renamed from: a */
    public final double mo28689a(Object obj, long j) {
        return Double.longBitsToDouble(m28679k(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4054wa
    /* renamed from: b */
    public final float mo28688b(Object obj, long j) {
        return Float.intBitsToFloat(m28680j(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4054wa
    /* renamed from: c */
    public final void mo28687c(Object obj, long j, boolean z) {
        if (C4070xa.f9849i) {
            C4070xa.m28644d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            C4070xa.m28643e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4054wa
    /* renamed from: d */
    public final void mo28686d(Object obj, long j, byte b) {
        if (C4070xa.f9849i) {
            C4070xa.m28644d(obj, j, b);
        } else {
            C4070xa.m28643e(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4054wa
    /* renamed from: e */
    public final void mo28685e(Object obj, long j, double d) {
        m28675o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4054wa
    /* renamed from: f */
    public final void mo28684f(Object obj, long j, float f) {
        m28676n(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4054wa
    /* renamed from: g */
    public final boolean mo28683g(Object obj, long j) {
        if (C4070xa.f9849i) {
            return C4070xa.m28623y(obj, j);
        }
        return C4070xa.m28622z(obj, j);
    }
}
