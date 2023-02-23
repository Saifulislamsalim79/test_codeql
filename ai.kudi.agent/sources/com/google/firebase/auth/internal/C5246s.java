package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.C5271s;
import java.util.ArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.s */
/* loaded from: classes2.dex */
public final class C5246s implements Parcelable.Creator<C5245r> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5245r createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            if (SafeParcelReader.m31681i(m31675o) != 1) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                arrayList = SafeParcelReader.m31683g(parcel, m31675o, C5271s.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C5245r(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C5245r[] newArray(int i) {
        return new C5245r[i];
    }
}
