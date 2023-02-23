package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.b0 */
/* loaded from: classes2.dex */
public final class C2851b0 implements Parcelable.Creator<C2863d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2863d createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i != 2) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                str = SafeParcelReader.m31686d(parcel, m31675o);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2863d(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2863d[] newArray(int i) {
        return new C2863d[i];
    }
}
