package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2906q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class LocationAvailability extends AbstractC2916a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C4122i();
    @Deprecated

    /* renamed from: c */
    private int f9883c;
    @Deprecated

    /* renamed from: d */
    private int f9884d;

    /* renamed from: e */
    private long f9885e;

    /* renamed from: f */
    private int f9886f;

    /* renamed from: w */
    private C4131r[] f9887w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationAvailability(int i, int i2, int i3, long j, C4131r[] c4131rArr) {
        this.f9886f = i;
        this.f9883c = i2;
        this.f9884d = i3;
        this.f9885e = j;
        this.f9887w = c4131rArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f9883c == locationAvailability.f9883c && this.f9884d == locationAvailability.f9884d && this.f9885e == locationAvailability.f9885e && this.f9886f == locationAvailability.f9886f && Arrays.equals(this.f9887w, locationAvailability.f9887w)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m28513f() {
        return this.f9886f < 1000;
    }

    public final int hashCode() {
        return C2906q.m31700b(Integer.valueOf(this.f9886f), Integer.valueOf(this.f9883c), Integer.valueOf(this.f9884d), Long.valueOf(this.f9885e), this.f9887w);
    }

    public final String toString() {
        boolean m28513f = m28513f();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(m28513f);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f9883c);
        C2917b.m31656j(parcel, 2, this.f9884d);
        C2917b.m31654l(parcel, 3, this.f9885e);
        C2917b.m31656j(parcel, 4, this.f9886f);
        C2917b.m31649q(parcel, 5, this.f9887w, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
