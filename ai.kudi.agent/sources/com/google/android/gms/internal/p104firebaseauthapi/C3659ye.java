package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.C5199d;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ye */
/* loaded from: classes2.dex */
public final class C3659ye implements Parcelable.Creator<C3633xe> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3633xe createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C5199d c5199d = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            if (SafeParcelReader.m31681i(m31675o) != 1) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c5199d = (C5199d) SafeParcelReader.m31687c(parcel, m31675o, C5199d.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3633xe(c5199d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3633xe[] newArray(int i) {
        return new C3633xe[i];
    }
}
