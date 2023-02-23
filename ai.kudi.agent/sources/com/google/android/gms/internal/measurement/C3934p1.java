package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.p1 */
/* loaded from: classes2.dex */
public final class C3934p1 implements Parcelable.Creator<C3919o1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3919o1 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 1:
                    j = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 2:
                    j2 = SafeParcelReader.m31672r(parcel, m31675o);
                    break;
                case 3:
                    z = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 4:
                    str = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 5:
                    str2 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 6:
                    str3 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 7:
                    bundle = SafeParcelReader.m31689a(parcel, m31675o);
                    break;
                case 8:
                    str4 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C3919o1(j, j2, z, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3919o1[] newArray(int i) {
        return new C3919o1[i];
    }
}
