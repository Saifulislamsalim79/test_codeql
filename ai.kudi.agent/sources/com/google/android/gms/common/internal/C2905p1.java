package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.p1 */
/* loaded from: classes2.dex */
public final class C2905p1 implements Parcelable.Creator<C2902o1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2902o1 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        Bundle bundle = null;
        C2830d[] c2830dArr = null;
        C2871f c2871f = null;
        int i = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                bundle = SafeParcelReader.m31689a(parcel, m31675o);
            } else if (m31681i == 2) {
                c2830dArr = (C2830d[]) SafeParcelReader.m31684f(parcel, m31675o, C2830d.CREATOR);
            } else if (m31681i == 3) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i != 4) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                c2871f = (C2871f) SafeParcelReader.m31687c(parcel, m31675o, C2871f.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2902o1(bundle, c2830dArr, i, c2871f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2902o1[] newArray(int i) {
        return new C2902o1[i];
    }
}
