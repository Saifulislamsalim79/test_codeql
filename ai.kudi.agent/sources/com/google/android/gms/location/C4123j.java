package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: com.google.android.gms.location.j */
/* loaded from: classes2.dex */
public final class C4123j implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 1:
                    i = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 2:
                    j = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 3:
                    j2 = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 4:
                    z = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 5:
                    j3 = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 6:
                    i2 = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 7:
                    f = SafeParcelReader.m31677m(parcel, m31675o);
                    break;
                case 8:
                    j4 = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
