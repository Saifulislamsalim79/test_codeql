package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.se */
/* loaded from: classes2.dex */
public final class C3503se implements Parcelable.Creator<C3477re> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3477re createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C3168fn c3168fn = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            if (SafeParcelReader.m31681i(m31675o) != 1) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c3168fn = (C3168fn) SafeParcelReader.m31687c(parcel, m31675o, C3168fn.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3477re(c3168fn);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3477re[] newArray(int i) {
        return new C3477re[i];
    }
}
