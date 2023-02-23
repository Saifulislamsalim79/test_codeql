package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.i0 */
/* loaded from: classes2.dex */
public final class C5210i0 implements Parcelable.Creator<C5199d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5199d createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 2) {
                str2 = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 3) {
                str3 = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 4) {
                str4 = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i != 5) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                z = SafeParcelReader.m31680j(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C5199d(str, str2, str3, str4, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5199d[] newArray(int i) {
        return new C5199d[i];
    }
}
