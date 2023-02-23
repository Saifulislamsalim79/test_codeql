package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.v0 */
/* loaded from: classes2.dex */
public final class C2927v0 implements Parcelable.Creator<C2924u0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2924u0 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        IBinder iBinder = null;
        C2826b c2826b = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 2) {
                iBinder = SafeParcelReader.m31674p(parcel, m31675o);
            } else if (m31681i == 3) {
                c2826b = (C2826b) SafeParcelReader.m31687c(parcel, m31675o, C2826b.CREATOR);
            } else if (m31681i == 4) {
                z = SafeParcelReader.m31680j(parcel, m31675o);
            } else if (m31681i != 5) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                z2 = SafeParcelReader.m31680j(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2924u0(i, iBinder, c2826b, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2924u0[] newArray(int i) {
        return new C2924u0[i];
    }
}
