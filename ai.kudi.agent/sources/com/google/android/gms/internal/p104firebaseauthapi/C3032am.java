package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.am */
/* loaded from: classes2.dex */
public final class C3032am implements Parcelable.Creator<C3692zl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3692zl createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            if (SafeParcelReader.m31681i(m31675o) != 2) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                arrayList = SafeParcelReader.m31683g(parcel, m31675o, C3640xl.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3692zl(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3692zl[] newArray(int i) {
        return new C3692zl[i];
    }
}
