package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.kn */
/* loaded from: classes2.dex */
public final class C3303kn implements Parcelable.Creator<C3276jn> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3276jn createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 2) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 3) {
                str2 = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 4) {
                j = SafeParcelReader.m31672r(parcel, m31675o);
            } else if (m31681i != 5) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                z = SafeParcelReader.m31680j(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3276jn(str, str2, j, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3276jn[] newArray(int i) {
        return new C3276jn[i];
    }
}
