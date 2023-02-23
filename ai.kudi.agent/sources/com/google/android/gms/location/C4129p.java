package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: com.google.android.gms.location.p */
/* loaded from: classes2.dex */
public final class C4129p implements Parcelable.Creator<C4117e> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4117e createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        Status status = null;
        C4119f c4119f = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                status = (Status) SafeParcelReader.m31687c(parcel, m31675o, Status.CREATOR);
            } else if (m31681i != 2) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c4119f = (C4119f) SafeParcelReader.m31687c(parcel, m31675o, C4119f.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C4117e(status, c4119f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4117e[] newArray(int i) {
        return new C4117e[i];
    }
}
