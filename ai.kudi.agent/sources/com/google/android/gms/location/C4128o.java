package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.location.o */
/* loaded from: classes2.dex */
public final class C4128o implements Parcelable.Creator<C4112c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4112c createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        C4126m c4126m = null;
        boolean z2 = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                arrayList = SafeParcelReader.m31683g(parcel, m31675o, LocationRequest.CREATOR);
            } else if (m31681i == 2) {
                z = SafeParcelReader.m31680j(parcel, m31675o);
            } else if (m31681i == 3) {
                z2 = SafeParcelReader.m31680j(parcel, m31675o);
            } else if (m31681i != 5) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c4126m = (C4126m) SafeParcelReader.m31687c(parcel, m31675o, C4126m.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C4112c(arrayList, z, z2, c4126m);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4112c[] newArray(int i) {
        return new C4112c[i];
    }
}
