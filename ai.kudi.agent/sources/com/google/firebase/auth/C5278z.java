package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.z */
/* loaded from: classes2.dex */
public final class C5278z implements Parcelable.Creator<C5271s> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5271s createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 2) {
                str2 = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 3) {
                j = SafeParcelReader.m31672r(parcel, m31675o);
            } else if (m31681i != 4) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                str3 = SafeParcelReader.m31686d(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C5271s(str, str2, j, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5271s[] newArray(int i) {
        return new C5271s[i];
    }
}
