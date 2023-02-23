package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: com.google.android.gms.location.i */
/* loaded from: classes2.dex */
public final class C4122i implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        long j = 0;
        C4131r[] c4131rArr = null;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                i2 = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 2) {
                i3 = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 3) {
                j = SafeParcelReader.m31672r(parcel, m31675o);
            } else if (m31681i == 4) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i != 5) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c4131rArr = (C4131r[]) SafeParcelReader.m31684f(parcel, m31675o, C4131r.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new LocationAvailability(i, i2, i3, j, c4131rArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationAvailability[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
