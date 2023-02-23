package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2906q;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* renamed from: com.google.android.gms.location.r */
/* loaded from: classes2.dex */
public final class C4131r extends AbstractC2916a {
    public static final Parcelable.Creator<C4131r> CREATOR = new C4132s();

    /* renamed from: c */
    private final int f9920c;

    /* renamed from: d */
    private final int f9921d;

    /* renamed from: e */
    private final long f9922e;

    /* renamed from: f */
    private final long f9923f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4131r(int i, int i2, long j, long j2) {
        this.f9920c = i;
        this.f9921d = i2;
        this.f9922e = j;
        this.f9923f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4131r.class == obj.getClass()) {
            C4131r c4131r = (C4131r) obj;
            if (this.f9920c == c4131r.f9920c && this.f9921d == c4131r.f9921d && this.f9922e == c4131r.f9922e && this.f9923f == c4131r.f9923f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2906q.m31700b(Integer.valueOf(this.f9921d), Integer.valueOf(this.f9920c), Long.valueOf(this.f9923f), Long.valueOf(this.f9922e));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f9920c + " Cell status: " + this.f9921d + " elapsed time NS: " + this.f9923f + " system time ms: " + this.f9922e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f9920c);
        C2917b.m31656j(parcel, 2, this.f9921d);
        C2917b.m31654l(parcel, 3, this.f9922e);
        C2917b.m31654l(parcel, 4, this.f9923f);
        C2917b.m31664b(parcel, m31665a);
    }
}
