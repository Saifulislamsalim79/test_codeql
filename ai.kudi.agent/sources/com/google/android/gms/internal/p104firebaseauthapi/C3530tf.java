package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.C5206g0;
import java.util.ArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.tf */
/* loaded from: classes2.dex */
public final class C3530tf implements Parcelable.Creator<C3504sf> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3504sf createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        ArrayList arrayList = null;
        C5206g0 c5206g0 = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 2) {
                arrayList = SafeParcelReader.m31683g(parcel, m31675o, C3248im.CREATOR);
            } else if (m31681i != 3) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c5206g0 = (C5206g0) SafeParcelReader.m31687c(parcel, m31675o, C5206g0.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3504sf(str, arrayList, c5206g0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3504sf[] newArray(int i) {
        return new C3504sf[i];
    }
}
