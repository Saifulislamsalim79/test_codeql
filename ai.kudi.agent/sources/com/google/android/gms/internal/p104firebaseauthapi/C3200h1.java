package com.google.android.gms.internal.p104firebaseauthapi;

import sun.misc.Unsafe;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h1 */
/* loaded from: classes2.dex */
final class C3200h1 extends AbstractC3227i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3200h1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3227i1
    /* renamed from: a */
    public final double mo31000a(Object obj, long j) {
        return Double.longBitsToDouble(m30990k(obj, j));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3227i1
    /* renamed from: b */
    public final float mo30999b(Object obj, long j) {
        return Float.intBitsToFloat(m30991j(obj, j));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3227i1
    /* renamed from: c */
    public final void mo30998c(Object obj, long j, boolean z) {
        if (C3254j1.f8623i) {
            C3254j1.m30930d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            C3254j1.m30929e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3227i1
    /* renamed from: d */
    public final void mo30997d(Object obj, long j, byte b) {
        if (C3254j1.f8623i) {
            C3254j1.m30930d(obj, j, b);
        } else {
            C3254j1.m30929e(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3227i1
    /* renamed from: e */
    public final void mo30996e(Object obj, long j, double d) {
        m30986o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3227i1
    /* renamed from: f */
    public final void mo30995f(Object obj, long j, float f) {
        m30987n(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3227i1
    /* renamed from: g */
    public final boolean mo30994g(Object obj, long j) {
        if (C3254j1.f8623i) {
            return C3254j1.m30909y(obj, j);
        }
        return C3254j1.m30908z(obj, j);
    }
}
