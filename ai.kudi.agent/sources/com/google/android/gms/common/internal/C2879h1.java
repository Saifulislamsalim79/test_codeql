package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.h1 */
/* loaded from: classes2.dex */
public final class C2879h1 implements Parcelable.Creator<C2876g1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2876g1 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        int i = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            if (SafeParcelReader.m31681i(m31675o) != 1) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2876g1(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2876g1[] newArray(int i) {
        return new C2876g1[i];
    }
}
