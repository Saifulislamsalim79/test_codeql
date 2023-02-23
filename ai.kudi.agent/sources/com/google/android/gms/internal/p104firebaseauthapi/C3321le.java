package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.le */
/* loaded from: classes2.dex */
public final class C3321le implements Parcelable.Creator<C3294ke> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3294ke createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C3511sm c3511sm = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            if (SafeParcelReader.m31681i(m31675o) != 1) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c3511sm = (C3511sm) SafeParcelReader.m31687c(parcel, m31675o, C3511sm.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3294ke(c3511sm);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3294ke[] newArray(int i) {
        return new C3294ke[i];
    }
}
