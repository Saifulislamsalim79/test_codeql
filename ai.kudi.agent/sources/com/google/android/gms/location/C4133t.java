package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C2906q;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* renamed from: com.google.android.gms.location.t */
/* loaded from: classes2.dex */
public final class C4133t extends AbstractC2916a {
    public static final Parcelable.Creator<C4133t> CREATOR = new C4134u();

    /* renamed from: c */
    private boolean f9924c;

    /* renamed from: d */
    private long f9925d;

    /* renamed from: e */
    private float f9926e;

    /* renamed from: f */
    private long f9927f;

    /* renamed from: w */
    private int f9928w;

    public C4133t() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4133t(boolean z, long j, float f, long j2, int i) {
        this.f9924c = z;
        this.f9925d = j;
        this.f9926e = f;
        this.f9927f = j2;
        this.f9928w = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4133t) {
            C4133t c4133t = (C4133t) obj;
            return this.f9924c == c4133t.f9924c && this.f9925d == c4133t.f9925d && Float.compare(this.f9926e, c4133t.f9926e) == 0 && this.f9927f == c4133t.f9927f && this.f9928w == c4133t.f9928w;
        }
        return false;
    }

    public final int hashCode() {
        return C2906q.m31700b(Boolean.valueOf(this.f9924c), Long.valueOf(this.f9925d), Float.valueOf(this.f9926e), Long.valueOf(this.f9927f), Integer.valueOf(this.f9928w));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f9924c);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f9925d);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f9926e);
        long j = this.f9927f;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f9928w != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f9928w);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31663c(parcel, 1, this.f9924c);
        C2917b.m31654l(parcel, 2, this.f9925d);
        C2917b.m31659g(parcel, 3, this.f9926e);
        C2917b.m31654l(parcel, 4, this.f9927f);
        C2917b.m31656j(parcel, 5, this.f9928w);
        C2917b.m31664b(parcel, m31665a);
    }
}
