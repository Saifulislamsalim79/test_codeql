package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.g0 */
/* loaded from: classes2.dex */
public final class C2837g0 implements Parcelable.Creator<C2835f0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2835f0 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                z = SafeParcelReader.m31680j(parcel, m31675o);
            } else if (m31681i == 2) {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            } else if (m31681i != 3) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2835f0(z, str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2835f0[] newArray(int i) {
        return new C2835f0[i];
    }
}
