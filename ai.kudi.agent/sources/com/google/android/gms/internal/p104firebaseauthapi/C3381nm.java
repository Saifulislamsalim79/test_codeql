package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.nm */
/* loaded from: classes2.dex */
public final class C3381nm implements Parcelable.Creator<C3355mm> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3355mm createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            if (SafeParcelReader.m31681i(m31675o) != 2) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                arrayList = SafeParcelReader.m31683g(parcel, m31675o, C3302km.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3355mm(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3355mm[] newArray(int i) {
        return new C3355mm[i];
    }
}
