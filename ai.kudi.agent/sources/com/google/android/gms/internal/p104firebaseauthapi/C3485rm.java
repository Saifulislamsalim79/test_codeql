package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rm */
/* loaded from: classes2.dex */
public final class C3485rm implements Parcelable.Creator<C3459qm> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3459qm createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        C3248im c3248im = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 2) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 3) {
                str2 = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 4) {
                str3 = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i != 5) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c3248im = (C3248im) SafeParcelReader.m31687c(parcel, m31675o, C3248im.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3459qm(str, str2, str3, c3248im);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3459qm[] newArray(int i) {
        return new C3459qm[i];
    }
}
