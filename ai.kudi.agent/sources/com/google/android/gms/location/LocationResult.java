package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class LocationResult extends AbstractC2916a implements ReflectedParcelable {

    /* renamed from: c */
    private final List<Location> f9897c;

    /* renamed from: d */
    static final List<Location> f9896d = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new C4124k();

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationResult(List<Location> list) {
        this.f9897c = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            LocationResult locationResult = (LocationResult) obj;
            if (locationResult.f9897c.size() != this.f9897c.size()) {
                return false;
            }
            Iterator<Location> it = locationResult.f9897c.iterator();
            Iterator<Location> it2 = this.f9897c.iterator();
            while (it.hasNext()) {
                if (it2.next().getTime() != it.next().getTime()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final List<Location> m28506f() {
        return this.f9897c;
    }

    public final int hashCode() {
        int i = 17;
        for (Location location : this.f9897c) {
            long time = location.getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9897c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31648r(parcel, 1, m28506f(), false);
        C2917b.m31664b(parcel, m31665a);
    }
}
