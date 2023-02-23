package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: com.google.android.gms.location.u */
/* loaded from: classes2.dex */
public final class C4134u implements Parcelable.Creator<C4133t> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4133t createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                z = SafeParcelReader.m31680j(parcel, m31675o);
            } else if (m31681i == 2) {
                j = SafeParcelReader.m31672r(parcel, m31675o);
            } else if (m31681i == 3) {
                f = SafeParcelReader.m31677m(parcel, m31675o);
            } else if (m31681i == 4) {
                j2 = SafeParcelReader.m31672r(parcel, m31675o);
            } else if (m31681i != 5) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C4133t(z, j, f, j2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4133t[] newArray(int i) {
        return new C4133t[i];
    }
}
