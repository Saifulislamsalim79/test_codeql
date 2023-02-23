package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.C5266p;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.af */
/* loaded from: classes2.dex */
public final class C3025af implements Parcelable.Creator<C3685ze> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3685ze createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C5266p c5266p = null;
        String str = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                c5266p = (C5266p) SafeParcelReader.m31687c(parcel, m31675o, C5266p.CREATOR);
            } else if (m31681i != 2) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3685ze(c5266p, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3685ze[] newArray(int i) {
        return new C3685ze[i];
    }
}
