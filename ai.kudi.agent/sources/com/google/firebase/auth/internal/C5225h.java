package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.C5271s;
import java.util.ArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.h */
/* loaded from: classes2.dex */
public final class C5225h implements Parcelable.Creator<C5223g> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5223g createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 2) {
                str2 = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i != 3) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                arrayList = SafeParcelReader.m31683g(parcel, m31675o, C5271s.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C5223g(str, str2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5223g[] newArray(int i) {
        return new C5223g[i];
    }
}
