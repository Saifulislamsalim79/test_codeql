package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.C5275w;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mf */
/* loaded from: classes2.dex */
public final class C3348mf implements Parcelable.Creator<C3322lf> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3322lf createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C5275w c5275w = null;
        String str = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                c5275w = (C5275w) SafeParcelReader.m31687c(parcel, m31675o, C5275w.CREATOR);
            } else if (m31681i != 2) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3322lf(c5275w, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3322lf[] newArray(int i) {
        return new C3322lf[i];
    }
}
