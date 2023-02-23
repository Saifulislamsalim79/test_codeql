package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.c0 */
/* loaded from: classes2.dex */
public final class C2860c0 implements Parcelable.Creator<C2929w> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2929w createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i != 2) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                arrayList = SafeParcelReader.m31683g(parcel, m31675o, C2903p.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2929w(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2929w[] newArray(int i) {
        return new C2929w[i];
    }
}
