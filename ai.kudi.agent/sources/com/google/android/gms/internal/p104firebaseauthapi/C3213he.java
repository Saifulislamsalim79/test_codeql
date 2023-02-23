package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.C5192a;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.he */
/* loaded from: classes2.dex */
public final class C3213he implements Parcelable.Creator<C3186ge> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3186ge createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        C5192a c5192a = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i != 2) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c5192a = (C5192a) SafeParcelReader.m31687c(parcel, m31675o, C5192a.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3186ge(str, c5192a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3186ge[] newArray(int i) {
        return new C3186ge[i];
    }
}
