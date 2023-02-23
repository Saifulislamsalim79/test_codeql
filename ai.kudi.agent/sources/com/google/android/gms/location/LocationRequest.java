package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C2906q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractC2916a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C4123j();

    /* renamed from: c */
    private int f9888c;

    /* renamed from: d */
    private long f9889d;

    /* renamed from: e */
    private long f9890e;

    /* renamed from: f */
    private boolean f9891f;

    /* renamed from: w */
    private long f9892w;

    /* renamed from: x */
    private int f9893x;

    /* renamed from: y */
    private float f9894y;

    /* renamed from: z */
    private long f9895z;

    public LocationRequest() {
        this.f9888c = 102;
        this.f9889d = 3600000L;
        this.f9890e = 600000L;
        this.f9891f = false;
        this.f9892w = Long.MAX_VALUE;
        this.f9893x = Integer.MAX_VALUE;
        this.f9894y = 0.0f;
        this.f9895z = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f9888c = i;
        this.f9889d = j;
        this.f9890e = j2;
        this.f9891f = z;
        this.f9892w = j3;
        this.f9893x = i2;
        this.f9894y = f;
        this.f9895z = j4;
    }

    /* renamed from: f */
    public static LocationRequest m28512f() {
        return new LocationRequest();
    }

    /* renamed from: u */
    private static void m28507u(long j) {
        if (j >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("invalid interval: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            return this.f9888c == locationRequest.f9888c && this.f9889d == locationRequest.f9889d && this.f9890e == locationRequest.f9890e && this.f9891f == locationRequest.f9891f && this.f9892w == locationRequest.f9892w && this.f9893x == locationRequest.f9893x && this.f9894y == locationRequest.f9894y && m28511h() == locationRequest.m28511h();
        }
        return false;
    }

    /* renamed from: h */
    public final long m28511h() {
        long j = this.f9895z;
        long j2 = this.f9889d;
        return j < j2 ? j2 : j;
    }

    public final int hashCode() {
        return C2906q.m31700b(Integer.valueOf(this.f9888c), Long.valueOf(this.f9889d), Float.valueOf(this.f9894y), Long.valueOf(this.f9895z));
    }

    /* renamed from: k */
    public final LocationRequest m28510k(long j) {
        m28507u(j);
        this.f9891f = true;
        this.f9890e = j;
        return this;
    }

    /* renamed from: l */
    public final LocationRequest m28509l(long j) {
        m28507u(j);
        this.f9889d = j;
        if (!this.f9891f) {
            double d = j;
            Double.isNaN(d);
            this.f9890e = (long) (d / 6.0d);
        }
        return this;
    }

    /* renamed from: s */
    public final LocationRequest m28508s(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            this.f9888c = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.f9888c;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f9888c != 105) {
            sb.append(" requested=");
            sb.append(this.f9889d);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f9890e);
        sb.append("ms");
        if (this.f9895z > this.f9889d) {
            sb.append(" maxWait=");
            sb.append(this.f9895z);
            sb.append("ms");
        }
        if (this.f9894y > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f9894y);
            sb.append("m");
        }
        long j = this.f9892w;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f9893x != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f9893x);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f9888c);
        C2917b.m31654l(parcel, 2, this.f9889d);
        C2917b.m31654l(parcel, 3, this.f9890e);
        C2917b.m31663c(parcel, 4, this.f9891f);
        C2917b.m31654l(parcel, 5, this.f9892w);
        C2917b.m31656j(parcel, 6, this.f9893x);
        C2917b.m31659g(parcel, 7, this.f9894y);
        C2917b.m31654l(parcel, 8, this.f9895z);
        C2917b.m31664b(parcel, m31665a);
    }
}
