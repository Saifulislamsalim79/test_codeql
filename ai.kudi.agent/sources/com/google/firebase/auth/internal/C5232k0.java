package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.C5206g0;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.k0 */
/* loaded from: classes2.dex */
public final class C5232k0 implements Parcelable.Creator<C5230j0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5230j0 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        C5240o0 c5240o0 = null;
        C5226h0 c5226h0 = null;
        C5206g0 c5206g0 = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                c5240o0 = (C5240o0) SafeParcelReader.m31687c(parcel, m31675o, C5240o0.CREATOR);
            } else if (m31681i == 2) {
                c5226h0 = (C5226h0) SafeParcelReader.m31687c(parcel, m31675o, C5226h0.CREATOR);
            } else if (m31681i != 3) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c5206g0 = (C5206g0) SafeParcelReader.m31687c(parcel, m31675o, C5206g0.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C5230j0(c5240o0, c5226h0, c5206g0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5230j0[] newArray(int i) {
        return new C5230j0[i];
    }
}
