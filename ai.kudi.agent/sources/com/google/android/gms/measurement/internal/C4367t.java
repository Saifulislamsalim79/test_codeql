package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.t */
/* loaded from: classes2.dex */
public final class C4367t implements Parcelable.Creator<C4355s> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C4355s createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            if (SafeParcelReader.m31681i(m31675o) != 2) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                bundle = SafeParcelReader.m31689a(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C4355s(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4355s[] newArray(int i) {
        return new C4355s[i];
    }
}
