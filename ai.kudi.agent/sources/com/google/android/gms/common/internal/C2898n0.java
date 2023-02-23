package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.n0 */
/* loaded from: classes2.dex */
public final class C2898n0 implements Parcelable.Creator<C2903p> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2903p createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 1:
                    i = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 2:
                    i2 = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 3:
                    i3 = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 4:
                    j = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 5:
                    j2 = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 6:
                    str = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 7:
                    str2 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 8:
                    i4 = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 9:
                    i5 = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2903p(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2903p[] newArray(int i) {
        return new C2903p[i];
    }
}
