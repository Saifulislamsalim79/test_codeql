package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: com.google.android.gms.location.n */
/* loaded from: classes2.dex */
public final class C4127n implements Parcelable.Creator<C4126m> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4126m createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = "";
        String str2 = "";
        String str3 = str2;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                str2 = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 2) {
                str3 = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i != 5) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C4126m(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4126m[] newArray(int i) {
        return new C4126m[i];
    }
}
