package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.C5206g0;
import com.google.firebase.auth.C5271s;
import java.util.ArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.f */
/* loaded from: classes2.dex */
public final class C5221f implements Parcelable.Creator<C5219e> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5219e createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        ArrayList arrayList = null;
        C5223g c5223g = null;
        String str = null;
        C5206g0 c5206g0 = null;
        C5240o0 c5240o0 = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                arrayList = SafeParcelReader.m31683g(parcel, m31675o, C5271s.CREATOR);
            } else if (m31681i == 2) {
                c5223g = (C5223g) SafeParcelReader.m31687c(parcel, m31675o, C5223g.CREATOR);
            } else if (m31681i == 3) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 4) {
                c5206g0 = (C5206g0) SafeParcelReader.m31687c(parcel, m31675o, C5206g0.CREATOR);
            } else if (m31681i != 5) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c5240o0 = (C5240o0) SafeParcelReader.m31687c(parcel, m31675o, C5240o0.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C5219e(arrayList, c5223g, str, c5206g0, c5240o0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5219e[] newArray(int i) {
        return new C5219e[i];
    }
}
