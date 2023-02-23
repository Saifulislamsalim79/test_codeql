package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.c0 */
/* loaded from: classes2.dex */
public final class C5198c0 implements Parcelable.Creator<C5275w> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5275w createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 2) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 3) {
                str2 = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 4) {
                z = SafeParcelReader.m31680j(parcel, m31675o);
            } else if (m31681i != 5) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                z2 = SafeParcelReader.m31680j(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C5275w(str, str2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5275w[] newArray(int i) {
        return new C5275w[i];
    }
}
