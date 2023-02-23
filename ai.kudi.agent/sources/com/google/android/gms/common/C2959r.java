package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.r */
/* loaded from: classes2.dex */
public final class C2959r implements Parcelable.Creator<C2830d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2830d createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i == 2) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i != 3) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                j = SafeParcelReader.m31672r(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2830d(str, i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2830d[] newArray(int i) {
        return new C2830d[i];
    }
}
