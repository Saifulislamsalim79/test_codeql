package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: com.google.android.gms.location.q */
/* loaded from: classes2.dex */
public final class C4130q implements Parcelable.Creator<C4119f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4119f createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 1:
                    z = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 2:
                    z2 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 3:
                    z3 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 4:
                    z4 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 5:
                    z5 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 6:
                    z6 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C4119f(z, z2, z3, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4119f[] newArray(int i) {
        return new C4119f[i];
    }
}
