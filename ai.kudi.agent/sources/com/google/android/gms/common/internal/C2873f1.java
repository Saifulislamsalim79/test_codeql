package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.f1 */
/* loaded from: classes2.dex */
public final class C2873f1 implements Parcelable.Creator<C2923u> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2923u createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 2) {
                z = SafeParcelReader.m31680j(parcel, m31675o);
            } else if (m31681i == 3) {
                z2 = SafeParcelReader.m31680j(parcel, m31675o);
            } else if (m31681i == 4) {
                i2 = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i != 5) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                i3 = SafeParcelReader.m31673q(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2923u(i, z, z2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2923u[] newArray(int i) {
        return new C2923u[i];
    }
}
